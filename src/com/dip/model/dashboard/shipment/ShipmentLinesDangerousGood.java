
package com.dip.model.dashboard.shipment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "shipmentLineDgId",
    "shipmentLineId",
    "packTypeId",
    "dgSeq",
    "dgUnNumber",
    "dgClass",
    "dgPackageDescription",
    "packagingGroup",
    "shippingName",
    "dgWeight",
    "lineDgWeightUom",
    "technicalName",
    "dgPackageQuantity",
    "dgPackageQuantityUom",
    "subRisk",
    "otherDgInformation",
    "dgPackageType"
})
public class ShipmentLinesDangerousGood {

    @JsonProperty("shipmentLineDgId")
    private Integer shipmentLineDgId;
    @JsonProperty("shipmentLineId")
    private Integer shipmentLineId;
    @JsonProperty("packTypeId")
    private Integer packTypeId;
    @JsonProperty("dgSeq")
    private Integer dgSeq;
    @JsonProperty("dgUnNumber")
    private String dgUnNumber;
    @JsonProperty("dgClass")
    private String dgClass;
    @JsonProperty("dgPackageDescription")
    private String dgPackageDescription;
    @JsonProperty("packagingGroup")
    private String packagingGroup;
    @JsonProperty("shippingName")
    private String shippingName;
    @JsonProperty("dgWeight")
    private Integer dgWeight;
    @JsonProperty("lineDgWeightUom")
    private String lineDgWeightUom;
    @JsonProperty("technicalName")
    private String technicalName;
    @JsonProperty("dgPackageQuantity")
    private Integer dgPackageQuantity;
    @JsonProperty("dgPackageQuantityUom")
    private String dgPackageQuantityUom;
    @JsonProperty("subRisk")
    private String subRisk;
    @JsonProperty("otherDgInformation")
    private String otherDgInformation;
    @JsonProperty("dgPackageType")
    private String dgPackageType;
	public Integer getShipmentLineDgId() {
		return shipmentLineDgId;
	}
	public void setShipmentLineDgId(Integer shipmentLineDgId) {
		this.shipmentLineDgId = shipmentLineDgId;
	}
	public Integer getShipmentLineId() {
		return shipmentLineId;
	}
	public void setShipmentLineId(Integer shipmentLineId) {
		this.shipmentLineId = shipmentLineId;
	}
	public Integer getPackTypeId() {
		return packTypeId;
	}
	public void setPackTypeId(Integer packTypeId) {
		this.packTypeId = packTypeId;
	}
	public Integer getDgSeq() {
		return dgSeq;
	}
	public void setDgSeq(Integer dgSeq) {
		this.dgSeq = dgSeq;
	}
	public String getDgUnNumber() {
		return dgUnNumber;
	}
	public void setDgUnNumber(String dgUnNumber) {
		this.dgUnNumber = dgUnNumber;
	}
	public String getDgClass() {
		return dgClass;
	}
	public void setDgClass(String dgClass) {
		this.dgClass = dgClass;
	}
	public String getDgPackageDescription() {
		return dgPackageDescription;
	}
	public void setDgPackageDescription(String dgPackageDescription) {
		this.dgPackageDescription = dgPackageDescription;
	}
	public String getPackagingGroup() {
		return packagingGroup;
	}
	public void setPackagingGroup(String packagingGroup) {
		this.packagingGroup = packagingGroup;
	}
	public String getShippingName() {
		return shippingName;
	}
	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}
	public Integer getDgWeight() {
		return dgWeight;
	}
	public void setDgWeight(Integer dgWeight) {
		this.dgWeight = dgWeight;
	}
	public String getLineDgWeightUom() {
		return lineDgWeightUom;
	}
	public void setLineDgWeightUom(String lineDgWeightUom) {
		this.lineDgWeightUom = lineDgWeightUom;
	}
	public String getTechnicalName() {
		return technicalName;
	}
	public void setTechnicalName(String technicalName) {
		this.technicalName = technicalName;
	}
	public Integer getDgPackageQuantity() {
		return dgPackageQuantity;
	}
	public void setDgPackageQuantity(Integer dgPackageQuantity) {
		this.dgPackageQuantity = dgPackageQuantity;
	}
	public String getDgPackageQuantityUom() {
		return dgPackageQuantityUom;
	}
	public void setDgPackageQuantityUom(String dgPackageQuantityUom) {
		this.dgPackageQuantityUom = dgPackageQuantityUom;
	}
	public String getSubRisk() {
		return subRisk;
	}
	public void setSubRisk(String subRisk) {
		this.subRisk = subRisk;
	}
	public String getOtherDgInformation() {
		return otherDgInformation;
	}
	public void setOtherDgInformation(String otherDgInformation) {
		this.otherDgInformation = otherDgInformation;
	}
	public String getDgPackageType() {
		return dgPackageType;
	}
	public void setDgPackageType(String dgPackageType) {
		this.dgPackageType = dgPackageType;
	}

    

}
