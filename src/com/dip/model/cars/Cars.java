package com.dip.model.cars;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
"Country",
"ManufactureYears",
"Brands"
})
public class Cars {

    @JsonProperty("Country")
    private String country;
    
    @JsonProperty("ManufactureYears")
    private String manufactureYears;
    
    @JsonProperty("Brands")
    private List<Brands> brands;
    
    public void setCountry(String country) {
         this.country = country;
     }
     public String getCountry() {
         return country;
     }

    public void setManufactureYears(String manufactureYears) {
         this.manufactureYears = manufactureYears;
     }
     public String getManufactureYears() {
         return manufactureYears;
     }

    public void setBrands(List<Brands> brands) {
         this.brands = brands;
     }
     public List<Brands> getBrands() {
         return brands;
     }

}