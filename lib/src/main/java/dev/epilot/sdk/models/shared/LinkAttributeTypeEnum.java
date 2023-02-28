package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum LinkAttributeTypeEnum {
    LINK("link");

    @JsonValue
    public final String value;

    private LinkAttributeTypeEnum(String value) {
        this.value = value;
    }
}
