package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SendEmailConfigAttachments {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_filter")
    public SendEmailConfigAttachmentsSourceFilter sourceFilter;
    public SendEmailConfigAttachments withSourceFilter(SendEmailConfigAttachmentsSourceFilter sourceFilter) {
        this.sourceFilter = sourceFilter;
        return this;
    }
}
