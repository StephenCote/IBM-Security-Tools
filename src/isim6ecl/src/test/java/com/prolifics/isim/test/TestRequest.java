package com.prolifics.isim.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ibm.itim.ws.exceptions.WSApplicationException;
import com.ibm.itim.ws.model.WSAccount;
import com.ibm.itim.ws.model.WSAttribute;
import com.ibm.itim.ws.model.WSObject;
import com.ibm.itim.ws.model.WSOrganizationalContainer;
import com.ibm.itim.ws.model.WSPerson;
import com.ibm.itim.ws.model.WSRequest;
import com.ibm.itim.ws.model.WSService;
import com.ibm.itim.ws.model.WSSession;
import com.prolifics.RequestFactory;
import com.prolifics.isim.AccountFactory;
import com.prolifics.isim.ServiceFactory;
import com.prolifics.isim.SessionFactory;
import com.prolifics.isim.WSServiceImpl;

public class TestRequest {

		public static final Logger logger = Logger.getLogger(TestRequest.class.getName());
		private static WSSession session = null;
		private static WSServiceImpl service = null;
		@Before
		public void setup() throws Exception{
/*
			service = new WSServiceImpl("http://192.168.1.27:9080/itim/services");
			session = service.login("steve","Passw0rd1");
*/
			service = new WSServiceImpl("http://bld-appdev10:9080/itim/services");
			//session = SessionFactory.login(service,"c935393","Healthnet$1");
			session = SessionFactory.login(service,"A900700","Healthnet$1");

			String log4jPropertiesPath = System.getProperty("log4j.configuration");
			if(log4jPropertiesPath != null){
				System.out.println("Properties=" + log4jPropertiesPath);
				PropertyConfigurator.configure(log4jPropertiesPath);
			}

		}
		@After
		public void tearDown() throws Exception{
			if(session != null){
				SessionFactory.logout(service,session);
				session = null;
			}
		}
		@Test
		public void TestPeekAccountInService(){
			WSService itimService = ServiceFactory.getServiceByNameInOrganization(service, session, "HealthNet", "Organization","ITIM Service");
			assertNotNull("Service is null", itimService);
			WSAccount[] accounts = ServiceFactory.getAccountsInService(service, session, itimService, "C935393");
			assertTrue("Did not find account",accounts != null && accounts.length == 1);
			printAccountInfo(accounts[0]);
		}
		private void printAccountInfo(WSAccount account){
			logger.info("Account = " +  account.getName());
			WSAttribute[] attributes = account.getAttributes();
			for(int i = 0; i < attributes.length;i++){
				String[] values = attributes[i].getValues();
				StringBuffer buff = new StringBuffer();
				for(int v = 0; values != null && v < values.length; v++){
					if(v>0) buff.append(", ");
					buff.append(values[v]);
				}
				logger.info(attributes[i].getName() + "=" + buff.toString());
			}
		}
		
		@Test
		public void TestViewRequests(){
			WSRequest[] requests = RequestFactory.getRequests(service, session);
			assertTrue("No requests found", requests != null && requests.length > 0);
			for(int i = 0; i < requests.length;i++){
				logger.info("Request: " + requests[i].getRequestId() + " -- " + requests[i].getProcessType() + " --- " + requests[i].getOwner() + " --- " + requests[i].getSubjectService() + " --- " + requests[i].getDescription());
			}
		}

		@Test 
		public void TestRequestAddAccountToService(){
			WSService sapBOService = ServiceFactory.getServiceByNameInOrganization(service, session, "HNCORP", "HNCORP SAP Business Objects");
			assertNotNull("Service is null", sapBOService);
			
			WSRequest request = null;
			List<WSAttribute> attrs = new ArrayList<WSAttribute>();
			attrs.add(new WSAttribute("eruid",1,new String[]{"C935393"}));
			attrs.add(new WSAttribute("hnboname",1,new String[]{"C935393"}));
			attrs.add(new WSAttribute("hnbofullname",1,new String[]{"Stephen Cote"}));
			attrs.add(new WSAttribute("hnbodescription",1,new String[]{"Automated test"}));
			attrs.add(new WSAttribute("owner",1,new String[]{"erglobalid=4591856946637877048,ou=0,ou=people,erglobalid=00000000000000000000,ou=Health Net,dc=healthnet,dc=com"}));
			request = AccountFactory.requestAccount(service,session, sapBOService, attrs.toArray(new WSAttribute[0]), Calendar.getInstance());
			assertNotNull("Request is null",request);
			logger.info("Request: " + request.getRequestId() + " / " + request.getStatusString());
		}


		
}
