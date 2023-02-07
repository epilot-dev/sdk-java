package dev.epilot.sdk.models.operations;


public class GetFlowResponse {
    public dev.epilot.sdk.models.shared.AutomationFlow automationFlow;
    public GetFlowResponse withAutomationFlow(dev.epilot.sdk.models.shared.AutomationFlow automationFlow) {
        this.automationFlow = automationFlow;
        return this;
    }
    public String contentType;
    public GetFlowResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetFlowResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}