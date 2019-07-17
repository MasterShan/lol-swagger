# ThirdPartyCodeV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**thirdPartyCodeV4.getThirdPartyCodeBySummonerId**](ThirdPartyCodeV4Api.md#thirdPartyCodeV4.getThirdPartyCodeBySummonerId) | **GET** /lol/platform/v4/third-party-code/by-summoner/{encryptedSummonerId} | Get third party code for a given summoner ID.


<a name="thirdPartyCodeV4.getThirdPartyCodeBySummonerId"></a>
# **thirdPartyCodeV4.getThirdPartyCodeBySummonerId**
> kotlin.String thirdPartyCodeV4.getThirdPartyCodeBySummonerId(encryptedSummonerId)

Get third party code for a given summoner ID.

Get third party code for a given summoner ID.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ThirdPartyCodeV4Api()
val encryptedSummonerId : kotlin.String = encryptedSummonerId_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.thirdPartyCodeV4.getThirdPartyCodeBySummonerId(encryptedSummonerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ThirdPartyCodeV4Api#thirdPartyCodeV4.getThirdPartyCodeBySummonerId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ThirdPartyCodeV4Api#thirdPartyCodeV4.getThirdPartyCodeBySummonerId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedSummonerId** | **kotlin.String**|  |

### Return type

**kotlin.String**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

