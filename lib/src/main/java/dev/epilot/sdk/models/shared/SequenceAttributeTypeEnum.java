package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SequenceAttributeTypeEnum {
    SEQUENCE("sequence");

    @JsonValue
    public final String value;

    private SequenceAttributeTypeEnum(String value) {
        this.value = value;
    }
}
