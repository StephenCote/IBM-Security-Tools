/**
 * WSToDoServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public class WSToDoServiceServiceLocator extends org.apache.axis.client.Service implements com.ibm.itim.ws.services.WSToDoServiceService {

    public WSToDoServiceServiceLocator() {
    }


    public WSToDoServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSToDoServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSToDoService
    private java.lang.String WSToDoService_address = "http://bld-appdev10:9080/itim/services/WSToDoServiceService";

    public java.lang.String getWSToDoServiceAddress() {
        return WSToDoService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSToDoServiceWSDDServiceName = "WSToDoService";

    public java.lang.String getWSToDoServiceWSDDServiceName() {
        return WSToDoServiceWSDDServiceName;
    }

    public void setWSToDoServiceWSDDServiceName(java.lang.String name) {
        WSToDoServiceWSDDServiceName = name;
    }

    public com.ibm.itim.ws.services.WSToDoService getWSToDoService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSToDoService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSToDoService(endpoint);
    }

    public com.ibm.itim.ws.services.WSToDoService getWSToDoService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ibm.itim.ws.services.WSToDoServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSToDoServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSToDoServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSToDoServiceEndpointAddress(java.lang.String address) {
        WSToDoService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ibm.itim.ws.services.WSToDoService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ibm.itim.ws.services.WSToDoServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSToDoServiceSoapBindingStub(new java.net.URL(WSToDoService_address), this);
                _stub.setPortName(getWSToDoServiceWSDDServiceName());
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
        if ("WSToDoService".equals(inputPortName)) {
            return getWSToDoService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSToDoServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSToDoService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSToDoService".equals(portName)) {
            setWSToDoServiceEndpointAddress(address);
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
