# RiotApi.ChampionMasteryV4ChampionMasteryDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chestGranted** | **Boolean** | Is chest granted for this champion or not in current season. | [optional] 
**championLevel** | **Number** | Champion level for specified player and champion combination. | [optional] 
**championPoints** | **Number** | Total number of champion points for this player and champion combination - they are used to determine championLevel. | [optional] 
**championId** | **Number** | Champion ID for this entry. | [optional] 
**championPointsUntilNextLevel** | **Number** | Number of points needed to achieve next level. Zero if player reached maximum champion level for this champion. | [optional] 
**lastPlayTime** | **Number** | Last time this champion was played by this player - in Unix milliseconds time format. | [optional] 
**tokensEarned** | **Number** | The token earned for this champion to levelup. | [optional] 
**championPointsSinceLastLevel** | **Number** | Number of points earned since current level has been achieved. | [optional] 
**summonerId** | **String** | Summoner ID for this entry. (Encrypted) | [optional] 


