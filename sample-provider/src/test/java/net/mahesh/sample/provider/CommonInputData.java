package net.mahesh.sample.provider;

import java.util.Calendar;
import java.util.Currency;
import java.util.Date;

import net.mahesh.sample.contract.SearchFlightInput;
import net.mahesh.sample.entities.Amount;
import net.mahesh.sample.entities.FlightDetails;
import net.mahesh.sample.entities.PlaneDetails;

public class CommonInputData {
	public static SearchFlightInput getSearchFlightInput(){
		SearchFlightInput input = new SearchFlightInput();
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date()); // Now use today date.
		cal.add(Calendar.DATE, 1); // Adds 15 days
		input.setDateOfTravel(cal.getTime());
		input.setDestination("E");
		input.setNumberOfPassengers(1);
		input.setOrigin("C");		
		return input;
	}
	
	public static FlightDetails getCoreFlightDetails(){
		FlightDetails details = new FlightDetails();
		details.setAvailableNoOfSeats(2);
		details.setCost(getAmount());
		details.setDepartureTime("07:30 AM");
		details.setDestination("F");
		details.setFlightDuration("01:30");
		details.setFlightId("FBP-F-C-1");
		details.setFlightInfo("BOEING-777");
		details.setOrigin("C");
		details.setPlaneId(getPlaneDetails());
		details.setStatus("AVAILABLE");
		return details;
	}

	private static PlaneDetails getPlaneDetails() {
		PlaneDetails details = new PlaneDetails();
		details.setPlaneId(10015);
		details.setTotalseatCapacity(100);
		return details;
	}

	private static Amount getAmount() {
		Amount amount = new Amount();
		amount.setValue(1000);
		amount.setIsoCode(Currency.getInstance("INR"));
		return amount;
	}

}
