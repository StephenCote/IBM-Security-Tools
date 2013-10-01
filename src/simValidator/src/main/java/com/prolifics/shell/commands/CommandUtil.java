package com.prolifics.shell.commands;

import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.prolifics.ldap.objects.AccountType;
import com.prolifics.ldap.objects.AttributeType;
import com.prolifics.ldap.util.LDAPUtil;

public class CommandUtil {
	public static final Logger logger = Logger.getLogger(CommandUtil.class.getName());
	public static void checkObjectAttributes(Properties sdsEnv, String searchBase, String searchFilt,String[] attributeBase){
		String[] attributes = attributeBase[0].split(",");
		logger.debug("Search=" + searchBase + " " + searchFilt);
		
		
		List<AccountType> accounts = LDAPUtil.getAccounts(sdsEnv, searchBase, searchFilt);
		logger.debug("Retrieved " + accounts.size() + " objects");
		
		
		for(int i = 0; i < accounts.size();i++){
			AccountType account = accounts.get(i);
			logger.info("OBJECT " + account.getFirstAttributeValue("cn"));
			for(int a = 0; a < attributes.length;a++){
				AttributeType attribute = account.getAttribute(attributes[a]);
				if(attribute == null) continue;
				StringBuffer buff = new StringBuffer();
				for(int v = 0; v < attribute.getValues().size();v++){
					if(v > 0) buff.append(", ");
					buff.append(attribute.getValues().get(v));
				}
				if(buff.length() > 0)
					logger.info("\t" + attributes[a] + " = " + buff.toString());
			}
		}

	}

}
