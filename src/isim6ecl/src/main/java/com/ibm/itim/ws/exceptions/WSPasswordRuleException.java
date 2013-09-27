/**
 * WSPasswordRuleException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.exceptions;

public class WSPasswordRuleException  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private com.ibm.itim.ws.model.WSPasswordRulesInfo wsPri2;

    private com.ibm.itim.ws.model.WSPasswordRulesInfo wsPri1;

    public WSPasswordRuleException() {
    }

    public WSPasswordRuleException(
           com.ibm.itim.ws.model.WSPasswordRulesInfo wsPri2,
           com.ibm.itim.ws.model.WSPasswordRulesInfo wsPri1) {
        this.wsPri2 = wsPri2;
        this.wsPri1 = wsPri1;
    }


    /**
     * Gets the wsPri2 value for this WSPasswordRuleException.
     * 
     * @return wsPri2
     */
    public com.ibm.itim.ws.model.WSPasswordRulesInfo getWsPri2() {
        return wsPri2;
    }


    /**
     * Sets the wsPri2 value for this WSPasswordRuleException.
     * 
     * @param wsPri2
     */
    public void setWsPri2(com.ibm.itim.ws.model.WSPasswordRulesInfo wsPri2) {
        this.wsPri2 = wsPri2;
    }


    /**
     * Gets the wsPri1 value for this WSPasswordRuleException.
     * 
     * @return wsPri1
     */
    public com.ibm.itim.ws.model.WSPasswordRulesInfo getWsPri1() {
        return wsPri1;
    }


    /**
     * Sets the wsPri1 value for this WSPasswordRuleException.
     * 
     * @param wsPri1
     */
    public void setWsPri1(com.ibm.itim.ws.model.WSPasswordRulesInfo wsPri1) {
        this.wsPri1 = wsPri1;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPasswordRuleException)) return false;
        WSPasswordRuleException other = (WSPasswordRuleException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsPri2==null && other.getWsPri2()==null) || 
             (this.wsPri2!=null &&
              this.wsPri2.equals(other.getWsPri2()))) &&
            ((this.wsPri1==null && other.getWsPri1()==null) || 
             (this.wsPri1!=null &&
              this.wsPri1.equals(other.getWsPri1())));
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
        if (getWsPri2() != null) {
            _hashCode += getWsPri2().hashCode();
        }
        if (getWsPri1() != null) {
            _hashCode += getWsPri1().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPasswordRuleException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSPasswordRuleException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsPri2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "wsPri2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSPasswordRulesInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsPri1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "wsPri1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSPasswordRulesInfo"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
