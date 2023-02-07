package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SendEmailConfigAttachmentsSourceFilter
 * Specify filters to match file entities related to main entity
**/public class SendEmailConfigAttachmentsSourceFilter {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attribute")
    public String attribute;
    public SendEmailConfigAttachmentsSourceFilter withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("document_type")
    public SendEmailConfigAttachmentsSourceFilterDocumentTypeEnum documentType;
    public SendEmailConfigAttachmentsSourceFilter withDocumentType(SendEmailConfigAttachmentsSourceFilterDocumentTypeEnum documentType) {
        this.documentType = documentType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filename_regex")
    public String filenameRegex;
    public SendEmailConfigAttachmentsSourceFilter withFilenameRegex(String filenameRegex) {
        this.filenameRegex = filenameRegex;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public SendEmailConfigAttachmentsSourceFilter withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relation_tag")
    public String relationTag;
    public SendEmailConfigAttachmentsSourceFilter withRelationTag(String relationTag) {
        this.relationTag = relationTag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("self")
    public Boolean self;
    public SendEmailConfigAttachmentsSourceFilter withSelf(Boolean self) {
        this.self = self;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")
    public String tag;
    public SendEmailConfigAttachmentsSourceFilter withTag(String tag) {
        this.tag = tag;
        return this;
    }
}