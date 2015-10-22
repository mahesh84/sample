package net.mahesh.sample.contract;

import java.util.List;

public class BookFlightOutput extends Output{
	
	private String confirmationStatus;
	private List<BookingDetails> bookingDetails;
	private int numberOfSeatsConfirmed;
	
	/**
	 * @return the numberOfSeatsCOnfirmed
	 */
	public int getNumberOfSeatsConfirmed() {
		return numberOfSeatsConfirmed;
	}

	/**
	 * @param numberOfSeatsCOnfirmed
	 *            the numberOfSeatsCOnfirmed to set
	 */
	public void setNumberOfSeatsConfirmed(int numberOfSeatsConfirmed) {
		this.numberOfSeatsConfirmed = numberOfSeatsConfirmed;
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
				+ (confirmationStatus != null ? "confirmationStatus="
						+ confirmationStatus + ", " : "")
				+ (bookingDetails != null ? "bookingDetails=" + bookingDetails
						+ ", " : "") + "numberOfSeatsConfirmed="
				+ numberOfSeatsConfirmed + "]";
	}

}
