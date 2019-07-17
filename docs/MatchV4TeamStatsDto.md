# RiotApi.MatchV4TeamStatsDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstDragon** | **Boolean** | Flag indicating whether or not the team scored the first Dragon kill. | [optional] 
**firstInhibitor** | **Boolean** | Flag indicating whether or not the team destroyed the first inhibitor. | [optional] 
**bans** | [**[MatchV4TeamBansDto]**](MatchV4TeamBansDto.md) | If match queueId has a draft, contains banned champion data, otherwise empty. | [optional] 
**baronKills** | **Number** | Number of times the team killed Baron. | [optional] 
**firstRiftHerald** | **Boolean** | Flag indicating whether or not the team scored the first Rift Herald kill. | [optional] 
**firstBaron** | **Boolean** | Flag indicating whether or not the team scored the first Baron kill. | [optional] 
**riftHeraldKills** | **Number** | Number of times the team killed Rift Herald. | [optional] 
**firstBlood** | **Boolean** | Flag indicating whether or not the team scored the first blood. | [optional] 
**teamId** | **Number** | 100 for blue side. 200 for red side. | [optional] 
**firstTower** | **Boolean** | Flag indicating whether or not the team destroyed the first tower. | [optional] 
**vilemawKills** | **Number** | Number of times the team killed Vilemaw. | [optional] 
**inhibitorKills** | **Number** | Number of inhibitors the team destroyed. | [optional] 
**towerKills** | **Number** | Number of towers the team destroyed. | [optional] 
**dominionVictoryScore** | **Number** | For Dominion matches, specifies the points the team had at game end. | [optional] 
**win** | **String** | String indicating whether or not the team won. There are only two values visibile in public match history.              (Legal values:  Fail,  Win) | [optional] 
**dragonKills** | **Number** | Number of times the team killed Dragon. | [optional] 


<a name="WinEnum"></a>
## Enum: WinEnum


* `Fail` (value: `"Fail"`)

* `Win` (value: `"Win"`)




