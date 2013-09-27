package com.prolifics.isim.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ibm.itim.ws.model.WSPerson;
import com.ibm.itim.ws.model.WSSession;
import com.prolifics.isim.PersonFactory;
import com.prolifics.isim.SessionFactory;
import com.prolifics.isim.WSServiceImpl;

public class TestSimSearch {

		public static final Logger logger = Logger.getLogger(TestSimSearch.class.getName());
		private static WSSession session = null;
		private static WSServiceImpl service = null;
		@Before
		public void setup() throws Exception{
			//Properties props = new Properties();
			InputStream fis = getClass().getResourceAsStream("/resource.properties");
			Properties props = new Properties();
			props.load(fis);
			fis.close();
			

			String log4jPropertiesPath = System.getProperty("log4j.configuration");
			if(log4jPropertiesPath != null){
				System.out.println("Properties=" + log4jPropertiesPath);
				PropertyConfigurator.configure(log4jPropertiesPath);
			}
			
			logger.info("Server: " + props.get("isim.server"));
			
			service = new WSServiceImpl("http://192.168.1.31:9080/itim/services");
			session = SessionFactory.login(service,"steve","Passw0rd1");
/*
			service = new WSServiceImpl("http://192.168.1.27:9080/itim/services");
			session = service.login("steve","Passw0rd1");
*/
			/*
			service = new WSServiceImpl("http://bld-appdev10:9080/itim/services");
			session = SessionFactory.login(service, "c935393","Healthnet$1");
			*/

		}
		@After
		public void tearDown() throws Exception{
			if(session != null){
				SessionFactory.logout(service, session);
				session = null;
			}
		}
		@Test
		public void TestSearch(){
			boolean check = false;
			assertNotNull("Session is null",session);
			WSPerson[] persons = PersonFactory.getPersons(service, session,"(cn=ste*)");
			for(int i = 0; i < persons.length;i++){
				logger.info("Person " + persons[i].getName());
			}
			logger.info("Retrieved " + persons.length + " results");
			assertTrue("Expected some person objects",persons.length > 0);
			logger.info("Found people: " + persons.length);
			//logger.info("Got the Person! " + person.getName());
			//assertTrue("Person retrieved",check);
		}

		
}
