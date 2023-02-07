package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * CartCheckoutActionConfig
 * Creates an order entity with prices from journey
**/public class CartCheckoutActionConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allow_failure")
    public Boolean allowFailure;
    public CartCheckoutActionConfig withAllowFailure(Boolean allowFailure) {
        this.allowFailure = allowFailure;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("config")
    public CartCheckoutConfig config;
    public CartCheckoutActionConfig withConfig(CartCheckoutConfig config) {
        this.config = config;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_automatically")
    public Boolean createdAutomatically;
    public CartCheckoutActionConfig withCreatedAutomatically(Boolean createdAutomatically) {
        this.createdAutomatically = createdAutomatically;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flow_action_id")
    public String flowActionId;
    public CartCheckoutActionConfig withFlowActionId(String flowActionId) {
        this.flowActionId = flowActionId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public CartCheckoutActionConfig withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public CartCheckoutActionConfig withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public Object type;
    public CartCheckoutActionConfig withType(Object type) {
        this.type = type;
        return this;
    }
}