package dev.epilot.sdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.epilot.sdk.utils.HTTPClient;
import dev.epilot.sdk.utils.HTTPRequest;
import dev.epilot.sdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;

public class Taxonomy {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Taxonomy(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * getTaxonomy - getTaxonomy
     *
     * Get taxonomy by slug
    **/
    public dev.epilot.sdk.models.operations.GetTaxonomyResponse getTaxonomy(dev.epilot.sdk.models.operations.GetTaxonomyRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity/taxonomies/{taxonomySlug}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.epilot.sdk.models.operations.GetTaxonomyResponse res = new dev.epilot.sdk.models.operations.GetTaxonomyResponse() {{
            taxonomy = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.shared.Taxonomy out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.shared.Taxonomy.class);
                res.taxonomy = out;
            }
        }

        return res;
    }
    
    /**
     * listTaxonomies - listTaxonomies
     *
     * List taxonomies in an organisation
    **/
    public dev.epilot.sdk.models.operations.ListTaxonomiesResponse listTaxonomies() throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity/listTaxonomies");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.epilot.sdk.models.operations.ListTaxonomiesResponse res = new dev.epilot.sdk.models.operations.ListTaxonomiesResponse() {{
            listTaxonomies200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.operations.ListTaxonomies200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.operations.ListTaxonomies200ApplicationJSON.class);
                res.listTaxonomies200ApplicationJSONObject = out;
            }
        }

        return res;
    }
    
    /**
     * taxonomiesClassificationsSearch - taxonomiesClassificationsSearch
     *
     * List taxonomy classifications in an organisation based on taxonomy slug
    **/
    public dev.epilot.sdk.models.operations.TaxonomiesClassificationsSearchResponse taxonomiesClassificationsSearch(dev.epilot.sdk.models.operations.TaxonomiesClassificationsSearchRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity/taxonomies/classifications:search");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.epilot.sdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        java.util.List<NameValuePair> queryParams = dev.epilot.sdk.utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.epilot.sdk.models.operations.TaxonomiesClassificationsSearchResponse res = new dev.epilot.sdk.models.operations.TaxonomiesClassificationsSearchResponse() {{
            taxonomiesClassificationsSearch200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.operations.TaxonomiesClassificationsSearch200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.operations.TaxonomiesClassificationsSearch200ApplicationJSON.class);
                res.taxonomiesClassificationsSearch200ApplicationJSONObject = out;
            }
        }

        return res;
    }
    
    /**
     * taxonomyAutocomplete - taxonomyAutocomplete
     *
     * Taxonomies autocomplete
    **/
    public dev.epilot.sdk.models.operations.TaxonomyAutocompleteResponse taxonomyAutocomplete(dev.epilot.sdk.models.operations.TaxonomyAutocompleteRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity/taxonomies/{taxonomySlug}:autocomplete", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = dev.epilot.sdk.utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.epilot.sdk.models.operations.TaxonomyAutocompleteResponse res = new dev.epilot.sdk.models.operations.TaxonomyAutocompleteResponse() {{
            taxonomyAutocomplete200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.operations.TaxonomyAutocomplete200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.operations.TaxonomyAutocomplete200ApplicationJSON.class);
                res.taxonomyAutocomplete200ApplicationJSONObject = out;
            }
        }

        return res;
    }
    
    /**
     * updateClassificationsForTaxonomy - updateClassificationsForTaxonomy
     *
     * Update taxonomies in an organisation based in taxonomy slug
    **/
    public dev.epilot.sdk.models.operations.UpdateClassificationsForTaxonomyResponse updateClassificationsForTaxonomy(dev.epilot.sdk.models.operations.UpdateClassificationsForTaxonomyRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity/taxonomies/{taxonomySlug}/classifications", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.epilot.sdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.epilot.sdk.models.operations.UpdateClassificationsForTaxonomyResponse res = new dev.epilot.sdk.models.operations.UpdateClassificationsForTaxonomyResponse() {{
            updateClassificationsForTaxonomy200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.operations.UpdateClassificationsForTaxonomy200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.operations.UpdateClassificationsForTaxonomy200ApplicationJSON.class);
                res.updateClassificationsForTaxonomy200ApplicationJSONObject = out;
            }
        }

        return res;
    }
}