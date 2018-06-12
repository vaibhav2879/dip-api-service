package com.dip.model;

import java.io.Serializable;

import com.dip.util.CommonUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

/**
 * @author HCL
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationJson implements Serializable {
	private static final long serialVersionUID = 1L;
	@JsonProperty("addrLine1")
	private String addrLine1;
	@JsonProperty("addrLine2")
	private String addrLine2;
	@JsonProperty("state")
	private String state;
	@JsonProperty("suburb")
	private String suburb;
	@JsonProperty("country")
	private String country;
	@JsonProperty("postCode")
	private String postCode;
	@JsonProperty("poBox")
	private String poBox;
	@JsonProperty("mapLink")
	private String mapLink;
	@JsonProperty("fullAddress")
	private String fullAddress;
	
	
	public String getAddrLine1() {
		return addrLine1;
	}


	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}


	public String getAddrLine2() {
		return addrLine2;
	}


	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getSuburb() {
		return suburb;
	}


	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPostCode() {
		return postCode;
	}


	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}


	public String getPoBox() {
		return poBox;
	}


	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}


	public String getMapLink() {
		return mapLink;
	}


	public void setMapLink(String mapLink) {
		this.mapLink = mapLink;
	}


	public String getFullAddress() {
		return fullAddress;
	}


	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	
}
