package dev.epilot.sdk.models.operations;



public class UpdateRelationResponse {
    public String contentType;
    public UpdateRelationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.epilot.sdk.models.shared.RelationItem relationItem;
    public UpdateRelationResponse withRelationItem(dev.epilot.sdk.models.shared.RelationItem relationItem) {
        this.relationItem = relationItem;
        return this;
    }
    
    public Integer statusCode;
    public UpdateRelationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
