/**
 * WSPersonServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public interface WSPersonServiceService extends javax.xml.rpc.Service {
    public java.lang.String getWSPersonServiceAddress();

    public com.ibm.itim.ws.services.WSPersonService getWSPersonService() throws javax.xml.rpc.ServiceException;

    public com.ibm.itim.ws.services.WSPersonService getWSPersonService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
