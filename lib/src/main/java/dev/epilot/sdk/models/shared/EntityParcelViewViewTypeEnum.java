package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum EntityParcelViewViewTypeEnum {
    PARCEL("parcel");

    @JsonValue
    public final String value;

    private EntityParcelViewViewTypeEnum(String value) {
        this.value = value;
    }
}
