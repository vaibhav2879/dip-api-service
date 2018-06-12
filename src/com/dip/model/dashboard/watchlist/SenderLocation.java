
package com.dip.model.dashboard.watchlist;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "addrLine1",
    "addrLine2",
    "state",
    "suburb",
    "country",
    "postCode",
    "poBox",
    "mapLink",
    "fullAddress"
})
public class SenderLocation {

    @JsonProperty("addrLine1")
    private String addrLine1;
    @JsonProperty("addrLine2")
    private String addrLine2;
    @JsonProperty("state")
    private String state;
    @JsonProperty("suburb")
    private String suburb;
    @JsonProperty("country")
    private String country;
    @JsonProperty("postCode")
    private String postCode;
    @JsonProperty("poBox")
    private String poBox;
    @JsonProperty("mapLink")
    private String mapLink;
    @JsonProperty("fullAddress")
    private String fullAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("addrLine1")
    public String getAddrLine1() {
        return addrLine1;
    }

    @JsonProperty("addrLine1")
    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    @JsonProperty("addrLine2")
    public String getAddrLine2() {
        return addrLine2;
    }

    @JsonProperty("addrLine2")
    public void setAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("suburb")
    public String getSuburb() {
        return suburb;
    }

    @JsonProperty("suburb")
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("postCode")
    public String getPostCode() {
        return postCode;
    }

    @JsonProperty("postCode")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @JsonProperty("poBox")
    public String getPoBox() {
        return poBox;
    }

    @JsonProperty("poBox")
    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }

    @JsonProperty("mapLink")
    public String getMapLink() {
        return mapLink;
    }

    @JsonProperty("mapLink")
    public void setMapLink(String mapLink) {
        this.mapLink = mapLink;
    }

    @JsonProperty("fullAddress")
    public String getFullAddress() {
        return fullAddress;
    }

    @JsonProperty("fullAddress")
    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
