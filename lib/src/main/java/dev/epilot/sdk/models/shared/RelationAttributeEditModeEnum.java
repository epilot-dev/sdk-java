package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum RelationAttributeEditModeEnum {
    LIST_VIEW("list-view");

    @JsonValue
    public final String value;

    private RelationAttributeEditModeEnum(String value) {
        this.value = value;
    }
}
