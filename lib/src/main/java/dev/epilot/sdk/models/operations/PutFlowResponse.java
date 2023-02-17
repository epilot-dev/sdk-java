package dev.epilot.sdk.models.operations;



public class PutFlowResponse {
    public dev.epilot.sdk.models.shared.AutomationFlow automationFlow;
    public PutFlowResponse withAutomationFlow(dev.epilot.sdk.models.shared.AutomationFlow automationFlow) {
        this.automationFlow = automationFlow;
        return this;
    }
    
    public String contentType;
    public PutFlowResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public PutFlowResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
