package dev.epilot.sdk.models.operations;



public class UpdateClassificationsForTaxonomyResponse {
    public String contentType;
    public UpdateClassificationsForTaxonomyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public UpdateClassificationsForTaxonomyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public UpdateClassificationsForTaxonomy200ApplicationJSON updateClassificationsForTaxonomy200ApplicationJSONObject;
    public UpdateClassificationsForTaxonomyResponse withUpdateClassificationsForTaxonomy200ApplicationJSONObject(UpdateClassificationsForTaxonomy200ApplicationJSON updateClassificationsForTaxonomy200ApplicationJSONObject) {
        this.updateClassificationsForTaxonomy200ApplicationJSONObject = updateClassificationsForTaxonomy200ApplicationJSONObject;
        return this;
    }
    
}
