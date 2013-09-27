/**
 * WSPasswordService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public interface WSPasswordService extends java.rmi.Remote {
    public com.ibm.itim.ws.model.WSRequest changePassword(com.ibm.itim.ws.model.WSSession session, java.lang.String[] accountDNs, java.lang.String newPassword) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSPasswordRuleException, com.ibm.itim.ws.exceptions.WSInvalidPasswordException;
    public java.lang.String generatePassword(com.ibm.itim.ws.model.WSSession session, java.lang.String[] accountDNs) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public java.lang.String generatePasswordByService(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public java.lang.String generatePasswordForService(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSPasswordRulesInfo getPasswordRules(com.ibm.itim.ws.model.WSSession session, java.lang.String[] accountDNs) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSPasswordRulesInfo getSelfPasswordChangeRules(java.lang.String itimAccountId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public boolean isPasswordValid(com.ibm.itim.ws.model.WSSession session, java.lang.String[] accountDNs, java.lang.String newPassword) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSPasswordRuleException, com.ibm.itim.ws.exceptions.WSInvalidPasswordException;
    public com.ibm.itim.ws.model.WSPasswordRulesInfo joinRules(com.ibm.itim.ws.model.WSPasswordRulesInfo[] wsPris, com.ibm.itim.ws.model.WSLocale wsLocale) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSPasswordRuleException;
    public com.ibm.itim.ws.model.WSRequest selfChangePassword(java.lang.String itimAccountId, java.lang.String oldPassword, java.lang.String newPassword) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSPasswordRuleException, com.ibm.itim.ws.exceptions.WSInvalidPasswordException;
}
