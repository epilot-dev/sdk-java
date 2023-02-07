package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class EntityDefaultTableNavbarActions {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public EntityDefaultTableNavbarActionsOptions[] options;
    public EntityDefaultTableNavbarActions withOptions(EntityDefaultTableNavbarActionsOptions[] options) {
        this.options = options;
        return this;
    }
    @JsonProperty("type")
    public String type;
    public EntityDefaultTableNavbarActions withType(String type) {
        this.type = type;
        return this;
    }
}