package .models.operations;


public class GetSavedViewResponse {
    public String contentType;
    public GetSavedViewResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetSavedViewResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public GetSavedView200ApplicationJson getSavedView200ApplicationJSONObject;
    public GetSavedViewResponse withGetSavedView200ApplicationJsonObject(GetSavedView200ApplicationJson getSavedView200ApplicationJSONObject) {
        this.getSavedView200ApplicationJSONObject = getSavedView200ApplicationJSONObject;
        return this;
    }
}