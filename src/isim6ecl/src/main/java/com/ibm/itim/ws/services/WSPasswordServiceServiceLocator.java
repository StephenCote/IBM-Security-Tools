/**
 * WSPasswordServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public class WSPasswordServiceServiceLocator extends org.apache.axis.client.Service implements com.ibm.itim.ws.services.WSPasswordServiceService {

    public WSPasswordServiceServiceLocator() {
    }


    public WSPasswordServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSPasswordServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSPasswordService
    private java.lang.String WSPasswordService_address = "http://bld-appdev10:9080/itim/services/WSPasswordServiceService";

    public java.lang.String getWSPasswordServiceAddress() {
        return WSPasswordService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSPasswordServiceWSDDServiceName = "WSPasswordService";

    public java.lang.String getWSPasswordServiceWSDDServiceName() {
        return WSPasswordServiceWSDDServiceName;
    }

    public void setWSPasswordServiceWSDDServiceName(java.lang.String name) {
        WSPasswordServiceWSDDServiceName = name;
    }

    public com.ibm.itim.ws.services.WSPasswordService getWSPasswordService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSPasswordService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSPasswordService(endpoint);
    }

    public com.ibm.itim.ws.services.WSPasswordService getWSPasswordService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ibm.itim.ws.services.WSPasswordServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSPasswordServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSPasswordServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSPasswordServiceEndpointAddress(java.lang.String address) {
        WSPasswordService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ibm.itim.ws.services.WSPasswordService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ibm.itim.ws.services.WSPasswordServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSPasswordServiceSoapBindingStub(new java.net.URL(WSPasswordService_address), this);
                _stub.setPortName(getWSPasswordServiceWSDDServiceName());
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
        if ("WSPasswordService".equals(inputPortName)) {
            return getWSPasswordService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSPasswordServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSPasswordService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSPasswordService".equals(portName)) {
            setWSPasswordServiceEndpointAddress(address);
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
