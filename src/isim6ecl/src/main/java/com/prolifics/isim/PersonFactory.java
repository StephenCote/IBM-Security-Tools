package com.prolifics.isim;

import java.rmi.RemoteException;

import com.ibm.itim.ws.exceptions.WSApplicationException;
import com.ibm.itim.ws.exceptions.WSInvalidSessionException;
import com.ibm.itim.ws.exceptions.WSLoginServiceException;
import com.ibm.itim.ws.model.WSPerson;
import com.ibm.itim.ws.model.WSRole;
import com.ibm.itim.ws.model.WSSession;
import com.ibm.itim.ws.services.WSPersonServiceProxy;
import com.ibm.itim.ws.services.WSSearchDataServiceProxy;

public class PersonFactory {
	public static WSPerson[] getPersons(WSServiceImpl serviceImpl, WSSession session, String filter){
		WSPerson[] persons = new WSPerson[0];
		//WSSearchDataServiceProxy service = serviceImpl.getSearchDataService();
		
		WSPersonServiceProxy service = serviceImpl.getPersonService();
		
		String[] attrList = null;
		
		try {
			persons = service.searchPersonsFromRoot(session, filter, null);
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
		
		return persons;
	}
	public static WSPerson getPerson(WSServiceImpl serviceImpl, WSSession session){
		WSPersonServiceProxy service = serviceImpl.getPersonService();
		WSPerson person = null;
		try {
			person = service.getPrincipalPerson(session);

			//System.out.println("Get Person? " + (person == null ? "Null from server":"Got person!"));
		} catch (WSInvalidSessionException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (WSApplicationException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return person;
	}
	public static WSPerson getPersonByDn(WSServiceImpl serviceImpl, WSSession session, String personDn){
		//WSPersonServiceProxy service = serviceImpl.getPersonService();
		WSPersonServiceProxy service = serviceImpl.getPersonService();
		WSPerson person = null;
		try {
			person = service.lookupPerson(session, personDn);
			//WSPerson[] persons = service.searchPersonsFromRoot(session, "(uid=" + uid + ")", null);
			//if(persons.length > 0) person = persons[0];
			//System.out.println("Get Person? " + (person == null ? "Null from server":"Got person!"));
		} catch (WSInvalidSessionException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (WSApplicationException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return person;
	}
	public static WSRole[] getPersonRoles(WSServiceImpl serviceImpl, WSSession session, String personDN){
		WSPersonServiceProxy service = serviceImpl.getPersonService();
		WSRole[] roles = null;
		try {
			roles = service.getPersonRoles(session, personDN);
		} catch (WSInvalidSessionException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (WSApplicationException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return roles;
	}
}
