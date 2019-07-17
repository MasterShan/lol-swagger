
# MatchV4ParticipantTimelineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lane** | [**LaneEnum**](#LaneEnum) | Participant&#39;s calculated lane. MID and BOT are legacy values.              (Legal values:  MID,  MIDDLE,  TOP,  JUNGLE,  BOT,  BOTTOM) |  [optional]
**participantId** | **Integer** |  |  [optional]
**csDiffPerMinDeltas** | **Map&lt;String, Double&gt;** | Creep score difference versus the calculated lane opponent(s) for a specified period. |  [optional]
**goldPerMinDeltas** | **Map&lt;String, Double&gt;** | Gold for a specified period. |  [optional]
**xpDiffPerMinDeltas** | **Map&lt;String, Double&gt;** | Experience difference versus the calculated lane opponent(s) for a specified period. |  [optional]
**creepsPerMinDeltas** | **Map&lt;String, Double&gt;** | Creeps for a specified period. |  [optional]
**xpPerMinDeltas** | **Map&lt;String, Double&gt;** | Experience change for a specified period. |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Participant&#39;s calculated role.              (Legal values:  DUO,  NONE,  SOLO,  DUO_CARRY,  DUO_SUPPORT) |  [optional]
**damageTakenDiffPerMinDeltas** | **Map&lt;String, Double&gt;** | Damage taken difference versus the calculated lane opponent(s) for a specified period. |  [optional]
**damageTakenPerMinDeltas** | **Map&lt;String, Double&gt;** | Damage taken for a specified period. |  [optional]


<a name="LaneEnum"></a>
## Enum: LaneEnum
Name | Value
---- | -----
MID | &quot;MID&quot;
MIDDLE | &quot;MIDDLE&quot;
TOP | &quot;TOP&quot;
JUNGLE | &quot;JUNGLE&quot;
BOT | &quot;BOT&quot;
BOTTOM | &quot;BOTTOM&quot;


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
DUO | &quot;DUO&quot;
NONE | &quot;NONE&quot;
SOLO | &quot;SOLO&quot;
DUO_CARRY | &quot;DUO_CARRY&quot;
DUO_SUPPORT | &quot;DUO_SUPPORT&quot;



