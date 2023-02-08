package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchJourneysQueryRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from")
    public Long from;
    public SearchJourneysQueryRequest withFrom(Long from) {
        this.from = from;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("q")
    public String q;
    public SearchJourneysQueryRequest withQ(String q) {
        this.q = q;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Long size;
    public SearchJourneysQueryRequest withSize(Long size) {
        this.size = size;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort")
    public String sort;
    public SearchJourneysQueryRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }
}
