package net.mahesh.sample.transaction.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.mahesh.sample.entities.FlightDetails;

@Stateless(name="net.mahesh.sample.transaction.imple.TransactionQueries")
public class TransactionQueries {
	
	@PersistenceContext(name="fbp")
	private javax.persistence.EntityManager em;
	
	public long getTotalBookings(String flightId, Date journeyDate){
		final Query query = em.createNamedQuery("net.mahesh.sample.entities.BookingDetails.findTotalBooking");
		query.setParameter("flightId", flightId);
		query.setParameter("journeyDate", journeyDate);
		long numberOfBookedSeats= (Long) query.getSingleResult();
		return numberOfBookedSeats;
	}
	
	public FlightDetails getFlightDetails(String flightId){
		final Query query = em.createNamedQuery("net.mahesh.sample.entities.FlightDetails.findFlightDetailsById");
		query.setParameter("flightId", flightId);		
		return (FlightDetails) query.getSingleResult();		
	}

	@SuppressWarnings("unchecked")
	public List<FlightDetails> getAvailableFlights(String origin,
			String destination) {
		final Query query = em.createNamedQuery("net.mahesh.sample.entities.FlightDetails.findAvaialbleFlights");
		query.setParameter("origin",origin);
		query.setParameter("destination", destination);		
		return (List<FlightDetails>)query.getResultList();
	}
}
