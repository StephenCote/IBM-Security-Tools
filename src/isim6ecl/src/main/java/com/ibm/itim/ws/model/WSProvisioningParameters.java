/**
 * WSProvisioningParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSProvisioningParameters  implements java.io.Serializable {
    private com.ibm.itim.ws.model.WSServiceAttributeParameter[] parameters;

    public WSProvisioningParameters() {
    }

    public WSProvisioningParameters(
           com.ibm.itim.ws.model.WSServiceAttributeParameter[] parameters) {
           this.parameters = parameters;
    }


    /**
     * Gets the parameters value for this WSProvisioningParameters.
     * 
     * @return parameters
     */
    public com.ibm.itim.ws.model.WSServiceAttributeParameter[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this WSProvisioningParameters.
     * 
     * @param parameters
     */
    public void setParameters(com.ibm.itim.ws.model.WSServiceAttributeParameter[] parameters) {
        this.parameters = parameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSProvisioningParameters)) return false;
        WSProvisioningParameters other = (WSProvisioningParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters())));
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
        if (getParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameters(), i);
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
        new org.apache.axis.description.TypeDesc(WSProvisioningParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSProvisioningParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSServiceAttributeParameter"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "item"));
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
