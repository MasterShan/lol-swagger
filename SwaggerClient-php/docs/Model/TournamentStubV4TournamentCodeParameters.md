# TournamentStubV4TournamentCodeParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**spectator_type** | **string** | The spectator type of the game.              (Legal values:  NONE,  LOBBYONLY,  ALL) | 
**team_size** | **int** | The team size of the game. Valid values are 1-5. | 
**pick_type** | **string** | The pick type of the game.              (Legal values:  BLIND_PICK,  DRAFT_MODE,  ALL_RANDOM,  TOURNAMENT_DRAFT) | 
**allowed_summoner_ids** | **string[]** | Optional list of encrypted summonerIds in order to validate the players eligible to join the lobby. NOTE: We currently do not enforce participants at the team level, but rather the aggregate of teamOne and teamTwo. We may add the ability to enforce at the team level in the future. | [optional] 
**map_type** | **string** | The map type of the game.              (Legal values:  SUMMONERS_RIFT,  TWISTED_TREELINE,  HOWLING_ABYSS) | 
**metadata** | **string** | Optional string that may contain any data in any format, if specified at all. Used to denote any custom information about the game. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


