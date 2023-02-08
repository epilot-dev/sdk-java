package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EntitySchemaItemUiConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("create_view")
    public Object createView;
    public EntitySchemaItemUiConfig withCreateView(Object createView) {
        this.createView = createView;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("edit_view")
    public Object editView;
    public EntitySchemaItemUiConfig withEditView(Object editView) {
        this.editView = editView;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_item")
    public EntitySchemaItemUiConfigListItem listItem;
    public EntitySchemaItemUiConfig withListItem(EntitySchemaItemUiConfigListItem listItem) {
        this.listItem = listItem;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sharing")
    public EntitySchemaItemUiConfigSharing sharing;
    public EntitySchemaItemUiConfig withSharing(EntitySchemaItemUiConfigSharing sharing) {
        this.sharing = sharing;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("single_view")
    public Object singleView;
    public EntitySchemaItemUiConfig withSingleView(Object singleView) {
        this.singleView = singleView;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("table_view")
    public Object tableView;
    public EntitySchemaItemUiConfig withTableView(Object tableView) {
        this.tableView = tableView;
        return this;
    }
}
