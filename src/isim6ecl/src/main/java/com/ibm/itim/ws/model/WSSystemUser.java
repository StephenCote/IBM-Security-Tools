/**
 * WSSystemUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSSystemUser  extends com.ibm.itim.ws.model.WSObject  implements java.io.Serializable {
    private boolean itimAdmin;

    public WSSystemUser() {
    }

    public WSSystemUser(
           com.ibm.itim.ws.model.WSAttribute[] attributes,
           boolean select,
           java.lang.String name,
           java.lang.String itimDN,
           boolean itimAdmin) {
        super(
            attributes,
            select,
            name,
            itimDN);
        this.itimAdmin = itimAdmin;
    }


    /**
     * Gets the itimAdmin value for this WSSystemUser.
     * 
     * @return itimAdmin
     */
    public boolean isItimAdmin() {
        return itimAdmin;
    }


    /**
     * Sets the itimAdmin value for this WSSystemUser.
     * 
     * @param itimAdmin
     */
    public void setItimAdmin(boolean itimAdmin) {
        this.itimAdmin = itimAdmin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSystemUser)) return false;
        WSSystemUser other = (WSSystemUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.itimAdmin == other.isItimAdmin();
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
        _hashCode += (isItimAdmin() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSSystemUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSystemUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itimAdmin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "itimAdmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
