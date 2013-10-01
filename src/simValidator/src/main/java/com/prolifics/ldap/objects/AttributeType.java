package com.prolifics.ldap.objects;

import java.util.ArrayList;
import java.util.List;

public class AttributeType {

	private String name = null;
	private List<String> values = null;
	public AttributeType(){
		values = new ArrayList();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getValues() {
		return values;
	}
	public void setValues(List<String> values) {
		this.values = values;
	}
	

}
