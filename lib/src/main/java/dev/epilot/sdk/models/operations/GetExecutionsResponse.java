package dev.epilot.sdk.models.operations;



public class GetExecutionsResponse {
    public String contentType;
    public GetExecutionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.epilot.sdk.models.shared.GetExecutionsResp getExecutionsResp;
    public GetExecutionsResponse withGetExecutionsResp(dev.epilot.sdk.models.shared.GetExecutionsResp getExecutionsResp) {
        this.getExecutionsResp = getExecutionsResp;
        return this;
    }
    
    public Integer statusCode;
    public GetExecutionsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
