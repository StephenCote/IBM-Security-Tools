/**
 * WSRFIWrapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSRFIWrapper  implements java.io.Serializable {
    private com.ibm.itim.ws.model.WSAttribute[] wsAttrValues;

    private java.lang.String objectProfile;

    private long assignmentId;

    public WSRFIWrapper() {
    }

    public WSRFIWrapper(
           com.ibm.itim.ws.model.WSAttribute[] wsAttrValues,
           java.lang.String objectProfile,
           long assignmentId) {
           this.wsAttrValues = wsAttrValues;
           this.objectProfile = objectProfile;
           this.assignmentId = assignmentId;
    }


    /**
     * Gets the wsAttrValues value for this WSRFIWrapper.
     * 
     * @return wsAttrValues
     */
    public com.ibm.itim.ws.model.WSAttribute[] getWsAttrValues() {
        return wsAttrValues;
    }


    /**
     * Sets the wsAttrValues value for this WSRFIWrapper.
     * 
     * @param wsAttrValues
     */
    public void setWsAttrValues(com.ibm.itim.ws.model.WSAttribute[] wsAttrValues) {
        this.wsAttrValues = wsAttrValues;
    }


    /**
     * Gets the objectProfile value for this WSRFIWrapper.
     * 
     * @return objectProfile
     */
    public java.lang.String getObjectProfile() {
        return objectProfile;
    }


    /**
     * Sets the objectProfile value for this WSRFIWrapper.
     * 
     * @param objectProfile
     */
    public void setObjectProfile(java.lang.String objectProfile) {
        this.objectProfile = objectProfile;
    }


    /**
     * Gets the assignmentId value for this WSRFIWrapper.
     * 
     * @return assignmentId
     */
    public long getAssignmentId() {
        return assignmentId;
    }


    /**
     * Sets the assignmentId value for this WSRFIWrapper.
     * 
     * @param assignmentId
     */
    public void setAssignmentId(long assignmentId) {
        this.assignmentId = assignmentId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSRFIWrapper)) return false;
        WSRFIWrapper other = (WSRFIWrapper) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsAttrValues==null && other.getWsAttrValues()==null) || 
             (this.wsAttrValues!=null &&
              java.util.Arrays.equals(this.wsAttrValues, other.getWsAttrValues()))) &&
            ((this.objectProfile==null && other.getObjectProfile()==null) || 
             (this.objectProfile!=null &&
              this.objectProfile.equals(other.getObjectProfile()))) &&
            this.assignmentId == other.getAssignmentId();
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
        if (getWsAttrValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWsAttrValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWsAttrValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getObjectProfile() != null) {
            _hashCode += getObjectProfile().hashCode();
        }
        _hashCode += new Long(getAssignmentId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSRFIWrapper.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSRFIWrapper"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsAttrValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "wsAttrValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSAttribute"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "objectProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "assignmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
