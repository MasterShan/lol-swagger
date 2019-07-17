# RiotApi.MatchV4MatchDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seasonId** | **Number** | Please refer to the Game Constants documentation. | [optional] 
**queueId** | **Number** | Please refer to the Game Constants documentation. | [optional] 
**gameId** | **Number** |  | [optional] 
**participantIdentities** | [**[MatchV4ParticipantIdentityDto]**](MatchV4ParticipantIdentityDto.md) | Participant identity information. | [optional] 
**gameVersion** | **String** | The major.minor version typically indicates the patch the match was played on. | [optional] 
**platformId** | **String** | Platform where the match was played. | [optional] 
**gameMode** | **String** | Please refer to the Game Constants documentation. | [optional] 
**mapId** | **Number** | Please refer to the Game Constants documentation. | [optional] 
**gameType** | **String** | Please refer to the Game Constants documentation. | [optional] 
**teams** | [**[MatchV4TeamStatsDto]**](MatchV4TeamStatsDto.md) | Team information. | [optional] 
**participants** | [**[MatchV4ParticipantDto]**](MatchV4ParticipantDto.md) | Participant information. | [optional] 
**gameDuration** | **Number** | Match duration in seconds. | [optional] 
**gameCreation** | **Number** | Designates the timestamp when champion select ended and the loading screen appeared, NOT when the game timer was at 0:00. | [optional] 


