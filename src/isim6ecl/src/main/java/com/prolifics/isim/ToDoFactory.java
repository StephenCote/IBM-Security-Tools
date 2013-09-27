package com.prolifics.isim;

import java.rmi.RemoteException;

import com.ibm.itim.ws.exceptions.WSApplicationException;
import com.ibm.itim.ws.exceptions.WSLoginServiceException;
import com.ibm.itim.ws.model.WSAssignment;
import com.ibm.itim.ws.model.WSAssignmentGroup;
import com.ibm.itim.ws.model.WSSession;

public class ToDoFactory {
	public static WSAssignment[] getAssignments(WSServiceImpl serviceImpl, WSSession session){
		WSAssignment[] assignments = new WSAssignment[0];
		try {
			assignments = serviceImpl.getTodoService().getAssignments(session);
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
		if(assignments == null) assignments = new WSAssignment[0];
		return assignments;
	}
	public static WSAssignmentGroup[] getAssignmentGroups(WSServiceImpl serviceImpl, WSSession session){
		WSAssignmentGroup[] assignments = new WSAssignmentGroup[0];
		try {
			assignments = serviceImpl.getTodoService().getAssignmentGroups(session);
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
		if(assignments == null) assignments = new WSAssignmentGroup[0];
		return assignments;
	}
}
