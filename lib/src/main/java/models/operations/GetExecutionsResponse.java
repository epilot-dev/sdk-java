package .models.operations;


public class GetExecutionsResponse {
    public String contentType;
    public GetExecutionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.GetExecutionsResp getExecutionsResp;
    public GetExecutionsResponse withGetExecutionsResp(.models.shared.GetExecutionsResp getExecutionsResp) {
        this.getExecutionsResp = getExecutionsResp;
        return this;
    }
    public Long statusCode;
    public GetExecutionsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}