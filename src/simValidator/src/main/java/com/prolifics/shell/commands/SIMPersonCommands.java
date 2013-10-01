package com.prolifics.shell.commands;

import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.prolifics.ldap.objects.AccountType;
import com.prolifics.ldap.util.LDAPUtil;

public class SIMPersonCommands {

	private static String simPersonFilter="(objectClass=person)";


	public static final Logger logger = Logger.getLogger(SIMPersonCommands.class.getName());

	public static void viewPersons(Properties sdsEnv, String searchBase, String[] accountNamesBase){
		String[] accountNames = accountNamesBase[0].split(",");
		String searchFilt = "(&" + simPersonFilter + LDAPUtil.getOptionCondition("cn", accountNames) + ")";
		viewPersons(sdsEnv, searchBase, searchFilt);
	}

	public static void viewPersons(Properties sdsEnv, String searchBase, String searchFilt){
		logger.debug("Search=" + searchBase + " " + searchFilt);
		LDAPUtil.printObjects(sdsEnv, searchBase, searchFilt);

	}
	
	public static void checkPersonAttributes(Properties sdsEnv, String searchBase, String[] accountNamesBase, String[] attributeBase){
		String[] accountNames = accountNamesBase[0].split(",");
		String searchFilt = "(&" + simPersonFilter + LDAPUtil.getOptionCondition("cn", accountNames) + ")";
		CommandUtil.checkObjectAttributes(sdsEnv, searchBase, searchFilt, attributeBase);
	}

}
