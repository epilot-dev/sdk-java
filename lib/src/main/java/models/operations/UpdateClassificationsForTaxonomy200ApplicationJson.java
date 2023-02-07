package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class UpdateClassificationsForTaxonomy200ApplicationJson {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created")
    public .models.shared.TaxonomyClassification[] created;
    public UpdateClassificationsForTaxonomy200ApplicationJson withCreated(.models.shared.TaxonomyClassification[] created) {
        this.created = created;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deleted")
    public java.util.Map<String, Object> deleted;
    public UpdateClassificationsForTaxonomy200ApplicationJson withDeleted(java.util.Map<String, Object> deleted) {
        this.deleted = deleted;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated")
    public .models.shared.TaxonomyClassification[] updated;
    public UpdateClassificationsForTaxonomy200ApplicationJson withUpdated(.models.shared.TaxonomyClassification[] updated) {
        this.updated = updated;
        return this;
    }
}