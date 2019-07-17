# MatchV4MatchDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**season_id** | **int** | Please refer to the Game Constants documentation. | [optional] 
**queue_id** | **int** | Please refer to the Game Constants documentation. | [optional] 
**game_id** | **int** |  | [optional] 
**participant_identities** | [**list[MatchV4ParticipantIdentityDto]**](MatchV4ParticipantIdentityDto.md) | Participant identity information. | [optional] 
**game_version** | **str** | The major.minor version typically indicates the patch the match was played on. | [optional] 
**platform_id** | **str** | Platform where the match was played. | [optional] 
**game_mode** | **str** | Please refer to the Game Constants documentation. | [optional] 
**map_id** | **int** | Please refer to the Game Constants documentation. | [optional] 
**game_type** | **str** | Please refer to the Game Constants documentation. | [optional] 
**teams** | [**list[MatchV4TeamStatsDto]**](MatchV4TeamStatsDto.md) | Team information. | [optional] 
**participants** | [**list[MatchV4ParticipantDto]**](MatchV4ParticipantDto.md) | Participant information. | [optional] 
**game_duration** | **int** | Match duration in seconds. | [optional] 
**game_creation** | **int** | Designates the timestamp when champion select ended and the loading screen appeared, NOT when the game timer was at 0:00. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


