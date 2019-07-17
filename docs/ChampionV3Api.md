# ChampionV3Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**championV3.getChampionInfo**](ChampionV3Api.md#championV3.getChampionInfo) | **GET** /lol/platform/v3/champion-rotations | Returns champion rotations, including free-to-play and low-level free-to-play rotations (REST)


<a name="championV3.getChampionInfo"></a>
# **championV3.getChampionInfo**
> ChampionMinusv3ChampionInfo championV3.getChampionInfo()

Returns champion rotations, including free-to-play and low-level free-to-play rotations (REST)

Returns champion rotations, including free-to-play and low-level free-to-play rotations (REST)

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChampionV3Api()
try {
    val result : ChampionMinusv3ChampionInfo = apiInstance.championV3.getChampionInfo()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChampionV3Api#championV3.getChampionInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChampionV3Api#championV3.getChampionInfo")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ChampionMinusv3ChampionInfo**](ChampionMinusv3ChampionInfo.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

