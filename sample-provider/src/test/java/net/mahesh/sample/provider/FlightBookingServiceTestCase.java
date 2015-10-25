package net.mahesh.sample.provider;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.isA;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import net.mahesh.sample.contract.Input;
import net.mahesh.sample.contract.SearchFlightInput;
import net.mahesh.sample.contract.SearchFlightOutput;
import net.mahesh.sample.entities.FlightDetails;
import net.mahesh.sample.transaction.TransactionManager;

import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.MockType;
import org.easymock.TestSubject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;

@RunWith(EasyMockRunner.class)
@PrepareForTest({Validator.class,TransactionManager.class})
public class FlightBookingServiceTestCase extends CommonInputData {
	@TestSubject
	FlightBookingServiceImpl fbpService = new FlightBookingServiceImpl();

	@Mock(type = MockType.STRICT)
	private static Validator validator;

	@Mock(type = MockType.STRICT)
	private TransactionManager trasnctionManager;

	/**
	 * OK test case for searching flights.
	 * It only tests behavior from {@link FlightBookingServiceImpl#searchFlights(SearchFlightInput)}
	 */
	@Test
	public void searchFlightTest_OK() {
		List<FlightDetails> flights = new ArrayList<FlightDetails>();
		flights.add(CommonInputData.getCoreFlightDetails());
		expect(validator.validate(isA(Input.class))).andReturn(null);
		expect(
				trasnctionManager.searchFlights(isA(FlightDetails.class),
						isA(Date.class))).andReturn(flights);
		
		replay(validator, trasnctionManager);
	
		SearchFlightOutput output = fbpService.searchFlights(CommonInputData
				.getSearchFlightInput());
		assertEquals(output.getResponseCode(), "OK");
	}
	/**
	 * NOK- PROVIDE INVALID COMBINATION OF ORIGIN AND DESTINATION.
	 * It only tests behavior from {@link FlightBookingServiceImpl#searchFlights(SearchFlightInput)}
	 */
	@Test
	public void searchFlightTest_NOK_NOFLIGHTS_() {
		List<FlightDetails> flights = new ArrayList<FlightDetails>();	
		expect(validator.validate(isA(Input.class))).andReturn(null);
		expect(
				trasnctionManager.searchFlights(isA(FlightDetails.class),
						isA(Date.class))).andReturn(flights);
		
		replay(validator, trasnctionManager);
	
		SearchFlightOutput output = fbpService.searchFlights(CommonInputData
				.getSearchFlightInput());
		assertEquals(output.getResponseCode(), "NOK");
		assertEquals(output.getInformationMessage(), "THERE IS NO SERVICE BETWEEN TWO CITIES");
	}
	
	/**
	 * NOK- MISSING MANDATORY FIELDS.
	 * It only tests behavior from {@link FlightBookingServiceImpl#searchFlights(SearchFlightInput)}
	 */
	@Test
	public void searchFlightTest_NOK_MISSING_MANDATORY_FIELD() {
		List<FlightDetails> flights = new ArrayList<FlightDetails>();
		flights.add(CommonInputData.getCoreFlightDetails());		
		SearchFlightInput input = CommonInputData.getSearchFlightInput();
		input.setDestination(null);
	   
	    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	    Validator validator1 = factory.getValidator();
	    Set<ConstraintViolation<Input>> violations= validator1.validate((Input)input);
	    
		expect(validator.validate(isA(Input.class))).andReturn(violations);
		expect(
				trasnctionManager.searchFlights(isA(FlightDetails.class),
						isA(Date.class))).andReturn(flights);
		
		replay(validator, trasnctionManager);
	
		SearchFlightOutput output = fbpService.searchFlights(CommonInputData
				.getSearchFlightInput());
		assertEquals(output.getResponseCode(), "NOK");
	}	
	
	/**
	 * NOK- NULL INPUT
	 * It only tests behavior from {@link FlightBookingServiceImpl#searchFlights(SearchFlightInput)}
	 */
	@Test
	public void searchFlightTest_NOK_NULL_INPUT() {	
		SearchFlightOutput output = fbpService.searchFlights(null);
		assertEquals(output.getResponseCode(), "NOK");
	}	
}





