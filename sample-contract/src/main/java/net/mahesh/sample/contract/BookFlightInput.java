package net.mahesh.sample.contract;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class BookFlightInput extends Input {
	@NotNull(message="Mandatory Input Field")
	@Valid
	private List<PassengerDetails> persengerDetails;
	@NotNull(message="Mandatory Input Field")
	private Integer totalNumberOfPassengers;
	@Valid
	@NotNull(message="Mandatory Input Field")
	private FlightDetails flightDetails;
	@NotNull(message="Mandatory Input Field")
	private Date journeyDate;
	
	/**
	 * @return the persengerDetails
	 */
	public List<PassengerDetails> getPersengerDetails() {
		return persengerDetails;
	}
	/**
	 * @param persengerDetails the persengerDetails to set
	 */
	public void setPersengerDetails(List<PassengerDetails> persengerDetails) {
		this.persengerDetails = persengerDetails;
	}
	/**
	 * @return the totalNumberOfPassengers
	 */
	public Integer getTotalNumberOfPassengers() {
		return totalNumberOfPassengers;
	}
	/**
	 * @param totalNumberOfPassengers the totalNumberOfPassengers to set
	 */
	public void setTotalNumberOfPassengers(Integer totalNumberOfPassengers) {
		this.totalNumberOfPassengers = totalNumberOfPassengers;
	}
	/**
	 * @return the flightDetails
	 */
	public FlightDetails getFlightDetails() {
		return flightDetails;
	}
	/**
	 * @param flightDetails the flightDetails to set
	 */
	public void setFlightDetails(FlightDetails flightDetails) {
		this.flightDetails = flightDetails;
	}
	/**
	 * @return the journeyDate
	 */
	public Date getJourneyDate() {
		return journeyDate;
	}
	/**
	 * @param journeyDate the journeyDate to set
	 */
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BookFlightInput ["
				+ (persengerDetails != null ? "persengerDetails="
						+ persengerDetails + ", " : "")
				+ (totalNumberOfPassengers != null ? "totalNumberOfPassengers="
						+ totalNumberOfPassengers + ", " : "")
				+ (flightDetails != null ? "flightDetails=" + flightDetails
						+ ", " : "")
				+ (journeyDate != null ? "journeyDate=" + journeyDate : "")
				+ "]";
	}
	
	
}
