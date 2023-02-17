package dev.epilot.sdk.models.operations;



public class SearchEntitiesResponse {
    public String contentType;
    public SearchEntitiesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.epilot.sdk.models.shared.EntitySearchResults entitySearchResults;
    public SearchEntitiesResponse withEntitySearchResults(dev.epilot.sdk.models.shared.EntitySearchResults entitySearchResults) {
        this.entitySearchResults = entitySearchResults;
        return this;
    }
    
    public Integer statusCode;
    public SearchEntitiesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public String searchEntities200TextCsvString;
    public SearchEntitiesResponse withSearchEntities200TextCsvString(String searchEntities200TextCsvString) {
        this.searchEntities200TextCsvString = searchEntities200TextCsvString;
        return this;
    }
    
}
