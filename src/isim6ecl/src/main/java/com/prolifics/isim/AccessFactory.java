package com.prolifics.isim;

import java.rmi.RemoteException;

import com.ibm.itim.ws.exceptions.WSApplicationException;
import com.ibm.itim.ws.exceptions.WSLoginServiceException;
import com.ibm.itim.ws.model.WSAccessEntitlement;
import com.ibm.itim.ws.model.WSOrganizationalContainer;
import com.ibm.itim.ws.model.WSPerson;
import com.ibm.itim.ws.model.WSSession;

public class AccessFactory {
	public static WSAccessEntitlement[] getAccesses(WSServiceImpl serviceImpl, WSSession session, WSOrganizationalContainer cont, WSPerson refPerson){
		WSAccessEntitlement[] acls = new WSAccessEntitlement[0];
		try {
			//serviceImpl.getAccessService().
			
			acls = serviceImpl.getAccessService().searchAvailableAccessEntitlements(session,cont.getItimDN(), refPerson.getItimDN(), "*", "*");
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
		if(acls == null) acls = new WSAccessEntitlement[0];
		return acls;
	}
}
