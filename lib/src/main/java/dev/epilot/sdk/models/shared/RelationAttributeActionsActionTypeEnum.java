package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum RelationAttributeActionsActionTypeEnum {
    ADD_EXISTING("add_existing"),
    CREATE_NEW("create_new"),
    CREATE_FROM_EXISTING("create_from_existing");

    @JsonValue
    public final String value;

    private RelationAttributeActionsActionTypeEnum(String value) {
        this.value = value;
    }
}
