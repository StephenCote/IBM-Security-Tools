package com.ibm.itim.ws.services;

public class WSServiceServiceProxy implements com.ibm.itim.ws.services.WSServiceService {
  private String _endpoint = null;
  private com.ibm.itim.ws.services.WSServiceService wSServiceService = null;
  
  public WSServiceServiceProxy() {
    _initWSServiceServiceProxy();
  }
  
  public WSServiceServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSServiceServiceProxy();
  }
  
  private void _initWSServiceServiceProxy() {
    try {
      wSServiceService = (new com.ibm.itim.ws.services.WSServiceServiceServiceLocator()).getWSServiceService();
      if (wSServiceService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSServiceService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSServiceService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSServiceService != null)
      ((javax.xml.rpc.Stub)wSServiceService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.itim.ws.services.WSServiceService getWSServiceService() {
    if (wSServiceService == null)
      _initWSServiceServiceProxy();
    return wSServiceService;
  }
  
  public java.lang.String createService(com.ibm.itim.ws.model.WSSession session, java.lang.String containerDN, java.lang.String profileName, com.ibm.itim.ws.model.WSAttribute[] serviceAttributes) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSServiceService == null)
      _initWSServiceServiceProxy();
    return wSServiceService.createService(session, containerDN, profileName, serviceAttributes);
  }
  
  public com.ibm.itim.ws.model.WSAccount[] getAccountsForService(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN, java.lang.String accountID) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSServiceService == null)
      _initWSServiceServiceProxy();
    return wSServiceService.getAccountsForService(session, serviceDN, accountID);
  }
  
  public com.ibm.itim.ws.model.WSService getServiceForAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSServiceService == null)
      _initWSServiceServiceProxy();
    return wSServiceService.getServiceForAccount(session, accountDN);
  }
  
  public com.ibm.itim.ws.model.WSService[] getServices(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSServiceService == null)
      _initWSServiceServiceProxy();
    return wSServiceService.getServices(session);
  }
  
  public com.ibm.itim.ws.model.WSObject[] getSupportingData(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN, java.lang.String searchFilter, com.ibm.itim.ws.model.WSAttribute[] attrs) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSServiceService == null)
      _initWSServiceServiceProxy();
    return wSServiceService.getSupportingData(session, serviceDN, searchFilter, attrs);
  }
  
  public com.ibm.itim.ws.model.WSObject[] getSupportingDataEntries(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN, java.lang.String searchFilter) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSServiceService == null)
      _initWSServiceServiceProxy();
    return wSServiceService.getSupportingDataEntries(session, serviceDN, searchFilter);
  }
  
  public boolean isPasswordRequired(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSServiceService == null)
      _initWSServiceServiceProxy();
    return wSServiceService.isPasswordRequired(session, serviceDN);
  }
  
  public com.ibm.itim.ws.model.WSService lookupService(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSServiceService == null)
      _initWSServiceServiceProxy();
    return wSServiceService.lookupService(session, serviceDN);
  }
  
  public void modifyService(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN, com.ibm.itim.ws.model.WSAttribute[] wsAttrs) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSServiceService == null)
      _initWSServiceServiceProxy();
    wSServiceService.modifyService(session, serviceDN, wsAttrs);
  }
  
  public com.ibm.itim.ws.model.WSService[] searchServices(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer wscontainer, java.lang.String filter) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSServiceService == null)
      _initWSServiceServiceProxy();
    return wSServiceService.searchServices(session, wscontainer, filter);
  }
  
  public int testCommunications(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSServiceService == null)
      _initWSServiceServiceProxy();
    return wSServiceService.testCommunications(session, serviceDN);
  }
  
  
}