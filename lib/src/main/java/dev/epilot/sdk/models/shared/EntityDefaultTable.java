package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EntityDefaultTable {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("classic_view")
    public String classicView;
    public EntityDefaultTable withClassicView(String classicView) {
        this.classicView = classicView;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dropdown_items")
    public EntityDefaultTableDropdownItems[] dropdownItems;
    public EntityDefaultTable withDropdownItems(EntityDefaultTableDropdownItems[] dropdownItems) {
        this.dropdownItems = dropdownItems;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enable_thumbnails")
    public Boolean enableThumbnails;
    public EntityDefaultTable withEnableThumbnails(Boolean enableThumbnails) {
        this.enableThumbnails = enableThumbnails;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("navbar_actions")
    public EntityDefaultTableNavbarActions[] navbarActions;
    public EntityDefaultTable withNavbarActions(EntityDefaultTableNavbarActions[] navbarActions) {
        this.navbarActions = navbarActions;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("row_actions")
    public String[] rowActions;
    public EntityDefaultTable withRowActions(String[] rowActions) {
        this.rowActions = rowActions;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("view_type")
    public EntityDefaultTableViewTypeEnum viewType;
    public EntityDefaultTable withViewType(EntityDefaultTableViewTypeEnum viewType) {
        this.viewType = viewType;
        return this;
    }
    
}
