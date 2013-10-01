package com.prolifics.ldap.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.PartialResultException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

import org.apache.log4j.Logger;

import com.prolifics.ldap.objects.AccountType;
import com.prolifics.ldap.objects.AttributeType;


public class LDAPUtil {
	public static final Logger logger = Logger.getLogger(LDAPUtil.class.getName());
	public static List<AccountType> getAccounts(Properties env, String base, String filter){
		List<AccountType> accounts = new ArrayList<AccountType>();
		DirContext dc = null;
        try {  
            dc = new InitialDirContext(env);  
            SearchControls sc = new SearchControls();  
            sc.setSearchScope(SearchControls.SUBTREE_SCOPE);  
            sc.setReturningObjFlag(true);
            sc.setDerefLinkFlag(true);
            //sc.setCountLimit(20000);
            NamingEnumeration ne = null;  
            NamingEnumeration attrNe = null;
            ne = dc.search(base, filter, sc);    
            int iter = 0;
            while (ne.hasMore()) {  
                SearchResult sr = (SearchResult) ne.next();  
                String dn = sr.getName();  
                AccountType account = new AccountType();
                account.setDn(dn);
                Attributes attrs = sr.getAttributes();  
                for(attrNe = attrs.getAll();attrNe.hasMoreElements();)  {  
                	Attribute attr = (Attribute) attrNe.next();  
                	String attrID = attr.getID();  
                	AttributeType aType = new AttributeType();
                	aType.setName(attrID);
                	String attrVal = null;
                	for(Enumeration vals = attr.getAll();vals.hasMoreElements();)  { 
                		attrVal = (String)vals.nextElement();
                		aType.getValues().add(attrVal);
                	}  
                	account.getAttributes().add(aType);
                } 
                sortAttributes(account);
                accounts.add(account);   
            }  

        }
        catch(PartialResultException pre){
        	/// sink the partial result error
        }
        catch (NamingException nex) {  
            System.err.println("Error: " + nex.getMessage()); 
            nex.printStackTrace();
        }
        finally{
         
        try {
			if(dc != null) dc.close();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
        return accounts;
	}
	
	public static Properties getBindProperties(String server, String bindUser, String bindPassword){
	        Properties env = new Properties();  
	        env.put(DirContext.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");    
	        env.put(DirContext.PROVIDER_URL,"ldap://" + server);
	        env.put(DirContext.SECURITY_PRINCIPAL,bindUser);
	        env.put(DirContext.SECURITY_CREDENTIALS,bindPassword);
	        return env;
	}
	public static String getOptionCondition(String attrName,String[] values){
		StringBuffer buff = new StringBuffer();
		buff.append("(|");
		for(int i = 0; i < values.length;i++){
			buff.append("(" + attrName +"=" + values[i] + ")");
		}
		buff.append(")");
		return buff.toString();
	}
	public static SearchResult getByDN(Properties env, String base, String filterDN){
		SearchResult sr = null;
        try {  
 
            DirContext dc = new InitialDirContext(env);  
            SearchControls sc = new SearchControls();  
            sc.setSearchScope(SearchControls.OBJECT_SCOPE);  
            NamingEnumeration ne = null;  
            ne = dc.search(base, filterDN, sc);    
            int iter = 0;
            if(ne.hasMore()) {  
                sr = (SearchResult) ne.next();  
                String dn = sr.getName();  
                System.out.println("Distinguished name is "+dn);  
                System.out.println("\n");   
            }  
            // Here we unbind from the LDAP server.  
            dc.close();  
        } catch (NamingException nex) {  
             
            System.err.println("Error: " + nex.getMessage());  
        }  
        return sr;
	}
	public static void sortAttributes(AccountType account){
	    Collections.sort(account.getAttributes(), new Comparator() {
	        public int compare(Object o1, Object o2) {
	            AttributeType s1 = (AttributeType)o1;
	            AttributeType s2 = (AttributeType)o2;
	            String f1 = s1.getName();
	            String f2 = s2.getName();          
	            return f1.trim().compareToIgnoreCase(f2.trim());          
	        }
	     });
	}
	public static void printObjects(Properties sdsEnv, String searchBase, String searchFilt){
		logger.debug("Search=" + searchBase + " " + searchFilt);
		
		List<AccountType> accounts = LDAPUtil.getAccounts(sdsEnv, searchBase, searchFilt);
		logger.debug("Retrieved " + accounts.size() + " objects");
		
		for(int i = 0; i < accounts.size();i++){
			AccountType account = accounts.get(i);
			logger.info("OBJECT " + account.getFirstAttributeValue("cn"));
			for(int a = 0; a < account.getAttributes().size();a++){
				AttributeType attribute = account.getAttributes().get(a);
				StringBuffer buff = new StringBuffer();
				for(int v = 0; v < attribute.getValues().size();v++){
					if(v > 0) buff.append(", ");
					buff.append(attribute.getValues().get(v));
				}
				logger.info("\t" + attribute.getName() + " = " + buff.toString());
			}
		}

	}

}
