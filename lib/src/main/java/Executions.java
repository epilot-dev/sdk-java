package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
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
    public .models.operations.CancelExecutionResponse cancelExecution(.models.operations.CancelExecutionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/automation/executions/{execution_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.CancelExecutionResponse res = new .models.operations.CancelExecutionResponse() {{
            automationExecution = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.AutomationExecution out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.AutomationExecution.class);
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
    public .models.operations.GetExecutionResponse getExecution(.models.operations.GetExecutionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/automation/executions/{execution_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetExecutionResponse res = new .models.operations.GetExecutionResponse() {{
            automationExecution = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.AutomationExecution out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.AutomationExecution.class);
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
    public .models.operations.GetExecutionsResponse getExecutions(.models.operations.GetExecutionsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/automation/executions");
        
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

        .models.operations.GetExecutionsResponse res = new .models.operations.GetExecutionsResponse() {{
            getExecutionsResp = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.GetExecutionsResp out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.GetExecutionsResp.class);
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
    public .models.operations.RetriggerActionResponse retriggerAction(.models.operations.RetriggerActionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/automation/executions/{execution_id}/{action_id}/retrigger", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.RetriggerActionResponse res = new .models.operations.RetriggerActionResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
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
    public .models.operations.StartExecutionResponse startExecution(.models.operations.StartExecutionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/automation/executions");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.StartExecutionResponse res = new .models.operations.StartExecutionResponse() {{
            automationExecution = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.AutomationExecution out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.AutomationExecution.class);
                res.automationExecution = out;
            }
        }

        return res;
    }
	
}