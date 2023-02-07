package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class CreateDocumentConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filename")
    public String filename;
    public CreateDocumentConfig withFilename(String filename) {
        this.filename = filename;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("template_id")
    public String templateId;
    public CreateDocumentConfig withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
}