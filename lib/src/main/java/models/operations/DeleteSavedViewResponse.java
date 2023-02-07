package .models.operations;


public class DeleteSavedViewResponse {
    public String contentType;
    public DeleteSavedViewResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteSavedViewResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}