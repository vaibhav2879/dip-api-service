
package com.dip.model.dashboard.watchlist;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Object"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class WatchListConsignment implements Serializable{

	private static final long serialVersionUID = -7138406606386123321L;
	
	@JsonProperty("Object")
    private String Object;
	
	/*@JsonProperty("WatchId")
    private String WatchId;
    @JsonProperty("UserId")
    private String UserId;
    @JsonProperty("LoginId")
    private String LoginId;
    @JsonProperty("SubscriptionId")
    private String SubscriptionId;
    
    @JsonProperty("ObjectType")
    private String ObjectType;
    @JsonProperty("ActivationTime")
    private String ActivationTime;
    @JsonProperty("ExpirationTime")
    private String ExpirationTime;
    @JsonProperty("Payload")
    private String Payload;
    @JsonProperty("Status")
    private String Status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();*/
    
	
	@JsonProperty("Object")
	public String getObject() {
		return Object;
	}
    @JsonProperty("Object")
	public void setObject(String object) {
		Object = object;
	}
    
    /*@JsonProperty("WatchId")
    public String getWatchId() {
		return WatchId;
	}
    @JsonProperty("WatchId")
	public void setWatchId(String watchId) {
		WatchId = watchId;
	}
    @JsonProperty("UserId")
	public String getUserId() {
		return UserId;
	}
    @JsonProperty("UserId")
	public void setUserId(String userId) {
		UserId = userId;
	}
    @JsonProperty("LoginId")
	public String getLoginId() {
		return LoginId;
	}
    @JsonProperty("LoginId")
	public void setLoginId(String loginId) {
		LoginId = loginId;
	}
    @JsonProperty("SubscriptionId")
	public String getSubscriptionId() {
		return SubscriptionId;
	}
    @JsonProperty("SubscriptionId")
	public void setSubscriptionId(String subscriptionId) {
		SubscriptionId = subscriptionId;
	}
    
    @JsonProperty("ObjectType")
	public String getObjectType() {
		return ObjectType;
	}
    @JsonProperty("ObjectType")
	public void setObjectType(String objectType) {
		ObjectType = objectType;
	}
    @JsonProperty("ActivationTime")
	public String getActivationTime() {
		return ActivationTime;
	}
    @JsonProperty("ActivationTime")
	public void setActivationTime(String activationTime) {
		ActivationTime = activationTime;
	}
    @JsonProperty("ExpirationTime")
	public String getExpirationTime() {
		return ExpirationTime;
	}
    @JsonProperty("ExpirationTime")
	public void setExpirationTime(String expirationTime) {
		ExpirationTime = expirationTime;
	}
    @JsonProperty("Payload")
	public String getPayload() {
		return Payload;
	}
    @JsonProperty("Payload")
	public void setPayload(String payload) {
		Payload = payload;
	}
    @JsonProperty("Status")
	public String getStatus() {
		return Status;
	}
    @JsonProperty("Status")
	public void setStatus(String status) {
		Status = status;
	}

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }*/

}
