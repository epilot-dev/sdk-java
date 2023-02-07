package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class EntityDefaultTableDropdownItems {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("feature_flag")
    public String featureFlag;
    public EntityDefaultTableDropdownItems withFeatureFlag(String featureFlag) {
        this.featureFlag = featureFlag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("legacy")
    public Boolean legacy;
    public EntityDefaultTableDropdownItems withLegacy(Boolean legacy) {
        this.legacy = legacy;
        return this;
    }
}