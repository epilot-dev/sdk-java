package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum InternalUserAttributeTypeEnum {
    INTERNAL_USER("internal_user");

    @JsonValue
    public final String value;

    private InternalUserAttributeTypeEnum(String value) {
        this.value = value;
    }
}
