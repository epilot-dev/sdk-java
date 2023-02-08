package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class SendEmailConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attachments")
    public SendEmailConfigAttachments[] attachments;
    public SendEmailConfig withAttachments(SendEmailConfigAttachments[] attachments) {
        this.attachments = attachments;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email_template_id")
    public String emailTemplateId;
    public SendEmailConfig withEmailTemplateId(String emailTemplateId) {
        this.emailTemplateId = emailTemplateId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("language_code")
    public SendEmailConfigLanguageCodeEnum languageCode;
    public SendEmailConfig withLanguageCode(SendEmailConfigLanguageCodeEnum languageCode) {
        this.languageCode = languageCode;
        return this;
    }
}
