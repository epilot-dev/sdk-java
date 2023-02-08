package dev.epilot.sdk.models.operations;



public class ListTaxonomyClassificationsForSchemaResponse {
    public String contentType;
    public ListTaxonomyClassificationsForSchemaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public ListTaxonomyClassificationsForSchemaResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public ListTaxonomyClassificationsForSchema200ApplicationJSON listTaxonomyClassificationsForSchema200ApplicationJSONObject;
    public ListTaxonomyClassificationsForSchemaResponse withListTaxonomyClassificationsForSchema200ApplicationJSONObject(ListTaxonomyClassificationsForSchema200ApplicationJSON listTaxonomyClassificationsForSchema200ApplicationJSONObject) {
        this.listTaxonomyClassificationsForSchema200ApplicationJSONObject = listTaxonomyClassificationsForSchema200ApplicationJSONObject;
        return this;
    }
}
