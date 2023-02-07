package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class EntitySearchParams {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    public String[] fields;
    public EntitySearchParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from")
    public Long from;
    public EntitySearchParams withFrom(Long from) {
        this.from = from;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hydrate")
    public Boolean hydrate;
    public EntitySearchParams withHydrate(Boolean hydrate) {
        this.hydrate = hydrate;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_scores")
    public Boolean includeScores;
    public EntitySearchParams withIncludeScores(Boolean includeScores) {
        this.includeScores = includeScores;
        return this;
    }
    @JsonProperty("q")
    public String q;
    public EntitySearchParams withQ(String q) {
        this.q = q;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Long size;
    public EntitySearchParams withSize(Long size) {
        this.size = size;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort")
    public String sort;
    public EntitySearchParams withSort(String sort) {
        this.sort = sort;
        return this;
    }
}