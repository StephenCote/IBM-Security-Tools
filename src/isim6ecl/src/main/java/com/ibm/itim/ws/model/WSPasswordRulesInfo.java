/**
 * WSPasswordRulesInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSPasswordRulesInfo  implements java.io.Serializable {
    private boolean allowUserName;

    private java.lang.String requiredChars;

    private int minDistinctCharacters;

    private int minLength;

    private int reversedHistoryLength;

    private long maxValidityPeriod;

    private boolean allowUserIDCaseInsensitive;

    private boolean allowUserID;

    private int maxSequentialCharacters;

    private int maxLength;

    private int minAlphabeticCharacters;

    private java.lang.String restrictedToChars;

    private java.util.HashMap customRules;

    private java.lang.String invalidChars;

    private java.lang.String startsWithChars;

    private int minDigitCharacters;

    private long minValidityPeriod;

    private boolean allowInDictionary;

    private boolean allowUserNameCaseInsensitive;

    private int repeatedHistoryLength;

    public WSPasswordRulesInfo() {
    }

    public WSPasswordRulesInfo(
           boolean allowUserName,
           java.lang.String requiredChars,
           int minDistinctCharacters,
           int minLength,
           int reversedHistoryLength,
           long maxValidityPeriod,
           boolean allowUserIDCaseInsensitive,
           boolean allowUserID,
           int maxSequentialCharacters,
           int maxLength,
           int minAlphabeticCharacters,
           java.lang.String restrictedToChars,
           java.util.HashMap customRules,
           java.lang.String invalidChars,
           java.lang.String startsWithChars,
           int minDigitCharacters,
           long minValidityPeriod,
           boolean allowInDictionary,
           boolean allowUserNameCaseInsensitive,
           int repeatedHistoryLength) {
           this.allowUserName = allowUserName;
           this.requiredChars = requiredChars;
           this.minDistinctCharacters = minDistinctCharacters;
           this.minLength = minLength;
           this.reversedHistoryLength = reversedHistoryLength;
           this.maxValidityPeriod = maxValidityPeriod;
           this.allowUserIDCaseInsensitive = allowUserIDCaseInsensitive;
           this.allowUserID = allowUserID;
           this.maxSequentialCharacters = maxSequentialCharacters;
           this.maxLength = maxLength;
           this.minAlphabeticCharacters = minAlphabeticCharacters;
           this.restrictedToChars = restrictedToChars;
           this.customRules = customRules;
           this.invalidChars = invalidChars;
           this.startsWithChars = startsWithChars;
           this.minDigitCharacters = minDigitCharacters;
           this.minValidityPeriod = minValidityPeriod;
           this.allowInDictionary = allowInDictionary;
           this.allowUserNameCaseInsensitive = allowUserNameCaseInsensitive;
           this.repeatedHistoryLength = repeatedHistoryLength;
    }


    /**
     * Gets the allowUserName value for this WSPasswordRulesInfo.
     * 
     * @return allowUserName
     */
    public boolean isAllowUserName() {
        return allowUserName;
    }


    /**
     * Sets the allowUserName value for this WSPasswordRulesInfo.
     * 
     * @param allowUserName
     */
    public void setAllowUserName(boolean allowUserName) {
        this.allowUserName = allowUserName;
    }


    /**
     * Gets the requiredChars value for this WSPasswordRulesInfo.
     * 
     * @return requiredChars
     */
    public java.lang.String getRequiredChars() {
        return requiredChars;
    }


    /**
     * Sets the requiredChars value for this WSPasswordRulesInfo.
     * 
     * @param requiredChars
     */
    public void setRequiredChars(java.lang.String requiredChars) {
        this.requiredChars = requiredChars;
    }


    /**
     * Gets the minDistinctCharacters value for this WSPasswordRulesInfo.
     * 
     * @return minDistinctCharacters
     */
    public int getMinDistinctCharacters() {
        return minDistinctCharacters;
    }


    /**
     * Sets the minDistinctCharacters value for this WSPasswordRulesInfo.
     * 
     * @param minDistinctCharacters
     */
    public void setMinDistinctCharacters(int minDistinctCharacters) {
        this.minDistinctCharacters = minDistinctCharacters;
    }


    /**
     * Gets the minLength value for this WSPasswordRulesInfo.
     * 
     * @return minLength
     */
    public int getMinLength() {
        return minLength;
    }


    /**
     * Sets the minLength value for this WSPasswordRulesInfo.
     * 
     * @param minLength
     */
    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }


    /**
     * Gets the reversedHistoryLength value for this WSPasswordRulesInfo.
     * 
     * @return reversedHistoryLength
     */
    public int getReversedHistoryLength() {
        return reversedHistoryLength;
    }


    /**
     * Sets the reversedHistoryLength value for this WSPasswordRulesInfo.
     * 
     * @param reversedHistoryLength
     */
    public void setReversedHistoryLength(int reversedHistoryLength) {
        this.reversedHistoryLength = reversedHistoryLength;
    }


    /**
     * Gets the maxValidityPeriod value for this WSPasswordRulesInfo.
     * 
     * @return maxValidityPeriod
     */
    public long getMaxValidityPeriod() {
        return maxValidityPeriod;
    }


    /**
     * Sets the maxValidityPeriod value for this WSPasswordRulesInfo.
     * 
     * @param maxValidityPeriod
     */
    public void setMaxValidityPeriod(long maxValidityPeriod) {
        this.maxValidityPeriod = maxValidityPeriod;
    }


    /**
     * Gets the allowUserIDCaseInsensitive value for this WSPasswordRulesInfo.
     * 
     * @return allowUserIDCaseInsensitive
     */
    public boolean isAllowUserIDCaseInsensitive() {
        return allowUserIDCaseInsensitive;
    }


    /**
     * Sets the allowUserIDCaseInsensitive value for this WSPasswordRulesInfo.
     * 
     * @param allowUserIDCaseInsensitive
     */
    public void setAllowUserIDCaseInsensitive(boolean allowUserIDCaseInsensitive) {
        this.allowUserIDCaseInsensitive = allowUserIDCaseInsensitive;
    }


    /**
     * Gets the allowUserID value for this WSPasswordRulesInfo.
     * 
     * @return allowUserID
     */
    public boolean isAllowUserID() {
        return allowUserID;
    }


    /**
     * Sets the allowUserID value for this WSPasswordRulesInfo.
     * 
     * @param allowUserID
     */
    public void setAllowUserID(boolean allowUserID) {
        this.allowUserID = allowUserID;
    }


    /**
     * Gets the maxSequentialCharacters value for this WSPasswordRulesInfo.
     * 
     * @return maxSequentialCharacters
     */
    public int getMaxSequentialCharacters() {
        return maxSequentialCharacters;
    }


    /**
     * Sets the maxSequentialCharacters value for this WSPasswordRulesInfo.
     * 
     * @param maxSequentialCharacters
     */
    public void setMaxSequentialCharacters(int maxSequentialCharacters) {
        this.maxSequentialCharacters = maxSequentialCharacters;
    }


    /**
     * Gets the maxLength value for this WSPasswordRulesInfo.
     * 
     * @return maxLength
     */
    public int getMaxLength() {
        return maxLength;
    }


    /**
     * Sets the maxLength value for this WSPasswordRulesInfo.
     * 
     * @param maxLength
     */
    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }


    /**
     * Gets the minAlphabeticCharacters value for this WSPasswordRulesInfo.
     * 
     * @return minAlphabeticCharacters
     */
    public int getMinAlphabeticCharacters() {
        return minAlphabeticCharacters;
    }


    /**
     * Sets the minAlphabeticCharacters value for this WSPasswordRulesInfo.
     * 
     * @param minAlphabeticCharacters
     */
    public void setMinAlphabeticCharacters(int minAlphabeticCharacters) {
        this.minAlphabeticCharacters = minAlphabeticCharacters;
    }


    /**
     * Gets the restrictedToChars value for this WSPasswordRulesInfo.
     * 
     * @return restrictedToChars
     */
    public java.lang.String getRestrictedToChars() {
        return restrictedToChars;
    }


    /**
     * Sets the restrictedToChars value for this WSPasswordRulesInfo.
     * 
     * @param restrictedToChars
     */
    public void setRestrictedToChars(java.lang.String restrictedToChars) {
        this.restrictedToChars = restrictedToChars;
    }


    /**
     * Gets the customRules value for this WSPasswordRulesInfo.
     * 
     * @return customRules
     */
    public java.util.HashMap getCustomRules() {
        return customRules;
    }


    /**
     * Sets the customRules value for this WSPasswordRulesInfo.
     * 
     * @param customRules
     */
    public void setCustomRules(java.util.HashMap customRules) {
        this.customRules = customRules;
    }


    /**
     * Gets the invalidChars value for this WSPasswordRulesInfo.
     * 
     * @return invalidChars
     */
    public java.lang.String getInvalidChars() {
        return invalidChars;
    }


    /**
     * Sets the invalidChars value for this WSPasswordRulesInfo.
     * 
     * @param invalidChars
     */
    public void setInvalidChars(java.lang.String invalidChars) {
        this.invalidChars = invalidChars;
    }


    /**
     * Gets the startsWithChars value for this WSPasswordRulesInfo.
     * 
     * @return startsWithChars
     */
    public java.lang.String getStartsWithChars() {
        return startsWithChars;
    }


    /**
     * Sets the startsWithChars value for this WSPasswordRulesInfo.
     * 
     * @param startsWithChars
     */
    public void setStartsWithChars(java.lang.String startsWithChars) {
        this.startsWithChars = startsWithChars;
    }


    /**
     * Gets the minDigitCharacters value for this WSPasswordRulesInfo.
     * 
     * @return minDigitCharacters
     */
    public int getMinDigitCharacters() {
        return minDigitCharacters;
    }


    /**
     * Sets the minDigitCharacters value for this WSPasswordRulesInfo.
     * 
     * @param minDigitCharacters
     */
    public void setMinDigitCharacters(int minDigitCharacters) {
        this.minDigitCharacters = minDigitCharacters;
    }


    /**
     * Gets the minValidityPeriod value for this WSPasswordRulesInfo.
     * 
     * @return minValidityPeriod
     */
    public long getMinValidityPeriod() {
        return minValidityPeriod;
    }


    /**
     * Sets the minValidityPeriod value for this WSPasswordRulesInfo.
     * 
     * @param minValidityPeriod
     */
    public void setMinValidityPeriod(long minValidityPeriod) {
        this.minValidityPeriod = minValidityPeriod;
    }


    /**
     * Gets the allowInDictionary value for this WSPasswordRulesInfo.
     * 
     * @return allowInDictionary
     */
    public boolean isAllowInDictionary() {
        return allowInDictionary;
    }


    /**
     * Sets the allowInDictionary value for this WSPasswordRulesInfo.
     * 
     * @param allowInDictionary
     */
    public void setAllowInDictionary(boolean allowInDictionary) {
        this.allowInDictionary = allowInDictionary;
    }


    /**
     * Gets the allowUserNameCaseInsensitive value for this WSPasswordRulesInfo.
     * 
     * @return allowUserNameCaseInsensitive
     */
    public boolean isAllowUserNameCaseInsensitive() {
        return allowUserNameCaseInsensitive;
    }


    /**
     * Sets the allowUserNameCaseInsensitive value for this WSPasswordRulesInfo.
     * 
     * @param allowUserNameCaseInsensitive
     */
    public void setAllowUserNameCaseInsensitive(boolean allowUserNameCaseInsensitive) {
        this.allowUserNameCaseInsensitive = allowUserNameCaseInsensitive;
    }


    /**
     * Gets the repeatedHistoryLength value for this WSPasswordRulesInfo.
     * 
     * @return repeatedHistoryLength
     */
    public int getRepeatedHistoryLength() {
        return repeatedHistoryLength;
    }


    /**
     * Sets the repeatedHistoryLength value for this WSPasswordRulesInfo.
     * 
     * @param repeatedHistoryLength
     */
    public void setRepeatedHistoryLength(int repeatedHistoryLength) {
        this.repeatedHistoryLength = repeatedHistoryLength;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPasswordRulesInfo)) return false;
        WSPasswordRulesInfo other = (WSPasswordRulesInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.allowUserName == other.isAllowUserName() &&
            ((this.requiredChars==null && other.getRequiredChars()==null) || 
             (this.requiredChars!=null &&
              this.requiredChars.equals(other.getRequiredChars()))) &&
            this.minDistinctCharacters == other.getMinDistinctCharacters() &&
            this.minLength == other.getMinLength() &&
            this.reversedHistoryLength == other.getReversedHistoryLength() &&
            this.maxValidityPeriod == other.getMaxValidityPeriod() &&
            this.allowUserIDCaseInsensitive == other.isAllowUserIDCaseInsensitive() &&
            this.allowUserID == other.isAllowUserID() &&
            this.maxSequentialCharacters == other.getMaxSequentialCharacters() &&
            this.maxLength == other.getMaxLength() &&
            this.minAlphabeticCharacters == other.getMinAlphabeticCharacters() &&
            ((this.restrictedToChars==null && other.getRestrictedToChars()==null) || 
             (this.restrictedToChars!=null &&
              this.restrictedToChars.equals(other.getRestrictedToChars()))) &&
            ((this.customRules==null && other.getCustomRules()==null) || 
             (this.customRules!=null &&
              this.customRules.equals(other.getCustomRules()))) &&
            ((this.invalidChars==null && other.getInvalidChars()==null) || 
             (this.invalidChars!=null &&
              this.invalidChars.equals(other.getInvalidChars()))) &&
            ((this.startsWithChars==null && other.getStartsWithChars()==null) || 
             (this.startsWithChars!=null &&
              this.startsWithChars.equals(other.getStartsWithChars()))) &&
            this.minDigitCharacters == other.getMinDigitCharacters() &&
            this.minValidityPeriod == other.getMinValidityPeriod() &&
            this.allowInDictionary == other.isAllowInDictionary() &&
            this.allowUserNameCaseInsensitive == other.isAllowUserNameCaseInsensitive() &&
            this.repeatedHistoryLength == other.getRepeatedHistoryLength();
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
        _hashCode += (isAllowUserName() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRequiredChars() != null) {
            _hashCode += getRequiredChars().hashCode();
        }
        _hashCode += getMinDistinctCharacters();
        _hashCode += getMinLength();
        _hashCode += getReversedHistoryLength();
        _hashCode += new Long(getMaxValidityPeriod()).hashCode();
        _hashCode += (isAllowUserIDCaseInsensitive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowUserID() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getMaxSequentialCharacters();
        _hashCode += getMaxLength();
        _hashCode += getMinAlphabeticCharacters();
        if (getRestrictedToChars() != null) {
            _hashCode += getRestrictedToChars().hashCode();
        }
        if (getCustomRules() != null) {
            _hashCode += getCustomRules().hashCode();
        }
        if (getInvalidChars() != null) {
            _hashCode += getInvalidChars().hashCode();
        }
        if (getStartsWithChars() != null) {
            _hashCode += getStartsWithChars().hashCode();
        }
        _hashCode += getMinDigitCharacters();
        _hashCode += new Long(getMinValidityPeriod()).hashCode();
        _hashCode += (isAllowInDictionary() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowUserNameCaseInsensitive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getRepeatedHistoryLength();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPasswordRulesInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSPasswordRulesInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "allowUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredChars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "requiredChars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minDistinctCharacters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "minDistinctCharacters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "minLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversedHistoryLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "reversedHistoryLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxValidityPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "maxValidityPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowUserIDCaseInsensitive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "allowUserIDCaseInsensitive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "allowUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSequentialCharacters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "maxSequentialCharacters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "maxLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minAlphabeticCharacters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "minAlphabeticCharacters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictedToChars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "restrictedToChars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "customRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidChars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "invalidChars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startsWithChars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "startsWithChars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minDigitCharacters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "minDigitCharacters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minValidityPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "minValidityPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowInDictionary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "allowInDictionary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowUserNameCaseInsensitive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "allowUserNameCaseInsensitive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeatedHistoryLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "repeatedHistoryLength"));
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
