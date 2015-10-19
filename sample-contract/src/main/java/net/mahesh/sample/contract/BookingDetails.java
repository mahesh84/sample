package net.mahesh.sample.contract;

public class BookingDetails {
String origin;
String destination;
String checkinTime;
int numberOfSeatsCOnfirmed;
double totalPaymentRecieved;
FlightDetails flightDetails;
/**
 * @return the origin
 */
public String getOrigin() {
	return origin;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "BookingDetails ["
			+ (origin != null ? "origin=" + origin + ", " : "")
			+ (destination != null ? "destination=" + destination + ", " : "")
			+ (checkinTime != null ? "checkinTime=" + checkinTime + ", " : "")
			+ "numberOfSeatsCOnfirmed=" + numberOfSeatsCOnfirmed
			+ ", totalPaymentRecieved=" + totalPaymentRecieved + ", "
			+ (flightDetails != null ? "flightDetails=" + flightDetails : "")
			+ "]";
}
/**
 * @param origin the origin to set
 */
public void setOrigin(String origin) {
	this.origin = origin;
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
 * @return the numberOfSeatsCOnfirmed
 */
public int getNumberOfSeatsCOnfirmed() {
	return numberOfSeatsCOnfirmed;
}
/**
 * @param numberOfSeatsCOnfirmed the numberOfSeatsCOnfirmed to set
 */
public void setNumberOfSeatsCOnfirmed(int numberOfSeatsCOnfirmed) {
	this.numberOfSeatsCOnfirmed = numberOfSeatsCOnfirmed;
}
/**
 * @return the totalPaymentRecieved
 */
public double getTotalPaymentRecieved() {
	return totalPaymentRecieved;
}
/**
 * @param totalPaymentRecieved the totalPaymentRecieved to set
 */
public void setTotalPaymentRecieved(double totalPaymentRecieved) {
	this.totalPaymentRecieved = totalPaymentRecieved;
}
/**
 * @return the flightDetails
 */
public FlightDetails getFlightDetails() {
	return flightDetails;
}
/**
 * @param flightDetails the flightDetails to set
 */
public void setFlightDetails(FlightDetails flightDetails) {
	this.flightDetails = flightDetails;
}
}
