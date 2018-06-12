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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "OpeningTime", "ClosingTime", "Point", "PointFreeText" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteInfo implements Serializable {

	@JsonProperty("OpeningTime")
	private String openingTime;
	@JsonProperty("ClosingTime")
	private String closingTime;
	@JsonProperty("Point")
	private Object point;
	@JsonProperty("PointFreeText")
	private Object pointFreeText;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 807382715090955197L;

	@JsonProperty("OpeningTime")
	public String getOpeningTime() {
		return openingTime;
	}

	@JsonProperty("OpeningTime")
	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}

	@JsonProperty("ClosingTime")
	public String getClosingTime() {
		return closingTime;
	}

	@JsonProperty("ClosingTime")
	public void setClosingTime(String closingTime) {
		this.closingTime = closingTime;
	}

	@JsonProperty("Point")
	public Object getPoint() {
		return point;
	}

	@JsonProperty("Point")
	public void setPoint(Object point) {
		this.point = point;
	}

	@JsonProperty("PointFreeText")
	public Object getPointFreeText() {
		return pointFreeText;
	}

	@JsonProperty("PointFreeText")
	public void setPointFreeText(Object pointFreeText) {
		this.pointFreeText = pointFreeText;
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
		return new HashCodeBuilder().append(openingTime).append(closingTime).append(point).append(pointFreeText)
				.append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof SiteInfo) == false) {
			return false;
		}
		SiteInfo rhs = ((SiteInfo) other);
		return new EqualsBuilder().append(openingTime, rhs.openingTime).append(closingTime, rhs.closingTime)
				.append(point, rhs.point).append(pointFreeText, rhs.pointFreeText)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}