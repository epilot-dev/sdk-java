package dev.epilot.sdk.models.operations;



public class SearchFlowsResponse {
    public String contentType;
    public SearchFlowsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.epilot.sdk.models.shared.SearchAutomationsResp searchAutomationsResp;
    public SearchFlowsResponse withSearchAutomationsResp(dev.epilot.sdk.models.shared.SearchAutomationsResp searchAutomationsResp) {
        this.searchAutomationsResp = searchAutomationsResp;
        return this;
    }
    
    public Integer statusCode;
    public SearchFlowsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
