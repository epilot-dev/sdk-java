package dev.epilot.sdk.models.shared;


public enum EntityOperationOperationEnum {
    CREATE_ENTITY("createEntity"),
    UPDATE_ENTITY("updateEntity"),
    DELETE_ENTITY("deleteEntity");

    public final String value;

    private EntityOperationOperationEnum(String value) {
        this.value = value;
    }
}
