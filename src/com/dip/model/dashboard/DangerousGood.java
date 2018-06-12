
package com.dip.model.dashboard;

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
@JsonPropertyOrder({ "StatusCode", "StatusMessage", "DGs" })
public class DangerousGood implements Serializable {

	private static final long serialVersionUID = 1L;
	@JsonProperty("StatusCode")
	private String statusCode;
	@JsonProperty("StatusMessage")
	private String statusMessage;
	@JsonProperty("DGs")
	private List<DG> dGs = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public DangerousGood() {
	}

	/**
	 * 
	 * @param statusCode
	 * @param dGs
	 * @param statusMessage
	 */
	public DangerousGood(String statusCode, String statusMessage, List<DG> dGs) {
		super();
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
		this.dGs = dGs;
	}

	@JsonProperty("StatusCode")
	public String getStatusCode() {
		return statusCode;
	}

	@JsonProperty("StatusCode")
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	@JsonProperty("StatusMessage")
	public String getStatusMessage() {
		return statusMessage;
	}

	@JsonProperty("StatusMessage")
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	@JsonProperty("DGs")
	public List<DG> getDGs() {
		return dGs;
	}

	@JsonProperty("DGs")
	public void setDGs(List<DG> dGs) {
		this.dGs = dGs;
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
		return new HashCodeBuilder().append(statusCode).append(statusMessage).append(dGs).append(additionalProperties)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof DangerousGood) == false) {
			return false;
		}
		DangerousGood rhs = ((DangerousGood) other);
		return new EqualsBuilder().append(statusCode, rhs.statusCode).append(statusMessage, rhs.statusMessage)
				.append(dGs, rhs.dGs).append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
