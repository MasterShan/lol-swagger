# MatchV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**matchV4GetMatch**](MatchV4Api.md#matchV4GetMatch) | **GET** /lol/match/v4/matches/{matchId} | Get match by match ID.
[**matchV4GetMatchByTournamentCode**](MatchV4Api.md#matchV4GetMatchByTournamentCode) | **GET** /lol/match/v4/matches/{matchId}/by-tournament-code/{tournamentCode} | Get match by match ID and tournament code.
[**matchV4GetMatchIdsByTournamentCode**](MatchV4Api.md#matchV4GetMatchIdsByTournamentCode) | **GET** /lol/match/v4/matches/by-tournament-code/{tournamentCode}/ids | Get match IDs by tournament code.
[**matchV4GetMatchTimeline**](MatchV4Api.md#matchV4GetMatchTimeline) | **GET** /lol/match/v4/timelines/by-match/{matchId} | Get match timeline by match ID.
[**matchV4GetMatchlist**](MatchV4Api.md#matchV4GetMatchlist) | **GET** /lol/match/v4/matchlists/by-account/{encryptedAccountId} | Get matchlist for games played on given account ID and platform ID and filtered using given filter parameters, if any.


<a name="matchV4GetMatch"></a>
# **matchV4GetMatch**
> MatchV4MatchDto matchV4GetMatch(matchId)

Get match by match ID.

Get match by match ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchV4Api;

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

MatchV4Api apiInstance = new MatchV4Api();
Long matchId = 789L; // Long | The match ID.
try {
    MatchV4MatchDto result = apiInstance.matchV4GetMatch(matchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchV4Api#matchV4GetMatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchId** | **Long**| The match ID. |

### Return type

[**MatchV4MatchDto**](MatchV4MatchDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="matchV4GetMatchByTournamentCode"></a>
# **matchV4GetMatchByTournamentCode**
> MatchV4MatchDto matchV4GetMatchByTournamentCode(tournamentCode, matchId)

Get match by match ID and tournament code.

Get match by match ID and tournament code.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchV4Api;

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

MatchV4Api apiInstance = new MatchV4Api();
String tournamentCode = "tournamentCode_example"; // String | The tournament code.
Long matchId = 789L; // Long | The match ID.
try {
    MatchV4MatchDto result = apiInstance.matchV4GetMatchByTournamentCode(tournamentCode, matchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchV4Api#matchV4GetMatchByTournamentCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentCode** | **String**| The tournament code. |
 **matchId** | **Long**| The match ID. |

### Return type

[**MatchV4MatchDto**](MatchV4MatchDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="matchV4GetMatchIdsByTournamentCode"></a>
# **matchV4GetMatchIdsByTournamentCode**
> List&lt;Long&gt; matchV4GetMatchIdsByTournamentCode(tournamentCode)

Get match IDs by tournament code.

Get match IDs by tournament code.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchV4Api;

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

MatchV4Api apiInstance = new MatchV4Api();
String tournamentCode = "tournamentCode_example"; // String | The tournament code.
try {
    List<Long> result = apiInstance.matchV4GetMatchIdsByTournamentCode(tournamentCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchV4Api#matchV4GetMatchIdsByTournamentCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentCode** | **String**| The tournament code. |

### Return type

**List&lt;Long&gt;**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="matchV4GetMatchTimeline"></a>
# **matchV4GetMatchTimeline**
> MatchV4MatchTimelineDto matchV4GetMatchTimeline(matchId)

Get match timeline by match ID.

Get match timeline by match ID. ## Implementation Notes Not all matches have timeline data.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchV4Api;

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

MatchV4Api apiInstance = new MatchV4Api();
Long matchId = 789L; // Long | The match ID.
try {
    MatchV4MatchTimelineDto result = apiInstance.matchV4GetMatchTimeline(matchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchV4Api#matchV4GetMatchTimeline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchId** | **Long**| The match ID. |

### Return type

[**MatchV4MatchTimelineDto**](MatchV4MatchTimelineDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="matchV4GetMatchlist"></a>
# **matchV4GetMatchlist**
> MatchV4MatchlistDto matchV4GetMatchlist(encryptedAccountId, champion, queue, season, endTime, beginTime, endIndex, beginIndex)

Get matchlist for games played on given account ID and platform ID and filtered using given filter parameters, if any.

Get matchlist for games played on given account ID and platform ID and filtered using given filter parameters, if any. ## Implementation Notes A number of optional parameters are provided for filtering. It is up to the caller to ensure that the combination of filter parameters provided is valid for the requested account, otherwise, no matches may be returned.  If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned.  If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account&#39;s match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchV4Api;

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

MatchV4Api apiInstance = new MatchV4Api();
String encryptedAccountId = "encryptedAccountId_example"; // String | The account ID.
List<Integer> champion = Arrays.asList(56); // List<Integer> | Set of champion IDs for filtering the matchlist.
List<Integer> queue = Arrays.asList(56); // List<Integer> | Set of queue IDs for filtering the matchlist.
List<Integer> season = Arrays.asList(56); // List<Integer> | Set of season IDs for filtering the matchlist.
Long endTime = 789L; // Long | The end time to use for filtering matchlist specified as epoch milliseconds. If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account's match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned.
Long beginTime = 789L; // Long | The begin time to use for filtering matchlist specified as epoch milliseconds. If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account's match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned.
Integer endIndex = 56; // Integer | The end index to use for filtering matchlist. If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned.
Integer beginIndex = 56; // Integer | The begin index to use for filtering matchlist.  If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned.
try {
    MatchV4MatchlistDto result = apiInstance.matchV4GetMatchlist(encryptedAccountId, champion, queue, season, endTime, beginTime, endIndex, beginIndex);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchV4Api#matchV4GetMatchlist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedAccountId** | **String**| The account ID. |
 **champion** | [**List&lt;Integer&gt;**](Integer.md)| Set of champion IDs for filtering the matchlist. | [optional]
 **queue** | [**List&lt;Integer&gt;**](Integer.md)| Set of queue IDs for filtering the matchlist. | [optional]
 **season** | [**List&lt;Integer&gt;**](Integer.md)| Set of season IDs for filtering the matchlist. | [optional]
 **endTime** | **Long**| The end time to use for filtering matchlist specified as epoch milliseconds. If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account&#39;s match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned. | [optional]
 **beginTime** | **Long**| The begin time to use for filtering matchlist specified as epoch milliseconds. If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account&#39;s match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned. | [optional]
 **endIndex** | **Integer**| The end index to use for filtering matchlist. If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned. | [optional]
 **beginIndex** | **Integer**| The begin index to use for filtering matchlist.  If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned. | [optional]

### Return type

[**MatchV4MatchlistDto**](MatchV4MatchlistDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

