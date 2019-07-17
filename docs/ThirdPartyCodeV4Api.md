# swagger_client.ThirdPartyCodeV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**third_party_code_v4_get_third_party_code_by_summoner_id**](ThirdPartyCodeV4Api.md#third_party_code_v4_get_third_party_code_by_summoner_id) | **GET** /lol/platform/v4/third-party-code/by-summoner/{encryptedSummonerId} | Get third party code for a given summoner ID.


# **third_party_code_v4_get_third_party_code_by_summoner_id**
> str third_party_code_v4_get_third_party_code_by_summoner_id(encrypted_summoner_id)

Get third party code for a given summoner ID.

Get third party code for a given summoner ID.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: X-Riot-Token
configuration = swagger_client.Configuration()
configuration.api_key['X-Riot-Token'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Riot-Token'] = 'Bearer'
# Configure API key authorization: api_key
configuration = swagger_client.Configuration()
configuration.api_key['api_key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api_key'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ThirdPartyCodeV4Api(swagger_client.ApiClient(configuration))
encrypted_summoner_id = 'encrypted_summoner_id_example' # str | 

try:
    # Get third party code for a given summoner ID.
    api_response = api_instance.third_party_code_v4_get_third_party_code_by_summoner_id(encrypted_summoner_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ThirdPartyCodeV4Api->third_party_code_v4_get_third_party_code_by_summoner_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encrypted_summoner_id** | **str**|  | 

### Return type

**str**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

