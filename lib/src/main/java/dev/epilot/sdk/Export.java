package dev.epilot.sdk;

import dev.epilot.sdk.utils.HTTPClient;
import dev.epilot.sdk.utils.HTTPRequest;
import dev.epilot.sdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import org.apache.http.NameValuePair;

public class Export {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Export(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * exportEntities - exportEntities
     *
     * create export file of entities
    **/
    public dev.epilot.sdk.models.operations.ExportEntitiesResponse exportEntities(dev.epilot.sdk.models.operations.ExportEntitiesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity:export");
        
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

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.epilot.sdk.models.operations.ExportEntitiesResponse res = new dev.epilot.sdk.models.operations.ExportEntitiesResponse() {{
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
        }

        return res;
    }
    
    /**
     * importEntities - importEntities
     *
     * import entity data from
    **/
    public dev.epilot.sdk.models.operations.ImportEntitiesResponse importEntities(dev.epilot.sdk.models.operations.ImportEntitiesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity:import");
        
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

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.epilot.sdk.models.operations.ImportEntitiesResponse res = new dev.epilot.sdk.models.operations.ImportEntitiesResponse() {{
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
        }

        return res;
    }
}