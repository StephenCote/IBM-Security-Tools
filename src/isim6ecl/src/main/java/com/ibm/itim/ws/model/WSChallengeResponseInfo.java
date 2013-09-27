/**
 * WSChallengeResponseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSChallengeResponseInfo  implements java.io.Serializable {
    private java.lang.String question;

    private java.lang.String answer;

    public WSChallengeResponseInfo() {
    }

    public WSChallengeResponseInfo(
           java.lang.String question,
           java.lang.String answer) {
           this.question = question;
           this.answer = answer;
    }


    /**
     * Gets the question value for this WSChallengeResponseInfo.
     * 
     * @return question
     */
    public java.lang.String getQuestion() {
        return question;
    }


    /**
     * Sets the question value for this WSChallengeResponseInfo.
     * 
     * @param question
     */
    public void setQuestion(java.lang.String question) {
        this.question = question;
    }


    /**
     * Gets the answer value for this WSChallengeResponseInfo.
     * 
     * @return answer
     */
    public java.lang.String getAnswer() {
        return answer;
    }


    /**
     * Sets the answer value for this WSChallengeResponseInfo.
     * 
     * @param answer
     */
    public void setAnswer(java.lang.String answer) {
        this.answer = answer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSChallengeResponseInfo)) return false;
        WSChallengeResponseInfo other = (WSChallengeResponseInfo) obj;
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
            ((this.answer==null && other.getAnswer()==null) || 
             (this.answer!=null &&
              this.answer.equals(other.getAnswer())));
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
        if (getAnswer() != null) {
            _hashCode += getAnswer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSChallengeResponseInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSChallengeResponseInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "question"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "answer"));
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
