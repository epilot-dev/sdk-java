package .models.operations;


public class RemoveJourneyRequest {
    public RemoveJourneyPathParams pathParams;
    public RemoveJourneyRequest withPathParams(RemoveJourneyPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}