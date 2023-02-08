package dev.epilot.sdk.models.operations;



public class StartExecutionResponse {
    public dev.epilot.sdk.models.shared.AutomationExecution automationExecution;
    public StartExecutionResponse withAutomationExecution(dev.epilot.sdk.models.shared.AutomationExecution automationExecution) {
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
