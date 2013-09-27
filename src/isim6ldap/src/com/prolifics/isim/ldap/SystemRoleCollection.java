package com.prolifics.isim.ldap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.prolifics.isim.ldap.objects.SystemRoleType;

public class SystemRoleCollection {
	
	
	private List<String> roleDNs = null;
	private Map<String,SystemRoleType> roles = null;
	private Map<String,String> roleNameDNMap = null;
	public SystemRoleCollection(){
		roleDNs = new ArrayList<String>();
		roles = new HashMap<String,SystemRoleType>();
		roleNameDNMap = new HashMap<String,String>();
	}
	
	public List<String> getRoleDNs() {
		return roleDNs;
	}
	
	public Map<String, SystemRoleType> getRoles() {
		return roles;
	}
	
	public Map<String, String> getRoleNameDNMap() {
		return roleNameDNMap;
	}

	
}
