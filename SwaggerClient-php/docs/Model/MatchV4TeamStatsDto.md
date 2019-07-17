# MatchV4TeamStatsDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**first_dragon** | **bool** | Flag indicating whether or not the team scored the first Dragon kill. | [optional] 
**first_inhibitor** | **bool** | Flag indicating whether or not the team destroyed the first inhibitor. | [optional] 
**bans** | [**\Swagger\Client\Model\MatchV4TeamBansDto[]**](MatchV4TeamBansDto.md) | If match queueId has a draft, contains banned champion data, otherwise empty. | [optional] 
**baron_kills** | **int** | Number of times the team killed Baron. | [optional] 
**first_rift_herald** | **bool** | Flag indicating whether or not the team scored the first Rift Herald kill. | [optional] 
**first_baron** | **bool** | Flag indicating whether or not the team scored the first Baron kill. | [optional] 
**rift_herald_kills** | **int** | Number of times the team killed Rift Herald. | [optional] 
**first_blood** | **bool** | Flag indicating whether or not the team scored the first blood. | [optional] 
**team_id** | **int** | 100 for blue side. 200 for red side. | [optional] 
**first_tower** | **bool** | Flag indicating whether or not the team destroyed the first tower. | [optional] 
**vilemaw_kills** | **int** | Number of times the team killed Vilemaw. | [optional] 
**inhibitor_kills** | **int** | Number of inhibitors the team destroyed. | [optional] 
**tower_kills** | **int** | Number of towers the team destroyed. | [optional] 
**dominion_victory_score** | **int** | For Dominion matches, specifies the points the team had at game end. | [optional] 
**win** | **string** | String indicating whether or not the team won. There are only two values visibile in public match history.              (Legal values:  Fail,  Win) | [optional] 
**dragon_kills** | **int** | Number of times the team killed Dragon. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


