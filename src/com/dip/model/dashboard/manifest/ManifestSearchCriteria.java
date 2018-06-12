package com.dip.model.dashboard.manifest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ManifestSearchCriteria {
	@JsonProperty("pageNum")
	private int pageNum;
	
	@JsonProperty("searchParam")
	private ManifestSearchParam searchParam;
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public ManifestSearchParam getSearchParam() {
		return searchParam;
	}
	public void setSearchParam(ManifestSearchParam searchParam) {
		this.searchParam = searchParam;
	}
	
	
}
