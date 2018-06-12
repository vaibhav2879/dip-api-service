package com.dip.model.common;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author HCL
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SuccessResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private Boolean issuccess;

	@JsonProperty("success")
	public Boolean getIssuccess() {
		return issuccess;
	}

	public void setIssuccess(Boolean issuccess) {
		this.issuccess = issuccess;
	}

	@Override
	public String toString() {
		return "SuccessResponse [issuccess=" + issuccess + "]";
	}
}