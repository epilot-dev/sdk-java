package dev.epilot.sdk.models.shared;


public enum ActivityTriggerConfigurationTypesEnum {
    CREATE_METER_READING("CreateMeterReading"),
    UPDATE_METER_READING("UpdateMeterReading"),
    MESSAGE_ACTIVITY("MessageActivity"),
    SYNC_ACTIVITY("SyncActivity");

    public final String value;

    private ActivityTriggerConfigurationTypesEnum(String value) {
        this.value = value;
    }
}
