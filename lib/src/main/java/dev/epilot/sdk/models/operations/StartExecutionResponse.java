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
    
    public Integer statusCode;
    public StartExecutionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
