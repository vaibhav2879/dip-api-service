package com.dip.model.dashboard.manifest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ManifestSearchParam {
	@JsonProperty("manifestNameId")
	private String manifestNameId;
	
	@JsonProperty("fromDate")
	private String fromDate;
	
	@JsonProperty("toDate")
	private String toDate;
	
	@JsonProperty("manifestTollCarrier")
	private String tollCarrier;
	
	private String fromDateFmt;
	private String toDateFmt;
	
	public String getTollCarrier() {
		return tollCarrier;
	}
	public void setTollCarrier(String tollCarrier) {
		this.tollCarrier = tollCarrier;
	}
	public String getManifestNameId() {
		return manifestNameId;
	}
	public void setManifestNameId(String manifestNameId) {
		this.manifestNameId = manifestNameId;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	public String getToDateFmt() {
		Date date = null;
		String dateStr = StringUtils.EMPTY;
		if (null != this.toDate && !this.toDate.isEmpty()) {
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			try {
				date = df.parse(this.toDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if(null != date){
				dateStr = new SimpleDateFormat("yyyy-MM-dd").format(date);
			}
		}
		return dateStr;
	}
	
	public String getFromDateFmt() {
		Date date = null;
		String dateStr = StringUtils.EMPTY;
		if (null != this.fromDate && !this.fromDate.isEmpty()) {
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			try {
				date = df.parse(this.fromDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if(null != date){
				dateStr = new SimpleDateFormat("yyyy-MM-dd").format(date);
			}
		}
		return dateStr;
	}
	
}
