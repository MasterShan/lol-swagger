# ChampionMasteryV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**championMasteryV4.getAllChampionMasteries**](ChampionMasteryV4Api.md#championMasteryV4.getAllChampionMasteries) | **GET** /lol/champion-mastery/v4/champion-masteries/by-summoner/{encryptedSummonerId} | Get all champion mastery entries sorted by number of champion points descending,
[**championMasteryV4.getChampionMastery**](ChampionMasteryV4Api.md#championMasteryV4.getChampionMastery) | **GET** /lol/champion-mastery/v4/champion-masteries/by-summoner/{encryptedSummonerId}/by-champion/{championId} | Get a champion mastery by player ID and champion ID.
[**championMasteryV4.getChampionMasteryScore**](ChampionMasteryV4Api.md#championMasteryV4.getChampionMasteryScore) | **GET** /lol/champion-mastery/v4/scores/by-summoner/{encryptedSummonerId} | Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.


<a name="championMasteryV4.getAllChampionMasteries"></a>
# **championMasteryV4.getAllChampionMasteries**
> kotlin.Array&lt;ChampionMinusmasteryMinusv4ChampionMasteryDTO&gt; championMasteryV4.getAllChampionMasteries(encryptedSummonerId)

Get all champion mastery entries sorted by number of champion points descending,

Get all champion mastery entries sorted by number of champion points descending,

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChampionMasteryV4Api()
val encryptedSummonerId : kotlin.String = encryptedSummonerId_example // kotlin.String | Summoner ID associated with the player
try {
    val result : kotlin.Array<ChampionMinusmasteryMinusv4ChampionMasteryDTO> = apiInstance.championMasteryV4.getAllChampionMasteries(encryptedSummonerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChampionMasteryV4Api#championMasteryV4.getAllChampionMasteries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChampionMasteryV4Api#championMasteryV4.getAllChampionMasteries")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedSummonerId** | **kotlin.String**| Summoner ID associated with the player |

### Return type

[**kotlin.Array&lt;ChampionMinusmasteryMinusv4ChampionMasteryDTO&gt;**](ChampionMinusmasteryMinusv4ChampionMasteryDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="championMasteryV4.getChampionMastery"></a>
# **championMasteryV4.getChampionMastery**
> ChampionMinusmasteryMinusv4ChampionMasteryDTO championMasteryV4.getChampionMastery(championId, encryptedSummonerId)

Get a champion mastery by player ID and champion ID.

Get a champion mastery by player ID and champion ID.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChampionMasteryV4Api()
val championId : kotlin.Long = 789 // kotlin.Long | Champion ID to retrieve Champion Mastery for
val encryptedSummonerId : kotlin.String = encryptedSummonerId_example // kotlin.String | Summoner ID associated with the player
try {
    val result : ChampionMinusmasteryMinusv4ChampionMasteryDTO = apiInstance.championMasteryV4.getChampionMastery(championId, encryptedSummonerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChampionMasteryV4Api#championMasteryV4.getChampionMastery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChampionMasteryV4Api#championMasteryV4.getChampionMastery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **championId** | **kotlin.Long**| Champion ID to retrieve Champion Mastery for |
 **encryptedSummonerId** | **kotlin.String**| Summoner ID associated with the player |

### Return type

[**ChampionMinusmasteryMinusv4ChampionMasteryDTO**](ChampionMinusmasteryMinusv4ChampionMasteryDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="championMasteryV4.getChampionMasteryScore"></a>
# **championMasteryV4.getChampionMasteryScore**
> kotlin.Int championMasteryV4.getChampionMasteryScore(encryptedSummonerId)

Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.

Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChampionMasteryV4Api()
val encryptedSummonerId : kotlin.String = encryptedSummonerId_example // kotlin.String | Summoner ID associated with the player
try {
    val result : kotlin.Int = apiInstance.championMasteryV4.getChampionMasteryScore(encryptedSummonerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChampionMasteryV4Api#championMasteryV4.getChampionMasteryScore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChampionMasteryV4Api#championMasteryV4.getChampionMasteryScore")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedSummonerId** | **kotlin.String**| Summoner ID associated with the player |

### Return type

**kotlin.Int**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

