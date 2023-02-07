package .models.operations;


public class GetActivityResponse {
    public .models.shared.ActivityItem activityItem;
    public GetActivityResponse withActivityItem(.models.shared.ActivityItem activityItem) {
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