package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum EntityManualTriggerTypeEnum {
    ENTITY_MANUAL("entity_manual");

    @JsonValue
    public final String value;

    private EntityManualTriggerTypeEnum(String value) {
        this.value = value;
    }
}
