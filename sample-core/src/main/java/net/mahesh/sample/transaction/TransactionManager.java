package net.mahesh.sample.transaction;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import net.mahesh.sample.entities.BookingDetails;
import net.mahesh.sample.entities.FlightDetails;

@Local(value=TransactionManager.class)
public interface TransactionManager {
	public List<BookingDetails> bookFlight(List<BookingDetails> bookingList);
	public List<FlightDetails> searchFlights(FlightDetails flightDetails, Date journeyDate);
}
