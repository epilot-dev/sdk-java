package dev.epilot.sdk.models.operations;



public class GetSavedViewRequest {
    public GetSavedViewPathParams pathParams;
    public GetSavedViewRequest withPathParams(GetSavedViewPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}
