package com.tasolution.tasquare.model.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Tracker {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tracker_id")
	private int trackerId;

	@Column(name = "tracker_name")
	private String trackerName;

	public int getTrackerId() {
		return trackerId;
	}

	public void setTrackerId(int trackerId) {
		this.trackerId = trackerId;
	}

	public String getTrackerName() {
		return trackerName;
	}

	public void setTrackerName(String trackerName) {
		this.trackerName = trackerName;
	}
}