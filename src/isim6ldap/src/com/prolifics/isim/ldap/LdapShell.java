package com.prolifics.isim.ldap;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Security;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.apache.commons.cli.ParseException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.cote.accountmanager.util.BinaryUtil;
import org.cote.accountmanager.util.SecurityUtil;
import org.w3c.dom.Document;

import com.prolifics.isim.ldap.objects.AccessRight;
import com.prolifics.isim.ldap.objects.AccessRight.Principals;
import com.prolifics.isim.ldap.objects.Argument;
import com.prolifics.isim.ldap.objects.Command;
import com.prolifics.isim.ldap.objects.SystemRoleType;

public class LdapShell {
	
	public static final Logger logger = Logger.getLogger(LdapShell.class.getName());
	
	public static void main(String[] args){
		
		
		PropertyConfigurator.configure(SystemUtil.getLogProps());
		logger.info("Prolifics: isim6ldap utility");
		Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
		processArguments(args);

	}
	private static void processArguments(String args[]){ 
		Options options = getCLIOptions();
		CommandLineParser parser = new PosixParser();
		try {
			CommandLine cmd = parser.parse( options, args);
			Properties props = SystemUtil.getProps("./isim6ldap.properties");
			
			String envKey = null;
			if(cmd.hasOption("argFile")){
				String[] lines = (new String(StreamUtil.fileToBytes(cmd.getOptionValue("argFile")),"UTF-8")).split("\\n");
				logger.info("Processing " + lines.length + " Arguments");
				for(int i = 0; i < lines.length;i++){
					//logger.info(lines[i]);
					List<String> argBld = new ArrayList<String>();
					String line = lines[i].trim();
					if(line.length() == 0) continue;
					Command command = importCommand(line);
					if(command == null){
						logger.error("Failed to parse command: '" + lines[i] + "'");
						continue;
					}
					for(int a = 0; a < command.getArguments().size(); a++){
						Argument arg = command.getArguments().get(a);
						argBld.add("-" + arg.getName());
						if(arg.getValue() != null){
							if(arg.getValue().indexOf(" ") > -1) argBld.add("\"" + arg.getValue() + "\"");
							else argBld.add(arg.getValue());
						}
					}
					String[] argsSub = argBld.toArray(new String[0]);
					processArguments(argsSub);
				}
				return;
			}
			if(cmd.hasOption("config") && cmd.hasOption("env")){
				
				envKey = cmd.getOptionValue("env");
				logger.info("Saving encrypted properties");
				props.setProperty(envKey + ".server", cmd.getOptionValue("server"));
				props.setProperty(envKey + ".username", cmd.getOptionValue("username"));
				SystemUtil.setEncryptedProperty(props, envKey + ".password", cmd.getOptionValue("password"));
				if(cmd.hasOption("isimDN")) props.setProperty(envKey + ".isimDN", cmd.getOptionValue("isimDN"));
				else props.setProperty(envKey + ".isimDN", "erglobalid=00000000000000000000,ou=ibm,o=ibm,c=us");
				if(cmd.hasOption("baseDN")) props.setProperty(envKey + ".baseDN", cmd.getOptionValue("baseDN"));
				else props.setProperty(envKey + ".baseDN", cmd.getOptionValue("o=ibm,c=us"));
				if(cmd.hasOption("objectFilter")) props.setProperty(envKey + ".objectFilter", cmd.getOptionValue("objectFilter"));
				else props.setProperty(envKey + ".objectFilter", "(objectclass=*)");
				SystemUtil.saveProps(props, "./isim6ldap.properties");
				
			}
			else{
				
				Properties sourceEnv = null;
				String sourceName = null;
				String sourceBaseDN = null;
				String sourceIsimDN = null;
				String sourceObjectFilter = null;
				Properties targetEnv = null;
				String targetName = null;
				String targetBaseDN = null;
				String targetIsimDN = null;
				String targetObjectFilter = null;
				
				if(cmd.hasOption("sourceEnv") && props.getProperty(cmd.getOptionValue("sourceEnv") + ".server") != null){
	
					envKey = cmd.getOptionValue("sourceEnv");
					sourceName = envKey;
					sourceBaseDN = props.getProperty(envKey + ".baseDN");
					sourceIsimDN = props.getProperty(envKey + ".isimDN");
					sourceObjectFilter = props.getProperty(envKey + ".objectFilter");
					
					String server = props.getProperty(envKey + ".server");
					String username = props.getProperty(envKey + ".username");
					String password = SystemUtil.getEncryptedProperty(props, envKey + ".password");
	
					sourceEnv = new Properties();  
				    sourceEnv.put(DirContext.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");    
				    sourceEnv.put(DirContext.PROVIDER_URL,"ldap://" + server);
				    sourceEnv.put(DirContext.SECURITY_PRINCIPAL,username);
				    sourceEnv.put(DirContext.SECURITY_CREDENTIALS,password);
	
				}
				if(cmd.hasOption("targetEnv") && props.getProperty(cmd.getOptionValue("targetEnv") + ".server") != null){
	
					envKey = cmd.getOptionValue("targetEnv");
					targetName = envKey;
					targetBaseDN = props.getProperty(envKey + ".baseDN");
					targetIsimDN = props.getProperty(envKey + ".isimDN");
					targetObjectFilter = props.getProperty(envKey + ".objectFilter");
					
					String server = props.getProperty(envKey + ".server");
					String username = props.getProperty(envKey + ".username");
					String password = SystemUtil.getEncryptedProperty(props, envKey + ".password");
	
					targetEnv = new Properties();  
				    targetEnv.put(DirContext.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");    
				    targetEnv.put(DirContext.PROVIDER_URL,"ldap://" + server);
				    targetEnv.put(DirContext.SECURITY_PRINCIPAL,username);
				    targetEnv.put(DirContext.SECURITY_CREDENTIALS,password);
				}
				
				if(cmd.hasOption("backup") ){
					if(sourceEnv != null){
						logger.info("Backing up source environment '" + sourceName + "' configuration");
						SystemRoleCollection src = IsimLdapContext.getSourceSystemRoles(sourceEnv, sourceBaseDN);
						SystemRoleFactory.printSystemRoles(src,"./cache/backup/" + sourceName + "/systemRoles");
						AccessRightUtil.printRights(sourceEnv, sourceIsimDN, sourceObjectFilter, "./cache/backup/" + sourceName + "/acls");
						
						/// Verify the backup can be restored
						List<AccessRight> rightsTest = IsimAcls.importAcls("./cache/backup/" + sourceName + "/acls");
						SystemRoleCollection srcTest = SystemRoleFactory.importSystemRoles("./cache/backup/" + sourceName + "/systemRoles");
						if(rightsTest.size() == 0) logger.warn("Failed to test backup import of ACLs");
						if(srcTest.getRoleDNs().size() == 0) logger.warn("Failed to test backup import of system roles");
					}
					if(targetEnv != null){
						logger.info("Backing up target environment '" + targetName + "' configuration");
						SystemRoleCollection src = IsimLdapContext.getTargetSystemRoles(targetEnv, targetBaseDN);
						SystemRoleFactory.printSystemRoles(src,"./cache/backup/" + targetName + "/systemRoles");
						AccessRightUtil.printRights(targetEnv, targetIsimDN, targetObjectFilter, "./cache/backup/" + targetName + "/acls");
						
						/// Verify the backup can be restored
						List<AccessRight> rightsTest = IsimAcls.importAcls("./cache/backup/" + targetName + "/acls");
						SystemRoleCollection srcTest = SystemRoleFactory.importSystemRoles("./cache/backup/" + targetName + "/systemRoles");
						if(rightsTest.size() == 0) logger.warn("Failed to test backup import of ACLs");
						if(srcTest.getRoleDNs().size() == 0) logger.warn("Failed to test backup import of system roles");
					}
				}
				if(cmd.hasOption("cache") ){
					if(sourceEnv != null){
						List<AccessRight> rights = AccessRightUtil.getRightsCache(sourceEnv, sourceName, sourceIsimDN, sourceObjectFilter);
						if(rights.size() > 0){
							logger.info("Created Source ACI Cache");
						}
						else{
							logger.warn("Unable to create Source ACI Cache");
						}
					}
					if(targetEnv != null){
						List<AccessRight> rights = AccessRightUtil.getRightsCache(targetEnv, targetName, targetIsimDN, targetObjectFilter);
						if(rights.size() > 0){
							logger.info("Created target ACI Cache");
						}
						else{
							logger.warn("Unable to create target ACI Cache");
						}
					}
				}
				if(cmd.hasOption("listReports") ){
					if(sourceEnv != null){
						logger.info("Report ACIs for " + sourceName + ":");
						List<AccessRight> rights = AccessRightUtil.getRightsCache(sourceEnv, sourceName, sourceIsimDN, sourceObjectFilter);
						for(int i = 0; i < rights.size(); i++){
							if(rights.get(i).getTarget().getObjectclass().matches("^\\d+$")){
								logger.info("\t" + rights.get(i).getTarget().getObjectclass() + " " + rights.get(i).getName());
							}
						}
					}
				}
				if(sourceEnv != null && targetEnv != null && cmd.hasOption("cloneAci") && cmd.hasOption("cloneName") && cmd.hasOption("aciName") ){
					//List<AccessRight> rights = getRightsCache(targetEnv, targetName, targetIsimDN, targetObjectFilter);
					List<AccessRight> rights = AccessRightUtil.getRightsCache(sourceEnv, sourceName, sourceIsimDN, sourceObjectFilter);
					AccessRight right = null;
					int rightIndex = -1;
					String cloneName = cmd.getOptionValue("cloneName");
					String aciName = cmd.getOptionValue("aciName");
					for(int i = 0; i < rights.size(); i++){
						if(rights.get(i).getName().equals(aciName)){
							right = AccessRightUtil.cloneAccessRight(rights.get(i));
							rightIndex = i;
							if(right.getPrincipals() != null){
								if(right.getPrincipals().getSystemRole() != null) right.getPrincipals().getSystemRole().clear();
								if(right.getPrincipals().getRelationship() != null) right.getPrincipals().getRelationship().clear();
							}
							break;
						}
					}
					if(right != null){
						right.setName(cloneName);
						logger.info("Cloning ACI '" + aciName + "' to '" + cloneName + "' in " + BinaryUtil.toBase64Str(right.getName())  + "-aci.xml");
						
						
						SystemUtil.emitFile(AccessRightUtil.exportAccessRight(right), "./cache/" + targetName + "/acls" + File.separator + BinaryUtil.toBase64Str(right.getName()) + "-acl.xml");
						rights.add(right);
					}
					else{
						logger.warn("ACI '" + aciName + "' not found");
					}

				}
				if(targetEnv != null && cmd.hasOption("addPrincipal") && cmd.hasOption("principalName") && cmd.hasOption("aciName") ){
					String aciName = cmd.getOptionValue("aciName");
					String principalName = cmd.getOptionValue("principalName");
					SystemRoleCollection src = IsimLdapContext.getTargetSystemRoles(targetEnv, targetBaseDN);
					if(src.getRoleNameDNMap().containsKey(principalName) == true){
						SystemRoleType srt = src.getRoles().get(src.getRoleNameDNMap().get(principalName));
						List<AccessRight> rights = AccessRightUtil.getRightsCache(targetEnv, targetName, targetIsimDN, targetObjectFilter);
						AccessRight right = null;
						for(int i = 0; i < rights.size(); i++){
							if(rights.get(i).getName().equals(aciName)){
								right = rights.get(i);
								break;
							}
						}
						if(right != null){
							logger.info("Adding principal '" + principalName + "' to '" + aciName + "'");
							if(right.getPrincipals() == null) right.setPrincipals(new Principals());
							if(AccessRightUtil.havePrincipal(right, srt.getDn()) == false){
								right.getPrincipals().getSystemRole().add(srt.getDn());
								SystemUtil.emitFile(AccessRightUtil.exportAccessRight(right), "./cache/" + targetName + "/acls" + File.separator + BinaryUtil.toBase64Str(right.getName()) + "-acl.xml");
							}
							else{
								logger.warn("DN '" + srt.getDn() + "' is already a principal of this ACI");
							}

						}
						else{
							logger.warn("ACI '" + aciName + "' was not found");
						}
					}
					else{
						logger.warn("System Role '" + principalName + "' was not found");
					}
				}
				if(targetEnv != null && cmd.hasOption("createXml")){
					boolean created = DataUtil.createMasterAclDocument(targetName,"./AccessRight.xml");
					if(created) logger.info("Emitted ./AccessRight.xml");
					else logger.warn("Failed to emit ./AccessRight.xml");
					
				}
				if(targetEnv != null && cmd.hasOption("addAci") && cmd.hasOption("aciName") ){
					String aciName = cmd.getOptionValue("aciName");
					List<AccessRight> rights = AccessRightUtil.getRightsCache(targetEnv, targetName, targetIsimDN, targetObjectFilter);
					AccessRight right = null;

					boolean testOnly = cmd.hasOption("test");
					
					for(int i = 0; i < rights.size(); i++){
						if(rights.get(i).getName().equals(aciName)){
							right = rights.get(i);
							break;
						}
					}
					if(right != null){
						List<AccessRight> acls = IsimAcls.getAcls(targetEnv, targetIsimDN, targetObjectFilter);
						boolean match = false;
						for(int i = 0; i < acls.size();i++){
							if(acls.get(i).getName().equals(right.getName()) == true){
								match = true;
								break;
							}
						}
						if(match == false){
							if(testOnly == false){
								if(IsimAcls.addAcl(targetEnv, targetIsimDN, right)){
									logger.info("Add ACI '" + aciName + "'");
								}
								else{
									logger.warn("Failed to add ACI '" + aciName + "'");
								}
								
							}
							else{
								logger.info("Test Add ACI '" + aciName + "'");
							}
						}
						else{
							logger.warn("ACI already exists with the name '" + right.getName() + "'");
						}
					}
					else{
						logger.warn("ACI '" + aciName + "' not found");
					}
				}
				
				if(targetEnv != null && cmd.hasOption("updateAcis") ){
					List<AccessRight> acls = AccessRightUtil.getRightsCache(targetEnv, targetName, targetIsimDN, targetObjectFilter);
					boolean test = cmd.hasOption("test");
					if(test == false){
						if(IsimAcls.replaceAcls(targetEnv, targetIsimDN, acls)){
							logger.info("Replaced ACIs");
						}
						else{
							logger.warn("Failed to replace ACIs");
						}
					}
					else{
						logger.info("Test Replace ACIs");
					}
				}
				if(sourceEnv != null && targetEnv != null && cmd.hasOption("migrateAcis")){
					
					SystemRoleCollection sourceSrc = IsimLdapContext.getSourceSystemRoles(sourceEnv, sourceBaseDN);
					SystemRoleCollection targetSrc = IsimLdapContext.getTargetSystemRoles(targetEnv, targetBaseDN);
					List<AccessRight> rights = AccessRightUtil.getRightsCache(sourceEnv, sourceName, sourceIsimDN, sourceObjectFilter);
					boolean filterOrphans = cmd.hasOption("filterOrphanDN");

			        List<AccessRight> macls = new ArrayList<AccessRight>();
			        boolean error = false;
			        for(int i = 0; i < rights.size(); i++){
			        	AccessRight mRight = null;
			        	try {
							mRight = AccessRightUtil.migrateRight(sourceSrc, targetSrc, rights.get(i),filterOrphans);
							if(mRight != null){
								macls.add(mRight);
							}
							else{
								logger.error("Failed to migrate ACI " + rights.get(i).getName());
								error = true;
								break;
							}
						} catch (DependencyException e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
							logger.error("Error migrating ACI " + rights.get(i).getName());
							logger.error(e.getMessage());
							error = true;
						}
			        }
			        if(error == false){
			        	if(rights.size() == macls.size()){
			        		logger.info("Writing migrated ACIs to cache");
			        		for(int i = 0; i < macls.size();i++){
			        			AccessRight mRight = macls.get(i);
			        			SystemUtil.emitFile(AccessRightUtil.exportAccessRight(mRight), "./cache/" + targetName + "/acls" + File.separator + BinaryUtil.toBase64Str(mRight.getName()) + "-acl.xml");
			        		}
			        	}
			        	else{
			        		logger.warn("Migrated ACI length is different than source ACI length.  Not persisting migrated values");
			        	}
			        }
			        else{
			        	logger.warn("An error occurred.  Not persisting migrated values");
			        }
				}
				if(sourceEnv != null && targetEnv != null && cmd.hasOption("migrateAci") && cmd.hasOption("aciName")){
					String aciName = cmd.getOptionValue("aciName");
					SystemRoleCollection sourceSrc = IsimLdapContext.getSourceSystemRoles(sourceEnv, sourceBaseDN);
					SystemRoleCollection targetSrc = IsimLdapContext.getTargetSystemRoles(targetEnv, targetBaseDN);
					List<AccessRight> rights = AccessRightUtil.getRightsCache(sourceEnv, sourceName, sourceIsimDN, sourceObjectFilter);
					AccessRight right = null;
					for(int i = 0; i < rights.size(); i++){
						if(rights.get(i).getName().equals(aciName)){
							right = rights.get(i);
							break;
						}
					}
					if(right != null){
			        	AccessRight mRight = null;
			        	try {
							mRight = AccessRightUtil.migrateRight(sourceSrc, targetSrc, right,false);
						} catch (DependencyException e) {
							logger.error("Dependency Error: " + e.getMessage());
						}
			        	if(mRight != null){
			        		logger.info("Migrated ACI '" + aciName + "'");
			        		SystemUtil.emitFile(AccessRightUtil.exportAccessRight(mRight), "./cache/" + targetName + "/acls" + File.separator + BinaryUtil.toBase64Str(mRight.getName()) + "-acl.xml");
			        	}
			        	else{
			        		logger.warn("Failed to Migrate ACI '" + aciName + "'");
			        	}
					}
					else{
						logger.warn("ACI '" + aciName + "' not found");
					}
				}
				
				if(targetEnv != null && cmd.hasOption("addToReportView") && cmd.hasOption("reportView") && cmd.hasOption("principalName")){
					String reportView = cmd.getOptionValue("reportView");
					String principalName = cmd.getOptionValue("principalName");
					List<AccessRight> rights = AccessRightUtil.getRightsCache(targetEnv, targetName, targetIsimDN, targetObjectFilter);
					SystemRoleCollection src = IsimLdapContext.getTargetSystemRoles(targetEnv, targetBaseDN);
					if(src.getRoleNameDNMap().containsKey(principalName) == true){
						SystemRoleType srt = src.getRoles().get(src.getRoleNameDNMap().get(principalName));
						IsimReportCollection irc = new IsimReportCollection();
						if(irc.getReportViewMap().containsKey(reportView)){
							List<Integer> ids = irc.getReportViewMap().get(reportView);
							for(int i = 0; i < ids.size();i++){
								AccessRight rRight = null;
								IsimReport report = irc.getReportAcls().get(ids.get(i));
								/// This needs to be a map
								for(int r = 0; r < rights.size();r++){
									if(report.getName().equals(rights.get(r).getName())){
										rRight = rights.get(r);
										break;
									}
								}
								if(rRight == null){
									logger.warn("ACI '" + report.getName() + "' not found");
								}
								else{
									if(AccessRightUtil.havePrincipal(rRight, srt.getDn())){
										logger.info("Principal already assigned to '" + report.getName() + "'");
									}
									else{
										if(rRight.getPrincipals() == null) rRight.setPrincipals(new Principals());
										rRight.getPrincipals().getSystemRole().add(srt.getDn());
										SystemUtil.emitFile(AccessRightUtil.exportAccessRight(rRight), "./cache/" + targetName + "/acls" + File.separator + BinaryUtil.toBase64Str(rRight.getName()) + "-acl.xml");
										logger.info("Adding principal '" + srt.getRoleName() + "' to report " + rRight.getName());
									}
								}
							}
						}
						else{
							logger.warn("Report view '" + reportView + "' is not configured.");
						}
					}
					else{
						logger.warn("System Role '" + principalName + "' was not found");
					}
				}
			}
		}
		catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	
	
	public static Options getCLIOptions(){
		Options options = new Options();
		
		options.addOption("addToReportView",false,"The set of default report ACIs contained by a view");
		options.addOption("reportView",true,"The name of a report view");
		options.addOption("argFile",true,"A file containing a matrix of arguments");
		options.addOption("test",false,"Test an operation without persisting the change");
		options.addOption("cloneAci",false,"Clone an ACI");
		options.addOption("cache",false,"Rebuild ACI cache");
		options.addOption("cloneName",true,"Name of the clone");
		options.addOption("aciName",true,"Name of the ACI");
		options.addOption("addPrincipal",false,"Add a principal");
		options.addOption("principalName",true,"Name of the principal");
		options.addOption("addAci",false,"Add an ACI");
		options.addOption("updateAcis",false,"Update all ACIs");
		options.addOption("migrateAci",false,"Migrate a specified ACI");
		options.addOption("migrateAcis",false,"Migrate all ACIs");
		options.addOption("filterOrphanDN",false,"Filter DNs that are orphans in the source system ACI when migrating to the target system");
		options.addOption("sourceEnv",true,"Designate the source environment name");
		options.addOption("targetEnv",true,"Designate the target environment name");
		options.addOption("listReports",false,"List report ACIs");
		options.addOption("config",false,"Configure an environment");
		
		options.addOption("backup",false,"Cache operating data");
		options.addOption("env",true,"Designate the environment to configure");
		options.addOption("server",true,"LDAP Server");
		options.addOption("username", true, "LDAP user name");
		options.addOption("password",true,"LDAP password");
		options.addOption("isimDN",true,"ISIM base DN");
		options.addOption("baseDN",true,"LDAP base DN");
		options.addOption("objectFilter",true,"Search object filter");
		
		options.addOption("createXml",false,"Create an xml file representing all of the entity types from a set.  Used to create a feeder file for generating the AccessRight.xsd schema file.");
		
		return options;
	}
	
	public static void printPrincipals(Principals pps){
		if(pps == null) return;
		
		System.out.println("Principal Relationships");
		for(int i = 0; i < pps.getRelationship().size();i++){
			System.out.println("\t" + pps.getRelationship().get(i));
		}
		System.out.println("Principal System Roles");
		for(int i = 0; i < pps.getSystemRole().size();i++){
			System.out.println("\t" + pps.getSystemRole().get(i));
		}
	}
	
	public static Command importCommand(String xml){

		Command command = null;
		 // setup object mapper using the AppConfig class
	    JAXBContext context;
		try {
			context = JAXBContext.newInstance(Command.class);
		    ByteArrayInputStream bais =new ByteArrayInputStream(xml.getBytes("UTF-8"));
		    command = (Command) context.createUnmarshaller().unmarshal(bais);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    // parse the XML and return an instance of the AppConfig class
		catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    		//unmarshal(createInput("config.xml"));
	    return command;
	}
	public static String exportCommand(Command command){

		String output = null;
		 // setup object mapper using the AppConfig class
	    JAXBContext context;
		try {
			context = JAXBContext.newInstance(Command.class);
		    ByteArrayOutputStream baos = new ByteArrayOutputStream();
		    context.createMarshaller().marshal(command, baos);
		    baos.flush();
		    output = new String(baos.toByteArray(),"UTF-8");
		    baos.close();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    // parse the XML and return an instance of the AppConfig class
		catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    		//unmarshal(createInput("config.xml"));
	    return output;
	}
	
	
}
