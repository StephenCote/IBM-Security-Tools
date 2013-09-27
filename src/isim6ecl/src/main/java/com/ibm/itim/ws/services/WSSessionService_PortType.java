/**
 * WSSessionService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public interface WSSessionService_PortType extends java.rmi.Remote {
    public java.lang.String[] getChallengeQuestions(java.lang.String principle, com.ibm.itim.ws.model.WSLocale wsLocale) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public int getItimFixpackLevel() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public float getItimVersion() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSVersionInfo getItimVersionInfo() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException;
    public int getWebServicesBuildNumber() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public java.lang.String getWebServicesTargetType() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public float getWebServicesVersion() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public boolean isPasswordEditingAllowed(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSSession login(java.lang.String principal, java.lang.String credential) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSInvalidLoginException;
    public com.ibm.itim.ws.model.WSSession lostPasswordLoginDirectEntry(java.lang.String principle, com.ibm.itim.ws.model.WSChallengeResponseInfo[] challengeInfo, java.lang.String newPassword, com.ibm.itim.ws.model.WSLocale wsLocale) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException;
    public java.lang.String lostPasswordLoginResetPassword(java.lang.String principle, com.ibm.itim.ws.model.WSChallengeResponseInfo[] challengeInfo, com.ibm.itim.ws.model.WSLocale wsLocale) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException;
    public void logout(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException;
}
