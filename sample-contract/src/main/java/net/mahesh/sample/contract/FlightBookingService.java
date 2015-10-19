package net.mahesh.sample.contract;

import javax.ejb.Local;

@Local
public interface FlightBookingService {
	
	public SearchFlightOutput searchFlights(SearchFlightInput input);
	public BookFlightOutput bookTickets(BookFlightInput input);

}
