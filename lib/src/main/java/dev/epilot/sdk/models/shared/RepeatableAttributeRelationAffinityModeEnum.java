package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum RepeatableAttributeRelationAffinityModeEnum {
    WEAK("weak"),
    STRONG("strong");

    @JsonValue
    public final String value;

    private RepeatableAttributeRelationAffinityModeEnum(String value) {
        this.value = value;
    }
}
