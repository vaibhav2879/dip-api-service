
package com.dip.model.dashboard.shipment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "referenceId",
    "shipmentId",
    "referenceType",
    "referenceValue",
    "referenceSeq",
    "createdBy",
    "lastModifiedBy"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Reference {

    @JsonProperty("referenceId")
    private Integer referenceId;
    @JsonProperty("shipmentId")
    private Integer shipmentId;
    @JsonProperty("referenceType")
    private String referenceType;
    @JsonProperty("referenceValue")
    private String referenceValue;
    @JsonProperty("referenceSeq")
    private Integer referenceSeq;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("lastModifiedBy")
    private String lastModifiedBy;
	public Integer getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(Integer referenceId) {
		this.referenceId = referenceId;
	}
	public Integer getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(Integer shipmentId) {
		this.shipmentId = shipmentId;
	}
	public String getReferenceType() {
		return referenceType;
	}
	public void setReferenceType(String referenceType) {
		this.referenceType = referenceType;
	}
	public String getReferenceValue() {
		return referenceValue;
	}
	public void setReferenceValue(String referenceValue) {
		this.referenceValue = referenceValue;
	}
	public Integer getReferenceSeq() {
		return referenceSeq;
	}
	public void setReferenceSeq(Integer referenceSeq) {
		this.referenceSeq = referenceSeq;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

   

}
