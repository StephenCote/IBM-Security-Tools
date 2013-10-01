package com.prolifics.shell.commands;

import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.prolifics.ldap.objects.AccountType;
import com.prolifics.ldap.util.LDAPUtil;

public class ADAccountCommands {
	private static String adAccountFilter="(objectClass=erADAccount)";
	private static String adDirAccountFilter="(objectclass=person)";
	private static String adActiveAttr = "eraccountstatus";
	public static final Logger logger = Logger.getLogger(ADAccountCommands.class.getName());

	
	public static void viewADAccounts(Properties sdsEnv, String searchBase, String[] accountNamesBase){
		String[] accountNames = accountNamesBase[0].split(",");
		String searchFilt = "(&" + adDirAccountFilter + LDAPUtil.getOptionCondition("cn", accountNames) + ")";
		viewADAccounts(sdsEnv, searchBase, searchFilt);
	}
	public static void viewADAccounts(Properties sdsEnv, String searchBase, String searchFilt){
		logger.debug("Search=" + searchBase + " " + searchFilt);
		LDAPUtil.printObjects(sdsEnv, searchBase, searchFilt);

	}
	public static void viewSimADAccounts(Properties sdsEnv, String searchBase, String[] accountNamesBase){
		String[] accountNames = accountNamesBase[0].split(",");
		String searchFilt = "(&" + adAccountFilter + LDAPUtil.getOptionCondition("eruid", accountNames) + ")";
		viewADAccounts(sdsEnv, searchBase, searchFilt);
	}
	public static void viewSimADAccounts(Properties sdsEnv, String searchBase, String searchFilt){
		logger.debug("Search=" + searchBase + " " + searchFilt);
		LDAPUtil.printObjects(sdsEnv, searchBase, searchFilt);

	}
	public static void checkADAccountAttributes(Properties sdsEnv, String searchBase, String[] accountNamesBase, String[] attributeBase){
		String[] accountNames = accountNamesBase[0].split(",");
		String[] attributes = attributeBase[0].split(",");
		String searchFilt = "(&" + adDirAccountFilter + LDAPUtil.getOptionCondition("cn", accountNames) + ")";
		CommandUtil.checkObjectAttributes(sdsEnv, searchBase, searchFilt, attributeBase);
	}
	
	public static void checkSimADAccountAttributes(Properties sdsEnv, String searchBase, String[] accountNamesBase, String[] attributeBase){
		String[] accountNames = accountNamesBase[0].split(",");
		String searchFilt = "(&" + adAccountFilter + LDAPUtil.getOptionCondition("eruid", accountNames) + ")";
		CommandUtil.checkObjectAttributes(sdsEnv, searchBase, searchFilt, attributeBase);
	}

	
	public static void checkActiveAccounts(Properties sdsEnv, String searchBase, String[] accountNamesBase){
		String[] accountNames = accountNamesBase[0].split(",");
		String searchFilt = "(&" + adAccountFilter + LDAPUtil.getOptionCondition("cn", accountNames) + ")";
		logger.info("Filter=" + searchFilt);
		
		List<AccountType> accounts = LDAPUtil.getAccounts(sdsEnv, searchBase, searchFilt);
		logger.info("Retrieved " + accounts.size() + " accounts");
		
		for(int i = 0; i < accounts.size();i++){
			AccountType account = accounts.get(i);
			String activeStr = account.getFirstAttributeValue(adActiveAttr);
			boolean active = (activeStr != null && activeStr.equals("1") ? true : false);
			logger.info(account.getFirstAttributeValue("cn") + " is active: " + active);
		}

	}

}
