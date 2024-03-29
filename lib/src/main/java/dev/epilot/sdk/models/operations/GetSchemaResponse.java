package dev.epilot.sdk.models.operations;



public class GetSchemaResponse {
    public String contentType;
    public GetSchemaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.epilot.sdk.models.shared.EntitySchemaItem entitySchemaItem;
    public GetSchemaResponse withEntitySchemaItem(dev.epilot.sdk.models.shared.EntitySchemaItem entitySchemaItem) {
        this.entitySchemaItem = entitySchemaItem;
        return this;
    }
    
    public Integer statusCode;
    public GetSchemaResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
