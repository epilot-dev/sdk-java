package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EntityParcelView {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("import")
    public String import_;
    public EntityParcelView withImport(String import_) {
        this.import_ = import_;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("view_type")
    public EntityParcelViewViewTypeEnum viewType;
    public EntityParcelView withViewType(EntityParcelViewViewTypeEnum viewType) {
        this.viewType = viewType;
        return this;
    }
    
}
