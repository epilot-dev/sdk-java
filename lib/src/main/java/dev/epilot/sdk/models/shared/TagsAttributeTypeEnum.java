package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum TagsAttributeTypeEnum {
    TAGS("tags");

    @JsonValue
    public final String value;

    private TagsAttributeTypeEnum(String value) {
        this.value = value;
    }
}
