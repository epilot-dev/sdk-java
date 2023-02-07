package .models.shared;


public enum UserRelationAttributeTypeEnum {
    RELATION_USER("relation_user");

    public final String value;

    private UserRelationAttributeTypeEnum(String value) {
        this.value = value;
    }
}
