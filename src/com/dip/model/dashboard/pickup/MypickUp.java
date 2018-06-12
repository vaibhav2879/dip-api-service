package com.dip.model.dashboard.pickup;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "PickupSource", "ManifestId", "Shipments", "PickupTemplateId", "Requestor", "TollCarrier",
		"AccountCode", "CustomerAccountId", "SubAccountId", "PickupAddress", "IsUserAtSameLocation", "IsBookInFreight",
		"PickupContact", "CompanyName", "ReturnJob", "BringConsignmentNote", "Items", "PickupDate", "PickupReadyTime",
		"SiteInfo", "SpecialInstructions", "Reference" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class MypickUp implements Serializable {

	@JsonProperty("pickupId")
	private String pickupId;
	@JsonProperty("PickupSource")
	private String pickupSource;
	@JsonProperty("ManifestId")
	private Object manifestId;
	@JsonProperty("Shipments")
	private List<Object> shipments = null;
	@JsonProperty("PickupTemplateId")
	private Integer pickupTemplateId;
	@JsonProperty("Requestor")
	private Requestor requestor;
	@JsonProperty("TollCarrier")
	private TollCarrier tollCarrier;
	@JsonProperty("AccountCode")
	private String accountCode;
	@JsonProperty("CustomerAccountId")
	private Object customerAccountId;
	@JsonProperty("SubAccountId")
	private String subAccountId;
	@JsonProperty("PickupAddress")
	private PickupAddress pickupAddress;
	@JsonProperty("IsUserAtSameLocation")
	private Boolean isUserAtSameLocation;
	@JsonProperty("IsBookInFreight")
	private String isBookInFreight;
	@JsonProperty("PickupContact")
	private PickupContact pickupContact;
	@JsonProperty("CompanyName")
	private String companyName;
	@JsonProperty("ReturnJob")
	private Boolean returnJob;
	@JsonProperty("BringConsignmentNote")
	private String bringConsignmentNote;
	@JsonProperty("Items")
	private List<Item> items = null;
	private Integer totalItemsCount;
	@JsonProperty("PickupDate")
	private String pickupDate;
	private Date pickUpDate1;
	
	@JsonProperty("PickupReadyTime")
	private String pickupReadyTime;
	private Date pickupReadyTime1;
	@JsonProperty("SiteInfo")
	private SiteInfo siteInfo;
	@JsonProperty("SpecialInstructions")
	private String specialInstructions;
	@JsonProperty("Reference")
	private String reference;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -4892497883550954030L;

	@JsonProperty("PickupSource")
	public String getPickupSource() {
		return pickupSource;
	}

	@JsonProperty("PickupSource")
	public void setPickupSource(String pickupSource) {
		this.pickupSource = pickupSource;
	}

	@JsonProperty("ManifestId")
	public Object getManifestId() {
		return manifestId;
	}

	@JsonProperty("ManifestId")
	public void setManifestId(Object manifestId) {
		this.manifestId = manifestId;
	}

	@JsonProperty("Shipments")
	public List<Object> getShipments() {
		return shipments;
	}

	@JsonProperty("Shipments")
	public void setShipments(List<Object> shipments) {
		this.shipments = shipments;
	}

	@JsonProperty("PickupTemplateId")
	public Integer getPickupTemplateId() {
		return pickupTemplateId;
	}

	@JsonProperty("PickupTemplateId")
	public void setPickupTemplateId(Integer pickupTemplateId) {
		this.pickupTemplateId = pickupTemplateId;
	}

	@JsonProperty("Requestor")
	public Requestor getRequestor() {
		return requestor;
	}

	@JsonProperty("Requestor")
	public void setRequestor(Requestor requestor) {
		this.requestor = requestor;
	}

	@JsonProperty("TollCarrier")
	public TollCarrier getTollCarrier() {
		return tollCarrier;
	}

	@JsonProperty("TollCarrier")
	public void setTollCarrier(TollCarrier tollCarrier) {
		this.tollCarrier = tollCarrier;
	}

	@JsonProperty("AccountCode")
	public String getAccountCode() {
		return accountCode;
	}

	@JsonProperty("AccountCode")
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	@JsonProperty("CustomerAccountId")
	public Object getCustomerAccountId() {
		return customerAccountId;
	}

	@JsonProperty("CustomerAccountId")
	public void setCustomerAccountId(Object customerAccountId) {
		this.customerAccountId = customerAccountId;
	}

	@JsonProperty("SubAccountId")
	public String getSubAccountId() {
		return subAccountId;
	}

	@JsonProperty("SubAccountId")
	public void setSubAccountId(String subAccountId) {
		this.subAccountId = subAccountId;
	}

	@JsonProperty("PickupAddress")
	public PickupAddress getPickupAddress() {
		return pickupAddress;
	}

	@JsonProperty("PickupAddress")
	public void setPickupAddress(PickupAddress pickupAddress) {
		this.pickupAddress = pickupAddress;
	}

	@JsonProperty("IsUserAtSameLocation")
	public Boolean getIsUserAtSameLocation() {
		return isUserAtSameLocation;
	}

	@JsonProperty("IsUserAtSameLocation")
	public void setIsUserAtSameLocation(Boolean isUserAtSameLocation) {
		this.isUserAtSameLocation = isUserAtSameLocation;
	}

	@JsonProperty("IsBookInFreight")
	public String getIsBookInFreight() {
		return isBookInFreight;
	}

	@JsonProperty("IsBookInFreight")
	public void setIsBookInFreight(String isBookInFreight) {
		this.isBookInFreight = isBookInFreight;
	}

	@JsonProperty("PickupContact")
	public PickupContact getPickupContact() {
		return pickupContact;
	}

	@JsonProperty("PickupContact")
	public void setPickupContact(PickupContact pickupContact) {
		this.pickupContact = pickupContact;
	}

	@JsonProperty("CompanyName")
	public String getCompanyName() {
		return companyName;
	}

	@JsonProperty("CompanyName")
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@JsonProperty("ReturnJob")
	public Boolean getReturnJob() {
		return returnJob;
	}

	@JsonProperty("ReturnJob")
	public void setReturnJob(Boolean returnJob) {
		this.returnJob = returnJob;
	}

	@JsonProperty("BringConsignmentNote")
	public String getBringConsignmentNote() {
		return bringConsignmentNote;
	}

	@JsonProperty("BringConsignmentNote")
	public void setBringConsignmentNote(String bringConsignmentNote) {
		this.bringConsignmentNote = bringConsignmentNote;
	}

	@JsonProperty("Items")
	public List<Item> getItems() {
		return items;
	}

	@JsonProperty("Items")
	public void setItems(List<Item> items) {
		this.items = items;
	}

	@JsonProperty("PickupDate")
	public String getPickupDate() {
		return pickupDate;
	}

	@JsonProperty("PickupDate")
	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}

	@JsonProperty("PickupReadyTime")
	public String getPickupReadyTime() {
		return pickupReadyTime;
	}

	@JsonProperty("PickupReadyTime")
	public void setPickupReadyTime(String pickupReadyTime) {
		this.pickupReadyTime = pickupReadyTime;
	}

	@JsonProperty("SiteInfo")
	public SiteInfo getSiteInfo() {
		return siteInfo;
	}

	@JsonProperty("SiteInfo")
	public void setSiteInfo(SiteInfo siteInfo) {
		this.siteInfo = siteInfo;
	}

	@JsonProperty("SpecialInstructions")
	public String getSpecialInstructions() {
		return specialInstructions;
	}

	@JsonProperty("SpecialInstructions")
	public void setSpecialInstructions(String specialInstructions) {
		this.specialInstructions = specialInstructions;
	}

	@JsonProperty("Reference")
	public String getReference() {
		return reference;
	}

	@JsonProperty("Reference")
	public void setReference(String reference) {
		this.reference = reference;
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
	
	public String getPickupId() {
		return pickupId;
	}

	public void setPickupId(String pickupId) {
		this.pickupId = pickupId;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(pickupSource).append(manifestId).append(shipments).append(pickupTemplateId)
				.append(requestor).append(tollCarrier).append(accountCode).append(customerAccountId)
				.append(subAccountId).append(pickupAddress).append(isUserAtSameLocation).append(isBookInFreight)
				.append(pickupContact).append(companyName).append(returnJob).append(bringConsignmentNote).append(items)
				.append(pickupDate).append(pickupReadyTime).append(siteInfo).append(specialInstructions)
				.append(reference).append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof MypickUp) == false) {
			return false;
		}
		MypickUp rhs = ((MypickUp) other);
		return new EqualsBuilder().append(pickupSource, rhs.pickupSource).append(manifestId, rhs.manifestId)
				.append(shipments, rhs.shipments).append(pickupTemplateId, rhs.pickupTemplateId)
				.append(requestor, rhs.requestor).append(tollCarrier, rhs.tollCarrier)
				.append(accountCode, rhs.accountCode).append(customerAccountId, rhs.customerAccountId)
				.append(subAccountId, rhs.subAccountId).append(pickupAddress, rhs.pickupAddress)
				.append(isUserAtSameLocation, rhs.isUserAtSameLocation).append(isBookInFreight, rhs.isBookInFreight)
				.append(pickupContact, rhs.pickupContact).append(companyName, rhs.companyName)
				.append(returnJob, rhs.returnJob).append(bringConsignmentNote, rhs.bringConsignmentNote)
				.append(items, rhs.items).append(pickupDate, rhs.pickupDate)
				.append(pickupReadyTime, rhs.pickupReadyTime).append(siteInfo, rhs.siteInfo)
				.append(specialInstructions, rhs.specialInstructions).append(reference, rhs.reference)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

	@JsonProperty("pickUpDate1")
	public Date getPickUpDate1() {
		Date date = null;
		if (null != this.pickupDate && !this.pickupDate.isEmpty()) {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			try {
				date = df.parse(this.pickupDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}
		return date;
	}
	
	@JsonProperty("pickupReadyTime1")
	public Date getPickupReadyTime1() {
		Date date = null;
		if (null != this.pickupReadyTime && !this.pickupReadyTime.isEmpty()) {
			DateFormat df = new SimpleDateFormat("HH:mm");
			try {
				date = df.parse(this.pickupReadyTime);
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}
		return date;
	}
	
	@JsonProperty("totalItemsCount")
	public Integer getTotalItemsCount() {
		Integer itemTotalCount = 0;
		if (!this.items.isEmpty()) {
			for(Item item : this.items){
				if(null != item.getItemCount()){
					itemTotalCount = itemTotalCount + item.getItemCount(); 
				}
			}
		}
		return itemTotalCount;
	}

}