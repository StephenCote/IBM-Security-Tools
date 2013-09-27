/**
 * WSChallenge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSChallenge  implements java.io.Serializable {
    private java.lang.String question;

    private com.ibm.itim.ws.model.WSLocale locale;

    public WSChallenge() {
    }

    public WSChallenge(
           java.lang.String question,
           com.ibm.itim.ws.model.WSLocale locale) {
           this.question = question;
           this.locale = locale;
    }


    /**
     * Gets the question value for this WSChallenge.
     * 
     * @return question
     */
    public java.lang.String getQuestion() {
        return question;
    }


    /**
     * Sets the question value for this WSChallenge.
     * 
     * @param question
     */
    public void setQuestion(java.lang.String question) {
        this.question = question;
    }


    /**
     * Gets the locale value for this WSChallenge.
     * 
     * @return locale
     */
    public com.ibm.itim.ws.model.WSLocale getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this WSChallenge.
     * 
     * @param locale
     */
    public void setLocale(com.ibm.itim.ws.model.WSLocale locale) {
        this.locale = locale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSChallenge)) return false;
        WSChallenge other = (WSChallenge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.question==null && other.getQuestion()==null) || 
             (this.question!=null &&
              this.question.equals(other.getQuestion()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale())));
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
        if (getQuestion() != null) {
            _hashCode += getQuestion().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSChallenge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSChallenge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "question"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSLocale"));
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
