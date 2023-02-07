package .models.operations;


public class ListSchemasResponse {
    public String contentType;
    public ListSchemasResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public ListSchemasResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public ListSchemas200ApplicationJson listSchemas200ApplicationJSONObject;
    public ListSchemasResponse withListSchemas200ApplicationJsonObject(ListSchemas200ApplicationJson listSchemas200ApplicationJSONObject) {
        this.listSchemas200ApplicationJSONObject = listSchemas200ApplicationJSONObject;
        return this;
    }
}