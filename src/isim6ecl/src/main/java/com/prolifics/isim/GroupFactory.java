package com.prolifics.isim;

import java.rmi.RemoteException;

import com.ibm.itim.ws.exceptions.WSApplicationException;
import com.ibm.itim.ws.exceptions.WSInvalidSessionException;
import com.ibm.itim.ws.exceptions.WSLoginServiceException;
import com.ibm.itim.ws.model.WSGroup;
import com.ibm.itim.ws.model.WSPerson;
import com.ibm.itim.ws.model.WSSession;
import com.ibm.itim.ws.services.WSGroupServiceProxy;
import com.ibm.itim.ws.services.WSPersonServiceProxy;
import com.ibm.itim.ws.services.WSSearchDataServiceProxy;

public class GroupFactory {
	public static WSGroup[] getGroups(WSServiceImpl serviceImpl, WSSession session, String serviceDN){
		WSGroup[] groups = new WSGroup[0];
		WSGroupServiceProxy service = serviceImpl.getGroupService();
		
		try {
			groups = service.getGroupsByService(session, serviceDN, "", "*");
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
		
		return groups;
	}
	
}
