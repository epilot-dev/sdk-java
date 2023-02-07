package dev.epilot.sdk.models.shared;


public enum ExecutionStatusEnum {
    PENDING("pending"),
    IN_PROGRESS("in_progress"),
    SUCCESS("success"),
    FAILED("failed"),
    CANCELLED("cancelled");

    public final String value;

    private ExecutionStatusEnum(String value) {
        this.value = value;
    }
}
