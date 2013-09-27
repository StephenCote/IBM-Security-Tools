package com.prolifics.isim;

import java.rmi.RemoteException;

import com.ibm.itim.ws.exceptions.WSInvalidLoginException;
import com.ibm.itim.ws.exceptions.WSLoginServiceException;
import com.ibm.itim.ws.model.WSSession;
import com.ibm.itim.ws.services.WSSessionServiceProxy;

public class SessionFactory {
	public static boolean logout(WSServiceImpl serviceImpl, WSSession sess){
		boolean out_bool = false;
		WSSessionServiceProxy service = serviceImpl.getSessionService();
		try {
			service.logout(sess);
			out_bool = true;
		} catch (WSLoginServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return out_bool;
	}
	public static WSSession login(WSServiceImpl serviceImpl, String userName, String password){
		WSSession out_sess = null;
		WSSessionServiceProxy service = serviceImpl.getSessionService();
		try {
			out_sess = service.login(userName, password);
		} catch (WSInvalidLoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WSLoginServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return out_sess;
	
	}
}
