package com.ibm.itim.ws.services;

public class WSRequestServiceProxy implements com.ibm.itim.ws.services.WSRequestService {
  private String _endpoint = null;
  private com.ibm.itim.ws.services.WSRequestService wSRequestService = null;
  
  public WSRequestServiceProxy() {
    _initWSRequestServiceProxy();
  }
  
  public WSRequestServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSRequestServiceProxy();
  }
  
  private void _initWSRequestServiceProxy() {
    try {
      wSRequestService = (new com.ibm.itim.ws.services.WSRequestServiceServiceLocator()).getWSRequestService();
      if (wSRequestService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSRequestService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSRequestService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSRequestService != null)
      ((javax.xml.rpc.Stub)wSRequestService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.itim.ws.services.WSRequestService getWSRequestService() {
    if (wSRequestService == null)
      _initWSRequestServiceProxy();
    return wSRequestService;
  }
  
  public void abortRequest(com.ibm.itim.ws.model.WSSession session, long requestId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSRequestService == null)
      _initWSRequestServiceProxy();
    wSRequestService.abortRequest(session, requestId);
  }
  
  public com.ibm.itim.ws.model.WSActivity[] getActivities(com.ibm.itim.ws.model.WSSession session, long processId, boolean recurseSubProcesses) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSRequestService == null)
      _initWSRequestServiceProxy();
    return wSRequestService.getActivities(session, processId, recurseSubProcesses);
  }
  
  public com.ibm.itim.ws.model.WSRequest[] getChildProcesses(com.ibm.itim.ws.model.WSSession session, long processId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSRequestService == null)
      _initWSRequestServiceProxy();
    return wSRequestService.getChildProcesses(session, processId);
  }
  
  public com.ibm.itim.ws.model.WSRequest[] getCompletedRequests(com.ibm.itim.ws.model.WSSession session, int timeType, int dateIntervalType) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSRequestService == null)
      _initWSRequestServiceProxy();
    return wSRequestService.getCompletedRequests(session, timeType, dateIntervalType);
  }
  
  public com.ibm.itim.ws.model.WSRequest[] getCompletedRequestsPage(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSearchResultsWrapper searchResultsWrapper, int pageNum) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSRequestService == null)
      _initWSRequestServiceProxy();
    return wSRequestService.getCompletedRequestsPage(session, searchResultsWrapper, pageNum);
  }
  
  public com.ibm.itim.ws.model.WSRequest[] getPendingRequests(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSRequestService == null)
      _initWSRequestServiceProxy();
    return wSRequestService.getPendingRequests(session);
  }
  
  public com.ibm.itim.ws.model.WSRequest getProcess(com.ibm.itim.ws.model.WSSession session, long processId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSRequestService == null)
      _initWSRequestServiceProxy();
    return wSRequestService.getProcess(session, processId);
  }
  
  public com.ibm.itim.ws.model.WSRequest getRequest(com.ibm.itim.ws.model.WSSession session, long requestId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSRequestService == null)
      _initWSRequestServiceProxy();
    return wSRequestService.getRequest(session, requestId);
  }
  
  public com.ibm.itim.ws.model.WSSearchResultsWrapper searchCompletedRequests(com.ibm.itim.ws.model.WSSession session, int timeType, int dateIntervalType) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSRequestService == null)
      _initWSRequestServiceProxy();
    return wSRequestService.searchCompletedRequests(session, timeType, dateIntervalType);
  }
  
  
}