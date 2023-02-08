package dev.epilot.sdk.models.operations;



public class CreateActivityResponse {
    public dev.epilot.sdk.models.shared.ActivityItem activityItem;
    public CreateActivityResponse withActivityItem(dev.epilot.sdk.models.shared.ActivityItem activityItem) {
        this.activityItem = activityItem;
        return this;
    }
    public String contentType;
    public CreateActivityResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public CreateActivityResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
