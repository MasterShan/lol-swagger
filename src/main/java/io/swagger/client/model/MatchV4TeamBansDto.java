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
 * MatchV4TeamBansDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T15:57:39.031+02:00")
public class MatchV4TeamBansDto {
  @SerializedName("pickTurn")
  private Integer pickTurn = null;

  @SerializedName("championId")
  private Integer championId = null;

  public MatchV4TeamBansDto pickTurn(Integer pickTurn) {
    this.pickTurn = pickTurn;
    return this;
  }

   /**
   * Turn during which the champion was banned.
   * @return pickTurn
  **/
  @ApiModelProperty(value = "Turn during which the champion was banned.")
  public Integer getPickTurn() {
    return pickTurn;
  }

  public void setPickTurn(Integer pickTurn) {
    this.pickTurn = pickTurn;
  }

  public MatchV4TeamBansDto championId(Integer championId) {
    this.championId = championId;
    return this;
  }

   /**
   * Banned championId.
   * @return championId
  **/
  @ApiModelProperty(value = "Banned championId.")
  public Integer getChampionId() {
    return championId;
  }

  public void setChampionId(Integer championId) {
    this.championId = championId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchV4TeamBansDto matchV4TeamBansDto = (MatchV4TeamBansDto) o;
    return Objects.equals(this.pickTurn, matchV4TeamBansDto.pickTurn) &&
        Objects.equals(this.championId, matchV4TeamBansDto.championId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pickTurn, championId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchV4TeamBansDto {\n");
    
    sb.append("    pickTurn: ").append(toIndentedString(pickTurn)).append("\n");
    sb.append("    championId: ").append(toIndentedString(championId)).append("\n");
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

