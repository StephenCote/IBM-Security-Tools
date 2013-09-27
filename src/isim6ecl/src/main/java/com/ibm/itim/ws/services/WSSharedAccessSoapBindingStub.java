/**
 * WSSharedAccessSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public class WSSharedAccessSoapBindingStub extends org.apache.axis.client.Stub implements com.ibm.itim.ws.services.WSSharedAccessService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[12];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSSession.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "session"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtLoginServiceException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault1"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtApplicationException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtApplicationException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAuthorizedSharedAccess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "serviceURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSSharedAccess"));
        oper.setReturnClass(com.ibm.itim.ws.model.pim.WSSharedAccess[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault1"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtApplicationException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtLoginServiceException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllAuthorizedSharedAccess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "serviceURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSSharedAccess"));
        oper.setReturnClass(com.ibm.itim.ws.model.pim.WSSharedAccess[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault1"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtApplicationException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtLoginServiceException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "credCompDN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "justification"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "duration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSCredential"));
        oper.setReturnClass(com.ibm.itim.ws.model.pim.WSCredential.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault1"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtApplicationException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtLoginServiceException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCredentialAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "credCompDN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "attributeNames"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "justification"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "duration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSCredentialAttributes"));
        oper.setReturnClass(com.ibm.itim.ws.model.pim.WSCredentialAttributes.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault1"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtApplicationException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtLoginServiceException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "leaseDN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "requestID"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault1"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtApplicationException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtLoginServiceException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkInAllIDs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "requestIDs"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault1"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtApplicationException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtLoginServiceException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkoutWithoutWorkflow");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "credCompDN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "justification"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "duration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSCredential"));
        oper.setReturnClass(com.ibm.itim.ws.model.pim.WSCredential.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault1"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtApplicationException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtLoginServiceException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "credCompDN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "justification"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "duration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "credential"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSCredential"), com.ibm.itim.ws.model.pim.WSCredential.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "requestId"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault1"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtApplicationException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtLoginServiceException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAuthorizedSharedAccessByServiceDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "serviceDN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSSharedAccess"));
        oper.setReturnClass(com.ibm.itim.ws.model.pim.WSSharedAccess[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault1"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtApplicationException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtLoginServiceException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllAuthorizedSharedAccessByServiceDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "serviceDN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSSharedAccess"));
        oper.setReturnClass(com.ibm.itim.ws.model.pim.WSSharedAccess[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault1"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtApplicationException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "pimfault"),
                      "com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException",
                      new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtLoginServiceException"), 
                      true
                     ));
        _operations[11] = oper;

    }

    public WSSharedAccessSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WSSharedAccessSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WSSharedAccessSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSAttribute");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSLocale");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSLocale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSSession.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtApplicationException");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.exceptions.pim.WSExtApplicationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pim.exceptions.ws.itim.ibm.com", "WSExtLoginServiceException");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSCredential");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.pim.WSCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSCredentialAttributes");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.pim.WSCredentialAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSLeaseInfo");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.pim.WSLeaseInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pim.model.ws.itim.ibm.com", "WSSharedAccess");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.pim.WSSharedAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

    public com.ibm.itim.ws.model.WSSession login(java.lang.String userID, java.lang.String password) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.ws.itim.ibm.com/login");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userID, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSSession) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSSession) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSSession.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void logout(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.ws.itim.ibm.com/logout");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.pim.WSSharedAccess[] getAuthorizedSharedAccess(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceURI) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.ws.itim.ibm.com/getAuthorizedSharedAccess");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "getAuthorizedSharedAccess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, serviceURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.pim.WSSharedAccess[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.pim.WSSharedAccess[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.pim.WSSharedAccess[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.pim.WSSharedAccess[] getAllAuthorizedSharedAccess(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceURI) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.ws.itim.ibm.com/getAllAuthorizedSharedAccess");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "getAllAuthorizedSharedAccess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, serviceURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.pim.WSSharedAccess[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.pim.WSSharedAccess[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.pim.WSSharedAccess[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.pim.WSCredential getCredential(com.ibm.itim.ws.model.WSSession session, java.lang.String credCompDN, java.lang.String justification, java.math.BigInteger duration) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.ws.itim.ibm.com/getCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "getCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, credCompDN, justification, duration});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.pim.WSCredential) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.pim.WSCredential) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.pim.WSCredential.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.pim.WSCredentialAttributes getCredentialAttributes(com.ibm.itim.ws.model.WSSession session, java.lang.String credCompDN, java.lang.String[] attributeNames, java.lang.String justification, java.math.BigInteger duration) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.ws.itim.ibm.com/getCredentialAttributes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "getCredentialAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, credCompDN, attributeNames, justification, duration});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.pim.WSCredentialAttributes) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.pim.WSCredentialAttributes) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.pim.WSCredentialAttributes.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String checkIn(com.ibm.itim.ws.model.WSSession session, java.lang.String leaseDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.ws.itim.ibm.com/checkIn");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "checkIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, leaseDN});

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
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] checkInAllIDs(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.ws.itim.ibm.com/checkInAllIDs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "checkInAllIDs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session});

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
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.pim.WSCredential checkoutWithoutWorkflow(com.ibm.itim.ws.model.WSSession session, java.lang.String credCompDN, java.lang.String justification, java.math.BigInteger duration) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.ws.itim.ibm.com/checkoutWithoutWorkflow");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "checkoutWithoutWorkflow"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, credCompDN, justification, duration});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.pim.WSCredential) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.pim.WSCredential) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.pim.WSCredential.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void checkout(com.ibm.itim.ws.model.WSSession session, java.lang.String credCompDN, java.lang.String justification, java.math.BigInteger duration, com.ibm.itim.ws.model.pim.holders.WSCredentialHolder credential, javax.xml.rpc.holders.StringHolder requestId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.ws.itim.ibm.com/checkout");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "checkout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, credCompDN, justification, duration});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                credential.value = (com.ibm.itim.ws.model.pim.WSCredential) _output.get(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "credential"));
            } catch (java.lang.Exception _exception) {
                credential.value = (com.ibm.itim.ws.model.pim.WSCredential) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "credential")), com.ibm.itim.ws.model.pim.WSCredential.class);
            }
            try {
                requestId.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "requestId"));
            } catch (java.lang.Exception _exception) {
                requestId.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "requestId")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.pim.WSSharedAccess[] getAuthorizedSharedAccessByServiceDN(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.ws.itim.ibm.com/getAuthorizedSharedAccessByServiceDN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "getAuthorizedSharedAccessByServiceDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, serviceDN});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.pim.WSSharedAccess[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.pim.WSSharedAccess[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.pim.WSSharedAccess[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.itim.ws.model.pim.WSSharedAccess[] getAllAuthorizedSharedAccessByServiceDN(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.ws.itim.ibm.com/getAllAuthorizedSharedAccessByServiceDN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://pim.services.ws.itim.ibm.com", "getAllAuthorizedSharedAccessByServiceDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, serviceDN});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.pim.WSSharedAccess[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.pim.WSSharedAccess[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.pim.WSSharedAccess[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) {
              throw (com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
