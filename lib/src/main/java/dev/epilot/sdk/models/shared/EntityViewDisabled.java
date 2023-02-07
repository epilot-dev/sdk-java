package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class EntityViewDisabled {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("view_type")
    public EntityViewDisabledViewTypeEnum viewType;
    public EntityViewDisabled withViewType(EntityViewDisabledViewTypeEnum viewType) {
        this.viewType = viewType;
        return this;
    }
}