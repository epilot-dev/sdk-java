package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
import org.apache.http.NameValuePair;

public class Relations {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Relations(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * addRelations - addRelations
     *
     * Relates one or more entities to parent entity by adding items to a relation attribute
    **/
    public .models.operations.AddRelationsResponse addRelations(.models.operations.AddRelationsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/{slug}/{id}/relations", request.pathParams);
        
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

        .models.operations.AddRelationsResponse res = new .models.operations.AddRelationsResponse() {{
            relationItem = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.RelationItem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.RelationItem.class);
                res.relationItem = out;
            }
        }

        return res;
    }
	
	
    /**
     * deleteRelation - deleteRelation
     *
     * Removes relation between two entities
    **/
    public .models.operations.DeleteRelationResponse deleteRelation(.models.operations.DeleteRelationRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/{slug}/{id}/relations/{attribute}/{entity_id}", request.pathParams);
        
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

        .models.operations.DeleteRelationResponse res = new .models.operations.DeleteRelationResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }

        return res;
    }
	
	
    /**
     * getRelations - getRelations
     *
     * Returns 1st level direct relations for an entity.
     * 
     * You can control whether to return the full entity or just the relation item with the `?hydrate` query param.
     * 
     * Reverse relations i.e. entities referring to this entity are included with the `?include_reverse` query param.
     * 
    **/
    public .models.operations.GetRelationsResponse getRelations(.models.operations.GetRelationsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/{slug}/{id}/relations", request.pathParams);
        
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

        .models.operations.GetRelationsResponse res = new .models.operations.GetRelationsResponse() {{
            getRelationsResp = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                Object[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object[].class);
                res.getRelationsResp = out;
            }
        }

        return res;
    }
	
	
    /**
     * updateRelation - updateRelation
     *
     * Updates an existing relation between two entities.
    **/
    public .models.operations.UpdateRelationResponse updateRelation(.models.operations.UpdateRelationRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/{slug}/{id}/relations/{attribute}/{entity_id}", request.pathParams);
        
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

        .models.operations.UpdateRelationResponse res = new .models.operations.UpdateRelationResponse() {{
            relationItem = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.RelationItem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.RelationItem.class);
                res.relationItem = out;
            }
        }

        return res;
    }
	
}