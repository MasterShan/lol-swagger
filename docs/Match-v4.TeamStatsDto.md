
# MatchMinusv4TeamStatsDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstDragon** | **kotlin.Boolean** | Flag indicating whether or not the team scored the first Dragon kill. |  [optional]
**firstInhibitor** | **kotlin.Boolean** | Flag indicating whether or not the team destroyed the first inhibitor. |  [optional]
**bans** | [**kotlin.Array&lt;MatchMinusv4TeamBansDto&gt;**](MatchMinusv4TeamBansDto.md) | If match queueId has a draft, contains banned champion data, otherwise empty. |  [optional]
**baronKills** | **kotlin.Int** | Number of times the team killed Baron. |  [optional]
**firstRiftHerald** | **kotlin.Boolean** | Flag indicating whether or not the team scored the first Rift Herald kill. |  [optional]
**firstBaron** | **kotlin.Boolean** | Flag indicating whether or not the team scored the first Baron kill. |  [optional]
**riftHeraldKills** | **kotlin.Int** | Number of times the team killed Rift Herald. |  [optional]
**firstBlood** | **kotlin.Boolean** | Flag indicating whether or not the team scored the first blood. |  [optional]
**teamId** | **kotlin.Int** | 100 for blue side. 200 for red side. |  [optional]
**firstTower** | **kotlin.Boolean** | Flag indicating whether or not the team destroyed the first tower. |  [optional]
**vilemawKills** | **kotlin.Int** | Number of times the team killed Vilemaw. |  [optional]
**inhibitorKills** | **kotlin.Int** | Number of inhibitors the team destroyed. |  [optional]
**towerKills** | **kotlin.Int** | Number of towers the team destroyed. |  [optional]
**dominionVictoryScore** | **kotlin.Int** | For Dominion matches, specifies the points the team had at game end. |  [optional]
**win** | [**inline**](#WinEnum) | String indicating whether or not the team won. There are only two values visibile in public match history.              (Legal values:  Fail,  Win) |  [optional]
**dragonKills** | **kotlin.Int** | Number of times the team killed Dragon. |  [optional]


<a name="WinEnum"></a>
## Enum: win
Name | Value
---- | -----
win | Fail, Win



