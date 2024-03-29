package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EntitySchemaItemUiConfigSharing {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("show_sharing_button")
    public Boolean showSharingButton;
    public EntitySchemaItemUiConfigSharing withShowSharingButton(Boolean showSharingButton) {
        this.showSharingButton = showSharingButton;
        return this;
    }
    
}
