package net.mahesh.sample.contract;

import java.util.List;

public class BookFlightOutput {
	String responseCode;
	String confirmationStatus;
	List<BookingDetails> bookingDetails;
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
	/**
	 * @return the confirmationStatus
	 */
	public String getConfirmationStatus() {
		return confirmationStatus;
	}
	/**
	 * @param confirmationStatus the confirmationStatus to set
	 */
	public void setConfirmationStatus(String confirmationStatus) {
		this.confirmationStatus = confirmationStatus;
	}
	/**
	 * @return the bookingDetails
	 */
	public List<BookingDetails> getBookingDetails() {
		return bookingDetails;
	}
	/**
	 * @param bookingDetails the bookingDetails to set
	 */
	public void setBookingDetails(List<BookingDetails> bookingDetails) {
		this.bookingDetails = bookingDetails;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BookFlightOutput ["
				+ (responseCode != null ? "responseCode=" + responseCode + ", "
						: "")
				+ (confirmationStatus != null ? "confirmationStatus="
						+ confirmationStatus + ", " : "")
				+ (bookingDetails != null ? "bookingDetails=" + bookingDetails
						: "") + "]";
	}

}
