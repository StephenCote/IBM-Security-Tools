/**
 * WSSharedAccessService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public class WSSharedAccessService_ServiceLocator extends org.apache.axis.client.Service implements com.ibm.itim.ws.services.WSSharedAccessService_Service {

    public WSSharedAccessService_ServiceLocator() {
    }


    public WSSharedAccessService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSSharedAccessService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSSharedAccess
    private java.lang.String WSSharedAccess_address = "http://bld-appdev10:9080/itim/services/WSSharedAccessService";

    public java.lang.String getWSSharedAccessAddress() {
        return WSSharedAccess_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSSharedAccessWSDDServiceName = "WSSharedAccess";

    public java.lang.String getWSSharedAccessWSDDServiceName() {
        return WSSharedAccessWSDDServiceName;
    }

    public void setWSSharedAccessWSDDServiceName(java.lang.String name) {
        WSSharedAccessWSDDServiceName = name;
    }

    public com.ibm.itim.ws.services.WSSharedAccessService_PortType getWSSharedAccess() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSSharedAccess_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSSharedAccess(endpoint);
    }

    public com.ibm.itim.ws.services.WSSharedAccessService_PortType getWSSharedAccess(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ibm.itim.ws.services.WSSharedAccessSoapBindingStub _stub = new com.ibm.itim.ws.services.WSSharedAccessSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSSharedAccessWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSSharedAccessEndpointAddress(java.lang.String address) {
        WSSharedAccess_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ibm.itim.ws.services.WSSharedAccessService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ibm.itim.ws.services.WSSharedAccessSoapBindingStub _stub = new com.ibm.itim.ws.services.WSSharedAccessSoapBindingStub(new java.net.URL(WSSharedAccess_address), this);
                _stub.setPortName(getWSSharedAccessWSDDServiceName());
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
        if ("WSSharedAccess".equals(inputPortName)) {
            return getWSSharedAccess();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSSharedAccessService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSSharedAccess"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSSharedAccess".equals(portName)) {
            setWSSharedAccessEndpointAddress(address);
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
