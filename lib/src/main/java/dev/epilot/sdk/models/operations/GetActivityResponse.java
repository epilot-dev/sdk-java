package dev.epilot.sdk.models.operations;


public class GetActivityResponse {
    public dev.epilot.sdk.models.shared.ActivityItem activityItem;
    public GetActivityResponse withActivityItem(dev.epilot.sdk.models.shared.ActivityItem activityItem) {
        this.activityItem = activityItem;
        return this;
    }
    public String contentType;
    public GetActivityResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetActivityResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}