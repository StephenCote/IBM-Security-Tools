/**
 * WSOrganizationalContainerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public interface WSOrganizationalContainerService extends java.rmi.Remote {
    public com.ibm.itim.ws.model.WSOrganizationalContainer[] getOrganizations(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSOrganizationalContainer getOrganizationSubTree(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer parent) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSOrganizationalContainer[] getOrganizationTree(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSOrganizationalContainer[] searchContainerByAttribute(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer parent, java.lang.String attributeName, java.lang.String attributeValue) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSOrganizationalContainer[] searchContainerTreeByAttribute(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer wsparent, java.lang.String attributeName, java.lang.String attributeValue) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSOrganizationalContainer[] searchContainerByName(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer parent, java.lang.String profileName, java.lang.String containerName) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSOrganizationalContainer createContainer(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer parent, com.ibm.itim.ws.model.WSOrganizationalContainer newContainer) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public void modifyContainer(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer wsOrgContainer) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public void removeContainer(com.ibm.itim.ws.model.WSSession session, java.lang.String orgContainerDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSOrganizationalContainer lookupContainer(com.ibm.itim.ws.model.WSSession session, java.lang.String orgContainerDN) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
}
