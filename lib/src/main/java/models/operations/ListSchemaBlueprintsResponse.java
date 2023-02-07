package .models.operations;


public class ListSchemaBlueprintsResponse {
    public String contentType;
    public ListSchemaBlueprintsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public ListSchemaBlueprintsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public ListSchemaBlueprints200ApplicationJson listSchemaBlueprints200ApplicationJSONObject;
    public ListSchemaBlueprintsResponse withListSchemaBlueprints200ApplicationJsonObject(ListSchemaBlueprints200ApplicationJson listSchemaBlueprints200ApplicationJSONObject) {
        this.listSchemaBlueprints200ApplicationJSONObject = listSchemaBlueprints200ApplicationJSONObject;
        return this;
    }
}