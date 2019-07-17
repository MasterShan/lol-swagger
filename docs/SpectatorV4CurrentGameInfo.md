# SpectatorV4CurrentGameInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**game_id** | **int** | The ID of the game | [optional] 
**game_start_time** | **int** | The game start time represented in epoch milliseconds | [optional] 
**platform_id** | **str** | The ID of the platform on which the game is being played | [optional] 
**game_mode** | **str** | The game mode | [optional] 
**map_id** | **int** | The ID of the map | [optional] 
**game_type** | **str** | The game type | [optional] 
**banned_champions** | [**list[SpectatorV4BannedChampion]**](SpectatorV4BannedChampion.md) | Banned champion information | [optional] 
**observers** | [**SpectatorV4Observer**](SpectatorV4Observer.md) | The observer information | [optional] 
**participants** | [**list[SpectatorV4CurrentGameParticipant]**](SpectatorV4CurrentGameParticipant.md) | The participant information | [optional] 
**game_length** | **int** | The amount of time in seconds that has passed since the game started | [optional] 
**game_queue_config_id** | **int** | The queue type (queue types are documented on the Game Constants page) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


