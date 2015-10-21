package net.mahesh.sample.contract;

import java.util.List;

import net.mahesh.sample.contract.common.Constraint;

public class Output {
	private String responseCode;
	private List<Constraint> constraints;	
	/**
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}
	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	/**
	 * @return the constraints
	 */
	public List<Constraint> getConstraints() {
		return constraints;
	}
	/**
	 * @param constraints the constraints to set
	 */
	public void setConstraints(List<Constraint> constraints) {
		this.constraints = constraints;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Output ["
				+ (responseCode != null ? "responseCode=" + responseCode + ", "
						: "")
				+ (constraints != null ? "constraints=" + constraints : "")
				+ "]";
	}

}
