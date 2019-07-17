# SpectatorV4FeaturedGameInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**game_id** | **int** | The ID of the game | [optional] 
**game_start_time** | **int** | The game start time represented in epoch milliseconds | [optional] 
**platform_id** | **string** | The ID of the platform on which the game is being played | [optional] 
**game_mode** | **string** | The game mode              (Legal values:  CLASSIC,  ODIN,  ARAM,  TUTORIAL,  ONEFORALL,  ASCENSION,  FIRSTBLOOD,  KINGPORO) | [optional] 
**map_id** | **int** | The ID of the map | [optional] 
**game_type** | **string** | The game type              (Legal values:  CUSTOM_GAME,  MATCHED_GAME,  TUTORIAL_GAME) | [optional] 
**banned_champions** | [**\Swagger\Client\Model\SpectatorV4BannedChampion[]**](SpectatorV4BannedChampion.md) | Banned champion information | [optional] 
**observers** | [**\Swagger\Client\Model\SpectatorV4Observer**](SpectatorV4Observer.md) | The observer information | [optional] 
**participants** | [**\Swagger\Client\Model\SpectatorV4Participant[]**](SpectatorV4Participant.md) | The participant information | [optional] 
**game_length** | **int** | The amount of time in seconds that has passed since the game started | [optional] 
**game_queue_config_id** | **int** | The queue type (queue types are documented on the Game Constants page) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


