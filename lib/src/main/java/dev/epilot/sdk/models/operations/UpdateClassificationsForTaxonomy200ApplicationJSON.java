package dev.epilot.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class UpdateClassificationsForTaxonomy200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created")
    public dev.epilot.sdk.models.shared.TaxonomyClassification[] created;
    public UpdateClassificationsForTaxonomy200ApplicationJSON withCreated(dev.epilot.sdk.models.shared.TaxonomyClassification[] created) {
        this.created = created;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deleted")
    public java.util.Map<String, Object> deleted;
    public UpdateClassificationsForTaxonomy200ApplicationJSON withDeleted(java.util.Map<String, Object> deleted) {
        this.deleted = deleted;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated")
    public dev.epilot.sdk.models.shared.TaxonomyClassification[] updated;
    public UpdateClassificationsForTaxonomy200ApplicationJSON withUpdated(dev.epilot.sdk.models.shared.TaxonomyClassification[] updated) {
        this.updated = updated;
        return this;
    }
}
