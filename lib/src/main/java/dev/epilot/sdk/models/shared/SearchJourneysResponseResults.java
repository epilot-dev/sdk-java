package dev.epilot.sdk.models.shared;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import dev.epilot.sdk.utils.DateTimeSerializer;
import dev.epilot.sdk.utils.DateTimeDeserializer;
public class SearchJourneysResponseResults {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("_created_at")
    public OffsetDateTime createdAt;
    public SearchJourneysResponseResults withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_id")
    public String id;
    public SearchJourneysResponseResults withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_org")
    public String org;
    public SearchJourneysResponseResults withOrg(String org) {
        this.org = org;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_schema")
    public String schema;
    public SearchJourneysResponseResults withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_tags")
    public String[] tags;
    public SearchJourneysResponseResults withTags(String[] tags) {
        this.tags = tags;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_title")
    public String title;
    public SearchJourneysResponseResults withTitle(String title) {
        this.title = title;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("_updated_at")
    public OffsetDateTime updatedAt;
    public SearchJourneysResponseResults withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public SearchJourneysResponseResultsCreatedBy[] createdBy;
    public SearchJourneysResponseResults withCreatedBy(SearchJourneysResponseResultsCreatedBy[] createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("design")
    public String design;
    public SearchJourneysResponseResults withDesign(String design) {
        this.design = design;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("journey_id")
    public String journeyId;
    public SearchJourneysResponseResults withJourneyId(String journeyId) {
        this.journeyId = journeyId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("journey_name")
    public String journeyName;
    public SearchJourneysResponseResults withJourneyName(String journeyName) {
        this.journeyName = journeyName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("journey_type")
    public String journeyType;
    public SearchJourneysResponseResults withJourneyType(String journeyType) {
        this.journeyType = journeyType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("journey_version")
    public SearchJourneysResponseResultsJourneyVersionEnum journeyVersion;
    public SearchJourneysResponseResults withJourneyVersion(SearchJourneysResponseResultsJourneyVersionEnum journeyVersion) {
        this.journeyVersion = journeyVersion;
        return this;
    }
}