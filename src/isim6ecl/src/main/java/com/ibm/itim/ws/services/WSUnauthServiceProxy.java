package com.ibm.itim.ws.services;

public class WSUnauthServiceProxy implements com.ibm.itim.ws.services.WSUnauthService {
  private String _endpoint = null;
  private com.ibm.itim.ws.services.WSUnauthService wSUnauthService = null;
  
  public WSUnauthServiceProxy() {
    _initWSUnauthServiceProxy();
  }
  
  public WSUnauthServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSUnauthServiceProxy();
  }
  
  private void _initWSUnauthServiceProxy() {
    try {
      wSUnauthService = (new com.ibm.itim.ws.services.WSUnauthServiceServiceLocator()).getWSUnauthService();
      if (wSUnauthService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSUnauthService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSUnauthService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSUnauthService != null)
      ((javax.xml.rpc.Stub)wSUnauthService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.itim.ws.services.WSUnauthService getWSUnauthService() {
    if (wSUnauthService == null)
      _initWSUnauthServiceProxy();
    return wSUnauthService;
  }
  
  public com.ibm.itim.ws.model.WSPasswordRulesInfo getSelfPasswordChangeRules(java.lang.String itimAccountId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSUnauthService == null)
      _initWSUnauthServiceProxy();
    return wSUnauthService.getSelfPasswordChangeRules(itimAccountId);
  }
  
  public com.ibm.itim.ws.model.WSPasswordRulesInfo joinRules(com.ibm.itim.ws.model.WSPasswordRulesInfo[] wsPris, com.ibm.itim.ws.model.WSLocale wsLocale) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSPasswordRuleException{
    if (wSUnauthService == null)
      _initWSUnauthServiceProxy();
    return wSUnauthService.joinRules(wsPris, wsLocale);
  }
  
  public void selfRegister(com.ibm.itim.ws.model.WSPerson wsPerson, java.lang.String tenantId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSUnauthService == null)
      _initWSUnauthServiceProxy();
    wSUnauthService.selfRegister(wsPerson, tenantId);
  }
  
  public java.lang.String[] getChallengeQuestions(java.lang.String principle, com.ibm.itim.ws.model.WSLocale wsLocale) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSUnauthService == null)
      _initWSUnauthServiceProxy();
    return wSUnauthService.getChallengeQuestions(principle, wsLocale);
  }
  
  public int getItimFixpackLevel() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSUnauthService == null)
      _initWSUnauthServiceProxy();
    return wSUnauthService.getItimFixpackLevel();
  }
  
  public float getItimVersion() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSUnauthService == null)
      _initWSUnauthServiceProxy();
    return wSUnauthService.getItimVersion();
  }
  
  public com.ibm.itim.ws.model.WSVersionInfo getItimVersionInfo() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSUnauthService == null)
      _initWSUnauthServiceProxy();
    return wSUnauthService.getItimVersionInfo();
  }
  
  public int getWebServicesBuildNumber() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSUnauthService == null)
      _initWSUnauthServiceProxy();
    return wSUnauthService.getWebServicesBuildNumber();
  }
  
  public java.lang.String getWebServicesTargetType() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSUnauthService == null)
      _initWSUnauthServiceProxy();
    return wSUnauthService.getWebServicesTargetType();
  }
  
  public float getWebServicesVersion() throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSUnauthService == null)
      _initWSUnauthServiceProxy();
    return wSUnauthService.getWebServicesVersion();
  }
  
  public java.lang.String lostPasswordLoginResetPassword(java.lang.String principle, com.ibm.itim.ws.model.WSChallengeResponseInfo[] challengeInfo, com.ibm.itim.ws.model.WSLocale wsLocale) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException{
    if (wSUnauthService == null)
      _initWSUnauthServiceProxy();
    return wSUnauthService.lostPasswordLoginResetPassword(principle, challengeInfo, wsLocale);
  }
  
  
}