# RiotApi.SpectatorV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spectatorV4GetCurrentGameInfoBySummoner**](SpectatorV4Api.md#spectatorV4GetCurrentGameInfoBySummoner) | **GET** /lol/spectator/v4/active-games/by-summoner/{encryptedSummonerId} | Get current game information for the given summoner ID.
[**spectatorV4GetFeaturedGames**](SpectatorV4Api.md#spectatorV4GetFeaturedGames) | **GET** /lol/spectator/v4/featured-games | Get list of featured games.


<a name="spectatorV4GetCurrentGameInfoBySummoner"></a>
# **spectatorV4GetCurrentGameInfoBySummoner**
> SpectatorV4CurrentGameInfo spectatorV4GetCurrentGameInfoBySummoner(encryptedSummonerId)

Get current game information for the given summoner ID.

Get current game information for the given summoner ID.

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

var apiInstance = new RiotApi.SpectatorV4Api();

var encryptedSummonerId = "encryptedSummonerId_example"; // String | The ID of the summoner.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.spectatorV4GetCurrentGameInfoBySummoner(encryptedSummonerId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedSummonerId** | **String**| The ID of the summoner. | 

### Return type

[**SpectatorV4CurrentGameInfo**](SpectatorV4CurrentGameInfo.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="spectatorV4GetFeaturedGames"></a>
# **spectatorV4GetFeaturedGames**
> SpectatorV4FeaturedGames spectatorV4GetFeaturedGames()

Get list of featured games.

Get list of featured games.

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

var apiInstance = new RiotApi.SpectatorV4Api();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.spectatorV4GetFeaturedGames(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SpectatorV4FeaturedGames**](SpectatorV4FeaturedGames.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

