# swagger_client.MatchV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**match_v4_get_match**](MatchV4Api.md#match_v4_get_match) | **GET** /lol/match/v4/matches/{matchId} | Get match by match ID.
[**match_v4_get_match_by_tournament_code**](MatchV4Api.md#match_v4_get_match_by_tournament_code) | **GET** /lol/match/v4/matches/{matchId}/by-tournament-code/{tournamentCode} | Get match by match ID and tournament code.
[**match_v4_get_match_ids_by_tournament_code**](MatchV4Api.md#match_v4_get_match_ids_by_tournament_code) | **GET** /lol/match/v4/matches/by-tournament-code/{tournamentCode}/ids | Get match IDs by tournament code.
[**match_v4_get_match_timeline**](MatchV4Api.md#match_v4_get_match_timeline) | **GET** /lol/match/v4/timelines/by-match/{matchId} | Get match timeline by match ID.
[**match_v4_get_matchlist**](MatchV4Api.md#match_v4_get_matchlist) | **GET** /lol/match/v4/matchlists/by-account/{encryptedAccountId} | Get matchlist for games played on given account ID and platform ID and filtered using given filter parameters, if any.


# **match_v4_get_match**
> MatchV4MatchDto match_v4_get_match(match_id)

Get match by match ID.

Get match by match ID.

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
api_instance = swagger_client.MatchV4Api(swagger_client.ApiClient(configuration))
match_id = 789 # int | The match ID.

try:
    # Get match by match ID.
    api_response = api_instance.match_v4_get_match(match_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MatchV4Api->match_v4_get_match: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **match_id** | **int**| The match ID. | 

### Return type

[**MatchV4MatchDto**](MatchV4MatchDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **match_v4_get_match_by_tournament_code**
> MatchV4MatchDto match_v4_get_match_by_tournament_code(tournament_code, match_id)

Get match by match ID and tournament code.

Get match by match ID and tournament code.

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
api_instance = swagger_client.MatchV4Api(swagger_client.ApiClient(configuration))
tournament_code = 'tournament_code_example' # str | The tournament code.
match_id = 789 # int | The match ID.

try:
    # Get match by match ID and tournament code.
    api_response = api_instance.match_v4_get_match_by_tournament_code(tournament_code, match_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MatchV4Api->match_v4_get_match_by_tournament_code: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_code** | **str**| The tournament code. | 
 **match_id** | **int**| The match ID. | 

### Return type

[**MatchV4MatchDto**](MatchV4MatchDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **match_v4_get_match_ids_by_tournament_code**
> list[int] match_v4_get_match_ids_by_tournament_code(tournament_code)

Get match IDs by tournament code.

Get match IDs by tournament code.

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
api_instance = swagger_client.MatchV4Api(swagger_client.ApiClient(configuration))
tournament_code = 'tournament_code_example' # str | The tournament code.

try:
    # Get match IDs by tournament code.
    api_response = api_instance.match_v4_get_match_ids_by_tournament_code(tournament_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MatchV4Api->match_v4_get_match_ids_by_tournament_code: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_code** | **str**| The tournament code. | 

### Return type

**list[int]**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **match_v4_get_match_timeline**
> MatchV4MatchTimelineDto match_v4_get_match_timeline(match_id)

Get match timeline by match ID.

Get match timeline by match ID. ## Implementation Notes Not all matches have timeline data.

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
api_instance = swagger_client.MatchV4Api(swagger_client.ApiClient(configuration))
match_id = 789 # int | The match ID.

try:
    # Get match timeline by match ID.
    api_response = api_instance.match_v4_get_match_timeline(match_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MatchV4Api->match_v4_get_match_timeline: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **match_id** | **int**| The match ID. | 

### Return type

[**MatchV4MatchTimelineDto**](MatchV4MatchTimelineDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **match_v4_get_matchlist**
> MatchV4MatchlistDto match_v4_get_matchlist(encrypted_account_id, champion=champion, queue=queue, season=season, end_time=end_time, begin_time=begin_time, end_index=end_index, begin_index=begin_index)

Get matchlist for games played on given account ID and platform ID and filtered using given filter parameters, if any.

Get matchlist for games played on given account ID and platform ID and filtered using given filter parameters, if any. ## Implementation Notes A number of optional parameters are provided for filtering. It is up to the caller to ensure that the combination of filter parameters provided is valid for the requested account, otherwise, no matches may be returned.  If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned.  If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account's match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned.

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
api_instance = swagger_client.MatchV4Api(swagger_client.ApiClient(configuration))
encrypted_account_id = 'encrypted_account_id_example' # str | The account ID.
champion = [56] # list[int] | Set of champion IDs for filtering the matchlist. (optional)
queue = [56] # list[int] | Set of queue IDs for filtering the matchlist. (optional)
season = [56] # list[int] | Set of season IDs for filtering the matchlist. (optional)
end_time = 789 # int | The end time to use for filtering matchlist specified as epoch milliseconds. If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account's match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned. (optional)
begin_time = 789 # int | The begin time to use for filtering matchlist specified as epoch milliseconds. If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account's match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned. (optional)
end_index = 56 # int | The end index to use for filtering matchlist. If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned. (optional)
begin_index = 56 # int | The begin index to use for filtering matchlist.  If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned. (optional)

try:
    # Get matchlist for games played on given account ID and platform ID and filtered using given filter parameters, if any.
    api_response = api_instance.match_v4_get_matchlist(encrypted_account_id, champion=champion, queue=queue, season=season, end_time=end_time, begin_time=begin_time, end_index=end_index, begin_index=begin_index)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MatchV4Api->match_v4_get_matchlist: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encrypted_account_id** | **str**| The account ID. | 
 **champion** | [**list[int]**](int.md)| Set of champion IDs for filtering the matchlist. | [optional] 
 **queue** | [**list[int]**](int.md)| Set of queue IDs for filtering the matchlist. | [optional] 
 **season** | [**list[int]**](int.md)| Set of season IDs for filtering the matchlist. | [optional] 
 **end_time** | **int**| The end time to use for filtering matchlist specified as epoch milliseconds. If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account&#39;s match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned. | [optional] 
 **begin_time** | **int**| The begin time to use for filtering matchlist specified as epoch milliseconds. If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account&#39;s match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned. | [optional] 
 **end_index** | **int**| The end index to use for filtering matchlist. If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned. | [optional] 
 **begin_index** | **int**| The begin index to use for filtering matchlist.  If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned. | [optional] 

### Return type

[**MatchV4MatchlistDto**](MatchV4MatchlistDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

