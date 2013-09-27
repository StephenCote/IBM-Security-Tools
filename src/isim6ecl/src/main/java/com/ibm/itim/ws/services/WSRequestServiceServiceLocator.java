/**
 * WSRequestServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public class WSRequestServiceServiceLocator extends org.apache.axis.client.Service implements com.ibm.itim.ws.services.WSRequestServiceService {

    public WSRequestServiceServiceLocator() {
    }


    public WSRequestServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSRequestServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSRequestService
    private java.lang.String WSRequestService_address = "http://bld-appdev10:9080/itim/services/WSRequestServiceService";

    public java.lang.String getWSRequestServiceAddress() {
        return WSRequestService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSRequestServiceWSDDServiceName = "WSRequestService";

    public java.lang.String getWSRequestServiceWSDDServiceName() {
        return WSRequestServiceWSDDServiceName;
    }

    public void setWSRequestServiceWSDDServiceName(java.lang.String name) {
        WSRequestServiceWSDDServiceName = name;
    }

    public com.ibm.itim.ws.services.WSRequestService getWSRequestService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSRequestService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSRequestService(endpoint);
    }

    public com.ibm.itim.ws.services.WSRequestService getWSRequestService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ibm.itim.ws.services.WSRequestServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSRequestServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSRequestServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSRequestServiceEndpointAddress(java.lang.String address) {
        WSRequestService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ibm.itim.ws.services.WSRequestService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ibm.itim.ws.services.WSRequestServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSRequestServiceSoapBindingStub(new java.net.URL(WSRequestService_address), this);
                _stub.setPortName(getWSRequestServiceWSDDServiceName());
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
        if ("WSRequestService".equals(inputPortName)) {
            return getWSRequestService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSRequestServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSRequestService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSRequestService".equals(portName)) {
            setWSRequestServiceEndpointAddress(address);
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
