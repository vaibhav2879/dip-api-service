
package com.dip.model.dashboard.watchlist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "consignmentId",
    "consignmentNumber",
    "pickupDate",
    "eta",
    "estimatedDeliveryDate",
    "shipmentCreationDate",
    "shipmentDeliveryDate",
    "shipmentCollectedDate",
    "shipmentAwtColDate",
    "purchaseOrder",
    "itemReferences",
    "shipmentReferences",
    "stopReferences",
    "shipmentRef",
    "references",
    "senderRef",
    "senderName",
    "senderLocation",
    "receiverReferenceNumber",
    "recieverName",
    "recieverLocation",
    "noOfItems",
    "weight",
    "volume",
    "carrier",
    "serviceType",
    "customerRole",
    "inException",
    "toRemove",
    "showMoreReferences"
})
public class Result {

    @JsonProperty("status")
    private String status;
    @JsonProperty("consignmentId")
    private String consignmentId;
    @JsonProperty("consignmentNumber")
    private String consignmentNumber;
    @JsonProperty("pickupDate")
    private String pickupDate;
    @JsonProperty("eta")
    private String eta;
    @JsonProperty("estimatedDeliveryDate")
    private String estimatedDeliveryDate;
    @JsonProperty("shipmentCreationDate")
    private String shipmentCreationDate;
    @JsonProperty("shipmentDeliveryDate")
    private String shipmentDeliveryDate;
    @JsonProperty("shipmentCollectedDate")
    private String shipmentCollectedDate;
    @JsonProperty("shipmentAwtColDate")
    private String shipmentAwtColDate;
    @JsonProperty("shipmentRef")
    private String shipmentRef;
    @JsonProperty("references")
    private String references;
    @JsonProperty("senderRef")
    private String senderRef;
    @JsonProperty("senderName")
    private String senderName;
    @JsonProperty("senderLocation")
    private SenderLocation senderLocation;
    @JsonProperty("receiverReferenceNumber")
    private String receiverReferenceNumber;
    @JsonProperty("recieverName")
    private String recieverName;
    @JsonProperty("recieverLocation")
    private RecieverLocation recieverLocation;
    @JsonProperty("noOfItems")
    private Integer noOfItems;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("volume")
    private String volume;
    @JsonProperty("carrier")
    private String carrier;
    @JsonProperty("serviceType")
    private String serviceType;
    @JsonProperty("customerRole")
    private String customerRole;
    @JsonProperty("inException")
    private String inException;
    @JsonProperty("toRemove")
    private String toRemove;
    @JsonProperty("showMoreReferences")
    private boolean showMoreReferences;
    private List<String> refrenceList;
    
    public List<String> getRefrenceList() {
		return refrenceList;
	}
	public void setRefrenceList(List<String> refrenceList) {
		this.refrenceList = refrenceList;
	}
	@JsonProperty("showMoreReferences")
    public boolean isShowMoreReferences() {
		return showMoreReferences;
	}
    @JsonProperty("showMoreReferences")
	public void setShowMoreReferences(boolean showMoreReferences) {
		this.showMoreReferences = showMoreReferences;
	}

	private Integer statusCode;
    private String date;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("purchaseOrder")
    private String purchaseOrder;
    @JsonProperty("itemReferences")
	private List<Map<String, String>> itemReferences;
    @JsonProperty("shipmentReferences")
	private Map<String, String> shipmentReferences;
    @JsonProperty("stopReferences")
	private List<Map<String, String>> stopReferences;
	
