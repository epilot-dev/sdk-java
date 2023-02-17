package dev.epilot.sdk.models.operations;



public class GetExecutionResponse {
    public dev.epilot.sdk.models.shared.AutomationExecution automationExecution;
    public GetExecutionResponse withAutomationExecution(dev.epilot.sdk.models.shared.AutomationExecution automationExecution) {
        this.automationExecution = automationExecution;
        return this;
    }
    
    public String contentType;
    public GetExecutionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public GetExecutionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
