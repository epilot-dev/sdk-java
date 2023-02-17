package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorOutput {
    @JsonProperty("error_code")
    public ErrorCodeEnum errorCode;
    public ErrorOutput withErrorCode(ErrorCodeEnum errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    
    @JsonProperty("error_reason")
    public String errorReason;
    public ErrorOutput withErrorReason(String errorReason) {
        this.errorReason = errorReason;
        return this;
    }
    
}
