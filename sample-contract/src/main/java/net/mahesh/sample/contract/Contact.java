package net.mahesh.sample.contract;

public class Contact {
String mobileNumber;
String emailId;
String landLineNumber;
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Contact ["
			+ (mobileNumber != null ? "mobileNumber=" + mobileNumber + ", "
					: "")
			+ (emailId != null ? "emailId=" + emailId + ", " : "")
			+ (landLineNumber != null ? "landLineNumber=" + landLineNumber : "")
			+ "]";
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
 * @return the emailId
 */
public String getEmailId() {
	return emailId;
}
/**
 * @param emailId the emailId to set
 */
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
/**
 * @return the landLineNumber
 */
public String getLandLineNumber() {
	return landLineNumber;
}
/**
 * @param landLineNumber the landLineNumber to set
 */
public void setLandLineNumber(String landLineNumber) {
	this.landLineNumber = landLineNumber;
}
}
