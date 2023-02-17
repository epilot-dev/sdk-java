package dev.epilot.sdk.models.operations;



public class GetEntityActivityFeedResponse {
    public String contentType;
    public GetEntityActivityFeedResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public GetEntityActivityFeedResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public GetEntityActivityFeed200ApplicationJSON getEntityActivityFeed200ApplicationJSONObject;
    public GetEntityActivityFeedResponse withGetEntityActivityFeed200ApplicationJSONObject(GetEntityActivityFeed200ApplicationJSON getEntityActivityFeed200ApplicationJSONObject) {
        this.getEntityActivityFeed200ApplicationJSONObject = getEntityActivityFeed200ApplicationJSONObject;
        return this;
    }
    
}
