package dev.epilot.sdk.models.operations;



public class SearchJourneysResponse {
    public String contentType;
    public SearchJourneysResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.epilot.sdk.models.shared.SearchJourneysResponse searchJourneysResponse;
    public SearchJourneysResponse withSearchJourneysResponse(dev.epilot.sdk.models.shared.SearchJourneysResponse searchJourneysResponse) {
        this.searchJourneysResponse = searchJourneysResponse;
        return this;
    }
    public Long statusCode;
    public SearchJourneysResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
