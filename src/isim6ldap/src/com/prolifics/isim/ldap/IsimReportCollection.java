package com.prolifics.isim.ldap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsimReportCollection {
	
	private static List<IsimReport> reportAcls = null;
	private static Map<String,List<Integer>> reportViewMap = null;
	private static Map<String,Integer> reportNameMap = null;
	private static Map<String,Integer> reportIdMap = null;
	
	public IsimReportCollection(){
		initializeReportAclList();
	}
	
	private void add(IsimReport report){
		String view = report.getView();
		String name = report.getName();
		String id = report.getId();
		int len = reportAcls.size();
		reportNameMap.put(name, len);
		reportIdMap.put(id, len);
		if(reportViewMap.containsKey(view) == false ) reportViewMap.put(view, new ArrayList<Integer>());
		List<Integer> ids = reportViewMap.get(view);
		ids.add(len);
		reportAcls.add(report);
	}
	
	public static Map<String, List<Integer>> getReportViewMap() {
		return reportViewMap;
	}

	public static Map<String, Integer> getReportNameMap() {
		return reportNameMap;
	}

	public static Map<String, Integer> getReportIdMap() {
		return reportIdMap;
	}

	public List<IsimReport> getReportAcls(){
		return reportAcls;
	}
	private void initializeReportAclList(){
		if(reportAcls != null) return;
		
		reportAcls = new ArrayList<IsimReport>();
		reportViewMap = new HashMap<String, List<Integer>>();
		reportNameMap = new HashMap<String, Integer>();
		reportIdMap = new HashMap<String, Integer>();
		
		add(new IsimReport("audit","14","Default ACI for Access Control Information (ACI) Report: Grant Run to Auditor Group"));
		add(new IsimReport("audit","13","Default ACI for Policies Report: Grant Run to Auditor Group"));
		add(new IsimReport("service","12","Default ACI for Services Report: Grant Run to Auditor/Service Owner Groups"));
		add(new IsimReport("request","8","Default ACI for Approval/Rejection Report: Grant Run to Auditor/Manager Groups"));
		add(new IsimReport("request","17","Default ACI for User Requests Report: Grant Run to Auditor/Manager Groups"));
		add(new IsimReport("request","7","Default ACI for Account Requests by an Individual Report: Grant Run to Auditor/Manager Groups"));
		add(new IsimReport("request","15","Default ACI for Operation Report: Grant Run to Auditor/Manager Groups"));
		add(new IsimReport("account","2","Default ACI for User Accounts by Role Report: Grant Run to Auditor Group"));
		add(new IsimReport("audit","5","Default ACI for Entitlements granted to an Individual Report: Grant Run to Auditor Group"));
		add(new IsimReport("service","20","Default ACI for Reconciliation Statistics Report: Grant Run to Auditor/Service Owner Groups"));
		add(new IsimReport("audit","6","Default ACI for Account Requests Report: Grant Run to Auditor/Manager Groups"));
		add(new IsimReport("account","49","Default ACI for Individual Access Report: Grant Run to Auditor/Manager/Service Owner Groups"));
		add(new IsimReport("request","9","Default ACI for Pending Approvals Report: Grant Run to Auditor/Manager Groups"));
		add(new IsimReport("account","18","Default ACI for Account Report: Grant Run to Auditor Group"));
		add(new IsimReport("audit","11","Default ACI for Suspended User Report: Grant Run to Auditor Group"));
		add(new IsimReport("account","1","Default ACI for User Accounts Report: Grant Run to Auditor/Manager Groups"));
		add(new IsimReport("audit","21","Default ACI for Audit Events Report: Grant Run to Auditor Group"));
		add(new IsimReport("audit","4","Default ACI for Policies Governing a Role Report: Grant Run to Auditor Group"));
		add(new IsimReport("audit","22","Default ACI for Non-Compliant Accounts Report: Grant Run to Auditor Group"));
		add(new IsimReport("account","46","Default ACI for Recertification History Report: Grant Run to Auditor/Manager/Service Owner Groups"));
		add(new IsimReport("audit","23","Default ACI for Orphan Accounts Report: Grant Run to Auditor/Service Owner Groups"));
		add(new IsimReport("request","16","Default ACI for Rejected Report: Grant Run to Auditor/Manager Groups"));
		add(new IsimReport("audit","19","Default ACI for Dormant Accounts Report: Grant Run to Auditor/Service Owner Groups"));
		add(new IsimReport("audit","50","Default ACI for Access Report: Grant Run to Auditor/Service Owner Groups"));
		add(new IsimReport("audit","10","Default ACI for Suspended Accounts Report: Grant Run to Auditor Group"));
		add(new IsimReport("service","3","Default ACI for Accounts on a Service Report: Grant Run to Auditor/Service Owner Groups"));
		add(new IsimReport("account","47","Default ACI for Pending Recertification Report: Grant Run to Auditor/Manager/Service Owner Groups"));
		add(new IsimReport("audit","48","Default ACI for Recertification Policies Report: Grant Run to Auditor/Manager/Service Owner Groups"));

	}
}


