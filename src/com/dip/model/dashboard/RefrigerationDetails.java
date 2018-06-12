package com.dip.model.dashboard;

import java.io.Serializable;
import java.util.HashMap;
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
@JsonPropertyOrder({
"BookingNumber",
"RangeHigh",
"RangeLow",
"RefNumber",
"OrderDate",
"DeliveryDate",
"TimeSlot"
})
public class RefrigerationDetails implements Serializable
{

@JsonProperty("BookingNumber")
private String bookingNumber;
@JsonProperty("RangeHigh")
private String rangeHigh;
@JsonProperty("RangeLow")
private String rangeLow;
@JsonProperty("RefNumber")
private String refNumber;
@JsonProperty("OrderDate")
private String orderDate;
@JsonProperty("DeliveryDate")
private String deliveryDate;
@JsonProperty("TimeSlot")
private String timeSlot;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = -2269510595980140251L;

/**
* No args constructor for use in serialization
* 
*/
public RefrigerationDetails() {
}

/**
* 
* @param orderDate
* @param bookingNumber
* @param rangeHigh
* @param deliveryDate
* @param rangeLow
* @param refNumber
* @param timeSlot
*/
public RefrigerationDetails(String bookingNumber, String rangeHigh, String rangeLow, String refNumber, String orderDate, String deliveryDate, String timeSlot) {
super();
this.bookingNumber = bookingNumber;
this.rangeHigh = rangeHigh;
this.rangeLow = rangeLow;
this.refNumber = refNumber;
this.orderDate = orderDate;
this.deliveryDate = deliveryDate;
this.timeSlot = timeSlot;
}

@JsonProperty("BookingNumber")
public String getBookingNumber() {
return bookingNumber;
}

@JsonProperty("BookingNumber")
public void setBookingNumber(String bookingNumber) {
this.bookingNumber = bookingNumber;
}

@JsonProperty("RangeHigh")
public String getRangeHigh() {
return rangeHigh;
}

@JsonProperty("RangeHigh")
public void setRangeHigh(String rangeHigh) {
this.rangeHigh = rangeHigh;
}

@JsonProperty("RangeLow")
public String getRangeLow() {
return rangeLow;
}

@JsonProperty("RangeLow")
public void setRangeLow(String rangeLow) {
this.rangeLow = rangeLow;
}

@JsonProperty("RefNumber")
public String getRefNumber() {
return refNumber;
}

@JsonProperty("RefNumber")
public void setRefNumber(String refNumber) {
this.refNumber = refNumber;
}

@JsonProperty("OrderDate")
public String getOrderDate() {
return orderDate;
}

@JsonProperty("OrderDate")
public void setOrderDate(String orderDate) {
this.orderDate = orderDate;
}

@JsonProperty("DeliveryDate")
public String getDeliveryDate() {
return deliveryDate;
}

@JsonProperty("DeliveryDate")
public void setDeliveryDate(String deliveryDate) {
this.deliveryDate = deliveryDate;
}

@JsonProperty("TimeSlot")
public String getTimeSlot() {
return timeSlot;
}

@JsonProperty("TimeSlot")
public void setTimeSlot(String timeSlot) {
this.timeSlot = timeSlot;
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
return new HashCodeBuilder().append(bookingNumber).append(rangeHigh).append(rangeLow).append(refNumber).append(orderDate).append(deliveryDate).append(timeSlot).append(additionalProperties).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof RefrigerationDetails) == false) {
return false;
}
RefrigerationDetails rhs = ((RefrigerationDetails) other);
return new EqualsBuilder().append(bookingNumber, rhs.bookingNumber).append(rangeHigh, rhs.rangeHigh).append(rangeLow, rhs.rangeLow).append(refNumber, rhs.refNumber).append(orderDate, rhs.orderDate).append(deliveryDate, rhs.deliveryDate).append(timeSlot, rhs.timeSlot).append(additionalProperties, rhs.additionalProperties).isEquals();
}

}