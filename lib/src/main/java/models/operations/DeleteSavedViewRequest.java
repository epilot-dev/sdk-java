package .models.operations;


public class DeleteSavedViewRequest {
    public DeleteSavedViewPathParams pathParams;
    public DeleteSavedViewRequest withPathParams(DeleteSavedViewPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}