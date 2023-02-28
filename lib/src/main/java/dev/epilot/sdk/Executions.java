package dev.epilot.sdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.epilot.sdk.utils.HTTPClient;
import dev.epilot.sdk.utils.HTTPRequest;
import dev.epilot.sdk.utils.JSON;
import dev.epilot.sdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;

public class Executions {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Executions(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * cancelExecution - cancelExecution
     *
     * Cancel automation execution
    **/
    public dev.epilot.sdk.models.operations.CancelExecutionResponse cancelExecution(dev.epilot.sdk.models.operations.CancelExecutionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/automation/executions/{execution_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.epilot.sdk.models.operations.CancelExecutionResponse res = new dev.epilot.sdk.models.operations.CancelExecutionResponse() {{
            automationExecution = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.epilot.sdk.models.shared.AutomationExecution out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.shared.AutomationExecution.class);
                res.automationExecution = out;
            }
        }

        return res;
    }
    
    /**
     * getExecution - getExecution
     *
     * Get automation execution
    **/
    public dev.epilot.sdk.models.operations.GetExecutionResponse getExecution(dev.epilot.sdk.models.operations.GetExecutionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/automation/executions/{execution_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.epilot.sdk.models.operations.GetExecutionResponse res = new dev.epilot.sdk.models.operations.GetExecutionResponse() {{
            automationExecution = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.epilot.sdk.models.shared.AutomationExecution out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.shared.AutomationExecution.class);
                res.automationExecution = out;
            }
        }

        return res;
    }
    
    /**
     * getExecutions - getExecutions
     *
     * List automation executions
    **/
    public dev.epilot.sdk.models.operations.GetExecutionsResponse getExecutions(dev.epilot.sdk.models.operations.GetExecutionsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/automation/executions");
        
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

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.epilot.sdk.models.operations.GetExecutionsResponse res = new dev.epilot.sdk.models.operations.GetExecutionsResponse() {{
            getExecutionsResp = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.epilot.sdk.models.shared.GetExecutionsResp out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.shared.GetExecutionsResp.class);
                res.getExecutionsResp = out;
            }
        }

        return res;
    }
    
    /**
     * retriggerAction - retriggerAction
     *
     * Retry a specific automation execution action which failed / is stuck.
    **/
    public dev.epilot.sdk.models.operations.RetriggerActionResponse retriggerAction(dev.epilot.sdk.models.operations.RetriggerActionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/automation/executions/{execution_id}/{action_id}/retrigger", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.epilot.sdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.epilot.sdk.models.operations.RetriggerActionResponse res = new dev.epilot.sdk.models.operations.RetriggerActionResponse() {{
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }

        return res;
    }
    
    /**
     * startExecution - startExecution
     *
     * Start new automation execution
    **/
    public dev.epilot.sdk.models.operations.StartExecutionResponse startExecution(dev.epilot.sdk.models.operations.StartExecutionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/automation/executions");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.epilot.sdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.epilot.sdk.models.operations.StartExecutionResponse res = new dev.epilot.sdk.models.operations.StartExecutionResponse() {{
            automationExecution = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.epilot.sdk.models.shared.AutomationExecution out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.shared.AutomationExecution.class);
                res.automationExecution = out;
            }
        }

        return res;
    }
}