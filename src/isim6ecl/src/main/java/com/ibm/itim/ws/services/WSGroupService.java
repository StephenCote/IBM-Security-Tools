/**
 * WSGroupService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public interface WSGroupService extends java.rmi.Remote {
    public com.ibm.itim.ws.model.WSRequest[] addGroupMembers(com.ibm.itim.ws.model.WSSession session, java.lang.String groupDN, java.lang.String[] accountDNs, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException;
    public java.lang.String createGroup(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSGroup wsGroup) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException;
    public com.ibm.itim.ws.model.WSAccount[] getGroupMembers(com.ibm.itim.ws.model.WSSession session, java.lang.String groupDN, java.lang.String userId) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException;
    public com.ibm.itim.ws.model.WSGroup[] getGroupsByAccess(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN, java.lang.String groupProfileName, java.lang.String accessInfo) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException;
    public com.ibm.itim.ws.model.WSGroup[] getGroupsByAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String accountDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException;
    public com.ibm.itim.ws.model.WSGroup[] getGroupsByService(com.ibm.itim.ws.model.WSSession session, java.lang.String serviceDN, java.lang.String groupProfileName, java.lang.String groupInfo) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException;
    public com.ibm.itim.ws.model.WSGroup lookupGroup(com.ibm.itim.ws.model.WSSession session, java.lang.String groupDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException;
    public void removeGroup(com.ibm.itim.ws.model.WSSession session, java.lang.String groupDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException;
    public com.ibm.itim.ws.model.WSRequest[] removeGroupMembers(com.ibm.itim.ws.model.WSSession session, java.lang.String groupDN, java.lang.String[] accountDNs, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException;
}
