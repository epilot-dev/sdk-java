package .models.operations;


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
    public TaxonomyAutocomplete200ApplicationJson taxonomyAutocomplete200ApplicationJSONObject;
    public TaxonomyAutocompleteResponse withTaxonomyAutocomplete200ApplicationJsonObject(TaxonomyAutocomplete200ApplicationJson taxonomyAutocomplete200ApplicationJSONObject) {
        this.taxonomyAutocomplete200ApplicationJSONObject = taxonomyAutocomplete200ApplicationJSONObject;
        return this;
    }
}