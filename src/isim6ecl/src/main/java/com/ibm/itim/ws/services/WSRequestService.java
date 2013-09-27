/**
 * WSRequestService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public interface WSRequestService extends java.rmi.Remote {
    public void abortRequest(com.ibm.itim.ws.model.WSSession session, long requestId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSActivity[] getActivities(com.ibm.itim.ws.model.WSSession session, long processId, boolean recurseSubProcesses) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSRequest[] getChildProcesses(com.ibm.itim.ws.model.WSSession session, long processId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSRequest[] getCompletedRequests(com.ibm.itim.ws.model.WSSession session, int timeType, int dateIntervalType) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSRequest[] getCompletedRequestsPage(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSearchResultsWrapper searchResultsWrapper, int pageNum) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSInvalidSessionException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSRequest[] getPendingRequests(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSRequest getProcess(com.ibm.itim.ws.model.WSSession session, long processId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSRequest getRequest(com.ibm.itim.ws.model.WSSession session, long requestId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSSearchResultsWrapper searchCompletedRequests(com.ibm.itim.ws.model.WSSession session, int timeType, int dateIntervalType) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
}
