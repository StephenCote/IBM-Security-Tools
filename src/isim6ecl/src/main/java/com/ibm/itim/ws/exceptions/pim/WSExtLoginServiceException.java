/**
 * WSExtLoginServiceException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.exceptions.pim;

public class WSExtLoginServiceException  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private java.lang.String msgKey;

    private java.lang.String[] msgParameters;

    public WSExtLoginServiceException() {
    }

    public WSExtLoginServiceException(
           java.lang.String msgKey,
           java.lang.String[] msgParameters) {
        this.msgKey = msgKey;
        this.msgParameters = msgParameters;
    }


    /**
     * Gets the msgKey value for this WSExtLoginServiceException.
     * 
     * @return msgKey
     */
    public java.lang.String getMsgKey() {
        return msgKey;
    }


    /**
     * Sets the msgKey value for this WSExtLoginServiceException.
     * 
     * @param msgKey
     */
    public void setMsgKey(java.lang.String msgKey) {
        this.msgKey = msgKey;
    }


    /**
     * Gets the msgParameters value for this WSExtLoginServiceException.
     * 
     * @return msgParameters
     */
    public java.lang.String[] getMsgParameters() {
        return msgParameters;
    }


    /**
     * Sets the msgParameters value for this WSExtLoginServiceException.
     * 
     * @param msgParameters
     */
    public void setMsgParameters(java.lang.String[] msgParameters) {
        this.msgParameters = msgParameters;
    }

    public java.lang.String getMsgParameters(int i) {
        return this.msgParameters[i];
    }

    public void setMsgParameters(int i, java.lang.String _value) {
        this.msgParameters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSExtLoginServiceException)) return false;
        WSExtLoginServiceException other = (WSExtLoginServiceException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msgKey==null && other.getMsgKey()==null) || 
             (this.msgKey!=null &&
              this.msgKey.equals(other.getMsgKey()))) &&
            ((this.msgParameters==null && other.getMsgParameters()==null) || 
             (this.msgParameters!=null &&
              java.util.Arrays.equals(this.msgParameters, other.getMsgParameters())));
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
        if (getMsgKey() != null) {
            _hashCode += getMsgKey().hashCode();
        }
        if (getMsgParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMsgParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMsgParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSExtLoginServiceException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtLoginServiceException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "msgKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "msgParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
