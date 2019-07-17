# RiotApi.ChampionMasteryV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**championMasteryV4GetAllChampionMasteries**](ChampionMasteryV4Api.md#championMasteryV4GetAllChampionMasteries) | **GET** /lol/champion-mastery/v4/champion-masteries/by-summoner/{encryptedSummonerId} | Get all champion mastery entries sorted by number of champion points descending,
[**championMasteryV4GetChampionMastery**](ChampionMasteryV4Api.md#championMasteryV4GetChampionMastery) | **GET** /lol/champion-mastery/v4/champion-masteries/by-summoner/{encryptedSummonerId}/by-champion/{championId} | Get a champion mastery by player ID and champion ID.
[**championMasteryV4GetChampionMasteryScore**](ChampionMasteryV4Api.md#championMasteryV4GetChampionMasteryScore) | **GET** /lol/champion-mastery/v4/scores/by-summoner/{encryptedSummonerId} | Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.


<a name="championMasteryV4GetAllChampionMasteries"></a>
# **championMasteryV4GetAllChampionMasteries**
> [ChampionMasteryV4ChampionMasteryDTO] championMasteryV4GetAllChampionMasteries(encryptedSummonerId)

Get all champion mastery entries sorted by number of champion points descending,

Get all champion mastery entries sorted by number of champion points descending,

### Example
```javascript
var RiotApi = require('riot_api');
var defaultClient = RiotApi.ApiClient.instance;

// Configure API key authorization: X-Riot-Token
var X-Riot-Token = defaultClient.authentications['X-Riot-Token'];
X-Riot-Token.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Riot-Token.apiKeyPrefix = 'Token';

// Configure API key authorization: api_key
var api_key = defaultClient.authentications['api_key'];
api_key.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.apiKeyPrefix = 'Token';

var apiInstance = new RiotApi.ChampionMasteryV4Api();

var encryptedSummonerId = "encryptedSummonerId_example"; // String | Summoner ID associated with the player


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.championMasteryV4GetAllChampionMasteries(encryptedSummonerId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedSummonerId** | **String**| Summoner ID associated with the player | 

### Return type

[**[ChampionMasteryV4ChampionMasteryDTO]**](ChampionMasteryV4ChampionMasteryDTO.md)

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
```javascript
var RiotApi = require('riot_api');
var defaultClient = RiotApi.ApiClient.instance;

// Configure API key authorization: X-Riot-Token
var X-Riot-Token = defaultClient.authentications['X-Riot-Token'];
X-Riot-Token.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Riot-Token.apiKeyPrefix = 'Token';

// Configure API key authorization: api_key
var api_key = defaultClient.authentications['api_key'];
api_key.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.apiKeyPrefix = 'Token';

var apiInstance = new RiotApi.ChampionMasteryV4Api();

var championId = 789; // Number | Champion ID to retrieve Champion Mastery for

var encryptedSummonerId = "encryptedSummonerId_example"; // String | Summoner ID associated with the player


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.championMasteryV4GetChampionMastery(championId, encryptedSummonerId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **championId** | **Number**| Champion ID to retrieve Champion Mastery for | 
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
> &#39;Number&#39; championMasteryV4GetChampionMasteryScore(encryptedSummonerId)

Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.

Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.

### Example
```javascript
var RiotApi = require('riot_api');
var defaultClient = RiotApi.ApiClient.instance;

// Configure API key authorization: X-Riot-Token
var X-Riot-Token = defaultClient.authentications['X-Riot-Token'];
X-Riot-Token.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Riot-Token.apiKeyPrefix = 'Token';

// Configure API key authorization: api_key
var api_key = defaultClient.authentications['api_key'];
api_key.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.apiKeyPrefix = 'Token';

var apiInstance = new RiotApi.ChampionMasteryV4Api();

var encryptedSummonerId = "encryptedSummonerId_example"; // String | Summoner ID associated with the player


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.championMasteryV4GetChampionMasteryScore(encryptedSummonerId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedSummonerId** | **String**| Summoner ID associated with the player | 

### Return type

**&#39;Number&#39;**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

