package dev.epilot.sdk.models.operations;



public class CreateFlowResponse {
    public dev.epilot.sdk.models.shared.AutomationFlow automationFlow;
    public CreateFlowResponse withAutomationFlow(dev.epilot.sdk.models.shared.AutomationFlow automationFlow) {
        this.automationFlow = automationFlow;
        return this;
    }
    
    public String contentType;
    public CreateFlowResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public CreateFlowResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
