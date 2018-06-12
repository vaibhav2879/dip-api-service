package com.dip.model.dashboard.pickup;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "FIDTTemplateId", "ServiceCode", "ServiceName", "ItemType", "ItemDescription",
		"DetailedDescription", "ChargeToParty", "ChargeToAccountCode", "ItemCount", "Destination", "PalletSpaces",
		"TotalWeight", "TotalWeightUom", "Dimensions", "ContainsDangerousGoods", "DangerousGoods", "ContainsFood",
		"ContainsRefigeratedGoods", "RefrigerationDetails", "RefNumber", "VendorNumber", "BookingNumber",
		"DeliveryInstructions", "DeliveryDate", "OrderDate", "TimeSlot", "RecieverCompanyName", "TransportMode",
		"SpecialInstructions", "Temperature" })
public class Item implements Serializable {

	@JsonProperty("FIDTTemplateId")
	private Integer fIDTTemplateId;
	@JsonProperty("ServiceCode")
	private String serviceCode;
	@JsonProperty("ServiceName")
	private String serviceName;
	@JsonProperty("ItemType")
	private String itemType;
	@JsonProperty("ItemDescription")
	private String itemDescription;
	@JsonProperty("DetailedDescription")
	private String detailedDescription;
	@JsonProperty("ChargeToParty")
	private String chargeToParty;
	@JsonProperty("ChargeToAccountCode")
	private String chargeToAccountCode;
	@JsonProperty("ItemCount")
	private Integer itemCount;
	@JsonProperty("Destination")
	private Destination destination;
	@JsonProperty("PalletSpaces")
	private String palletSpaces;
	@JsonProperty("TotalWeight")
	private Integer totalWeight;
	@JsonProperty("TotalWeightUom")
	private String totalWeightUom;
	@JsonProperty("Dimensions")
	private Dimensions dimensions;
	@JsonProperty("ContainsDangerousGoods")
	private Boolean containsDangerousGoods;
	@JsonProperty("DangerousGoods")
	private List<DangerousGood> dangerousGoods = null;
	@JsonProperty("ContainsFood")
	private Boolean containsFood;
	@JsonProperty("ContainsRefigeratedGoods")
	private Object containsRefigeratedGoods;
	@JsonProperty("RefrigerationDetails")
	private RefrigerationDetails refrigerationDetails;
	@JsonProperty("RefNumber")
	private String refNumber;
	@JsonProperty("VendorNumber")
	private String vendorNumber;
	@JsonProperty("BookingNumber")
	private String bookingNumber;
	@JsonProperty("DeliveryInstructions")
	private String deliveryInstructions;
	@JsonProperty("DeliveryDate")
	private String deliveryDate;
	@JsonProperty("OrderDate")
	private String orderDate;
	@JsonProperty("TimeSlot")
	private String timeSlot;
	@JsonProperty("RecieverCompanyName")
	private String recieverCompanyName;
	@JsonProperty("TransportMode")
	private String transportMode;
	@JsonProperty("SpecialInstructions")
	private String specialInstructions;
	@JsonProperty("Temperature")
	private Integer temperature;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -4297271178841443274L;

	@JsonProperty("FIDTTemplateId")
	public Integer getFIDTTemplateId() {
		return fIDTTemplateId;
	}

	@JsonProperty("FIDTTemplateId")
	public void setFIDTTemplateId(Integer fIDTTemplateId) {
		this.fIDTTemplateId = fIDTTemplateId;
	}

	@JsonProperty("ServiceCode")
	public String getServiceCode() {
		return serviceCode;
	}

	@JsonProperty("ServiceCode")
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	@JsonProperty("ServiceName")
	public String getServiceName() {
		return serviceName;
	}

	@JsonProperty("ServiceName")
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	@JsonProperty("ItemType")
	public String getItemType() {
		return itemType;
	}

	@JsonProperty("ItemType")
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	@JsonProperty("ItemDescription")
	public String getItemDescription() {
		return itemDescription;
	}

	@JsonProperty("ItemDescription")
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	@JsonProperty("DetailedDescription")
	public String getDetailedDescription() {
		return detailedDescription;
	}

