package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PartnerStatusAttributeTypeEnum {
    PARTNER_STATUS("partner_status");

    @JsonValue
    public final String value;

    private PartnerStatusAttributeTypeEnum(String value) {
        this.value = value;
    }
}
