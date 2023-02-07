package .models.operations;


public class GetEntityResponse {
    public String contentType;
    public GetEntityResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetEntityResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public GetEntity200ApplicationJson getEntity200ApplicationJSONObject;
    public GetEntityResponse withGetEntity200ApplicationJsonObject(GetEntity200ApplicationJson getEntity200ApplicationJSONObject) {
        this.getEntity200ApplicationJSONObject = getEntity200ApplicationJSONObject;
        return this;
    }
}