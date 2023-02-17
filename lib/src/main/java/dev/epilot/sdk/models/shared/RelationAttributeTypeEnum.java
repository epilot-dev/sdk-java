package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum RelationAttributeTypeEnum {
    RELATION("relation");

    @JsonValue
    public final String value;

    private RelationAttributeTypeEnum(String value) {
        this.value = value;
    }
}
