package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum FileAttributeTypeEnum {
    IMAGE("image"),
    FILE("file");

    @JsonValue
    public final String value;

    private FileAttributeTypeEnum(String value) {
        this.value = value;
    }
}
