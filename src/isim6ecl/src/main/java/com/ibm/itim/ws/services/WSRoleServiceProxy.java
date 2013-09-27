package com.ibm.itim.ws.services;

public class WSRoleServiceProxy implements com.ibm.itim.ws.services.WSRoleService {
  private String _endpoint = null;
  private com.ibm.itim.ws.services.WSRoleService wSRoleService = null;
  
  public WSRoleServiceProxy() {
    _initWSRoleServiceProxy();
  }
  
  public WSRoleServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSRoleServiceProxy();
  }
  
  private void _initWSRoleServiceProxy() {
    try {
      wSRoleService = (new com.ibm.itim.ws.services.WSRoleServiceServiceLocator()).getWSRoleService();
      if (wSRoleService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSRoleService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSRoleService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSRoleService != null)
      ((javax.xml.rpc.Stub)wSRoleService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.itim.ws.services.WSRoleService getWSRoleService() {
    if (wSRoleService == null)
      _initWSRoleServiceProxy();
    return wSRoleService;
  }
  
  public com.ibm.itim.ws.model.WSRole createStaticRole(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer wsContainer, com.ibm.itim.ws.model.WSRole wsRole) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSRoleService == null)
      _initWSRoleServiceProxy();
    return wSRoleService.createStaticRole(session, wsContainer, wsRole);
  }
  
  public com.ibm.itim.ws.model.WSRole[] getMemberRoles(com.ibm.itim.ws.model.WSSession session, java.lang.String roleDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSRoleService == null)
      _initWSRoleServiceProxy();
    return wSRoleService.getMemberRoles(session, roleDN);
  }
  
  public com.ibm.itim.ws.model.WSRole lookupRole(com.ibm.itim.ws.model.WSSession session, java.lang.String roleDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSRoleService == null)
      _initWSRoleServiceProxy();
    return wSRoleService.lookupRole(session, roleDN);
  }
  
  public com.ibm.itim.ws.model.WSRole lookupSystemRole(com.ibm.itim.ws.model.WSSession session, java.lang.String roleDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSRoleService == null)
      _initWSRoleServiceProxy();
    return wSRoleService.lookupSystemRole(session, roleDN);
  }
  
  public void modifyStaticRole(com.ibm.itim.ws.model.WSSession session, java.lang.String roleDN, com.ibm.itim.ws.model.WSAttribute[] modifiedAttributes) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSRoleService == null)
      _initWSRoleServiceProxy();
    wSRoleService.modifyStaticRole(session, roleDN, modifiedAttributes);
  }
  
  public com.ibm.itim.ws.model.WSRole[] searchForRolesInContainer(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer wsContainer, java.lang.String filter) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSRoleService == null)
      _initWSRoleServiceProxy();
    return wSRoleService.searchForRolesInContainer(session, wsContainer, filter);
  }
  
  public com.ibm.itim.ws.model.WSRole[] searchRoles(com.ibm.itim.ws.model.WSSession session, java.lang.String filter) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSRoleService == null)
      _initWSRoleServiceProxy();
    return wSRoleService.searchRoles(session, filter);
  }
  
  public com.ibm.itim.ws.model.WSRequest updateRoleHierarchy(com.ibm.itim.ws.model.WSSession session, java.lang.String roleDN, java.lang.String[] rolesAddedDN, java.lang.String[] rolesDeletedDN, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSRoleService == null)
      _initWSRoleServiceProxy();
    return wSRoleService.updateRoleHierarchy(session, roleDN, rolesAddedDN, rolesDeletedDN, date);
  }
  
  
}