    @JsonProperty("purchaseOrder")
    public String getPurchaseOrder() {
		return purchaseOrder;
	}
    @JsonProperty("purchaseOrder")
	public void setPurchaseOrder(String purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
    @JsonProperty("itemReferences")
	public List<Map<String, String>> getItemReferences() {
		return itemReferences;
	}
    @JsonProperty("itemReferences")
	public void setItemReferences(List<Map<String, String>> itemReferences) {
		this.itemReferences = itemReferences;
	}
    @JsonProperty("shipmentReferences")
	public Map<String, String> getShipmentReferences() {
		return shipmentReferences;
	}
    @JsonProperty("shipmentReferences")
	public void setShipmentReferences(Map<String, String> shipmentReferences) {
		this.shipmentReferences = shipmentReferences;
	}
    @JsonProperty("stopReferences")
	public List<Map<String, String>> getStopReferences() {
		return stopReferences;
	}
    @JsonProperty("stopReferences")
	public void setStopReferences(List<Map<String, String>> stopReferences) {
		this.stopReferences = stopReferences;
	}

	@JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("consignmentId")
    public String getConsignmentId() {
        return consignmentId;
    }

    @JsonProperty("consignmentId")
    public void setConsignmentId(String consignmentId) {
        this.consignmentId = consignmentId;
    }

    @JsonProperty("consignmentNumber")
    public String getConsignmentNumber() {
        return consignmentNumber;
    }

    @JsonProperty("consignmentNumber")
    public void setConsignmentNumber(String consignmentNumber) {
        this.consignmentNumber = consignmentNumber;
    }

    @JsonProperty("pickupDate")
    public String getPickupDate() {
        return pickupDate;
    }

    @JsonProperty("pickupDate")
    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    @JsonProperty("eta")
    public String getEta() {
        return eta;
    }

    @JsonProperty("eta")
    public void setEta(String eta) {
        this.eta = eta;
    }

    @JsonProperty("estimatedDeliveryDate")
    public String getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    @JsonProperty("estimatedDeliveryDate")
    public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    @JsonProperty("shipmentCreationDate")
    public String getShipmentCreationDate() {
        return shipmentCreationDate;
    }

    @JsonProperty("shipmentCreationDate")
    public void setShipmentCreationDate(String shipmentCreationDate) {
        this.shipmentCreationDate = shipmentCreationDate;
    }

    @JsonProperty("shipmentDeliveryDate")
    public String getShipmentDeliveryDate() {
        return shipmentDeliveryDate;
    }

    @JsonProperty("shipmentDeliveryDate")
    public void setShipmentDeliveryDate(String shipmentDeliveryDate) {
        this.shipmentDeliveryDate = shipmentDeliveryDate;
    }

    @JsonProperty("shipmentCollectedDate")
    public String getShipmentCollectedDate() {
        return shipmentCollectedDate;
    }

    @JsonProperty("shipmentCollectedDate")
    public void setShipmentCollectedDate(String shipmentCollectedDate) {
        this.shipmentCollectedDate = shipmentCollectedDate;
    }

    @JsonProperty("shipmentAwtColDate")
    public String getShipmentAwtColDate() {
        return shipmentAwtColDate;
    }

    @JsonProperty("shipmentAwtColDate")
    public void setShipmentAwtColDate(String shipmentAwtColDate) {
        this.shipmentAwtColDate = shipmentAwtColDate;
    }

    @JsonProperty("shipmentRef")
    public String getShipmentRef() {
        return shipmentRef;
    }

    @JsonProperty("shipmentRef")
    public void setShipmentRef(String shipmentRef) {
        this.shipmentRef = shipmentRef;
    }

    @JsonProperty("references")
    public String getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(String references) {
        this.references = references;
    }

    @JsonProperty("senderRef")
    public String getSenderRef() {
        return senderRef;
    }

    @JsonProperty("senderRef")
    public void setSenderRef(String senderRef) {
        this.senderRef = senderRef;
    }

    @JsonProperty("senderName")
    public String getSenderName() {
        return senderName;
    }

    @JsonProperty("senderName")
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    @JsonProperty("senderLocation")
    public SenderLocation getSenderLocation() {
        return senderLocation;
    }

    @JsonProperty("senderLocation")
    public void setSenderLocation(SenderLocation senderLocation) {
        this.senderLocation = senderLocation;
    }

    @JsonProperty("receiverReferenceNumber")
    public String getReceiverReferenceNumber() {
        return receiverReferenceNumber;
    }

    @JsonProperty("receiverReferenceNumber")
    public void setReceiverReferenceNumber(String receiverReferenceNumber) {
        this.receiverReferenceNumber = receiverReferenceNumber;
    }

    @JsonProperty("recieverName")
    public String getRecieverName() {
        return recieverName;
    }

    @JsonProperty("recieverName")
    public void setRecieverName(String recieverName) {
        this.recieverName = recieverName;
    }

    @JsonProperty("recieverLocation")
    public RecieverLocation getRecieverLocation() {
        return recieverLocation;
    }

    @JsonProperty("recieverLocation")
    public void setRecieverLocation(RecieverLocation recieverLocation) {
        this.recieverLocation = recieverLocation;
    }

    @JsonProperty("noOfItems")
    public Integer getNoOfItems() {
        return noOfItems;
    }

    @JsonProperty("noOfItems")
    public void setNoOfItems(Integer noOfItems) {
        this.noOfItems = noOfItems;
    }

    @JsonProperty("weight")
    public String getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @JsonProperty("volume")
    public String getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(String volume) {
        this.volume = volume;
    }

    @JsonProperty("carrier")
    public String getCarrier() {
        return carrier;
    }

    @JsonProperty("carrier")
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @JsonProperty("serviceType")
    public String getServiceType() {
        return serviceType;
    }

    @JsonProperty("serviceType")
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @JsonProperty("customerRole")
    public String getCustomerRole() {
        return customerRole;
    }

    @JsonProperty("customerRole")
    public void setCustomerRole(String customerRole) {
        this.customerRole = customerRole;
    }

    @JsonProperty("inException")
    public String getInException() {
        return inException;
    }

    @JsonProperty("inException")
    public void setInException(String inException) {
        this.inException = inException;
    }

    @JsonProperty("toRemove")
    public String getToRemove() {
        return toRemove;
    }

    @JsonProperty("toRemove")
    public void setToRemove(String toRemove) {
        this.toRemove = toRemove;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
