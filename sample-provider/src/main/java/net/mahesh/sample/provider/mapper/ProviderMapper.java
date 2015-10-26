package net.mahesh.sample.provider.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.mahesh.sample.contract.BookFlightInput;
import net.mahesh.sample.contract.SearchFlightInput;
import net.mahesh.sample.entities.Address;
import net.mahesh.sample.entities.BookingDetails;
import net.mahesh.sample.entities.FlightDetails;
import net.mahesh.sample.entities.PassengerDetails;

public class ProviderMapper {

	public static List<BookingDetails> mapToCore(BookFlightInput input) {
		List<BookingDetails> bookingList = new ArrayList<BookingDetails>();
		BookingDetails bookingDetails = new BookingDetails();
		for (int noOfPassengers = 0; noOfPassengers < input
				.getTotalNumberOfPassengers(); noOfPassengers++) {
			bookingDetails.setBookingId(input.getFlightDetails().getFlightId()
					+ input.getFlightDetails().getDepartureTime());
			bookingDetails.setFlightId(input.getFlightDetails().getFlightId());
			bookingDetails.setCheckinTime(calculateCheckInTime(input
					.getFlightDetails().getDepartureTime()));
			bookingDetails
					.setPassengerDetails(prepareCorePassengerDetails(input
							.getPersengerDetails().get(noOfPassengers)));
			bookingDetails.setReportingTime(calculateReportingTime(input.getFlightDetails()
					.getDepartureTime()));
			bookingDetails.setBookingId(input.getFlightDetails().getFlightId()
					+ noOfPassengers);
			bookingDetails.setJourneyDate(input.getJourneyDate());
			bookingList.add(bookingDetails);
		}
		return bookingList;
	}

	private static String calculateReportingTime(String departureTime) {
		if(null!=departureTime){
			int departureTimeInMin = convertTimeStringToInt(departureTime);
			
			if((departureTimeInMin-60)>0){
				return convertintTimeToString((departureTimeInMin-120));
			}else{
				return convertintTimeToString((24*60)-(departureTimeInMin-120));
			}
		}
		return departureTime;		
	}

	private static String calculateCheckInTime(String departureTime) {
		
		if(null!=departureTime){
			int departureTimeInMin = convertTimeStringToInt(departureTime);
			
			if((departureTimeInMin-60)>0){
				return convertintTimeToString((departureTimeInMin-60));
			}else{
				return convertintTimeToString((24*60)-(departureTimeInMin-60));
			}
		}
		return departureTime;		
	}

	private static PassengerDetails prepareCorePassengerDetails(
			net.mahesh.sample.contract.PassengerDetails contractPassengerDetails) {
		PassengerDetails corePassengerDetails = new PassengerDetails();
		corePassengerDetails.setAge(contractPassengerDetails.getAge());
		corePassengerDetails.setFirstName(contractPassengerDetails
				.getFirstName());
		corePassengerDetails
				.setLastName(contractPassengerDetails.getLastName());
		corePassengerDetails.setMealsChoice(contractPassengerDetails
				.getMealChoice());
		if(null!=contractPassengerDetails
				.getPassengerContactDetails()){
		corePassengerDetails.setMobileNumber(contractPassengerDetails
				.getPassengerContactDetails().getMobileNumber());
		}
		corePassengerDetails
				.setPassengerAddress(prepareCoreAddress(contractPassengerDetails
						.getPassengerAddressDetails()));
		corePassengerDetails
				.setPersonalIdentificationId(contractPassengerDetails
						.getPersonalId());
		corePassengerDetails.setSex(contractPassengerDetails.getSex());
		return corePassengerDetails;
	}

	private static Address prepareCoreAddress(
			net.mahesh.sample.contract.Address passengerAddressDetails) {
		Address coreAddress = new Address();
		if (null != passengerAddressDetails) {
			coreAddress.setFirstLineOfAddress(passengerAddressDetails
					.getFirstLineOfAddress());
			coreAddress.setSecondLineOfAddress(passengerAddressDetails
					.getSecondLineOfAddress());
			coreAddress.setThirdLineOfAddress(passengerAddressDetails
					.getThirdLineOfAddress());
			coreAddress.setCity(passengerAddressDetails.getCity());
			coreAddress.setCountry(passengerAddressDetails.getCountry());
			coreAddress.setPinCode(passengerAddressDetails.getPinCode());
			coreAddress.setState(passengerAddressDetails.getState());
		}
		return coreAddress;
	}

