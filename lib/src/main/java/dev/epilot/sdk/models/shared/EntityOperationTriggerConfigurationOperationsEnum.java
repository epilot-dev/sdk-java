package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum EntityOperationTriggerConfigurationOperationsEnum {
    CREATE_ENTITY("createEntity"),
    UPDATE_ENTITY("updateEntity"),
    DELETE_ENTITY("deleteEntity");

    @JsonValue
    public final String value;

    private EntityOperationTriggerConfigurationOperationsEnum(String value) {
        this.value = value;
    }
}
