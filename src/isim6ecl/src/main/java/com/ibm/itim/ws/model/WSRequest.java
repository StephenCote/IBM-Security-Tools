/**
 * WSRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSRequest  implements java.io.Serializable {
    private java.util.Calendar timeCompleted;

    private java.lang.String subjectProfile;

    private java.lang.String result;

    private boolean select;

    private java.lang.String description;

    private java.lang.String processTypeString;

    private java.lang.String title;

    private java.lang.String owner;

    private java.lang.String processStateString;

    private int status;

    private java.lang.String requestee;

    private java.util.Calendar timeSubmitted;

    private java.lang.String subject;

    private long requestId;

    private java.lang.String processType;

    private java.lang.String subjectService;

    private java.lang.String statusString;

    private java.lang.String processState;

    private java.util.Calendar timeScheduled;

    public WSRequest() {
    }

    public WSRequest(
           java.util.Calendar timeCompleted,
           java.lang.String subjectProfile,
           java.lang.String result,
           boolean select,
           java.lang.String description,
           java.lang.String processTypeString,
           java.lang.String title,
           java.lang.String owner,
           java.lang.String processStateString,
           int status,
           java.lang.String requestee,
           java.util.Calendar timeSubmitted,
           java.lang.String subject,
           long requestId,
           java.lang.String processType,
           java.lang.String subjectService,
           java.lang.String statusString,
           java.lang.String processState,
           java.util.Calendar timeScheduled) {
           this.timeCompleted = timeCompleted;
           this.subjectProfile = subjectProfile;
           this.result = result;
           this.select = select;
           this.description = description;
           this.processTypeString = processTypeString;
           this.title = title;
           this.owner = owner;
           this.processStateString = processStateString;
           this.status = status;
           this.requestee = requestee;
           this.timeSubmitted = timeSubmitted;
           this.subject = subject;
           this.requestId = requestId;
           this.processType = processType;
           this.subjectService = subjectService;
           this.statusString = statusString;
           this.processState = processState;
           this.timeScheduled = timeScheduled;
    }


    /**
     * Gets the timeCompleted value for this WSRequest.
     * 
     * @return timeCompleted
     */
    public java.util.Calendar getTimeCompleted() {
        return timeCompleted;
    }


    /**
     * Sets the timeCompleted value for this WSRequest.
     * 
     * @param timeCompleted
     */
    public void setTimeCompleted(java.util.Calendar timeCompleted) {
        this.timeCompleted = timeCompleted;
    }


    /**
     * Gets the subjectProfile value for this WSRequest.
     * 
     * @return subjectProfile
     */
    public java.lang.String getSubjectProfile() {
        return subjectProfile;
    }


    /**
     * Sets the subjectProfile value for this WSRequest.
     * 
     * @param subjectProfile
     */
    public void setSubjectProfile(java.lang.String subjectProfile) {
        this.subjectProfile = subjectProfile;
    }


    /**
     * Gets the result value for this WSRequest.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this WSRequest.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the select value for this WSRequest.
     * 
     * @return select
     */
    public boolean isSelect() {
        return select;
    }


    /**
     * Sets the select value for this WSRequest.
     * 
     * @param select
     */
    public void setSelect(boolean select) {
        this.select = select;
    }


    /**
     * Gets the description value for this WSRequest.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSRequest.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the processTypeString value for this WSRequest.
     * 
     * @return processTypeString
     */
    public java.lang.String getProcessTypeString() {
        return processTypeString;
    }


    /**
     * Sets the processTypeString value for this WSRequest.
     * 
     * @param processTypeString
     */
    public void setProcessTypeString(java.lang.String processTypeString) {
        this.processTypeString = processTypeString;
    }


    /**
     * Gets the title value for this WSRequest.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this WSRequest.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the owner value for this WSRequest.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this WSRequest.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the processStateString value for this WSRequest.
     * 
     * @return processStateString
     */
    public java.lang.String getProcessStateString() {
        return processStateString;
    }


    /**
     * Sets the processStateString value for this WSRequest.
     * 
     * @param processStateString
     */
    public void setProcessStateString(java.lang.String processStateString) {
        this.processStateString = processStateString;
    }


    /**
     * Gets the status value for this WSRequest.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WSRequest.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the requestee value for this WSRequest.
     * 
     * @return requestee
     */
    public java.lang.String getRequestee() {
        return requestee;
    }


    /**
     * Sets the requestee value for this WSRequest.
     * 
     * @param requestee
     */
    public void setRequestee(java.lang.String requestee) {
        this.requestee = requestee;
    }


    /**
     * Gets the timeSubmitted value for this WSRequest.
     * 
     * @return timeSubmitted
     */
    public java.util.Calendar getTimeSubmitted() {
        return timeSubmitted;
    }


    /**
     * Sets the timeSubmitted value for this WSRequest.
     * 
     * @param timeSubmitted
     */
    public void setTimeSubmitted(java.util.Calendar timeSubmitted) {
        this.timeSubmitted = timeSubmitted;
    }


    /**
     * Gets the subject value for this WSRequest.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this WSRequest.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the requestId value for this WSRequest.
     * 
     * @return requestId
     */
    public long getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this WSRequest.
     * 
     * @param requestId
     */
    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the processType value for this WSRequest.
     * 
     * @return processType
     */
    public java.lang.String getProcessType() {
        return processType;
    }


    /**
     * Sets the processType value for this WSRequest.
     * 
     * @param processType
     */
    public void setProcessType(java.lang.String processType) {
        this.processType = processType;
    }


    /**
     * Gets the subjectService value for this WSRequest.
     * 
     * @return subjectService
     */
    public java.lang.String getSubjectService() {
        return subjectService;
    }


    /**
     * Sets the subjectService value for this WSRequest.
     * 
     * @param subjectService
     */
    public void setSubjectService(java.lang.String subjectService) {
        this.subjectService = subjectService;
    }


    /**
     * Gets the statusString value for this WSRequest.
     * 
     * @return statusString
     */
    public java.lang.String getStatusString() {
        return statusString;
    }


    /**
     * Sets the statusString value for this WSRequest.
     * 
     * @param statusString
     */
    public void setStatusString(java.lang.String statusString) {
        this.statusString = statusString;
    }


    /**
     * Gets the processState value for this WSRequest.
     * 
     * @return processState
     */
    public java.lang.String getProcessState() {
        return processState;
    }


    /**
     * Sets the processState value for this WSRequest.
     * 
     * @param processState
     */
    public void setProcessState(java.lang.String processState) {
        this.processState = processState;
    }


    /**
     * Gets the timeScheduled value for this WSRequest.
     * 
     * @return timeScheduled
     */
    public java.util.Calendar getTimeScheduled() {
        return timeScheduled;
    }


    /**
     * Sets the timeScheduled value for this WSRequest.
     * 
     * @param timeScheduled
     */
    public void setTimeScheduled(java.util.Calendar timeScheduled) {
        this.timeScheduled = timeScheduled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSRequest)) return false;
        WSRequest other = (WSRequest) obj;
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
            ((this.subjectProfile==null && other.getSubjectProfile()==null) || 
             (this.subjectProfile!=null &&
              this.subjectProfile.equals(other.getSubjectProfile()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            this.select == other.isSelect() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.processTypeString==null && other.getProcessTypeString()==null) || 
             (this.processTypeString!=null &&
              this.processTypeString.equals(other.getProcessTypeString()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.processStateString==null && other.getProcessStateString()==null) || 
             (this.processStateString!=null &&
              this.processStateString.equals(other.getProcessStateString()))) &&
            this.status == other.getStatus() &&
            ((this.requestee==null && other.getRequestee()==null) || 
             (this.requestee!=null &&
              this.requestee.equals(other.getRequestee()))) &&
            ((this.timeSubmitted==null && other.getTimeSubmitted()==null) || 
             (this.timeSubmitted!=null &&
              this.timeSubmitted.equals(other.getTimeSubmitted()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            this.requestId == other.getRequestId() &&
            ((this.processType==null && other.getProcessType()==null) || 
             (this.processType!=null &&
              this.processType.equals(other.getProcessType()))) &&
            ((this.subjectService==null && other.getSubjectService()==null) || 
             (this.subjectService!=null &&
              this.subjectService.equals(other.getSubjectService()))) &&
            ((this.statusString==null && other.getStatusString()==null) || 
             (this.statusString!=null &&
              this.statusString.equals(other.getStatusString()))) &&
            ((this.processState==null && other.getProcessState()==null) || 
             (this.processState!=null &&
              this.processState.equals(other.getProcessState()))) &&
            ((this.timeScheduled==null && other.getTimeScheduled()==null) || 
             (this.timeScheduled!=null &&
              this.timeScheduled.equals(other.getTimeScheduled())));
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
        if (getSubjectProfile() != null) {
            _hashCode += getSubjectProfile().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        _hashCode += (isSelect() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getProcessTypeString() != null) {
            _hashCode += getProcessTypeString().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getProcessStateString() != null) {
            _hashCode += getProcessStateString().hashCode();
        }
        _hashCode += getStatus();
        if (getRequestee() != null) {
            _hashCode += getRequestee().hashCode();
        }
        if (getTimeSubmitted() != null) {
            _hashCode += getTimeSubmitted().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        _hashCode += new Long(getRequestId()).hashCode();
        if (getProcessType() != null) {
            _hashCode += getProcessType().hashCode();
        }
        if (getSubjectService() != null) {
            _hashCode += getSubjectService().hashCode();
        }
        if (getStatusString() != null) {
            _hashCode += getStatusString().hashCode();
        }
        if (getProcessState() != null) {
            _hashCode += getProcessState().hashCode();
        }
        if (getTimeScheduled() != null) {
            _hashCode += getTimeScheduled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "timeCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "subjectProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("select");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "select"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processTypeString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "processTypeString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processStateString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "processStateString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "requestee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSubmitted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "timeSubmitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "requestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "processType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "subjectService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "statusString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "processState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeScheduled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "timeScheduled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
