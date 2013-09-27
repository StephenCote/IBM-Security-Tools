package com.ibm.itim.ws.services;

public class WSAccessServiceProxy implements com.ibm.itim.ws.services.WSAccessService {
  private String _endpoint = null;
  private com.ibm.itim.ws.services.WSAccessService wSAccessService = null;
  
  public WSAccessServiceProxy() {
    _initWSAccessServiceProxy();
  }
  
  public WSAccessServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSAccessServiceProxy();
  }
  
  private void _initWSAccessServiceProxy() {
    try {
      wSAccessService = (new com.ibm.itim.ws.services.WSAccessServiceServiceLocator()).getWSAccessService();
      if (wSAccessService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSAccessService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSAccessService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSAccessService != null)
      ((javax.xml.rpc.Stub)wSAccessService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.itim.ws.services.WSAccessService getWSAccessService() {
    if (wSAccessService == null)
      _initWSAccessServiceProxy();
    return wSAccessService;
  }
  
  public com.ibm.itim.ws.model.WSRequest[] createAccess(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSAccessEntitlement wsAccessEntitlement, com.ibm.itim.ws.model.WSNewUserAccess[] wsNewUserAccesses, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccessService == null)
      _initWSAccessServiceProxy();
    return wSAccessService.createAccess(session, wsAccessEntitlement, wsNewUserAccesses, date);
  }
  
  public com.ibm.itim.ws.model.WSUserAccess[] getAccesses(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, java.lang.String accessId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccessService == null)
      _initWSAccessServiceProxy();
    return wSAccessService.getAccesses(session, personDN, accessId);
  }
  
  public com.ibm.itim.ws.model.WSRequest removeAccess(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSUserAccess wsUserAccess, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccessService == null)
      _initWSAccessServiceProxy();
    return wSAccessService.removeAccess(session, wsUserAccess, date);
  }
  
  public com.ibm.itim.ws.model.WSAccessEntitlement[] searchAvailableAccessEntitlements(com.ibm.itim.ws.model.WSSession session, java.lang.String containerDN, java.lang.String personDN, java.lang.String accessType, java.lang.String accessInfo) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSAccessService == null)
      _initWSAccessServiceProxy();
    return wSAccessService.searchAvailableAccessEntitlements(session, containerDN, personDN, accessType, accessInfo);
  }
  
  
}