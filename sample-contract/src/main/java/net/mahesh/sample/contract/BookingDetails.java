package net.mahesh.sample.contract;

public class BookingDetails {
	
	private String checkinTime;
	private String reportingTime;
	private String origin;
	private String destination;
	private String bookingId;

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
	 * @return the bookingId
	 */
	public String getBookingId() {
		return bookingId;
	}

	/**
	 * @param bookingId the bookingId to set
	 */
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	/**
	 * @return the checkinTime
	 */
	public String getCheckinTime() {
		return checkinTime;
	}

	/**
	 * @param checkinTime
	 *            the checkinTime to set
	 */
	public void setCheckinTime(String checkinTime) {
		this.checkinTime = checkinTime;
	}
	
	public String getReportingTime() {
		return reportingTime;
	}

	public void setReportingTime(String reportingTime) {
		this.reportingTime = reportingTime;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BookingDetails ["+(checkinTime != null ? "checkinTime=" + checkinTime + ", "
						: "")
				+ (reportingTime != null ? "reportingTime=" + reportingTime
						+ ", " : "")
				+ (origin != null ? "origin=" + origin + ", " : "")
				+ (destination != null ? "destination=" + destination + ", "
						: "")
				+ (bookingId != null ? "bookingId=" + bookingId : "") + "]";
	}
}
