/**
 * WSSharedAccessService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public interface WSSharedAccessService_PortType extends java.rmi.Remote {
    public com.ibm.itim.ws.model.WSSession login(java.lang.String userID, java.lang.String password) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException;
    public void logout(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException;
    public com.ibm.itim.ws.model.pim.WSSharedAccess[] getAuthorizedSharedAccess(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceURI) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException;
    public com.ibm.itim.ws.model.pim.WSSharedAccess[] getAuthorizedSharedAccessByServiceDN(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException;
    public com.ibm.itim.ws.model.pim.WSSharedAccess[] getAllAuthorizedSharedAccess(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceURI) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException;
    public com.ibm.itim.ws.model.pim.WSSharedAccess[] getAllAuthorizedSharedAccessByServiceDN(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException;
    public com.ibm.itim.ws.model.pim.WSCredential getCredential(com.ibm.itim.ws.model.WSSession session, java.lang.String credCompDN, java.lang.String justification, java.math.BigInteger duration) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException;
    public com.ibm.itim.ws.model.pim.WSCredentialAttributes getCredentialAttributes(com.ibm.itim.ws.model.WSSession session, java.lang.String credCompDN, java.lang.String[] attributeNames, java.lang.String justification, java.math.BigInteger duration) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException;
    public java.lang.String checkIn(com.ibm.itim.ws.model.WSSession session, java.lang.String leaseDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException;
    public java.lang.String[] checkInAllIDs(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException;
    public com.ibm.itim.ws.model.pim.WSCredential checkoutWithoutWorkflow(com.ibm.itim.ws.model.WSSession session, java.lang.String credCompDN, java.lang.String justification, java.math.BigInteger duration) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException;
    public void checkout(com.ibm.itim.ws.model.WSSession session, java.lang.String credCompDN, java.lang.String justification, java.math.BigInteger duration, com.ibm.itim.ws.model.pim.holders.WSCredentialHolder credential, javax.xml.rpc.holders.StringHolder requestId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException;
}
