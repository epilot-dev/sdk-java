package dev.epilot.sdk.models.shared;


public enum MappingAttributeModeEnum {
    COPY_IF_EXISTS("copy_if_exists"),
    APPEND_IF_EXISTS("append_if_exists"),
    SET_VALUE("set_value");

    public final String value;

    private MappingAttributeModeEnum(String value) {
        this.value = value;
    }
}
