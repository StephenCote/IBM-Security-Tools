package com.ibm.itim.ws.services;

public class WSPasswordServiceProxy implements com.ibm.itim.ws.services.WSPasswordService {
  private String _endpoint = null;
  private com.ibm.itim.ws.services.WSPasswordService wSPasswordService = null;
  
  public WSPasswordServiceProxy() {
    _initWSPasswordServiceProxy();
  }
  
  public WSPasswordServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSPasswordServiceProxy();
  }
  
  private void _initWSPasswordServiceProxy() {
    try {
      wSPasswordService = (new com.ibm.itim.ws.services.WSPasswordServiceServiceLocator()).getWSPasswordService();
      if (wSPasswordService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSPasswordService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSPasswordService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSPasswordService != null)
      ((javax.xml.rpc.Stub)wSPasswordService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.itim.ws.services.WSPasswordService getWSPasswordService() {
    if (wSPasswordService == null)
      _initWSPasswordServiceProxy();
    return wSPasswordService;
  }
  
  public com.ibm.itim.ws.model.WSRequest changePassword(com.ibm.itim.ws.model.WSSession session, java.lang.String[] accountDNs, java.lang.String newPassword) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSPasswordRuleException, com.ibm.itim.ws.exceptions.WSInvalidPasswordException{
    if (wSPasswordService == null)
      _initWSPasswordServiceProxy();
    return wSPasswordService.changePassword(session, accountDNs, newPassword);
  }
  
  public java.lang.String generatePassword(com.ibm.itim.ws.model.WSSession session, java.lang.String[] accountDNs) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPasswordService == null)
      _initWSPasswordServiceProxy();
    return wSPasswordService.generatePassword(session, accountDNs);
  }
  
  public java.lang.String generatePasswordByService(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPasswordService == null)
      _initWSPasswordServiceProxy();
    return wSPasswordService.generatePasswordByService(session, serviceDN);
  }
  
  public java.lang.String generatePasswordForService(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPasswordService == null)
      _initWSPasswordServiceProxy();
    return wSPasswordService.generatePasswordForService(session, serviceDN);
  }
  
  public com.ibm.itim.ws.model.WSPasswordRulesInfo getPasswordRules(com.ibm.itim.ws.model.WSSession session, java.lang.String[] accountDNs) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPasswordService == null)
      _initWSPasswordServiceProxy();
    return wSPasswordService.getPasswordRules(session, accountDNs);
  }
  
  public com.ibm.itim.ws.model.WSPasswordRulesInfo getSelfPasswordChangeRules(java.lang.String itimAccountId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPasswordService == null)
      _initWSPasswordServiceProxy();
    return wSPasswordService.getSelfPasswordChangeRules(itimAccountId);
  }
  
  public boolean isPasswordValid(com.ibm.itim.ws.model.WSSession session, java.lang.String[] accountDNs, java.lang.String newPassword) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSPasswordRuleException, com.ibm.itim.ws.exceptions.WSInvalidPasswordException{
    if (wSPasswordService == null)
      _initWSPasswordServiceProxy();
    return wSPasswordService.isPasswordValid(session, accountDNs, newPassword);
  }
  
  public com.ibm.itim.ws.model.WSPasswordRulesInfo joinRules(com.ibm.itim.ws.model.WSPasswordRulesInfo[] wsPris, com.ibm.itim.ws.model.WSLocale wsLocale) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSPasswordRuleException{
    if (wSPasswordService == null)
      _initWSPasswordServiceProxy();
    return wSPasswordService.joinRules(wsPris, wsLocale);
  }
  
  public com.ibm.itim.ws.model.WSRequest selfChangePassword(java.lang.String itimAccountId, java.lang.String oldPassword, java.lang.String newPassword) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSPasswordRuleException, com.ibm.itim.ws.exceptions.WSInvalidPasswordException{
    if (wSPasswordService == null)
      _initWSPasswordServiceProxy();
    return wSPasswordService.selfChangePassword(itimAccountId, oldPassword, newPassword);
  }
  
  
}