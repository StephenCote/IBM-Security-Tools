/**
 * WSAccessServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public class WSAccessServiceServiceLocator extends org.apache.axis.client.Service implements com.ibm.itim.ws.services.WSAccessServiceService {

    public WSAccessServiceServiceLocator() {
    }


    public WSAccessServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSAccessServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSAccessService
    private java.lang.String WSAccessService_address = "http://bld-appdev10:9080/itim/services/WSAccessServiceService";

    public java.lang.String getWSAccessServiceAddress() {
        return WSAccessService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSAccessServiceWSDDServiceName = "WSAccessService";

    public java.lang.String getWSAccessServiceWSDDServiceName() {
        return WSAccessServiceWSDDServiceName;
    }

    public void setWSAccessServiceWSDDServiceName(java.lang.String name) {
        WSAccessServiceWSDDServiceName = name;
    }

    public com.ibm.itim.ws.services.WSAccessService getWSAccessService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSAccessService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSAccessService(endpoint);
    }

    public com.ibm.itim.ws.services.WSAccessService getWSAccessService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ibm.itim.ws.services.WSAccessServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSAccessServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSAccessServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSAccessServiceEndpointAddress(java.lang.String address) {
        WSAccessService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ibm.itim.ws.services.WSAccessService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ibm.itim.ws.services.WSAccessServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSAccessServiceSoapBindingStub(new java.net.URL(WSAccessService_address), this);
                _stub.setPortName(getWSAccessServiceWSDDServiceName());
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
        if ("WSAccessService".equals(inputPortName)) {
            return getWSAccessService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSAccessServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSAccessService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSAccessService".equals(portName)) {
            setWSAccessServiceEndpointAddress(address);
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
