/**
 * WSAccountServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public class WSAccountServiceServiceLocator extends org.apache.axis.client.Service implements com.ibm.itim.ws.services.WSAccountServiceService {

    public WSAccountServiceServiceLocator() {
    }


    public WSAccountServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSAccountServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSAccountService
    private java.lang.String WSAccountService_address = "http://bld-appdev10:9080/itim/services/WSAccountServiceService";

    public java.lang.String getWSAccountServiceAddress() {
        return WSAccountService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSAccountServiceWSDDServiceName = "WSAccountService";

    public java.lang.String getWSAccountServiceWSDDServiceName() {
        return WSAccountServiceWSDDServiceName;
    }

    public void setWSAccountServiceWSDDServiceName(java.lang.String name) {
        WSAccountServiceWSDDServiceName = name;
    }

    public com.ibm.itim.ws.services.WSAccountService getWSAccountService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSAccountService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSAccountService(endpoint);
    }

    public com.ibm.itim.ws.services.WSAccountService getWSAccountService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ibm.itim.ws.services.WSAccountServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSAccountServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSAccountServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSAccountServiceEndpointAddress(java.lang.String address) {
        WSAccountService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ibm.itim.ws.services.WSAccountService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ibm.itim.ws.services.WSAccountServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSAccountServiceSoapBindingStub(new java.net.URL(WSAccountService_address), this);
                _stub.setPortName(getWSAccountServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WSAccountService".equals(inputPortName)) {
            return getWSAccountService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSAccountServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSAccountService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSAccountService".equals(portName)) {
            setWSAccountServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
