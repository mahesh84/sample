package net.mahesh.sample.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Address {
	@Column(name="ADDRESS_LINE_1")
	String firstLineOfAddress;
	@Column(name="ADDRESS_LINE_2")
	String SecondLineOfAddress;
	@Column(name="ADDRESS_LINE_3")
	String thirdLineOfAddress;
	@Column(name="PIN_CODE")
	String pinCode;
	@Column(name="CITY")
	String city;
	@Column(name="STATE")
	String state;
	@Column(name="COUNTRY")
	String country;
	/**
	 * @return the firstLineOfAddress
	 */
	public String getFirstLineOfAddress() {
		return firstLineOfAddress;
	}
	
	/**
	 * @param firstLineOfAddress the firstLineOfAddress to set
	 */
	public void setFirstLineOfAddress(String firstLineOfAddress) {
		this.firstLineOfAddress = firstLineOfAddress;
	}
	/**
	 * @return the secondLineOfAddress
	 */
	public String getSecondLineOfAddress() {
		return SecondLineOfAddress;
	}
	/**
	 * @param secondLineOfAddress the secondLineOfAddress to set
	 */
	public void setSecondLineOfAddress(String secondLineOfAddress) {
		SecondLineOfAddress = secondLineOfAddress;
	}
	/**
	 * @return the thirdLineOfAddress
	 */
	public String getThirdLineOfAddress() {
		return thirdLineOfAddress;
	}
	/**
	 * @param thirdLineOfAddress the thirdLineOfAddress to set
	 */
	public void setThirdLineOfAddress(String thirdLineOfAddress) {
		this.thirdLineOfAddress = thirdLineOfAddress;
	}
	/**
	 * @return the pinCode
	 */
	public String getPinCode() {
		return pinCode;
	}
	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
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
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address ["
				+ (firstLineOfAddress != null ? "firstLineOfAddress="
						+ firstLineOfAddress + ", " : "")
				+ (SecondLineOfAddress != null ? "SecondLineOfAddress="
						+ SecondLineOfAddress + ", " : "")
				+ (thirdLineOfAddress != null ? "thirdLineOfAddress="
						+ thirdLineOfAddress + ", " : "")
				+ (pinCode != null ? "pinCode=" + pinCode + ", " : "")
				+ (city != null ? "city=" + city + ", " : "")
				+ (state != null ? "state=" + state + ", " : "")
				+ (country != null ? "country=" + country : "") + "]";
	}
}

