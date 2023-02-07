package .models.shared;


public enum ActivityTriggerTypeEnum {
    ACTIVITY("activity");

    public final String value;

    private ActivityTriggerTypeEnum(String value) {
        this.value = value;
    }
}
