package net.mahesh.sample.contract;
import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


public class SearchFlightInput extends Input {
	@NotNull(message="Mandatory Input Field")
	private String destination;
	@NotNull(message="Mandatory Input Field")
	private String origin;	
	@Min(value=1)
	private int numberOfPassengers;	
	@Future(message="Date should be from Future.")
	private Date dateOfTravel;
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
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
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
				+ ("numberOfPassengers "+ numberOfPassengers )
				+ (dateOfTravel != null ? "dateOfTravel=" + dateOfTravel : "")
				+ "]";
	}
}
