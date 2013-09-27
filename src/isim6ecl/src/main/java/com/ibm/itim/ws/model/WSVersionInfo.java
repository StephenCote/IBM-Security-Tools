/**
 * WSVersionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSVersionInfo  implements java.io.Serializable {
    private java.lang.String buildNumber;

    private java.lang.String fixPackLevel;

    private java.lang.String buildDate;

    private java.lang.String buildTime;

    private java.lang.String version;

    public WSVersionInfo() {
    }

    public WSVersionInfo(
           java.lang.String buildNumber,
           java.lang.String fixPackLevel,
           java.lang.String buildDate,
           java.lang.String buildTime,
           java.lang.String version) {
           this.buildNumber = buildNumber;
           this.fixPackLevel = fixPackLevel;
           this.buildDate = buildDate;
           this.buildTime = buildTime;
           this.version = version;
    }


    /**
     * Gets the buildNumber value for this WSVersionInfo.
     * 
     * @return buildNumber
     */
    public java.lang.String getBuildNumber() {
        return buildNumber;
    }


    /**
     * Sets the buildNumber value for this WSVersionInfo.
     * 
     * @param buildNumber
     */
    public void setBuildNumber(java.lang.String buildNumber) {
        this.buildNumber = buildNumber;
    }


    /**
     * Gets the fixPackLevel value for this WSVersionInfo.
     * 
     * @return fixPackLevel
     */
    public java.lang.String getFixPackLevel() {
        return fixPackLevel;
    }


    /**
     * Sets the fixPackLevel value for this WSVersionInfo.
     * 
     * @param fixPackLevel
     */
    public void setFixPackLevel(java.lang.String fixPackLevel) {
        this.fixPackLevel = fixPackLevel;
    }


    /**
     * Gets the buildDate value for this WSVersionInfo.
     * 
     * @return buildDate
     */
    public java.lang.String getBuildDate() {
        return buildDate;
    }


    /**
     * Sets the buildDate value for this WSVersionInfo.
     * 
     * @param buildDate
     */
    public void setBuildDate(java.lang.String buildDate) {
        this.buildDate = buildDate;
    }


    /**
     * Gets the buildTime value for this WSVersionInfo.
     * 
     * @return buildTime
     */
    public java.lang.String getBuildTime() {
        return buildTime;
    }


    /**
     * Sets the buildTime value for this WSVersionInfo.
     * 
     * @param buildTime
     */
    public void setBuildTime(java.lang.String buildTime) {
        this.buildTime = buildTime;
    }


    /**
     * Gets the version value for this WSVersionInfo.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this WSVersionInfo.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSVersionInfo)) return false;
        WSVersionInfo other = (WSVersionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.buildNumber==null && other.getBuildNumber()==null) || 
             (this.buildNumber!=null &&
              this.buildNumber.equals(other.getBuildNumber()))) &&
            ((this.fixPackLevel==null && other.getFixPackLevel()==null) || 
             (this.fixPackLevel!=null &&
              this.fixPackLevel.equals(other.getFixPackLevel()))) &&
            ((this.buildDate==null && other.getBuildDate()==null) || 
             (this.buildDate!=null &&
              this.buildDate.equals(other.getBuildDate()))) &&
            ((this.buildTime==null && other.getBuildTime()==null) || 
             (this.buildTime!=null &&
              this.buildTime.equals(other.getBuildTime()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
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
        if (getBuildNumber() != null) {
            _hashCode += getBuildNumber().hashCode();
        }
        if (getFixPackLevel() != null) {
            _hashCode += getFixPackLevel().hashCode();
        }
        if (getBuildDate() != null) {
            _hashCode += getBuildDate().hashCode();
        }
        if (getBuildTime() != null) {
            _hashCode += getBuildTime().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSVersionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSVersionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "buildNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixPackLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "fixPackLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "buildDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "buildTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "version"));
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
