/**
 * WSUserAccess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSUserAccess  extends com.ibm.itim.ws.model.WSObject  implements java.io.Serializable {
    private java.lang.String accessId;

    private java.lang.String serviceDN;

    private java.lang.String accessType;

    private java.lang.String ownerName;

    private java.lang.String ownerDN;

    private java.lang.String accessDescription;

    private java.lang.String accountDN;

    private java.lang.String profileName;

    private java.lang.String accessName;

    private java.lang.String userId;

    private java.lang.String serviceName;

    public WSUserAccess() {
    }

    public WSUserAccess(
           com.ibm.itim.ws.model.WSAttribute[] attributes,
           boolean select,
           java.lang.String name,
           java.lang.String itimDN,
           java.lang.String accessId,
           java.lang.String serviceDN,
           java.lang.String accessType,
           java.lang.String ownerName,
           java.lang.String ownerDN,
           java.lang.String accessDescription,
           java.lang.String accountDN,
           java.lang.String profileName,
           java.lang.String accessName,
           java.lang.String userId,
           java.lang.String serviceName) {
        super(
            attributes,
            select,
            name,
            itimDN);
        this.accessId = accessId;
        this.serviceDN = serviceDN;
        this.accessType = accessType;
        this.ownerName = ownerName;
        this.ownerDN = ownerDN;
        this.accessDescription = accessDescription;
        this.accountDN = accountDN;
        this.profileName = profileName;
        this.accessName = accessName;
        this.userId = userId;
        this.serviceName = serviceName;
    }


    /**
     * Gets the accessId value for this WSUserAccess.
     * 
     * @return accessId
     */
    public java.lang.String getAccessId() {
        return accessId;
    }


    /**
     * Sets the accessId value for this WSUserAccess.
     * 
     * @param accessId
     */
    public void setAccessId(java.lang.String accessId) {
        this.accessId = accessId;
    }


    /**
     * Gets the serviceDN value for this WSUserAccess.
     * 
     * @return serviceDN
     */
    public java.lang.String getServiceDN() {
        return serviceDN;
    }


    /**
     * Sets the serviceDN value for this WSUserAccess.
     * 
     * @param serviceDN
     */
    public void setServiceDN(java.lang.String serviceDN) {
        this.serviceDN = serviceDN;
    }


    /**
     * Gets the accessType value for this WSUserAccess.
     * 
     * @return accessType
     */
    public java.lang.String getAccessType() {
        return accessType;
    }


    /**
     * Sets the accessType value for this WSUserAccess.
     * 
     * @param accessType
     */
    public void setAccessType(java.lang.String accessType) {
        this.accessType = accessType;
    }


    /**
     * Gets the ownerName value for this WSUserAccess.
     * 
     * @return ownerName
     */
    public java.lang.String getOwnerName() {
        return ownerName;
    }


    /**
     * Sets the ownerName value for this WSUserAccess.
     * 
     * @param ownerName
     */
    public void setOwnerName(java.lang.String ownerName) {
        this.ownerName = ownerName;
    }


    /**
     * Gets the ownerDN value for this WSUserAccess.
     * 
     * @return ownerDN
     */
    public java.lang.String getOwnerDN() {
        return ownerDN;
    }


    /**
     * Sets the ownerDN value for this WSUserAccess.
     * 
     * @param ownerDN
     */
    public void setOwnerDN(java.lang.String ownerDN) {
        this.ownerDN = ownerDN;
    }


    /**
     * Gets the accessDescription value for this WSUserAccess.
     * 
     * @return accessDescription
     */
    public java.lang.String getAccessDescription() {
        return accessDescription;
    }


    /**
     * Sets the accessDescription value for this WSUserAccess.
     * 
     * @param accessDescription
     */
    public void setAccessDescription(java.lang.String accessDescription) {
        this.accessDescription = accessDescription;
    }


    /**
     * Gets the accountDN value for this WSUserAccess.
     * 
     * @return accountDN
     */
    public java.lang.String getAccountDN() {
        return accountDN;
    }


    /**
     * Sets the accountDN value for this WSUserAccess.
     * 
     * @param accountDN
     */
    public void setAccountDN(java.lang.String accountDN) {
        this.accountDN = accountDN;
    }


    /**
     * Gets the profileName value for this WSUserAccess.
     * 
     * @return profileName
     */
    public java.lang.String getProfileName() {
        return profileName;
    }


    /**
     * Sets the profileName value for this WSUserAccess.
     * 
     * @param profileName
     */
    public void setProfileName(java.lang.String profileName) {
        this.profileName = profileName;
    }


    /**
     * Gets the accessName value for this WSUserAccess.
     * 
     * @return accessName
     */
    public java.lang.String getAccessName() {
        return accessName;
    }


    /**
     * Sets the accessName value for this WSUserAccess.
     * 
     * @param accessName
     */
    public void setAccessName(java.lang.String accessName) {
        this.accessName = accessName;
    }


    /**
     * Gets the userId value for this WSUserAccess.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this WSUserAccess.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the serviceName value for this WSUserAccess.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this WSUserAccess.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSUserAccess)) return false;
        WSUserAccess other = (WSUserAccess) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accessId==null && other.getAccessId()==null) || 
             (this.accessId!=null &&
              this.accessId.equals(other.getAccessId()))) &&
            ((this.serviceDN==null && other.getServiceDN()==null) || 
             (this.serviceDN!=null &&
              this.serviceDN.equals(other.getServiceDN()))) &&
            ((this.accessType==null && other.getAccessType()==null) || 
             (this.accessType!=null &&
              this.accessType.equals(other.getAccessType()))) &&
            ((this.ownerName==null && other.getOwnerName()==null) || 
             (this.ownerName!=null &&
              this.ownerName.equals(other.getOwnerName()))) &&
            ((this.ownerDN==null && other.getOwnerDN()==null) || 
             (this.ownerDN!=null &&
              this.ownerDN.equals(other.getOwnerDN()))) &&
            ((this.accessDescription==null && other.getAccessDescription()==null) || 
             (this.accessDescription!=null &&
              this.accessDescription.equals(other.getAccessDescription()))) &&
            ((this.accountDN==null && other.getAccountDN()==null) || 
             (this.accountDN!=null &&
              this.accountDN.equals(other.getAccountDN()))) &&
            ((this.profileName==null && other.getProfileName()==null) || 
             (this.profileName!=null &&
              this.profileName.equals(other.getProfileName()))) &&
            ((this.accessName==null && other.getAccessName()==null) || 
             (this.accessName!=null &&
              this.accessName.equals(other.getAccessName()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName())));
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
        if (getAccessId() != null) {
            _hashCode += getAccessId().hashCode();
        }
        if (getServiceDN() != null) {
            _hashCode += getServiceDN().hashCode();
        }
        if (getAccessType() != null) {
            _hashCode += getAccessType().hashCode();
        }
        if (getOwnerName() != null) {
            _hashCode += getOwnerName().hashCode();
        }
        if (getOwnerDN() != null) {
            _hashCode += getOwnerDN().hashCode();
        }
        if (getAccessDescription() != null) {
            _hashCode += getAccessDescription().hashCode();
        }
        if (getAccountDN() != null) {
            _hashCode += getAccountDN().hashCode();
        }
        if (getProfileName() != null) {
            _hashCode += getProfileName().hashCode();
        }
        if (getAccessName() != null) {
            _hashCode += getAccessName().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSUserAccess.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSUserAccess"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "accessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "serviceDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "accessType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "ownerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "ownerDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "accessDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "accountDN"));
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
        elemField.setFieldName("accessName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "accessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "serviceName"));
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
