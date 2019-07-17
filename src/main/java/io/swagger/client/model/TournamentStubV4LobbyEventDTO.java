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
 * TournamentStubV4LobbyEventDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T15:57:39.031+02:00")
public class TournamentStubV4LobbyEventDTO {
  @SerializedName("eventType")
  private String eventType = null;

  @SerializedName("summonerId")
  private String summonerId = null;

  @SerializedName("timestamp")
  private String timestamp = null;

  public TournamentStubV4LobbyEventDTO eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * The type of event that was triggered
   * @return eventType
  **/
  @ApiModelProperty(value = "The type of event that was triggered")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public TournamentStubV4LobbyEventDTO summonerId(String summonerId) {
    this.summonerId = summonerId;
    return this;
  }

   /**
   * The summonerId that triggered the event (Encrypted)
   * @return summonerId
  **/
  @ApiModelProperty(value = "The summonerId that triggered the event (Encrypted)")
  public String getSummonerId() {
    return summonerId;
  }

  public void setSummonerId(String summonerId) {
    this.summonerId = summonerId;
  }

  public TournamentStubV4LobbyEventDTO timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp from the event
   * @return timestamp
  **/
  @ApiModelProperty(value = "Timestamp from the event")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TournamentStubV4LobbyEventDTO tournamentStubV4LobbyEventDTO = (TournamentStubV4LobbyEventDTO) o;
    return Objects.equals(this.eventType, tournamentStubV4LobbyEventDTO.eventType) &&
        Objects.equals(this.summonerId, tournamentStubV4LobbyEventDTO.summonerId) &&
        Objects.equals(this.timestamp, tournamentStubV4LobbyEventDTO.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, summonerId, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TournamentStubV4LobbyEventDTO {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    summonerId: ").append(toIndentedString(summonerId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

