# RiotApi.ChampionV3Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**championV3GetChampionInfo**](ChampionV3Api.md#championV3GetChampionInfo) | **GET** /lol/platform/v3/champion-rotations | Returns champion rotations, including free-to-play and low-level free-to-play rotations (REST)


<a name="championV3GetChampionInfo"></a>
# **championV3GetChampionInfo**
> ChampionV3ChampionInfo championV3GetChampionInfo()

Returns champion rotations, including free-to-play and low-level free-to-play rotations (REST)

Returns champion rotations, including free-to-play and low-level free-to-play rotations (REST)

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

var apiInstance = new RiotApi.ChampionV3Api();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.championV3GetChampionInfo(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ChampionV3ChampionInfo**](ChampionV3ChampionInfo.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

