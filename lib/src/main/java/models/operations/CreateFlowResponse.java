package .models.operations;


public class CreateFlowResponse {
    public .models.shared.AutomationFlow automationFlow;
    public CreateFlowResponse withAutomationFlow(.models.shared.AutomationFlow automationFlow) {
        this.automationFlow = automationFlow;
        return this;
    }
    public String contentType;
    public CreateFlowResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public CreateFlowResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}