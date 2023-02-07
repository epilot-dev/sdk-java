package .models.shared;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;
public class TaxonomyClassification {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public TaxonomyClassification withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public TaxonomyClassification withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public TaxonomyClassification withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parents")
    public String[] parents;
    public TaxonomyClassification withParents(String[] parents) {
        this.parents = parents;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public TaxonomyClassification withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}