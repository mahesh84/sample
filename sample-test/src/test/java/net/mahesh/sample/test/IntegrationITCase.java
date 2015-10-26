package net.mahesh.sample.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;

import net.mahesh.sample.contract.BookFlightInput;
import net.mahesh.sample.contract.BookFlightOutput;
import net.mahesh.sample.contract.FlightBookingService;
import net.mahesh.sample.contract.SearchFlightOutput;
import net.mahesh.sample.provider.CommonInputData;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class IntegrationITCase {
	static EJBContainer container;
	static FlightBookingService flightBookingService;

	@BeforeClass
	public static void beforeClassSetup() throws NamingException {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put("fbp", "new://Resource?type=javax.sql.DataSource");
		properties.put("fbp.hibernate.connection.driver_class",
				"com.mysql.jdbc.Driver");
		properties.put("fbp.hibernate.connection.url",
				"jdbc:mysql://localhost:3306/TEST");
		properties.put("fbp.hibernate.dialect",
				"org.hibernate.dialect.MySQLDialect");
		properties.put("fbp.hibernate.connection.username", "root");
		properties.put("fbp.hibernate.connection.password", "");
		properties.put("fbp.hibernate.hbm2ddl.auto", "create");
		properties.put("fbp.hibernate.default_schema", "TEST");
		properties.put("fbp.provider", "org.hibernate.ejb.HibernatePersistence");	
		properties.put("fbp.jdbcDriver", "com.mysql.jdbc.Driver");
		properties.put("fbp.jdbcUrl", "jdbc:mysql://localhost:3306/TEST");
		properties.put("fbp.jtaManaged", "true");
		properties.put("fbp.userName", "root");
		properties.put("fbp.password", "");

		properties.put(javax.ejb.embeddable.EJBContainer.APP_NAME, "sample");
		container = javax.ejb.embeddable.EJBContainer
				.createEJBContainer(properties);
		prepareDB();
		Context ctx = container.getContext();
		
		//FIXME - difference in jndi naming service while individual test run and during build.
		
		//uncomment following line For Overall build
		String jndi = "java:global/sample/sample/net.mahesh.sample.contract.FlightBookingService!net.mahesh.sample.contract.FlightBookingService";
		
		// uncomment following line For individual test case execution
		//String jndi = "java:global/sample/sample-provider/net.mahesh.sample.contract.FlightBookingService!net.mahesh.sample.contract.FlightBookingService";
	
		flightBookingService = (FlightBookingService) ctx
				.lookup(jndi);	
		
	}

	private static void prepareDB() throws NamingException {
		DBSetupUtils.refreshData(DBSetupUtils.insertData_FBP_PLANE_DETAILS);
		DBSetupUtils.refreshData(DBSetupUtils.insertData_FBP_AIRPORTS);
		DBSetupUtils.refreshData(DBSetupUtils.insertData_FBP_FLIGHT_DETAILS);
	}

	@AfterClass
	public static void afterClassSetup() {
		if (null != container) {
			container.close();
		}
	}

	@Before
	public void beforeTest() {

	}

	@After
	public void afterTest() {

	}

	@Test
	public void search_Book_Flights_OK() {
		SearchFlightOutput output = flightBookingService
				.searchFlights(CommonInputData.getSearchFlightInput());
		assertEquals("OK", output.getResponseCode());
		
		BookFlightInput input = new BookFlightInput();
		input.setFlightDetails(output.getFlights().get(0));
		input.setJourneyDate(CommonInputData.getSearchFlightInput().getDateOfTravel());
		
		
		input.setPersengerDetails(CommonInputData.getPassengerDetails());
		input.setTotalNumberOfPassengers(1);
		BookFlightOutput bookingOutput=flightBookingService.bookTickets(input);
		assertEquals("OK", bookingOutput.getResponseCode());
		//TODO - check all important NOK cases.
	}
}
