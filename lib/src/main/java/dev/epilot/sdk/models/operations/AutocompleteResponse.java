package dev.epilot.sdk.models.operations;



public class AutocompleteResponse {
    public String contentType;
    public AutocompleteResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public AutocompleteResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public Autocomplete200ApplicationJSON autocomplete200ApplicationJSONObject;
    public AutocompleteResponse withAutocomplete200ApplicationJSONObject(Autocomplete200ApplicationJSON autocomplete200ApplicationJSONObject) {
        this.autocomplete200ApplicationJSONObject = autocomplete200ApplicationJSONObject;
        return this;
    }
    
}
