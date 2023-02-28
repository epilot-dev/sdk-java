package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ComputedAttributeTypeEnum {
    COMPUTED("computed");

    @JsonValue
    public final String value;

    private ComputedAttributeTypeEnum(String value) {
        this.value = value;
    }
}
