package com.prolifics.isim.ldap;

import java.util.Properties;

public class IsimLdapContext {
	private static SystemRoleCollection targetSystemRoles = null;
	private static SystemRoleCollection sourceSystemRoles = null;
	public static SystemRoleCollection getSourceSystemRoles(Properties props, String baseDN){
		if(sourceSystemRoles != null) return sourceSystemRoles;
		sourceSystemRoles = new SystemRoleCollection();
		sourceSystemRoles = SystemRoleFactory.getSystemRoleCollection(props, baseDN);
		return sourceSystemRoles;
	}
	public static SystemRoleCollection getTargetSystemRoles(Properties props, String baseDN){
		if(targetSystemRoles != null) return targetSystemRoles;
		targetSystemRoles = new SystemRoleCollection();
		targetSystemRoles = SystemRoleFactory.getSystemRoleCollection(props, baseDN);
		return targetSystemRoles;
	}
	
}
