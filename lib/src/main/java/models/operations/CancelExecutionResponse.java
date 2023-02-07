package .models.operations;


public class CancelExecutionResponse {
    public .models.shared.AutomationExecution automationExecution;
    public CancelExecutionResponse withAutomationExecution(.models.shared.AutomationExecution automationExecution) {
        this.automationExecution = automationExecution;
        return this;
    }
    public String contentType;
    public CancelExecutionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public CancelExecutionResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}