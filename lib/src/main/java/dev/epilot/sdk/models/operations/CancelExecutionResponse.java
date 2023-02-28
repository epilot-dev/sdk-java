package dev.epilot.sdk.models.operations;



public class CancelExecutionResponse {
    public dev.epilot.sdk.models.shared.AutomationExecution automationExecution;
    public CancelExecutionResponse withAutomationExecution(dev.epilot.sdk.models.shared.AutomationExecution automationExecution) {
        this.automationExecution = automationExecution;
        return this;
    }
    
    public String contentType;
    public CancelExecutionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public CancelExecutionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
