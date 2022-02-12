package com.cricket.containers;

import com.cricket.model.Inning;

public class Scorecard {
	
	private String status;
	private Inning inning;

	public Scorecard() {
		super();
	}
	
	public Scorecard(Inning inning) {
		super();
		this.inning = inning;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Inning getInning() {
		return inning;
	}

	public void setInning(Inning inning) {
		this.inning = inning;
	}

}
