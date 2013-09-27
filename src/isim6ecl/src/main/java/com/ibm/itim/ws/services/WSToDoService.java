/**
 * WSToDoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public interface WSToDoService extends java.rmi.Remote {
    public void approveOrReject(com.ibm.itim.ws.model.WSSession session, long[] assignmentIds, java.lang.String activityResultStatus, java.lang.String explanation) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public void approveOrRejectGroups(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSAssignmentGroup[] wsAssignGrps, java.lang.String activityResultStatus, java.lang.String comment) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSEntityWrapper getEntityDetail(com.ibm.itim.ws.model.WSSession session, long assignmentId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSAssignmentGroup[] getAssignmentGroups(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSAssignment[] getAssignments(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSAssignment[] getItemsInAssignmentGroup(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSAssignmentGroup wsAssignGrp) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSRFIWrapper getRFI(com.ibm.itim.ws.model.WSSession session, long assignmentId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public void submitRFI(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSRFIWrapper rfiWrapper) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
}
