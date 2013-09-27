/**
 * WSOrganizationalContainer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSOrganizationalContainer  extends com.ibm.itim.ws.model.WSObject  implements java.io.Serializable {
    private com.ibm.itim.ws.model.WSOrganizationalContainer[] children;

    private java.lang.String parentDN;

    private java.lang.String profileName;

    private java.lang.String supervisorDN;

    public WSOrganizationalContainer() {
    }

    public WSOrganizationalContainer(
           com.ibm.itim.ws.model.WSAttribute[] attributes,
           boolean select,
           java.lang.String name,
           java.lang.String itimDN,
           com.ibm.itim.ws.model.WSOrganizationalContainer[] children,
           java.lang.String parentDN,
           java.lang.String profileName,
           java.lang.String supervisorDN) {
        super(
            attributes,
            select,
            name,
            itimDN);
        this.children = children;
        this.parentDN = parentDN;
        this.profileName = profileName;
        this.supervisorDN = supervisorDN;
    }


    /**
     * Gets the children value for this WSOrganizationalContainer.
     * 
     * @return children
     */
    public com.ibm.itim.ws.model.WSOrganizationalContainer[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this WSOrganizationalContainer.
     * 
     * @param children
     */
    public void setChildren(com.ibm.itim.ws.model.WSOrganizationalContainer[] children) {
        this.children = children;
    }


    /**
     * Gets the parentDN value for this WSOrganizationalContainer.
     * 
     * @return parentDN
     */
    public java.lang.String getParentDN() {
        return parentDN;
    }


    /**
     * Sets the parentDN value for this WSOrganizationalContainer.
     * 
     * @param parentDN
     */
    public void setParentDN(java.lang.String parentDN) {
        this.parentDN = parentDN;
    }


    /**
     * Gets the profileName value for this WSOrganizationalContainer.
     * 
     * @return profileName
     */
    public java.lang.String getProfileName() {
        return profileName;
    }


    /**
     * Sets the profileName value for this WSOrganizationalContainer.
     * 
     * @param profileName
     */
    public void setProfileName(java.lang.String profileName) {
        this.profileName = profileName;
    }


    /**
     * Gets the supervisorDN value for this WSOrganizationalContainer.
     * 
     * @return supervisorDN
     */
    public java.lang.String getSupervisorDN() {
        return supervisorDN;
    }


    /**
     * Sets the supervisorDN value for this WSOrganizationalContainer.
     * 
     * @param supervisorDN
     */
    public void setSupervisorDN(java.lang.String supervisorDN) {
        this.supervisorDN = supervisorDN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSOrganizationalContainer)) return false;
        WSOrganizationalContainer other = (WSOrganizationalContainer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren()))) &&
            ((this.parentDN==null && other.getParentDN()==null) || 
             (this.parentDN!=null &&
              this.parentDN.equals(other.getParentDN()))) &&
            ((this.profileName==null && other.getProfileName()==null) || 
             (this.profileName!=null &&
              this.profileName.equals(other.getProfileName()))) &&
            ((this.supervisorDN==null && other.getSupervisorDN()==null) || 
             (this.supervisorDN!=null &&
              this.supervisorDN.equals(other.getSupervisorDN())));
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
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildren(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParentDN() != null) {
            _hashCode += getParentDN().hashCode();
        }
        if (getProfileName() != null) {
            _hashCode += getProfileName().hashCode();
        }
        if (getSupervisorDN() != null) {
            _hashCode += getSupervisorDN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSOrganizationalContainer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSOrganizationalContainer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSOrganizationalContainer"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "parentDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "profileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisorDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "supervisorDN"));
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
