# SpectatorV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spectatorV4.getCurrentGameInfoBySummoner**](SpectatorV4Api.md#spectatorV4.getCurrentGameInfoBySummoner) | **GET** /lol/spectator/v4/active-games/by-summoner/{encryptedSummonerId} | Get current game information for the given summoner ID.
[**spectatorV4.getFeaturedGames**](SpectatorV4Api.md#spectatorV4.getFeaturedGames) | **GET** /lol/spectator/v4/featured-games | Get list of featured games.


<a name="spectatorV4.getCurrentGameInfoBySummoner"></a>
# **spectatorV4.getCurrentGameInfoBySummoner**
> SpectatorMinusv4CurrentGameInfo spectatorV4.getCurrentGameInfoBySummoner(encryptedSummonerId)

Get current game information for the given summoner ID.

Get current game information for the given summoner ID.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SpectatorV4Api()
val encryptedSummonerId : kotlin.String = encryptedSummonerId_example // kotlin.String | The ID of the summoner.
try {
    val result : SpectatorMinusv4CurrentGameInfo = apiInstance.spectatorV4.getCurrentGameInfoBySummoner(encryptedSummonerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpectatorV4Api#spectatorV4.getCurrentGameInfoBySummoner")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpectatorV4Api#spectatorV4.getCurrentGameInfoBySummoner")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedSummonerId** | **kotlin.String**| The ID of the summoner. |

### Return type

[**SpectatorMinusv4CurrentGameInfo**](SpectatorMinusv4CurrentGameInfo.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="spectatorV4.getFeaturedGames"></a>
# **spectatorV4.getFeaturedGames**
> SpectatorMinusv4FeaturedGames spectatorV4.getFeaturedGames()

Get list of featured games.

Get list of featured games.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SpectatorV4Api()
try {
    val result : SpectatorMinusv4FeaturedGames = apiInstance.spectatorV4.getFeaturedGames()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpectatorV4Api#spectatorV4.getFeaturedGames")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpectatorV4Api#spectatorV4.getFeaturedGames")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SpectatorMinusv4FeaturedGames**](SpectatorMinusv4FeaturedGames.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

