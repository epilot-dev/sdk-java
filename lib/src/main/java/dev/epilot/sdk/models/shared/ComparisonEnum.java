package dev.epilot.sdk.models.shared;


public enum ComparisonEnum {
    EQUALS("equals"),
    ANY_OF("any_of"),
    NOT_EMPTY("not_empty"),
    IS_EMPTY("is_empty");

    public final String value;

    private ComparisonEnum(String value) {
        this.value = value;
    }
}
