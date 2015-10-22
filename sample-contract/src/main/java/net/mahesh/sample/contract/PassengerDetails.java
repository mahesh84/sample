package net.mahesh.sample.contract;

import javax.validation.constraints.NotNull;

public class PassengerDetails {
	@NotNull
	private String firstName;
	private String lastName;
	private int age;
	private Address passengerAddressDetails;
	private Contact passengerContactDetails;
	private String mealChoice;
	private String personalId;
	private String sex;
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
	 * @return the passengerAddressDetails
	 */
	public Address getPassengerAddressDetails() {
		return passengerAddressDetails;
	}
	/**
	 * @param passengerAddressDetails the passengerAddressDetails to set
	 */
	public void setPassengerAddressDetails(Address passengerAddressDetails) {
		this.passengerAddressDetails = passengerAddressDetails;
	}
	/**
	 * @return the passengerContactDetails
	 */
	public Contact getPassengerContactDetails() {
		return passengerContactDetails;
	}
	/**
	 * @param passengerContactDetails the passengerContactDetails to set
	 */
	public void setPassengerContactDetails(Contact passengerContactDetails) {
		this.passengerContactDetails = passengerContactDetails;
	}
	/**
	 * @return the mealChoice
	 */
	public String getMealChoice() {
		return mealChoice;
	}
	/**
	 * @param mealChoice the mealChoice to set
	 */
	public void setMealChoice(String mealChoice) {
		this.mealChoice = mealChoice;
	}
	public String getPersonalId() {
		return personalId;
	}
	public void setPersonalId(String personalId) {
		this.personalId = personalId;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
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
				+ (passengerAddressDetails != null ? "passengerAddressDetails="
						+ passengerAddressDetails + ", " : "")
				+ (passengerContactDetails != null ? "passengerContactDetails="
						+ passengerContactDetails + ", " : "")
				+ (mealChoice != null ? "mealChoice=" + mealChoice + ", " : "")
				+ (personalId != null ? "personalId=" + personalId + ", " : "")
				+ (sex != null ? "sex=" + sex : "") + "]";
	}	
}
