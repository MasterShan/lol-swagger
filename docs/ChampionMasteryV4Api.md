# ChampionMasteryV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**championMasteryV4GetAllChampionMasteries**](ChampionMasteryV4Api.md#championMasteryV4GetAllChampionMasteries) | **GET** /lol/champion-mastery/v4/champion-masteries/by-summoner/{encryptedSummonerId} | Get all champion mastery entries sorted by number of champion points descending,
[**championMasteryV4GetChampionMastery**](ChampionMasteryV4Api.md#championMasteryV4GetChampionMastery) | **GET** /lol/champion-mastery/v4/champion-masteries/by-summoner/{encryptedSummonerId}/by-champion/{championId} | Get a champion mastery by player ID and champion ID.
[**championMasteryV4GetChampionMasteryScore**](ChampionMasteryV4Api.md#championMasteryV4GetChampionMasteryScore) | **GET** /lol/champion-mastery/v4/scores/by-summoner/{encryptedSummonerId} | Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.


<a name="championMasteryV4GetAllChampionMasteries"></a>
# **championMasteryV4GetAllChampionMasteries**
> List&lt;ChampionMasteryV4ChampionMasteryDTO&gt; championMasteryV4GetAllChampionMasteries(encryptedSummonerId)

Get all champion mastery entries sorted by number of champion points descending,

Get all champion mastery entries sorted by number of champion points descending,

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChampionMasteryV4Api;

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

ChampionMasteryV4Api apiInstance = new ChampionMasteryV4Api();
String encryptedSummonerId = "encryptedSummonerId_example"; // String | Summoner ID associated with the player
try {
    List<ChampionMasteryV4ChampionMasteryDTO> result = apiInstance.championMasteryV4GetAllChampionMasteries(encryptedSummonerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChampionMasteryV4Api#championMasteryV4GetAllChampionMasteries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedSummonerId** | **String**| Summoner ID associated with the player |

### Return type

[**List&lt;ChampionMasteryV4ChampionMasteryDTO&gt;**](ChampionMasteryV4ChampionMasteryDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="championMasteryV4GetChampionMastery"></a>
# **championMasteryV4GetChampionMastery**
> ChampionMasteryV4ChampionMasteryDTO championMasteryV4GetChampionMastery(championId, encryptedSummonerId)

Get a champion mastery by player ID and champion ID.

Get a champion mastery by player ID and champion ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChampionMasteryV4Api;

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

ChampionMasteryV4Api apiInstance = new ChampionMasteryV4Api();
Long championId = 789L; // Long | Champion ID to retrieve Champion Mastery for
String encryptedSummonerId = "encryptedSummonerId_example"; // String | Summoner ID associated with the player
try {
    ChampionMasteryV4ChampionMasteryDTO result = apiInstance.championMasteryV4GetChampionMastery(championId, encryptedSummonerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChampionMasteryV4Api#championMasteryV4GetChampionMastery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **championId** | **Long**| Champion ID to retrieve Champion Mastery for |
 **encryptedSummonerId** | **String**| Summoner ID associated with the player |

### Return type

[**ChampionMasteryV4ChampionMasteryDTO**](ChampionMasteryV4ChampionMasteryDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="championMasteryV4GetChampionMasteryScore"></a>
# **championMasteryV4GetChampionMasteryScore**
> Integer championMasteryV4GetChampionMasteryScore(encryptedSummonerId)

Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.

Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChampionMasteryV4Api;

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

ChampionMasteryV4Api apiInstance = new ChampionMasteryV4Api();
String encryptedSummonerId = "encryptedSummonerId_example"; // String | Summoner ID associated with the player
try {
    Integer result = apiInstance.championMasteryV4GetChampionMasteryScore(encryptedSummonerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChampionMasteryV4Api#championMasteryV4GetChampionMasteryScore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedSummonerId** | **String**| Summoner ID associated with the player |

### Return type

**Integer**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

