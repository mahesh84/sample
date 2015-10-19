package net.mahesh.sample.contract;

import java.util.List;

public class SearchFlightOutput {
	List<FlightDetails> flights;
	String responseCode;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SearchFlightOutput ["
				+ (flights != null ? "flights=" + flights + ", " : "")
				+ (responseCode != null ? "responseCode=" + responseCode : "")
				+ "]";
	}
	/**
	 * @return the flights
	 */
	public List getFlights() {
		return flights;
	}
	/**
	 * @param flights the flights to set
	 */
	public void setFlights(List flights) {
		this.flights = flights;
	}
	/**
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}
	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

}
