package dev.epilot.sdk.models.operations;



public class TaxonomyAutocompleteResponse {
    public String contentType;
    public TaxonomyAutocompleteResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public TaxonomyAutocompleteResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public TaxonomyAutocomplete200ApplicationJSON taxonomyAutocomplete200ApplicationJSONObject;
    public TaxonomyAutocompleteResponse withTaxonomyAutocomplete200ApplicationJSONObject(TaxonomyAutocomplete200ApplicationJSON taxonomyAutocomplete200ApplicationJSONObject) {
        this.taxonomyAutocomplete200ApplicationJSONObject = taxonomyAutocomplete200ApplicationJSONObject;
        return this;
    }
}
