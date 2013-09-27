/**
 * WSProvisioningPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSProvisioningPolicy  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String name;

    private java.lang.String keywords;

    private java.lang.String itimDN;

    private java.lang.String caption;

    private com.ibm.itim.ws.model.WSProvisioningPolicyEntitlement[] entitlements;

    private com.ibm.itim.ws.model.WSProvisioningPolicyMembership[] membership;

    private int priority;

    private int scope;

    private com.ibm.itim.ws.model.WSOrganizationalContainer organizationalContainer;

    private boolean enabled;

    public WSProvisioningPolicy() {
    }

    public WSProvisioningPolicy(
           java.lang.String description,
           java.lang.String name,
           java.lang.String keywords,
           java.lang.String itimDN,
           java.lang.String caption,
           com.ibm.itim.ws.model.WSProvisioningPolicyEntitlement[] entitlements,
           com.ibm.itim.ws.model.WSProvisioningPolicyMembership[] membership,
           int priority,
           int scope,
           com.ibm.itim.ws.model.WSOrganizationalContainer organizationalContainer,
           boolean enabled) {
           this.description = description;
           this.name = name;
           this.keywords = keywords;
           this.itimDN = itimDN;
           this.caption = caption;
           this.entitlements = entitlements;
           this.membership = membership;
           this.priority = priority;
           this.scope = scope;
           this.organizationalContainer = organizationalContainer;
           this.enabled = enabled;
    }


    /**
     * Gets the description value for this WSProvisioningPolicy.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSProvisioningPolicy.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the name value for this WSProvisioningPolicy.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WSProvisioningPolicy.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the keywords value for this WSProvisioningPolicy.
     * 
     * @return keywords
     */
    public java.lang.String getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this WSProvisioningPolicy.
     * 
     * @param keywords
     */
    public void setKeywords(java.lang.String keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the itimDN value for this WSProvisioningPolicy.
     * 
     * @return itimDN
     */
    public java.lang.String getItimDN() {
        return itimDN;
    }


    /**
     * Sets the itimDN value for this WSProvisioningPolicy.
     * 
     * @param itimDN
     */
    public void setItimDN(java.lang.String itimDN) {
        this.itimDN = itimDN;
    }


    /**
     * Gets the caption value for this WSProvisioningPolicy.
     * 
     * @return caption
     */
    public java.lang.String getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this WSProvisioningPolicy.
     * 
     * @param caption
     */
    public void setCaption(java.lang.String caption) {
        this.caption = caption;
    }


    /**
     * Gets the entitlements value for this WSProvisioningPolicy.
     * 
     * @return entitlements
     */
    public com.ibm.itim.ws.model.WSProvisioningPolicyEntitlement[] getEntitlements() {
        return entitlements;
    }


    /**
     * Sets the entitlements value for this WSProvisioningPolicy.
     * 
     * @param entitlements
     */
    public void setEntitlements(com.ibm.itim.ws.model.WSProvisioningPolicyEntitlement[] entitlements) {
        this.entitlements = entitlements;
    }


    /**
     * Gets the membership value for this WSProvisioningPolicy.
     * 
     * @return membership
     */
    public com.ibm.itim.ws.model.WSProvisioningPolicyMembership[] getMembership() {
        return membership;
    }


    /**
     * Sets the membership value for this WSProvisioningPolicy.
     * 
     * @param membership
     */
    public void setMembership(com.ibm.itim.ws.model.WSProvisioningPolicyMembership[] membership) {
        this.membership = membership;
    }


    /**
     * Gets the priority value for this WSProvisioningPolicy.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this WSProvisioningPolicy.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the scope value for this WSProvisioningPolicy.
     * 
     * @return scope
     */
    public int getScope() {
        return scope;
    }


    /**
     * Sets the scope value for this WSProvisioningPolicy.
     * 
     * @param scope
     */
    public void setScope(int scope) {
        this.scope = scope;
    }


    /**
     * Gets the organizationalContainer value for this WSProvisioningPolicy.
     * 
     * @return organizationalContainer
     */
    public com.ibm.itim.ws.model.WSOrganizationalContainer getOrganizationalContainer() {
        return organizationalContainer;
    }


    /**
     * Sets the organizationalContainer value for this WSProvisioningPolicy.
     * 
     * @param organizationalContainer
     */
    public void setOrganizationalContainer(com.ibm.itim.ws.model.WSOrganizationalContainer organizationalContainer) {
        this.organizationalContainer = organizationalContainer;
    }


    /**
     * Gets the enabled value for this WSProvisioningPolicy.
     * 
     * @return enabled
     */
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this WSProvisioningPolicy.
     * 
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSProvisioningPolicy)) return false;
        WSProvisioningPolicy other = (WSProvisioningPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.keywords==null && other.getKeywords()==null) || 
             (this.keywords!=null &&
              this.keywords.equals(other.getKeywords()))) &&
            ((this.itimDN==null && other.getItimDN()==null) || 
             (this.itimDN!=null &&
              this.itimDN.equals(other.getItimDN()))) &&
            ((this.caption==null && other.getCaption()==null) || 
             (this.caption!=null &&
              this.caption.equals(other.getCaption()))) &&
            ((this.entitlements==null && other.getEntitlements()==null) || 
             (this.entitlements!=null &&
              java.util.Arrays.equals(this.entitlements, other.getEntitlements()))) &&
            ((this.membership==null && other.getMembership()==null) || 
             (this.membership!=null &&
              java.util.Arrays.equals(this.membership, other.getMembership()))) &&
            this.priority == other.getPriority() &&
            this.scope == other.getScope() &&
            ((this.organizationalContainer==null && other.getOrganizationalContainer()==null) || 
             (this.organizationalContainer!=null &&
              this.organizationalContainer.equals(other.getOrganizationalContainer()))) &&
            this.enabled == other.isEnabled();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getKeywords() != null) {
            _hashCode += getKeywords().hashCode();
        }
        if (getItimDN() != null) {
            _hashCode += getItimDN().hashCode();
        }
        if (getCaption() != null) {
            _hashCode += getCaption().hashCode();
        }
        if (getEntitlements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntitlements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntitlements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMembership() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMembership());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMembership(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPriority();
        _hashCode += getScope();
        if (getOrganizationalContainer() != null) {
            _hashCode += getOrganizationalContainer().hashCode();
        }
        _hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSProvisioningPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSProvisioningPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itimDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "itimDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "caption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "entitlements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSProvisioningPolicyEntitlement"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("membership");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "membership"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSProvisioningPolicyMembership"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "scope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationalContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "organizationalContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSOrganizationalContainer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "enabled"));
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
