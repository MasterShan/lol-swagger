
# ChampionMasteryV4ChampionMasteryDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chestGranted** | **Boolean** | Is chest granted for this champion or not in current season. |  [optional]
**championLevel** | **Integer** | Champion level for specified player and champion combination. |  [optional]
**championPoints** | **Integer** | Total number of champion points for this player and champion combination - they are used to determine championLevel. |  [optional]
**championId** | **Long** | Champion ID for this entry. |  [optional]
**championPointsUntilNextLevel** | **Long** | Number of points needed to achieve next level. Zero if player reached maximum champion level for this champion. |  [optional]
**lastPlayTime** | **Long** | Last time this champion was played by this player - in Unix milliseconds time format. |  [optional]
**tokensEarned** | **Integer** | The token earned for this champion to levelup. |  [optional]
**championPointsSinceLastLevel** | **Long** | Number of points earned since current level has been achieved. |  [optional]
**summonerId** | **String** | Summoner ID for this entry. (Encrypted) |  [optional]



