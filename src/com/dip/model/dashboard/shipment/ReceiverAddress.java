
package com.dip.model.dashboard.shipment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "addressId",
    "abn",
    "companyName",
    "contactName",
    "workPhoneNumber",
    "mobileNumber",
    "email",
    "addressLine1",
    "addressLine2",
    "postCode",
    "suburb",
    "state",
    "city",
    "countryCode",
    "addressNote",
    "accountCode",
    "latitude",
    "longitude",
    "dpId",
    "gnafPid",
    "addressType",
    "avsConfidenceLevel",
    "dgContactName",
    "dgContactNumber"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReceiverAddress {

    @JsonProperty("addressId")
    private Long addressId;
    @JsonProperty("abn")
    private Long abn;
    @JsonProperty("companyName")
    private String companyName;
    @JsonProperty("contactName")
    private String contactName;
    @JsonProperty("workPhoneNumber")
    private String workPhoneNumber;
    @JsonProperty("mobileNumber")
    private String mobileNumber;
    @JsonProperty("email")
    private String email;
    @JsonProperty("addressLine1")
    private String addressLine1;
    @JsonProperty("addressLine2")
    private String addressLine2;
    @JsonProperty("postCode")
    private String postCode;
    @JsonProperty("suburb")
    private String suburb;
    @JsonProperty("state")
    private String state;
    @JsonProperty("city")
    private String city;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("addressNote")
    private String addressNote;
    @JsonProperty("accountCode")
    private String accountCode;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("dpId")
    private String dpId;
    @JsonProperty("gnafPid")
    private String gnafPid;
    @JsonProperty("addressType")
    private String addressType;
    @JsonProperty("avsConfidenceLevel")
    private String avsConfidenceLevel;
    @JsonProperty("dgContactName")
    private String dgContactName;
    @JsonProperty("dgContactNumber")
    private String dgContactNumber;
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public Long getAbn() {
		return abn;
	}
	public void setAbn(Long abn) {
		this.abn = abn;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getWorkPhoneNumber() {
		return workPhoneNumber;
	}
	public void setWorkPhoneNumber(String workPhoneNumber) {
		this.workPhoneNumber = workPhoneNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getSuburb() {
		return suburb;
	}
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getAddressNote() {
		return addressNote;
	}
	public void setAddressNote(String addressNote) {
		this.addressNote = addressNote;
	}
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getDpId() {
		return dpId;
	}
	public void setDpId(String dpId) {
		this.dpId = dpId;
	}
	public String getGnafPid() {
		return gnafPid;
	}
	public void setGnafPid(String gnafPid) {
		this.gnafPid = gnafPid;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getAvsConfidenceLevel() {
		return avsConfidenceLevel;
	}
	public void setAvsConfidenceLevel(String avsConfidenceLevel) {
		this.avsConfidenceLevel = avsConfidenceLevel;
	}
	public String getDgContactName() {
		return dgContactName;
	}
	public void setDgContactName(String dgContactName) {
		this.dgContactName = dgContactName;
	}
	public String getDgContactNumber() {
		return dgContactNumber;
	}
	public void setDgContactNumber(String dgContactNumber) {
		this.dgContactNumber = dgContactNumber;
	}

   

}
