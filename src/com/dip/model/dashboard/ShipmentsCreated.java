package com.dip.model.dashboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author HCL
 *
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShipmentsCreated {

	private String todayCount = "0";
	private String weekCount= "0";
	private String monthCount= "0";
	
	private String todayCount1 = "0";
	private String weekCount1= "0";
	private String monthCount1= "0";
	
	public String getTodayCount1() {
		return todayCount;
	}


	public void setTodayCount(String todayCount) {
		this.todayCount = todayCount;
	}


	public String getWeekCount1() {
		return weekCount;
	}


	public void setWeekCount(String weekCount) {
		this.weekCount = weekCount;
	}


	public String getMonthCount1() {
		return monthCount;
	}


	public void setMonthCount(String monthCount) {
		this.monthCount = monthCount;
	}


	/**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
	@Override
	public String toString() {
		return "ShipmentsCreated [todayCount=" + todayCount + ", weekCount=" + weekCount + ", monthCount="
				+ monthCount + "]";
	}
}
