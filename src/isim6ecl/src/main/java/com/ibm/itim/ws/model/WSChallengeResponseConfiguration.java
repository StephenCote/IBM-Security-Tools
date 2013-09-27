/**
 * WSChallengeResponseConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSChallengeResponseConfiguration  implements java.io.Serializable {
    private com.ibm.itim.ws.model.WSChallenge[] adminChallenges;

    private boolean userDefined;

    private boolean challengeResponseEnabled;

    private int numberRequiredChallenges;

    public WSChallengeResponseConfiguration() {
    }

    public WSChallengeResponseConfiguration(
           com.ibm.itim.ws.model.WSChallenge[] adminChallenges,
           boolean userDefined,
           boolean challengeResponseEnabled,
           int numberRequiredChallenges) {
           this.adminChallenges = adminChallenges;
           this.userDefined = userDefined;
           this.challengeResponseEnabled = challengeResponseEnabled;
           this.numberRequiredChallenges = numberRequiredChallenges;
    }


    /**
     * Gets the adminChallenges value for this WSChallengeResponseConfiguration.
     * 
     * @return adminChallenges
     */
    public com.ibm.itim.ws.model.WSChallenge[] getAdminChallenges() {
        return adminChallenges;
    }


    /**
     * Sets the adminChallenges value for this WSChallengeResponseConfiguration.
     * 
     * @param adminChallenges
     */
    public void setAdminChallenges(com.ibm.itim.ws.model.WSChallenge[] adminChallenges) {
        this.adminChallenges = adminChallenges;
    }


    /**
     * Gets the userDefined value for this WSChallengeResponseConfiguration.
     * 
     * @return userDefined
     */
    public boolean isUserDefined() {
        return userDefined;
    }


    /**
     * Sets the userDefined value for this WSChallengeResponseConfiguration.
     * 
     * @param userDefined
     */
    public void setUserDefined(boolean userDefined) {
        this.userDefined = userDefined;
    }


    /**
     * Gets the challengeResponseEnabled value for this WSChallengeResponseConfiguration.
     * 
     * @return challengeResponseEnabled
     */
    public boolean isChallengeResponseEnabled() {
        return challengeResponseEnabled;
    }


    /**
     * Sets the challengeResponseEnabled value for this WSChallengeResponseConfiguration.
     * 
     * @param challengeResponseEnabled
     */
    public void setChallengeResponseEnabled(boolean challengeResponseEnabled) {
        this.challengeResponseEnabled = challengeResponseEnabled;
    }


    /**
     * Gets the numberRequiredChallenges value for this WSChallengeResponseConfiguration.
     * 
     * @return numberRequiredChallenges
     */
    public int getNumberRequiredChallenges() {
        return numberRequiredChallenges;
    }


    /**
     * Sets the numberRequiredChallenges value for this WSChallengeResponseConfiguration.
     * 
     * @param numberRequiredChallenges
     */
    public void setNumberRequiredChallenges(int numberRequiredChallenges) {
        this.numberRequiredChallenges = numberRequiredChallenges;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSChallengeResponseConfiguration)) return false;
        WSChallengeResponseConfiguration other = (WSChallengeResponseConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adminChallenges==null && other.getAdminChallenges()==null) || 
             (this.adminChallenges!=null &&
              java.util.Arrays.equals(this.adminChallenges, other.getAdminChallenges()))) &&
            this.userDefined == other.isUserDefined() &&
            this.challengeResponseEnabled == other.isChallengeResponseEnabled() &&
            this.numberRequiredChallenges == other.getNumberRequiredChallenges();
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
        if (getAdminChallenges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdminChallenges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdminChallenges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isUserDefined() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isChallengeResponseEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getNumberRequiredChallenges();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSChallengeResponseConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSChallengeResponseConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminChallenges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "adminChallenges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSChallenge"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "userDefined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeResponseEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "challengeResponseEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberRequiredChallenges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "numberRequiredChallenges"));
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
