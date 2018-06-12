package com.dip.model.dashboard.pickup;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"count",
"Pickups"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetPickupResponse {

@JsonProperty("count")
private Integer count;

@JsonProperty("Pickups")
private List<MypickUp> pickups = null;

public Integer getCount() {
return count;
}

public void setCount(Integer count) {
this.count = count;
}

public List<MypickUp> getPickups() {
return pickups;
}

public void setPickups(List<MypickUp> pickups) {
this.pickups = pickups;
}
}
