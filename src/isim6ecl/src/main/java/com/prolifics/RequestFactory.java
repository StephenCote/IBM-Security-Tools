package com.prolifics;

import java.rmi.RemoteException;

import com.ibm.itim.ws.exceptions.WSApplicationException;
import com.ibm.itim.ws.exceptions.WSLoginServiceException;
import com.ibm.itim.ws.model.WSRequest;
import com.ibm.itim.ws.model.WSSession;
import com.prolifics.isim.WSServiceImpl;

public class RequestFactory {
	public static WSRequest[] getRequests(WSServiceImpl serviceImpl, WSSession session){
		WSRequest[] requests = new WSRequest[0];
		try {
			requests = serviceImpl.getRequestService().getCompletedRequests(session,1,10);



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
		return requests;
	}
}
