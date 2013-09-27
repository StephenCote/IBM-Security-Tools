package com.prolifics.isim.beans;

import com.ibm.itim.ws.model.*;


public class EntitySchema {

	private String defaultPackage = "com.ibm.itim.model";
	private WSAccessEntitlement accessEntitlement = null;
	private WSAccount account = null;
	private WSActivity activity = null;
	private WSAssignment assignment = null;
	private WSAssignmentGroup assignmentGroup = null;
	private WSAttribute attribute = null;
	private WSChallenge challenge = null;
	private WSChallengeResponseConfiguration challengeResponseConfiguration = null;
	private WSChallengeResponseInfo challengeResponseInfo = null;
	private WSDelegate delegate = null;
	private WSDelegateInfo delegateInfo = null;
	private WSDelegatePerson delegatePerson = null;
	private WSEntityWrapper entityWrapper = null;
	private WSGroup group = null;
	private WSLocale locale = null;
	private WSNewUserAccess newUserAccess = null;
	private WSObject object = null;
	private WSOrganizationalContainer organizationalContainer = null;
	private WSPasswordRulesInfo passwordRulesInfo = null;
	private WSPerson person = null;
	private WSProvisioningParameters provisioningParameters = null;
	private WSProvisioningPolicy provisioningPolicy = null;
	private WSProvisioningPolicyEntitlement provisioningPolicyEntitlement = null;
	private WSProvisioningPolicyMembership provisioningPolicyMembership = null;
	private WSRequest request = null;
	private WSRFIWrapper rfiWrapper = null;
	private WSRole role = null;
	private WSSearchArguments searchArguments = null;
	private WSSearchResultsWrapper searchResultsWrapper = null;
	private WSSelectItem selectItem = null;
	private WSService service = null;
	private WSServiceAttributeParameter serviceAttributeParameter = null;
	private WSServiceTarget serviceTarget = null;
	private WSSession session = null;
	private WSSystemUser systemUser = null;
	private WSUserAccess userAccess = null;
	private WSVersionInfo versionInfo = null;
	
	public EntitySchema(){
		accessEntitlement = new WSAccessEntitlement();
		account = new WSAccount();
		activity = new WSActivity();
		assignment = new WSAssignment();
		assignmentGroup = new WSAssignmentGroup();
		attribute = new WSAttribute();
		challenge = new WSChallenge();
		challengeResponseConfiguration = new WSChallengeResponseConfiguration();
		challengeResponseInfo = new WSChallengeResponseInfo();
		delegate = new WSDelegate();
		delegateInfo = new WSDelegateInfo();
		delegatePerson = new WSDelegatePerson();
		entityWrapper = new WSEntityWrapper();
		group = new WSGroup();
		locale = new WSLocale();
		newUserAccess = new WSNewUserAccess();
		object = new WSObject();
		organizationalContainer = new WSOrganizationalContainer();
		passwordRulesInfo = new WSPasswordRulesInfo();
		person = new WSPerson();
		provisioningParameters = new WSProvisioningParameters();
		provisioningPolicy = new WSProvisioningPolicy();
		provisioningPolicyEntitlement = new WSProvisioningPolicyEntitlement();
		provisioningPolicyMembership = new WSProvisioningPolicyMembership();
		request = new WSRequest();
		rfiWrapper = new WSRFIWrapper();
		role = new WSRole();
		searchArguments = new WSSearchArguments();
		searchResultsWrapper = new WSSearchResultsWrapper();
		selectItem = new WSSelectItem();
		service = new WSService();
		serviceAttributeParameter = new WSServiceAttributeParameter();
		serviceTarget = new WSServiceTarget();
		session = new WSSession();
		systemUser = new WSSystemUser();
		userAccess = new WSUserAccess();
		versionInfo = new WSVersionInfo();

	}

	public String getDefaultPackage() {
		return defaultPackage;
	}

	public void setDefaultPackage(String defaultPackage) {
		this.defaultPackage = defaultPackage;
	}

	public WSAccessEntitlement getAccessEntitlement() {
		return accessEntitlement;
	}

	public void setAccessEntitlement(WSAccessEntitlement accessEntitlement) {
		this.accessEntitlement = accessEntitlement;
	}

	public WSAccount getAccount() {
		return account;
	}

	public void setAccount(WSAccount account) {
		this.account = account;
	}

	public WSActivity getActivity() {
		return activity;
	}

	public void setActivity(WSActivity activity) {
		this.activity = activity;
	}

	public WSAssignment getAssignment() {
		return assignment;
	}

	public void setAssignment(WSAssignment assignment) {
		this.assignment = assignment;
	}

	public WSAssignmentGroup getAssignmentGroup() {
		return assignmentGroup;
	}

	public void setAssignmentGroup(WSAssignmentGroup assignmentGroup) {
		this.assignmentGroup = assignmentGroup;
	}

	public WSAttribute getAttribute() {
		return attribute;
	}

	public void setAttribute(WSAttribute attribute) {
		this.attribute = attribute;
	}

	public WSChallenge getChallenge() {
		return challenge;
	}

	public void setChallenge(WSChallenge challenge) {
		this.challenge = challenge;
	}

	public WSChallengeResponseConfiguration getChallengeResponseConfiguration() {
		return challengeResponseConfiguration;
	}

	public void setChallengeResponseConfiguration(
			WSChallengeResponseConfiguration challengeResponseConfiguration) {
		this.challengeResponseConfiguration = challengeResponseConfiguration;
	}

	public WSChallengeResponseInfo getChallengeResponseInfo() {
		return challengeResponseInfo;
	}

	public void setChallengeResponseInfo(
			WSChallengeResponseInfo challengeResponseInfo) {
		this.challengeResponseInfo = challengeResponseInfo;
	}

