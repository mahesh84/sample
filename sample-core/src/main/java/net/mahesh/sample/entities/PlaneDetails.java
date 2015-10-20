package net.mahesh.sample.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FBP_PLANE_DETAILS")
public class PlaneDetails {
	@Id
	@Column(name="PLANE_ID",unique=true, nullable=false)	
	private int planeId;
	@Column(name="TOTAL_SEAT_CAPACITY")
	private int totalseatCapacity;
	/**
	 * @return the planeId
	 */
	public int getPlaneId() {
		return planeId;
	}
	/**
	 * @param planeId the planeId to set
	 */
	public void setPlaneId(int planeId) {
		this.planeId = planeId;
	}
	/**
	 * @return the totalseatCapacity
	 */
	public int getTotalseatCapacity() {
		return totalseatCapacity;
	}
	/**
	 * @param totalseatCapacity the totalseatCapacity to set
	 */
	public void setTotalseatCapacity(int totalseatCapacity) {
		this.totalseatCapacity = totalseatCapacity;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PlaneDetails [planeId=" + planeId + ", totalseatCapacity="
				+ totalseatCapacity + "]";
	}

}
