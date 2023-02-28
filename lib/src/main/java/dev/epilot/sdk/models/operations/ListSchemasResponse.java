package dev.epilot.sdk.models.operations;



public class ListSchemasResponse {
    public String contentType;
    public ListSchemasResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public ListSchemasResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public ListSchemas200ApplicationJSON listSchemas200ApplicationJSONObject;
    public ListSchemasResponse withListSchemas200ApplicationJSONObject(ListSchemas200ApplicationJSON listSchemas200ApplicationJSONObject) {
        this.listSchemas200ApplicationJSONObject = listSchemas200ApplicationJSONObject;
        return this;
    }
    
}
