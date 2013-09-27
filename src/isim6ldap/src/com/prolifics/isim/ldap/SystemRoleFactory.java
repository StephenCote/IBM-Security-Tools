package com.prolifics.isim.ldap;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchResult;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;


import com.prolifics.isim.ldap.objects.AccessRight;
import com.prolifics.isim.ldap.objects.SystemRoleType;

public class SystemRoleFactory {
	public static SystemRoleCollection getSystemRoleCollection(Properties env, String ldapRoot){
		SystemRoleCollection src = new SystemRoleCollection();
		List<SearchResult> srs = LdapSearch.getBy(env,ldapRoot,"(objectclass=erSystemRole)");
		for(int i = 0; i < srs.size();i++){
			SearchResult sr = srs.get(i);
			SystemRoleType sysRole = new SystemRoleType();
			Attributes ar = sr.getAttributes();
			/*
			
			NamingEnumeration ae = ar.getAll();
			
			while(ae.hasMoreElements()){
				Attribute at = (Attribute)ae.nextElement();
				System.out.println(at.getID());
			}
			*/
			try {
				sysRole.setSystemRoleCategory(((String)ar.get("ersystemrolecategory").get(0)));
				sysRole.setRoleName((String)ar.get("errolename").get(0));
				if(ar.get("description") != null && ar.get("description").size() > 0) sysRole.setDescription((String)ar.get("description").get(0));
				sysRole.setGlobalId((String)ar.get("erglobalid").get(0));
				String parent = (String)ar.get("erparent").get(0);
				int index = -1;
				if((index = parent.indexOf("ou=orgChart,")) > -1) parent = parent.substring(index + 12,parent.length());
				sysRole.setDn("erglobalid=" + sysRole.getGlobalId() + ",ou=sysRoles," + parent);

				addSystemRoleToCollection(sysRole,src);
				
				
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return src;
	}
	private static void addSystemRoleToCollection(SystemRoleType sysRole, SystemRoleCollection src){
		src.getRoleDNs().add(sysRole.getDn().toLowerCase());
		src.getRoleNameDNMap().put(sysRole.getRoleName(),sysRole.getDn().toLowerCase());
		src.getRoles().put(sysRole.getDn().toLowerCase(), sysRole);
		
	}
	public static SystemRoleCollection importSystemRoles(String path){
		SystemRoleCollection src = new SystemRoleCollection();
		File f = new File(path);
		if(f.exists() == false || f.isDirectory() == false){
			return src;
		}
		File[] fs = f.listFiles();
		for(int fi = 0; fi < fs.length;fi++){
			try {
				String srXml = new String(StreamUtil.fileHandleToBytes(fs[fi]),"UTF-8");
				SystemRoleType srt = importSystemRoleType(srXml);
				addSystemRoleToCollection(srt,src);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return src;
	}
	public static void printSystemRoles(Properties env, String base, String path){
		SystemRoleCollection src = getSystemRoleCollection(env, base);
		printSystemRoles(src, path);
	}
	public static void printSystemRoles(SystemRoleCollection src, String path){
		File f = new File(path);
		if(f.exists() == false) f.mkdirs();
		for(int i = 0; i < src.getRoleDNs().size(); i++){
			String name = (i + 1) + "-sr.xml";
			File aF = new File(path + File.separator + name);
			
			String srXml = exportSystemRoleType(src.getRoles().get(src.getRoleDNs().get(i)));
			try {
				if(aF.exists() == true) aF.delete();
				aF.createNewFile();
				FileOutputStream fos = new FileOutputStream(aF);
				
				fos.write(srXml.getBytes("UTF-8"));
				fos.flush();
				fos.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	public static SystemRoleType cloneSystemRoleType(SystemRoleType right){
		return importSystemRoleType(exportSystemRoleType(right));
	}
	public static SystemRoleType importSystemRoleType(String xml){

		SystemRoleType right = null;
		 // setup object mapper using the AppConfig class
	    JAXBContext context;
		try {
			context = JAXBContext.newInstance(SystemRoleType.class);
		    ByteArrayInputStream bais =new ByteArrayInputStream(xml.getBytes("UTF-8"));
		    right = (SystemRoleType) context.createUnmarshaller().unmarshal(bais);
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
	public static String exportSystemRoleType(SystemRoleType right){

		String output = null;
		 // setup object mapper using the AppConfig class
	    JAXBContext context;
		try {
			context = JAXBContext.newInstance(SystemRoleType.class);
		    ByteArrayOutputStream baos = new ByteArrayOutputStream();
		    context.createMarshaller().marshal(right, baos);
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
