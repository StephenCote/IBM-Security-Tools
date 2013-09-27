/**
 * WSGroupServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public class WSGroupServiceServiceLocator extends org.apache.axis.client.Service implements com.ibm.itim.ws.services.WSGroupServiceService {

    public WSGroupServiceServiceLocator() {
    }


    public WSGroupServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSGroupServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSGroupService
    private java.lang.String WSGroupService_address = "http://bld-appdev10:9080/itim/services/WSGroupServiceService";

    public java.lang.String getWSGroupServiceAddress() {
        return WSGroupService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSGroupServiceWSDDServiceName = "WSGroupService";

    public java.lang.String getWSGroupServiceWSDDServiceName() {
        return WSGroupServiceWSDDServiceName;
    }

    public void setWSGroupServiceWSDDServiceName(java.lang.String name) {
        WSGroupServiceWSDDServiceName = name;
    }

    public com.ibm.itim.ws.services.WSGroupService getWSGroupService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSGroupService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSGroupService(endpoint);
    }

    public com.ibm.itim.ws.services.WSGroupService getWSGroupService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ibm.itim.ws.services.WSGroupServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSGroupServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSGroupServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSGroupServiceEndpointAddress(java.lang.String address) {
        WSGroupService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ibm.itim.ws.services.WSGroupService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ibm.itim.ws.services.WSGroupServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSGroupServiceSoapBindingStub(new java.net.URL(WSGroupService_address), this);
                _stub.setPortName(getWSGroupServiceWSDDServiceName());
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
        if ("WSGroupService".equals(inputPortName)) {
            return getWSGroupService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSGroupServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSGroupService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSGroupService".equals(portName)) {
            setWSGroupServiceEndpointAddress(address);
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
