package dev.epilot.sdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.epilot.sdk.utils.HTTPClient;
import dev.epilot.sdk.utils.HTTPRequest;
import dev.epilot.sdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;

public class Schemas {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Schemas(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * createNewSchemaVersion - createNewSchemaVersion
     *
     * Create new version of the schema and default draft is false.
    **/
    public dev.epilot.sdk.models.operations.CreateNewSchemaVersionResponse createNewSchemaVersion(dev.epilot.sdk.models.operations.CreateNewSchemaVersionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity/schemas/{slug}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
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

        dev.epilot.sdk.models.operations.CreateNewSchemaVersionResponse res = new dev.epilot.sdk.models.operations.CreateNewSchemaVersionResponse() {{
            entitySchemaItem = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.shared.EntitySchemaItem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.shared.EntitySchemaItem.class);
                res.entitySchemaItem = out;
            }
        }

        return res;
    }
    
    /**
     * deleteSchemaById - deleteSchemaById
     *
     * Delete schema by Id
    **/
    public dev.epilot.sdk.models.operations.DeleteSchemaByIdResponse deleteSchemaById(dev.epilot.sdk.models.operations.DeleteSchemaByIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity/schemas/{slug}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
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

        dev.epilot.sdk.models.operations.DeleteSchemaByIdResponse res = new dev.epilot.sdk.models.operations.DeleteSchemaByIdResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }

        return res;
    }
    
    /**
     * getSchema - getSchema
     *
     * By default gets the latest version of the Schema and to get the specific version of schema pass the id.
    **/
    public dev.epilot.sdk.models.operations.GetSchemaResponse getSchema(dev.epilot.sdk.models.operations.GetSchemaRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity/schemas/{slug}", request.pathParams);
        
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

        dev.epilot.sdk.models.operations.GetSchemaResponse res = new dev.epilot.sdk.models.operations.GetSchemaResponse() {{
            entitySchemaItem = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.shared.EntitySchemaItem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.shared.EntitySchemaItem.class);
                res.entitySchemaItem = out;
            }
        }

        return res;
    }
    
    /**
     * getSchemaVersions - getSchemaVersions
     *
     * Get all versions of this schema ordered by the latest versions including drafts.
    **/
    public dev.epilot.sdk.models.operations.GetSchemaVersionsResponse getSchemaVersions(dev.epilot.sdk.models.operations.GetSchemaVersionsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity/schemas/{slug}/versions", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.epilot.sdk.models.operations.GetSchemaVersionsResponse res = new dev.epilot.sdk.models.operations.GetSchemaVersionsResponse() {{
            getSchemaVersions200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.operations.GetSchemaVersions200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.operations.GetSchemaVersions200ApplicationJSON.class);
                res.getSchemaVersions200ApplicationJSONObject = out;
            }
        }

        return res;
    }
    
    /**
     * listSchemaBlueprints - listSchemaBlueprints
     *
     * List canonical versions of all available schemas
    **/
    public dev.epilot.sdk.models.operations.ListSchemaBlueprintsResponse listSchemaBlueprints() throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity/schemas/blueprints");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.epilot.sdk.models.operations.ListSchemaBlueprintsResponse res = new dev.epilot.sdk.models.operations.ListSchemaBlueprintsResponse() {{
            listSchemaBlueprints200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.operations.ListSchemaBlueprints200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.operations.ListSchemaBlueprints200ApplicationJSON.class);
                res.listSchemaBlueprints200ApplicationJSONObject = out;
            }
        }

        return res;
    }
    
    /**
     * listSchemas - listSchemas
     *
     * Get the latest version of local schema
    **/
    public dev.epilot.sdk.models.operations.ListSchemasResponse listSchemas(dev.epilot.sdk.models.operations.ListSchemasRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity/schemas");
        
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

        dev.epilot.sdk.models.operations.ListSchemasResponse res = new dev.epilot.sdk.models.operations.ListSchemasResponse() {{
            listSchemas200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.operations.ListSchemas200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.operations.ListSchemas200ApplicationJSON.class);
                res.listSchemas200ApplicationJSONObject = out;
            }
        }

        return res;
    }
    
    /**
     * listTaxonomyClassificationsForSchema - listTaxonomyClassificationsForSchema
     *
     * List taxonomy classifications for a given schema
    **/
    public dev.epilot.sdk.models.operations.ListTaxonomyClassificationsForSchemaResponse listTaxonomyClassificationsForSchema(dev.epilot.sdk.models.operations.ListTaxonomyClassificationsForSchemaRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity/schemas/{slug}/taxonomy/{taxonomySlug}", request.pathParams);
        
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

        dev.epilot.sdk.models.operations.ListTaxonomyClassificationsForSchemaResponse res = new dev.epilot.sdk.models.operations.ListTaxonomyClassificationsForSchemaResponse() {{
            listTaxonomyClassificationsForSchema200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.operations.ListTaxonomyClassificationsForSchema200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.operations.ListTaxonomyClassificationsForSchema200ApplicationJSON.class);
                res.listTaxonomyClassificationsForSchema200ApplicationJSONObject = out;
            }
        }

        return res;
    }
}