package net.mahesh.sample.entities;

import javax.persistence.Column;
import javax.persistence.Id;

public class PlaneDetails {
	@Id
	@Column(name="PLANE_ID")
	private String planeId;
	@Column(name="TOTAL_SEAT_CAPACITY")
	private int totalseatCapacity;

}
