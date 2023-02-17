package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum NumberAttributeTypeEnum {
    NUMBER("number");

    @JsonValue
    public final String value;

    private NumberAttributeTypeEnum(String value) {
        this.value = value;
    }
}
