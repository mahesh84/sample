package net.mahesh.sample.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FBP_AIRPORTS")
public class Airports {
	@Id
	@Column(name="AIRPORT_ID")
	private String airportId;
	@Column(name="AIRPORT_CITY")
	private String cityId;
	@Column(name="AIRPORT_CITY_NAME")
	private String cityName;
	@Column(name="AIRPORT_STATE")
	private String state;
	/**
	 * @return the airportId
	 */
	public String getAirportId() {
		return airportId;
	}
	/**
	 * @param airportId the airportId to set
	 */
	public void setAirportId(String airportId) {
		this.airportId = airportId;
	}
	/**
	 * @return the cityId
	 */
	public String getCityId() {
		return cityId;
	}
	/**
	 * @param cityId the cityId to set
	 */
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Airports ["
				+ (airportId != null ? "airportId=" + airportId + ", " : "")
				+ (cityId != null ? "cityId=" + cityId + ", " : "")
				+ (cityName != null ? "cityName=" + cityName + ", " : "")
				+ (state != null ? "state=" + state : "") + "]";
	}
	

}
