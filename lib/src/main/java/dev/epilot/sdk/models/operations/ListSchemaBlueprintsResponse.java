package dev.epilot.sdk.models.operations;



public class ListSchemaBlueprintsResponse {
    public String contentType;
    public ListSchemaBlueprintsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public ListSchemaBlueprintsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public ListSchemaBlueprints200ApplicationJSON listSchemaBlueprints200ApplicationJSONObject;
    public ListSchemaBlueprintsResponse withListSchemaBlueprints200ApplicationJSONObject(ListSchemaBlueprints200ApplicationJSON listSchemaBlueprints200ApplicationJSONObject) {
        this.listSchemaBlueprints200ApplicationJSONObject = listSchemaBlueprints200ApplicationJSONObject;
        return this;
    }
    
}
