package .models.operations;


public class RetriggerActionResponse {
    public String contentType;
    public RetriggerActionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public RetriggerActionResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}