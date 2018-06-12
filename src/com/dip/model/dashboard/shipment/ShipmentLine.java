
package com.dip.model.dashboard.shipment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "shipmentLineId",
    "shipmentId",
    "lineItemDescription",
    "seqNo",
    "perPallet",
    "perPalletQty",
    "senderReference",
    "receiverReference",
    "createdByTemplate",
    "status",
    "templateId",
    "itemCount",
    "billingtypeDescription",
    "billingCode",
    "containsDangerousGoods",
    "itemType",
    "miscUnitsCount",
    "createdBy",
    "lastModifiedBy",
    "dimensions",
    "shipmentLinesDangerousGoods"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShipmentLine {

    @JsonProperty("shipmentLineId")
    private Integer shipmentLineId;
    @JsonProperty("shipmentId")
    private Integer shipmentId;
    @JsonProperty("lineItemDescription")
    private String lineItemDescription;
    @JsonProperty("seqNo")
    private Integer seqNo;
    @JsonProperty("perPallet")
    private Boolean perPallet;
    @JsonProperty("perPalletQty")
    private Integer perPalletQty;
    @JsonProperty("senderReference")
    private String senderReference;
    @JsonProperty("receiverReference")
    private String receiverReference;
    @JsonProperty("createdByTemplate")
    private Boolean createdByTemplate;
    @JsonProperty("status")
    private String status;
    @JsonProperty("templateId")
    private String templateId;
    @JsonProperty("itemCount")
    private Integer itemCount;
    @JsonProperty("billingtypeDescription")
    private String billingtypeDescription;
    @JsonProperty("billingCode")
    private String billingCode;
    @JsonProperty("containsDangerousGoods")
    private Boolean containsDangerousGoods;
    @JsonProperty("itemType")
    private String itemType;
    @JsonProperty("miscUnitsCount")
    private Integer miscUnitsCount;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("lastModifiedBy")
    private String lastModifiedBy;
    @JsonProperty("dimensions")
    private Dimensions dimensions;
    @JsonProperty("shipmentLinesDangerousGoods")
    private List<ShipmentLinesDangerousGood> shipmentLinesDangerousGoods = null;
	public Integer getShipmentLineId() {
		return shipmentLineId;
	}
	public void setShipmentLineId(Integer shipmentLineId) {
		this.shipmentLineId = shipmentLineId;
	}
	public Integer getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(Integer shipmentId) {
		this.shipmentId = shipmentId;
	}
	public String getLineItemDescription() {
		return lineItemDescription;
	}
	public void setLineItemDescription(String lineItemDescription) {
		this.lineItemDescription = lineItemDescription;
	}
	public Integer getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}
	public Boolean getPerPallet() {
		return perPallet;
	}
	public void setPerPallet(Boolean perPallet) {
		this.perPallet = perPallet;
	}
	public Integer getPerPalletQty() {
		return perPalletQty;
	}
	public void setPerPalletQty(Integer perPalletQty) {
		this.perPalletQty = perPalletQty;
	}
	public String getSenderReference() {
		return senderReference;
	}
	public void setSenderReference(String senderReference) {
		this.senderReference = senderReference;
	}
	public String getReceiverReference() {
		return receiverReference;
	}
	public void setReceiverReference(String receiverReference) {
		this.receiverReference = receiverReference;
	}
	public Boolean getCreatedByTemplate() {
		return createdByTemplate;
	}
	public void setCreatedByTemplate(Boolean createdByTemplate) {
		this.createdByTemplate = createdByTemplate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public Integer getItemCount() {
		return itemCount;
	}
	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}
	public String getBillingtypeDescription() {
		return billingtypeDescription;
	}
	public void setBillingtypeDescription(String billingtypeDescription) {
		this.billingtypeDescription = billingtypeDescription;
	}
	public String getBillingCode() {
		return billingCode;
	}
	public void setBillingCode(String billingCode) {
		this.billingCode = billingCode;
	}
	public Boolean getContainsDangerousGoods() {
		return containsDangerousGoods;
	}
	public void setContainsDangerousGoods(Boolean containsDangerousGoods) {
		this.containsDangerousGoods = containsDangerousGoods;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public Integer getMiscUnitsCount() {
		return miscUnitsCount;
	}
	public void setMiscUnitsCount(Integer miscUnitsCount) {
		this.miscUnitsCount = miscUnitsCount;
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
	public Dimensions getDimensions() {
		return dimensions;
	}
	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}
	public List<ShipmentLinesDangerousGood> getShipmentLinesDangerousGoods() {
		return shipmentLinesDangerousGoods;
	}
	public void setShipmentLinesDangerousGoods(List<ShipmentLinesDangerousGood> shipmentLinesDangerousGoods) {
		this.shipmentLinesDangerousGoods = shipmentLinesDangerousGoods;
	}

    

}
