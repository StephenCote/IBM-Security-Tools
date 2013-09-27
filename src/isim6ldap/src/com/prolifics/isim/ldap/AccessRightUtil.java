package com.prolifics.isim.ldap;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.cote.accountmanager.util.BinaryUtil;

import com.prolifics.isim.ldap.objects.AccessRight;
import com.prolifics.isim.ldap.objects.SystemRoleType;

public class AccessRightUtil {
	
	private static Map<String,List<AccessRight>> rightsCache = null;
	
	public static List<AccessRight> getRightsCache(Properties env, String name, String isimDN, String objectFilter){
		//logger.info("Reading ACI Cache for " + name);
		if(rightsCache == null){
			rightsCache = new HashMap<String, List<AccessRight>>();
		}
		if(rightsCache.containsKey(name)) return rightsCache.get(name);
		List<AccessRight> rights = IsimAcls.importAcls("./cache/" + name + "/acls");
		if(rights.size() == 0){
			//logger.info("Building ACI Cache for " + name);
			AccessRightUtil.printRights(env, isimDN, objectFilter, "./cache/" + name + "/acls");
			rights = IsimAcls.importAcls("./cache/" + name + "/acls");
		}
		rightsCache.put(name, rights);
		return rights;
	}
	
	public static boolean havePrincipal(AccessRight right, String dn){
		boolean out_bool = false;
		if(right.getPrincipals() != null){
			for(int i = 0; i < right.getPrincipals().getSystemRole().size();i++){
				if(right.getPrincipals().getSystemRole().get(i).equals(dn)){
					out_bool = true;
					break;
				}
			}
		}
		return out_bool;
	}
	public static AccessRight migrateRight(SystemRoleCollection srcRole, SystemRoleCollection targRole, AccessRight srcRight, boolean filterMissingDNs) throws DependencyException{
		/// Clone the original ACI
		///
		AccessRight targRight = cloneAccessRight(srcRight);
		
		/// Dump any existing system roles on the target and migrate them
		/// If src has the value, then targ, as a clone, has the value
		if(srcRight.getPrincipals() != null && srcRight.getPrincipals().getSystemRole() != null){
			
			List<String> srcList = srcRight.getPrincipals().getSystemRole();
			List<String> targList = targRight.getPrincipals().getSystemRole();
			targList.clear();
			for(int i = 0; i < srcList.size(); i++){
				
				if(srcRole.getRoles().containsKey(srcList.get(i).toLowerCase()) == false){
					if(filterMissingDNs) continue;
					else throw new DependencyException("Source system roles do not define system role dn " + srcList.get(i));
				}
				SystemRoleType sr = srcRole.getRoles().get(srcList.get(i).toLowerCase());
				if(targRole.getRoleNameDNMap().containsKey(sr.getRoleName()) == false){
					throw new DependencyException("Target system roles do not define system role with name " + sr.getRoleName());
				}
				SystemRoleType tsr = targRole.getRoles().get(targRole.getRoleNameDNMap().get(sr.getRoleName()));
				//System.out.println("Migrated ACI principal " + tsr.getRoleName() + " " + tsr.getDn());
				targList.add(tsr.getDn());
			}
		}
	
		
		
		return targRight;
	}

	public static void printRights(Properties env, String base, String filter, String path){
		//List<String> acls = IsimAcls.getEracls(env, base, filter);
		//List<AccessRight> acls = IsimAcls.getAcls(env, base, filter);
		List<String> aclStrs = IsimAcls.getEracls(env, base, filter);
		printStringRights(aclStrs, path);
	}
	public static void printStringRights(List<String> acls, String path){
		File f = new File(path);
		if(f.exists() == false) f.mkdirs();
		for(int i = 0; i < acls.size(); i++){
			AccessRight right = importAccessRight(acls.get(i));
			SystemUtil.emitFile(acls.get(i), path + File.separator + BinaryUtil.toBase64Str(right.getName()) + "-acl.xml");
		}
	}
	public static void printRights(List<AccessRight> acls, String path){

		File f = new File(path);
		if(f.exists() == false) f.mkdirs();
		for(int i = 0; i < acls.size(); i++){
			SystemUtil.emitFile(exportAccessRight(acls.get(i)), path + File.separator + BinaryUtil.toBase64Str(acls.get(i).getName()) + "-acl.xml");
		}
	}

	public static AccessRight cloneAccessRight(AccessRight right){
		return importAccessRight(exportAccessRight(right));
	}
	public static AccessRight importAccessRight(String xml){

		AccessRight right = null;
		 // setup object mapper using the AppConfig class
	    JAXBContext context;
		try {
			context = JAXBContext.newInstance(AccessRight.class);
		    ByteArrayInputStream bais =new ByteArrayInputStream(xml.getBytes("UTF-8"));
		    right = (AccessRight) context.createUnmarshaller().unmarshal(bais);
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
	    return right;
	}
	public static String exportAccessRight(AccessRight right){

		String output = null;
		 // setup object mapper using the AppConfig class
	    JAXBContext context;
		try {
			context = JAXBContext.newInstance(AccessRight.class);
		    ByteArrayOutputStream baos = new ByteArrayOutputStream();
		    context.createMarshaller().marshal(right, baos);
		    baos.flush();
		    output = new String(baos.toByteArray(),"UTF-8");
		    output = output.replace("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>", "");
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
