package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum UserRelationAttributeTypeEnum {
    RELATION_USER("relation_user");

    @JsonValue
    public final String value;

    private UserRelationAttributeTypeEnum(String value) {
        this.value = value;
    }
}
