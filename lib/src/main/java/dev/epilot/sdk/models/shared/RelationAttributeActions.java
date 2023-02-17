package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RelationAttributeActions {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("action_type")
    public RelationAttributeActionsActionTypeEnum actionType;
    public RelationAttributeActions withActionType(RelationAttributeActionsActionTypeEnum actionType) {
        this.actionType = actionType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default")
    public Boolean default_;
    public RelationAttributeActions withDefault(Boolean default_) {
        this.default_ = default_;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("feature_flag")
    public String featureFlag;
    public RelationAttributeActions withFeatureFlag(String featureFlag) {
        this.featureFlag = featureFlag;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label")
    public String label;
    public RelationAttributeActions withLabel(String label) {
        this.label = label;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("new_entity_item")
    public java.util.Map<String, Object> newEntityItem;
    public RelationAttributeActions withNewEntityItem(java.util.Map<String, Object> newEntityItem) {
        this.newEntityItem = newEntityItem;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("setting_flag")
    public String settingFlag;
    public RelationAttributeActions withSettingFlag(String settingFlag) {
        this.settingFlag = settingFlag;
        return this;
    }
    
}
