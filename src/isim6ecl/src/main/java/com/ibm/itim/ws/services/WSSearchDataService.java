/**
 * WSSearchDataService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public interface WSSearchDataService extends java.rmi.Remote {
    public com.ibm.itim.ws.model.WSSelectItem[] findSearchControlObjects(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSearchArguments searchArgs) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public java.lang.String[] findSearchFilterObjects(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSSearchArguments searchArgs) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSSelectItem[] getAttributeNames(com.ibm.itim.ws.model.WSSession session, java.lang.String objectclass) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSSelectItem[] getCommonPersonSearchAttributeNames(com.ibm.itim.ws.model.WSSession session) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public java.lang.String[] searchData(com.ibm.itim.ws.model.WSSession session, java.lang.String[] searchParamsArray) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSDelegatePerson[] searchForDelegates(com.ibm.itim.ws.model.WSSession session, java.lang.String filter, java.lang.String[] attrList) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSPerson[] searchPersonsFromRoot(com.ibm.itim.ws.model.WSSession session, java.lang.String filter, java.lang.String[] attrList) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
    public com.ibm.itim.ws.model.WSPerson[] searchPersonsWithITIMAccount(com.ibm.itim.ws.model.WSSession session, java.lang.String filter, java.lang.String[] attrList) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException;
}
