/**
 * WSServiceAttributeParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSServiceAttributeParameter  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String[] values;

    private int[] expressionTypes;

    private int[] enforcementTypes;

    public WSServiceAttributeParameter() {
    }

    public WSServiceAttributeParameter(
           java.lang.String name,
           java.lang.String[] values,
           int[] expressionTypes,
           int[] enforcementTypes) {
           this.name = name;
           this.values = values;
           this.expressionTypes = expressionTypes;
           this.enforcementTypes = enforcementTypes;
    }


    /**
     * Gets the name value for this WSServiceAttributeParameter.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WSServiceAttributeParameter.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the values value for this WSServiceAttributeParameter.
     * 
     * @return values
     */
    public java.lang.String[] getValues() {
        return values;
    }


    /**
     * Sets the values value for this WSServiceAttributeParameter.
     * 
     * @param values
     */
    public void setValues(java.lang.String[] values) {
        this.values = values;
    }


    /**
     * Gets the expressionTypes value for this WSServiceAttributeParameter.
     * 
     * @return expressionTypes
     */
    public int[] getExpressionTypes() {
        return expressionTypes;
    }


    /**
     * Sets the expressionTypes value for this WSServiceAttributeParameter.
     * 
     * @param expressionTypes
     */
    public void setExpressionTypes(int[] expressionTypes) {
        this.expressionTypes = expressionTypes;
    }


    /**
     * Gets the enforcementTypes value for this WSServiceAttributeParameter.
     * 
     * @return enforcementTypes
     */
    public int[] getEnforcementTypes() {
        return enforcementTypes;
    }


    /**
     * Sets the enforcementTypes value for this WSServiceAttributeParameter.
     * 
     * @param enforcementTypes
     */
    public void setEnforcementTypes(int[] enforcementTypes) {
        this.enforcementTypes = enforcementTypes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSServiceAttributeParameter)) return false;
        WSServiceAttributeParameter other = (WSServiceAttributeParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              java.util.Arrays.equals(this.values, other.getValues()))) &&
            ((this.expressionTypes==null && other.getExpressionTypes()==null) || 
             (this.expressionTypes!=null &&
              java.util.Arrays.equals(this.expressionTypes, other.getExpressionTypes()))) &&
            ((this.enforcementTypes==null && other.getEnforcementTypes()==null) || 
             (this.enforcementTypes!=null &&
              java.util.Arrays.equals(this.enforcementTypes, other.getEnforcementTypes())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpressionTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpressionTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpressionTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnforcementTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnforcementTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnforcementTypes(), i);
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
        new org.apache.axis.description.TypeDesc(WSServiceAttributeParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSServiceAttributeParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("values");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "values"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressionTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "expressionTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enforcementTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "enforcementTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
