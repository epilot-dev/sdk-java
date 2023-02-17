package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EntityDefaultCreateTableMenuOptions {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("icon")
    public String icon;
    public EntityDefaultCreateTableMenuOptions withIcon(String icon) {
        this.icon = icon;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label")
    public String label;
    public EntityDefaultCreateTableMenuOptions withLabel(String label) {
        this.label = label;
        return this;
    }
    
}
