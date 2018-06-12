package com.dip.model.dashboard.manifest;

import com.dip.model.dashboard.shipment.SenderAddress;
import com.dip.model.dashboard.shipment.Shipment;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"manifestId", "tollCarrierCode", "tollCarrierName", "senderAddress",
		"dispatchDate", "manifestName", "status", "shipmentIds",
		"pickUpBookingNumber", "shipments","customerCode" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class Manifest {

	@JsonProperty("manifestId")
	private Long manifestId;
	@JsonProperty("tollCarrierCode")
	private String tollCarrierCode;
	@JsonProperty("tollCarrierName")
	private String tollCarrierName;
	@JsonProperty("senderAddress")
	private SenderAddress senderAddress = null;
	@JsonProperty("dispatchDate")
	private String dispatchDate;
	
	private Date dispatchDateFmt;
	
	@JsonProperty("manifestName")
	private String manifestName;
	@JsonProperty("status")
	private String status;
	@JsonProperty("shipmentIds")
	private List<Long> shipmentIds = null;
	@JsonProperty("pickUpBookingNumber")
	private String pickUpBookingNumber;
	@JsonProperty("Shipments")
	private List<Shipment> shipments = null;
	@JsonProperty("customerCode")
	private String customerCode;
	@JsonProperty("isWebPickup")
	private Boolean isWebPickup;
	public Boolean getIsWebPickup() {
		return isWebPickup;
	}
	public void setIsWebPickup(Boolean isWebPickup) {
		this.isWebPickup = isWebPickup;
	}
	public Long getManifestId() {
		return manifestId;
	}
	public void setManifestId(Long manifestId) {
		this.manifestId = manifestId;
	}
	public String getTollCarrierCode() {
		return tollCarrierCode;
	}
	public void setTollCarrierCode(String tollCarrierCode) {
		this.tollCarrierCode = tollCarrierCode;
	}
	public String getTollCarrierName() {
		return tollCarrierName;
	}
	public void setTollCarrierName(String tollCarrierName) {
		this.tollCarrierName = tollCarrierName;
	}
	public SenderAddress getSenderAddress() {
		return senderAddress;
	}
	public void setSenderAddress(SenderAddress senderAddress) {
		this.senderAddress = senderAddress;
	}
	public String getDispatchDate() {
		return dispatchDate;
	}
	public void setDispatchDate(String dispatchDate) {
		this.dispatchDate = dispatchDate;
	}
	public String getManifestName() {
		return manifestName;
	}
	public void setManifestName(String manifestName) {
		this.manifestName = manifestName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Long> getShipmentIds() {
		return shipmentIds;
	}
	public void setShipmentIds(List<Long> shipmentIds) {
		this.shipmentIds = shipmentIds;
	}
	public String getPickUpBookingNumber() {
		return pickUpBookingNumber;
	}
	public void setPickUpBookingNumber(String pickUpBookingNumber) {
		this.pickUpBookingNumber = pickUpBookingNumber;
	}
	public List<Shipment> getShipments() {
		return shipments;
	}
	public void setShipments(List<Shipment> shipments) {
		this.shipments = shipments;
	}
	
	public String getCustomerCode() {
	return customerCode;
	}

	public void setCustomerCode(String customerCode) {
	this.customerCode = customerCode;
	}
	
	@JsonProperty("dispatchDateFmt")
	public Date getDispatchDateFmt() {
		Date date = null;
		if (null != this.dispatchDate && !this.dispatchDate.isEmpty()) {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			try {
				date = df.parse(this.dispatchDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}
		return date;
	}

	
}
