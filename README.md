## Epilot Java SDK

Epilot is the digital foundation for sales, service, network and implementation processes in the context of the energy transition. This SDK is for the Epilot Journey, Entity and Automation APIs. Please see the Epilot developer documentation for more information.

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation '::'
```
<!-- End SDK Installation -->

## Authentication

To call epilot APIs, requests must be authorized using a valid Access Token.

### Using Access Token Authorization
The access token should be passed in the Authorization request header.

```bash
Authorization: Bearer <your-access-token>
```

### Creating Access Tokens
Users logged into the epilot 360 portal can manage their Access Tokens from Settings > Access Tokens.

Creating access tokens requires the `token:create` permission.

Access Token API
Authenticated users can generate long-term access tokens for 3rd party applications using the epilot Access Token API createAccessToken operation.

```bash
POST /v1/access-tokens
{
  "name": "Token for my application"
}
```
Optionally, you can pass a list of Role IDs, to define the roles the access token will have access to. By default, the access token inherits the caller's roles.

```bash
POST /v1/access-tokens
{
  "name": "Postman Access Token",
  "assume_roles": ["123:owner"]
}
```
Each Access Token generated via the API gets a generated a unique ID.

```bash
// 201 - success
{
  "id": "api_5ZugdRXasLfWBypHi93Fk",
  "created_at": "2019-08-24T14:15:22Z",
  "name": "Postman Access Token",
  "assignments": ["123:owner"]
}
```
Access tokens may also be revoked using the revokeAccessToken operation
```bash
DELETE /v1/access-tokens/api_5ZugdRXasLfWBypHi93Fk
// 200 - success
{
  "id": "api_5ZugdRXasLfWBypHi93Fk",
  "created_at": "2019-08-24T14:15:22Z",
  "name": "Postman Access Token",
  "assignments": ["123:owner"]
}
```

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import .SDK;
import .models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK.Builder builder = SDK.builder();

            builder.setSecurity(
                new Security() {{
                    epilotAuth = new SchemeEpilotAuth() {{
                        authorization = "Bearer YOUR_BEARER_TOKEN_HERE";
                    }};
                }}
            );

            SDK sdk = builder.build();

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

<!-- Start SDK Available Operations -->
## SDK Available Operations

### Activity

* `attachActivity` - attachActivity
* `createActivity` - createActivity
* `getActivity` - getActivity
* `getEntityActivityFeed` - getEntityActivityFeed

### Entities

* `autocomplete` - autocomplete
* `createEntity` - createEntity
* `deleteEntity` - deleteEntity
* `getEntity` - getEntity
* `searchEntities` - searchEntities
* `updateEntity` - updateEntity
* `upsertEntity` - upsertEntity

### Export

* `exportEntities` - exportEntities
* `importEntities` - importEntities

### Journeys

* `createJourney` - createJourney
* `getJourney` - getJourney
* `getJourneysByOrgId` - getJourneysByOrgId
* `patchUpdateJourney` - patchUpdateJourney
* `removeJourney` - removeJourney
* `searchJourneys` - searchJourneys
* `updateJourney` - updateJourney

### Relations

* `addRelations` - addRelations
* `deleteRelation` - deleteRelation
* `getRelations` - getRelations
* `updateRelation` - updateRelation

### Saved Views

* `createSavedView` - createSavedView
* `deleteSavedView` - deleteSavedView
* `getSavedView` - getSavedView
* `listSavedViews` - listSavedViews
* `updateSavedView` - updateSavedView

### Schemas

* `createNewSchemaVersion` - createNewSchemaVersion
* `deleteSchemaById` - deleteSchemaById
* `getSchema` - getSchema
* `getSchemaVersions` - getSchemaVersions
* `listSchemaBlueprints` - listSchemaBlueprints
* `listSchemas` - listSchemas
* `listTaxonomyClassificationsForSchema` - listTaxonomyClassificationsForSchema

### Taxonomy

* `getTaxonomy` - getTaxonomy
* `listTaxonomies` - listTaxonomies
* `taxonomiesClassificationsSearch` - taxonomiesClassificationsSearch
* `taxonomyAutocomplete` - taxonomyAutocomplete
* `updateClassificationsForTaxonomy` - updateClassificationsForTaxonomy

### executions

* `cancelExecution` - cancelExecution
* `getExecution` - getExecution
* `getExecutions` - getExecutions
* `retriggerAction` - retriggerAction
* `startExecution` - startExecution

### flows

* `createFlow` - createFlow
* `deleteFlow` - deleteFlow
* `getFlow` - getFlow
* `putFlow` - putFlow
* `searchFlows` - searchFlows

<!-- End SDK Available Operations -->

### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
