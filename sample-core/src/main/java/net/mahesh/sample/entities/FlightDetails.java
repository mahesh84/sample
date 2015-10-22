package net.mahesh.sample.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@NamedQueries({
		@NamedQuery(name = "net.mahesh.sample.entities.FlightDetails.findAvaialbleFlights", query = "SELECT flights FROM FlightDetails flights "
				+ "WHERE (flights.origin=:origin and flights.destination=:destination)"),
		@NamedQuery(name = "net.mahesh.sample.entities.FlightDetails.findFlightDetailsById", query = "SELECT flight FROM FlightDetails flight "
				+ "WHERE (flight.flightId=:flightId)")

})
@Entity
@Table(name = "FBP_FLIGHT_DETAILS")
public class FlightDetails {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "FLIGHT_ID",unique=true,nullable=false)
	private String flightId;
	@OneToOne
	@JoinColumn(name = "PLANE_ID", referencedColumnName = "PLANE_ID")
	private PlaneDetails planeId;
	@Column(name = "DESTINATION")
	private String destination;
	@Column(name = "ORIGIN")
	private String origin;
	@Column(name = "DEPARTURE_TIME")
	private String departureTime;
	@Column(name = "FLIGHT_DURATION")
	private String flightDuration;
	@AttributeOverrides({
			@AttributeOverride(name = "value", column = @Column(name = "FLIGHT_COST_VALUE")),
			@AttributeOverride(name = "isoCode", column = @Column(name = "FLIGHT_COST_CURRENCY")) })
	private Amount cost;
	@Column(name = "FLIGHT_STATUS")
	private String status;
	@Column(name = "FLIGHT_INFO")
	private String flightInfo;
	@Transient
	private long availableNoOfSeats;

	/**
	 * @return the availableNoOfSeats
	 */
	public long getAvailableNoOfSeats() {
		return availableNoOfSeats;
	}

	/**
	 * @param availableNoOfSeats the availableNoOfSeats to set
	 */
	public void setAvailableNoOfSeats(long availableNoOfSeats) {
		this.availableNoOfSeats = availableNoOfSeats;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination
	 *            the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin
	 *            the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}

	/**
	 * @param departureTime
	 *            the departureTime to set
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	/**
	 * @return the cost
	 */
	public Amount getCost() {
		return cost;
	}

	/**
	 * @param cost
	 *            the cost to set
	 */
	public void setCost(Amount cost) {
		this.cost = cost;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the flightInfo
	 */
	public String getFlightInfo() {
		return flightInfo;
	}

	/**
	 * @param flightInfo
	 *            the flightInfo to set
	 */
	public void setFlightInfo(String flightInfo) {
		this.flightInfo = flightInfo;
	}

	/**
	 * @return the flightId
	 */
	public String getFlightId() {
		return flightId;
	}

	/**
	 * @param flightId
	 *            the flightId to set
	 */
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	/**
	 * @return the planeId
	 */
	public PlaneDetails getPlaneId() {
		return planeId;
	}

	/**
	 * @param planeId
	 *            the planeId to set
	 */
	public void setPlaneId(PlaneDetails planeId) {
		this.planeId = planeId;
	}

	/**
	 * @return the flightDuration
	 */
	public String getFlightDuration() {
		return flightDuration;
	}

	/**
	 * @param flightDuration
	 *            the flightDuration to set
	 */
	public void setFlightDuration(String flightDuration) {
		this.flightDuration = flightDuration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlightDetails [id="
				+ id
				+ ", "
				+ (flightId != null ? "flightId=" + flightId + ", " : "")
				+ (planeId != null ? "planeId=" + planeId + ", " : "")
				+ (destination != null ? "destination=" + destination + ", "
						: "")
				+ (origin != null ? "origin=" + origin + ", " : "")
				+ (departureTime != null ? "departureTime=" + departureTime
						+ ", " : "")
				+ (flightDuration != null ? "flightDuration=" + flightDuration
						+ ", " : "")
				+ (cost != null ? "cost=" + cost + ", " : "")
				+ (status != null ? "status=" + status + ", " : "")
				+ (flightInfo != null ? "flightInfo=" + flightInfo : "") + "]";
	}

	/*
	 * private String convertDepartureTime(int departureTimeConvert) { String
	 * timeRepresentation = ""; int hours = departureTimeConvert / 60; int min =
	 * departureTimeConvert % 60; timeRepresentation = appendZero(hours) +":"+
	 * appendZero(min); if(hours<12){
	 * timeRepresentation=timeRepresentation+" AM"; }else{
	 * timeRepresentation=timeRepresentation+" PM"; } return timeRepresentation;
	 * }
	 * 
	 * private String appendZero(int digit) { if (digit < 10) { return "0" +
	 * digit; } else { return ""+digit; } }
	 */
}
