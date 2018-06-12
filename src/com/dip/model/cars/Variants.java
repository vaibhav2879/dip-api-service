package com.dip.model.cars;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Variants {

    @JsonProperty("variantId")
    private String variantId;
    
    @JsonProperty("variantName")
    private String variantName;
    
    @JsonProperty("fuelType")
    private String fuelType;
    
    public void setVariantId(String variantId) {
         this.variantId = variantId;
     }
     public String getVariantId() {
         return variantId;
     }

    public void setVariantName(String variantName) {
         this.variantName = variantName;
     }
     public String getVariantName() {
         return variantName;
     }

    public void setFuelType(String fuelType) {
         this.fuelType = fuelType;
     }
     public String getFuelType() {
         return fuelType;
     }

}