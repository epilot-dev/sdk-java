package dev.epilot.sdk.models.operations;



public class GetTaxonomyResponse {
    public String contentType;
    public GetTaxonomyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public GetTaxonomyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public dev.epilot.sdk.models.shared.Taxonomy taxonomy;
    public GetTaxonomyResponse withTaxonomy(dev.epilot.sdk.models.shared.Taxonomy taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }
    
}
