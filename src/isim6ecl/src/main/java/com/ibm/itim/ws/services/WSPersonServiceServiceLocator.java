/**
 * WSPersonServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public class WSPersonServiceServiceLocator extends org.apache.axis.client.Service implements com.ibm.itim.ws.services.WSPersonServiceService {

    public WSPersonServiceServiceLocator() {
    }


    public WSPersonServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSPersonServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSPersonService
    private java.lang.String WSPersonService_address = "http://bld-appdev10:9080/itim/services/WSPersonServiceService";

    public java.lang.String getWSPersonServiceAddress() {
        return WSPersonService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSPersonServiceWSDDServiceName = "WSPersonService";

    public java.lang.String getWSPersonServiceWSDDServiceName() {
        return WSPersonServiceWSDDServiceName;
    }

    public void setWSPersonServiceWSDDServiceName(java.lang.String name) {
        WSPersonServiceWSDDServiceName = name;
    }

    public com.ibm.itim.ws.services.WSPersonService getWSPersonService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSPersonService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSPersonService(endpoint);
    }

    public com.ibm.itim.ws.services.WSPersonService getWSPersonService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ibm.itim.ws.services.WSPersonServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSPersonServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSPersonServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSPersonServiceEndpointAddress(java.lang.String address) {
        WSPersonService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ibm.itim.ws.services.WSPersonService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ibm.itim.ws.services.WSPersonServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSPersonServiceSoapBindingStub(new java.net.URL(WSPersonService_address), this);
                _stub.setPortName(getWSPersonServiceWSDDServiceName());
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
        if ("WSPersonService".equals(inputPortName)) {
            return getWSPersonService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSPersonServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSPersonService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSPersonService".equals(portName)) {
            setWSPersonServiceEndpointAddress(address);
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
