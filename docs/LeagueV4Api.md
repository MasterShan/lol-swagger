# LeagueV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leagueV4GetChallengerLeague**](LeagueV4Api.md#leagueV4GetChallengerLeague) | **GET** /lol/league/v4/challengerleagues/by-queue/{queue} | Get the challenger league for given queue.
[**leagueV4GetGrandmasterLeague**](LeagueV4Api.md#leagueV4GetGrandmasterLeague) | **GET** /lol/league/v4/grandmasterleagues/by-queue/{queue} | Get the grandmaster league of a specific queue.
[**leagueV4GetLeagueById**](LeagueV4Api.md#leagueV4GetLeagueById) | **GET** /lol/league/v4/leagues/{leagueId} | Get league with given ID, including inactive entries.
[**leagueV4GetLeagueEntries**](LeagueV4Api.md#leagueV4GetLeagueEntries) | **GET** /lol/league/v4/entries/{queue}/{tier}/{division} | Get all the league entries.
[**leagueV4GetLeagueEntriesForSummoner**](LeagueV4Api.md#leagueV4GetLeagueEntriesForSummoner) | **GET** /lol/league/v4/entries/by-summoner/{encryptedSummonerId} | Get league entries in all queues for a given summoner ID.
[**leagueV4GetMasterLeague**](LeagueV4Api.md#leagueV4GetMasterLeague) | **GET** /lol/league/v4/masterleagues/by-queue/{queue} | Get the master league for given queue.


<a name="leagueV4GetChallengerLeague"></a>
# **leagueV4GetChallengerLeague**
> LeagueV4LeagueListDTO leagueV4GetChallengerLeague(queue)

Get the challenger league for given queue.

Get the challenger league for given queue.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LeagueV4Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Riot-Token
ApiKeyAuth X-Riot-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Riot-Token");
X-Riot-Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Riot-Token.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LeagueV4Api apiInstance = new LeagueV4Api();
String queue = "queue_example"; // String | 
try {
    LeagueV4LeagueListDTO result = apiInstance.leagueV4GetChallengerLeague(queue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeagueV4Api#leagueV4GetChallengerLeague");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue** | **String**|  | [enum: RANKED_SOLO_5x5, RANKED_FLEX_SR, RANKED_FLEX_TT]

### Return type

[**LeagueV4LeagueListDTO**](LeagueV4LeagueListDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leagueV4GetGrandmasterLeague"></a>
# **leagueV4GetGrandmasterLeague**
> LeagueV4LeagueListDTO leagueV4GetGrandmasterLeague(queue)

Get the grandmaster league of a specific queue.

Get the grandmaster league of a specific queue.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LeagueV4Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Riot-Token
ApiKeyAuth X-Riot-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Riot-Token");
X-Riot-Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Riot-Token.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LeagueV4Api apiInstance = new LeagueV4Api();
String queue = "queue_example"; // String | 
try {
    LeagueV4LeagueListDTO result = apiInstance.leagueV4GetGrandmasterLeague(queue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeagueV4Api#leagueV4GetGrandmasterLeague");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue** | **String**|  | [enum: RANKED_SOLO_5x5, RANKED_FLEX_SR, RANKED_FLEX_TT]

### Return type

[**LeagueV4LeagueListDTO**](LeagueV4LeagueListDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leagueV4GetLeagueById"></a>
# **leagueV4GetLeagueById**
> LeagueV4LeagueListDTO leagueV4GetLeagueById(leagueId)

Get league with given ID, including inactive entries.

Get league with given ID, including inactive entries.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LeagueV4Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Riot-Token
ApiKeyAuth X-Riot-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Riot-Token");
X-Riot-Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Riot-Token.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LeagueV4Api apiInstance = new LeagueV4Api();
String leagueId = "leagueId_example"; // String | The UUID of the league.
try {
    LeagueV4LeagueListDTO result = apiInstance.leagueV4GetLeagueById(leagueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeagueV4Api#leagueV4GetLeagueById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leagueId** | **String**| The UUID of the league. |

### Return type

[**LeagueV4LeagueListDTO**](LeagueV4LeagueListDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leagueV4GetLeagueEntries"></a>
# **leagueV4GetLeagueEntries**
> List&lt;LeagueV4LeagueEntryDTO&gt; leagueV4GetLeagueEntries(division, tier, queue, page)

Get all the league entries.

Get all the league entries.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LeagueV4Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Riot-Token
ApiKeyAuth X-Riot-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Riot-Token");
X-Riot-Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Riot-Token.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LeagueV4Api apiInstance = new LeagueV4Api();
String division = "division_example"; // String | 
String tier = "tier_example"; // String | 
String queue = "queue_example"; // String | Note that the queue value must be a valid ranked queue.
Integer page = 56; // Integer | Starts with page 1.
try {
    List<LeagueV4LeagueEntryDTO> result = apiInstance.leagueV4GetLeagueEntries(division, tier, queue, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeagueV4Api#leagueV4GetLeagueEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **division** | **String**|  | [enum: I, II, III, IV]
 **tier** | **String**|  | [enum: DIAMOND, PLATINUM, GOLD, SILVER, BRONZE, IRON]
 **queue** | **String**| Note that the queue value must be a valid ranked queue. | [enum: RANKED_SOLO_5x5, RANKED_FLEX_SR, RANKED_FLEX_TT]
 **page** | **Integer**| Starts with page 1. | [optional]

### Return type

[**List&lt;LeagueV4LeagueEntryDTO&gt;**](LeagueV4LeagueEntryDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leagueV4GetLeagueEntriesForSummoner"></a>
# **leagueV4GetLeagueEntriesForSummoner**
> List&lt;LeagueV4LeagueEntryDTO&gt; leagueV4GetLeagueEntriesForSummoner(encryptedSummonerId)

Get league entries in all queues for a given summoner ID.

Get league entries in all queues for a given summoner ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LeagueV4Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Riot-Token
ApiKeyAuth X-Riot-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Riot-Token");
X-Riot-Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Riot-Token.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LeagueV4Api apiInstance = new LeagueV4Api();
String encryptedSummonerId = "encryptedSummonerId_example"; // String | 
try {
    List<LeagueV4LeagueEntryDTO> result = apiInstance.leagueV4GetLeagueEntriesForSummoner(encryptedSummonerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeagueV4Api#leagueV4GetLeagueEntriesForSummoner");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedSummonerId** | **String**|  |

### Return type

[**List&lt;LeagueV4LeagueEntryDTO&gt;**](LeagueV4LeagueEntryDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leagueV4GetMasterLeague"></a>
# **leagueV4GetMasterLeague**
> LeagueV4LeagueListDTO leagueV4GetMasterLeague(queue)

Get the master league for given queue.

Get the master league for given queue.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LeagueV4Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Riot-Token
ApiKeyAuth X-Riot-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Riot-Token");
X-Riot-Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Riot-Token.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LeagueV4Api apiInstance = new LeagueV4Api();
String queue = "queue_example"; // String | 
try {
    LeagueV4LeagueListDTO result = apiInstance.leagueV4GetMasterLeague(queue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeagueV4Api#leagueV4GetMasterLeague");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue** | **String**|  | [enum: RANKED_SOLO_5x5, RANKED_FLEX_SR, RANKED_FLEX_TT]

### Return type

[**LeagueV4LeagueListDTO**](LeagueV4LeagueListDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

