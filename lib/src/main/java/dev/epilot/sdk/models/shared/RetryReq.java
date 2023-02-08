package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RetryReq {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("retry_strategy")
    public RetryStrategyEnum retryStrategy;
    public RetryReq withRetryStrategy(RetryStrategyEnum retryStrategy) {
        this.retryStrategy = retryStrategy;
        return this;
    }
}
