package com.ibm.itim.ws.services;

public class WSOrganizationalContainerServiceProxy implements com.ibm.itim.ws.services.WSOrganizationalContainerService {
  private String _endpoint = null;
  private com.ibm.itim.ws.services.WSOrganizationalContainerService wSOrganizationalContainerService = null;
  
  public WSOrganizationalContainerServiceProxy() {
    _initWSOrganizationalContainerServiceProxy();
  }
  
  public WSOrganizationalContainerServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSOrganizationalContainerServiceProxy();
  }
  
  private void _initWSOrganizationalContainerServiceProxy() {
    try {
      wSOrganizationalContainerService = (new com.ibm.itim.ws.services.WSOrganizationalContainerServiceServiceLocator()).getWSOrganizationalContainerService();
      if (wSOrganizationalContainerService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSOrganizationalContainerService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSOrganizationalContainerService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSOrganizationalContainerService != null)
      ((javax.xml.rpc.Stub)wSOrganizationalContainerService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.itim.ws.services.WSOrganizationalContainerService getWSOrganizationalContainerService() {
    if (wSOrganizationalContainerService == null)
      _initWSOrganizationalContainerServiceProxy();
    return wSOrganizationalContainerService;
  }
  
  public com.ibm.itim.ws.model.WSOrganizationalContainer[] getOrganizations(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSOrganizationalContainerService == null)
      _initWSOrganizationalContainerServiceProxy();
    return wSOrganizationalContainerService.getOrganizations(session);
  }
  
  public com.ibm.itim.ws.model.WSOrganizationalContainer getOrganizationSubTree(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer parent) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSOrganizationalContainerService == null)
      _initWSOrganizationalContainerServiceProxy();
    return wSOrganizationalContainerService.getOrganizationSubTree(session, parent);
  }
  
  public com.ibm.itim.ws.model.WSOrganizationalContainer[] getOrganizationTree(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSOrganizationalContainerService == null)
      _initWSOrganizationalContainerServiceProxy();
    return wSOrganizationalContainerService.getOrganizationTree(session);
  }
  
  public com.ibm.itim.ws.model.WSOrganizationalContainer[] searchContainerByAttribute(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer parent, java.lang.String attributeName, java.lang.String attributeValue) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSOrganizationalContainerService == null)
      _initWSOrganizationalContainerServiceProxy();
    return wSOrganizationalContainerService.searchContainerByAttribute(session, parent, attributeName, attributeValue);
  }
  
  public com.ibm.itim.ws.model.WSOrganizationalContainer[] searchContainerTreeByAttribute(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer wsparent, java.lang.String attributeName, java.lang.String attributeValue) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSOrganizationalContainerService == null)
      _initWSOrganizationalContainerServiceProxy();
    return wSOrganizationalContainerService.searchContainerTreeByAttribute(session, wsparent, attributeName, attributeValue);
  }
  
  public com.ibm.itim.ws.model.WSOrganizationalContainer[] searchContainerByName(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer parent, java.lang.String profileName, java.lang.String containerName) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSOrganizationalContainerService == null)
      _initWSOrganizationalContainerServiceProxy();
    return wSOrganizationalContainerService.searchContainerByName(session, parent, profileName, containerName);
  }
  
  public com.ibm.itim.ws.model.WSOrganizationalContainer createContainer(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer parent, com.ibm.itim.ws.model.WSOrganizationalContainer newContainer) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSOrganizationalContainerService == null)
      _initWSOrganizationalContainerServiceProxy();
    return wSOrganizationalContainerService.createContainer(session, parent, newContainer);
  }
  
  public void modifyContainer(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer wsOrgContainer) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSOrganizationalContainerService == null)
      _initWSOrganizationalContainerServiceProxy();
    wSOrganizationalContainerService.modifyContainer(session, wsOrgContainer);
  }
  
  public void removeContainer(com.ibm.itim.ws.model.WSSession session, java.lang.String orgContainerDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSOrganizationalContainerService == null)
      _initWSOrganizationalContainerServiceProxy();
    wSOrganizationalContainerService.removeContainer(session, orgContainerDN);
  }
  
  public com.ibm.itim.ws.model.WSOrganizationalContainer lookupContainer(com.ibm.itim.ws.model.WSSession session, java.lang.String orgContainerDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSOrganizationalContainerService == null)
      _initWSOrganizationalContainerServiceProxy();
    return wSOrganizationalContainerService.lookupContainer(session, orgContainerDN);
  }
  
  
}