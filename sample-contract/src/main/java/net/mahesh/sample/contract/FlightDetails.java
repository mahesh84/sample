package net.mahesh.sample.contract;

public class FlightDetails {
	String flightId;
	String origin;
	String destination;
	String flightDuration;
	String departureTime;
	int avaialableSeats;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlightDetails ["
				+ (flightId != null ? "flightId=" + flightId + ", " : "")
				+ (origin != null ? "origin=" + origin + ", " : "")
				+ (destination != null ? "destination=" + destination + ", "
						: "")
				+ (flightDuration != null ? "flightDuration=" + flightDuration
						+ ", " : "")
				+ (departureTime != null ? "departureTime=" + departureTime
						+ ", " : "") + "avaialableSeats=" + avaialableSeats
				+ ", pricePerSeat=" + pricePerSeat + ", totalBookingPrice="
				+ totalBookingPrice + "]";
	}
	long pricePerSeat;
	long totalBookingPrice;
	/**
	 * @return the flightId
	 */
	public String getFlightId() {
		return flightId;
	}
	/**
	 * @param flightId the flightId to set
	 */
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the flightDuration
	 */
	public String getFlightDuration() {
		return flightDuration;
	}
	/**
	 * @param flightDuration the flightDuration to set
	 */
	public void setFlightDuration(String flightDuration) {
		this.flightDuration = flightDuration;
	}
	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}
	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	/**
	 * @return the avaialableSeats
	 */
	public int getAvaialableSeats() {
		return avaialableSeats;
	}
	/**
	 * @param avaialableSeats the avaialableSeats to set
	 */
	public void setAvaialableSeats(int avaialableSeats) {
		this.avaialableSeats = avaialableSeats;
	}
	/**
	 * @return the pricePerSeat
	 */
	public long getPricePerSeat() {
		return pricePerSeat;
	}
	/**
	 * @param pricePerSeat the pricePerSeat to set
	 */
	public void setPricePerSeat(long pricePerSeat) {
		this.pricePerSeat = pricePerSeat;
	}
	/**
	 * @return the totalBookingPrice
	 */
	public long getTotalBookingPrice() {
		return totalBookingPrice;
	}
	/**
	 * @param totalBookingPrice the totalBookingPrice to set
	 */
	public void setTotalBookingPrice(long totalBookingPrice) {
		this.totalBookingPrice = totalBookingPrice;
	}

}
