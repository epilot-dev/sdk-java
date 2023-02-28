package dev.epilot.sdk.models.operations;



public class AddRelationsResponse {
    public String contentType;
    public AddRelationsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.epilot.sdk.models.shared.RelationItem relationItem;
    public AddRelationsResponse withRelationItem(dev.epilot.sdk.models.shared.RelationItem relationItem) {
        this.relationItem = relationItem;
        return this;
    }
    
    public Integer statusCode;
    public AddRelationsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
