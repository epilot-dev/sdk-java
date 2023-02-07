package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
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
    public .models.operations.CreateNewSchemaVersionResponse createNewSchemaVersion(.models.operations.CreateNewSchemaVersionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/schemas/{slug}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        java.util.List<NameValuePair> queryParams = .utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.CreateNewSchemaVersionResponse res = new .models.operations.CreateNewSchemaVersionResponse() {{
            entitySchemaItem = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.EntitySchemaItem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.EntitySchemaItem.class);
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
    public .models.operations.DeleteSchemaByIdResponse deleteSchemaById(.models.operations.DeleteSchemaByIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/schemas/{slug}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = .utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.DeleteSchemaByIdResponse res = new .models.operations.DeleteSchemaByIdResponse() {{
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
    public .models.operations.GetSchemaResponse getSchema(.models.operations.GetSchemaRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/schemas/{slug}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = .utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetSchemaResponse res = new .models.operations.GetSchemaResponse() {{
            entitySchemaItem = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.EntitySchemaItem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.EntitySchemaItem.class);
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
    public .models.operations.GetSchemaVersionsResponse getSchemaVersions(.models.operations.GetSchemaVersionsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/schemas/{slug}/versions", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetSchemaVersionsResponse res = new .models.operations.GetSchemaVersionsResponse() {{
            getSchemaVersions200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.operations.GetSchemaVersions200ApplicationJson out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.operations.GetSchemaVersions200ApplicationJson.class);
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
    public .models.operations.ListSchemaBlueprintsResponse listSchemaBlueprints() throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/schemas/blueprints");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.ListSchemaBlueprintsResponse res = new .models.operations.ListSchemaBlueprintsResponse() {{
            listSchemaBlueprints200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.operations.ListSchemaBlueprints200ApplicationJson out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.operations.ListSchemaBlueprints200ApplicationJson.class);
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
    public .models.operations.ListSchemasResponse listSchemas(.models.operations.ListSchemasRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/schemas");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = .utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.ListSchemasResponse res = new .models.operations.ListSchemasResponse() {{
            listSchemas200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.operations.ListSchemas200ApplicationJson out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.operations.ListSchemas200ApplicationJson.class);
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
    public .models.operations.ListTaxonomyClassificationsForSchemaResponse listTaxonomyClassificationsForSchema(.models.operations.ListTaxonomyClassificationsForSchemaRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/schemas/{slug}/taxonomy/{taxonomySlug}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = .utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.ListTaxonomyClassificationsForSchemaResponse res = new .models.operations.ListTaxonomyClassificationsForSchemaResponse() {{
            listTaxonomyClassificationsForSchema200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.operations.ListTaxonomyClassificationsForSchema200ApplicationJson out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.operations.ListTaxonomyClassificationsForSchema200ApplicationJson.class);
                res.listTaxonomyClassificationsForSchema200ApplicationJSONObject = out;
            }
        }

        return res;
    }
	
}