/**
 * WSSystemUserService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public interface WSSystemUserService extends java.rmi.Remote {
    public void addDelegate(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSystemUser delegator, com.ibm.itim.ws.model.WSDelegate delegate) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSChallengeResponseConfiguration getChallengeResponseConfiguration(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSDelegateInfo[] getDelegates(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSystemUser delegator) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSChallengeResponseInfo[] getExistingChallengeResponseInfo(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public java.lang.String[] getSystemRoleNames(com.ibm.itim.ws.model.WSSession session, java.lang.String systemUserDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSSystemUser getSystemUser(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSSystemUser[] getSystemUsersForPerson(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public void modifyDelegate(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSystemUser delegator, com.ibm.itim.ws.model.WSDelegate oldDelegate, com.ibm.itim.ws.model.WSDelegate newDelegate) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public void removeDelegate(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSystemUser delegator, com.ibm.itim.ws.model.WSDelegate delegate) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSSystemUser[] searchSystemUsers(com.ibm.itim.ws.model.WSSession session, java.lang.String filter) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public void setChallengeResponseInfo(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSChallengeResponseInfo[] newCRs) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
}