	public WSDelegate getDelegate() {
		return delegate;
	}

	public void setDelegate(WSDelegate delegate) {
		this.delegate = delegate;
	}

	public WSDelegateInfo getDelegateInfo() {
		return delegateInfo;
	}

	public void setDelegateInfo(WSDelegateInfo delegateInfo) {
		this.delegateInfo = delegateInfo;
	}

	public WSDelegatePerson getDelegatePerson() {
		return delegatePerson;
	}

	public void setDelegatePerson(WSDelegatePerson delegatePerson) {
		this.delegatePerson = delegatePerson;
	}

	public WSEntityWrapper getEntityWrapper() {
		return entityWrapper;
	}

	public void setEntityWrapper(WSEntityWrapper entityWrapper) {
		this.entityWrapper = entityWrapper;
	}

	public WSGroup getGroup() {
		return group;
	}

	public void setGroup(WSGroup group) {
		this.group = group;
	}

	public WSLocale getLocale() {
		return locale;
	}

	public void setLocale(WSLocale locale) {
		this.locale = locale;
	}

	public WSNewUserAccess getNewUserAccess() {
		return newUserAccess;
	}

	public void setNewUserAccess(WSNewUserAccess newUserAccess) {
		this.newUserAccess = newUserAccess;
	}

	public WSObject getObject() {
		return object;
	}

	public void setObject(WSObject object) {
		this.object = object;
	}

	public WSOrganizationalContainer getOrganizationalContainer() {
		return organizationalContainer;
	}

	public void setOrganizationalContainer(
			WSOrganizationalContainer organizationalContainer) {
		this.organizationalContainer = organizationalContainer;
	}

	public WSPasswordRulesInfo getPasswordRulesInfo() {
		return passwordRulesInfo;
	}

	public void setPasswordRulesInfo(WSPasswordRulesInfo passwordRulesInfo) {
		this.passwordRulesInfo = passwordRulesInfo;
	}

	public WSPerson getPerson() {
		return person;
	}

	public void setPerson(WSPerson person) {
		this.person = person;
	}

	public WSProvisioningParameters getProvisioningParameters() {
		return provisioningParameters;
	}

	public void setProvisioningParameters(
			WSProvisioningParameters provisioningParameters) {
		this.provisioningParameters = provisioningParameters;
	}

	public WSProvisioningPolicy getProvisioningPolicy() {
		return provisioningPolicy;
	}

	public void setProvisioningPolicy(WSProvisioningPolicy provisioningPolicy) {
		this.provisioningPolicy = provisioningPolicy;
	}

	public WSProvisioningPolicyEntitlement getProvisioningPolicyEntitlement() {
		return provisioningPolicyEntitlement;
	}

	public void setProvisioningPolicyEntitlement(
			WSProvisioningPolicyEntitlement provisioningPolicyEntitlement) {
		this.provisioningPolicyEntitlement = provisioningPolicyEntitlement;
	}

	public WSProvisioningPolicyMembership getProvisioningPolicyMembership() {
		return provisioningPolicyMembership;
	}

	public void setProvisioningPolicyMembership(
			WSProvisioningPolicyMembership provisioningPolicyMembership) {
		this.provisioningPolicyMembership = provisioningPolicyMembership;
	}

	public WSRequest getRequest() {
		return request;
	}

	public void setRequest(WSRequest request) {
		this.request = request;
	}

	public WSRFIWrapper getRfiWrapper() {
		return rfiWrapper;
	}

	public void setRfiWrapper(WSRFIWrapper rfiWrapper) {
		this.rfiWrapper = rfiWrapper;
	}

	public WSRole getRole() {
		return role;
	}

	public void setRole(WSRole role) {
		this.role = role;
	}

	public WSSearchArguments getSearchArguments() {
		return searchArguments;
	}

	public void setSearchArguments(WSSearchArguments searchArguments) {
		this.searchArguments = searchArguments;
	}

	public WSSearchResultsWrapper getSearchResultsWrapper() {
		return searchResultsWrapper;
	}

	public void setSearchResultsWrapper(WSSearchResultsWrapper searchResultsWrapper) {
		this.searchResultsWrapper = searchResultsWrapper;
	}

	public WSSelectItem getSelectItem() {
		return selectItem;
	}

	public void setSelectItem(WSSelectItem selectItem) {
		this.selectItem = selectItem;
	}

	public WSService getService() {
		return service;
	}

	public void setService(WSService service) {
		this.service = service;
	}

	public WSServiceAttributeParameter getServiceAttributeParameter() {
		return serviceAttributeParameter;
	}

	public void setServiceAttributeParameter(
			WSServiceAttributeParameter serviceAttributeParameter) {
		this.serviceAttributeParameter = serviceAttributeParameter;
	}

	public WSServiceTarget getServiceTarget() {
		return serviceTarget;
	}

	public void setServiceTarget(WSServiceTarget serviceTarget) {
		this.serviceTarget = serviceTarget;
	}

	public WSSession getSession() {
		return session;
	}

	public void setSession(WSSession session) {
		this.session = session;
	}

	public WSSystemUser getSystemUser() {
		return systemUser;
	}

	public void setSystemUser(WSSystemUser systemUser) {
		this.systemUser = systemUser;
	}

	public WSUserAccess getUserAccess() {
		return userAccess;
	}

	public void setUserAccess(WSUserAccess userAccess) {
		this.userAccess = userAccess;
	}

	public WSVersionInfo getVersionInfo() {
		return versionInfo;
	}

	public void setVersionInfo(WSVersionInfo versionInfo) {
		this.versionInfo = versionInfo;
	}

	
}
