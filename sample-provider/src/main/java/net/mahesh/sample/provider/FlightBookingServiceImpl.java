package net.mahesh.sample.provider;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import net.mahesh.sample.contract.BookFlightInput;
import net.mahesh.sample.contract.BookFlightOutput;
import net.mahesh.sample.contract.FlightBookingService;
import net.mahesh.sample.contract.Input;
import net.mahesh.sample.contract.Output;
import net.mahesh.sample.contract.SearchFlightInput;
import net.mahesh.sample.contract.SearchFlightOutput;
import net.mahesh.sample.contract.common.Constraint;
import net.mahesh.sample.entities.BookingDetails;
import net.mahesh.sample.entities.FlightDetails;
import net.mahesh.sample.provider.mapper.ProviderMapper;
import net.mahesh.sample.transaction.TransactionManager;

@Stateless(name = "net.mahesh.sample.contract.FlightBookingService")
@Local(net.mahesh.sample.contract.FlightBookingService.class)
@WebService(targetNamespace = "mahesh:sample:contract")
@TransactionAttribute(javax.ejb.TransactionAttributeType.SUPPORTS)
@TransactionManagement(TransactionManagementType.CONTAINER)
public class FlightBookingServiceImpl implements FlightBookingService {
	@Inject
	private static Validator validator;

	@EJB
	private TransactionManager trasnctionManager;

	public SearchFlightOutput searchFlights(SearchFlightInput input) {
		SearchFlightOutput output = new SearchFlightOutput();
		
		processValidation(input,output);
		if("NOK".equals(output.getResponseCode())){
			return output;
		}	
		
		List<FlightDetails> flights = trasnctionManager
				.searchFlights(ProviderMapper.mapToFlightDetailsEntity(input),input.getDateOfTravel());

		if (null == flights || flights.size() == 0) {
			output.setResponseCode("THERE IS NO SERVICE BETWEEN TWO CITIES");
		} else {
			output.setResponseCode("OK");
			List<net.mahesh.sample.contract.FlightDetails> contractFlightList = ProviderMapper
					.prepareCotractList(flights);
			output.setFlights(contractFlightList);
		}
		return output;
	}

	public BookFlightOutput bookTickets(BookFlightInput input) {
		BookFlightOutput output = new BookFlightOutput();
		
		processValidation(input,output);
		if("NOK".equals(output.getResponseCode())){
			return output;
		}
		
		List<BookingDetails> bookingList = ProviderMapper.mapToCore(input);
		
		List<BookingDetails> details = trasnctionManager.bookFlight(bookingList);

		if (null != details && details.size()!=0) {
			output.setResponseCode("OK");
			output.setConfirmationStatus("CONFIRMED");
			output.setBookingDetails(ProviderMapper.mapBookingDetailsCoreToCotract(details));			
			output.setNumberOfSeatsConfirmed(details.size());
		} else {
			output.setResponseCode("NOK");
			output.setConfirmationStatus("TICKETS NOT BOOKED. FLIGHT IS FULL");
		}
		return output;
	}
	
	private Output processValidation(Input input,
			Output output) {
		if (null != input) {
			output.setConstraints(validate(input));
			if (null != output.getConstraints()) {
				output.setResponseCode("NOK");
				output.setInformationMessage("INVALID INPUT FIELD/FIELDS");
				return output;
			}else{
				output.setResponseCode("OK");				
			}
		} else {
			output.setResponseCode("NOK");
			output.setInformationMessage("INPUT CAN NOT BE NULL");			
			return output;
		}
		return output;		
	}

	private List<Constraint> validate(Input input) {
		Set<ConstraintViolation<Input>> violations = validator.validate(input);
		if (null != violations && !violations.isEmpty()) {
			List<Constraint> constraintList = new ArrayList<Constraint>();
			for (ConstraintViolation<Input> cv : violations) {
				constraintList.add(new Constraint(cv.getPropertyPath(), cv
						.getMessage(), cv.getInvalidValue()));
			}
			return constraintList;
		}
		return null;
	}

}
