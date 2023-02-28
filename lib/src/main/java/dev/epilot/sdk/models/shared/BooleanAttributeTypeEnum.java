package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum BooleanAttributeTypeEnum {
    BOOLEAN_("boolean");

    @JsonValue
    public final String value;

    private BooleanAttributeTypeEnum(String value) {
        this.value = value;
    }
}
