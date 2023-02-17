package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum EntityOperationTriggerTypeEnum {
    ENTITY_OPERATION("entity_operation");

    @JsonValue
    public final String value;

    private EntityOperationTriggerTypeEnum(String value) {
        this.value = value;
    }
}
