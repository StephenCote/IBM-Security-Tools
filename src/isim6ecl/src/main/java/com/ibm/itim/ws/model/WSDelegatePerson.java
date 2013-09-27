/**
 * WSDelegatePerson.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSDelegatePerson  extends com.ibm.itim.ws.model.WSObject  implements java.io.Serializable {
    private com.ibm.itim.ws.model.WSSystemUser[] systemUsers;

    public WSDelegatePerson() {
    }

    public WSDelegatePerson(
           com.ibm.itim.ws.model.WSAttribute[] attributes,
           boolean select,
           java.lang.String name,
           java.lang.String itimDN,
           com.ibm.itim.ws.model.WSSystemUser[] systemUsers) {
        super(
            attributes,
            select,
            name,
            itimDN);
        this.systemUsers = systemUsers;
    }


    /**
     * Gets the systemUsers value for this WSDelegatePerson.
     * 
     * @return systemUsers
     */
    public com.ibm.itim.ws.model.WSSystemUser[] getSystemUsers() {
        return systemUsers;
    }


    /**
     * Sets the systemUsers value for this WSDelegatePerson.
     * 
     * @param systemUsers
     */
    public void setSystemUsers(com.ibm.itim.ws.model.WSSystemUser[] systemUsers) {
        this.systemUsers = systemUsers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDelegatePerson)) return false;
        WSDelegatePerson other = (WSDelegatePerson) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.systemUsers==null && other.getSystemUsers()==null) || 
             (this.systemUsers!=null &&
              java.util.Arrays.equals(this.systemUsers, other.getSystemUsers())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSystemUsers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSystemUsers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSystemUsers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSDelegatePerson.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSDelegatePerson"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "systemUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSystemUser"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "item"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