	@JsonProperty("DetailedDescription")
	public void setDetailedDescription(String detailedDescription) {
		this.detailedDescription = detailedDescription;
	}

	@JsonProperty("ChargeToParty")
	public String getChargeToParty() {
		return chargeToParty;
	}

	@JsonProperty("ChargeToParty")
	public void setChargeToParty(String chargeToParty) {
		this.chargeToParty = chargeToParty;
	}

	@JsonProperty("ChargeToAccountCode")
	public String getChargeToAccountCode() {
		return chargeToAccountCode;
	}

	@JsonProperty("ChargeToAccountCode")
	public void setChargeToAccountCode(String chargeToAccountCode) {
		this.chargeToAccountCode = chargeToAccountCode;
	}

	@JsonProperty("ItemCount")
	public Integer getItemCount() {
		return itemCount;
	}

	@JsonProperty("ItemCount")
	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}

	@JsonProperty("Destination")
	public Destination getDestination() {
		return destination;
	}

	@JsonProperty("Destination")
	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	@JsonProperty("PalletSpaces")
	public String getPalletSpaces() {
		return palletSpaces;
	}

	@JsonProperty("PalletSpaces")
	public void setPalletSpaces(String palletSpaces) {
		this.palletSpaces = palletSpaces;
	}

	@JsonProperty("TotalWeight")
	public Integer getTotalWeight() {
		return totalWeight;
	}

	@JsonProperty("TotalWeight")
	public void setTotalWeight(Integer totalWeight) {
		this.totalWeight = totalWeight;
	}

	@JsonProperty("TotalWeightUom")
	public String getTotalWeightUom() {
		return totalWeightUom;
	}

	@JsonProperty("TotalWeightUom")
	public void setTotalWeightUom(String totalWeightUom) {
		this.totalWeightUom = totalWeightUom;
	}

	@JsonProperty("Dimensions")
	public Dimensions getDimensions() {
		return dimensions;
	}

	@JsonProperty("Dimensions")
	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}

	@JsonProperty("ContainsDangerousGoods")
	public Boolean getContainsDangerousGoods() {
		return containsDangerousGoods;
	}

	@JsonProperty("ContainsDangerousGoods")
	public void setContainsDangerousGoods(Boolean containsDangerousGoods) {
		this.containsDangerousGoods = containsDangerousGoods;
	}

	@JsonProperty("DangerousGoods")
	public List<DangerousGood> getDangerousGoods() {
		return dangerousGoods;
	}

	@JsonProperty("DangerousGoods")
	public void setDangerousGoods(List<DangerousGood> dangerousGoods) {
		this.dangerousGoods = dangerousGoods;
	}

	@JsonProperty("ContainsFood")
	public Boolean getContainsFood() {
		return containsFood;
	}

	@JsonProperty("ContainsFood")
	public void setContainsFood(Boolean containsFood) {
		this.containsFood = containsFood;
	}

	@JsonProperty("ContainsRefigeratedGoods")
	public Object getContainsRefigeratedGoods() {
		return containsRefigeratedGoods;
	}

	@JsonProperty("ContainsRefigeratedGoods")
	public void setContainsRefigeratedGoods(Object containsRefigeratedGoods) {
		this.containsRefigeratedGoods = containsRefigeratedGoods;
	}

	@JsonProperty("RefrigerationDetails")
	public RefrigerationDetails getRefrigerationDetails() {
		return refrigerationDetails;
	}

	@JsonProperty("RefrigerationDetails")
	public void setRefrigerationDetails(RefrigerationDetails refrigerationDetails) {
		this.refrigerationDetails = refrigerationDetails;
	}

	@JsonProperty("RefNumber")
	public String getRefNumber() {
		return refNumber;
	}

	@JsonProperty("RefNumber")
	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}

	@JsonProperty("VendorNumber")
	public String getVendorNumber() {
		return vendorNumber;
	}

	@JsonProperty("VendorNumber")
	public void setVendorNumber(String vendorNumber) {
		this.vendorNumber = vendorNumber;
	}

	@JsonProperty("BookingNumber")
	public String getBookingNumber() {
		return bookingNumber;
	}

	@JsonProperty("BookingNumber")
	public void setBookingNumber(String bookingNumber) {
		this.bookingNumber = bookingNumber;
	}

	@JsonProperty("DeliveryInstructions")
	public String getDeliveryInstructions() {
		return deliveryInstructions;
	}

	@JsonProperty("DeliveryInstructions")
	public void setDeliveryInstructions(String deliveryInstructions) {
		this.deliveryInstructions = deliveryInstructions;
	}

	@JsonProperty("DeliveryDate")
	public String getDeliveryDate() {
		return deliveryDate;
	}

	@JsonProperty("DeliveryDate")
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	@JsonProperty("OrderDate")
	public String getOrderDate() {
		return orderDate;
	}

	@JsonProperty("OrderDate")
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@JsonProperty("TimeSlot")
	public String getTimeSlot() {
		return timeSlot;
	}

	@JsonProperty("TimeSlot")
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	@JsonProperty("RecieverCompanyName")
	public String getRecieverCompanyName() {
		return recieverCompanyName;
	}

	@JsonProperty("RecieverCompanyName")
	public void setRecieverCompanyName(String recieverCompanyName) {
		this.recieverCompanyName = recieverCompanyName;
	}

	@JsonProperty("TransportMode")
	public String getTransportMode() {
		return transportMode;
	}

	@JsonProperty("TransportMode")
	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}

	@JsonProperty("SpecialInstructions")
	public String getSpecialInstructions() {
		return specialInstructions;
	}

	@JsonProperty("SpecialInstructions")
	public void setSpecialInstructions(String specialInstructions) {
		this.specialInstructions = specialInstructions;
	}

	@JsonProperty("Temperature")
	public Integer getTemperature() {
		return temperature;
	}

	@JsonProperty("Temperature")
	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
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
		return new HashCodeBuilder().append(fIDTTemplateId).append(serviceCode).append(serviceName).append(itemType)
				.append(itemDescription).append(detailedDescription).append(chargeToParty).append(chargeToAccountCode)
				.append(itemCount).append(destination).append(palletSpaces).append(totalWeight).append(totalWeightUom)
				.append(dimensions).append(containsDangerousGoods).append(dangerousGoods).append(containsFood)
				.append(containsRefigeratedGoods).append(refrigerationDetails).append(refNumber).append(vendorNumber)
				.append(bookingNumber).append(deliveryInstructions).append(deliveryDate).append(orderDate)
				.append(timeSlot).append(recieverCompanyName).append(transportMode).append(specialInstructions)
				.append(temperature).append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Item) == false) {
			return false;
		}
		Item rhs = ((Item) other);
		return new EqualsBuilder().append(fIDTTemplateId, rhs.fIDTTemplateId).append(serviceCode, rhs.serviceCode)
				.append(serviceName, rhs.serviceName).append(itemType, rhs.itemType)
				.append(itemDescription, rhs.itemDescription).append(detailedDescription, rhs.detailedDescription)
				.append(chargeToParty, rhs.chargeToParty).append(chargeToAccountCode, rhs.chargeToAccountCode)
				.append(itemCount, rhs.itemCount).append(destination, rhs.destination)
				.append(palletSpaces, rhs.palletSpaces).append(totalWeight, rhs.totalWeight)
				.append(totalWeightUom, rhs.totalWeightUom).append(dimensions, rhs.dimensions)
				.append(containsDangerousGoods, rhs.containsDangerousGoods).append(dangerousGoods, rhs.dangerousGoods)
				.append(containsFood, rhs.containsFood).append(containsRefigeratedGoods, rhs.containsRefigeratedGoods)
				.append(refrigerationDetails, rhs.refrigerationDetails).append(refNumber, rhs.refNumber)
				.append(vendorNumber, rhs.vendorNumber).append(bookingNumber, rhs.bookingNumber)
				.append(deliveryInstructions, rhs.deliveryInstructions).append(deliveryDate, rhs.deliveryDate)
				.append(orderDate, rhs.orderDate).append(timeSlot, rhs.timeSlot)
				.append(recieverCompanyName, rhs.recieverCompanyName).append(transportMode, rhs.transportMode)
				.append(specialInstructions, rhs.specialInstructions).append(temperature, rhs.temperature)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}