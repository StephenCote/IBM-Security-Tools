/**
 * WSProvisioningPolicyServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public class WSProvisioningPolicyServiceServiceLocator extends org.apache.axis.client.Service implements com.ibm.itim.ws.services.WSProvisioningPolicyServiceService {

    public WSProvisioningPolicyServiceServiceLocator() {
    }


    public WSProvisioningPolicyServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSProvisioningPolicyServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSProvisioningPolicyService
    private java.lang.String WSProvisioningPolicyService_address = "http://bld-appdev10:9080/itim/services/WSProvisioningPolicyServiceService";

    public java.lang.String getWSProvisioningPolicyServiceAddress() {
        return WSProvisioningPolicyService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSProvisioningPolicyServiceWSDDServiceName = "WSProvisioningPolicyService";

    public java.lang.String getWSProvisioningPolicyServiceWSDDServiceName() {
        return WSProvisioningPolicyServiceWSDDServiceName;
    }

    public void setWSProvisioningPolicyServiceWSDDServiceName(java.lang.String name) {
        WSProvisioningPolicyServiceWSDDServiceName = name;
    }

    public com.ibm.itim.ws.services.WSProvisioningPolicyService getWSProvisioningPolicyService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSProvisioningPolicyService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSProvisioningPolicyService(endpoint);
    }

    public com.ibm.itim.ws.services.WSProvisioningPolicyService getWSProvisioningPolicyService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ibm.itim.ws.services.WSProvisioningPolicyServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSProvisioningPolicyServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSProvisioningPolicyServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSProvisioningPolicyServiceEndpointAddress(java.lang.String address) {
        WSProvisioningPolicyService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ibm.itim.ws.services.WSProvisioningPolicyService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ibm.itim.ws.services.WSProvisioningPolicyServiceSoapBindingStub _stub = new com.ibm.itim.ws.services.WSProvisioningPolicyServiceSoapBindingStub(new java.net.URL(WSProvisioningPolicyService_address), this);
                _stub.setPortName(getWSProvisioningPolicyServiceWSDDServiceName());
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
        if ("WSProvisioningPolicyService".equals(inputPortName)) {
            return getWSProvisioningPolicyService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSProvisioningPolicyServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.ws.itim.ibm.com", "WSProvisioningPolicyService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSProvisioningPolicyService".equals(portName)) {
            setWSProvisioningPolicyServiceEndpointAddress(address);
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
