package dev.epilot.sdk.models.operations;



public class AttachActivityResponse {
    public dev.epilot.sdk.models.shared.ActivityItem activityItem;
    public AttachActivityResponse withActivityItem(dev.epilot.sdk.models.shared.ActivityItem activityItem) {
        this.activityItem = activityItem;
        return this;
    }
    public String contentType;
    public AttachActivityResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public AttachActivityResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
