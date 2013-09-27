package com.ibm.itim.ws.services;

public class WSPersonServiceProxy implements com.ibm.itim.ws.services.WSPersonService {
  private String _endpoint = null;
  private com.ibm.itim.ws.services.WSPersonService wSPersonService = null;
  
  public WSPersonServiceProxy() {
    _initWSPersonServiceProxy();
  }
  
  public WSPersonServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSPersonServiceProxy();
  }
  
  private void _initWSPersonServiceProxy() {
    try {
      wSPersonService = (new com.ibm.itim.ws.services.WSPersonServiceServiceLocator()).getWSPersonService();
      if (wSPersonService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSPersonService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSPersonService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSPersonService != null)
      ((javax.xml.rpc.Stub)wSPersonService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.itim.ws.services.WSPersonService getWSPersonService() {
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService;
  }
  
  public com.ibm.itim.ws.model.WSRequest addRole(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, java.lang.String roleDN, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.addRole(session, personDN, roleDN, date);
  }
  
  public com.ibm.itim.ws.model.WSRequest addRolesToPerson(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, java.lang.String[] roleDNs, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.addRolesToPerson(session, personDN, roleDNs, date);
  }
  
  public com.ibm.itim.ws.model.WSRequest createPerson(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer wsContainer, com.ibm.itim.ws.model.WSPerson wsPerson, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.createPerson(session, wsContainer, wsPerson, date);
  }
  
  public com.ibm.itim.ws.model.WSRequest deletePerson(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.deletePerson(session, personDN, date);
  }
  
  public com.ibm.itim.ws.model.WSAccount[] getAccountsByOwner(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.getAccountsByOwner(session, personDN);
  }
  
  public java.lang.String[] getAuthorizedPersonProfilesForCreate(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer wsContainer) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.getAuthorizedPersonProfilesForCreate(session, wsContainer);
  }
  
  public com.ibm.itim.ws.model.WSService[] getAuthorizedServices(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.getAuthorizedServices(session, personDN);
  }
  
  public com.ibm.itim.ws.model.WSAccount[] getFilteredAccountsByOwner(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, com.ibm.itim.ws.model.WSAttribute filterAttribute) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.getFilteredAccountsByOwner(session, personDN, filterAttribute);
  }
  
  public com.ibm.itim.ws.model.WSService[] getFilteredAuthorizedServices(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, com.ibm.itim.ws.model.WSAttribute filterAttribute) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.getFilteredAuthorizedServices(session, personDN, filterAttribute);
  }
  
  public com.ibm.itim.ws.model.WSRole[] getPersonRoles(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.getPersonRoles(session, personDN);
  }
  
  public com.ibm.itim.ws.model.WSPerson getPrincipalPerson(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.getPrincipalPerson(session);
  }
  
  public boolean isCreatePersonAllowed(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.isCreatePersonAllowed(session);
  }
  
  public boolean isMemberOfRole(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, java.lang.String roleDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.isMemberOfRole(session, personDN, roleDN);
  }
  
  public com.ibm.itim.ws.model.WSPerson lookupPerson(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.lookupPerson(session, personDN);
  }
  
  public com.ibm.itim.ws.model.WSRequest modifyPerson(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, com.ibm.itim.ws.model.WSAttribute[] wsAttrs, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.modifyPerson(session, personDN, wsAttrs, date);
  }
  
  public com.ibm.itim.ws.model.WSRequest removeRole(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, java.lang.String roleDN, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.removeRole(session, personDN, roleDN, date);
  }
  
  public com.ibm.itim.ws.model.WSRequest removeRolesFromPerson(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, java.lang.String[] roleDNs, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.removeRolesFromPerson(session, personDN, roleDNs, date);
  }
  
  public com.ibm.itim.ws.model.WSRequest restorePerson(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, boolean restoreAccounts, java.lang.String password, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.restorePerson(session, personDN, restoreAccounts, password, date);
  }
  
  public com.ibm.itim.ws.model.WSPerson[] searchPersonsFromRoot(com.ibm.itim.ws.model.WSSession session, java.lang.String filter, java.lang.String[] attrList) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.searchPersonsFromRoot(session, filter, attrList);
  }
  
  public com.ibm.itim.ws.model.WSPerson[] searchPersonsWithITIMAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String filter, java.lang.String[] attrList) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.searchPersonsWithITIMAccount(session, filter, attrList);
  }
  
  public void selfRegister(com.ibm.itim.ws.model.WSPerson wsPerson, java.lang.String tenantId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    wSPersonService.selfRegister(wsPerson, tenantId);
  }
  
  public com.ibm.itim.ws.model.WSRequest suspendPerson(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.suspendPerson(session, personDN);
  }
  
  public com.ibm.itim.ws.model.WSRequest suspendPersonAdvanced(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, boolean includeAccounts, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.suspendPersonAdvanced(session, personDN, includeAccounts, date);
  }
  
  public com.ibm.itim.ws.model.WSRequest synchGeneratedPassword(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.synchGeneratedPassword(session, personDN, date);
  }
  
  public com.ibm.itim.ws.model.WSRequest synchPasswords(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, java.lang.String password, java.util.Calendar date, boolean notifyByMail) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.synchPasswords(session, personDN, password, date, notifyByMail);
  }
  
  public com.ibm.itim.ws.model.WSRequest transferPerson(com.ibm.itim.ws.model.WSSession session, java.lang.String personDN, com.ibm.itim.ws.model.WSOrganizationalContainer targetContainer, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSPersonService == null)
      _initWSPersonServiceProxy();
    return wSPersonService.transferPerson(session, personDN, targetContainer, date);
  }
  
  
}