package dev.epilot.sdk.models.operations;



public class DeleteFlowResponse {
    public dev.epilot.sdk.models.shared.AutomationFlow automationFlow;
    public DeleteFlowResponse withAutomationFlow(dev.epilot.sdk.models.shared.AutomationFlow automationFlow) {
        this.automationFlow = automationFlow;
        return this;
    }
    
    public String contentType;
    public DeleteFlowResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public DeleteFlowResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
