package com.prolifics.isim.ldap;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.ModificationItem;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

import com.prolifics.isim.ldap.objects.AccessRight;

public class IsimAcls {
	
	public static boolean replaceAcls(Properties env, String baseDN, List<AccessRight> acls){
		boolean out_bool = false;

		int len = acls.size();
		ModificationItem[] mods = new ModificationItem[len];
		
		for(int i = 0; i < len;i++){
			String acl = AccessRightUtil.exportAccessRight(acls.get(i));
			mods[i] = new ModificationItem(DirContext.ADD_ATTRIBUTE, new BasicAttribute("eracl", acl));  
		}
		DirContext dc = null;
		try {
			dc = new InitialDirContext(env);
		} catch (NamingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/// Remove existing attribute values
		try {
			dc.modifyAttributes(baseDN, new ModificationItem[]{new ModificationItem(DirContext.REMOVE_ATTRIBUTE,new BasicAttribute("eracl"))});
		} catch (NamingException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
		}

		try {
			
			/// Set new attribute values
			dc.modifyAttributes(baseDN, mods);
			out_bool = true;
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	
			try {
				if(dc != null) dc.close();
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return out_bool;
	}
	public static void migratePrincipalBase(List<AccessRight> acls, String srcBase, String targBase){
		for(int i = 0; i < acls.size(); i++){
			AccessRight acl = acls.get(i);
			if(acl.getPrincipals() != null && acl.getPrincipals().getSystemRole() != null){
				List<String> srcList = acl.getPrincipals().getSystemRole();
				List<String> repList = new ArrayList<String>();
				for(int r = 0; r < srcList.size();r++){
					String rVal = srcList.get(r).replace(srcBase,targBase);
					repList.add(rVal);
				}
				srcList.clear();
				srcList.addAll(repList);
			}
		}
	}
	public static List<String> importAclStrings(String path){
		List<String> acls = new ArrayList<String>();
		File f = new File(path);
		if(f.exists() == false || f.isDirectory() == false){
			return acls;
		}
		File[] fs = f.listFiles();
		for(int fi = 0; fi < fs.length;fi++){
			try {
				String aclXml = new String(StreamUtil.fileHandleToBytes(fs[fi]),"UTF-8");
				acls.add(aclXml);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return acls;
	}
	public static List<AccessRight> importAcls(String path){
		List<AccessRight> acls = new ArrayList<AccessRight>();
		List<String> aclStr = importAclStrings(path);
		for(int i = 0; i < aclStr.size();i++){
			acls.add(AccessRightUtil.importAccessRight(aclStr.get(i)));
		}
		return acls;
	}
	
	public static boolean addAcl(Properties env, String baseDN, AccessRight acl){
		boolean out_bool = false;
		String aclXml = AccessRightUtil.exportAccessRight(acl);
		
		// Add an additional value to "telephonenumber"  
		ModificationItem[] mods = new ModificationItem[1];
		mods[0] = new ModificationItem(DirContext.ADD_ATTRIBUTE,  
		    new BasicAttribute("eracl", aclXml));  
		
		try {
			DirContext dc = new InitialDirContext(env);
			dc.modifyAttributes(baseDN, mods);
			dc.close();
			out_bool = true;
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		/*
		 *   Attributes attrs = new BasicAttributes();  
      BasicAttribute ocattr = new BasicAttribute("objectclass");  
      ocattr.add("top");  
      ocattr.add("person");  
      ocattr.add("inetOrgPerson");  
      attrs.put(ocattr);  
      attrs.put("cn", "Some Person");  
      attrs.put("sn", "Person");  
      return attrs;  
   
   
context.modifyAttributes("uid=skk27,ou=people",  
                             DirContext.REPLACE_ATTRIBUTE,  
                             attrs); 
		 */
		return out_bool;
	}
	
	public static List<AccessRight> getAcls(Properties env, String base, String filter){
		List<AccessRight> acls = new ArrayList<AccessRight>();
		List<String> aclStrs = IsimAcls.getEracls(env, base, filter);
		for(int i = 0; i < aclStrs.size();i++){
			acls.add(AccessRightUtil.importAccessRight(aclStrs.get(i)));
		}
		return acls;
	}
	public static List<String> getEracls(Properties env, String base, String filter){
		List<String> acls = new ArrayList<String>();
        try {  
 
            DirContext dc = new InitialDirContext(env);  
            SearchControls sc = new SearchControls();  
            sc.setSearchScope(SearchControls.OBJECT_SCOPE);  
            NamingEnumeration ne = null;  
            ne = dc.search(base, filter, sc);    
            int iter = 0;
            while (ne.hasMore() && iter++ < 200) {  
                // Retrieve the result as a SearchResult  
                // and print it (not very pretty). There are  
                // methods for extracting the attributes and  
                // values without printing, as well.  
                SearchResult sr = (SearchResult) ne.next();  
                String dn = sr.getName();  
                //System.out.println("Distinguished name is "+dn);  
                Attributes attrs = sr.getAttributes();  
                for(ne = attrs.getAll();ne.hasMoreElements();)  {  
                	Attribute attr = (Attribute) ne.next();  
                	String attrID = attr.getID();  
                	//System.out.println(attrID+" :");  
                	String attrVal = null;
                	if(attrID.equals("eracl") == false) continue;
                	
                	for(Enumeration vals = attr.getAll();vals.hasMoreElements();)  { 
                		//attr.getDefinition().
                		attrVal = (String)vals.nextElement();
                		acls.add(attrVal);
                		// System.out.println("\t"+vals.nextElement());  
                	}  
                }  
                System.out.println("\n");   
            }  
            // Here we unbind from the LDAP server.  
            dc.close();  
        } catch (NamingException nex) {  
            // A number of exceptions are subclassed from  
            // NamingException. In a real application you'd  
            // probably want to handle many of them  
            // differently.  
            System.err.println("Error: " + nex.getMessage());  
        }  
        return acls;
	}
}
