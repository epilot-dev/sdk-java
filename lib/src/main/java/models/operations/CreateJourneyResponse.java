package .models.operations;


public class CreateJourneyResponse {
    public String contentType;
    public CreateJourneyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public java.util.Map<String, Object> journeyResponse;
    public CreateJourneyResponse withJourneyResponse(java.util.Map<String, Object> journeyResponse) {
        this.journeyResponse = journeyResponse;
        return this;
    }
    public Long statusCode;
    public CreateJourneyResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}