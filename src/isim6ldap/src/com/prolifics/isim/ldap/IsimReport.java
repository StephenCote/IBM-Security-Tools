package com.prolifics.isim.ldap;

public class IsimReport {
	private String id = null;
	private String name = null;
	private String view = null;
	public IsimReport(String view, String id, String name){
		this.id = id;
		this.name = name;
		this.view = view;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getView() {
		return view;
	}
	
}
