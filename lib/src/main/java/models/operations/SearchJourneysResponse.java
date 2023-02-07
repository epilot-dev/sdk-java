package .models.operations;


public class SearchJourneysResponse {
    public String contentType;
    public SearchJourneysResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.SearchJourneysResponse searchJourneysResponse;
    public SearchJourneysResponse withSearchJourneysResponse(.models.shared.SearchJourneysResponse searchJourneysResponse) {
        this.searchJourneysResponse = searchJourneysResponse;
        return this;
    }
    public Long statusCode;
    public SearchJourneysResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}