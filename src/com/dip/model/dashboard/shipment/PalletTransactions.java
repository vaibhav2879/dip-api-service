
package com.dip.model.dashboard.shipment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "palletId",
    "shipmentId",
    "chepCustomerOwnQuantity",
    "chepExchangeQuantity",
    "chepTransferToTollQuantity",
    "chepDocketNo",
    "loscamCustomerOwnQuantity",
    "loscamExchangeQuantity",
    "loscamTransferToTollQuantity",
    "loscamDocketNo",
    "lhepOtherExchangeQuantity",
    "chepOtherTransferToTollQuantity",
    "chepOtherDocketNo",
    "otherCustomerOwnQuantity",
    "loscamOtherExchangeQuantity",
    "loscamOtherTransferToTollQuantity",
    "loscamOtherDocket",
    "palletTransactionType",
    "createdBy",
    "lastModifiedBy"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class PalletTransactions {

    @JsonProperty("palletId")
    private Integer palletId;
    @JsonProperty("shipmentId")
    private Integer shipmentId;
    @JsonProperty("chepCustomerOwnQuantity")
    private Integer chepCustomerOwnQuantity;
    @JsonProperty("chepExchangeQuantity")
    private Integer chepExchangeQuantity;
    @JsonProperty("chepTransferToTollQuantity")
    private Integer chepTransferToTollQuantity;
    @JsonProperty("chepDocketNo")
    private String chepDocketNo;
    @JsonProperty("loscamCustomerOwnQuantity")
    private Integer loscamCustomerOwnQuantity;
    @JsonProperty("loscamExchangeQuantity")
    private Integer loscamExchangeQuantity;
    @JsonProperty("loscamTransferToTollQuantity")
    private Integer loscamTransferToTollQuantity;
    @JsonProperty("loscamDocketNo")
    private String loscamDocketNo;
    @JsonProperty("lhepOtherExchangeQuantity")
    private Integer lhepOtherExchangeQuantity;
    @JsonProperty("chepOtherTransferToTollQuantity")
    private Integer chepOtherTransferToTollQuantity;
    @JsonProperty("chepOtherDocketNo")
    private String chepOtherDocketNo;
    @JsonProperty("otherCustomerOwnQuantity")
    private Integer otherCustomerOwnQuantity;
    @JsonProperty("loscamOtherExchangeQuantity")
    private Integer loscamOtherExchangeQuantity;
    @JsonProperty("loscamOtherTransferToTollQuantity")
    private Integer loscamOtherTransferToTollQuantity;
    @JsonProperty("loscamOtherDocket")
    private Integer loscamOtherDocket;
    @JsonProperty("palletTransactionType")
    private String palletTransactionType;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("lastModifiedBy")
    private String lastModifiedBy;
	public Integer getPalletId() {
		return palletId;
	}
	public void setPalletId(Integer palletId) {
		this.palletId = palletId;
	}
	public Integer getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(Integer shipmentId) {
		this.shipmentId = shipmentId;
	}
	public Integer getChepCustomerOwnQuantity() {
		return chepCustomerOwnQuantity;
	}
	public void setChepCustomerOwnQuantity(Integer chepCustomerOwnQuantity) {
		this.chepCustomerOwnQuantity = chepCustomerOwnQuantity;
	}
	public Integer getChepExchangeQuantity() {
		return chepExchangeQuantity;
	}
	public void setChepExchangeQuantity(Integer chepExchangeQuantity) {
		this.chepExchangeQuantity = chepExchangeQuantity;
	}
	public Integer getChepTransferToTollQuantity() {
		return chepTransferToTollQuantity;
	}
	public void setChepTransferToTollQuantity(Integer chepTransferToTollQuantity) {
		this.chepTransferToTollQuantity = chepTransferToTollQuantity;
	}
	public String getChepDocketNo() {
		return chepDocketNo;
	}
	public void setChepDocketNo(String chepDocketNo) {
		this.chepDocketNo = chepDocketNo;
	}
	public Integer getLoscamCustomerOwnQuantity() {
		return loscamCustomerOwnQuantity;
	}
	public void setLoscamCustomerOwnQuantity(Integer loscamCustomerOwnQuantity) {
		this.loscamCustomerOwnQuantity = loscamCustomerOwnQuantity;
	}
	public Integer getLoscamExchangeQuantity() {
		return loscamExchangeQuantity;
	}
	public void setLoscamExchangeQuantity(Integer loscamExchangeQuantity) {
		this.loscamExchangeQuantity = loscamExchangeQuantity;
	}
	public Integer getLoscamTransferToTollQuantity() {
		return loscamTransferToTollQuantity;
	}
	public void setLoscamTransferToTollQuantity(Integer loscamTransferToTollQuantity) {
		this.loscamTransferToTollQuantity = loscamTransferToTollQuantity;
	}
	public String getLoscamDocketNo() {
		return loscamDocketNo;
	}
	public void setLoscamDocketNo(String loscamDocketNo) {
		this.loscamDocketNo = loscamDocketNo;
	}
	public Integer getLhepOtherExchangeQuantity() {
		return lhepOtherExchangeQuantity;
	}
	public void setLhepOtherExchangeQuantity(Integer lhepOtherExchangeQuantity) {
		this.lhepOtherExchangeQuantity = lhepOtherExchangeQuantity;
	}
	public Integer getChepOtherTransferToTollQuantity() {
		return chepOtherTransferToTollQuantity;
	}
	public void setChepOtherTransferToTollQuantity(Integer chepOtherTransferToTollQuantity) {
		this.chepOtherTransferToTollQuantity = chepOtherTransferToTollQuantity;
	}
	public String getChepOtherDocketNo() {
		return chepOtherDocketNo;
	}
	public void setChepOtherDocketNo(String chepOtherDocketNo) {
		this.chepOtherDocketNo = chepOtherDocketNo;
	}
	public Integer getOtherCustomerOwnQuantity() {
		return otherCustomerOwnQuantity;
	}
	public void setOtherCustomerOwnQuantity(Integer otherCustomerOwnQuantity) {
		this.otherCustomerOwnQuantity = otherCustomerOwnQuantity;
	}
	public Integer getLoscamOtherExchangeQuantity() {
		return loscamOtherExchangeQuantity;
	}
	public void setLoscamOtherExchangeQuantity(Integer loscamOtherExchangeQuantity) {
		this.loscamOtherExchangeQuantity = loscamOtherExchangeQuantity;
	}
	public Integer getLoscamOtherTransferToTollQuantity() {
		return loscamOtherTransferToTollQuantity;
	}
	public void setLoscamOtherTransferToTollQuantity(Integer loscamOtherTransferToTollQuantity) {
		this.loscamOtherTransferToTollQuantity = loscamOtherTransferToTollQuantity;
	}
	public Integer getLoscamOtherDocket() {
		return loscamOtherDocket;
	}
	public void setLoscamOtherDocket(Integer loscamOtherDocket) {
		this.loscamOtherDocket = loscamOtherDocket;
	}
	public String getPalletTransactionType() {
		return palletTransactionType;
	}
	public void setPalletTransactionType(String palletTransactionType) {
		this.palletTransactionType = palletTransactionType;
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
