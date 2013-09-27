package com.ibm.itim.ws.services;

public class WSSharedAccessServiceProxy implements com.ibm.itim.ws.services.WSSharedAccessService_PortType {
  private String _endpoint = null;
  private com.ibm.itim.ws.services.WSSharedAccessService_PortType wSSharedAccessService_PortType = null;
  
  public WSSharedAccessServiceProxy() {
    _initWSSharedAccessServiceProxy();
  }
  
  public WSSharedAccessServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSSharedAccessServiceProxy();
  }
  
  private void _initWSSharedAccessServiceProxy() {
    try {
      wSSharedAccessService_PortType = (new com.ibm.itim.ws.services.WSSharedAccessService_ServiceLocator()).getWSSharedAccess();
      if (wSSharedAccessService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSSharedAccessService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSSharedAccessService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSSharedAccessService_PortType != null)
      ((javax.xml.rpc.Stub)wSSharedAccessService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.itim.ws.services.WSSharedAccessService_PortType getWSSharedAccessService_PortType() {
    if (wSSharedAccessService_PortType == null)
      _initWSSharedAccessServiceProxy();
    return wSSharedAccessService_PortType;
  }
  
  public com.ibm.itim.ws.model.WSSession login(java.lang.String userID, java.lang.String password) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException{
    if (wSSharedAccessService_PortType == null)
      _initWSSharedAccessServiceProxy();
    return wSSharedAccessService_PortType.login(userID, password);
  }
  
  public void logout(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException{
    if (wSSharedAccessService_PortType == null)
      _initWSSharedAccessServiceProxy();
    wSSharedAccessService_PortType.logout(session);
  }
  
  public com.ibm.itim.ws.model.pim.WSSharedAccess[] getAuthorizedSharedAccess(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceURI) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException{
    if (wSSharedAccessService_PortType == null)
      _initWSSharedAccessServiceProxy();
    return wSSharedAccessService_PortType.getAuthorizedSharedAccess(session, serviceURI);
  }
  
  public com.ibm.itim.ws.model.pim.WSSharedAccess[] getAuthorizedSharedAccessByServiceDN(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException{
    if (wSSharedAccessService_PortType == null)
      _initWSSharedAccessServiceProxy();
    return wSSharedAccessService_PortType.getAuthorizedSharedAccessByServiceDN(session, serviceDN);
  }
  
  public com.ibm.itim.ws.model.pim.WSSharedAccess[] getAllAuthorizedSharedAccess(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceURI) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException{
    if (wSSharedAccessService_PortType == null)
      _initWSSharedAccessServiceProxy();
    return wSSharedAccessService_PortType.getAllAuthorizedSharedAccess(session, serviceURI);
  }
  
  public com.ibm.itim.ws.model.pim.WSSharedAccess[] getAllAuthorizedSharedAccessByServiceDN(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException{
    if (wSSharedAccessService_PortType == null)
      _initWSSharedAccessServiceProxy();
    return wSSharedAccessService_PortType.getAllAuthorizedSharedAccessByServiceDN(session, serviceDN);
  }
  
  public com.ibm.itim.ws.model.pim.WSCredential getCredential(com.ibm.itim.ws.model.WSSession session, java.lang.String credCompDN, java.lang.String justification, java.math.BigInteger duration) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException{
    if (wSSharedAccessService_PortType == null)
      _initWSSharedAccessServiceProxy();
    return wSSharedAccessService_PortType.getCredential(session, credCompDN, justification, duration);
  }
  
  public com.ibm.itim.ws.model.pim.WSCredentialAttributes getCredentialAttributes(com.ibm.itim.ws.model.WSSession session, java.lang.String credCompDN, java.lang.String[] attributeNames, java.lang.String justification, java.math.BigInteger duration) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException{
    if (wSSharedAccessService_PortType == null)
      _initWSSharedAccessServiceProxy();
    return wSSharedAccessService_PortType.getCredentialAttributes(session, credCompDN, attributeNames, justification, duration);
  }
  
  public java.lang.String checkIn(com.ibm.itim.ws.model.WSSession session, java.lang.String leaseDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException{
    if (wSSharedAccessService_PortType == null)
      _initWSSharedAccessServiceProxy();
    return wSSharedAccessService_PortType.checkIn(session, leaseDN);
  }
  
  public java.lang.String[] checkInAllIDs(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException{
    if (wSSharedAccessService_PortType == null)
      _initWSSharedAccessServiceProxy();
    return wSSharedAccessService_PortType.checkInAllIDs(session);
  }
  
  public com.ibm.itim.ws.model.pim.WSCredential checkoutWithoutWorkflow(com.ibm.itim.ws.model.WSSession session, java.lang.String credCompDN, java.lang.String justification, java.math.BigInteger duration) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException{
    if (wSSharedAccessService_PortType == null)
      _initWSSharedAccessServiceProxy();
    return wSSharedAccessService_PortType.checkoutWithoutWorkflow(session, credCompDN, justification, duration);
  }
  
  public void checkout(com.ibm.itim.ws.model.WSSession session, java.lang.String credCompDN, java.lang.String justification, java.math.BigInteger duration, com.ibm.itim.ws.model.pim.holders.WSCredentialHolder credential, javax.xml.rpc.holders.StringHolder requestId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.pim.WSExtApplicationException, com.ibm.itim.ws.exceptions.pim.WSExtLoginServiceException{
    if (wSSharedAccessService_PortType == null)
      _initWSSharedAccessServiceProxy();
    wSSharedAccessService_PortType.checkout(session, credCompDN, justification, duration, credential, requestId);
  }
  
  
}