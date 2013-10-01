package com.prolifics.ldap.objects;

import java.util.ArrayList;
import java.util.List;

public class AccountType {

	private String dn = null;
	private String uid = null;
	private List<AttributeType> attributes = null;
	public AccountType(){
		attributes = new ArrayList<AttributeType>();
	}
	public String getDn() {
		return dn;
	}
	public void setDn(String dn) {
		this.dn = dn;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public List<AttributeType> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<AttributeType> attributes) {
		this.attributes = attributes;
	}

	public String getFirstAttributeValue(String attrName){
		AttributeType attr = getAttribute(attrName);
		if(attr == null || attr.getValues().size()==0) return null;
		//System.out.println("Returning value #1 of " + attr.getValues().size());
		return attr.getValues().get(0);
	}
	public AttributeType getAttribute(String attrName){
		AttributeType out_attr = null;
		for(int i = 0; i < attributes.size();i++){
			//int l = attributes.get(i).getValues().size();
			//System.out.println("Checking " + attributes.get(i).getName() + "=" + (l > 0 ? attributes.get(i).getValues().get(0) : "nullnull"));
			if(attributes.get(i).getName().equalsIgnoreCase(attrName)){
				out_attr = attributes.get(i);
				break;
			}
		}
		return out_attr;
	}

}
