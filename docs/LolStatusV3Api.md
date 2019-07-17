# LolStatusV3Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lolStatusV3.getShardData**](LolStatusV3Api.md#lolStatusV3.getShardData) | **GET** /lol/status/v3/shard-data | Get League of Legends status for the given shard.


<a name="lolStatusV3.getShardData"></a>
# **lolStatusV3.getShardData**
> LolMinusstatusMinusv3ShardStatus lolStatusV3.getShardData()

Get League of Legends status for the given shard.

Get League of Legends status for the given shard. ## Rate Limit Notes Requests to this API are not counted against the application Rate Limits.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = LolStatusV3Api()
try {
    val result : LolMinusstatusMinusv3ShardStatus = apiInstance.lolStatusV3.getShardData()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LolStatusV3Api#lolStatusV3.getShardData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LolStatusV3Api#lolStatusV3.getShardData")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LolMinusstatusMinusv3ShardStatus**](LolMinusstatusMinusv3ShardStatus.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

