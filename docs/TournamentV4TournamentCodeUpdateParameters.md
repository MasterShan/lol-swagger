# RiotApi.TournamentV4TournamentCodeUpdateParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**spectatorType** | **String** | The spectator type              (Legal values:  NONE,  LOBBYONLY,  ALL) | 
**pickType** | **String** | The pick type              (Legal values:  BLIND_PICK,  DRAFT_MODE,  ALL_RANDOM,  TOURNAMENT_DRAFT) | 
**allowedSummonerIds** | **[String]** | Optional list of encrypted summonerIds in order to validate the players eligible to join the lobby. NOTE: We currently do not enforce participants at the team level, but rather the aggregate of teamOne and teamTwo. We may add the ability to enforce at the team level in the future. | [optional] 
**mapType** | **String** | The map type              (Legal values:  SUMMONERS_RIFT,  TWISTED_TREELINE,  HOWLING_ABYSS) | 


<a name="SpectatorTypeEnum"></a>
## Enum: SpectatorTypeEnum


* `NONE` (value: `"NONE"`)

* `LOBBYONLY` (value: `"LOBBYONLY"`)

* `ALL` (value: `"ALL"`)




<a name="PickTypeEnum"></a>
## Enum: PickTypeEnum


* `BLIND_PICK` (value: `"BLIND_PICK"`)

* `DRAFT_MODE` (value: `"DRAFT_MODE"`)

* `ALL_RANDOM` (value: `"ALL_RANDOM"`)

* `TOURNAMENT_DRAFT` (value: `"TOURNAMENT_DRAFT"`)




<a name="MapTypeEnum"></a>
## Enum: MapTypeEnum


* `SUMMONERS_RIFT` (value: `"SUMMONERS_RIFT"`)

* `TWISTED_TREELINE` (value: `"TWISTED_TREELINE"`)

* `HOWLING_ABYSS` (value: `"HOWLING_ABYSS"`)




