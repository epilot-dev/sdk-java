package .models.operations;


public class DeleteFlowResponse {
    public .models.shared.AutomationFlow automationFlow;
    public DeleteFlowResponse withAutomationFlow(.models.shared.AutomationFlow automationFlow) {
        this.automationFlow = automationFlow;
        return this;
    }
    public String contentType;
    public DeleteFlowResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteFlowResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}