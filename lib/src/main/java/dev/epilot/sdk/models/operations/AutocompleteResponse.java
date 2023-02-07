package dev.epilot.sdk.models.operations;


public class AutocompleteResponse {
    public String contentType;
    public AutocompleteResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public AutocompleteResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Autocomplete200ApplicationJson autocomplete200ApplicationJSONObject;
    public AutocompleteResponse withAutocomplete200ApplicationJsonObject(Autocomplete200ApplicationJson autocomplete200ApplicationJSONObject) {
        this.autocomplete200ApplicationJSONObject = autocomplete200ApplicationJSONObject;
        return this;
    }
}