/**
 * WSPasswordServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public class WSPasswordServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.ibm.itim.ws.services.WSPasswordService {
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
        oper.setName("changePassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "accountDNs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "newPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSRequest"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSRequest.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "changePasswordReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault1"),
                      "com.ibm.itim.ws.exceptions.WSLoginServiceException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSLoginServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault"),
                      "com.ibm.itim.ws.exceptions.WSInvalidSessionException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSInvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault2"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault3"),
                      "com.ibm.itim.ws.exceptions.WSPasswordRuleException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSPasswordRuleException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault4"),
                      "com.ibm.itim.ws.exceptions.WSInvalidPasswordException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSInvalidPasswordException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "accountDNs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "generatePasswordReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault1"),
                      "com.ibm.itim.ws.exceptions.WSLoginServiceException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSLoginServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault2"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePasswordByService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "serviceDN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "generatePasswordByServiceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault"),
                      "com.ibm.itim.ws.exceptions.WSInvalidSessionException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSInvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault2"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePasswordForService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "serviceDN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "generatePasswordForServiceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault"),
                      "com.ibm.itim.ws.exceptions.WSInvalidSessionException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSInvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault2"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPasswordRules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "accountDNs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSPasswordRulesInfo"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSPasswordRulesInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getPasswordRulesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault1"),
                      "com.ibm.itim.ws.exceptions.WSLoginServiceException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSLoginServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault"),
                      "com.ibm.itim.ws.exceptions.WSInvalidSessionException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSInvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault2"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSelfPasswordChangeRules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "itimAccountId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSPasswordRulesInfo"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSPasswordRulesInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getSelfPasswordChangeRulesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault2"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isPasswordValid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "accountDNs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "newPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "isPasswordValidReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault1"),
                      "com.ibm.itim.ws.exceptions.WSLoginServiceException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSLoginServiceException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault"),
                      "com.ibm.itim.ws.exceptions.WSInvalidSessionException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSInvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault2"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault3"),
                      "com.ibm.itim.ws.exceptions.WSPasswordRuleException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSPasswordRuleException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault4"),
                      "com.ibm.itim.ws.exceptions.WSInvalidPasswordException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSInvalidPasswordException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("joinRules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "wsPris"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSPasswordRulesInfo"), com.ibm.itim.ws.model.WSPasswordRulesInfo[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "wsLocale"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSLocale"), com.ibm.itim.ws.model.WSLocale.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSPasswordRulesInfo"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSPasswordRulesInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "joinRulesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault2"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault3"),
                      "com.ibm.itim.ws.exceptions.WSPasswordRuleException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSPasswordRuleException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("selfChangePassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "itimAccountId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "oldPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "newPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSRequest"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSRequest.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "selfChangePasswordReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault2"),
                      "com.ibm.itim.ws.exceptions.WSApplicationException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault3"),
                      "com.ibm.itim.ws.exceptions.WSPasswordRuleException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSPasswordRuleException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "fault4"),
                      "com.ibm.itim.ws.exceptions.WSInvalidPasswordException",
                      new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSInvalidPasswordException"), 
                      true
                     ));
        _operations[8] = oper;

    }

    public WSPasswordServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WSPasswordServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WSPasswordServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSInvalidPasswordException");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.exceptions.WSInvalidPasswordException.class;
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

            qName = new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSPasswordRuleException");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.exceptions.WSPasswordRuleException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSLocale");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSLocale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSPasswordRulesInfo");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSPasswordRulesInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSRequest");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSRequest.class;
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

    public com.ibm.itim.ws.model.WSRequest changePassword(com.ibm.itim.ws.model.WSSession session, java.lang.String[] accountDNs, java.lang.String newPassword) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSPasswordRuleException, com.ibm.itim.ws.exceptions.WSInvalidPasswordException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "changePassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, accountDNs, newPassword});

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
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSInvalidSessionException) {
              throw (com.ibm.itim.ws.exceptions.WSInvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSApplicationException) {
              throw (com.ibm.itim.ws.exceptions.WSApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSPasswordRuleException) {
              throw (com.ibm.itim.ws.exceptions.WSPasswordRuleException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSInvalidPasswordException) {
              throw (com.ibm.itim.ws.exceptions.WSInvalidPasswordException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String generatePassword(com.ibm.itim.ws.model.WSSession session, java.lang.String[] accountDNs) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "generatePassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, accountDNs});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
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

    public java.lang.String generatePasswordByService(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "generatePasswordByService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, serviceDN});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
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

    public java.lang.String generatePasswordForService(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "generatePasswordForService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, serviceDN});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
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

    public com.ibm.itim.ws.model.WSPasswordRulesInfo getPasswordRules(com.ibm.itim.ws.model.WSSession session, java.lang.String[] accountDNs) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getPasswordRules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, accountDNs});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSPasswordRulesInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSPasswordRulesInfo) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSPasswordRulesInfo.class);
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

    public com.ibm.itim.ws.model.WSPasswordRulesInfo getSelfPasswordChangeRules(java.lang.String itimAccountId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getSelfPasswordChangeRules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {itimAccountId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSPasswordRulesInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSPasswordRulesInfo) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSPasswordRulesInfo.class);
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

    public boolean isPasswordValid(com.ibm.itim.ws.model.WSSession session, java.lang.String[] accountDNs, java.lang.String newPassword) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSPasswordRuleException, com.ibm.itim.ws.exceptions.WSInvalidPasswordException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "isPasswordValid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, accountDNs, newPassword});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
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
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSInvalidSessionException) {
              throw (com.ibm.itim.ws.exceptions.WSInvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSApplicationException) {
              throw (com.ibm.itim.ws.exceptions.WSApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSPasswordRuleException) {
              throw (com.ibm.itim.ws.exceptions.WSPasswordRuleException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSInvalidPasswordException) {
              throw (com.ibm.itim.ws.exceptions.WSInvalidPasswordException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.WSPasswordRulesInfo joinRules(com.ibm.itim.ws.model.WSPasswordRulesInfo[] wsPris, com.ibm.itim.ws.model.WSLocale wsLocale) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSPasswordRuleException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "joinRules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsPris, wsLocale});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSPasswordRulesInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSPasswordRulesInfo) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSPasswordRulesInfo.class);
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
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSPasswordRuleException) {
              throw (com.ibm.itim.ws.exceptions.WSPasswordRuleException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.WSRequest selfChangePassword(java.lang.String itimAccountId, java.lang.String oldPassword, java.lang.String newPassword) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSPasswordRuleException, com.ibm.itim.ws.exceptions.WSInvalidPasswordException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "selfChangePassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {itimAccountId, oldPassword, newPassword});

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
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSApplicationException) {
              throw (com.ibm.itim.ws.exceptions.WSApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSPasswordRuleException) {
              throw (com.ibm.itim.ws.exceptions.WSPasswordRuleException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.WSInvalidPasswordException) {
              throw (com.ibm.itim.ws.exceptions.WSInvalidPasswordException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
