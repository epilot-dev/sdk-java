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
    
    public Integer statusCode;
    public AttachActivityResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
