package .models.shared;


public enum ReceivedEmailTriggerTypeEnum {
    RECEIVED_EMAIL("received_email");

    public final String value;

    private ReceivedEmailTriggerTypeEnum(String value) {
        this.value = value;
    }
}
