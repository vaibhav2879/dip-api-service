
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
@JsonPropertyOrder({ "UNNumber", "Name", "IsSP274Applicable", "Class", "SubClass", "PackagingGroup",
		"SupportedCarriers", "IncompatibleClasses" })
public class DG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("UNNumber")
	private String uNNumber;
	@JsonProperty("Name")
	private String name;
	@JsonProperty("IsSP274Applicable")
	private Boolean isSP274Applicable;
	@JsonProperty("Class")
	private String _class;
	@JsonProperty("SubClass")
	private String subClass;
	@JsonProperty("PackagingGroup")
	private String packagingGroup;
	@JsonProperty("SupportedCarriers")
	private List<String> supportedCarriers = null;
	@JsonProperty("IncompatibleClasses")
	private List<String> incompatibleClasses = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public DG() {
	}

	/**
	 * 
	 * @param supportedCarriers
	 * @param isSP274Applicable
	 * @param _class
	 * @param uNNumber
	 * @param incompatibleClasses
	 * @param subClass
	 * @param name
	 * @param packagingGroup
	 */
	public DG(String uNNumber, String name, Boolean isSP274Applicable, String _class, String subClass,
			String packagingGroup, List<String> supportedCarriers, List<String> incompatibleClasses) {
		super();
		this.uNNumber = uNNumber;
		this.name = name;
		this.isSP274Applicable = isSP274Applicable;
		this._class = _class;
		this.subClass = subClass;
		this.packagingGroup = packagingGroup;
		this.supportedCarriers = supportedCarriers;
		this.incompatibleClasses = incompatibleClasses;
	}

	@JsonProperty("UNNumber")
	public String getUNNumber() {
		return uNNumber;
	}

	@JsonProperty("UNNumber")
	public void setUNNumber(String uNNumber) {
		this.uNNumber = uNNumber;
	}

	@JsonProperty("Name")
	public String getName() {
		return name;
	}

	@JsonProperty("Name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("IsSP274Applicable")
	public Boolean getIsSP274Applicable() {
		return isSP274Applicable;
	}

	@JsonProperty("IsSP274Applicable")
	public void setIsSP274Applicable(Boolean isSP274Applicable) {
		this.isSP274Applicable = isSP274Applicable;
	}

	@JsonProperty("Class")
	public String getClass_() {
		return _class;
	}

	@JsonProperty("Class")
	public void setClass_(String _class) {
		this._class = _class;
	}

	@JsonProperty("SubClass")
	public String getSubClass() {
		return subClass;
	}

	@JsonProperty("SubClass")
	public void setSubClass(String subClass) {
		this.subClass = subClass;
	}

	@JsonProperty("PackagingGroup")
	public String getPackagingGroup() {
		return packagingGroup;
	}

	@JsonProperty("PackagingGroup")
	public void setPackagingGroup(String packagingGroup) {
		this.packagingGroup = packagingGroup;
	}

	@JsonProperty("SupportedCarriers")
	public List<String> getSupportedCarriers() {
		return supportedCarriers;
	}

	@JsonProperty("SupportedCarriers")
	public void setSupportedCarriers(List<String> supportedCarriers) {
		this.supportedCarriers = supportedCarriers;
	}

	@JsonProperty("IncompatibleClasses")
	public List<String> getIncompatibleClasses() {
		return incompatibleClasses;
	}

	@JsonProperty("IncompatibleClasses")
	public void setIncompatibleClasses(List<String> incompatibleClasses) {
		this.incompatibleClasses = incompatibleClasses;
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
		return new HashCodeBuilder().append(uNNumber).append(name).append(isSP274Applicable).append(_class)
				.append(subClass).append(packagingGroup).append(supportedCarriers).append(incompatibleClasses)
				.append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof DG) == false) {
			return false;
		}
		DG rhs = ((DG) other);
		return new EqualsBuilder().append(uNNumber, rhs.uNNumber).append(name, rhs.name)
				.append(isSP274Applicable, rhs.isSP274Applicable).append(_class, rhs._class)
				.append(subClass, rhs.subClass).append(packagingGroup, rhs.packagingGroup)
				.append(supportedCarriers, rhs.supportedCarriers).append(incompatibleClasses, rhs.incompatibleClasses)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
