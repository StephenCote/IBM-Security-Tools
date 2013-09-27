package com.ibm.itim.ws.services;

public class WSSessionServiceProxy implements com.ibm.itim.ws.services.WSSessionService_PortType {
  private String _endpoint = null;
  private com.ibm.itim.ws.services.WSSessionService_PortType wSSessionService_PortType = null;
  
  public WSSessionServiceProxy() {
    _initWSSessionServiceProxy();
  }
  
  public WSSessionServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSSessionServiceProxy();
  }
  
  private void _initWSSessionServiceProxy() {
    try {
      wSSessionService_PortType = (new com.ibm.itim.ws.services.WSSessionService_ServiceLocator()).getWSSessionServicePort();
      if (wSSessionService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSSessionService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSSessionService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSSessionService_PortType != null)
      ((javax.xml.rpc.Stub)wSSessionService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.itim.ws.services.WSSessionService_PortType getWSSessionService_PortType() {
    if (wSSessionService_PortType == null)
      _initWSSessionServiceProxy();
    return wSSessionService_PortType;
  }
  
  public java.lang.String[] getChallengeQuestions(java.lang.String principle, com.ibm.itim.ws.model.WSLocale wsLocale) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSessionService_PortType == null)
      _initWSSessionServiceProxy();
    return wSSessionService_PortType.getChallengeQuestions(principle, wsLocale);
  }
  
  public int getItimFixpackLevel() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSessionService_PortType == null)
      _initWSSessionServiceProxy();
    return wSSessionService_PortType.getItimFixpackLevel();
  }
  
  public float getItimVersion() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSessionService_PortType == null)
      _initWSSessionServiceProxy();
    return wSSessionService_PortType.getItimVersion();
  }
  
  public com.ibm.itim.ws.model.WSVersionInfo getItimVersionInfo() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSSessionService_PortType == null)
      _initWSSessionServiceProxy();
    return wSSessionService_PortType.getItimVersionInfo();
  }
  
  public int getWebServicesBuildNumber() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSessionService_PortType == null)
      _initWSSessionServiceProxy();
    return wSSessionService_PortType.getWebServicesBuildNumber();
  }
  
  public java.lang.String getWebServicesTargetType() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSessionService_PortType == null)
      _initWSSessionServiceProxy();
    return wSSessionService_PortType.getWebServicesTargetType();
  }
  
  public float getWebServicesVersion() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSessionService_PortType == null)
      _initWSSessionServiceProxy();
    return wSSessionService_PortType.getWebServicesVersion();
  }
  
  public boolean isPasswordEditingAllowed(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSessionService_PortType == null)
      _initWSSessionServiceProxy();
    return wSSessionService_PortType.isPasswordEditingAllowed(session);
  }
  
  public com.ibm.itim.ws.model.WSSession login(java.lang.String principal, java.lang.String credential) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSInvalidLoginException{
    if (wSSessionService_PortType == null)
      _initWSSessionServiceProxy();
    return wSSessionService_PortType.login(principal, credential);
  }
  
  public com.ibm.itim.ws.model.WSSession lostPasswordLoginDirectEntry(java.lang.String principle, com.ibm.itim.ws.model.WSChallengeResponseInfo[] challengeInfo, java.lang.String newPassword, com.ibm.itim.ws.model.WSLocale wsLocale) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException{
    if (wSSessionService_PortType == null)
      _initWSSessionServiceProxy();
    return wSSessionService_PortType.lostPasswordLoginDirectEntry(principle, challengeInfo, newPassword, wsLocale);
  }
  
  public java.lang.String lostPasswordLoginResetPassword(java.lang.String principle, com.ibm.itim.ws.model.WSChallengeResponseInfo[] challengeInfo, com.ibm.itim.ws.model.WSLocale wsLocale) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException{
    if (wSSessionService_PortType == null)
      _initWSSessionServiceProxy();
    return wSSessionService_PortType.lostPasswordLoginResetPassword(principle, challengeInfo, wsLocale);
  }
  
  public void logout(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException{
    if (wSSessionService_PortType == null)
      _initWSSessionServiceProxy();
    wSSessionService_PortType.logout(session);
  }
  
  
}