package dev.epilot.sdk.models.operations;


public class GetRelationsResponse {
    public String contentType;
    public GetRelationsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Object[] getRelationsResp;
    public GetRelationsResponse withGetRelationsResp(Object[] getRelationsResp) {
        this.getRelationsResp = getRelationsResp;
        return this;
    }
    public Long statusCode;
    public GetRelationsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}