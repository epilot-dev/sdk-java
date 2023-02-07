package .models.operations;


public class GetExecutionResponse {
    public .models.shared.AutomationExecution automationExecution;
    public GetExecutionResponse withAutomationExecution(.models.shared.AutomationExecution automationExecution) {
        this.automationExecution = automationExecution;
        return this;
    }
    public String contentType;
    public GetExecutionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetExecutionResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}