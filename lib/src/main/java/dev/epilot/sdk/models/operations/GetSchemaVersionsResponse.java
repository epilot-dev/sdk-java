package dev.epilot.sdk.models.operations;



public class GetSchemaVersionsResponse {
    public String contentType;
    public GetSchemaVersionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetSchemaVersionsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public GetSchemaVersions200ApplicationJSON getSchemaVersions200ApplicationJSONObject;
    public GetSchemaVersionsResponse withGetSchemaVersions200ApplicationJSONObject(GetSchemaVersions200ApplicationJSON getSchemaVersions200ApplicationJSONObject) {
        this.getSchemaVersions200ApplicationJSONObject = getSchemaVersions200ApplicationJSONObject;
        return this;
    }
}
