package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ExecutionStatusEnum {
    PENDING("pending"),
    IN_PROGRESS("in_progress"),
    SUCCESS("success"),
    FAILED("failed"),
    CANCELLED("cancelled");

    @JsonValue
    public final String value;

    private ExecutionStatusEnum(String value) {
        this.value = value;
    }
}
