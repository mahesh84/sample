package net.mahesh.sample.contract;

import javax.ejb.Local;

@Local
public interface FlightBookingService {

	/**
	 * METHOD FOR CHCKING AVAILABLE FLIGHTS BETWEEN TWO CITIES.
	 */
	public SearchFlightOutput searchFlights(SearchFlightInput input);

	/**
	 * METHOD FOR BOOKING TICKETS IN PERTICULAR FLIGHT.
	 */
	public BookFlightOutput bookTickets(BookFlightInput input);

}
