package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class RedirectEntityView {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("route")
    public String route;
    public RedirectEntityView withRoute(String route) {
        this.route = route;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("view_type")
    public RedirectEntityViewViewTypeEnum viewType;
    public RedirectEntityView withViewType(RedirectEntityViewViewTypeEnum viewType) {
        this.viewType = viewType;
        return this;
    }
}