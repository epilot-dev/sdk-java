package dev.epilot.sdk.models.operations;



public class TaxonomiesClassificationsSearchResponse {
    public String contentType;
    public TaxonomiesClassificationsSearchResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public TaxonomiesClassificationsSearchResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public TaxonomiesClassificationsSearch200ApplicationJSON taxonomiesClassificationsSearch200ApplicationJSONObject;
    public TaxonomiesClassificationsSearchResponse withTaxonomiesClassificationsSearch200ApplicationJSONObject(TaxonomiesClassificationsSearch200ApplicationJSON taxonomiesClassificationsSearch200ApplicationJSONObject) {
        this.taxonomiesClassificationsSearch200ApplicationJSONObject = taxonomiesClassificationsSearch200ApplicationJSONObject;
        return this;
    }
    
}
