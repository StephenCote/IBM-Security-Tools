/**
 * WSSearchResultsWrapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSSearchResultsWrapper  implements java.io.Serializable {
    private java.lang.String resultsObject;

    private java.lang.String resultsClassName;

    private java.lang.String name;

    private int pageCount;

    public WSSearchResultsWrapper() {
    }

    public WSSearchResultsWrapper(
           java.lang.String resultsObject,
           java.lang.String resultsClassName,
           java.lang.String name,
           int pageCount) {
           this.resultsObject = resultsObject;
           this.resultsClassName = resultsClassName;
           this.name = name;
           this.pageCount = pageCount;
    }


    /**
     * Gets the resultsObject value for this WSSearchResultsWrapper.
     * 
     * @return resultsObject
     */
    public java.lang.String getResultsObject() {
        return resultsObject;
    }


    /**
     * Sets the resultsObject value for this WSSearchResultsWrapper.
     * 
     * @param resultsObject
     */
    public void setResultsObject(java.lang.String resultsObject) {
        this.resultsObject = resultsObject;
    }


    /**
     * Gets the resultsClassName value for this WSSearchResultsWrapper.
     * 
     * @return resultsClassName
     */
    public java.lang.String getResultsClassName() {
        return resultsClassName;
    }


    /**
     * Sets the resultsClassName value for this WSSearchResultsWrapper.
     * 
     * @param resultsClassName
     */
    public void setResultsClassName(java.lang.String resultsClassName) {
        this.resultsClassName = resultsClassName;
    }


    /**
     * Gets the name value for this WSSearchResultsWrapper.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WSSearchResultsWrapper.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the pageCount value for this WSSearchResultsWrapper.
     * 
     * @return pageCount
     */
    public int getPageCount() {
        return pageCount;
    }


    /**
     * Sets the pageCount value for this WSSearchResultsWrapper.
     * 
     * @param pageCount
     */
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSearchResultsWrapper)) return false;
        WSSearchResultsWrapper other = (WSSearchResultsWrapper) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultsObject==null && other.getResultsObject()==null) || 
             (this.resultsObject!=null &&
              this.resultsObject.equals(other.getResultsObject()))) &&
            ((this.resultsClassName==null && other.getResultsClassName()==null) || 
             (this.resultsClassName!=null &&
              this.resultsClassName.equals(other.getResultsClassName()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.pageCount == other.getPageCount();
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
        if (getResultsObject() != null) {
            _hashCode += getResultsObject().hashCode();
        }
        if (getResultsClassName() != null) {
            _hashCode += getResultsClassName().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getPageCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSSearchResultsWrapper.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSearchResultsWrapper"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultsObject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "resultsObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultsClassName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "resultsClassName"));
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
        elemField.setFieldName("pageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "pageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
