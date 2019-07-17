# swagger_client.SummonerV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**summoner_v4_get_by_account_id**](SummonerV4Api.md#summoner_v4_get_by_account_id) | **GET** /lol/summoner/v4/summoners/by-account/{encryptedAccountId} | Get a summoner by account ID.
[**summoner_v4_get_by_puuid**](SummonerV4Api.md#summoner_v4_get_by_puuid) | **GET** /lol/summoner/v4/summoners/by-puuid/{encryptedPUUID} | Get a summoner by PUUID.
[**summoner_v4_get_by_summoner_id**](SummonerV4Api.md#summoner_v4_get_by_summoner_id) | **GET** /lol/summoner/v4/summoners/{encryptedSummonerId} | Get a summoner by summoner ID.
[**summoner_v4_get_by_summoner_name**](SummonerV4Api.md#summoner_v4_get_by_summoner_name) | **GET** /lol/summoner/v4/summoners/by-name/{summonerName} | Get a summoner by summoner name.


# **summoner_v4_get_by_account_id**
> SummonerV4SummonerDTO summoner_v4_get_by_account_id(encrypted_account_id)

Get a summoner by account ID.

Get a summoner by account ID.

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
api_instance = swagger_client.SummonerV4Api(swagger_client.ApiClient(configuration))
encrypted_account_id = 'encrypted_account_id_example' # str | 

try:
    # Get a summoner by account ID.
    api_response = api_instance.summoner_v4_get_by_account_id(encrypted_account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SummonerV4Api->summoner_v4_get_by_account_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encrypted_account_id** | **str**|  | 

### Return type

[**SummonerV4SummonerDTO**](SummonerV4SummonerDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **summoner_v4_get_by_puuid**
> SummonerV4SummonerDTO summoner_v4_get_by_puuid(encrypted_puuid)

Get a summoner by PUUID.

Get a summoner by PUUID.

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
api_instance = swagger_client.SummonerV4Api(swagger_client.ApiClient(configuration))
encrypted_puuid = 'encrypted_puuid_example' # str | Summoner ID

try:
    # Get a summoner by PUUID.
    api_response = api_instance.summoner_v4_get_by_puuid(encrypted_puuid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SummonerV4Api->summoner_v4_get_by_puuid: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encrypted_puuid** | **str**| Summoner ID | 

### Return type

[**SummonerV4SummonerDTO**](SummonerV4SummonerDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **summoner_v4_get_by_summoner_id**
> SummonerV4SummonerDTO summoner_v4_get_by_summoner_id(encrypted_summoner_id)

Get a summoner by summoner ID.

Get a summoner by summoner ID.

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
api_instance = swagger_client.SummonerV4Api(swagger_client.ApiClient(configuration))
encrypted_summoner_id = 'encrypted_summoner_id_example' # str | Summoner ID

try:
    # Get a summoner by summoner ID.
    api_response = api_instance.summoner_v4_get_by_summoner_id(encrypted_summoner_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SummonerV4Api->summoner_v4_get_by_summoner_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encrypted_summoner_id** | **str**| Summoner ID | 

### Return type

[**SummonerV4SummonerDTO**](SummonerV4SummonerDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **summoner_v4_get_by_summoner_name**
> SummonerV4SummonerDTO summoner_v4_get_by_summoner_name(summoner_name)

Get a summoner by summoner name.

Get a summoner by summoner name.

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
api_instance = swagger_client.SummonerV4Api(swagger_client.ApiClient(configuration))
summoner_name = 'summoner_name_example' # str | Summoner Name

try:
    # Get a summoner by summoner name.
    api_response = api_instance.summoner_v4_get_by_summoner_name(summoner_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SummonerV4Api->summoner_v4_get_by_summoner_name: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **summoner_name** | **str**| Summoner Name | 

### Return type

[**SummonerV4SummonerDTO**](SummonerV4SummonerDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

