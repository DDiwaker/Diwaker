package com.sfmi.beans;

import java.util.Calendar;

public class Reminder {
	private String event;
	private Calendar eventDate;
	
	public void setEvent(String event) {
		this.event = event;
	}
	
	
	public void setEventDate(Calendar eventDate) {
		this.eventDate = eventDate;
	}


	public String getReminder() {
		return "Reminder [event=" + event + ", eventDate=" + eventDate.getTime() + "]";
	}
	
	
	
	

}
