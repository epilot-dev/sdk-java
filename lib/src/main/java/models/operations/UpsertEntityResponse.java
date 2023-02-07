package .models.operations;


public class UpsertEntityResponse {
    public String contentType;
    public UpsertEntityResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public java.util.Map<String, Object> entityItem;
    public UpsertEntityResponse withEntityItem(java.util.Map<String, Object> entityItem) {
        this.entityItem = entityItem;
        return this;
    }
    public Long statusCode;
    public UpsertEntityResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}