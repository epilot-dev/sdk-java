package dev.epilot.sdk.models.operations;



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
    public GetSavedView200ApplicationJSON getSavedView200ApplicationJSONObject;
    public GetSavedViewResponse withGetSavedView200ApplicationJSONObject(GetSavedView200ApplicationJSON getSavedView200ApplicationJSONObject) {
        this.getSavedView200ApplicationJSONObject = getSavedView200ApplicationJSONObject;
        return this;
    }
}
