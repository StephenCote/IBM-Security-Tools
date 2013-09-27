/**
 * WSAssignmentGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.model;

public class WSAssignmentGroup  implements java.io.Serializable {
    private java.lang.String nodeId;

    private boolean select;

    private java.lang.String requester;

    private java.lang.String description;

    private java.lang.String activityName;

    private java.lang.String rootProcessTypeString;

    private java.lang.String assignedToDN;

    private java.lang.String requestee;

    private java.lang.String activityDescription;

    private java.lang.String subject;

    private java.lang.String activityNameString;

    private long processId;

    private java.lang.String activityType;

    private java.lang.String subjectService;

    private java.lang.String activityDesignId;

    private long rootProcessId;

    private java.util.Calendar timeDue;

    private java.lang.String assignmentType;

    private long id;

    private java.lang.String target;

    private int count;

    private java.lang.String activitySubType;

    private java.lang.String lockOwner;

    private java.lang.String processDesignId;

    private java.lang.String rootProcessType;

    public WSAssignmentGroup() {
    }

    public WSAssignmentGroup(
           java.lang.String nodeId,
           boolean select,
           java.lang.String requester,
           java.lang.String description,
           java.lang.String activityName,
           java.lang.String rootProcessTypeString,
           java.lang.String assignedToDN,
           java.lang.String requestee,
           java.lang.String activityDescription,
           java.lang.String subject,
           java.lang.String activityNameString,
           long processId,
           java.lang.String activityType,
           java.lang.String subjectService,
           java.lang.String activityDesignId,
           long rootProcessId,
           java.util.Calendar timeDue,
           java.lang.String assignmentType,
           long id,
           java.lang.String target,
           int count,
           java.lang.String activitySubType,
           java.lang.String lockOwner,
           java.lang.String processDesignId,
           java.lang.String rootProcessType) {
           this.nodeId = nodeId;
           this.select = select;
           this.requester = requester;
           this.description = description;
           this.activityName = activityName;
           this.rootProcessTypeString = rootProcessTypeString;
           this.assignedToDN = assignedToDN;
           this.requestee = requestee;
           this.activityDescription = activityDescription;
           this.subject = subject;
           this.activityNameString = activityNameString;
           this.processId = processId;
           this.activityType = activityType;
           this.subjectService = subjectService;
           this.activityDesignId = activityDesignId;
           this.rootProcessId = rootProcessId;
           this.timeDue = timeDue;
           this.assignmentType = assignmentType;
           this.id = id;
           this.target = target;
           this.count = count;
           this.activitySubType = activitySubType;
           this.lockOwner = lockOwner;
           this.processDesignId = processDesignId;
           this.rootProcessType = rootProcessType;
    }


    /**
     * Gets the nodeId value for this WSAssignmentGroup.
     * 
     * @return nodeId
     */
    public java.lang.String getNodeId() {
        return nodeId;
    }


    /**
     * Sets the nodeId value for this WSAssignmentGroup.
     * 
     * @param nodeId
     */
    public void setNodeId(java.lang.String nodeId) {
        this.nodeId = nodeId;
    }


    /**
     * Gets the select value for this WSAssignmentGroup.
     * 
     * @return select
     */
    public boolean isSelect() {
        return select;
    }


    /**
     * Sets the select value for this WSAssignmentGroup.
     * 
     * @param select
     */
    public void setSelect(boolean select) {
        this.select = select;
    }


    /**
     * Gets the requester value for this WSAssignmentGroup.
     * 
     * @return requester
     */
    public java.lang.String getRequester() {
        return requester;
    }


    /**
     * Sets the requester value for this WSAssignmentGroup.
     * 
     * @param requester
     */
    public void setRequester(java.lang.String requester) {
        this.requester = requester;
    }


    /**
     * Gets the description value for this WSAssignmentGroup.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSAssignmentGroup.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the activityName value for this WSAssignmentGroup.
     * 
     * @return activityName
     */
    public java.lang.String getActivityName() {
        return activityName;
    }


    /**
     * Sets the activityName value for this WSAssignmentGroup.
     * 
     * @param activityName
     */
    public void setActivityName(java.lang.String activityName) {
        this.activityName = activityName;
    }


    /**
     * Gets the rootProcessTypeString value for this WSAssignmentGroup.
     * 
     * @return rootProcessTypeString
     */
    public java.lang.String getRootProcessTypeString() {
        return rootProcessTypeString;
    }


    /**
     * Sets the rootProcessTypeString value for this WSAssignmentGroup.
     * 
     * @param rootProcessTypeString
     */
    public void setRootProcessTypeString(java.lang.String rootProcessTypeString) {
        this.rootProcessTypeString = rootProcessTypeString;
    }


    /**
     * Gets the assignedToDN value for this WSAssignmentGroup.
     * 
     * @return assignedToDN
     */
    public java.lang.String getAssignedToDN() {
        return assignedToDN;
    }


    /**
     * Sets the assignedToDN value for this WSAssignmentGroup.
     * 
     * @param assignedToDN
     */
    public void setAssignedToDN(java.lang.String assignedToDN) {
        this.assignedToDN = assignedToDN;
    }


    /**
     * Gets the requestee value for this WSAssignmentGroup.
     * 
     * @return requestee
     */
    public java.lang.String getRequestee() {
        return requestee;
    }


    /**
     * Sets the requestee value for this WSAssignmentGroup.
     * 
     * @param requestee
     */
    public void setRequestee(java.lang.String requestee) {
        this.requestee = requestee;
    }


    /**
     * Gets the activityDescription value for this WSAssignmentGroup.
     * 
     * @return activityDescription
     */
    public java.lang.String getActivityDescription() {
        return activityDescription;
    }


    /**
     * Sets the activityDescription value for this WSAssignmentGroup.
     * 
     * @param activityDescription
     */
    public void setActivityDescription(java.lang.String activityDescription) {
        this.activityDescription = activityDescription;
    }


    /**
     * Gets the subject value for this WSAssignmentGroup.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this WSAssignmentGroup.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the activityNameString value for this WSAssignmentGroup.
     * 
     * @return activityNameString
     */
    public java.lang.String getActivityNameString() {
        return activityNameString;
    }


    /**
     * Sets the activityNameString value for this WSAssignmentGroup.
     * 
     * @param activityNameString
     */
    public void setActivityNameString(java.lang.String activityNameString) {
        this.activityNameString = activityNameString;
    }


    /**
     * Gets the processId value for this WSAssignmentGroup.
     * 
     * @return processId
     */
    public long getProcessId() {
        return processId;
    }


    /**
     * Sets the processId value for this WSAssignmentGroup.
     * 
     * @param processId
     */
    public void setProcessId(long processId) {
        this.processId = processId;
    }


    /**
     * Gets the activityType value for this WSAssignmentGroup.
     * 
     * @return activityType
     */
    public java.lang.String getActivityType() {
        return activityType;
    }


    /**
     * Sets the activityType value for this WSAssignmentGroup.
     * 
     * @param activityType
     */
    public void setActivityType(java.lang.String activityType) {
        this.activityType = activityType;
    }


    /**
     * Gets the subjectService value for this WSAssignmentGroup.
     * 
     * @return subjectService
     */
    public java.lang.String getSubjectService() {
        return subjectService;
    }


    /**
     * Sets the subjectService value for this WSAssignmentGroup.
     * 
     * @param subjectService
     */
    public void setSubjectService(java.lang.String subjectService) {
        this.subjectService = subjectService;
    }


    /**
     * Gets the activityDesignId value for this WSAssignmentGroup.
     * 
     * @return activityDesignId
     */
    public java.lang.String getActivityDesignId() {
        return activityDesignId;
    }


    /**
     * Sets the activityDesignId value for this WSAssignmentGroup.
     * 
     * @param activityDesignId
     */
    public void setActivityDesignId(java.lang.String activityDesignId) {
        this.activityDesignId = activityDesignId;
    }


    /**
     * Gets the rootProcessId value for this WSAssignmentGroup.
     * 
     * @return rootProcessId
     */
    public long getRootProcessId() {
        return rootProcessId;
    }


    /**
     * Sets the rootProcessId value for this WSAssignmentGroup.
     * 
     * @param rootProcessId
     */
    public void setRootProcessId(long rootProcessId) {
        this.rootProcessId = rootProcessId;
    }


    /**
     * Gets the timeDue value for this WSAssignmentGroup.
     * 
     * @return timeDue
     */
    public java.util.Calendar getTimeDue() {
        return timeDue;
    }


    /**
     * Sets the timeDue value for this WSAssignmentGroup.
     * 
     * @param timeDue
     */
    public void setTimeDue(java.util.Calendar timeDue) {
        this.timeDue = timeDue;
    }


    /**
     * Gets the assignmentType value for this WSAssignmentGroup.
     * 
     * @return assignmentType
     */
    public java.lang.String getAssignmentType() {
        return assignmentType;
    }


    /**
     * Sets the assignmentType value for this WSAssignmentGroup.
     * 
     * @param assignmentType
     */
    public void setAssignmentType(java.lang.String assignmentType) {
        this.assignmentType = assignmentType;
    }


    /**
     * Gets the id value for this WSAssignmentGroup.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this WSAssignmentGroup.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the target value for this WSAssignmentGroup.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this WSAssignmentGroup.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the count value for this WSAssignmentGroup.
     * 
     * @return count
     */
    public int getCount() {
        return count;
    }


    /**
     * Sets the count value for this WSAssignmentGroup.
     * 
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }


    /**
     * Gets the activitySubType value for this WSAssignmentGroup.
     * 
     * @return activitySubType
     */
    public java.lang.String getActivitySubType() {
        return activitySubType;
    }


    /**
     * Sets the activitySubType value for this WSAssignmentGroup.
     * 
     * @param activitySubType
     */
    public void setActivitySubType(java.lang.String activitySubType) {
        this.activitySubType = activitySubType;
    }


    /**
     * Gets the lockOwner value for this WSAssignmentGroup.
     * 
     * @return lockOwner
     */
    public java.lang.String getLockOwner() {
        return lockOwner;
    }


    /**
     * Sets the lockOwner value for this WSAssignmentGroup.
     * 
     * @param lockOwner
     */
    public void setLockOwner(java.lang.String lockOwner) {
        this.lockOwner = lockOwner;
    }


    /**
     * Gets the processDesignId value for this WSAssignmentGroup.
     * 
     * @return processDesignId
     */
    public java.lang.String getProcessDesignId() {
        return processDesignId;
    }


    /**
     * Sets the processDesignId value for this WSAssignmentGroup.
     * 
     * @param processDesignId
     */
    public void setProcessDesignId(java.lang.String processDesignId) {
        this.processDesignId = processDesignId;
    }


    /**
     * Gets the rootProcessType value for this WSAssignmentGroup.
     * 
     * @return rootProcessType
     */
    public java.lang.String getRootProcessType() {
        return rootProcessType;
    }


    /**
     * Sets the rootProcessType value for this WSAssignmentGroup.
     * 
     * @param rootProcessType
     */
    public void setRootProcessType(java.lang.String rootProcessType) {
        this.rootProcessType = rootProcessType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSAssignmentGroup)) return false;
        WSAssignmentGroup other = (WSAssignmentGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nodeId==null && other.getNodeId()==null) || 
             (this.nodeId!=null &&
              this.nodeId.equals(other.getNodeId()))) &&
            this.select == other.isSelect() &&
            ((this.requester==null && other.getRequester()==null) || 
             (this.requester!=null &&
              this.requester.equals(other.getRequester()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.activityName==null && other.getActivityName()==null) || 
             (this.activityName!=null &&
              this.activityName.equals(other.getActivityName()))) &&
            ((this.rootProcessTypeString==null && other.getRootProcessTypeString()==null) || 
             (this.rootProcessTypeString!=null &&
              this.rootProcessTypeString.equals(other.getRootProcessTypeString()))) &&
            ((this.assignedToDN==null && other.getAssignedToDN()==null) || 
             (this.assignedToDN!=null &&
              this.assignedToDN.equals(other.getAssignedToDN()))) &&
            ((this.requestee==null && other.getRequestee()==null) || 
             (this.requestee!=null &&
              this.requestee.equals(other.getRequestee()))) &&
            ((this.activityDescription==null && other.getActivityDescription()==null) || 
             (this.activityDescription!=null &&
              this.activityDescription.equals(other.getActivityDescription()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.activityNameString==null && other.getActivityNameString()==null) || 
             (this.activityNameString!=null &&
              this.activityNameString.equals(other.getActivityNameString()))) &&
            this.processId == other.getProcessId() &&
            ((this.activityType==null && other.getActivityType()==null) || 
             (this.activityType!=null &&
              this.activityType.equals(other.getActivityType()))) &&
            ((this.subjectService==null && other.getSubjectService()==null) || 
             (this.subjectService!=null &&
              this.subjectService.equals(other.getSubjectService()))) &&
            ((this.activityDesignId==null && other.getActivityDesignId()==null) || 
             (this.activityDesignId!=null &&
              this.activityDesignId.equals(other.getActivityDesignId()))) &&
            this.rootProcessId == other.getRootProcessId() &&
            ((this.timeDue==null && other.getTimeDue()==null) || 
             (this.timeDue!=null &&
              this.timeDue.equals(other.getTimeDue()))) &&
            ((this.assignmentType==null && other.getAssignmentType()==null) || 
             (this.assignmentType!=null &&
              this.assignmentType.equals(other.getAssignmentType()))) &&
            this.id == other.getId() &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            this.count == other.getCount() &&
            ((this.activitySubType==null && other.getActivitySubType()==null) || 
             (this.activitySubType!=null &&
              this.activitySubType.equals(other.getActivitySubType()))) &&
            ((this.lockOwner==null && other.getLockOwner()==null) || 
             (this.lockOwner!=null &&
              this.lockOwner.equals(other.getLockOwner()))) &&
            ((this.processDesignId==null && other.getProcessDesignId()==null) || 
             (this.processDesignId!=null &&
              this.processDesignId.equals(other.getProcessDesignId()))) &&
            ((this.rootProcessType==null && other.getRootProcessType()==null) || 
             (this.rootProcessType!=null &&
              this.rootProcessType.equals(other.getRootProcessType())));
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
        if (getNodeId() != null) {
            _hashCode += getNodeId().hashCode();
        }
        _hashCode += (isSelect() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRequester() != null) {
            _hashCode += getRequester().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getActivityName() != null) {
            _hashCode += getActivityName().hashCode();
        }
        if (getRootProcessTypeString() != null) {
            _hashCode += getRootProcessTypeString().hashCode();
        }
        if (getAssignedToDN() != null) {
            _hashCode += getAssignedToDN().hashCode();
        }
        if (getRequestee() != null) {
            _hashCode += getRequestee().hashCode();
        }
        if (getActivityDescription() != null) {
            _hashCode += getActivityDescription().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getActivityNameString() != null) {
            _hashCode += getActivityNameString().hashCode();
        }
        _hashCode += new Long(getProcessId()).hashCode();
        if (getActivityType() != null) {
            _hashCode += getActivityType().hashCode();
        }
        if (getSubjectService() != null) {
            _hashCode += getSubjectService().hashCode();
        }
        if (getActivityDesignId() != null) {
            _hashCode += getActivityDesignId().hashCode();
        }
        _hashCode += new Long(getRootProcessId()).hashCode();
        if (getTimeDue() != null) {
            _hashCode += getTimeDue().hashCode();
        }
        if (getAssignmentType() != null) {
            _hashCode += getAssignmentType().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        _hashCode += getCount();
        if (getActivitySubType() != null) {
            _hashCode += getActivitySubType().hashCode();
        }
        if (getLockOwner() != null) {
            _hashCode += getLockOwner().hashCode();
        }
        if (getProcessDesignId() != null) {
            _hashCode += getProcessDesignId().hashCode();
        }
        if (getRootProcessType() != null) {
            _hashCode += getRootProcessType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSAssignmentGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSAssignmentGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "nodeId"));
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
        elemField.setFieldName("requester");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "requester"));
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
        elemField.setFieldName("activityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "activityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootProcessTypeString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "rootProcessTypeString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedToDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "assignedToDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "requestee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "activityDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityNameString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "activityNameString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "subjectService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityDesignId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "activityDesignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootProcessId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "rootProcessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeDue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "timeDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "assignmentType"));
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
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activitySubType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "activitySubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "lockOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processDesignId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "processDesignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootProcessType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "rootProcessType"));
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
