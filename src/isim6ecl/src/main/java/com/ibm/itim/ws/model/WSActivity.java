/**
 * WSActivity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSActivity  implements java.io.Serializable {
    private java.util.Calendar timeCompleted;

    private java.lang.String result;

    private java.lang.String description;

    private long id;

    private java.lang.String designId;

    private java.util.Calendar timeStarted;

    private int index;

    private java.lang.String state;

    private java.lang.String resultDetail;

    private java.lang.String name;

    private java.lang.String activitySubType;

    private long subProcessId;

    private long processId;

    private java.lang.String activityType;

    public WSActivity() {
    }

    public WSActivity(
           java.util.Calendar timeCompleted,
           java.lang.String result,
           java.lang.String description,
           long id,
           java.lang.String designId,
           java.util.Calendar timeStarted,
           int index,
           java.lang.String state,
           java.lang.String resultDetail,
           java.lang.String name,
           java.lang.String activitySubType,
           long subProcessId,
           long processId,
           java.lang.String activityType) {
           this.timeCompleted = timeCompleted;
           this.result = result;
           this.description = description;
           this.id = id;
           this.designId = designId;
           this.timeStarted = timeStarted;
           this.index = index;
           this.state = state;
           this.resultDetail = resultDetail;
           this.name = name;
           this.activitySubType = activitySubType;
           this.subProcessId = subProcessId;
           this.processId = processId;
           this.activityType = activityType;
    }


    /**
     * Gets the timeCompleted value for this WSActivity.
     * 
     * @return timeCompleted
     */
    public java.util.Calendar getTimeCompleted() {
        return timeCompleted;
    }


    /**
     * Sets the timeCompleted value for this WSActivity.
     * 
     * @param timeCompleted
     */
    public void setTimeCompleted(java.util.Calendar timeCompleted) {
        this.timeCompleted = timeCompleted;
    }


    /**
     * Gets the result value for this WSActivity.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this WSActivity.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the description value for this WSActivity.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSActivity.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the id value for this WSActivity.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this WSActivity.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the designId value for this WSActivity.
     * 
     * @return designId
     */
    public java.lang.String getDesignId() {
        return designId;
    }


    /**
     * Sets the designId value for this WSActivity.
     * 
     * @param designId
     */
    public void setDesignId(java.lang.String designId) {
        this.designId = designId;
    }


    /**
     * Gets the timeStarted value for this WSActivity.
     * 
     * @return timeStarted
     */
    public java.util.Calendar getTimeStarted() {
        return timeStarted;
    }


    /**
     * Sets the timeStarted value for this WSActivity.
     * 
     * @param timeStarted
     */
    public void setTimeStarted(java.util.Calendar timeStarted) {
        this.timeStarted = timeStarted;
    }


    /**
     * Gets the index value for this WSActivity.
     * 
     * @return index
     */
    public int getIndex() {
        return index;
    }


    /**
     * Sets the index value for this WSActivity.
     * 
     * @param index
     */
    public void setIndex(int index) {
        this.index = index;
    }


    /**
     * Gets the state value for this WSActivity.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this WSActivity.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the resultDetail value for this WSActivity.
     * 
     * @return resultDetail
     */
    public java.lang.String getResultDetail() {
        return resultDetail;
    }


    /**
     * Sets the resultDetail value for this WSActivity.
     * 
     * @param resultDetail
     */
    public void setResultDetail(java.lang.String resultDetail) {
        this.resultDetail = resultDetail;
    }


    /**
     * Gets the name value for this WSActivity.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WSActivity.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the activitySubType value for this WSActivity.
     * 
     * @return activitySubType
     */
    public java.lang.String getActivitySubType() {
        return activitySubType;
    }


    /**
     * Sets the activitySubType value for this WSActivity.
     * 
     * @param activitySubType
     */
    public void setActivitySubType(java.lang.String activitySubType) {
        this.activitySubType = activitySubType;
    }


    /**
     * Gets the subProcessId value for this WSActivity.
     * 
     * @return subProcessId
     */
    public long getSubProcessId() {
        return subProcessId;
    }


    /**
     * Sets the subProcessId value for this WSActivity.
     * 
     * @param subProcessId
     */
    public void setSubProcessId(long subProcessId) {
        this.subProcessId = subProcessId;
    }


    /**
     * Gets the processId value for this WSActivity.
     * 
     * @return processId
     */
    public long getProcessId() {
        return processId;
    }


    /**
     * Sets the processId value for this WSActivity.
     * 
     * @param processId
     */
    public void setProcessId(long processId) {
        this.processId = processId;
    }


    /**
     * Gets the activityType value for this WSActivity.
     * 
     * @return activityType
     */
    public java.lang.String getActivityType() {
        return activityType;
    }


    /**
     * Sets the activityType value for this WSActivity.
     * 
     * @param activityType
     */
    public void setActivityType(java.lang.String activityType) {
        this.activityType = activityType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSActivity)) return false;
        WSActivity other = (WSActivity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timeCompleted==null && other.getTimeCompleted()==null) || 
             (this.timeCompleted!=null &&
              this.timeCompleted.equals(other.getTimeCompleted()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.id == other.getId() &&
            ((this.designId==null && other.getDesignId()==null) || 
             (this.designId!=null &&
              this.designId.equals(other.getDesignId()))) &&
            ((this.timeStarted==null && other.getTimeStarted()==null) || 
             (this.timeStarted!=null &&
              this.timeStarted.equals(other.getTimeStarted()))) &&
            this.index == other.getIndex() &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.resultDetail==null && other.getResultDetail()==null) || 
             (this.resultDetail!=null &&
              this.resultDetail.equals(other.getResultDetail()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.activitySubType==null && other.getActivitySubType()==null) || 
             (this.activitySubType!=null &&
              this.activitySubType.equals(other.getActivitySubType()))) &&
            this.subProcessId == other.getSubProcessId() &&
            this.processId == other.getProcessId() &&
            ((this.activityType==null && other.getActivityType()==null) || 
             (this.activityType!=null &&
              this.activityType.equals(other.getActivityType())));
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
        if (getTimeCompleted() != null) {
            _hashCode += getTimeCompleted().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getDesignId() != null) {
            _hashCode += getDesignId().hashCode();
        }
        if (getTimeStarted() != null) {
            _hashCode += getTimeStarted().hashCode();
        }
        _hashCode += getIndex();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getResultDetail() != null) {
            _hashCode += getResultDetail().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getActivitySubType() != null) {
            _hashCode += getActivitySubType().hashCode();
        }
        _hashCode += new Long(getSubProcessId()).hashCode();
        _hashCode += new Long(getProcessId()).hashCode();
        if (getActivityType() != null) {
            _hashCode += getActivityType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSActivity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSActivity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "timeCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "designId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStarted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "timeStarted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "index"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "resultDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activitySubType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "activitySubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subProcessId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "subProcessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "processId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "activityType"));
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
