package com.ibm.itim.ws.services;

public class WSToDoServiceProxy implements com.ibm.itim.ws.services.WSToDoService {
  private String _endpoint = null;
  private com.ibm.itim.ws.services.WSToDoService wSToDoService = null;
  
  public WSToDoServiceProxy() {
    _initWSToDoServiceProxy();
  }
  
  public WSToDoServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSToDoServiceProxy();
  }
  
  private void _initWSToDoServiceProxy() {
    try {
      wSToDoService = (new com.ibm.itim.ws.services.WSToDoServiceServiceLocator()).getWSToDoService();
      if (wSToDoService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSToDoService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSToDoService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSToDoService != null)
      ((javax.xml.rpc.Stub)wSToDoService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.itim.ws.services.WSToDoService getWSToDoService() {
    if (wSToDoService == null)
      _initWSToDoServiceProxy();
    return wSToDoService;
  }
  
  public void approveOrReject(com.ibm.itim.ws.model.WSSession session, long[] assignmentIds, java.lang.String activityResultStatus, java.lang.String explanation) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSToDoService == null)
      _initWSToDoServiceProxy();
    wSToDoService.approveOrReject(session, assignmentIds, activityResultStatus, explanation);
  }
  
  public void approveOrRejectGroups(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSAssignmentGroup[] wsAssignGrps, java.lang.String activityResultStatus, java.lang.String comment) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSToDoService == null)
      _initWSToDoServiceProxy();
    wSToDoService.approveOrRejectGroups(session, wsAssignGrps, activityResultStatus, comment);
  }
  
  public com.ibm.itim.ws.model.WSEntityWrapper getEntityDetail(com.ibm.itim.ws.model.WSSession session, long assignmentId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSToDoService == null)
      _initWSToDoServiceProxy();
    return wSToDoService.getEntityDetail(session, assignmentId);
  }
  
  public com.ibm.itim.ws.model.WSAssignmentGroup[] getAssignmentGroups(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSToDoService == null)
      _initWSToDoServiceProxy();
    return wSToDoService.getAssignmentGroups(session);
  }
  
  public com.ibm.itim.ws.model.WSAssignment[] getAssignments(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSToDoService == null)
      _initWSToDoServiceProxy();
    return wSToDoService.getAssignments(session);
  }
  
  public com.ibm.itim.ws.model.WSAssignment[] getItemsInAssignmentGroup(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSAssignmentGroup wsAssignGrp) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSToDoService == null)
      _initWSToDoServiceProxy();
    return wSToDoService.getItemsInAssignmentGroup(session, wsAssignGrp);
  }
  
  public com.ibm.itim.ws.model.WSRFIWrapper getRFI(com.ibm.itim.ws.model.WSSession session, long assignmentId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSToDoService == null)
      _initWSToDoServiceProxy();
    return wSToDoService.getRFI(session, assignmentId);
  }
  
  public void submitRFI(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSRFIWrapper rfiWrapper) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSToDoService == null)
      _initWSToDoServiceProxy();
    wSToDoService.submitRFI(session, rfiWrapper);
  }
  
  
}