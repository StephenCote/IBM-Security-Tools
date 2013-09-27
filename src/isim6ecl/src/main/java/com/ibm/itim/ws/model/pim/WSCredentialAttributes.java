/**
 * WSCredentialAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model.pim;

public class WSCredentialAttributes  implements java.io.Serializable {
    private com.ibm.itim.ws.model.pim.WSLeaseInfo leaseInfo;

    private com.ibm.itim.ws.model.WSAttribute[] attributes;

    public WSCredentialAttributes() {
    }

    public WSCredentialAttributes(
           com.ibm.itim.ws.model.pim.WSLeaseInfo leaseInfo,
           com.ibm.itim.ws.model.WSAttribute[] attributes) {
           this.leaseInfo = leaseInfo;
           this.attributes = attributes;
    }


    /**
     * Gets the leaseInfo value for this WSCredentialAttributes.
     * 
     * @return leaseInfo
     */
    public com.ibm.itim.ws.model.pim.WSLeaseInfo getLeaseInfo() {
        return leaseInfo;
    }


    /**
     * Sets the leaseInfo value for this WSCredentialAttributes.
     * 
     * @param leaseInfo
     */
    public void setLeaseInfo(com.ibm.itim.ws.model.pim.WSLeaseInfo leaseInfo) {
        this.leaseInfo = leaseInfo;
    }


    /**
     * Gets the attributes value for this WSCredentialAttributes.
     * 
     * @return attributes
     */
    public com.ibm.itim.ws.model.WSAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this WSCredentialAttributes.
     * 
     * @param attributes
     */
    public void setAttributes(com.ibm.itim.ws.model.WSAttribute[] attributes) {
        this.attributes = attributes;
    }

    public com.ibm.itim.ws.model.WSAttribute getAttributes(int i) {
        return this.attributes[i];
    }

    public void setAttributes(int i, com.ibm.itim.ws.model.WSAttribute _value) {
        this.attributes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSCredentialAttributes)) return false;
        WSCredentialAttributes other = (WSCredentialAttributes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.leaseInfo==null && other.getLeaseInfo()==null) || 
             (this.leaseInfo!=null &&
              this.leaseInfo.equals(other.getLeaseInfo()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes())));
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
        if (getLeaseInfo() != null) {
            _hashCode += getLeaseInfo().hashCode();
        }
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
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
        new org.apache.axis.description.TypeDesc(WSCredentialAttributes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSCredentialAttributes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leaseInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "leaseInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSLeaseInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSAttribute"));
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

}
