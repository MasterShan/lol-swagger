# MatchV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**matchV4.getMatch**](MatchV4Api.md#matchV4.getMatch) | **GET** /lol/match/v4/matches/{matchId} | Get match by match ID.
[**matchV4.getMatchByTournamentCode**](MatchV4Api.md#matchV4.getMatchByTournamentCode) | **GET** /lol/match/v4/matches/{matchId}/by-tournament-code/{tournamentCode} | Get match by match ID and tournament code.
[**matchV4.getMatchIdsByTournamentCode**](MatchV4Api.md#matchV4.getMatchIdsByTournamentCode) | **GET** /lol/match/v4/matches/by-tournament-code/{tournamentCode}/ids | Get match IDs by tournament code.
[**matchV4.getMatchTimeline**](MatchV4Api.md#matchV4.getMatchTimeline) | **GET** /lol/match/v4/timelines/by-match/{matchId} | Get match timeline by match ID.
[**matchV4.getMatchlist**](MatchV4Api.md#matchV4.getMatchlist) | **GET** /lol/match/v4/matchlists/by-account/{encryptedAccountId} | Get matchlist for games played on given account ID and platform ID and filtered using given filter parameters, if any.


<a name="matchV4.getMatch"></a>
# **matchV4.getMatch**
> MatchMinusv4MatchDto matchV4.getMatch(matchId)

Get match by match ID.

Get match by match ID.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = MatchV4Api()
val matchId : kotlin.Long = 789 // kotlin.Long | The match ID.
try {
    val result : MatchMinusv4MatchDto = apiInstance.matchV4.getMatch(matchId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchV4Api#matchV4.getMatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchV4Api#matchV4.getMatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchId** | **kotlin.Long**| The match ID. |

### Return type

[**MatchMinusv4MatchDto**](MatchMinusv4MatchDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="matchV4.getMatchByTournamentCode"></a>
# **matchV4.getMatchByTournamentCode**
> MatchMinusv4MatchDto matchV4.getMatchByTournamentCode(tournamentCode, matchId)

Get match by match ID and tournament code.

Get match by match ID and tournament code.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = MatchV4Api()
val tournamentCode : kotlin.String = tournamentCode_example // kotlin.String | The tournament code.
val matchId : kotlin.Long = 789 // kotlin.Long | The match ID.
try {
    val result : MatchMinusv4MatchDto = apiInstance.matchV4.getMatchByTournamentCode(tournamentCode, matchId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchV4Api#matchV4.getMatchByTournamentCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchV4Api#matchV4.getMatchByTournamentCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentCode** | **kotlin.String**| The tournament code. |
 **matchId** | **kotlin.Long**| The match ID. |

### Return type

[**MatchMinusv4MatchDto**](MatchMinusv4MatchDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="matchV4.getMatchIdsByTournamentCode"></a>
# **matchV4.getMatchIdsByTournamentCode**
> kotlin.Array&lt;kotlin.Long&gt; matchV4.getMatchIdsByTournamentCode(tournamentCode)

Get match IDs by tournament code.

Get match IDs by tournament code.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = MatchV4Api()
val tournamentCode : kotlin.String = tournamentCode_example // kotlin.String | The tournament code.
try {
    val result : kotlin.Array<kotlin.Long> = apiInstance.matchV4.getMatchIdsByTournamentCode(tournamentCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchV4Api#matchV4.getMatchIdsByTournamentCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchV4Api#matchV4.getMatchIdsByTournamentCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentCode** | **kotlin.String**| The tournament code. |

### Return type

**kotlin.Array&lt;kotlin.Long&gt;**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="matchV4.getMatchTimeline"></a>
# **matchV4.getMatchTimeline**
> MatchMinusv4MatchTimelineDto matchV4.getMatchTimeline(matchId)

Get match timeline by match ID.

Get match timeline by match ID. ## Implementation Notes Not all matches have timeline data.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = MatchV4Api()
val matchId : kotlin.Long = 789 // kotlin.Long | The match ID.
try {
    val result : MatchMinusv4MatchTimelineDto = apiInstance.matchV4.getMatchTimeline(matchId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchV4Api#matchV4.getMatchTimeline")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchV4Api#matchV4.getMatchTimeline")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchId** | **kotlin.Long**| The match ID. |

### Return type

[**MatchMinusv4MatchTimelineDto**](MatchMinusv4MatchTimelineDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="matchV4.getMatchlist"></a>
# **matchV4.getMatchlist**
> MatchMinusv4MatchlistDto matchV4.getMatchlist(encryptedAccountId, champion, queue, season, endTime, beginTime, endIndex, beginIndex)

Get matchlist for games played on given account ID and platform ID and filtered using given filter parameters, if any.

Get matchlist for games played on given account ID and platform ID and filtered using given filter parameters, if any. ## Implementation Notes A number of optional parameters are provided for filtering. It is up to the caller to ensure that the combination of filter parameters provided is valid for the requested account, otherwise, no matches may be returned.  If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned.  If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account&#39;s match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = MatchV4Api()
val encryptedAccountId : kotlin.String = encryptedAccountId_example // kotlin.String | The account ID.
val champion : kotlin.Array<kotlin.Int> =  // kotlin.Array<kotlin.Int> | Set of champion IDs for filtering the matchlist.
val queue : kotlin.Array<kotlin.Int> =  // kotlin.Array<kotlin.Int> | Set of queue IDs for filtering the matchlist.
val season : kotlin.Array<kotlin.Int> =  // kotlin.Array<kotlin.Int> | Set of season IDs for filtering the matchlist.
val endTime : kotlin.Long = 789 // kotlin.Long | The end time to use for filtering matchlist specified as epoch milliseconds. If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account's match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned.
val beginTime : kotlin.Long = 789 // kotlin.Long | The begin time to use for filtering matchlist specified as epoch milliseconds. If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account's match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned.
val endIndex : kotlin.Int = 56 // kotlin.Int | The end index to use for filtering matchlist. If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned.
val beginIndex : kotlin.Int = 56 // kotlin.Int | The begin index to use for filtering matchlist.  If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned.
try {
    val result : MatchMinusv4MatchlistDto = apiInstance.matchV4.getMatchlist(encryptedAccountId, champion, queue, season, endTime, beginTime, endIndex, beginIndex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchV4Api#matchV4.getMatchlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchV4Api#matchV4.getMatchlist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedAccountId** | **kotlin.String**| The account ID. |
 **champion** | [**kotlin.Array&lt;kotlin.Int&gt;**](kotlin.Int.md)| Set of champion IDs for filtering the matchlist. | [optional]
 **queue** | [**kotlin.Array&lt;kotlin.Int&gt;**](kotlin.Int.md)| Set of queue IDs for filtering the matchlist. | [optional]
 **season** | [**kotlin.Array&lt;kotlin.Int&gt;**](kotlin.Int.md)| Set of season IDs for filtering the matchlist. | [optional]
 **endTime** | **kotlin.Long**| The end time to use for filtering matchlist specified as epoch milliseconds. If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account&#39;s match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned. | [optional]
 **beginTime** | **kotlin.Long**| The begin time to use for filtering matchlist specified as epoch milliseconds. If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account&#39;s match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned. | [optional]
 **endIndex** | **kotlin.Int**| The end index to use for filtering matchlist. If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned. | [optional]
 **beginIndex** | **kotlin.Int**| The begin index to use for filtering matchlist.  If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned. | [optional]

### Return type

[**MatchMinusv4MatchlistDto**](MatchMinusv4MatchlistDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

