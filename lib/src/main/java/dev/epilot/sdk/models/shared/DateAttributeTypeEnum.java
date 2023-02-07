package dev.epilot.sdk.models.shared;


public enum DateAttributeTypeEnum {
    DATE("date"),
    DATETIME("datetime");

    public final String value;

    private DateAttributeTypeEnum(String value) {
        this.value = value;
    }
}
