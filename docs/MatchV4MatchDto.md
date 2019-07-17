
# MatchV4MatchDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seasonId** | **Integer** | Please refer to the Game Constants documentation. |  [optional]
**queueId** | **Integer** | Please refer to the Game Constants documentation. |  [optional]
**gameId** | **Long** |  |  [optional]
**participantIdentities** | [**List&lt;MatchV4ParticipantIdentityDto&gt;**](MatchV4ParticipantIdentityDto.md) | Participant identity information. |  [optional]
**gameVersion** | **String** | The major.minor version typically indicates the patch the match was played on. |  [optional]
**platformId** | **String** | Platform where the match was played. |  [optional]
**gameMode** | **String** | Please refer to the Game Constants documentation. |  [optional]
**mapId** | **Integer** | Please refer to the Game Constants documentation. |  [optional]
**gameType** | **String** | Please refer to the Game Constants documentation. |  [optional]
**teams** | [**List&lt;MatchV4TeamStatsDto&gt;**](MatchV4TeamStatsDto.md) | Team information. |  [optional]
**participants** | [**List&lt;MatchV4ParticipantDto&gt;**](MatchV4ParticipantDto.md) | Participant information. |  [optional]
**gameDuration** | **Long** | Match duration in seconds. |  [optional]
**gameCreation** | **Long** | Designates the timestamp when champion select ended and the loading screen appeared, NOT when the game timer was at 0:00. |  [optional]



