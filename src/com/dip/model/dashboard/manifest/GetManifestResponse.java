package com.dip.model.dashboard.manifest;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"pageNo",
"totalPages",
"manifests"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetManifestResponse {

@JsonProperty("pageNo")
private Integer pageNo;

@JsonProperty("count")
private Integer count;

@JsonProperty("Manifests")
private List<Manifest> manifests = null;

public Integer getPageNo() {
return pageNo;
}

public void setPageNo(Integer pageNo) {
this.pageNo = pageNo;
}

public Integer getCount() {
return count;
}

public void setCount(Integer count) {
this.count = count;
}

public List<Manifest> getManifests() {
return manifests;
}

public void setManifests(List<Manifest> manifests) {
this.manifests = manifests;
}
}
