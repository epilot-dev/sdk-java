package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class EntityDefaultEdit {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_params")
    public java.util.Map<String, String> searchParams;
    public EntityDefaultEdit withSearchParams(java.util.Map<String, String> searchParams) {
        this.searchParams = searchParams;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("table_menu_options")
    public EntityDefaultEditTableMenuOptions tableMenuOptions;
    public EntityDefaultEdit withTableMenuOptions(EntityDefaultEditTableMenuOptions tableMenuOptions) {
        this.tableMenuOptions = tableMenuOptions;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("view_type")
    public EntityDefaultEditViewTypeEnum viewType;
    public EntityDefaultEdit withViewType(EntityDefaultEditViewTypeEnum viewType) {
        this.viewType = viewType;
        return this;
    }
}