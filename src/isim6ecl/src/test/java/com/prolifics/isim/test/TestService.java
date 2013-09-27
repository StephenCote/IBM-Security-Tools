package com.prolifics.isim.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ibm.itim.ws.model.WSAttribute;
import com.ibm.itim.ws.model.WSOrganizationalContainer;
import com.ibm.itim.ws.model.WSPerson;
import com.ibm.itim.ws.model.WSService;
import com.ibm.itim.ws.model.WSSession;
import com.prolifics.isim.OrganizationalContainerFactory;
import com.prolifics.isim.ServiceFactory;
import com.prolifics.isim.SessionFactory;
import com.prolifics.isim.WSServiceImpl;

public class TestService {

		public static final Logger logger = Logger.getLogger(TestService.class.getName());
		private static WSSession session = null;
		private static WSServiceImpl service = null;
		@Before
		public void setup() throws Exception{
/*
			service = new WSServiceImpl("http://192.168.1.27:9080/itim/services");
			session = service.login("steve","Passw0rd1");
*/
			service = new WSServiceImpl("http://bld-appdev10:9080/itim/services");
			session = SessionFactory.login(service, "c935393","Healthnet$1");

			String log4jPropertiesPath = System.getProperty("log4j.configuration");
			if(log4jPropertiesPath != null){
				System.out.println("Properties=" + log4jPropertiesPath);
				PropertyConfigurator.configure(log4jPropertiesPath);
			}

		}
		@After
		public void tearDown() throws Exception{
			if(session != null){
				SessionFactory.logout(service, session);
				session = null;
			}
		}
		@Test 
		public void TestGetServiceInOrg(){
			WSOrganizationalContainer[] match_org = OrganizationalContainerFactory.searchOrganizationalContainer(service, session, null, "OrganizationalUnit", "HNCORP");
			/*
			WSOrganizationalContainer[] orgs = service.getOrganizationalContainers(session);
			logger.info("Found: " + orgs.length);
			for(int o = 0; o < orgs.length;o++){
				WSOrganizationalContainer org = service.getOrganizationalContainerSubTree(session, orgs[o]);
				for(int c = 0; c < org.getChildren().length;c++){
					logger.info(org.getChildren()[c].getName() + "/" + org.getChildren()[c].getProfileName() );
				}
						
				//logger.info(org.getName() + ":" + org.getChildren().length);
				
			}
			*/
			/*
			INFO [main] (TestService.java:80) - Service HNCORP SAP Business Objects
			 INFO [main] (TestService.java:83) - 	erlifecycleenable=true
			 INFO [main] (TestService.java:83) - 	erservicename=HNCORP SAP Business Objects
			 INFO [main] (TestService.java:83) - 	owner=erglobalid=4522685187200176904,ou=0,ou=people,erglobalid=00000000000000000000,ou=Health Net,dc=healthnet,dc=com
			 INFO [main] (TestService.java:83) - 	erparent=erglobalid=8164770629948055785,ou=orgChart,erglobalid=00000000000000000000,ou=Health Net,dc=healthnet,dc=com
			 INFO [main] (TestService.java:83) - 	erlastmodifiedtime=201302142303Z
			 INFO [main] (TestService.java:83) - 	objectclass=top
			 INFO [main] (TestService.java:83) - 	erglobalid=6547357381983035317
			 INFO [main] (TestService.java:83) - 	description=HNCORP SAP Business Objects Sandbox
*/
			assertTrue("Match org is null or empty", match_org != null && match_org.length > 0);
			logger.info("Searching within " + match_org[0].getName());
			String serviceName = "HNCORP SAP Business Objects";
			WSService[] services = ServiceFactory.getServices(service, session,match_org[0],"(erservicename=" + serviceName + ")");
			//WSService[] services = service.getServices(session,match_org[0],"(erglobalid=6547357381983035317)");
			assertTrue("Expected a service match",services.length > 0);
			logger.info("Found services: " + services.length);
		}

		@Test
		public void TestGetServices(){
			boolean check = false;
			assertNotNull("Session is null",session);
			WSService[] services = ServiceFactory.getServices(service, session);
			assertTrue("Expected some service objects",services.length > 0);
			logger.info("Found services: " + services.length);
			/*
			for(int i= 0; i < services.length;i++){
				logger.info("Service " + services[i].getName());
				WSAttribute attr[] = services[i].getAttributes();
				for(int k = 0; k < attr.length;k++){
					logger.info("\t" + attr[k].getName() + "=" + attr[k].getValues()[0]);
				}
			}
			*/
			//logger.info("Got the Person! " + person.getName());
			//asse
		}

		
}
