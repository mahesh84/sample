package net.mahesh.sample.provider;

import java.util.Set;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.ejb.Local;

import net.mahesh.sample.contract.BookFlightInput;
import net.mahesh.sample.contract.BookFlightOutput;
import net.mahesh.sample.contract.FlightBookingService;
import net.mahesh.sample.contract.Input;
import net.mahesh.sample.contract.SearchFlightInput;
import net.mahesh.sample.contract.SearchFlightOutput;
import net.mahesh.sample.entities.BookingDetails;
import net.mahesh.sample.provider.mapper.ProviderMapper;
import net.mahesh.sample.transaction.TransactionManager;
import net.mahesh.sample.transaction.impl.TransactionManagerImpl;

@Stateless(name ="net.mahesh.sample.contract.FlightBookingService")
@Local(net.mahesh.sample.contract.FlightBookingService.class)
@WebService(targetNamespace="mahesh:sample:contract")
@TransactionAttribute(javax.ejb.TransactionAttributeType.SUPPORTS)
public class FlightBookingServiceImpl implements FlightBookingService {
	private static Validator validator;
	
	@EJB
	private TransactionManager trasmactionManager;

	public SearchFlightOutput searchFlights(SearchFlightInput input) {
		validate(input);	
		return null;
	}

	private <input> void validate(Input input) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	      validator = factory.getValidator();
	      Set<ConstraintViolation<Input>> violations = validator.validate(input, null);
		
	}

	public BookFlightOutput bookTickets(BookFlightInput input) {
		//validate(input);
		BookingDetails details = trasmactionManager.bookFlight(ProviderMapper.mapToCore(input));
		BookFlightOutput output = new BookFlightOutput();
		if(null!=details){		
		output.setResponseCode("OK");
		output.setConfirmationStatus("CONFIRMED");
		//output.setBookingDetails(bookingDetails);
		}else{
			output.setResponseCode("NOK");
			output.setConfirmationStatus("NOT_CONFIRMED");
		}
		return output;
	}

}
