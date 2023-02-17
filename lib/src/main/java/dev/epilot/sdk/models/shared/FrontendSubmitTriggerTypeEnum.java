package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum FrontendSubmitTriggerTypeEnum {
    FRONTEND_SUBMISSION("frontend_submission");

    @JsonValue
    public final String value;

    private FrontendSubmitTriggerTypeEnum(String value) {
        this.value = value;
    }
}
