package com.prolifics.isim;

import java.rmi.RemoteException;
import java.util.Calendar;

import com.ibm.itim.ws.exceptions.WSApplicationException;
import com.ibm.itim.ws.exceptions.WSInvalidLoginException;
import com.ibm.itim.ws.exceptions.WSInvalidSessionException;
import com.ibm.itim.ws.exceptions.WSLoginServiceException;
import com.ibm.itim.ws.model.WSAccount;
import com.ibm.itim.ws.model.WSAttribute;
import com.ibm.itim.ws.model.WSOrganizationalContainer;
import com.ibm.itim.ws.model.WSPerson;
import com.ibm.itim.ws.model.WSRequest;
import com.ibm.itim.ws.model.WSSearchResultsWrapper;
import com.ibm.itim.ws.model.WSService;
import com.ibm.itim.ws.model.WSSession;

import com.ibm.itim.ws.services.WSAccessServiceProxy;
import com.ibm.itim.ws.services.WSAccountServiceProxy;
import com.ibm.itim.ws.services.WSGroupServiceProxy;
import com.ibm.itim.ws.services.WSOrganizationalContainerServiceProxy;
import com.ibm.itim.ws.services.WSPersonServiceProxy;
import com.ibm.itim.ws.services.WSRequestServiceProxy;
import com.ibm.itim.ws.services.WSRoleServiceProxy;
import com.ibm.itim.ws.services.WSSearchDataServiceProxy;
import com.ibm.itim.ws.services.WSServiceServiceProxy;
import com.ibm.itim.ws.services.WSSessionServiceProxy;
import com.ibm.itim.ws.services.WSToDoServiceProxy;

public class WSServiceImpl {
	private String accessServiceEndPoint = null;
	private String todoServiceEndPoint = null;
	private String accountServiceEndPoint = null;
	private String requestServiceEndPoint = null;
	private String sessionServiceEndPoint = null;
	private String personServiceEndPoint = null;
	private String searchDataServiceEndPoint = null;
	private String serviceServiceEndPoint = null;
	private String groupServiceEndPoint = null;
	private String roleServiceEndPoint = null;
	private String organizationalContainerServiceEndPoint = null;
	private WSGroupServiceProxy groupService = null;
	private WSRoleServiceProxy roleService = null;
	private WSToDoServiceProxy todoService = null;
	private WSAccessServiceProxy accessService = null;
	private WSRequestServiceProxy requestService = null;
	private WSPersonServiceProxy personService = null;
	private WSSessionServiceProxy sessionService = null;
	private WSSearchDataServiceProxy searchDataService = null;
	private WSServiceServiceProxy serviceService = null;
	private WSOrganizationalContainerServiceProxy organizationalContainerService = null;
	private WSAccountServiceProxy accountService = null;
	public WSServiceImpl(){
		setBaseEndPoint("http://bld-appdev10:9080/itim/services");
	}
	public WSServiceImpl(String baseEndPoint){
		setBaseEndPoint(baseEndPoint);
	}
	public void setBaseEndPoint(String endPoint){
		roleServiceEndPoint = endPoint + "/WSRoleServiceService";
		groupServiceEndPoint = endPoint + "/WSGroupServiceService";
		accessServiceEndPoint = endPoint + "/WSAccessServiceService";
		todoServiceEndPoint = endPoint + "/WSToDoServiceService";
		accountServiceEndPoint = endPoint + "/WSAccountServiceService";
		requestServiceEndPoint = endPoint + "/WSRequestServiceService";
		organizationalContainerServiceEndPoint = endPoint + "/WSOrganizationalContainerServiceService";
		sessionServiceEndPoint = endPoint + "/WSSessionService";
		personServiceEndPoint = endPoint + "/WSPersonServiceService";
		searchDataServiceEndPoint = endPoint + "/WSSearchDataServiceService";
		serviceServiceEndPoint = endPoint + "/WSServiceServiceService";
	}
	public WSOrganizationalContainerServiceProxy getOrganizationalContainerService(){
		if(organizationalContainerService != null) return organizationalContainerService;
		organizationalContainerService = new WSOrganizationalContainerServiceProxy(organizationalContainerServiceEndPoint);
		return organizationalContainerService;
	}
	public WSGroupServiceProxy getGroupService(){
		if(groupService != null) return groupService;
		groupService = new WSGroupServiceProxy(groupServiceEndPoint);
		return groupService;
	}
	public WSRoleServiceProxy getRoleService(){
		if(roleService != null) return roleService;
		roleService = new WSRoleServiceProxy(roleServiceEndPoint);
		return roleService;
	}
	public WSToDoServiceProxy getTodoService(){
		if(todoService != null) return todoService;
		todoService = new WSToDoServiceProxy(todoServiceEndPoint);
		return todoService;
	}
	public WSAccessServiceProxy getAccessService(){
		if(accessService != null) return accessService;
		accessService = new WSAccessServiceProxy(accessServiceEndPoint);
		return accessService;
	}
	public WSAccountServiceProxy getAccountService(){
		if(accountService != null) return accountService;
		accountService = new WSAccountServiceProxy(accountServiceEndPoint);
		return accountService;
	}
	public WSRequestServiceProxy getRequestService(){
		if(requestService != null) return requestService;
		requestService = new WSRequestServiceProxy(requestServiceEndPoint);
		return requestService;
	}
	public WSServiceServiceProxy getServiceService(){
		if(serviceService != null) return serviceService;
		serviceService = new WSServiceServiceProxy(serviceServiceEndPoint);
		return serviceService;
	}
	public WSSearchDataServiceProxy getSearchDataService(){
		if(searchDataService != null) return searchDataService;
		searchDataService = new WSSearchDataServiceProxy(searchDataServiceEndPoint);
		return searchDataService;
	}	
	public WSSessionServiceProxy getSessionService(){
		if(sessionService != null) return sessionService;
		sessionService = new WSSessionServiceProxy(sessionServiceEndPoint);
		return sessionService;
	}	
	public WSPersonServiceProxy getPersonService(){
		if(personService != null) return personService;
		personService = new WSPersonServiceProxy(personServiceEndPoint);
		return personService;
	}
	public String getSessionServiceEndPoint() {
		return sessionServiceEndPoint;
	}
	public void setSessionServiceEndPoint(String sessionServiceEndPoint) {
		this.sessionServiceEndPoint = sessionServiceEndPoint;
	}


	
}
