package com.dip.model.dashboard.pickup;

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
@JsonPropertyOrder({ "Length", "Width", "Height", "LWHUom", "TotalCubicVolume", "TotalVolumeUom" })
public class Dimensions implements Serializable {

	@JsonProperty("Length")
	private Integer length;
	@JsonProperty("Width")
	private Integer width;
	@JsonProperty("Height")
	private Integer height;
	@JsonProperty("LWHUom")
	private Object lWHUom;
	@JsonProperty("TotalCubicVolume")
	private Integer totalCubicVolume;
	@JsonProperty("TotalVolumeUom")
	private Object totalVolumeUom;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -8038515184395616550L;

	@JsonProperty("Length")
	public Integer getLength() {
		return length;
	}

	@JsonProperty("Length")
	public void setLength(Integer length) {
		this.length = length;
	}

	@JsonProperty("Width")
	public Integer getWidth() {
		return width;
	}

	@JsonProperty("Width")
	public void setWidth(Integer width) {
		this.width = width;
	}

	@JsonProperty("Height")
	public Integer getHeight() {
		return height;
	}

	@JsonProperty("Height")
	public void setHeight(Integer height) {
		this.height = height;
	}

	@JsonProperty("LWHUom")
	public Object getLWHUom() {
		return lWHUom;
	}

	@JsonProperty("LWHUom")
	public void setLWHUom(Object lWHUom) {
		this.lWHUom = lWHUom;
	}

	@JsonProperty("TotalCubicVolume")
	public Integer getTotalCubicVolume() {
		return totalCubicVolume;
	}

	@JsonProperty("TotalCubicVolume")
	public void setTotalCubicVolume(Integer totalCubicVolume) {
		this.totalCubicVolume = totalCubicVolume;
	}

	@JsonProperty("TotalVolumeUom")
	public Object getTotalVolumeUom() {
		return totalVolumeUom;
	}

	@JsonProperty("TotalVolumeUom")
	public void setTotalVolumeUom(Object totalVolumeUom) {
		this.totalVolumeUom = totalVolumeUom;
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
		return new HashCodeBuilder().append(length).append(width).append(height).append(lWHUom).append(totalCubicVolume)
				.append(totalVolumeUom).append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Dimensions) == false) {
			return false;
		}
		Dimensions rhs = ((Dimensions) other);
		return new EqualsBuilder().append(length, rhs.length).append(width, rhs.width).append(height, rhs.height)
				.append(lWHUom, rhs.lWHUom).append(totalCubicVolume, rhs.totalCubicVolume)
				.append(totalVolumeUom, rhs.totalVolumeUom).append(additionalProperties, rhs.additionalProperties)
				.isEquals();
	}

}