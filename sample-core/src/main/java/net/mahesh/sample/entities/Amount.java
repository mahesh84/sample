package net.mahesh.sample.entities;

import java.util.Currency;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Amount {
	@Column(name="value")
	private double value;
	@Column(name="isoCode")
	private Currency isoCode;
	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Amount [value=" + value + ", "
				+ (isoCode != null ? "isoCode=" + isoCode : "") + "]";
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}
	/**
	 * @return the isoCode
	 */
	public Currency getIsoCode() {
		return isoCode;
	}
	/**
	 * @param isoCode the isoCode to set
	 */
	public void setIsoCode(Currency isoCode) {
		this.isoCode = isoCode;
	}
	
}
