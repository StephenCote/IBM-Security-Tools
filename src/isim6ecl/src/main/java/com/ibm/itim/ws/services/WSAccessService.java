/**
 * WSAccessService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public interface WSAccessService extends java.rmi.Remote {
    public com.ibm.itim.ws.model.WSRequest[] createAccess(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSAccessEntitlement wsAccessEntitlement, com.ibm.itim.ws.model.WSNewUserAccess[] wsNewUserAccesses, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSUserAccess[] getAccesses(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, java.lang.String accessId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSRequest removeAccess(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSUserAccess wsUserAccess, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSAccessEntitlement[] searchAvailableAccessEntitlements(com.ibm.itim.ws.model.WSSession session, java.lang.String containerDN, java.lang.String personDN, java.lang.String accessType, java.lang.String accessInfo) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
}
