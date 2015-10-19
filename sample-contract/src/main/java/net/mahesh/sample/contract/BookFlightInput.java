package net.mahesh.sample.contract;

import java.util.List;

public class BookFlightInput {
	List<PassengerDetails> persengerDetails;
	int totalNumberOfPassengers;
	FlightDetails flightDetails;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BookFlightInput ["
				+ (persengerDetails != null ? "persengerDetails="
						+ persengerDetails + ", " : "")
				+ "totalNumberOfPassengers="
				+ totalNumberOfPassengers
				+ ", "
				+ (flightDetails != null ? "flightDetails=" + flightDetails
						: "") + "]";
	}
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
	public int getTotalNumberOfPassengers() {
		return totalNumberOfPassengers;
	}
	/**
	 * @param totalNumberOfPassengers the totalNumberOfPassengers to set
	 */
	public void setTotalNumberOfPassengers(int totalNumberOfPassengers) {
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
}
