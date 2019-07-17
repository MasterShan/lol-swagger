# swagger_client.ChampionV3Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**champion_v3_get_champion_info**](ChampionV3Api.md#champion_v3_get_champion_info) | **GET** /lol/platform/v3/champion-rotations | Returns champion rotations, including free-to-play and low-level free-to-play rotations (REST)


# **champion_v3_get_champion_info**
> ChampionV3ChampionInfo champion_v3_get_champion_info()

Returns champion rotations, including free-to-play and low-level free-to-play rotations (REST)

Returns champion rotations, including free-to-play and low-level free-to-play rotations (REST)

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
api_instance = swagger_client.ChampionV3Api(swagger_client.ApiClient(configuration))

try:
    # Returns champion rotations, including free-to-play and low-level free-to-play rotations (REST)
    api_response = api_instance.champion_v3_get_champion_info()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ChampionV3Api->champion_v3_get_champion_info: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ChampionV3ChampionInfo**](ChampionV3ChampionInfo.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

