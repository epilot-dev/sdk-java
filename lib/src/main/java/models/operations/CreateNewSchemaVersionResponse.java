package .models.operations;


public class CreateNewSchemaVersionResponse {
    public String contentType;
    public CreateNewSchemaVersionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.EntitySchemaItem entitySchemaItem;
    public CreateNewSchemaVersionResponse withEntitySchemaItem(.models.shared.EntitySchemaItem entitySchemaItem) {
        this.entitySchemaItem = entitySchemaItem;
        return this;
    }
    public Long statusCode;
    public CreateNewSchemaVersionResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}