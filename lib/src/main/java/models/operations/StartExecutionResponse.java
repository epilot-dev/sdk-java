package .models.operations;


public class StartExecutionResponse {
    public .models.shared.AutomationExecution automationExecution;
    public StartExecutionResponse withAutomationExecution(.models.shared.AutomationExecution automationExecution) {
        this.automationExecution = automationExecution;
        return this;
    }
    public String contentType;
    public StartExecutionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public StartExecutionResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}