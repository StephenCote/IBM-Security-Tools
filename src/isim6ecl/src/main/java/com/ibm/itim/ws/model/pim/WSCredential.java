/**
 * WSCredential.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model.pim;

public class WSCredential  implements java.io.Serializable {
    private java.lang.String userID;

    private java.lang.String password;

    private com.ibm.itim.ws.model.pim.WSLeaseInfo leaseInfo;

    private java.lang.Boolean isPasswordViewable;

    public WSCredential() {
    }

    public WSCredential(
           java.lang.String userID,
           java.lang.String password,
           com.ibm.itim.ws.model.pim.WSLeaseInfo leaseInfo,
           java.lang.Boolean isPasswordViewable) {
           this.userID = userID;
           this.password = password;
           this.leaseInfo = leaseInfo;
           this.isPasswordViewable = isPasswordViewable;
    }


    /**
     * Gets the userID value for this WSCredential.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this WSCredential.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }


    /**
     * Gets the password value for this WSCredential.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this WSCredential.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the leaseInfo value for this WSCredential.
     * 
     * @return leaseInfo
     */
    public com.ibm.itim.ws.model.pim.WSLeaseInfo getLeaseInfo() {
        return leaseInfo;
    }


    /**
     * Sets the leaseInfo value for this WSCredential.
     * 
     * @param leaseInfo
     */
    public void setLeaseInfo(com.ibm.itim.ws.model.pim.WSLeaseInfo leaseInfo) {
        this.leaseInfo = leaseInfo;
    }


    /**
     * Gets the isPasswordViewable value for this WSCredential.
     * 
     * @return isPasswordViewable
     */
    public java.lang.Boolean getIsPasswordViewable() {
        return isPasswordViewable;
    }


    /**
     * Sets the isPasswordViewable value for this WSCredential.
     * 
     * @param isPasswordViewable
     */
    public void setIsPasswordViewable(java.lang.Boolean isPasswordViewable) {
        this.isPasswordViewable = isPasswordViewable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSCredential)) return false;
        WSCredential other = (WSCredential) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.leaseInfo==null && other.getLeaseInfo()==null) || 
             (this.leaseInfo!=null &&
              this.leaseInfo.equals(other.getLeaseInfo()))) &&
            ((this.isPasswordViewable==null && other.getIsPasswordViewable()==null) || 
             (this.isPasswordViewable!=null &&
              this.isPasswordViewable.equals(other.getIsPasswordViewable())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getLeaseInfo() != null) {
            _hashCode += getLeaseInfo().hashCode();
        }
        if (getIsPasswordViewable() != null) {
            _hashCode += getIsPasswordViewable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSCredential.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSCredential"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "userID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leaseInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "leaseInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSLeaseInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPasswordViewable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "isPasswordViewable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
