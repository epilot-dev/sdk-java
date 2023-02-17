package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum RetryStrategyEnum {
    RETRY_AND_RESUME("RETRY_AND_RESUME"),
    RETRY_AND_STOP("RETRY_AND_STOP");

    @JsonValue
    public final String value;

    private RetryStrategyEnum(String value) {
        this.value = value;
    }
}
