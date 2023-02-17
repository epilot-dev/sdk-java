package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum RelationAttributeRelationAffinityModeEnum {
    WEAK("weak"),
    STRONG("strong");

    @JsonValue
    public final String value;

    private RelationAttributeRelationAffinityModeEnum(String value) {
        this.value = value;
    }
}
