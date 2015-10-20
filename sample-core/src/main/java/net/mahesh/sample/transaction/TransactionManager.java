package net.mahesh.sample.transaction;

import javax.ejb.Local;

import net.mahesh.sample.entities.BookingDetails;

@Local(value=TransactionManager.class)
public interface TransactionManager {
	public BookingDetails bookFlight(BookingDetails bookingDetails);
}
