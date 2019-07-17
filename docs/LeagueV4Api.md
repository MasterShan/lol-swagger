# LeagueV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leagueV4.getChallengerLeague**](LeagueV4Api.md#leagueV4.getChallengerLeague) | **GET** /lol/league/v4/challengerleagues/by-queue/{queue} | Get the challenger league for given queue.
[**leagueV4.getGrandmasterLeague**](LeagueV4Api.md#leagueV4.getGrandmasterLeague) | **GET** /lol/league/v4/grandmasterleagues/by-queue/{queue} | Get the grandmaster league of a specific queue.
[**leagueV4.getLeagueById**](LeagueV4Api.md#leagueV4.getLeagueById) | **GET** /lol/league/v4/leagues/{leagueId} | Get league with given ID, including inactive entries.
[**leagueV4.getLeagueEntries**](LeagueV4Api.md#leagueV4.getLeagueEntries) | **GET** /lol/league/v4/entries/{queue}/{tier}/{division} | Get all the league entries.
[**leagueV4.getLeagueEntriesForSummoner**](LeagueV4Api.md#leagueV4.getLeagueEntriesForSummoner) | **GET** /lol/league/v4/entries/by-summoner/{encryptedSummonerId} | Get league entries in all queues for a given summoner ID.
[**leagueV4.getMasterLeague**](LeagueV4Api.md#leagueV4.getMasterLeague) | **GET** /lol/league/v4/masterleagues/by-queue/{queue} | Get the master league for given queue.


<a name="leagueV4.getChallengerLeague"></a>
# **leagueV4.getChallengerLeague**
> LeagueMinusv4LeagueListDTO leagueV4.getChallengerLeague(queue)

Get the challenger league for given queue.

Get the challenger league for given queue.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = LeagueV4Api()
val queue : kotlin.String = queue_example // kotlin.String | 
try {
    val result : LeagueMinusv4LeagueListDTO = apiInstance.leagueV4.getChallengerLeague(queue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeagueV4Api#leagueV4.getChallengerLeague")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeagueV4Api#leagueV4.getChallengerLeague")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue** | **kotlin.String**|  | [enum: RANKED_SOLO_5x5, RANKED_FLEX_SR, RANKED_FLEX_TT]

### Return type

[**LeagueMinusv4LeagueListDTO**](LeagueMinusv4LeagueListDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leagueV4.getGrandmasterLeague"></a>
# **leagueV4.getGrandmasterLeague**
> LeagueMinusv4LeagueListDTO leagueV4.getGrandmasterLeague(queue)

Get the grandmaster league of a specific queue.

Get the grandmaster league of a specific queue.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = LeagueV4Api()
val queue : kotlin.String = queue_example // kotlin.String | 
try {
    val result : LeagueMinusv4LeagueListDTO = apiInstance.leagueV4.getGrandmasterLeague(queue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeagueV4Api#leagueV4.getGrandmasterLeague")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeagueV4Api#leagueV4.getGrandmasterLeague")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue** | **kotlin.String**|  | [enum: RANKED_SOLO_5x5, RANKED_FLEX_SR, RANKED_FLEX_TT]

### Return type

[**LeagueMinusv4LeagueListDTO**](LeagueMinusv4LeagueListDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leagueV4.getLeagueById"></a>
# **leagueV4.getLeagueById**
> LeagueMinusv4LeagueListDTO leagueV4.getLeagueById(leagueId)

Get league with given ID, including inactive entries.

Get league with given ID, including inactive entries.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = LeagueV4Api()
val leagueId : kotlin.String = leagueId_example // kotlin.String | The UUID of the league.
try {
    val result : LeagueMinusv4LeagueListDTO = apiInstance.leagueV4.getLeagueById(leagueId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeagueV4Api#leagueV4.getLeagueById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeagueV4Api#leagueV4.getLeagueById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leagueId** | **kotlin.String**| The UUID of the league. |

### Return type

[**LeagueMinusv4LeagueListDTO**](LeagueMinusv4LeagueListDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leagueV4.getLeagueEntries"></a>
# **leagueV4.getLeagueEntries**
> kotlin.Array&lt;LeagueMinusv4LeagueEntryDTO&gt; leagueV4.getLeagueEntries(division, tier, queue, page)

Get all the league entries.

Get all the league entries.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = LeagueV4Api()
val division : kotlin.String = division_example // kotlin.String | 
val tier : kotlin.String = tier_example // kotlin.String | 
val queue : kotlin.String = queue_example // kotlin.String | Note that the queue value must be a valid ranked queue.
val page : kotlin.Int = 56 // kotlin.Int | Starts with page 1.
try {
    val result : kotlin.Array<LeagueMinusv4LeagueEntryDTO> = apiInstance.leagueV4.getLeagueEntries(division, tier, queue, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeagueV4Api#leagueV4.getLeagueEntries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeagueV4Api#leagueV4.getLeagueEntries")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **division** | **kotlin.String**|  | [enum: I, II, III, IV]
 **tier** | **kotlin.String**|  | [enum: DIAMOND, PLATINUM, GOLD, SILVER, BRONZE, IRON]
 **queue** | **kotlin.String**| Note that the queue value must be a valid ranked queue. | [enum: RANKED_SOLO_5x5, RANKED_FLEX_SR, RANKED_FLEX_TT]
 **page** | **kotlin.Int**| Starts with page 1. | [optional]

### Return type

[**kotlin.Array&lt;LeagueMinusv4LeagueEntryDTO&gt;**](LeagueMinusv4LeagueEntryDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leagueV4.getLeagueEntriesForSummoner"></a>
# **leagueV4.getLeagueEntriesForSummoner**
> kotlin.Array&lt;LeagueMinusv4LeagueEntryDTO&gt; leagueV4.getLeagueEntriesForSummoner(encryptedSummonerId)

Get league entries in all queues for a given summoner ID.

Get league entries in all queues for a given summoner ID.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = LeagueV4Api()
val encryptedSummonerId : kotlin.String = encryptedSummonerId_example // kotlin.String | 
try {
    val result : kotlin.Array<LeagueMinusv4LeagueEntryDTO> = apiInstance.leagueV4.getLeagueEntriesForSummoner(encryptedSummonerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeagueV4Api#leagueV4.getLeagueEntriesForSummoner")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeagueV4Api#leagueV4.getLeagueEntriesForSummoner")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedSummonerId** | **kotlin.String**|  |

### Return type

[**kotlin.Array&lt;LeagueMinusv4LeagueEntryDTO&gt;**](LeagueMinusv4LeagueEntryDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leagueV4.getMasterLeague"></a>
# **leagueV4.getMasterLeague**
> LeagueMinusv4LeagueListDTO leagueV4.getMasterLeague(queue)

Get the master league for given queue.

Get the master league for given queue.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = LeagueV4Api()
val queue : kotlin.String = queue_example // kotlin.String | 
try {
    val result : LeagueMinusv4LeagueListDTO = apiInstance.leagueV4.getMasterLeague(queue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeagueV4Api#leagueV4.getMasterLeague")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeagueV4Api#leagueV4.getMasterLeague")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue** | **kotlin.String**|  | [enum: RANKED_SOLO_5x5, RANKED_FLEX_SR, RANKED_FLEX_TT]

### Return type

[**LeagueMinusv4LeagueListDTO**](LeagueMinusv4LeagueListDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

