# RiotApi.SpectatorV4FeaturedGameInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gameId** | **Number** | The ID of the game | [optional] 
**gameStartTime** | **Number** | The game start time represented in epoch milliseconds | [optional] 
**platformId** | **String** | The ID of the platform on which the game is being played | [optional] 
**gameMode** | **String** | The game mode              (Legal values:  CLASSIC,  ODIN,  ARAM,  TUTORIAL,  ONEFORALL,  ASCENSION,  FIRSTBLOOD,  KINGPORO) | [optional] 
**mapId** | **Number** | The ID of the map | [optional] 
**gameType** | **String** | The game type              (Legal values:  CUSTOM_GAME,  MATCHED_GAME,  TUTORIAL_GAME) | [optional] 
**bannedChampions** | [**[SpectatorV4BannedChampion]**](SpectatorV4BannedChampion.md) | Banned champion information | [optional] 
**observers** | [**SpectatorV4Observer**](SpectatorV4Observer.md) | The observer information | [optional] 
**participants** | [**[SpectatorV4Participant]**](SpectatorV4Participant.md) | The participant information | [optional] 
**gameLength** | **Number** | The amount of time in seconds that has passed since the game started | [optional] 
**gameQueueConfigId** | **Number** | The queue type (queue types are documented on the Game Constants page) | [optional] 


<a name="GameModeEnum"></a>
## Enum: GameModeEnum


* `CLASSIC` (value: `"CLASSIC"`)

* `ODIN` (value: `"ODIN"`)

* `ARAM` (value: `"ARAM"`)

* `TUTORIAL` (value: `"TUTORIAL"`)

* `ONEFORALL` (value: `"ONEFORALL"`)

* `ASCENSION` (value: `"ASCENSION"`)

* `FIRSTBLOOD` (value: `"FIRSTBLOOD"`)

* `KINGPORO` (value: `"KINGPORO"`)




<a name="GameTypeEnum"></a>
## Enum: GameTypeEnum


* `CUSTOM_GAME` (value: `"CUSTOM_GAME"`)

* `MATCHED_GAME` (value: `"MATCHED_GAME"`)

* `TUTORIAL_GAME` (value: `"TUTORIAL_GAME"`)




