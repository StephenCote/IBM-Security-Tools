package com.ibm.itim.ws.services;

public class WSGroupServiceProxy implements com.ibm.itim.ws.services.WSGroupService {
  private String _endpoint = null;
  private com.ibm.itim.ws.services.WSGroupService wSGroupService = null;
  
  public WSGroupServiceProxy() {
    _initWSGroupServiceProxy();
  }
  
  public WSGroupServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSGroupServiceProxy();
  }
  
  private void _initWSGroupServiceProxy() {
    try {
      wSGroupService = (new com.ibm.itim.ws.services.WSGroupServiceServiceLocator()).getWSGroupService();
      if (wSGroupService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSGroupService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSGroupService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSGroupService != null)
      ((javax.xml.rpc.Stub)wSGroupService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.itim.ws.services.WSGroupService getWSGroupService() {
    if (wSGroupService == null)
      _initWSGroupServiceProxy();
    return wSGroupService;
  }
  
  public com.ibm.itim.ws.model.WSRequest[] addGroupMembers(com.ibm.itim.ws.model.WSSession session, java.lang.String groupDN, java.lang.String[] accountDNs, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSGroupService == null)
      _initWSGroupServiceProxy();
    return wSGroupService.addGroupMembers(session, groupDN, accountDNs, date);
  }
  
  public java.lang.String createGroup(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSGroup wsGroup) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSGroupService == null)
      _initWSGroupServiceProxy();
    return wSGroupService.createGroup(session, wsGroup);
  }
  
  public com.ibm.itim.ws.model.WSAccount[] getGroupMembers(com.ibm.itim.ws.model.WSSession session, java.lang.String groupDN, java.lang.String userId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSGroupService == null)
      _initWSGroupServiceProxy();
    return wSGroupService.getGroupMembers(session, groupDN, userId);
  }
  
  public com.ibm.itim.ws.model.WSGroup[] getGroupsByAccess(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN, java.lang.String groupProfileName, java.lang.String accessInfo) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSGroupService == null)
      _initWSGroupServiceProxy();
    return wSGroupService.getGroupsByAccess(session, serviceDN, groupProfileName, accessInfo);
  }
  
  public com.ibm.itim.ws.model.WSGroup[] getGroupsByAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSGroupService == null)
      _initWSGroupServiceProxy();
    return wSGroupService.getGroupsByAccount(session, accountDN);
  }
  
  public com.ibm.itim.ws.model.WSGroup[] getGroupsByService(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN, java.lang.String groupProfileName, java.lang.String groupInfo) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSGroupService == null)
      _initWSGroupServiceProxy();
    return wSGroupService.getGroupsByService(session, serviceDN, groupProfileName, groupInfo);
  }
  
  public com.ibm.itim.ws.model.WSGroup lookupGroup(com.ibm.itim.ws.model.WSSession session, java.lang.String groupDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSGroupService == null)
      _initWSGroupServiceProxy();
    return wSGroupService.lookupGroup(session, groupDN);
  }
  
  public void removeGroup(com.ibm.itim.ws.model.WSSession session, java.lang.String groupDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSGroupService == null)
      _initWSGroupServiceProxy();
    wSGroupService.removeGroup(session, groupDN);
  }
  
  public com.ibm.itim.ws.model.WSRequest[] removeGroupMembers(com.ibm.itim.ws.model.WSSession session, java.lang.String groupDN, java.lang.String[] accountDNs, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSGroupService == null)
      _initWSGroupServiceProxy();
    return wSGroupService.removeGroupMembers(session, groupDN, accountDNs, date);
  }
  
  
}