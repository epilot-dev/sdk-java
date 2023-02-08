package dev.epilot.sdk.models.operations;



public class ListTaxonomiesResponse {
    public String contentType;
    public ListTaxonomiesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public ListTaxonomiesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public ListTaxonomies200ApplicationJSON listTaxonomies200ApplicationJSONObject;
    public ListTaxonomiesResponse withListTaxonomies200ApplicationJSONObject(ListTaxonomies200ApplicationJSON listTaxonomies200ApplicationJSONObject) {
        this.listTaxonomies200ApplicationJSONObject = listTaxonomies200ApplicationJSONObject;
        return this;
    }
}
