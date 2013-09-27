/**
 * WSSession.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSSession  implements java.io.Serializable {
    private java.lang.String clientSession;

    private boolean enforceChallengeResponse;

    private com.ibm.itim.ws.model.WSLocale locale;

    private long sessionID;

    public WSSession() {
    }

    public WSSession(
           java.lang.String clientSession,
           boolean enforceChallengeResponse,
           com.ibm.itim.ws.model.WSLocale locale,
           long sessionID) {
           this.clientSession = clientSession;
           this.enforceChallengeResponse = enforceChallengeResponse;
           this.locale = locale;
           this.sessionID = sessionID;
    }


    /**
     * Gets the clientSession value for this WSSession.
     * 
     * @return clientSession
     */
    public java.lang.String getClientSession() {
        return clientSession;
    }


    /**
     * Sets the clientSession value for this WSSession.
     * 
     * @param clientSession
     */
    public void setClientSession(java.lang.String clientSession) {
        this.clientSession = clientSession;
    }


    /**
     * Gets the enforceChallengeResponse value for this WSSession.
     * 
     * @return enforceChallengeResponse
     */
    public boolean isEnforceChallengeResponse() {
        return enforceChallengeResponse;
    }


    /**
     * Sets the enforceChallengeResponse value for this WSSession.
     * 
     * @param enforceChallengeResponse
     */
    public void setEnforceChallengeResponse(boolean enforceChallengeResponse) {
        this.enforceChallengeResponse = enforceChallengeResponse;
    }


    /**
     * Gets the locale value for this WSSession.
     * 
     * @return locale
     */
    public com.ibm.itim.ws.model.WSLocale getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this WSSession.
     * 
     * @param locale
     */
    public void setLocale(com.ibm.itim.ws.model.WSLocale locale) {
        this.locale = locale;
    }


    /**
     * Gets the sessionID value for this WSSession.
     * 
     * @return sessionID
     */
    public long getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this WSSession.
     * 
     * @param sessionID
     */
    public void setSessionID(long sessionID) {
        this.sessionID = sessionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSession)) return false;
        WSSession other = (WSSession) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientSession==null && other.getClientSession()==null) || 
             (this.clientSession!=null &&
              this.clientSession.equals(other.getClientSession()))) &&
            this.enforceChallengeResponse == other.isEnforceChallengeResponse() &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            this.sessionID == other.getSessionID();
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
        if (getClientSession() != null) {
            _hashCode += getClientSession().hashCode();
        }
        _hashCode += (isEnforceChallengeResponse() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        _hashCode += new Long(getSessionID()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSSession.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSession");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "clientSession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enforceChallengeResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "enforceChallengeResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSLocale"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "sessionID"));
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
