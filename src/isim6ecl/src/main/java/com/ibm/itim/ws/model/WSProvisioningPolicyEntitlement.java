/**
 * WSProvisioningPolicyEntitlement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSProvisioningPolicyEntitlement  implements java.io.Serializable {
    private com.ibm.itim.ws.model.WSServiceTarget serviceTarget;

    private com.ibm.itim.ws.model.WSProvisioningParameters parameters;

    private int type;

    private java.lang.String processDN;

    public WSProvisioningPolicyEntitlement() {
    }

    public WSProvisioningPolicyEntitlement(
           com.ibm.itim.ws.model.WSServiceTarget serviceTarget,
           com.ibm.itim.ws.model.WSProvisioningParameters parameters,
           int type,
           java.lang.String processDN) {
           this.serviceTarget = serviceTarget;
           this.parameters = parameters;
           this.type = type;
           this.processDN = processDN;
    }


    /**
     * Gets the serviceTarget value for this WSProvisioningPolicyEntitlement.
     * 
     * @return serviceTarget
     */
    public com.ibm.itim.ws.model.WSServiceTarget getServiceTarget() {
        return serviceTarget;
    }


    /**
     * Sets the serviceTarget value for this WSProvisioningPolicyEntitlement.
     * 
     * @param serviceTarget
     */
    public void setServiceTarget(com.ibm.itim.ws.model.WSServiceTarget serviceTarget) {
        this.serviceTarget = serviceTarget;
    }


    /**
     * Gets the parameters value for this WSProvisioningPolicyEntitlement.
     * 
     * @return parameters
     */
    public com.ibm.itim.ws.model.WSProvisioningParameters getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this WSProvisioningPolicyEntitlement.
     * 
     * @param parameters
     */
    public void setParameters(com.ibm.itim.ws.model.WSProvisioningParameters parameters) {
        this.parameters = parameters;
    }


    /**
     * Gets the type value for this WSProvisioningPolicyEntitlement.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this WSProvisioningPolicyEntitlement.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }


    /**
     * Gets the processDN value for this WSProvisioningPolicyEntitlement.
     * 
     * @return processDN
     */
    public java.lang.String getProcessDN() {
        return processDN;
    }


    /**
     * Sets the processDN value for this WSProvisioningPolicyEntitlement.
     * 
     * @param processDN
     */
    public void setProcessDN(java.lang.String processDN) {
        this.processDN = processDN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSProvisioningPolicyEntitlement)) return false;
        WSProvisioningPolicyEntitlement other = (WSProvisioningPolicyEntitlement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceTarget==null && other.getServiceTarget()==null) || 
             (this.serviceTarget!=null &&
              this.serviceTarget.equals(other.getServiceTarget()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              this.parameters.equals(other.getParameters()))) &&
            this.type == other.getType() &&
            ((this.processDN==null && other.getProcessDN()==null) || 
             (this.processDN!=null &&
              this.processDN.equals(other.getProcessDN())));
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
        if (getServiceTarget() != null) {
            _hashCode += getServiceTarget().hashCode();
        }
        if (getParameters() != null) {
            _hashCode += getParameters().hashCode();
        }
        _hashCode += getType();
        if (getProcessDN() != null) {
            _hashCode += getProcessDN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSProvisioningPolicyEntitlement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSProvisioningPolicyEntitlement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "serviceTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSServiceTarget"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSProvisioningParameters"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "processDN"));
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
