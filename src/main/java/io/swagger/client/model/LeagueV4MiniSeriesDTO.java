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
import java.io.IOException;

/**
 * LeagueV4MiniSeriesDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T15:57:39.031+02:00")
public class LeagueV4MiniSeriesDTO {
  @SerializedName("progress")
  private String progress = null;

  @SerializedName("losses")
  private Integer losses = null;

  @SerializedName("target")
  private Integer target = null;

  @SerializedName("wins")
  private Integer wins = null;

  public LeagueV4MiniSeriesDTO progress(String progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @ApiModelProperty(value = "")
  public String getProgress() {
    return progress;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }

  public LeagueV4MiniSeriesDTO losses(Integer losses) {
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

  public LeagueV4MiniSeriesDTO target(Integer target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(value = "")
  public Integer getTarget() {
    return target;
  }

  public void setTarget(Integer target) {
    this.target = target;
  }

  public LeagueV4MiniSeriesDTO wins(Integer wins) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeagueV4MiniSeriesDTO leagueV4MiniSeriesDTO = (LeagueV4MiniSeriesDTO) o;
    return Objects.equals(this.progress, leagueV4MiniSeriesDTO.progress) &&
        Objects.equals(this.losses, leagueV4MiniSeriesDTO.losses) &&
        Objects.equals(this.target, leagueV4MiniSeriesDTO.target) &&
        Objects.equals(this.wins, leagueV4MiniSeriesDTO.wins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(progress, losses, target, wins);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeagueV4MiniSeriesDTO {\n");
    
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    losses: ").append(toIndentedString(losses)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
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
