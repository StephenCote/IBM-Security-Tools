package com.prolifics.isim.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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

public class TestPerson {

		public static final Logger logger = Logger.getLogger(TestPerson.class.getName());
		private static WSSession session = null;
		private static WSServiceImpl service = null;
		@Before
		public void setup() throws Exception{


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
			service = new WSServiceImpl("http://" + props.getProperty("isim.server") + "/itim/services");
			session = SessionFactory.login(service,props.getProperty("isim.user1.name"),props.getProperty("isim.user1.password"));

		}
		@After
		public void tearDown() throws Exception{
			if(session != null){
				SessionFactory.logout(service,session);
				session = null;
			}
		}
		@Test
		public void TestGetPerson(){
			boolean check = false;
			assertNotNull("Session is null",session);
			WSPerson person = PersonFactory.getPerson(service, session);
			assertNotNull("Person is null",person);
			logger.info("Got the Person! " + person.getName());
			//assertTrue("Person retrieved",check);
		}

		
}
