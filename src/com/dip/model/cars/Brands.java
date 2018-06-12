package com.dip.model.cars;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Brands {

    @JsonProperty("brandId")
    private String brandId;
    
    @JsonProperty("brandName")
    private String brandName;
    
    @JsonProperty("Model")
    private List<Model> model;
    
    public void setBrandId(String brandId) {
         this.brandId = brandId;
     }
     public String getBrandId() {
         return brandId;
     }

    public void setBrandName(String brandName) {
         this.brandName = brandName;
     }
     public String getBrandName() {
         return brandName;
     }
     
    @JsonProperty("Model")
    public void setModel(List<Model> model) {
         this.model = model;
     }
     public List<Model> getModel() {
         return model;
     }

}