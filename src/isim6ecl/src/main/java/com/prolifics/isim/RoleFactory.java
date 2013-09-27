package com.prolifics.isim;

import java.rmi.RemoteException;

import com.ibm.itim.ws.exceptions.WSApplicationException;
import com.ibm.itim.ws.exceptions.WSInvalidSessionException;
import com.ibm.itim.ws.exceptions.WSLoginServiceException;
import com.ibm.itim.ws.model.WSRole;
import com.ibm.itim.ws.model.WSPerson;
import com.ibm.itim.ws.model.WSRole;
import com.ibm.itim.ws.model.WSSession;
import com.ibm.itim.ws.services.WSRoleServiceProxy;
import com.ibm.itim.ws.services.WSPersonServiceProxy;
import com.ibm.itim.ws.services.WSSearchDataServiceProxy;

public class RoleFactory {
	public static WSRole[] getRoleMembers(WSServiceImpl serviceImpl, WSSession session, String roleDn){
		WSRole[] roles = new WSRole[0];
		WSRoleServiceProxy service = serviceImpl.getRoleService();
		try {
			roles = service.getMemberRoles(session, roleDn);
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
		
		return roles;
	}
	public static WSRole[] getRoles(WSServiceImpl serviceImpl, WSSession session, String filter){
		WSRole[] roles = new WSRole[0];
		WSRoleServiceProxy service = serviceImpl.getRoleService();
		try {
			roles = service.searchRoles(session, filter);
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
		
		return roles;
	}
	
	
	
}
