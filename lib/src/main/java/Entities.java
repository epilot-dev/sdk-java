package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
import org.apache.http.NameValuePair;

public class Entities {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Entities(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * autocomplete - autocomplete
     *
     * Autocomplete entity attributes
     * 
    **/
    public .models.operations.AutocompleteResponse autocomplete(.models.operations.AutocompleteRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity:autocomplete");
        
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

        .models.operations.AutocompleteResponse res = new .models.operations.AutocompleteResponse() {{
            autocomplete200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.operations.Autocomplete200ApplicationJson out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.operations.Autocomplete200ApplicationJson.class);
                res.autocomplete200ApplicationJSONObject = out;
            }
        }

        return res;
    }
	
	
    /**
     * createEntity - createEntity
     *
     * Creates a new entity using a key.
     * 
     * ## Activity
     * 
     * If no `activity_id` query parameter is provided, implicitly creates Activity of type `EntityCreated`
     * 
     * ## Relations
     * 
     * To create a relation, store a property object that defines a `$relation` array.
     * 
     * Example:
     * 
     * ```json
     * {
     *   "contacts": {
     *     "$relation": [
     *       { "entity_id": "3fa85f64-5717-4562-b3fc-2c963f66afa6" }
     *     ]
     *   }
     * }
     * ```
     * 
     * The items in `$relation` support two properties:
     * - `entity_id` - The ID of the entity to link
     * - `_tags` - Tags or labels for the relation (optional)
     * 
    **/
    public .models.operations.CreateEntityResponse createEntity(.models.operations.CreateEntityRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/{slug}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
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

        .models.operations.CreateEntityResponse res = new .models.operations.CreateEntityResponse() {{
            entityItem = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                java.util.Map<String, Object> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), java.util.Map.class);
                res.entityItem = out;
            }
        }

        return res;
    }
	
	
    /**
     * deleteEntity - deleteEntity
     *
     * Deletes an Entity
     * 
     * ## Activity
     * 
     * If no `activity_id` query parameter is provided, implicitly creates Activity of type `EntityDeleted`
     * 
    **/
    public .models.operations.DeleteEntityResponse deleteEntity(.models.operations.DeleteEntityRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/{slug}/{id}", request.pathParams);
        
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

        .models.operations.DeleteEntityResponse res = new .models.operations.DeleteEntityResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }

        return res;
    }
	
	
    /**
     * getEntity - getEntity
     *
     * Gets Entity and relations by id.
     * 
     * ## Relations
     * 
     * When `hydrate=true`, relation attributes are replaced in-place with nested entity values.
     * 
     * Example:
     * ```json
     * {
     *   "_id": "123",
     *   "name": "parent",
     *   "_tags": ["parent"],
     *   "contacts": {
     *     "$relation": [
     *       { "entity_id": "456", "_tags": ["primary"] },
     *       { "entity_id": "789", "_tags": ["secondary"] },
     *     ]
     *   },
     *   "addresses": {
     *     "$relation_ref": [
     *       { "entity_id": "123", "_tags": ["primary"], "path": "address.0" },
     *       { "entity_id": "234", "_tags": ["secondary"], "path": "address.0" },
     *     ]
     *   }
     * }
     * ```
     * 
     * Becomes:
     * ```json
     * {
     *   "_id": "123",
     *   "name": "parent",
     *   "_tags": ["parent"],
     *   "contacts": [
     *     {
     *       "$relation": { "entity_id": "456", "_tags": ["primary"] },
     *       "_id": "456",
     *       "name": "child 1",
     *       "_tags": ["child"]
     *     },
     *     {
     *       "$relation": { "entity_id": "789", "_tags": ["secondary"] },
     *       "_id": "789",
     *       "name": "child 2",
     *       "_tags": ["child"]
     *     }
     *   ],
     *   "addresses": [
     *     {
     *       "$relation_ref": { "entity_id": "123", "_tags": ["primary"], "path": "address.0" },
     *       "_id": "123",
     *       "address": "address 1",
     *       "_tags": ["child"]
     *     },
     *     {
     *       "$relation_ref": { "entity_id": "234", "_tags": ["secondary"], "path": "address.0" },
     *       "_id": "234",
     *       "address": "address 2",
     *       "_tags": ["child"]
     *     }
     *   ]
     * }
     * ```
     * 
    **/
    public .models.operations.GetEntityResponse getEntity(.models.operations.GetEntityRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/{slug}/{id}", request.pathParams);
        
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

        .models.operations.GetEntityResponse res = new .models.operations.GetEntityResponse() {{
            getEntity200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.operations.GetEntity200ApplicationJson out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.operations.GetEntity200ApplicationJson.class);
                res.getEntity200ApplicationJSONObject = out;
            }
        }

        return res;
    }
	
	
    /**
     * searchEntities - searchEntities
     *
     * Search for entities. Supports ordering and pagination. Lucene query syntax supported for complex querying.
     * 
     * Passing comma-separated `x-epilot-org-id` is supported for cross-org entity search.
     * 
     * ## Relations
     * 
     * When `hydrate=true`, relation attributes are replaced in-place with nested entity values.
     * 
     * Example:
     * ```json
     * {
     *   "_id": "123",
     *   "name": "parent",
     *   "_tags": ["parent"],
     *   "contacts": {
     *     "$relation": [
     *       { "entity_id": "456", "_tags": ["primary"] },
     *       { "entity_id": "789", "_tags": ["secondary"] },
     *     ]
     *   },
     *   "addresses": {
     *     "$relation_ref": [
     *       { "entity_id": "123", "_tags": ["primary"], "path": "address.0" },
     *       { "entity_id": "234", "_tags": ["secondary"], "path": "address.0" },
     *     ]
     *   }
     * }
     * ```
     * 
     * Becomes:
     * ```json
     * {
     *   "_id": "123",
     *   "name": "parent",
     *   "_tags": ["parent"],
     *   "contacts": [
     *     {
     *       "$relation": { "entity_id": "456", "_tags": ["primary"] },
     *       "_id": "456",
     *       "name": "child 1",
     *       "_tags": ["child"]
     *     },
     *     {
     *       "$relation": { "entity_id": "789", "_tags": ["secondary"] },
     *       "_id": "789",
     *       "name": "child 2",
     *       "_tags": ["child"]
     *     }
     *   ],
     *   "addresses": [
     *     {
     *       "$relation_ref": { "entity_id": "123", "_tags": ["primary"], "path": "address.0" },
     *       "_id": "123",
     *       "address": "address 1",
     *       "_tags": ["child"]
     *     },
     *     {
     *       "$relation_ref": { "entity_id": "234", "_tags": ["secondary"], "path": "address.0" },
     *       "_id": "234",
     *       "address": "address 2",
     *       "_tags": ["child"]
     *     }
     *   ]
     * }
     * ```
     * 
    **/
    public .models.operations.SearchEntitiesResponse searchEntities(.models.operations.SearchEntitiesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity:search");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.SearchEntitiesResponse res = new .models.operations.SearchEntitiesResponse() {{
            entitySearchResults = null;
            searchEntities200TextCsvString = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.EntitySearchResults out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.EntitySearchResults.class);
                res.entitySearchResults = out;
            }
            if (.utils.Utils.matchContentType(contentType, "text/csv")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.searchEntities200TextCsvString = out;
            }
        }

        return res;
    }
	
	
    /**
     * updateEntity - updateEntity
     *
     * Updates an Entity
     * 
     * ## Activity
     * 
     * If no `activity_id` query parameter is provided, implicitly creates Activity of type `EntityUpdated`
     * 
     * ## Relations
     * 
     * To create a relation, store a property that defines a `$relation` array.
     * 
     * Example:
     * 
     * ```json
     * {
     *   "contacts": {
     *     "$relation": [
     *       { "entity_id": "3fa85f64-5717-4562-b3fc-2c963f66afa6" }
     *     ]
     *   }
     * }
     * ```
     * 
     * The items in `$relation` support two properties:
     * - `entity_id` - The ID of the entity to link
     * - `_tags` - Tags or labels for the relation (optional)
     * 
    **/
    public .models.operations.UpdateEntityResponse updateEntity(.models.operations.UpdateEntityRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/{slug}/{id}", request.pathParams);
        
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

        .models.operations.UpdateEntityResponse res = new .models.operations.UpdateEntityResponse() {{
            entityItem = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                java.util.Map<String, Object> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), java.util.Map.class);
                res.entityItem = out;
            }
        }

        return res;
    }
	
	
    /**
     * upsertEntity - upsertEntity
     *
     * Create or update an entity using `unique_key`
     * 
     * - If no entities are matched, a new entity is created.
     * - If exactly one entity is matched, a `PATCH`-style update is applied to the existing entity.
     * - If more than one entity is matched a `409` Error is returned
     * 
     * ## Activity
     * 
     * If no `activity_id` query parameter is provided, implicitly creates Activity of type `EntityCreated` or `EntityUpdated`
     * 
    **/
    public .models.operations.UpsertEntityResponse upsertEntity(.models.operations.UpsertEntityRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/{slug}:upsert", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
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

        .models.operations.UpsertEntityResponse res = new .models.operations.UpsertEntityResponse() {{
            entityItem = null;
            entityItem = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                java.util.Map<String, Object> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), java.util.Map.class);
                res.entityItem = out;
            }
        }
        else if (httpRes.statusCode() == 201) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                java.util.Map<String, Object> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), java.util.Map.class);
                res.entityItem = out;
            }
        }
        else if (httpRes.statusCode() == 409) {
        }

        return res;
    }
	
}