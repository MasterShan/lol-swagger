# RiotApi.MatchV4ParticipantTimelineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lane** | **String** | Participant&#39;s calculated lane. MID and BOT are legacy values.              (Legal values:  MID,  MIDDLE,  TOP,  JUNGLE,  BOT,  BOTTOM) | [optional] 
**participantId** | **Number** |  | [optional] 
**csDiffPerMinDeltas** | **{String: Number}** | Creep score difference versus the calculated lane opponent(s) for a specified period. | [optional] 
**goldPerMinDeltas** | **{String: Number}** | Gold for a specified period. | [optional] 
**xpDiffPerMinDeltas** | **{String: Number}** | Experience difference versus the calculated lane opponent(s) for a specified period. | [optional] 
**creepsPerMinDeltas** | **{String: Number}** | Creeps for a specified period. | [optional] 
**xpPerMinDeltas** | **{String: Number}** | Experience change for a specified period. | [optional] 
**role** | **String** | Participant&#39;s calculated role.              (Legal values:  DUO,  NONE,  SOLO,  DUO_CARRY,  DUO_SUPPORT) | [optional] 
**damageTakenDiffPerMinDeltas** | **{String: Number}** | Damage taken difference versus the calculated lane opponent(s) for a specified period. | [optional] 
**damageTakenPerMinDeltas** | **{String: Number}** | Damage taken for a specified period. | [optional] 


<a name="LaneEnum"></a>
## Enum: LaneEnum


* `MID` (value: `"MID"`)

* `MIDDLE` (value: `"MIDDLE"`)

* `TOP` (value: `"TOP"`)

* `JUNGLE` (value: `"JUNGLE"`)

* `BOT` (value: `"BOT"`)

* `BOTTOM` (value: `"BOTTOM"`)




<a name="RoleEnum"></a>
## Enum: RoleEnum


* `DUO` (value: `"DUO"`)

* `NONE` (value: `"NONE"`)

* `SOLO` (value: `"SOLO"`)

* `DUO_CARRY` (value: `"DUO_CARRY"`)

* `DUO_SUPPORT` (value: `"DUO_SUPPORT"`)




