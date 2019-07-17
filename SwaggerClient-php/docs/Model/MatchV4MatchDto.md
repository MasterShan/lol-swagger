# MatchV4MatchDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**season_id** | **int** | Please refer to the Game Constants documentation. | [optional] 
**queue_id** | **int** | Please refer to the Game Constants documentation. | [optional] 
**game_id** | **int** |  | [optional] 
**participant_identities** | [**\Swagger\Client\Model\MatchV4ParticipantIdentityDto[]**](MatchV4ParticipantIdentityDto.md) | Participant identity information. | [optional] 
**game_version** | **string** | The major.minor version typically indicates the patch the match was played on. | [optional] 
**platform_id** | **string** | Platform where the match was played. | [optional] 
**game_mode** | **string** | Please refer to the Game Constants documentation. | [optional] 
**map_id** | **int** | Please refer to the Game Constants documentation. | [optional] 
**game_type** | **string** | Please refer to the Game Constants documentation. | [optional] 
**teams** | [**\Swagger\Client\Model\MatchV4TeamStatsDto[]**](MatchV4TeamStatsDto.md) | Team information. | [optional] 
**participants** | [**\Swagger\Client\Model\MatchV4ParticipantDto[]**](MatchV4ParticipantDto.md) | Participant information. | [optional] 
**game_duration** | **int** | Match duration in seconds. | [optional] 
**game_creation** | **int** | Designates the timestamp when champion select ended and the loading screen appeared, NOT when the game timer was at 0:00. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


