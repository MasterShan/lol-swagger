
# SpectatorMinusv4CurrentGameInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gameId** | **kotlin.Long** | The ID of the game |  [optional]
**gameStartTime** | **kotlin.Long** | The game start time represented in epoch milliseconds |  [optional]
**platformId** | **kotlin.String** | The ID of the platform on which the game is being played |  [optional]
**gameMode** | **kotlin.String** | The game mode |  [optional]
**mapId** | **kotlin.Long** | The ID of the map |  [optional]
**gameType** | **kotlin.String** | The game type |  [optional]
**bannedChampions** | [**kotlin.Array&lt;SpectatorMinusv4BannedChampion&gt;**](SpectatorMinusv4BannedChampion.md) | Banned champion information |  [optional]
**observers** | [**SpectatorMinusv4Observer**](SpectatorMinusv4Observer.md) | The observer information |  [optional]
**participants** | [**kotlin.Array&lt;SpectatorMinusv4CurrentGameParticipant&gt;**](SpectatorMinusv4CurrentGameParticipant.md) | The participant information |  [optional]
**gameLength** | **kotlin.Long** | The amount of time in seconds that has passed since the game started |  [optional]
**gameQueueConfigId** | **kotlin.Long** | The queue type (queue types are documented on the Game Constants page) |  [optional]



