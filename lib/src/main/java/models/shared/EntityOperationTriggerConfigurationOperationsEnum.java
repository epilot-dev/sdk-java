package .models.shared;


public enum EntityOperationTriggerConfigurationOperationsEnum {
    CREATE_ENTITY("createEntity"),
    UPDATE_ENTITY("updateEntity"),
    DELETE_ENTITY("deleteEntity");

    public final String value;

    private EntityOperationTriggerConfigurationOperationsEnum(String value) {
        this.value = value;
    }
}
