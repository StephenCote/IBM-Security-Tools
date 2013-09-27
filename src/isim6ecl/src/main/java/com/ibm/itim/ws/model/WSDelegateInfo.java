/**
 * WSDelegateInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSDelegateInfo  extends com.ibm.itim.ws.model.WSDelegate  implements java.io.Serializable {
    private boolean delegated;

    private java.lang.String userid;

    private boolean accountActive;

    public WSDelegateInfo() {
    }

    public WSDelegateInfo(
           com.ibm.itim.ws.model.WSAttribute[] attributes,
           boolean select,
           java.lang.String name,
           java.lang.String itimDN,
           java.util.Calendar endDate,
           java.util.Calendar startDate,
           boolean delegated,
           java.lang.String userid,
           boolean accountActive) {
        super(
            attributes,
            select,
            name,
            itimDN,
            endDate,
            startDate);
        this.delegated = delegated;
        this.userid = userid;
        this.accountActive = accountActive;
    }


    /**
     * Gets the delegated value for this WSDelegateInfo.
     * 
     * @return delegated
     */
    public boolean isDelegated() {
        return delegated;
    }


    /**
     * Sets the delegated value for this WSDelegateInfo.
     * 
     * @param delegated
     */
    public void setDelegated(boolean delegated) {
        this.delegated = delegated;
    }


    /**
     * Gets the userid value for this WSDelegateInfo.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this WSDelegateInfo.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the accountActive value for this WSDelegateInfo.
     * 
     * @return accountActive
     */
    public boolean isAccountActive() {
        return accountActive;
    }


    /**
     * Sets the accountActive value for this WSDelegateInfo.
     * 
     * @param accountActive
     */
    public void setAccountActive(boolean accountActive) {
        this.accountActive = accountActive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDelegateInfo)) return false;
        WSDelegateInfo other = (WSDelegateInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.delegated == other.isDelegated() &&
            ((this.userid==null && other.getUserid()==null) || 
             (this.userid!=null &&
              this.userid.equals(other.getUserid()))) &&
            this.accountActive == other.isAccountActive();
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
        _hashCode += (isDelegated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        _hashCode += (isAccountActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSDelegateInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSDelegateInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delegated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "delegated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "accountActive"));
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
