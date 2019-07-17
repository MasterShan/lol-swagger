
# TournamentV4TournamentCodeParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**spectatorType** | [**SpectatorTypeEnum**](#SpectatorTypeEnum) | The spectator type of the game.              (Legal values:  NONE,  LOBBYONLY,  ALL) | 
**teamSize** | **Integer** | The team size of the game. Valid values are 1-5. | 
**pickType** | [**PickTypeEnum**](#PickTypeEnum) | The pick type of the game.              (Legal values:  BLIND_PICK,  DRAFT_MODE,  ALL_RANDOM,  TOURNAMENT_DRAFT) | 
**allowedSummonerIds** | **List&lt;String&gt;** | Optional list of encrypted summonerIds in order to validate the players eligible to join the lobby. NOTE: We currently do not enforce participants at the team level, but rather the aggregate of teamOne and teamTwo. We may add the ability to enforce at the team level in the future. |  [optional]
**mapType** | [**MapTypeEnum**](#MapTypeEnum) | The map type of the game.              (Legal values:  SUMMONERS_RIFT,  TWISTED_TREELINE,  HOWLING_ABYSS) | 
**metadata** | **String** | Optional string that may contain any data in any format, if specified at all. Used to denote any custom information about the game. |  [optional]


<a name="SpectatorTypeEnum"></a>
## Enum: SpectatorTypeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
LOBBYONLY | &quot;LOBBYONLY&quot;
ALL | &quot;ALL&quot;


<a name="PickTypeEnum"></a>
## Enum: PickTypeEnum
Name | Value
---- | -----
BLIND_PICK | &quot;BLIND_PICK&quot;
DRAFT_MODE | &quot;DRAFT_MODE&quot;
ALL_RANDOM | &quot;ALL_RANDOM&quot;
TOURNAMENT_DRAFT | &quot;TOURNAMENT_DRAFT&quot;


<a name="MapTypeEnum"></a>
## Enum: MapTypeEnum
Name | Value
---- | -----
SUMMONERS_RIFT | &quot;SUMMONERS_RIFT&quot;
TWISTED_TREELINE | &quot;TWISTED_TREELINE&quot;
HOWLING_ABYSS | &quot;HOWLING_ABYSS&quot;



