/**
 * WSSystemUserServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public class WSSystemUserServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.ibm.itim.ws.services.WSSystemUserService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addDelegate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "delegator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSystemUser"), com.ibm.itim.ws.model.WSSystemUser.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "delegate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSDelegate"), com.ibm.itim.ws.model.WSDelegate.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault"),
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
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getChallengeResponseConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSChallengeResponseConfiguration"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSChallengeResponseConfiguration.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getChallengeResponseConfigurationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault1"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDelegates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "delegator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSystemUser"), com.ibm.itim.ws.model.WSSystemUser.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSDelegateInfo"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSDelegateInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getDelegatesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault"),
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
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExistingChallengeResponseInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSChallengeResponseInfo"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSChallengeResponseInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getExistingChallengeResponseInfoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault1"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSystemRoleNames");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "systemUserDN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getSystemRoleNamesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault2"),
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
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSystemUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSystemUser"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSSystemUser.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getSystemUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault2"),
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
        oper.setName("getSystemUsersForPerson");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "personDN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSystemUser"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSSystemUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getSystemUsersForPersonReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault2"),
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
        oper.setName("modifyDelegate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "delegator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSystemUser"), com.ibm.itim.ws.model.WSSystemUser.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "oldDelegate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSDelegate"), com.ibm.itim.ws.model.WSDelegate.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "newDelegate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSDelegate"), com.ibm.itim.ws.model.WSDelegate.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault"),
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
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeDelegate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "delegator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSystemUser"), com.ibm.itim.ws.model.WSSystemUser.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "delegate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSDelegate"), com.ibm.itim.ws.model.WSDelegate.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault"),
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
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchSystemUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSystemUser"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSSystemUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "searchSystemUsersReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault2"),
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
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setChallengeResponseInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "newCRs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSChallengeResponseInfo"), com.ibm.itim.ws.model.WSChallengeResponseInfo[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault1"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        _operations[10] = oper;

    }

    public WSSystemUserServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WSSystemUserServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WSSystemUserServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSAttribute");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSChallenge");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSChallenge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSChallengeResponseConfiguration");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSChallengeResponseConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSChallengeResponseInfo");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSChallengeResponseInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSDelegate");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSDelegate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSDelegateInfo");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSDelegateInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSLocale");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSLocale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSObject");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSSession.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSystemUser");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSSystemUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "ArrayOf_tns1_WSAttribute");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSAttribute");
            qName2 = new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "ArrayOf_tns1_WSChallenge");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSChallenge[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSChallenge");
            qName2 = new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "ArrayOf_xsd_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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

    public void addDelegate(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSystemUser delegator, com.ibm.itim.ws.model.WSDelegate delegate) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "addDelegate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, delegator, delegate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
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

    public com.ibm.itim.ws.model.WSChallengeResponseConfiguration getChallengeResponseConfiguration(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getChallengeResponseConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSChallengeResponseConfiguration) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSChallengeResponseConfiguration) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSChallengeResponseConfiguration.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSApplicationException) {
              throw (com.ibm.itim.ws.exceptions.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.WSDelegateInfo[] getDelegates(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSystemUser delegator) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getDelegates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, delegator});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSDelegateInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSDelegateInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSDelegateInfo[].class);
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

    public com.ibm.itim.ws.model.WSChallengeResponseInfo[] getExistingChallengeResponseInfo(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getExistingChallengeResponseInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSChallengeResponseInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSChallengeResponseInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSChallengeResponseInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSApplicationException) {
              throw (com.ibm.itim.ws.exceptions.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getSystemRoleNames(com.ibm.itim.ws.model.WSSession session, java.lang.String systemUserDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getSystemRoleNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, systemUserDN});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
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

    public com.ibm.itim.ws.model.WSSystemUser getSystemUser(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getSystemUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSSystemUser) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSSystemUser) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSSystemUser.class);
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

    public com.ibm.itim.ws.model.WSSystemUser[] getSystemUsersForPerson(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getSystemUsersForPerson"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, personDN});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSSystemUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSSystemUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSSystemUser[].class);
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

    public void modifyDelegate(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSystemUser delegator, com.ibm.itim.ws.model.WSDelegate oldDelegate, com.ibm.itim.ws.model.WSDelegate newDelegate) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "modifyDelegate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, delegator, oldDelegate, newDelegate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
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

    public void removeDelegate(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSystemUser delegator, com.ibm.itim.ws.model.WSDelegate delegate) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "removeDelegate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, delegator, delegate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
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

    public com.ibm.itim.ws.model.WSSystemUser[] searchSystemUsers(com.ibm.itim.ws.model.WSSession session, java.lang.String filter) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "searchSystemUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, filter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSSystemUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSSystemUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSSystemUser[].class);
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

    public void setChallengeResponseInfo(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSChallengeResponseInfo[] newCRs) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "setChallengeResponseInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, newCRs});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSApplicationException) {
              throw (com.ibm.itim.ws.exceptions.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
