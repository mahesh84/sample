package net.mahesh.sample.provider.mapper;

import net.mahesh.sample.contract.BookFlightInput;
import net.mahesh.sample.entities.BookingDetails;
import net.mahesh.sample.entities.PassengerDetails;

public class ProviderMapper {

	public static BookingDetails mapToCore(BookFlightInput input) {
		BookingDetails bookingDetails = new BookingDetails();
		bookingDetails.setBookingId(input.getFlightDetails().getFlightId()+input.getFlightDetails().getDepartureTime());
		bookingDetails.setFlightId(input.getFlightDetails().getFlightId());
		bookingDetails.setCheckinTime(input.getFlightDetails().getDepartureTime());
		bookingDetails.setPassengerDetails(new PassengerDetails());
		bookingDetails.getPassengerDetails().setFirstName(input.getPersengerDetails().get(0).getFirstName());
		bookingDetails.getPassengerDetails().setLastName(input.getPersengerDetails().get(0).getLastName());
		bookingDetails.getPassengerDetails().setAge(input.getPersengerDetails().get(0).getAge());
		//bookingDetails.getPassengerDetails().setMobileNumber(input.getPersengerDetails().get(0).get());// TODO-Add mobile number in contract		
		return bookingDetails;		
	}
}
