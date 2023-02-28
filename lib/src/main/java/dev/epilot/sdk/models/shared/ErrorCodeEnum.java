package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ErrorCodeEnum {
    MAPPING_ERROR("MAPPING_ERROR"),
    REFRESH_RELATIONS_ERROR("REFRESH_RELATIONS_ERROR"),
    DUPLICATE_ENTITY_ERROR("DUPLICATE_ENTITY_ERROR"),
    TRIGGER_WORKFLOW_ERROR("TRIGGER_WORKFLOW_ERROR"),
    TIMEOUT_ERROR("TIMEOUT_ERROR"),
    BAD_CONFIG("BAD_CONFIG"),
    INTERNAL_ERROR("INTERNAL_ERROR");

    @JsonValue
    public final String value;

    private ErrorCodeEnum(String value) {
        this.value = value;
    }
}
