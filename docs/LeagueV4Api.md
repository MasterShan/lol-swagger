# swagger_client.LeagueV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**league_v4_get_challenger_league**](LeagueV4Api.md#league_v4_get_challenger_league) | **GET** /lol/league/v4/challengerleagues/by-queue/{queue} | Get the challenger league for given queue.
[**league_v4_get_grandmaster_league**](LeagueV4Api.md#league_v4_get_grandmaster_league) | **GET** /lol/league/v4/grandmasterleagues/by-queue/{queue} | Get the grandmaster league of a specific queue.
[**league_v4_get_league_by_id**](LeagueV4Api.md#league_v4_get_league_by_id) | **GET** /lol/league/v4/leagues/{leagueId} | Get league with given ID, including inactive entries.
[**league_v4_get_league_entries**](LeagueV4Api.md#league_v4_get_league_entries) | **GET** /lol/league/v4/entries/{queue}/{tier}/{division} | Get all the league entries.
[**league_v4_get_league_entries_for_summoner**](LeagueV4Api.md#league_v4_get_league_entries_for_summoner) | **GET** /lol/league/v4/entries/by-summoner/{encryptedSummonerId} | Get league entries in all queues for a given summoner ID.
[**league_v4_get_master_league**](LeagueV4Api.md#league_v4_get_master_league) | **GET** /lol/league/v4/masterleagues/by-queue/{queue} | Get the master league for given queue.


# **league_v4_get_challenger_league**
> LeagueV4LeagueListDTO league_v4_get_challenger_league(queue)

Get the challenger league for given queue.

Get the challenger league for given queue.

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
api_instance = swagger_client.LeagueV4Api(swagger_client.ApiClient(configuration))
queue = 'queue_example' # str | 

try:
    # Get the challenger league for given queue.
    api_response = api_instance.league_v4_get_challenger_league(queue)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LeagueV4Api->league_v4_get_challenger_league: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue** | **str**|  | 

### Return type

[**LeagueV4LeagueListDTO**](LeagueV4LeagueListDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **league_v4_get_grandmaster_league**
> LeagueV4LeagueListDTO league_v4_get_grandmaster_league(queue)

Get the grandmaster league of a specific queue.

Get the grandmaster league of a specific queue.

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
api_instance = swagger_client.LeagueV4Api(swagger_client.ApiClient(configuration))
queue = 'queue_example' # str | 

try:
    # Get the grandmaster league of a specific queue.
    api_response = api_instance.league_v4_get_grandmaster_league(queue)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LeagueV4Api->league_v4_get_grandmaster_league: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue** | **str**|  | 

### Return type

[**LeagueV4LeagueListDTO**](LeagueV4LeagueListDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **league_v4_get_league_by_id**
> LeagueV4LeagueListDTO league_v4_get_league_by_id(league_id)

Get league with given ID, including inactive entries.

Get league with given ID, including inactive entries.

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
api_instance = swagger_client.LeagueV4Api(swagger_client.ApiClient(configuration))
league_id = 'league_id_example' # str | The UUID of the league.

try:
    # Get league with given ID, including inactive entries.
    api_response = api_instance.league_v4_get_league_by_id(league_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LeagueV4Api->league_v4_get_league_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **league_id** | **str**| The UUID of the league. | 

### Return type

[**LeagueV4LeagueListDTO**](LeagueV4LeagueListDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **league_v4_get_league_entries**
> list[LeagueV4LeagueEntryDTO] league_v4_get_league_entries(division, tier, queue, page=page)

Get all the league entries.

Get all the league entries.

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
api_instance = swagger_client.LeagueV4Api(swagger_client.ApiClient(configuration))
division = 'division_example' # str | 
tier = 'tier_example' # str | 
queue = 'queue_example' # str | Note that the queue value must be a valid ranked queue.
page = 56 # int | Starts with page 1. (optional)

try:
    # Get all the league entries.
    api_response = api_instance.league_v4_get_league_entries(division, tier, queue, page=page)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LeagueV4Api->league_v4_get_league_entries: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **division** | **str**|  | 
 **tier** | **str**|  | 
 **queue** | **str**| Note that the queue value must be a valid ranked queue. | 
 **page** | **int**| Starts with page 1. | [optional] 

### Return type

[**list[LeagueV4LeagueEntryDTO]**](LeagueV4LeagueEntryDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **league_v4_get_league_entries_for_summoner**
> list[LeagueV4LeagueEntryDTO] league_v4_get_league_entries_for_summoner(encrypted_summoner_id)

Get league entries in all queues for a given summoner ID.

Get league entries in all queues for a given summoner ID.

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
api_instance = swagger_client.LeagueV4Api(swagger_client.ApiClient(configuration))
encrypted_summoner_id = 'encrypted_summoner_id_example' # str | 

try:
    # Get league entries in all queues for a given summoner ID.
    api_response = api_instance.league_v4_get_league_entries_for_summoner(encrypted_summoner_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LeagueV4Api->league_v4_get_league_entries_for_summoner: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encrypted_summoner_id** | **str**|  | 

### Return type

[**list[LeagueV4LeagueEntryDTO]**](LeagueV4LeagueEntryDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **league_v4_get_master_league**
> LeagueV4LeagueListDTO league_v4_get_master_league(queue)

Get the master league for given queue.

Get the master league for given queue.

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
api_instance = swagger_client.LeagueV4Api(swagger_client.ApiClient(configuration))
queue = 'queue_example' # str | 

try:
    # Get the master league for given queue.
    api_response = api_instance.league_v4_get_master_league(queue)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LeagueV4Api->league_v4_get_master_league: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue** | **str**|  | 

### Return type

[**LeagueV4LeagueListDTO**](LeagueV4LeagueListDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

