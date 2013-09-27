/**
 * WSGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSGroup  extends com.ibm.itim.ws.model.WSObject  implements java.io.Serializable {
    private java.lang.String serviceDN;

    private java.lang.String description;

    private java.lang.String id;

    private java.lang.String profileName;

    public WSGroup() {
    }

    public WSGroup(
           com.ibm.itim.ws.model.WSAttribute[] attributes,
           boolean select,
           java.lang.String name,
           java.lang.String itimDN,
           java.lang.String serviceDN,
           java.lang.String description,
           java.lang.String id,
           java.lang.String profileName) {
        super(
            attributes,
            select,
            name,
            itimDN);
        this.serviceDN = serviceDN;
        this.description = description;
        this.id = id;
        this.profileName = profileName;
    }


    /**
     * Gets the serviceDN value for this WSGroup.
     * 
     * @return serviceDN
     */
    public java.lang.String getServiceDN() {
        return serviceDN;
    }


    /**
     * Sets the serviceDN value for this WSGroup.
     * 
     * @param serviceDN
     */
    public void setServiceDN(java.lang.String serviceDN) {
        this.serviceDN = serviceDN;
    }


    /**
     * Gets the description value for this WSGroup.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSGroup.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the id value for this WSGroup.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this WSGroup.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the profileName value for this WSGroup.
     * 
     * @return profileName
     */
    public java.lang.String getProfileName() {
        return profileName;
    }


    /**
     * Sets the profileName value for this WSGroup.
     * 
     * @param profileName
     */
    public void setProfileName(java.lang.String profileName) {
        this.profileName = profileName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSGroup)) return false;
        WSGroup other = (WSGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceDN==null && other.getServiceDN()==null) || 
             (this.serviceDN!=null &&
              this.serviceDN.equals(other.getServiceDN()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
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
        if (getServiceDN() != null) {
            _hashCode += getServiceDN().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getProfileName() != null) {
            _hashCode += getProfileName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "serviceDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
