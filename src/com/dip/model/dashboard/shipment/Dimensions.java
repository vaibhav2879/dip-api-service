
package com.dip.model.dashboard.shipment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "length",
    "width",
    "height",
    "lwhUom",
    "totalVolume",
    "totalVolumeUom",
    "totalWeight",
    "totalWeightUom",
    "totalCubicVolume"
})
public class Dimensions {

    @JsonProperty("length")
    private Integer length;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("lwhUom")
    private String lwhUom;
    @JsonProperty("totalVolume")
    private Integer totalVolume;
    @JsonProperty("totalVolumeUom")
    private String totalVolumeUom;
    @JsonProperty("totalWeight")
    private Integer totalWeight;
    @JsonProperty("totalWeightUom")
    private String totalWeightUom;
    @JsonProperty("totalCubicVolume")
    private Integer totalCubicVolume;
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public String getLwhUom() {
		return lwhUom;
	}
	public void setLwhUom(String lwhUom) {
		this.lwhUom = lwhUom;
	}
	public Integer getTotalVolume() {
		return totalVolume;
	}
	public void setTotalVolume(Integer totalVolume) {
		this.totalVolume = totalVolume;
	}
	public String getTotalVolumeUom() {
		return totalVolumeUom;
	}
	public void setTotalVolumeUom(String totalVolumeUom) {
		this.totalVolumeUom = totalVolumeUom;
	}
	public Integer getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(Integer totalWeight) {
		this.totalWeight = totalWeight;
	}
	public String getTotalWeightUom() {
		return totalWeightUom;
	}
	public void setTotalWeightUom(String totalWeightUom) {
		this.totalWeightUom = totalWeightUom;
	}
	public Integer getTotalCubicVolume() {
		return totalCubicVolume;
	}
	public void setTotalCubicVolume(Integer totalCubicVolume) {
		this.totalCubicVolume = totalCubicVolume;
	}

    
}
