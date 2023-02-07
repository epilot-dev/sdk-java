package .models.operations;


public class SearchEntitiesResponse {
    public String contentType;
    public SearchEntitiesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.EntitySearchResults entitySearchResults;
    public SearchEntitiesResponse withEntitySearchResults(.models.shared.EntitySearchResults entitySearchResults) {
        this.entitySearchResults = entitySearchResults;
        return this;
    }
    public Long statusCode;
    public SearchEntitiesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public String searchEntities200TextCsvString;
    public SearchEntitiesResponse withSearchEntities200TextCsvString(String searchEntities200TextCsvString) {
        this.searchEntities200TextCsvString = searchEntities200TextCsvString;
        return this;
    }
}