package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum TextAttributeTypeEnum {
    STRING("string");

    @JsonValue
    public final String value;

    private TextAttributeTypeEnum(String value) {
        this.value = value;
    }
}
