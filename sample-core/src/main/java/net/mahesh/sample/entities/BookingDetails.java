package net.mahesh.sample.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({ @NamedQuery(name = "net.mahesh.sample.entities.BookingDetails.findTotalBooking", query = "SELECT count(*) FROM BookingDetails bookings "
		+ "WHERE (bookings.journeyDate=:journeyDate and bookings.flightId=:flightId)") })

@Entity
@Table(name = "FBP_FLIGHT_BOOKINGS")
public class BookingDetails {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="BOOKING_ID")
	private String bookingId;
	@Column(name="FLIGHT_ID")
	private String flightId;
	private PassengerDetails passengerDetails;
	@Column(name="REPORTING_TIME")
	private String reportingTime;
	@Column(name="CHECKIN_TIME")
	private String checkinTime;
	@Column(name="PAYMENT_MODE")
	private String paymentMode;
	@Column(name="JOURNEY_DATE")
	private Date journeyDate;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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
	public String getReportingTime() {
		return reportingTime;
	}
	/**
	 * @param reportingTime the reportingTime to set
	 */
	public void setReportingTime(String reportingTime) {
		this.reportingTime = reportingTime;
	}
	/**
	 * @return the checkinTime
	 */
	public String getCheckinTime() {
		return checkinTime;
	}
	/**
	 * @param checkinTime the checkinTime to set
	 */
	public void setCheckinTime(String checkinTime) {
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
		return "BookingDetails [id="
				+ id
				+ ", "
				+ (bookingId != null ? "bookingId=" + bookingId + ", " : "")
				+ (flightId != null ? "flightId=" + flightId + ", " : "")
				+ (passengerDetails != null ? "passengerDetails="
						+ passengerDetails + ", " : "")
				+ (reportingTime != null ? "reportingTime=" + reportingTime
						+ ", " : "")
				+ (checkinTime != null ? "checkinTime=" + checkinTime + ", "
						: "")
				+ (paymentMode != null ? "paymentMode=" + paymentMode + ", "
						: "")
				+ (journeyDate != null ? "journeyDate=" + journeyDate : "")
				+ "]";
	}
	
	/*private String convertDepartureTime(int departureTimeConvert) {
		String timeRepresentation = "";
		int hours = departureTimeConvert / 60;
		int min = departureTimeConvert % 60;
		timeRepresentation = appendZero(hours) +":"+ appendZero(min);
		if(hours<12){
			timeRepresentation=timeRepresentation+" AM";
		}else{
			timeRepresentation=timeRepresentation+" PM";
		}
		return timeRepresentation;
	}

	private String appendZero(int digit) {
		if (digit < 10) {
			return "0" + digit;
		} else {
			return ""+digit;
		}
	}*/

}
