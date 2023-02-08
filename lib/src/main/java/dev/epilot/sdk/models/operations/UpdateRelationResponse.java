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
    public Long statusCode;
    public UpdateRelationResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
