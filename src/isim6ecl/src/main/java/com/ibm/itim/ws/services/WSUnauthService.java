/**
 * WSUnauthService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public interface WSUnauthService extends java.rmi.Remote {
    public com.ibm.itim.ws.model.WSPasswordRulesInfo getSelfPasswordChangeRules(java.lang.String itimAccountId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSPasswordRulesInfo joinRules(com.ibm.itim.ws.model.WSPasswordRulesInfo[] wsPris, com.ibm.itim.ws.model.WSLocale wsLocale) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSPasswordRuleException;
    public void selfRegister(com.ibm.itim.ws.model.WSPerson wsPerson, java.lang.String tenantId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public java.lang.String[] getChallengeQuestions(java.lang.String principle, com.ibm.itim.ws.model.WSLocale wsLocale) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public int getItimFixpackLevel() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public float getItimVersion() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSVersionInfo getItimVersionInfo() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException;
    public int getWebServicesBuildNumber() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public java.lang.String getWebServicesTargetType() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public float getWebServicesVersion() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public java.lang.String lostPasswordLoginResetPassword(java.lang.String principle, com.ibm.itim.ws.model.WSChallengeResponseInfo[] challengeInfo, com.ibm.itim.ws.model.WSLocale wsLocale) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException;
}
