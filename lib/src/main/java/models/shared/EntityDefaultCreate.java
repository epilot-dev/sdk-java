package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class EntityDefaultCreate {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_params")
    public java.util.Map<String, String> searchParams;
    public EntityDefaultCreate withSearchParams(java.util.Map<String, String> searchParams) {
        this.searchParams = searchParams;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("table_menu_options")
    public EntityDefaultCreateTableMenuOptions tableMenuOptions;
    public EntityDefaultCreate withTableMenuOptions(EntityDefaultCreateTableMenuOptions tableMenuOptions) {
        this.tableMenuOptions = tableMenuOptions;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("view_type")
    public EntityDefaultCreateViewTypeEnum viewType;
    public EntityDefaultCreate withViewType(EntityDefaultCreateViewTypeEnum viewType) {
        this.viewType = viewType;
        return this;
    }
}