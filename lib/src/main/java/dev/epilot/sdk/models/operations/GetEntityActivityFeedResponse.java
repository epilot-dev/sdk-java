package dev.epilot.sdk.models.operations;


public class GetEntityActivityFeedResponse {
    public String contentType;
    public GetEntityActivityFeedResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetEntityActivityFeedResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public GetEntityActivityFeed200ApplicationJson getEntityActivityFeed200ApplicationJSONObject;
    public GetEntityActivityFeedResponse withGetEntityActivityFeed200ApplicationJsonObject(GetEntityActivityFeed200ApplicationJson getEntityActivityFeed200ApplicationJSONObject) {
        this.getEntityActivityFeed200ApplicationJSONObject = getEntityActivityFeed200ApplicationJSONObject;
        return this;
    }
}