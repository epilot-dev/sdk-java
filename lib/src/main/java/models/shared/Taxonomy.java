package .models.shared;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;
public class Taxonomy {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public Taxonomy withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public Taxonomy withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("plural")
    public String plural;
    public Taxonomy withPlural(String plural) {
        this.plural = plural;
        return this;
    }
    @JsonProperty("slug")
    public String slug;
    public Taxonomy withSlug(String slug) {
        this.slug = slug;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public Taxonomy withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}