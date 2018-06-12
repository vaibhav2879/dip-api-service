
package com.dip.model.dashboard.shipment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "count",
    "pageNo",
    "Shipments"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShipmentList {

    @JsonProperty("count")
    private Long count;
    @JsonProperty("pageNo")
    private String pageNo;
    @JsonProperty("Shipments")
    private List<Shipment> shipments = null;
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public String getPageNo() {
		return pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	public List<Shipment> getShipments() {
		return shipments;
	}
	public void setShipments(List<Shipment> shipments) {
		this.shipments = shipments;
	}
    

   

}
