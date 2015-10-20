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
@Table(name = "FBP_FLIGHT_DETAILS")
public class FlightDetails {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="FLIGHT_ID")
	private String flinght_id;
	@Column(name="PLANE_ID")
	private String plane_id;
	@Column(name="DESTINATION")
	private String destination;
	@Column(name="ORIGIN")
	private String origin;
	@Column(name="DEPARTURE_TIME")
	private Date departureTime;	
	@AttributeOverrides( {
        @AttributeOverride(name="value", column=@Column(name="FLIGHT_COST_VALUE")),
        @AttributeOverride(name="isoCode", column=@Column(name="FLIGHT_COST_CURRENCY"))
    })
	private Amount cost;
	@Column(name="FLIGHT_STATUS")
	private String status;
	@Column(name="FLIGHT_INFO")
	private String flightInfo;
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
	 * @return the flinght_id
	 */
	public String getFlinght_id() {
		return flinght_id;
	}
	/**
	 * @param flinght_id the flinght_id to set
	 */
	public void setFlinght_id(String flinght_id) {
		this.flinght_id = flinght_id;
	}
	/**
	 * @return the plane_id
	 */
	public String getPlane_id() {
		return plane_id;
	}
	/**
	 * @param plane_id the plane_id to set
	 */
	public void setPlane_id(String plane_id) {
		this.plane_id = plane_id;
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
	 * @return the departureTime
	 */
	public Date getDepartureTime() {
		return departureTime;
	}
	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	/**
	 * @return the cost
	 */
	public Amount getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
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
	 * @param status the status to set
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
	 * @param flightInfo the flightInfo to set
	 */
	public void setFlightInfo(String flightInfo) {
		this.flightInfo = flightInfo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlightDetails ["
				+ ("id=" + id + ", ")
				+ (flinght_id != null ? "flinght_id=" + flinght_id + ", " : "")
				+ (plane_id != null ? "plane_id=" + plane_id + ", " : "")
				+ (destination != null ? "destination=" + destination + ", "
						: "")
				+ (origin != null ? "origin=" + origin + ", " : "")
				+ (departureTime != null ? "departureTime=" + departureTime
						+ ", " : "")
				+ (cost != null ? "cost=" + cost + ", " : "")
				+ (status != null ? "status=" + status + ", " : "")
				+ (flightInfo != null ? "flightInfo=" + flightInfo : "") + "]";
	}

}
