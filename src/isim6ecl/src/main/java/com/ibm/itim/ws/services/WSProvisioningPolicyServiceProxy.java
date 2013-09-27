package com.ibm.itim.ws.services;

public class WSProvisioningPolicyServiceProxy implements com.ibm.itim.ws.services.WSProvisioningPolicyService {
  private String _endpoint = null;
  private com.ibm.itim.ws.services.WSProvisioningPolicyService wSProvisioningPolicyService = null;
  
  public WSProvisioningPolicyServiceProxy() {
    _initWSProvisioningPolicyServiceProxy();
  }
  
  public WSProvisioningPolicyServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSProvisioningPolicyServiceProxy();
  }
  
  private void _initWSProvisioningPolicyServiceProxy() {
    try {
      wSProvisioningPolicyService = (new com.ibm.itim.ws.services.WSProvisioningPolicyServiceServiceLocator()).getWSProvisioningPolicyService();
      if (wSProvisioningPolicyService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSProvisioningPolicyService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSProvisioningPolicyService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSProvisioningPolicyService != null)
      ((javax.xml.rpc.Stub)wSProvisioningPolicyService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.itim.ws.services.WSProvisioningPolicyService getWSProvisioningPolicyService() {
    if (wSProvisioningPolicyService == null)
      _initWSProvisioningPolicyServiceProxy();
    return wSProvisioningPolicyService;
  }
  
  public com.ibm.itim.ws.model.WSRequest createPolicy(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer wsContainer, com.ibm.itim.ws.model.WSProvisioningPolicy policy, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSProvisioningPolicyService == null)
      _initWSProvisioningPolicyServiceProxy();
    return wSProvisioningPolicyService.createPolicy(session, wsContainer, policy, date);
  }
  
  public com.ibm.itim.ws.model.WSRequest deletePolicy(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer wsContainer, java.lang.String policyDN, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSProvisioningPolicyService == null)
      _initWSProvisioningPolicyServiceProxy();
    return wSProvisioningPolicyService.deletePolicy(session, wsContainer, policyDN, date);
  }
  
  public com.ibm.itim.ws.model.WSProvisioningPolicy[] getPolicies(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer wsContainer, java.lang.String policyName) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSProvisioningPolicyService == null)
      _initWSProvisioningPolicyServiceProxy();
    return wSProvisioningPolicyService.getPolicies(session, wsContainer, policyName);
  }
  
  public com.ibm.itim.ws.model.WSRequest modifyPolicy(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer wsContainer, com.ibm.itim.ws.model.WSProvisioningPolicy policy, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException{
    if (wSProvisioningPolicyService == null)
      _initWSProvisioningPolicyServiceProxy();
    return wSProvisioningPolicyService.modifyPolicy(session, wsContainer, policy, date);
  }
  
  
}