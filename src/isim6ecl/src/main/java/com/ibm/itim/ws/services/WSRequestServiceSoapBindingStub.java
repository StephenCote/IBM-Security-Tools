/**
 * WSRequestServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public class WSRequestServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.ibm.itim.ws.services.WSRequestService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("abortRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "requestId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault"),
                      "com.ibm.itim.ws.exceptions.WSLoginServiceException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSLoginServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault1"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getActivities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "processId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "recurseSubProcesses"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSActivity"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSActivity[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getActivitiesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault"),
                      "com.ibm.itim.ws.exceptions.WSLoginServiceException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSLoginServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault1"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getChildProcesses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "processId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSRequest"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSRequest[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getChildProcessesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault"),
                      "com.ibm.itim.ws.exceptions.WSLoginServiceException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSLoginServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault1"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCompletedRequests");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "timeType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "dateIntervalType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSRequest"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSRequest[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getCompletedRequestsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault"),
                      "com.ibm.itim.ws.exceptions.WSLoginServiceException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSLoginServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault1"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCompletedRequestsPage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "searchResultsWrapper"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSearchResultsWrapper"), com.ibm.itim.ws.model.WSSearchResultsWrapper.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSRequest"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSRequest[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getCompletedRequestsPageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault2"),
                      "com.ibm.itim.ws.exceptions.WSInvalidSessionException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSInvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault1"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPendingRequests");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSRequest"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSRequest[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getPendingRequestsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault"),
                      "com.ibm.itim.ws.exceptions.WSLoginServiceException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSLoginServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault1"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProcess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "processId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSRequest"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSRequest.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getProcessReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault"),
                      "com.ibm.itim.ws.exceptions.WSLoginServiceException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSLoginServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault1"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "requestId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSRequest"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSRequest.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getRequestReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault"),
                      "com.ibm.itim.ws.exceptions.WSLoginServiceException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSLoginServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault1"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchCompletedRequests");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "timeType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "dateIntervalType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSearchResultsWrapper"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSSearchResultsWrapper.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "searchCompletedRequestsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault"),
                      "com.ibm.itim.ws.exceptions.WSLoginServiceException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSLoginServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault1"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        _operations[8] = oper;

    }

    public WSRequestServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WSRequestServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WSRequestServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.exceptions.WSApplicationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSInvalidSessionException");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.exceptions.WSInvalidSessionException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSLoginServiceException");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.exceptions.WSLoginServiceException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSActivity");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSLocale");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSLocale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSRequest");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSearchResultsWrapper");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSSearchResultsWrapper.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSSession.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void abortRequest(com.ibm.itim.ws.model.WSSession session, long requestId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "abortRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, new java.lang.Long(requestId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.WSLoginServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSApplicationException) {
              throw (com.ibm.itim.ws.exceptions.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.WSActivity[] getActivities(com.ibm.itim.ws.model.WSSession session, long processId, boolean recurseSubProcesses) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getActivities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, new java.lang.Long(processId), new java.lang.Boolean(recurseSubProcesses)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSActivity[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSActivity[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSActivity[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.WSLoginServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSApplicationException) {
              throw (com.ibm.itim.ws.exceptions.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.WSRequest[] getChildProcesses(com.ibm.itim.ws.model.WSSession session, long processId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getChildProcesses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, new java.lang.Long(processId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSRequest[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSRequest[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSRequest[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.WSLoginServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSApplicationException) {
              throw (com.ibm.itim.ws.exceptions.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.WSRequest[] getCompletedRequests(com.ibm.itim.ws.model.WSSession session, int timeType, int dateIntervalType) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getCompletedRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, new java.lang.Integer(timeType), new java.lang.Integer(dateIntervalType)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSRequest[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSRequest[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSRequest[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.WSLoginServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSApplicationException) {
              throw (com.ibm.itim.ws.exceptions.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.WSRequest[] getCompletedRequestsPage(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSearchResultsWrapper searchResultsWrapper, int pageNum) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getCompletedRequestsPage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, searchResultsWrapper, new java.lang.Integer(pageNum)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSRequest[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSRequest[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSRequest[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSInvalidSessionException) {
              throw (com.ibm.itim.ws.exceptions.WSInvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSApplicationException) {
              throw (com.ibm.itim.ws.exceptions.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.WSRequest[] getPendingRequests(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getPendingRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSRequest[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSRequest[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSRequest[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.WSLoginServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSApplicationException) {
              throw (com.ibm.itim.ws.exceptions.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.WSRequest getProcess(com.ibm.itim.ws.model.WSSession session, long processId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getProcess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, new java.lang.Long(processId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSRequest) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSRequest) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSRequest.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.WSLoginServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSApplicationException) {
              throw (com.ibm.itim.ws.exceptions.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.WSRequest getRequest(com.ibm.itim.ws.model.WSSession session, long requestId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, new java.lang.Long(requestId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSRequest) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSRequest) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSRequest.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.WSLoginServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSApplicationException) {
              throw (com.ibm.itim.ws.exceptions.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.WSSearchResultsWrapper searchCompletedRequests(com.ibm.itim.ws.model.WSSession session, int timeType, int dateIntervalType) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "searchCompletedRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, new java.lang.Integer(timeType), new java.lang.Integer(dateIntervalType)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSSearchResultsWrapper) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSSearchResultsWrapper) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSSearchResultsWrapper.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.WSLoginServiceException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSApplicationException) {
              throw (com.ibm.itim.ws.exceptions.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
