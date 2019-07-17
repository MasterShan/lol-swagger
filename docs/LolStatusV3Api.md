# swagger_client.LolStatusV3Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lol_status_v3_get_shard_data**](LolStatusV3Api.md#lol_status_v3_get_shard_data) | **GET** /lol/status/v3/shard-data | Get League of Legends status for the given shard.


# **lol_status_v3_get_shard_data**
> LolStatusV3ShardStatus lol_status_v3_get_shard_data()

Get League of Legends status for the given shard.

Get League of Legends status for the given shard. ## Rate Limit Notes Requests to this API are not counted against the application Rate Limits.

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
api_instance = swagger_client.LolStatusV3Api(swagger_client.ApiClient(configuration))

try:
    # Get League of Legends status for the given shard.
    api_response = api_instance.lol_status_v3_get_shard_data()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LolStatusV3Api->lol_status_v3_get_shard_data: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LolStatusV3ShardStatus**](LolStatusV3ShardStatus.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

