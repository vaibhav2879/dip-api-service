package com.dip.model;

import java.io.Serializable;

import com.dip.util.CommonUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

/**
 * @author HCL
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;
	private String addrLine1;
	private String addrLine2;
	private String state;
	private String suburb;
	private String country;
	private String postCode;
	private String poBox;
	private String mapLink;
	private String fullAddress;
	
	@JsonIgnore
	public Location getClone() {
		Location location = new Location();
		location.setAddrLine1(this.getAddrLine1());
		location.setAddrLine2(this.getAddrLine2());
		location.setCountry(this.getCountry());
		location.setFullAddress(this.getFullAddress());
		location.setPoBox(this.getPoBox());
		location.setState(this.getState());
		location.setSuburb(this.getSuburb());
		location.setPostCode(this.getPostCode());
		return location;
	}

	
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

	 /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
	@Override
	public String toString() {
		String loc = StringPool.BLANK;
		if(Validator.isNotNull(suburb) && Validator.isNull(state)){
			loc = CommonUtil.convertToTitleCase(suburb);
		}
		else if(Validator.isNull(suburb) && Validator.isNotNull(state)){
			if(state.length() < 4){
				loc = state.toUpperCase();
			}
			else{
				loc = CommonUtil.convertToTitleCase(state);
			}
		}
		else if(Validator.isNotNull(suburb) && Validator.isNotNull(state)){
			loc = CommonUtil.convertToTitleCase(suburb) + StringPool.COMMA_AND_SPACE;
			if(state.length() < 4){
				loc += state.toUpperCase();
			}
			else{
				loc += CommonUtil.convertToTitleCase(state);
			}
		}
		else{
			loc = StringPool.BLANK;
		}
		return loc;
	}
}
