package dev.epilot.sdk.models.operations;



public class AttachActivityRequest {
    public AttachActivityPathParams pathParams;
    public AttachActivityRequest withPathParams(AttachActivityPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public AttachActivityQueryParams queryParams;
    public AttachActivityRequest withQueryParams(AttachActivityQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}
