package com.dip.model.dashboard.pickup;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PickupSearchCriteria {
	@JsonProperty("pageNum")
	private int pageNum;
	
	@JsonProperty("searchParam")
	private PickupSearchParam searchParam;
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public PickupSearchParam getSearchParam() {
		return searchParam;
	}
	public void setSearchParam(PickupSearchParam searchParam) {
		this.searchParam = searchParam;
	}
	
	
}
