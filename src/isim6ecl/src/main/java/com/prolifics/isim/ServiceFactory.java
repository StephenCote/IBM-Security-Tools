package com.prolifics.isim;

import java.rmi.RemoteException;

import com.ibm.itim.ws.exceptions.WSApplicationException;
import com.ibm.itim.ws.exceptions.WSInvalidSessionException;
import com.ibm.itim.ws.exceptions.WSLoginServiceException;
import com.ibm.itim.ws.model.WSAccount;
import com.ibm.itim.ws.model.WSOrganizationalContainer;
import com.ibm.itim.ws.model.WSService;
import com.ibm.itim.ws.model.WSSession;
import com.ibm.itim.ws.services.WSServiceServiceProxy;

public class ServiceFactory {
	public static WSService[] getServices(WSServiceImpl serviceImpl, WSSession session){
		WSService[] services = new WSService[0];
		WSServiceServiceProxy service = serviceImpl.getServiceService();
		try {
			services = service.getServices(session);
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
		return services;
	}
	public static WSAccount[] getAccountsInService(WSServiceImpl serviceImpl, WSSession session, WSService service,String uidFilter){
		WSAccount[] accounts = new WSAccount[0];
		try {
			accounts = serviceImpl.getServiceService().getAccountsForService(session, service.getItimDN(), uidFilter);
			//getAccountService().searchAccounts(session, searchArgs)
		} catch (WSInvalidSessionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WSApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accounts;
	}
	public static WSService getServiceByNameInOrganization(WSServiceImpl serviceImpl, WSSession session, String orgName, String serviceName){
		return getServiceByNameInOrganization(serviceImpl, session, orgName, "OrganizationalUnit",serviceName);
	}
	public static WSService getServiceByNameInOrganization(WSServiceImpl serviceImpl, WSSession session, String orgName, String orgType, String serviceName){
		WSService service = null;
		WSOrganizationalContainer[] match_orgs = OrganizationalContainerFactory.searchOrganizationalContainer(serviceImpl, session, null, orgType, orgName);
		if(match_orgs == null || match_orgs.length != 1){
			System.out.println("No distinct org match for " + orgName);
			return service;
		}
		WSOrganizationalContainer match_org = match_orgs[0];


		WSService[] services = getServices(serviceImpl, session,match_org,"(erservicename=" + serviceName + ")");
		if(services == null || services.length != 1){
			System.out.println("No distinct service match for " + serviceName + " in org " + orgName);
			return service;
		}
		service = services[0];
		return service;
	}
	public static WSService[] getServices(WSServiceImpl serviceImpl, WSSession session, WSOrganizationalContainer org, String filter){
		WSService[] out_service = new WSService[0];
		WSServiceServiceProxy service = serviceImpl.getServiceService();
		try {
			out_service  = service.searchServices(session, org, filter);
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
		if(out_service == null) out_service = new WSService[0];
		return out_service;
	}
}
