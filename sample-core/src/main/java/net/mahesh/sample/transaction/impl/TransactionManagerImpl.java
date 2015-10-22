package net.mahesh.sample.transaction.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.mahesh.sample.entities.BookingDetails;
import net.mahesh.sample.entities.FlightDetails;
import net.mahesh.sample.transaction.TransactionManager;

@Stateless(name = "net.mahesh.sample.transaction.imple.TransactionManagerImpl")
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class TransactionManagerImpl implements TransactionManager {
	private static final String DELIMITER = "-";

	@PersistenceContext(name = "fbp")
	private javax.persistence.EntityManager em;

	@EJB
	TransactionQueries trasnactionQueries;

	public List<BookingDetails> bookFlight(List<BookingDetails> bookingList) {

		long totalBookings = trasnactionQueries.getTotalBookings(bookingList
				.get(0).getFlightId(), bookingList.get(0).getJourneyDate());

		FlightDetails flightDetails = trasnactionQueries
				.getFlightDetails(bookingList.get(0).getFlightId());

		long totalCapacity = flightDetails.getPlaneId().getTotalseatCapacity();
		if (totalCapacity - totalBookings >= bookingList.size()) {
			if (null != bookingList) {
				int totalSeatToBook = 1;
				for (BookingDetails details : bookingList) {
					details.setBookingId(calculateBookingId(
							details.getFlightId(), details.getJourneyDate(),
							totalSeatToBook + totalBookings));
					totalSeatToBook++;
					em.persist(details);
				}
			}
		} else {
			return null;
		}

		return bookingList;
	}

	private String calculateBookingId(String flightId, Date journeyDate,
			long bookingNumber) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String dateInString = formatter.format(journeyDate);
		String bookingId = flightId + DELIMITER + dateInString + DELIMITER + bookingNumber;
		return bookingId;
	}

	public List<FlightDetails> searchFlights(FlightDetails flightDetails , Date journeyDate) {

		List<FlightDetails> listOfFlights = trasnactionQueries
				.getAvailableFlights(flightDetails.getOrigin(),
						flightDetails.getDestination());
		
		for(FlightDetails details:listOfFlights){
			long totalBookings = trasnactionQueries.getTotalBookings(details.getFlightId(), journeyDate);
			FlightDetails coreflightDetails = trasnactionQueries .getFlightDetails(details.getFlightId());
			if(totalBookings == coreflightDetails.getPlaneId().getTotalseatCapacity())
			{
				details.setStatus("FULL");
				
			}else{
				details.setAvailableNoOfSeats(coreflightDetails.getPlaneId().getTotalseatCapacity() - totalBookings);
			}
		}

		return listOfFlights;
	}
}