package .models.operations;


public class UpdateClassificationsForTaxonomyResponse {
    public String contentType;
    public UpdateClassificationsForTaxonomyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public UpdateClassificationsForTaxonomyResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public UpdateClassificationsForTaxonomy200ApplicationJson updateClassificationsForTaxonomy200ApplicationJSONObject;
    public UpdateClassificationsForTaxonomyResponse withUpdateClassificationsForTaxonomy200ApplicationJsonObject(UpdateClassificationsForTaxonomy200ApplicationJson updateClassificationsForTaxonomy200ApplicationJSONObject) {
        this.updateClassificationsForTaxonomy200ApplicationJSONObject = updateClassificationsForTaxonomy200ApplicationJSONObject;
        return this;
    }
}