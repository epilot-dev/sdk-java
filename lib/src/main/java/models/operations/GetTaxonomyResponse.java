package .models.operations;


public class GetTaxonomyResponse {
    public String contentType;
    public GetTaxonomyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetTaxonomyResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.Taxonomy taxonomy;
    public GetTaxonomyResponse withTaxonomy(.models.shared.Taxonomy taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }
}