# RiotApi.LolStatusV3Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lolStatusV3GetShardData**](LolStatusV3Api.md#lolStatusV3GetShardData) | **GET** /lol/status/v3/shard-data | Get League of Legends status for the given shard.


<a name="lolStatusV3GetShardData"></a>
# **lolStatusV3GetShardData**
> LolStatusV3ShardStatus lolStatusV3GetShardData()

Get League of Legends status for the given shard.

Get League of Legends status for the given shard. ## Rate Limit Notes Requests to this API are not counted against the application Rate Limits.

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

var apiInstance = new RiotApi.LolStatusV3Api();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.lolStatusV3GetShardData(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LolStatusV3ShardStatus**](LolStatusV3ShardStatus.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

