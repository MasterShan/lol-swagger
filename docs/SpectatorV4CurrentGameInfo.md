
# SpectatorV4CurrentGameInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gameId** | **Long** | The ID of the game |  [optional]
**gameStartTime** | **Long** | The game start time represented in epoch milliseconds |  [optional]
**platformId** | **String** | The ID of the platform on which the game is being played |  [optional]
**gameMode** | **String** | The game mode |  [optional]
**mapId** | **Long** | The ID of the map |  [optional]
**gameType** | **String** | The game type |  [optional]
**bannedChampions** | [**List&lt;SpectatorV4BannedChampion&gt;**](SpectatorV4BannedChampion.md) | Banned champion information |  [optional]
**observers** | [**SpectatorV4Observer**](SpectatorV4Observer.md) | The observer information |  [optional]
**participants** | [**List&lt;SpectatorV4CurrentGameParticipant&gt;**](SpectatorV4CurrentGameParticipant.md) | The participant information |  [optional]
**gameLength** | **Long** | The amount of time in seconds that has passed since the game started |  [optional]
**gameQueueConfigId** | **Long** | The queue type (queue types are documented on the Game Constants page) |  [optional]



