
# MatchMinusv4MatchDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seasonId** | **kotlin.Int** | Please refer to the Game Constants documentation. |  [optional]
**queueId** | **kotlin.Int** | Please refer to the Game Constants documentation. |  [optional]
**gameId** | **kotlin.Long** |  |  [optional]
**participantIdentities** | [**kotlin.Array&lt;MatchMinusv4ParticipantIdentityDto&gt;**](MatchMinusv4ParticipantIdentityDto.md) | Participant identity information. |  [optional]
**gameVersion** | **kotlin.String** | The major.minor version typically indicates the patch the match was played on. |  [optional]
**platformId** | **kotlin.String** | Platform where the match was played. |  [optional]
**gameMode** | **kotlin.String** | Please refer to the Game Constants documentation. |  [optional]
**mapId** | **kotlin.Int** | Please refer to the Game Constants documentation. |  [optional]
**gameType** | **kotlin.String** | Please refer to the Game Constants documentation. |  [optional]
**teams** | [**kotlin.Array&lt;MatchMinusv4TeamStatsDto&gt;**](MatchMinusv4TeamStatsDto.md) | Team information. |  [optional]
**participants** | [**kotlin.Array&lt;MatchMinusv4ParticipantDto&gt;**](MatchMinusv4ParticipantDto.md) | Participant information. |  [optional]
**gameDuration** | **kotlin.Long** | Match duration in seconds. |  [optional]
**gameCreation** | **kotlin.Long** | Designates the timestamp when champion select ended and the loading screen appeared, NOT when the game timer was at 0:00. |  [optional]



