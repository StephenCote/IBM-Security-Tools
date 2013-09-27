package com.prolifics.isim;

import java.rmi.RemoteException;

import com.ibm.itim.ws.exceptions.WSApplicationException;
import com.ibm.itim.ws.exceptions.WSLoginServiceException;
import com.ibm.itim.ws.model.WSOrganizationalContainer;
import com.ibm.itim.ws.model.WSSession;

public class OrganizationalContainerFactory {
	public static WSOrganizationalContainer[] getOrganizationalContainers(WSServiceImpl serviceImpl, WSSession session){
		WSOrganizationalContainer[] orgs = new WSOrganizationalContainer[0];
		try {
			orgs = serviceImpl.getOrganizationalContainerService().getOrganizations(session);
		} catch (WSLoginServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WSApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orgs;
	}
	public static WSOrganizationalContainer getOrganizationalContainerSubTree(WSServiceImpl serviceImpl, WSSession session, WSOrganizationalContainer parent){
		WSOrganizationalContainer org = null;
		try {
			org = serviceImpl.getOrganizationalContainerService().getOrganizationSubTree(session, parent);
		} catch (WSLoginServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WSApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return org;
	}

	public static WSOrganizationalContainer[] searchOrganizationalContainer(WSServiceImpl serviceImpl, WSSession session, WSOrganizationalContainer parent, String profileName, String name){
		WSOrganizationalContainer[] org = null;
		try {
			org = serviceImpl.getOrganizationalContainerService().searchContainerByName(session, parent, profileName, name);
		} catch (WSLoginServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WSApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return org;
	}
}
