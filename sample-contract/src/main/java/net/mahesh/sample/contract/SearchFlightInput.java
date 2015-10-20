package net.mahesh.sample.contract;
import java.util.Date;


public class SearchFlightInput extends Input {
	String destination;
	String origin;
	String numberOfPassengers;
	Date dateOfTravel;
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(String numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	public Date getDateOfTravel() {
		return dateOfTravel;
	}
	public void setDateOfTravel(Date dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}
	@Override
	public String toString() {
		return "SearchFlightInput ["
				+ (destination != null ? "destination=" + destination + ", "
						: "")
				+ (origin != null ? "origin=" + origin + ", " : "")
				+ (numberOfPassengers != null ? "numberOfPassengers="
						+ numberOfPassengers + ", " : "")
				+ (dateOfTravel != null ? "dateOfTravel=" + dateOfTravel : "")
				+ "]";
	}
}
