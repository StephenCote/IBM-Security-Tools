/**
 * WSAccountService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public interface WSAccountService extends java.rmi.Remote {
    public void adoptAccounts(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, com.ibm.itim.ws.model.WSAccount[] wsAccounts) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public void adoptSingleAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN, java.lang.String ownerDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSRequest createAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN, com.ibm.itim.ws.model.WSAttribute[] wsAttrs, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSRequest deprovisionAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSAttribute[] getAccountAttributes(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public java.lang.String getAccountProfileForService(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSAttribute[] getDefaultAccountAttributes(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSAttribute[] getDefaultAccountAttributesByPerson(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN, java.lang.String personDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSRequest modifyAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN, com.ibm.itim.ws.model.WSAttribute[] wsAttrs, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public void orphanAccounts(com.ibm.itim.ws.model.WSSession session, java.lang.String systemUserDN, com.ibm.itim.ws.model.WSAccount[] wsAccounts) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public void orphanSingleAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSRequest restoreAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN, java.lang.String newPassword, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSAccount[] searchAccounts(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSearchArguments searchArgs) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSRequest suspendAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSRequest updateAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN, com.ibm.itim.ws.model.WSAttribute[] wsAttrs, java.util.Calendar date) throws java.rmi.RemoteException;
}
