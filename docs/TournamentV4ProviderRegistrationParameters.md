
# TournamentV4ProviderRegistrationParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | The provider&#39;s callback URL to which tournament game results in this region should be posted. The URL must be well-formed, use the http or https protocol, and use the default port for the protocol (http URLs must use port 80, https URLs must use port 443). | 
**region** | [**RegionEnum**](#RegionEnum) | The region in which the provider will be running tournaments.              (Legal values:  BR,  EUNE,  EUW,  JP,  LAN,  LAS,  NA,  OCE,  PBE,  RU,  TR) | 


<a name="RegionEnum"></a>
## Enum: RegionEnum
Name | Value
---- | -----
BR | &quot;BR&quot;
EUNE | &quot;EUNE&quot;
EUW | &quot;EUW&quot;
JP | &quot;JP&quot;
LAN | &quot;LAN&quot;
LAS | &quot;LAS&quot;
NA | &quot;NA&quot;
OCE | &quot;OCE&quot;
PBE | &quot;PBE&quot;
RU | &quot;RU&quot;
TR | &quot;TR&quot;



