package dev.epilot.sdk.models.shared;


public enum RelationAttributeRelationTypeEnum {
    HAS_MANY("has_many"),
    HAS_ONE("has_one");

    public final String value;

    private RelationAttributeRelationTypeEnum(String value) {
        this.value = value;
    }
}
