/**
 * WSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSService  extends com.ibm.itim.ws.model.WSObject  implements java.io.Serializable {
    private boolean enrole;

    private java.lang.String profileName;

    public WSService() {
    }

    public WSService(
           com.ibm.itim.ws.model.WSAttribute[] attributes,
           boolean select,
           java.lang.String name,
           java.lang.String itimDN,
           boolean enrole,
           java.lang.String profileName) {
        super(
            attributes,
            select,
            name,
            itimDN);
        this.enrole = enrole;
        this.profileName = profileName;
    }


    /**
     * Gets the enrole value for this WSService.
     * 
     * @return enrole
     */
    public boolean isEnrole() {
        return enrole;
    }


    /**
     * Sets the enrole value for this WSService.
     * 
     * @param enrole
     */
    public void setEnrole(boolean enrole) {
        this.enrole = enrole;
    }


    /**
     * Gets the profileName value for this WSService.
     * 
     * @return profileName
     */
    public java.lang.String getProfileName() {
        return profileName;
    }


    /**
     * Sets the profileName value for this WSService.
     * 
     * @param profileName
     */
    public void setProfileName(java.lang.String profileName) {
        this.profileName = profileName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSService)) return false;
        WSService other = (WSService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.enrole == other.isEnrole() &&
            ((this.profileName==null && other.getProfileName()==null) || 
             (this.profileName!=null &&
              this.profileName.equals(other.getProfileName())));
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
        _hashCode += (isEnrole() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getProfileName() != null) {
            _hashCode += getProfileName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "enrole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "profileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
