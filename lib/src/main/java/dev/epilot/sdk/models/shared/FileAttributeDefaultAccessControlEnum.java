package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum FileAttributeDefaultAccessControlEnum {
    PUBLIC_READ("public-read"),
    PRIVATE_("private");

    @JsonValue
    public final String value;

    private FileAttributeDefaultAccessControlEnum(String value) {
        this.value = value;
    }
}
