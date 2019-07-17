
# ChampionMinusmasteryMinusv4ChampionMasteryDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chestGranted** | **kotlin.Boolean** | Is chest granted for this champion or not in current season. |  [optional]
**championLevel** | **kotlin.Int** | Champion level for specified player and champion combination. |  [optional]
**championPoints** | **kotlin.Int** | Total number of champion points for this player and champion combination - they are used to determine championLevel. |  [optional]
**championId** | **kotlin.Long** | Champion ID for this entry. |  [optional]
**championPointsUntilNextLevel** | **kotlin.Long** | Number of points needed to achieve next level. Zero if player reached maximum champion level for this champion. |  [optional]
**lastPlayTime** | **kotlin.Long** | Last time this champion was played by this player - in Unix milliseconds time format. |  [optional]
**tokensEarned** | **kotlin.Int** | The token earned for this champion to levelup. |  [optional]
**championPointsSinceLastLevel** | **kotlin.Long** | Number of points earned since current level has been achieved. |  [optional]
**summonerId** | **kotlin.String** | Summoner ID for this entry. (Encrypted) |  [optional]



