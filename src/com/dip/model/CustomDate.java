package com.dip.model;

/**
 * @author HCL
 *
 */
public class CustomDate {
	private String dateTimeStamp;
	private String aestEventDateTime;
	private String eventTimezone;

	public String getDateTimeStamp() {
		return dateTimeStamp;
	}

	public void setDateTimeStamp(String dateTimeStamp) {
		this.dateTimeStamp = dateTimeStamp;
	}

	public String getAestEventDateTime() {
		return aestEventDateTime;
	}

	public void setAestEventDateTime(String aestEventDateTime) {
		this.aestEventDateTime = aestEventDateTime;
	}

	public String getEventTimezone() {
		return eventTimezone;
	}

	public void setEventTimezone(String eventTimezone) {
		this.eventTimezone = eventTimezone;
	}
	 /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
	@Override
	public String toString() {
		return "CustomDate [dateTimeStamp=" + dateTimeStamp + ", aestEventDateTime=" + aestEventDateTime
				+ ", eventTimezone=" + eventTimezone + "]";
	}

}
