package net.mahesh.sample.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PassengerDetails {
	@Column(name="PASSENGER_FIRST_NAME")
	private String firstName;
	@Column(name="PASSENGER_LAST_NAME")
	private String lastName;
	@Column(name="PASSENGER_AGE")
	private int age;
	@Column(name="PASSENGER_SEX")
	private String sex;
	@Column(name="PASSENGER_MOBILE")
	private String mobileNumber;	
	private Address passengerAddress;
	@Column(name="PASSENGER_ID_NUMBER")
	private String personalIdentificationId;
	@Column(name="PASSENGER_MEAL_CHOICE")
	private String mealsChoice;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the passengerAddress
	 */
	public Address getPassengerAddress() {
		return passengerAddress;
	}
	/**
	 * @param passengerAddress the passengerAddress to set
	 */
	public void setPassengerAddress(Address passengerAddress) {
		this.passengerAddress = passengerAddress;
	}
	/**
	 * @return the personalIdentificationId
	 */
	public String getPersonalIdentificationId() {
		return personalIdentificationId;
	}
	/**
	 * @param personalIdentificationId the personalIdentificationId to set
	 */
	public void setPersonalIdentificationId(String personalIdentificationId) {
		this.personalIdentificationId = personalIdentificationId;
	}
	/**
	 * @return the mealsChoice
	 */
	public String getMealsChoice() {
		return mealsChoice;
	}
	/**
	 * @param mealsChoice the mealsChoice to set
	 */
	public void setMealsChoice(String mealsChoice) {
		this.mealsChoice = mealsChoice;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PassengerDetails ["
				+ (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (lastName != null ? "lastName=" + lastName + ", " : "")
				+ "age="
				+ age
				+ ", "
				+ (sex != null ? "sex=" + sex + ", " : "")
				+ (mobileNumber != null ? "mobileNumber=" + mobileNumber + ", "
						: "")
				+ (passengerAddress != null ? "passengerAddress="
						+ passengerAddress + ", " : "")
				+ (personalIdentificationId != null ? "personalIdentificationId="
						+ personalIdentificationId + ", "
						: "")
				+ (mealsChoice != null ? "mealsChoice=" + mealsChoice : "")
				+ "]";
	}

}
