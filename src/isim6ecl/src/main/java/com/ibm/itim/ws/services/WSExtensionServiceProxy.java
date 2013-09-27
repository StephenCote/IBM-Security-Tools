package com.ibm.itim.ws.services;

public class WSExtensionServiceProxy implements com.ibm.itim.ws.services.WSExtensionService {
  private String _endpoint = null;
  private com.ibm.itim.ws.services.WSExtensionService wSExtensionService = null;
  
  public WSExtensionServiceProxy() {
    _initWSExtensionServiceProxy();
  }
  
  public WSExtensionServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSExtensionServiceProxy();
  }
  
  private void _initWSExtensionServiceProxy() {
    try {
      wSExtensionService = (new com.ibm.itim.ws.services.WSExtensionServiceServiceLocator()).getWSExtensionService();
      if (wSExtensionService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSExtensionService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSExtensionService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSExtensionService != null)
      ((javax.xml.rpc.Stub)wSExtensionService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.itim.ws.services.WSExtensionService getWSExtensionService() {
    if (wSExtensionService == null)
      _initWSExtensionServiceProxy();
    return wSExtensionService;
  }
  
  public java.lang.String extendWithXML(com.ibm.itim.ws.model.WSSession session, java.lang.String extensionClassName, java.lang.String methodName, java.lang.String paramsXML) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException{
    if (wSExtensionService == null)
      _initWSExtensionServiceProxy();
    return wSExtensionService.extendWithXML(session, extensionClassName, methodName, paramsXML);
  }
  
  
}