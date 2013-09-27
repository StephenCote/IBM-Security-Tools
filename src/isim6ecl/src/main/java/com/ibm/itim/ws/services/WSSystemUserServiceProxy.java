package com.ibm.itim.ws.services;

public class WSSystemUserServiceProxy implements com.ibm.itim.ws.services.WSSystemUserService {
  private String _endpoint = null;
  private com.ibm.itim.ws.services.WSSystemUserService wSSystemUserService = null;
  
  public WSSystemUserServiceProxy() {
    _initWSSystemUserServiceProxy();
  }
  
  public WSSystemUserServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSSystemUserServiceProxy();
  }
  
  private void _initWSSystemUserServiceProxy() {
    try {
      wSSystemUserService = (new com.ibm.itim.ws.services.WSSystemUserServiceServiceLocator()).getWSSystemUserService();
      if (wSSystemUserService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSSystemUserService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSSystemUserService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSSystemUserService != null)
      ((javax.xml.rpc.Stub)wSSystemUserService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.itim.ws.services.WSSystemUserService getWSSystemUserService() {
    if (wSSystemUserService == null)
      _initWSSystemUserServiceProxy();
    return wSSystemUserService;
  }
  
  public void addDelegate(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSystemUser delegator, com.ibm.itim.ws.model.WSDelegate delegate) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSystemUserService == null)
      _initWSSystemUserServiceProxy();
    wSSystemUserService.addDelegate(session, delegator, delegate);
  }
  
  public com.ibm.itim.ws.model.WSChallengeResponseConfiguration getChallengeResponseConfiguration(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSystemUserService == null)
      _initWSSystemUserServiceProxy();
    return wSSystemUserService.getChallengeResponseConfiguration(session);
  }
  
  public com.ibm.itim.ws.model.WSDelegateInfo[] getDelegates(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSystemUser delegator) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSystemUserService == null)
      _initWSSystemUserServiceProxy();
    return wSSystemUserService.getDelegates(session, delegator);
  }
  
  public com.ibm.itim.ws.model.WSChallengeResponseInfo[] getExistingChallengeResponseInfo(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSystemUserService == null)
      _initWSSystemUserServiceProxy();
    return wSSystemUserService.getExistingChallengeResponseInfo(session);
  }
  
  public java.lang.String[] getSystemRoleNames(com.ibm.itim.ws.model.WSSession session, java.lang.String systemUserDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSystemUserService == null)
      _initWSSystemUserServiceProxy();
    return wSSystemUserService.getSystemRoleNames(session, systemUserDN);
  }
  
  public com.ibm.itim.ws.model.WSSystemUser getSystemUser(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSystemUserService == null)
      _initWSSystemUserServiceProxy();
    return wSSystemUserService.getSystemUser(session);
  }
  
  public com.ibm.itim.ws.model.WSSystemUser[] getSystemUsersForPerson(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSystemUserService == null)
      _initWSSystemUserServiceProxy();
    return wSSystemUserService.getSystemUsersForPerson(session, personDN);
  }
  
  public void modifyDelegate(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSystemUser delegator, com.ibm.itim.ws.model.WSDelegate oldDelegate, com.ibm.itim.ws.model.WSDelegate newDelegate) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSystemUserService == null)
      _initWSSystemUserServiceProxy();
    wSSystemUserService.modifyDelegate(session, delegator, oldDelegate, newDelegate);
  }
  
  public void removeDelegate(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSystemUser delegator, com.ibm.itim.ws.model.WSDelegate delegate) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSystemUserService == null)
      _initWSSystemUserServiceProxy();
    wSSystemUserService.removeDelegate(session, delegator, delegate);
  }
  
  public com.ibm.itim.ws.model.WSSystemUser[] searchSystemUsers(com.ibm.itim.ws.model.WSSession session, java.lang.String filter) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSystemUserService == null)
      _initWSSystemUserServiceProxy();
    return wSSystemUserService.searchSystemUsers(session, filter);
  }
  
  public void setChallengeResponseInfo(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSChallengeResponseInfo[] newCRs) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSystemUserService == null)
      _initWSSystemUserServiceProxy();
    wSSystemUserService.setChallengeResponseInfo(session, newCRs);
  }
  
  
}