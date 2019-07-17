
# SpectatorMinusv4FeaturedGameInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gameId** | **kotlin.Long** | The ID of the game |  [optional]
**gameStartTime** | **kotlin.Long** | The game start time represented in epoch milliseconds |  [optional]
**platformId** | **kotlin.String** | The ID of the platform on which the game is being played |  [optional]
**gameMode** | [**inline**](#GameModeEnum) | The game mode              (Legal values:  CLASSIC,  ODIN,  ARAM,  TUTORIAL,  ONEFORALL,  ASCENSION,  FIRSTBLOOD,  KINGPORO) |  [optional]
**mapId** | **kotlin.Long** | The ID of the map |  [optional]
**gameType** | [**inline**](#GameTypeEnum) | The game type              (Legal values:  CUSTOM_GAME,  MATCHED_GAME,  TUTORIAL_GAME) |  [optional]
**bannedChampions** | [**kotlin.Array&lt;SpectatorMinusv4BannedChampion&gt;**](SpectatorMinusv4BannedChampion.md) | Banned champion information |  [optional]
**observers** | [**SpectatorMinusv4Observer**](SpectatorMinusv4Observer.md) | The observer information |  [optional]
**participants** | [**kotlin.Array&lt;SpectatorMinusv4Participant&gt;**](SpectatorMinusv4Participant.md) | The participant information |  [optional]
**gameLength** | **kotlin.Long** | The amount of time in seconds that has passed since the game started |  [optional]
**gameQueueConfigId** | **kotlin.Long** | The queue type (queue types are documented on the Game Constants page) |  [optional]


<a name="GameModeEnum"></a>
## Enum: gameMode
Name | Value
---- | -----
gameMode | CLASSIC, ODIN, ARAM, TUTORIAL, ONEFORALL, ASCENSION, FIRSTBLOOD, KINGPORO


<a name="GameTypeEnum"></a>
## Enum: gameType
Name | Value
---- | -----
gameType | CUSTOM_GAME, MATCHED_GAME, TUTORIAL_GAME



