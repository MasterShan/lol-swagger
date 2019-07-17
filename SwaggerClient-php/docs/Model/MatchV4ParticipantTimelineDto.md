# MatchV4ParticipantTimelineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lane** | **string** | Participant&#39;s calculated lane. MID and BOT are legacy values.              (Legal values:  MID,  MIDDLE,  TOP,  JUNGLE,  BOT,  BOTTOM) | [optional] 
**participant_id** | **int** |  | [optional] 
**cs_diff_per_min_deltas** | **map[string,double]** | Creep score difference versus the calculated lane opponent(s) for a specified period. | [optional] 
**gold_per_min_deltas** | **map[string,double]** | Gold for a specified period. | [optional] 
**xp_diff_per_min_deltas** | **map[string,double]** | Experience difference versus the calculated lane opponent(s) for a specified period. | [optional] 
**creeps_per_min_deltas** | **map[string,double]** | Creeps for a specified period. | [optional] 
**xp_per_min_deltas** | **map[string,double]** | Experience change for a specified period. | [optional] 
**role** | **string** | Participant&#39;s calculated role.              (Legal values:  DUO,  NONE,  SOLO,  DUO_CARRY,  DUO_SUPPORT) | [optional] 
**damage_taken_diff_per_min_deltas** | **map[string,double]** | Damage taken difference versus the calculated lane opponent(s) for a specified period. | [optional] 
**damage_taken_per_min_deltas** | **map[string,double]** | Damage taken for a specified period. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


