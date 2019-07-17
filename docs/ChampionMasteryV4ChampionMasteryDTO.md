# ChampionMasteryV4ChampionMasteryDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chest_granted** | **bool** | Is chest granted for this champion or not in current season. | [optional] 
**champion_level** | **int** | Champion level for specified player and champion combination. | [optional] 
**champion_points** | **int** | Total number of champion points for this player and champion combination - they are used to determine championLevel. | [optional] 
**champion_id** | **int** | Champion ID for this entry. | [optional] 
**champion_points_until_next_level** | **int** | Number of points needed to achieve next level. Zero if player reached maximum champion level for this champion. | [optional] 
**last_play_time** | **int** | Last time this champion was played by this player - in Unix milliseconds time format. | [optional] 
**tokens_earned** | **int** | The token earned for this champion to levelup. | [optional] 
**champion_points_since_last_level** | **int** | Number of points earned since current level has been achieved. | [optional] 
**summoner_id** | **str** | Summoner ID for this entry. (Encrypted) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


