package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum MultiSelectAttributeTypeEnum {
    MULTISELECT("multiselect"),
    CHECKBOX("checkbox");

    @JsonValue
    public final String value;

    private MultiSelectAttributeTypeEnum(String value) {
        this.value = value;
    }
}
