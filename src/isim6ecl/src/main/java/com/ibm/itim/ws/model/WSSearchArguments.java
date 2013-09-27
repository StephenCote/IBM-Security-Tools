/**
 * WSSearchArguments.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSSearchArguments  implements java.io.Serializable {
    private java.lang.String category;

    private java.lang.String profile;

    private java.lang.String objectclass;

    private java.lang.String contextDN;

    private java.lang.String returnedAttributeName;

    private java.lang.String filter;

    private java.lang.String base;

    public WSSearchArguments() {
    }

    public WSSearchArguments(
           java.lang.String category,
           java.lang.String profile,
           java.lang.String objectclass,
           java.lang.String contextDN,
           java.lang.String returnedAttributeName,
           java.lang.String filter,
           java.lang.String base) {
           this.category = category;
           this.profile = profile;
           this.objectclass = objectclass;
           this.contextDN = contextDN;
           this.returnedAttributeName = returnedAttributeName;
           this.filter = filter;
           this.base = base;
    }


    /**
     * Gets the category value for this WSSearchArguments.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this WSSearchArguments.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the profile value for this WSSearchArguments.
     * 
     * @return profile
     */
    public java.lang.String getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this WSSearchArguments.
     * 
     * @param profile
     */
    public void setProfile(java.lang.String profile) {
        this.profile = profile;
    }


    /**
     * Gets the objectclass value for this WSSearchArguments.
     * 
     * @return objectclass
     */
    public java.lang.String getObjectclass() {
        return objectclass;
    }


    /**
     * Sets the objectclass value for this WSSearchArguments.
     * 
     * @param objectclass
     */
    public void setObjectclass(java.lang.String objectclass) {
        this.objectclass = objectclass;
    }


    /**
     * Gets the contextDN value for this WSSearchArguments.
     * 
     * @return contextDN
     */
    public java.lang.String getContextDN() {
        return contextDN;
    }


    /**
     * Sets the contextDN value for this WSSearchArguments.
     * 
     * @param contextDN
     */
    public void setContextDN(java.lang.String contextDN) {
        this.contextDN = contextDN;
    }


    /**
     * Gets the returnedAttributeName value for this WSSearchArguments.
     * 
     * @return returnedAttributeName
     */
    public java.lang.String getReturnedAttributeName() {
        return returnedAttributeName;
    }


    /**
     * Sets the returnedAttributeName value for this WSSearchArguments.
     * 
     * @param returnedAttributeName
     */
    public void setReturnedAttributeName(java.lang.String returnedAttributeName) {
        this.returnedAttributeName = returnedAttributeName;
    }


    /**
     * Gets the filter value for this WSSearchArguments.
     * 
     * @return filter
     */
    public java.lang.String getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this WSSearchArguments.
     * 
     * @param filter
     */
    public void setFilter(java.lang.String filter) {
        this.filter = filter;
    }


    /**
     * Gets the base value for this WSSearchArguments.
     * 
     * @return base
     */
    public java.lang.String getBase() {
        return base;
    }


    /**
     * Sets the base value for this WSSearchArguments.
     * 
     * @param base
     */
    public void setBase(java.lang.String base) {
        this.base = base;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSearchArguments)) return false;
        WSSearchArguments other = (WSSearchArguments) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              this.profile.equals(other.getProfile()))) &&
            ((this.objectclass==null && other.getObjectclass()==null) || 
             (this.objectclass!=null &&
              this.objectclass.equals(other.getObjectclass()))) &&
            ((this.contextDN==null && other.getContextDN()==null) || 
             (this.contextDN!=null &&
              this.contextDN.equals(other.getContextDN()))) &&
            ((this.returnedAttributeName==null && other.getReturnedAttributeName()==null) || 
             (this.returnedAttributeName!=null &&
              this.returnedAttributeName.equals(other.getReturnedAttributeName()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
            ((this.base==null && other.getBase()==null) || 
             (this.base!=null &&
              this.base.equals(other.getBase())));
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
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getProfile() != null) {
            _hashCode += getProfile().hashCode();
        }
        if (getObjectclass() != null) {
            _hashCode += getObjectclass().hashCode();
        }
        if (getContextDN() != null) {
            _hashCode += getContextDN().hashCode();
        }
        if (getReturnedAttributeName() != null) {
            _hashCode += getReturnedAttributeName().hashCode();
        }
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        if (getBase() != null) {
            _hashCode += getBase().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSSearchArguments.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSearchArguments"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectclass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "objectclass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "contextDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnedAttributeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "returnedAttributeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("base");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "base"));
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
