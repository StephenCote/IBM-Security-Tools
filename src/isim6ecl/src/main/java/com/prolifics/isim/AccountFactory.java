package com.prolifics.isim;

import java.rmi.RemoteException;
import java.util.Calendar;

import com.ibm.itim.ws.exceptions.WSApplicationException;
import com.ibm.itim.ws.exceptions.WSInvalidSessionException;
import com.ibm.itim.ws.exceptions.WSLoginServiceException;
import com.ibm.itim.ws.model.WSAccount;
import com.ibm.itim.ws.model.WSAttribute;
import com.ibm.itim.ws.model.WSRequest;
import com.ibm.itim.ws.model.WSService;
import com.ibm.itim.ws.model.WSSession;
import com.ibm.itim.ws.services.WSAccountServiceProxy;

public class AccountFactory {
	public static WSRequest requestAccount(WSServiceImpl serviceImpl, WSSession session, WSService service, WSAttribute[] attrs, Calendar effectiveDate){
		/*
		WSServiceServiceProxy serviceService = getServiceService();
		WSRequestServiceProxy requestService = getRequestService();
		*/
		WSRequest request = null;
		WSAccountServiceProxy accountService = serviceImpl.getAccountService();
		try {
			request = accountService.createAccount(session, service.getItimDN(), attrs, effectiveDate);
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
		return request;

	}
	public static WSAccount[] getAccountsForService(WSServiceImpl serviceImpl, WSSession session, String serviceDN,String uidFilter){
		WSAccount[] accounts = new WSAccount[0];
		try {
			accounts = serviceImpl.getServiceService().getAccountsForService(session, serviceDN, uidFilter);
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
	
	public static WSAccount[] getAccounts(WSServiceImpl serviceImpl, WSSession session, String uid){
		WSAccount[] accounts = new WSAccount[0];
		try {
			
			//serviceImpl.getAccountService().sea
			//serviceImpl.getAccountService().searchAccounts(session, searchArgs);
			accounts = serviceImpl.getServiceService().getAccountsForService(session, null, uid);
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
}
