/**
 * WSSharedAccess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model.pim;

public class WSSharedAccess  implements java.io.Serializable {
    private java.lang.String credCompDN;

    private java.lang.String name;

    private java.lang.String description;

    private boolean isPool;

    public WSSharedAccess() {
    }

    public WSSharedAccess(
           java.lang.String credCompDN,
           java.lang.String name,
           java.lang.String description,
           boolean isPool) {
           this.credCompDN = credCompDN;
           this.name = name;
           this.description = description;
           this.isPool = isPool;
    }


    /**
     * Gets the credCompDN value for this WSSharedAccess.
     * 
     * @return credCompDN
     */
    public java.lang.String getCredCompDN() {
        return credCompDN;
    }


    /**
     * Sets the credCompDN value for this WSSharedAccess.
     * 
     * @param credCompDN
     */
    public void setCredCompDN(java.lang.String credCompDN) {
        this.credCompDN = credCompDN;
    }


    /**
     * Gets the name value for this WSSharedAccess.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WSSharedAccess.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this WSSharedAccess.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSSharedAccess.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isPool value for this WSSharedAccess.
     * 
     * @return isPool
     */
    public boolean isIsPool() {
        return isPool;
    }


    /**
     * Sets the isPool value for this WSSharedAccess.
     * 
     * @param isPool
     */
    public void setIsPool(boolean isPool) {
        this.isPool = isPool;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSharedAccess)) return false;
        WSSharedAccess other = (WSSharedAccess) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.credCompDN==null && other.getCredCompDN()==null) || 
             (this.credCompDN!=null &&
              this.credCompDN.equals(other.getCredCompDN()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.isPool == other.isIsPool();
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
        if (getCredCompDN() != null) {
            _hashCode += getCredCompDN().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isIsPool() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSSharedAccess.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSSharedAccess"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credCompDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "credCompDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPool");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "isPool"));
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
