/**
 * WSAccessServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public class WSAccessServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.ibm.itim.ws.services.WSAccessService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAccess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "wsAccessEntitlement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSAccessEntitlement"), com.ibm.itim.ws.model.WSAccessEntitlement.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "wsNewUserAccesses"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSNewUserAccess"), com.ibm.itim.ws.model.WSNewUserAccess[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSRequest"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSRequest[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "createAccessReturn"));
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
        oper.setName("getAccesses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "personDN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "accessId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSUserAccess"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSUserAccess[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getAccessesReturn"));
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
        oper.setName("removeAccess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "wsUserAccess"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSUserAccess"), com.ibm.itim.ws.model.WSUserAccess.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSRequest"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSRequest.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "removeAccessReturn"));
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
        oper.setName("searchAvailableAccessEntitlements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSSession"), com.ibm.itim.ws.model.WSSession.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "containerDN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "personDN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "accessType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "accessInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSAccessEntitlement"));
        oper.setReturnClass(com.ibm.itim.ws.model.WSAccessEntitlement[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "searchAvailableAccessEntitlementsReturn"));
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

    }

    public WSAccessServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WSAccessServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WSAccessServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://exceptions.ws.itim.ibm.com", "WSLoginServiceException");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.exceptions.WSLoginServiceException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSAccessEntitlement");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSAccessEntitlement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSNewUserAccess");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSNewUserAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSObject");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSObject.class;
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

            qName = new javax.xml.namespace.QName("http://model.ws.itim.ibm.com", "WSUserAccess");
            cachedSerQNames.add(qName);
            cls = com.ibm.itim.ws.model.WSUserAccess.class;
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

    public com.ibm.itim.ws.model.WSRequest[] createAccess(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSAccessEntitlement wsAccessEntitlement, com.ibm.itim.ws.model.WSNewUserAccess[] wsNewUserAccesses, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "createAccess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, wsAccessEntitlement, wsNewUserAccesses, date});

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

    public com.ibm.itim.ws.model.WSUserAccess[] getAccesses(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, java.lang.String accessId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "getAccesses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, personDN, accessId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSUserAccess[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSUserAccess[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSUserAccess[].class);
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

    public com.ibm.itim.ws.model.WSRequest removeAccess(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSUserAccess wsUserAccess, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "removeAccess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, wsUserAccess, date});

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

    public com.ibm.itim.ws.model.WSAccessEntitlement[] searchAvailableAccessEntitlements(com.ibm.itim.ws.model.WSSession session, java.lang.String containerDN, java.lang.String personDN, java.lang.String accessType, java.lang.String accessInfo) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "searchAvailableAccessEntitlements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, containerDN, personDN, accessType, accessInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.itim.ws.model.WSAccessEntitlement[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.itim.ws.model.WSAccessEntitlement[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.itim.ws.model.WSAccessEntitlement[].class);
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
