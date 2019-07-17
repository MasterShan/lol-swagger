/*
 * Riot API
 *  OpenAPI/Swagger version of the [Riot API](https://developer.riotgames.com/). Automatically generated daily. ## Download OpenAPI Spec File The following versions of the Riot API spec file are available: - `openapi-3.0.0.json` ([download file](../openapi-3.0.0.json), [view ui](?openapi-3.0.0.json)) - `openapi-3.0.0.min.json` ([download file](../openapi-3.0.0.min.json), [view ui](?openapi-3.0.0.min.json)) - `openapi-3.0.0.yml` ([download file](../openapi-3.0.0.yml), [view ui](?openapi-3.0.0.yml)) - `openapi-3.0.0.min.yml` ([download file](../openapi-3.0.0.min.yml), [view ui](?openapi-3.0.0.min.yml)) - `swaggerspec-2.0.json` ([download file](../swaggerspec-2.0.json), [view ui](?swaggerspec-2.0.json)) - `swaggerspec-2.0.min.json` ([download file](../swaggerspec-2.0.min.json), [view ui](?swaggerspec-2.0.min.json)) - `swaggerspec-2.0.yml` ([download file](../swaggerspec-2.0.yml), [view ui](?swaggerspec-2.0.yml)) - `swaggerspec-2.0.min.yml` ([download file](../swaggerspec-2.0.min.yml), [view ui](?swaggerspec-2.0.min.yml)) ## Source Code Source code on [GitHub](https://github.com/MingweiSamuel/riotapi-schema). Pull requests welcome! ## Automatically Generated Rebuilt on [Travis CI](https://travis-ci.org/MingweiSamuel/riotapi-schema/builds) daily. *** 
 *
 * OpenAPI spec version: dfa1c0f97b9cc62a43c9fb91daa1b91b3e9485c2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.LeagueV4MiniSeriesDTO;
import java.io.IOException;

/**
 * LeagueV4LeagueEntryDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T15:57:39.031+02:00")
public class LeagueV4LeagueEntryDTO {
  @SerializedName("queueType")
  private String queueType = null;

  @SerializedName("summonerName")
  private String summonerName = null;

  @SerializedName("hotStreak")
  private Boolean hotStreak = null;

  @SerializedName("miniSeries")
  private LeagueV4MiniSeriesDTO miniSeries = null;

  @SerializedName("wins")
  private Integer wins = null;

  @SerializedName("veteran")
  private Boolean veteran = null;

  @SerializedName("losses")
  private Integer losses = null;

  @SerializedName("rank")
  private String rank = null;

  @SerializedName("leagueId")
  private String leagueId = null;

  @SerializedName("inactive")
  private Boolean inactive = null;

  @SerializedName("freshBlood")
  private Boolean freshBlood = null;

  @SerializedName("tier")
  private String tier = null;

  @SerializedName("summonerId")
  private String summonerId = null;

  @SerializedName("leaguePoints")
  private Integer leaguePoints = null;

  public LeagueV4LeagueEntryDTO queueType(String queueType) {
    this.queueType = queueType;
    return this;
  }

   /**
   * Get queueType
   * @return queueType
  **/
  @ApiModelProperty(value = "")
  public String getQueueType() {
    return queueType;
  }

  public void setQueueType(String queueType) {
    this.queueType = queueType;
  }

  public LeagueV4LeagueEntryDTO summonerName(String summonerName) {
    this.summonerName = summonerName;
    return this;
  }

   /**
   * Get summonerName
   * @return summonerName
  **/
  @ApiModelProperty(value = "")
  public String getSummonerName() {
    return summonerName;
  }

  public void setSummonerName(String summonerName) {
    this.summonerName = summonerName;
  }

  public LeagueV4LeagueEntryDTO hotStreak(Boolean hotStreak) {
    this.hotStreak = hotStreak;
    return this;
  }

   /**
   * Get hotStreak
   * @return hotStreak
  **/
  @ApiModelProperty(value = "")
  public Boolean isHotStreak() {
    return hotStreak;
  }

  public void setHotStreak(Boolean hotStreak) {
    this.hotStreak = hotStreak;
  }

  public LeagueV4LeagueEntryDTO miniSeries(LeagueV4MiniSeriesDTO miniSeries) {
    this.miniSeries = miniSeries;
    return this;
  }

   /**
   * Get miniSeries
   * @return miniSeries
  **/
  @ApiModelProperty(value = "")
  public LeagueV4MiniSeriesDTO getMiniSeries() {
    return miniSeries;
  }

  public void setMiniSeries(LeagueV4MiniSeriesDTO miniSeries) {
    this.miniSeries = miniSeries;
  }

  public LeagueV4LeagueEntryDTO wins(Integer wins) {
    this.wins = wins;
    return this;
  }

   /**
   * Get wins
   * @return wins
  **/
  @ApiModelProperty(value = "")
  public Integer getWins() {
    return wins;
  }

  public void setWins(Integer wins) {
    this.wins = wins;
  }

  public LeagueV4LeagueEntryDTO veteran(Boolean veteran) {
    this.veteran = veteran;
    return this;
  }

   /**
   * Get veteran
   * @return veteran
  **/
  @ApiModelProperty(value = "")
  public Boolean isVeteran() {
    return veteran;
  }

  public void setVeteran(Boolean veteran) {
    this.veteran = veteran;
  }

  public LeagueV4LeagueEntryDTO losses(Integer losses) {
    this.losses = losses;
    return this;
  }

   /**
   * Get losses
   * @return losses
  **/
  @ApiModelProperty(value = "")
  public Integer getLosses() {
    return losses;
  }

  public void setLosses(Integer losses) {
    this.losses = losses;
  }

  public LeagueV4LeagueEntryDTO rank(String rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Get rank
   * @return rank
  **/
  @ApiModelProperty(value = "")
  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public LeagueV4LeagueEntryDTO leagueId(String leagueId) {
    this.leagueId = leagueId;
    return this;
  }

   /**
   * Get leagueId
   * @return leagueId
  **/
  @ApiModelProperty(value = "")
  public String getLeagueId() {
    return leagueId;
  }

  public void setLeagueId(String leagueId) {
    this.leagueId = leagueId;
  }

  public LeagueV4LeagueEntryDTO inactive(Boolean inactive) {
    this.inactive = inactive;
    return this;
  }

   /**
   * Get inactive
   * @return inactive
  **/
  @ApiModelProperty(value = "")
  public Boolean isInactive() {
    return inactive;
  }

  public void setInactive(Boolean inactive) {
    this.inactive = inactive;
  }

  public LeagueV4LeagueEntryDTO freshBlood(Boolean freshBlood) {
    this.freshBlood = freshBlood;
    return this;
  }

   /**
   * Get freshBlood
   * @return freshBlood
  **/
  @ApiModelProperty(value = "")
  public Boolean isFreshBlood() {
    return freshBlood;
  }

  public void setFreshBlood(Boolean freshBlood) {
    this.freshBlood = freshBlood;
  }

  public LeagueV4LeagueEntryDTO tier(String tier) {
    this.tier = tier;
    return this;
  }

   /**
   * Get tier
   * @return tier
  **/
  @ApiModelProperty(value = "")
  public String getTier() {
    return tier;
  }

  public void setTier(String tier) {
    this.tier = tier;
  }

  public LeagueV4LeagueEntryDTO summonerId(String summonerId) {
    this.summonerId = summonerId;
    return this;
  }

   /**
   * Player&#39;s summonerId (Encrypted)
   * @return summonerId
  **/
  @ApiModelProperty(value = "Player's summonerId (Encrypted)")
  public String getSummonerId() {
    return summonerId;
  }

  public void setSummonerId(String summonerId) {
    this.summonerId = summonerId;
  }

  public LeagueV4LeagueEntryDTO leaguePoints(Integer leaguePoints) {
    this.leaguePoints = leaguePoints;
    return this;
  }

   /**
   * Get leaguePoints
   * @return leaguePoints
  **/
  @ApiModelProperty(value = "")
  public Integer getLeaguePoints() {
    return leaguePoints;
  }

  public void setLeaguePoints(Integer leaguePoints) {
    this.leaguePoints = leaguePoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeagueV4LeagueEntryDTO leagueV4LeagueEntryDTO = (LeagueV4LeagueEntryDTO) o;
    return Objects.equals(this.queueType, leagueV4LeagueEntryDTO.queueType) &&
        Objects.equals(this.summonerName, leagueV4LeagueEntryDTO.summonerName) &&
        Objects.equals(this.hotStreak, leagueV4LeagueEntryDTO.hotStreak) &&
        Objects.equals(this.miniSeries, leagueV4LeagueEntryDTO.miniSeries) &&
        Objects.equals(this.wins, leagueV4LeagueEntryDTO.wins) &&
        Objects.equals(this.veteran, leagueV4LeagueEntryDTO.veteran) &&
        Objects.equals(this.losses, leagueV4LeagueEntryDTO.losses) &&
        Objects.equals(this.rank, leagueV4LeagueEntryDTO.rank) &&
        Objects.equals(this.leagueId, leagueV4LeagueEntryDTO.leagueId) &&
        Objects.equals(this.inactive, leagueV4LeagueEntryDTO.inactive) &&
        Objects.equals(this.freshBlood, leagueV4LeagueEntryDTO.freshBlood) &&
        Objects.equals(this.tier, leagueV4LeagueEntryDTO.tier) &&
        Objects.equals(this.summonerId, leagueV4LeagueEntryDTO.summonerId) &&
        Objects.equals(this.leaguePoints, leagueV4LeagueEntryDTO.leaguePoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueType, summonerName, hotStreak, miniSeries, wins, veteran, losses, rank, leagueId, inactive, freshBlood, tier, summonerId, leaguePoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeagueV4LeagueEntryDTO {\n");
    
    sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
    sb.append("    summonerName: ").append(toIndentedString(summonerName)).append("\n");
    sb.append("    hotStreak: ").append(toIndentedString(hotStreak)).append("\n");
    sb.append("    miniSeries: ").append(toIndentedString(miniSeries)).append("\n");
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
    sb.append("    veteran: ").append(toIndentedString(veteran)).append("\n");
    sb.append("    losses: ").append(toIndentedString(losses)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    leagueId: ").append(toIndentedString(leagueId)).append("\n");
    sb.append("    inactive: ").append(toIndentedString(inactive)).append("\n");
    sb.append("    freshBlood: ").append(toIndentedString(freshBlood)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    summonerId: ").append(toIndentedString(summonerId)).append("\n");
    sb.append("    leaguePoints: ").append(toIndentedString(leaguePoints)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

