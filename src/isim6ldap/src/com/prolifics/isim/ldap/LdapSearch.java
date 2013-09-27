package com.prolifics.isim.ldap;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

public class LdapSearch {
	public static List<SearchResult> getBy(Properties env, String base, String filterDN){
		List<SearchResult> srs = new ArrayList<SearchResult>();
        try {  
 
            DirContext dc = new InitialDirContext(env);  
            SearchControls sc = new SearchControls();  
            sc.setSearchScope(SearchControls.SUBTREE_SCOPE);  
            NamingEnumeration ne = null;  
            ne = dc.search(base, filterDN, sc);    
            int iter = 0;
            while(ne.hasMore() && iter++ < 200) {  
                // Retrieve the result as a SearchResult  
                // and print it (not very pretty). There are  
                // methods for extracting the attributes and  
                // values without printing, as well.  
                srs.add((SearchResult) ne.next());  
    
            }  
            // Here we unbind from the LDAP server.  
            dc.close();  
        } catch (NamingException nex) {  
             
            System.err.println("Error: " + nex.getMessage());  
        }  
        return srs;
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
                // Retrieve the result as a SearchResult  
                // and print it (not very pretty). There are  
                // methods for extracting the attributes and  
                // values without printing, as well.  
                sr = (SearchResult) ne.next();  
                //String dn = sr.getName();  
                //System.out.println("Distinguished name is "+dn);  
                //System.out.println("\n");   
            }  
            // Here we unbind from the LDAP server.  
            dc.close();  
        } catch (NamingException nex) {  
             
            System.err.println("Error: " + nex.getMessage());  
        }  
        return sr;
	}
	
}
