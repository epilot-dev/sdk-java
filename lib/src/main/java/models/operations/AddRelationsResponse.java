package .models.operations;


public class AddRelationsResponse {
    public String contentType;
    public AddRelationsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.RelationItem relationItem;
    public AddRelationsResponse withRelationItem(.models.shared.RelationItem relationItem) {
        this.relationItem = relationItem;
        return this;
    }
    public Long statusCode;
    public AddRelationsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}