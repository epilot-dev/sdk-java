package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum RelationAttributeRelationTypeEnum {
    HAS_MANY("has_many"),
    HAS_ONE("has_one");

    @JsonValue
    public final String value;

    private RelationAttributeRelationTypeEnum(String value) {
        this.value = value;
    }
}
