package dev.epilot.sdk.models.shared;


public enum RelationAttribute1ModeEnum {
    APPEND("append"),
    PREPEND("prepend"),
    SET("set");

    public final String value;

    private RelationAttribute1ModeEnum(String value) {
        this.value = value;
    }
}
