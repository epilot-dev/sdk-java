package .models.operations;


public class PutFlowResponse {
    public .models.shared.AutomationFlow automationFlow;
    public PutFlowResponse withAutomationFlow(.models.shared.AutomationFlow automationFlow) {
        this.automationFlow = automationFlow;
        return this;
    }
    public String contentType;
    public PutFlowResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PutFlowResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}