
# TournamentMinusv4TournamentCodeUpdateParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**spectatorType** | [**inline**](#SpectatorTypeEnum) | The spectator type              (Legal values:  NONE,  LOBBYONLY,  ALL) | 
**pickType** | [**inline**](#PickTypeEnum) | The pick type              (Legal values:  BLIND_PICK,  DRAFT_MODE,  ALL_RANDOM,  TOURNAMENT_DRAFT) | 
**allowedSummonerIds** | **kotlin.Array&lt;kotlin.String&gt;** | Optional list of encrypted summonerIds in order to validate the players eligible to join the lobby. NOTE: We currently do not enforce participants at the team level, but rather the aggregate of teamOne and teamTwo. We may add the ability to enforce at the team level in the future. |  [optional]
**mapType** | [**inline**](#MapTypeEnum) | The map type              (Legal values:  SUMMONERS_RIFT,  TWISTED_TREELINE,  HOWLING_ABYSS) | 


<a name="SpectatorTypeEnum"></a>
## Enum: spectatorType
Name | Value
---- | -----
spectatorType | NONE, LOBBYONLY, ALL


<a name="PickTypeEnum"></a>
## Enum: pickType
Name | Value
---- | -----
pickType | BLIND_PICK, DRAFT_MODE, ALL_RANDOM, TOURNAMENT_DRAFT


<a name="MapTypeEnum"></a>
## Enum: mapType
Name | Value
---- | -----
mapType | SUMMONERS_RIFT, TWISTED_TREELINE, HOWLING_ABYSS



