package net.mahesh.sample.provider;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.jws.WebService;
import javax.ejb.Local;

import net.mahesh.sample.contract.BookFlightInput;
import net.mahesh.sample.contract.BookFlightOutput;
import net.mahesh.sample.contract.FlightBookingService;
import net.mahesh.sample.contract.SearchFlightInput;
import net.mahesh.sample.contract.SearchFlightOutput;

@Stateless(name ="net.mahesh.sample.contract.FlightBookingService")
@Local(net.mahesh.sample.contract.FlightBookingService.class)
@WebService(targetNamespace="mahesh:sample:contract")
@TransactionAttribute(javax.ejb.TransactionAttributeType.SUPPORTS)
public class FlightBookingServiceImpl implements FlightBookingService {

	public SearchFlightOutput searchFlights(SearchFlightInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	public BookFlightOutput bookTickets(BookFlightInput input) {
		// TODO Auto-generated method stub
		return null;
	}

}
