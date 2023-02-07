package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class ReceivedEmailTriggerConfiguration {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message_type")
    public ReceivedEmailTriggerConfigurationMessageTypeEnum messageType;
    public ReceivedEmailTriggerConfiguration withMessageType(ReceivedEmailTriggerConfigurationMessageTypeEnum messageType) {
        this.messageType = messageType;
        return this;
    }
}