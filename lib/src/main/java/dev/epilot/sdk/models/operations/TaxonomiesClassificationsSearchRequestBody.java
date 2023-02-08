package dev.epilot.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class TaxonomiesClassificationsSearchRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("classificationIds")
    public String[] classificationIds;
    public TaxonomiesClassificationsSearchRequestBody withClassificationIds(String[] classificationIds) {
        this.classificationIds = classificationIds;
        return this;
    }
}
