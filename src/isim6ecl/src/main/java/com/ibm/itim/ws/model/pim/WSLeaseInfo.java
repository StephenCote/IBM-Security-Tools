/**
 * WSLeaseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model.pim;

public class WSLeaseInfo  implements java.io.Serializable {
    private java.util.Calendar expiration;

    private java.lang.String leaseDN;

    public WSLeaseInfo() {
    }

    public WSLeaseInfo(
           java.util.Calendar expiration,
           java.lang.String leaseDN) {
           this.expiration = expiration;
           this.leaseDN = leaseDN;
    }


    /**
     * Gets the expiration value for this WSLeaseInfo.
     * 
     * @return expiration
     */
    public java.util.Calendar getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this WSLeaseInfo.
     * 
     * @param expiration
     */
    public void setExpiration(java.util.Calendar expiration) {
        this.expiration = expiration;
    }


    /**
     * Gets the leaseDN value for this WSLeaseInfo.
     * 
     * @return leaseDN
     */
    public java.lang.String getLeaseDN() {
        return leaseDN;
    }


    /**
     * Sets the leaseDN value for this WSLeaseInfo.
     * 
     * @param leaseDN
     */
    public void setLeaseDN(java.lang.String leaseDN) {
        this.leaseDN = leaseDN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSLeaseInfo)) return false;
        WSLeaseInfo other = (WSLeaseInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.expiration==null && other.getExpiration()==null) || 
             (this.expiration!=null &&
              this.expiration.equals(other.getExpiration()))) &&
            ((this.leaseDN==null && other.getLeaseDN()==null) || 
             (this.leaseDN!=null &&
              this.leaseDN.equals(other.getLeaseDN())));
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
        if (getExpiration() != null) {
            _hashCode += getExpiration().hashCode();
        }
        if (getLeaseDN() != null) {
            _hashCode += getLeaseDN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSLeaseInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSLeaseInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leaseDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "leaseDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
