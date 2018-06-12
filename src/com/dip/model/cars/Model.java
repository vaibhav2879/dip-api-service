package com.dip.model.cars;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Model {

    @JsonProperty("ModelId")
    private String modelId;
    
    @JsonProperty("ModelName")
    private String modelName;
    
    @JsonProperty("Variants")
    private List<Variants> variants;
    
    public void setModelId(String modelId) {
         this.modelId = modelId;
     }
     public String getModelId() {
         return modelId;
     }

    public void setModelName(String modelName) {
         this.modelName = modelName;
     }
     public String getModelName() {
         return modelName;
     }

    public void setVariants(List<Variants> variants) {
         this.variants = variants;
     }
     public List<Variants> getVariants() {
         return variants;
     }

}