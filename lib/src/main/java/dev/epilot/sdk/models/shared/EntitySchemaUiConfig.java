package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EntitySchemaUiConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("create_view")
    public Object createView;
    public EntitySchemaUiConfig withCreateView(Object createView) {
        this.createView = createView;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("edit_view")
    public Object editView;
    public EntitySchemaUiConfig withEditView(Object editView) {
        this.editView = editView;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_item")
    public EntitySchemaUiConfigListItem listItem;
    public EntitySchemaUiConfig withListItem(EntitySchemaUiConfigListItem listItem) {
        this.listItem = listItem;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sharing")
    public EntitySchemaUiConfigSharing sharing;
    public EntitySchemaUiConfig withSharing(EntitySchemaUiConfigSharing sharing) {
        this.sharing = sharing;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("single_view")
    public Object singleView;
    public EntitySchemaUiConfig withSingleView(Object singleView) {
        this.singleView = singleView;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("table_view")
    public Object tableView;
    public EntitySchemaUiConfig withTableView(Object tableView) {
        this.tableView = tableView;
        return this;
    }
    
}
