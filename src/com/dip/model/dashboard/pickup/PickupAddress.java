package com.dip.model.dashboard.pickup;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "AddressId", "AddressLine1", "AddressLine2", "Suburb", "Postcode", "City", "State", "Country",
		"Latitude", "Longitude", "DPId", "GnafPID", "AVSConfidenceLevel", "AddressType" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class PickupAddress implements Serializable {

	@JsonProperty("AddressId")
	private String addressId;
	@JsonProperty("AddressLine1")
	private String addressLine1;
	@JsonProperty("AddressLine2")
	private String addressLine2;
	@JsonProperty("Suburb")
	private String suburb;
	@JsonProperty("Postcode")
	private String postcode;
	@JsonProperty("City")
	private String city;
	@JsonProperty("State")
	private String state;
	@JsonProperty("Country")
	private String country;
	@JsonProperty("Latitude")
	private String latitude;
	@JsonProperty("Longitude")
	private String longitude;
	@JsonProperty("DPId")
	private String dPId;
	@JsonProperty("GnafPID")
	private String gnafPID;
	@JsonProperty("AVSConfidenceLevel")
	private String aVSConfidenceLevel;
	@JsonProperty("AddressType")
	private String addressType;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 3185209543309302639L;

	@JsonProperty("AddressId")
	public String getAddressId() {
		return addressId;
	}

	@JsonProperty("AddressId")
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	@JsonProperty("AddressLine1")
	public String getAddressLine1() {
		return addressLine1;
	}

	@JsonProperty("AddressLine1")
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	@JsonProperty("AddressLine2")
	public String getAddressLine2() {
		return addressLine2;
	}

	@JsonProperty("AddressLine2")
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	@JsonProperty("Suburb")
	public String getSuburb() {
		return suburb;
	}

	@JsonProperty("Suburb")
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	@JsonProperty("Postcode")
	public String getPostcode() {
		return postcode;
	}

	@JsonProperty("Postcode")
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@JsonProperty("City")
	public String getCity() {
		return city;
	}

	@JsonProperty("City")
	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("State")
	public String getState() {
		return state;
	}

	@JsonProperty("State")
	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("Country")
	public String getCountry() {
		return country;
	}

	@JsonProperty("Country")
	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("Latitude")
	public String getLatitude() {
		return latitude;
	}

	@JsonProperty("Latitude")
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@JsonProperty("Longitude")
	public String getLongitude() {
		return longitude;
	}

	@JsonProperty("Longitude")
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@JsonProperty("DPId")
	public String getDPId() {
		return dPId;
	}

	@JsonProperty("DPId")
	public void setDPId(String dPId) {
		this.dPId = dPId;
	}

	@JsonProperty("GnafPID")
	public String getGnafPID() {
		return gnafPID;
	}

	@JsonProperty("GnafPID")
	public void setGnafPID(String gnafPID) {
		this.gnafPID = gnafPID;
	}

	@JsonProperty("AVSConfidenceLevel")
	public String getAVSConfidenceLevel() {
		return aVSConfidenceLevel;
	}

	@JsonProperty("AVSConfidenceLevel")
	public void setAVSConfidenceLevel(String aVSConfidenceLevel) {
		this.aVSConfidenceLevel = aVSConfidenceLevel;
	}

	@JsonProperty("AddressType")
	public String getAddressType() {
		return addressType;
	}

	@JsonProperty("AddressType")
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(addressId).append(addressLine1).append(addressLine2).append(suburb)
				.append(postcode).append(city).append(state).append(country).append(latitude).append(longitude)
				.append(dPId).append(gnafPID).append(aVSConfidenceLevel).append(addressType)
				.append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof PickupAddress) == false) {
			return false;
		}
		PickupAddress rhs = ((PickupAddress) other);
		return new EqualsBuilder().append(addressId, rhs.addressId).append(addressLine1, rhs.addressLine1)
				.append(addressLine2, rhs.addressLine2).append(suburb, rhs.suburb).append(postcode, rhs.postcode)
				.append(city, rhs.city).append(state, rhs.state).append(country, rhs.country)
				.append(latitude, rhs.latitude).append(longitude, rhs.longitude).append(dPId, rhs.dPId)
				.append(gnafPID, rhs.gnafPID).append(aVSConfidenceLevel, rhs.aVSConfidenceLevel)
				.append(addressType, rhs.addressType).append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}