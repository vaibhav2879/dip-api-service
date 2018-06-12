package com.dip.model.dashboard.pickup;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "TollCarrierCode", "TollCarrierName" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class TollCarrier implements Serializable {

	@JsonProperty("TollCarrierCode")
	private String tollCarrierCode;
	@JsonProperty("TollCarrierName")
	private String tollCarrierName;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -1872172331940003626L;

	@JsonProperty("TollCarrierCode")
	public String getTollCarrierCode() {
		return tollCarrierCode;
	}

	@JsonProperty("TollCarrierCode")
	public void setTollCarrierCode(String tollCarrierCode) {
		this.tollCarrierCode = tollCarrierCode;
	}

	@JsonProperty("TollCarrierName")
	public String getTollCarrierName() {
		return tollCarrierName;
	}

	@JsonProperty("TollCarrierName")
	public void setTollCarrierName(String tollCarrierName) {
		this.tollCarrierName = tollCarrierName;
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
		return new HashCodeBuilder().append(tollCarrierCode).append(tollCarrierName).append(additionalProperties)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof TollCarrier) == false) {
			return false;
		}
		TollCarrier rhs = ((TollCarrier) other);
		return new EqualsBuilder().append(tollCarrierCode, rhs.tollCarrierCode)
				.append(tollCarrierName, rhs.tollCarrierName).append(additionalProperties, rhs.additionalProperties)
				.isEquals();
	}

}