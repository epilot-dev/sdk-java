package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class SelectAttributeOptions2 {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;
    public SelectAttributeOptions2 withTitle(String title) {
        this.title = title;
        return this;
    }
    @JsonProperty("value")
    public String value;
    public SelectAttributeOptions2 withValue(String value) {
        this.value = value;
        return this;
    }
}