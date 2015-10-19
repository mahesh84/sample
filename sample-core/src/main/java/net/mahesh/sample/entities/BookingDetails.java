package net.mahesh.sample.entities;


import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FBP_FLIGHT_BOOKINGS")
public class BookingDetails {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	@Column(name="BOOKING_ID")
	private String bookingId;
	@Column(name="FLIGHT_ID")
	private String flightId;
	private PassengerDetails passengerDetails;
	@Column(name="REPORTING_TIME")
	private Date reportingTime;
	@Column(name="CHECKIN_TIME")
	private Date checkinTime;
	@Column(name="PAYMENT_MODE")
	private String paymentMode;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the passengerDetails
	 */
	public PassengerDetails getPassengerDetails() {
		return passengerDetails;
	}
	/**
	 * @param passengerDetails the passengerDetails to set
	 */
	public void setPassengerDetails(PassengerDetails passengerDetails) {
		this.passengerDetails = passengerDetails;
	}
	/**
	 * @return the reportingTime
	 */
	public Date getReportingTime() {
		return reportingTime;
	}
	/**
	 * @param reportingTime the reportingTime to set
	 */
	public void setReportingTime(Date reportingTime) {
		this.reportingTime = reportingTime;
	}
	/**
	 * @return the checkinTime
	 */
	public Date getCheckinTime() {
		return checkinTime;
	}
	/**
	 * @param checkinTime the checkinTime to set
	 */
	public void setCheckinTime(Date checkinTime) {
		this.checkinTime = checkinTime;
	}
	/**
	 * @return the paymentMode
	 */
	public String getPaymentMode() {
		return paymentMode;
	}
	/**
	 * @param paymentMode the paymentMode to set
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BookingDetails ["
				+ (id != null ? "id=" + id + ", " : "")
				+ (bookingId != null ? "bookingId=" + bookingId + ", " : "")
				+ (flightId != null ? "flightId=" + flightId + ", " : "")
				+ (passengerDetails != null ? "passengerDetails="
						+ passengerDetails + ", " : "")
				+ (reportingTime != null ? "reportingTime=" + reportingTime
						+ ", " : "")
				+ (checkinTime != null ? "checkinTime=" + checkinTime + ", "
						: "")
				+ (paymentMode != null ? "paymentMode=" + paymentMode : "")
				+ "]";
	}

}