	private static int convertTimeStringToInt(String departureTime) {
		int timeInMin = 0;
		// 00:00 AM
		int hours = Integer.parseInt(departureTime.substring(0, 2));
		int mins = Integer.parseInt(departureTime.substring(3, 5));
		timeInMin = (hours * 60) + mins;
		return timeInMin;
	}

	public static FlightDetails mapToFlightDetailsEntity(SearchFlightInput input) {
		FlightDetails flightDetails = new FlightDetails();
		flightDetails.setOrigin(input.getOrigin());
		flightDetails.setDestination(input.getDestination());	
		return flightDetails;
	}

	public static List<net.mahesh.sample.contract.FlightDetails> prepareCotractList(
			List<FlightDetails> flights) {
		if (null != flights) {
			List<net.mahesh.sample.contract.FlightDetails> listContractFlightDetails = new ArrayList<net.mahesh.sample.contract.FlightDetails>();
			for (FlightDetails coreFlightDetails : flights) {
				net.mahesh.sample.contract.FlightDetails contractFlightDetails = mapCoreToContractFlightDetails(coreFlightDetails);
				listContractFlightDetails.add(contractFlightDetails);
			}
			return listContractFlightDetails;
		}
		return null;
	}

	private static net.mahesh.sample.contract.FlightDetails mapCoreToContractFlightDetails(
			FlightDetails coreFlightDetails) {
		net.mahesh.sample.contract.FlightDetails contractFlightDDetails = new net.mahesh.sample.contract.FlightDetails();
		contractFlightDDetails.setDepartureTime(coreFlightDetails
				.getDepartureTime());
		contractFlightDDetails.setDestination(coreFlightDetails
				.getDestination());
		contractFlightDDetails.setFlightDuration(coreFlightDetails
				.getFlightDuration());
		contractFlightDDetails.setFlightId(coreFlightDetails.getFlightId());
		contractFlightDDetails.setOrigin(coreFlightDetails.getOrigin());
		contractFlightDDetails.setPricePerSeat(coreFlightDetails.getCost()
				.getValue());
		contractFlightDDetails.setFlightStatus(coreFlightDetails.getStatus());
		contractFlightDDetails.setAvaialableSeats(coreFlightDetails.getAvailableNoOfSeats());
		return contractFlightDDetails;
	}

	private static String convertintTimeToString(int departureTimeConvert) {
		String timeRepresentation = "";
		int hours = departureTimeConvert / 60;
		int min = departureTimeConvert % 60;
		timeRepresentation = appendZero(hours) + ":" + appendZero(min);
		if (hours < 12) {
			timeRepresentation = timeRepresentation + " AM";
		} else {
			timeRepresentation = timeRepresentation + " PM";
		}
		return timeRepresentation;
	}

	private static String appendZero(int digit) {
		if (digit < 10) {
			return "0" + digit;
		} else {
			return "" + digit;
		}
	}

	public static List<net.mahesh.sample.contract.BookingDetails> mapBookingDetailsCoreToCotract(
			List<BookingDetails> details) {
		if (null != details) {
			List<net.mahesh.sample.contract.BookingDetails> listContractBookingDetails = new ArrayList<net.mahesh.sample.contract.BookingDetails>();
			for (BookingDetails coreBookingDetails : details) {
				net.mahesh.sample.contract.BookingDetails contractBookingDetails = mapCoreToContractBookingDetails(coreBookingDetails);
				listContractBookingDetails.add(contractBookingDetails);
			}			
			return listContractBookingDetails;
		}
		return null;
	}

	private static net.mahesh.sample.contract.BookingDetails mapCoreToContractBookingDetails(
			BookingDetails coreBookingDetails) {
		net.mahesh.sample.contract.BookingDetails contractBookingDetails = new net.mahesh.sample.contract.BookingDetails();
		contractBookingDetails.setCheckinTime(coreBookingDetails
				.getCheckinTime());
		contractBookingDetails.setReportingTime(coreBookingDetails.getReportingTime());
		contractBookingDetails.setBookingId(coreBookingDetails.getBookingId());
		return contractBookingDetails;
	}

}
