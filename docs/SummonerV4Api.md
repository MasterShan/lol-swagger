# SummonerV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**summonerV4.getByAccountId**](SummonerV4Api.md#summonerV4.getByAccountId) | **GET** /lol/summoner/v4/summoners/by-account/{encryptedAccountId} | Get a summoner by account ID.
[**summonerV4.getByPUUID**](SummonerV4Api.md#summonerV4.getByPUUID) | **GET** /lol/summoner/v4/summoners/by-puuid/{encryptedPUUID} | Get a summoner by PUUID.
[**summonerV4.getBySummonerId**](SummonerV4Api.md#summonerV4.getBySummonerId) | **GET** /lol/summoner/v4/summoners/{encryptedSummonerId} | Get a summoner by summoner ID.
[**summonerV4.getBySummonerName**](SummonerV4Api.md#summonerV4.getBySummonerName) | **GET** /lol/summoner/v4/summoners/by-name/{summonerName} | Get a summoner by summoner name.


<a name="summonerV4.getByAccountId"></a>
# **summonerV4.getByAccountId**
> SummonerMinusv4SummonerDTO summonerV4.getByAccountId(encryptedAccountId)

Get a summoner by account ID.

Get a summoner by account ID.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SummonerV4Api()
val encryptedAccountId : kotlin.String = encryptedAccountId_example // kotlin.String | 
try {
    val result : SummonerMinusv4SummonerDTO = apiInstance.summonerV4.getByAccountId(encryptedAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SummonerV4Api#summonerV4.getByAccountId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SummonerV4Api#summonerV4.getByAccountId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedAccountId** | **kotlin.String**|  |

### Return type

[**SummonerMinusv4SummonerDTO**](SummonerMinusv4SummonerDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="summonerV4.getByPUUID"></a>
# **summonerV4.getByPUUID**
> SummonerMinusv4SummonerDTO summonerV4.getByPUUID(encryptedPUUID)

Get a summoner by PUUID.

Get a summoner by PUUID.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SummonerV4Api()
val encryptedPUUID : kotlin.String = encryptedPUUID_example // kotlin.String | Summoner ID
try {
    val result : SummonerMinusv4SummonerDTO = apiInstance.summonerV4.getByPUUID(encryptedPUUID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SummonerV4Api#summonerV4.getByPUUID")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SummonerV4Api#summonerV4.getByPUUID")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedPUUID** | **kotlin.String**| Summoner ID |

### Return type

[**SummonerMinusv4SummonerDTO**](SummonerMinusv4SummonerDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="summonerV4.getBySummonerId"></a>
# **summonerV4.getBySummonerId**
> SummonerMinusv4SummonerDTO summonerV4.getBySummonerId(encryptedSummonerId)

Get a summoner by summoner ID.

Get a summoner by summoner ID.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SummonerV4Api()
val encryptedSummonerId : kotlin.String = encryptedSummonerId_example // kotlin.String | Summoner ID
try {
    val result : SummonerMinusv4SummonerDTO = apiInstance.summonerV4.getBySummonerId(encryptedSummonerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SummonerV4Api#summonerV4.getBySummonerId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SummonerV4Api#summonerV4.getBySummonerId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedSummonerId** | **kotlin.String**| Summoner ID |

### Return type

[**SummonerMinusv4SummonerDTO**](SummonerMinusv4SummonerDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="summonerV4.getBySummonerName"></a>
# **summonerV4.getBySummonerName**
> SummonerMinusv4SummonerDTO summonerV4.getBySummonerName(summonerName)

Get a summoner by summoner name.

Get a summoner by summoner name.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SummonerV4Api()
val summonerName : kotlin.String = summonerName_example // kotlin.String | Summoner Name
try {
    val result : SummonerMinusv4SummonerDTO = apiInstance.summonerV4.getBySummonerName(summonerName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SummonerV4Api#summonerV4.getBySummonerName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SummonerV4Api#summonerV4.getBySummonerName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **summonerName** | **kotlin.String**| Summoner Name |

### Return type

[**SummonerMinusv4SummonerDTO**](SummonerMinusv4SummonerDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

