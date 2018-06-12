
package com.dip.model.dashboard.shipment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "shipmentId",
    "shipmentNumber",
    "manifestId",
    "customerCode",
    "dispatchDate",
    "requiredByDeliveryDate",
    "tollCarrierCode",
    "tollCarrierName",
    "serviceCode",
    "serviceName",
    "mode",
    "accountCode",
    "status",
    "chargeTo",
    "quoteNumber",
    "siteId",
    "senderAddress",
    "receiverAddress",
    "specialInstructions",
    "temperatureType",
    "tempRangeFrom",
    "tempRangeTo",
    "temperatureUom",
    "pickupTemp",
    "hazardousType",
    "thirdPartyContact",
    "thirdPartyContactPhone",
    "qrCode",
    "barCode",
    "fullBarCode",
    "typeOfExport",
    "declaredValueCurrencyCode",
    "declaredValue",
    "totalChargeAmount",
    "harmonisedCommodityCode",
    "taxPayer",
    "smsNotify",
    "smsNotifyMobile",
    "senderNotify",
    "receiverNotify",
    "deliveredInDepotCode",
    "holdInDepotCode",
    "extraServiceRequired",
    "extraServiceValue",
    "extraServiceCurrency",
    "containsFood",
    "alternateDelivery",
    "authorityToLeave",
    "securityCheckRequired",
    "tradingNumber",
    "isPalletsTransactions",
    "totalVolume",
    "totalQuantity",
    "totalWeight",
    "createdBy",
    "lastModifiedBy",
    "shipmentLines",
    "references",
    "palletTransactions"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Shipment {

    @JsonProperty("shipmentId")
    private Long shipmentId;
    @JsonProperty("shipmentNumber")
    private String shipmentNumber;
    @JsonProperty("manifestId")
    private Long manifestId;
    @JsonProperty("customerCode")
    private String customerCode;
    @JsonProperty("dispatchDate")
    private String dispatchDate;
    @JsonProperty("requiredByDeliveryDate")
    private String requiredByDeliveryDate;
    @JsonProperty("tollCarrierCode")
    private String tollCarrierCode;
    @JsonProperty("tollCarrierName")
    private String tollCarrierName;
    @JsonProperty("serviceCode")
    private String serviceCode;
    @JsonProperty("serviceName")
    private String serviceName;
    @JsonProperty("mode")
    private String mode;
    @JsonProperty("accountCode")
    private String accountCode;
    @JsonProperty("status")
    private String status;
    @JsonProperty("chargeTo")
    private String chargeTo;
    @JsonProperty("quoteNumber")
    private String quoteNumber;
    @JsonProperty("siteId")
    private String siteId;
    @JsonProperty("senderAddress")
    private SenderAddress senderAddress;
    @JsonProperty("receiverAddress")
    private ReceiverAddress receiverAddress;
    @JsonProperty("specialInstructions")
    private String specialInstructions;
    @JsonProperty("temperatureType")
    private String temperatureType;
    @JsonProperty("tempRangeFrom")
    private String tempRangeFrom;
    @JsonProperty("tempRangeTo")
    private String tempRangeTo;
    @JsonProperty("temperatureUom")
    private String temperatureUom;
    @JsonProperty("pickupTemp")
    private String pickupTemp;
    @JsonProperty("hazardousType")
    private String hazardousType;
    @JsonProperty("thirdPartyContact")
    private String thirdPartyContact;
    @JsonProperty("thirdPartyContactPhone")
    private String thirdPartyContactPhone;
    @JsonProperty("qrCode")
    private String qrCode;
    @JsonProperty("barCode")
    private String barCode;
    @JsonProperty("fullBarCode")
    private String fullBarCode;
    @JsonProperty("typeOfExport")
    private String typeOfExport;
    @JsonProperty("declaredValueCurrencyCode")
    private String declaredValueCurrencyCode;
    @JsonProperty("declaredValue")
    private Integer declaredValue;
    @JsonProperty("totalChargeAmount")
    private Integer totalChargeAmount;
    @JsonProperty("harmonisedCommodityCode")
    private String harmonisedCommodityCode;
    @JsonProperty("taxPayer")
    private String taxPayer;
    @JsonProperty("smsNotify")
    private Boolean smsNotify;
    @JsonProperty("smsNotifyMobile")
    private String smsNotifyMobile;
    @JsonProperty("senderNotify")
    private Boolean senderNotify;
    @JsonProperty("receiverNotify")
    private Boolean receiverNotify;
    @JsonProperty("deliveredInDepotCode")
    private String deliveredInDepotCode;
    @JsonProperty("holdInDepotCode")
    private String holdInDepotCode;
    @JsonProperty("extraServiceRequired")
    private Boolean extraServiceRequired;
    @JsonProperty("extraServiceValue")
    private Integer extraServiceValue;
    @JsonProperty("extraServiceCurrency")
    private String extraServiceCurrency;
    @JsonProperty("containsFood")
    private Boolean containsFood;
    @JsonProperty("alternateDelivery")
    private Boolean alternateDelivery;
    @JsonProperty("authorityToLeave")
    private Boolean authorityToLeave;
    @JsonProperty("securityCheckRequired")
    private Boolean securityCheckRequired;
    @JsonProperty("tradingNumber")
    private String tradingNumber;
    @JsonProperty("isPalletsTransactions")
    private Boolean isPalletsTransactions;
    @JsonProperty("totalVolume")
    private Integer totalVolume;
    @JsonProperty("totalQuantity")
    private Integer totalQuantity;
    @JsonProperty("totalWeight")
    private Integer totalWeight;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("lastModifiedBy")
    private String lastModifiedBy;
    @JsonProperty("shipmentLines")
    private List<ShipmentLine> shipmentLines = null;
    @JsonProperty("references")
    private List<Reference> references = null;
    @JsonProperty("palletTransactions")
    private PalletTransactions palletTransactions;
	public Long getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(Long shipmentId) {
		this.shipmentId = shipmentId;
	}
	public String getShipmentNumber() {
		return shipmentNumber;
	}
	public void setShipmentNumber(String shipmentNumber) {
		this.shipmentNumber = shipmentNumber;
	}
	public Long getManifestId() {
		return manifestId;
	}
	public void setManifestId(Long manifestId) {
		this.manifestId = manifestId;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getDispatchDate() {
		return dispatchDate;
	}
	public void setDispatchDate(String dispatchDate) {
		this.dispatchDate = dispatchDate;
	}
	public String getRequiredByDeliveryDate() {
		return requiredByDeliveryDate;
	}
	public void setRequiredByDeliveryDate(String requiredByDeliveryDate) {
		this.requiredByDeliveryDate = requiredByDeliveryDate;
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
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getChargeTo() {
		return chargeTo;
	}
	public void setChargeTo(String chargeTo) {
		this.chargeTo = chargeTo;
	}
	public String getQuoteNumber() {
		return quoteNumber;
	}
	public void setQuoteNumber(String quoteNumber) {
		this.quoteNumber = quoteNumber;
	}
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public SenderAddress getSenderAddress() {
		return senderAddress;
	}
	public void setSenderAddress(SenderAddress senderAddress) {
		this.senderAddress = senderAddress;
	}
	public ReceiverAddress getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(ReceiverAddress receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getSpecialInstructions() {
		return specialInstructions;
	}
	public void setSpecialInstructions(String specialInstructions) {
		this.specialInstructions = specialInstructions;
	}
	public String getTemperatureType() {
		return temperatureType;
	}
	public void setTemperatureType(String temperatureType) {
		this.temperatureType = temperatureType;
	}
	public String getTempRangeFrom() {
		return tempRangeFrom;
	}
	public void setTempRangeFrom(String tempRangeFrom) {
		this.tempRangeFrom = tempRangeFrom;
	}
	public String getTempRangeTo() {
		return tempRangeTo;
	}
	public void setTempRangeTo(String tempRangeTo) {
		this.tempRangeTo = tempRangeTo;
	}
	public String getTemperatureUom() {
		return temperatureUom;
	}
	public void setTemperatureUom(String temperatureUom) {
		this.temperatureUom = temperatureUom;
	}
	public String getPickupTemp() {
		return pickupTemp;
	}
	public void setPickupTemp(String pickupTemp) {
		this.pickupTemp = pickupTemp;
	}
	public String getHazardousType() {
		return hazardousType;
	}
	public void setHazardousType(String hazardousType) {
		this.hazardousType = hazardousType;
	}
	public String getThirdPartyContact() {
		return thirdPartyContact;
	}
	public void setThirdPartyContact(String thirdPartyContact) {
		this.thirdPartyContact = thirdPartyContact;
	}
	public String getThirdPartyContactPhone() {
		return thirdPartyContactPhone;
	}
	public void setThirdPartyContactPhone(String thirdPartyContactPhone) {
		this.thirdPartyContactPhone = thirdPartyContactPhone;
	}
	public String getQrCode() {
		return qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public String getFullBarCode() {
		return fullBarCode;
	}
	public void setFullBarCode(String fullBarCode) {
		this.fullBarCode = fullBarCode;
	}
	public String getTypeOfExport() {
		return typeOfExport;
	}
	public void setTypeOfExport(String typeOfExport) {
		this.typeOfExport = typeOfExport;
	}
	public String getDeclaredValueCurrencyCode() {
		return declaredValueCurrencyCode;
	}
	public void setDeclaredValueCurrencyCode(String declaredValueCurrencyCode) {
		this.declaredValueCurrencyCode = declaredValueCurrencyCode;
	}
	public Integer getDeclaredValue() {
		return declaredValue;
	}
	public void setDeclaredValue(Integer declaredValue) {
		this.declaredValue = declaredValue;
	}
	public Integer getTotalChargeAmount() {
		return totalChargeAmount;
	}
	public void setTotalChargeAmount(Integer totalChargeAmount) {
		this.totalChargeAmount = totalChargeAmount;
	}
	public String getHarmonisedCommodityCode() {
		return harmonisedCommodityCode;
	}
	public void setHarmonisedCommodityCode(String harmonisedCommodityCode) {
		this.harmonisedCommodityCode = harmonisedCommodityCode;
	}
	public String getTaxPayer() {
		return taxPayer;
	}
	public void setTaxPayer(String taxPayer) {
		this.taxPayer = taxPayer;
	}
	public Boolean getSmsNotify() {
		return smsNotify;
	}
	public void setSmsNotify(Boolean smsNotify) {
		this.smsNotify = smsNotify;
	}
	public String getSmsNotifyMobile() {
		return smsNotifyMobile;
	}
	public void setSmsNotifyMobile(String smsNotifyMobile) {
		this.smsNotifyMobile = smsNotifyMobile;
	}
	public Boolean getSenderNotify() {
		return senderNotify;
	}
	public void setSenderNotify(Boolean senderNotify) {
		this.senderNotify = senderNotify;
	}
	public Boolean getReceiverNotify() {
		return receiverNotify;
	}
	public void setReceiverNotify(Boolean receiverNotify) {
		this.receiverNotify = receiverNotify;
	}
	public String getDeliveredInDepotCode() {
		return deliveredInDepotCode;
	}
	public void setDeliveredInDepotCode(String deliveredInDepotCode) {
		this.deliveredInDepotCode = deliveredInDepotCode;
	}
	public String getHoldInDepotCode() {
		return holdInDepotCode;
	}
	public void setHoldInDepotCode(String holdInDepotCode) {
		this.holdInDepotCode = holdInDepotCode;
	}
	public Boolean getExtraServiceRequired() {
		return extraServiceRequired;
	}
	public void setExtraServiceRequired(Boolean extraServiceRequired) {
		this.extraServiceRequired = extraServiceRequired;
	}
	public Integer getExtraServiceValue() {
		return extraServiceValue;
	}
	public void setExtraServiceValue(Integer extraServiceValue) {
		this.extraServiceValue = extraServiceValue;
	}
	public String getExtraServiceCurrency() {
		return extraServiceCurrency;
	}
	public void setExtraServiceCurrency(String extraServiceCurrency) {
		this.extraServiceCurrency = extraServiceCurrency;
	}
	public Boolean getContainsFood() {
		return containsFood;
	}
	public void setContainsFood(Boolean containsFood) {
		this.containsFood = containsFood;
	}
	public Boolean getAlternateDelivery() {
		return alternateDelivery;
	}
	public void setAlternateDelivery(Boolean alternateDelivery) {
		this.alternateDelivery = alternateDelivery;
	}
	public Boolean getAuthorityToLeave() {
		return authorityToLeave;
	}
	public void setAuthorityToLeave(Boolean authorityToLeave) {
		this.authorityToLeave = authorityToLeave;
	}
	public Boolean getSecurityCheckRequired() {
		return securityCheckRequired;
	}
	public void setSecurityCheckRequired(Boolean securityCheckRequired) {
		this.securityCheckRequired = securityCheckRequired;
	}
	public String getTradingNumber() {
		return tradingNumber;
	}
	public void setTradingNumber(String tradingNumber) {
		this.tradingNumber = tradingNumber;
	}
	public Boolean getIsPalletsTransactions() {
		return isPalletsTransactions;
	}
	public void setIsPalletsTransactions(Boolean isPalletsTransactions) {
		this.isPalletsTransactions = isPalletsTransactions;
	}
	public Integer getTotalVolume() {
		return totalVolume;
	}
	public void setTotalVolume(Integer totalVolume) {
		this.totalVolume = totalVolume;
	}
	public Integer getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public Integer getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(Integer totalWeight) {
		this.totalWeight = totalWeight;
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
	public List<ShipmentLine> getShipmentLines() {
		return shipmentLines;
	}
	public void setShipmentLines(List<ShipmentLine> shipmentLines) {
		this.shipmentLines = shipmentLines;
	}
	public List<Reference> getReferences() {
		return references;
	}
	public void setReferences(List<Reference> references) {
		this.references = references;
	}
	public PalletTransactions getPalletTransactions() {
		return palletTransactions;
	}
	public void setPalletTransactions(PalletTransactions palletTransactions) {
		this.palletTransactions = palletTransactions;
	}

   

}
