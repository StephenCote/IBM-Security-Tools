package com.ibm.itim.ws.services;

public class WSAccountServiceProxy implements com.ibm.itim.ws.services.WSAccountService {
  private String _endpoint = null;
  private com.ibm.itim.ws.services.WSAccountService wSAccountService = null;
  
  public WSAccountServiceProxy() {
    _initWSAccountServiceProxy();
  }
  
  public WSAccountServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSAccountServiceProxy();
  }
  
  private void _initWSAccountServiceProxy() {
    try {
      wSAccountService = (new com.ibm.itim.ws.services.WSAccountServiceServiceLocator()).getWSAccountService();
      if (wSAccountService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSAccountService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSAccountService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSAccountService != null)
      ((javax.xml.rpc.Stub)wSAccountService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.itim.ws.services.WSAccountService getWSAccountService() {
    if (wSAccountService == null)
      _initWSAccountServiceProxy();
    return wSAccountService;
  }
  
  public void adoptAccounts(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, com.ibm.itim.ws.model.WSAccount[] wsAccounts) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccountService == null)
      _initWSAccountServiceProxy();
    wSAccountService.adoptAccounts(session, personDN, wsAccounts);
  }
  
  public void adoptSingleAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN, java.lang.String ownerDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccountService == null)
      _initWSAccountServiceProxy();
    wSAccountService.adoptSingleAccount(session, accountDN, ownerDN);
  }
  
  public com.ibm.itim.ws.model.WSRequest createAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN, com.ibm.itim.ws.model.WSAttribute[] wsAttrs, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccountService == null)
      _initWSAccountServiceProxy();
    return wSAccountService.createAccount(session, serviceDN, wsAttrs, date);
  }
  
  public com.ibm.itim.ws.model.WSRequest deprovisionAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccountService == null)
      _initWSAccountServiceProxy();
    return wSAccountService.deprovisionAccount(session, accountDN, date);
  }
  
  public com.ibm.itim.ws.model.WSAttribute[] getAccountAttributes(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccountService == null)
      _initWSAccountServiceProxy();
    return wSAccountService.getAccountAttributes(session, accountDN);
  }
  
  public java.lang.String getAccountProfileForService(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccountService == null)
      _initWSAccountServiceProxy();
    return wSAccountService.getAccountProfileForService(session, serviceDN);
  }
  
  public com.ibm.itim.ws.model.WSAttribute[] getDefaultAccountAttributes(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccountService == null)
      _initWSAccountServiceProxy();
    return wSAccountService.getDefaultAccountAttributes(session, serviceDN);
  }
  
  public com.ibm.itim.ws.model.WSAttribute[] getDefaultAccountAttributesByPerson(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN, java.lang.String personDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccountService == null)
      _initWSAccountServiceProxy();
    return wSAccountService.getDefaultAccountAttributesByPerson(session, serviceDN, personDN);
  }
  
  public com.ibm.itim.ws.model.WSRequest modifyAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN, com.ibm.itim.ws.model.WSAttribute[] wsAttrs, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccountService == null)
      _initWSAccountServiceProxy();
    return wSAccountService.modifyAccount(session, accountDN, wsAttrs, date);
  }
  
  public void orphanAccounts(com.ibm.itim.ws.model.WSSession session, java.lang.String systemUserDN, com.ibm.itim.ws.model.WSAccount[] wsAccounts) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccountService == null)
      _initWSAccountServiceProxy();
    wSAccountService.orphanAccounts(session, systemUserDN, wsAccounts);
  }
  
  public void orphanSingleAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccountService == null)
      _initWSAccountServiceProxy();
    wSAccountService.orphanSingleAccount(session, accountDN);
  }
  
  public com.ibm.itim.ws.model.WSRequest restoreAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN, java.lang.String newPassword, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccountService == null)
      _initWSAccountServiceProxy();
    return wSAccountService.restoreAccount(session, accountDN, newPassword, date);
  }
  
  public com.ibm.itim.ws.model.WSAccount[] searchAccounts(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSearchArguments searchArgs) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccountService == null)
      _initWSAccountServiceProxy();
    return wSAccountService.searchAccounts(session, searchArgs);
  }
  
  public com.ibm.itim.ws.model.WSRequest suspendAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccountService == null)
      _initWSAccountServiceProxy();
    return wSAccountService.suspendAccount(session, accountDN, date);
  }
  
  public com.ibm.itim.ws.model.WSRequest updateAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN, com.ibm.itim.ws.model.WSAttribute[] wsAttrs, java.util.Calendar date) throws java.rmi.RemoteException{
    if (wSAccountService == null)
      _initWSAccountServiceProxy();
    return wSAccountService.updateAccount(session, accountDN, wsAttrs, date);
  }
  
  
}