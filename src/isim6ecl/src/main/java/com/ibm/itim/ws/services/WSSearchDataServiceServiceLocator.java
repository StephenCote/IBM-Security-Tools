/**
 * WSSearchDataServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public class WSSearchDataServiceServiceLocator extends org.apache.axis.client.Service implements com.ibm.itim.ws.services.WSSearchDataServiceService {

    public WSSearchDataServiceServiceLocator() {
    }


    public WSSearchDataServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSSearchDataServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSSearchDataService
    private java.lang.String WSSearchDataService_address = "http://bld-appdev10:9080/itim/services/WSSearchDataServiceService";

    public java.lang.String getWSSearchDataServiceAddress() {
        return WSSearchDataService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSSearchDataServiceWSDDServiceName = "WSSearchDataService";

    public java.lang.String getWSSearchDataServiceWSDDServiceName() {
        return WSSearchDataServiceWSDDServiceName;
    }

    public void setWSSearchDataServiceWSDDServiceName(java.lang.String name) {
        WSSearchDataServiceWSDDServiceName = name;
    }

    public com.ibm.itim.ws.services.WSSearchDataService getWSSearchDataService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSSearchDataService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSSearchDataService(endpoint);
    }

    public com.ibm.itim.ws.services.WSSearchDataService getWSSearchDataService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ibm.itim.ws.services.WSSearchDataServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSSearchDataServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSSearchDataServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSSearchDataServiceEndpointAddress(java.lang.String address) {
        WSSearchDataService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ibm.itim.ws.services.WSSearchDataService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ibm.itim.ws.services.WSSearchDataServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSSearchDataServiceSoapBindingStub(new java.net.URL(WSSearchDataService_address), this);
                _stub.setPortName(getWSSearchDataServiceWSDDServiceName());
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
        if ("WSSearchDataService".equals(inputPortName)) {
            return getWSSearchDataService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSSearchDataServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSSearchDataService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSSearchDataService".equals(portName)) {
            setWSSearchDataServiceEndpointAddress(address);
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
