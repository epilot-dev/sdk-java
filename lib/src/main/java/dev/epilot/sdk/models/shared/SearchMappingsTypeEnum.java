package dev.epilot.sdk.models.shared;


public enum SearchMappingsTypeEnum {
    KEYWORD("keyword"),
    TEXT("text"),
    BOOLEAN_("boolean"),
    INTEGER("integer"),
    LONG_("long"),
    FLOAT("float"),
    DATE("date"),
    FLATTENED("flattened"),
    NESTED("nested");

    public final String value;

    private SearchMappingsTypeEnum(String value) {
        this.value = value;
    }
}
