/**
 * WSProvisioningPolicyService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.itim.ws.services;

public interface WSProvisioningPolicyService extends java.rmi.Remote {
    public com.ibm.itim.ws.model.WSRequest createPolicy(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer wsContainer, com.ibm.itim.ws.model.WSProvisioningPolicy policy, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException;
    public com.ibm.itim.ws.model.WSRequest deletePolicy(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer wsContainer, java.lang.String policyDN, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException;
    public com.ibm.itim.ws.model.WSProvisioningPolicy[] getPolicies(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer wsContainer, java.lang.String policyName) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException;
    public com.ibm.itim.ws.model.WSRequest modifyPolicy(com.ibm.itim.ws.model.WSSession session, com.ibm.itim.ws.model.WSOrganizationalContainer wsContainer, com.ibm.itim.ws.model.WSProvisioningPolicy policy, java.util.Calendar date) throws java.rmi.RemoteException, com.ibm.itim.ws.exceptions.WSLoginServiceException, com.ibm.itim.ws.exceptions.WSApplicationException, com.ibm.itim.ws.exceptions.WSUnsupportedVersionException;
}
