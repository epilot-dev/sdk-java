<!-- Start SDK Example Usage -->
```java
package hello.world;

import dev.epilot.sdk.EpilotApi;
import dev.epilot.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            EpilotApi.Builder builder = EpilotApi.builder();

            builder.setSecurity(
                new Security() {{
                    epilotAuth = new SchemeEpilotAuth() {{
                        authorization = "Bearer YOUR_BEARER_TOKEN_HERE";
                    }};
                }}
            );

            EpilotApi sdk = builder.build();

            AttachActivityRequest req = new AttachActivityRequest() {{
                pathParams = new AttachActivityPathParams() {{
                    id = "sit";
                }};
                queryParams = new AttachActivityQueryParams() {{
                    entities = new String[]() {{
                        add("culpa"),
                    }};
                }};
            }};

            AttachActivityResponse res = sdk.activity.attachActivity(req);

            if (res.activityItem.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->