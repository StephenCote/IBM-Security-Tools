package com.ibm.itim.ws.services;

public class WSSearchDataServiceProxy implements com.ibm.itim.ws.services.WSSearchDataService {
  private String _endpoint = null;
  private com.ibm.itim.ws.services.WSSearchDataService wSSearchDataService = null;
  
  public WSSearchDataServiceProxy() {
    _initWSSearchDataServiceProxy();
  }
  
  public WSSearchDataServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSSearchDataServiceProxy();
  }
  
  private void _initWSSearchDataServiceProxy() {
    try {
      wSSearchDataService = (new com.ibm.itim.ws.services.WSSearchDataServiceServiceLocator()).getWSSearchDataService();
      if (wSSearchDataService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSSearchDataService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSSearchDataService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSSearchDataService != null)
      ((javax.xml.rpc.Stub)wSSearchDataService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.itim.ws.services.WSSearchDataService getWSSearchDataService() {
    if (wSSearchDataService == null)
      _initWSSearchDataServiceProxy();
    return wSSearchDataService;
  }
  
  public com.ibm.itim.ws.model.WSSelectItem[] findSearchControlObjects(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSearchArguments searchArgs) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSearchDataService == null)
      _initWSSearchDataServiceProxy();
    return wSSearchDataService.findSearchControlObjects(session, searchArgs);
  }
  
  public java.lang.String[] findSearchFilterObjects(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSearchArguments searchArgs) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSearchDataService == null)
      _initWSSearchDataServiceProxy();
    return wSSearchDataService.findSearchFilterObjects(session, searchArgs);
  }
  
  public com.ibm.itim.ws.model.WSSelectItem[] getAttributeNames(com.ibm.itim.ws.model.WSSession session, java.lang.String objectclass) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSearchDataService == null)
      _initWSSearchDataServiceProxy();
    return wSSearchDataService.getAttributeNames(session, objectclass);
  }
  
  public com.ibm.itim.ws.model.WSSelectItem[] getCommonPersonSearchAttributeNames(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSearchDataService == null)
      _initWSSearchDataServiceProxy();
    return wSSearchDataService.getCommonPersonSearchAttributeNames(session);
  }
  
  public java.lang.String[] searchData(com.ibm.itim.ws.model.WSSession session, java.lang.String[] searchParamsArray) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSearchDataService == null)
      _initWSSearchDataServiceProxy();
    return wSSearchDataService.searchData(session, searchParamsArray);
  }
  
  public com.ibm.itim.ws.model.WSDelegatePerson[] searchForDelegates(com.ibm.itim.ws.model.WSSession session, java.lang.String filter, java.lang.String[] attrList) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSearchDataService == null)
      _initWSSearchDataServiceProxy();
    return wSSearchDataService.searchForDelegates(session, filter, attrList);
  }
  
  public com.ibm.itim.ws.model.WSPerson[] searchPersonsFromRoot(com.ibm.itim.ws.model.WSSession session, java.lang.String filter, java.lang.String[] attrList) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSearchDataService == null)
      _initWSSearchDataServiceProxy();
    return wSSearchDataService.searchPersonsFromRoot(session, filter, attrList);
  }
  
  public com.ibm.itim.ws.model.WSPerson[] searchPersonsWithITIMAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String filter, java.lang.String[] attrList) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSSearchDataService == null)
      _initWSSearchDataServiceProxy();
    return wSSearchDataService.searchPersonsWithITIMAccount(session, filter, attrList);
  }
  
  
}