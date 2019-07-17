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
import io.swagger.client.model.MatchV4MatchEventDto;
import io.swagger.client.model.MatchV4MatchParticipantFrameDto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MatchV4MatchFrameDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T15:57:39.031+02:00")
public class MatchV4MatchFrameDto {
  @SerializedName("timestamp")
  private Long timestamp = null;

  @SerializedName("participantFrames")
  private Map<String, MatchV4MatchParticipantFrameDto> participantFrames = null;

  @SerializedName("events")
  private List<MatchV4MatchEventDto> events = null;

  public MatchV4MatchFrameDto timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public MatchV4MatchFrameDto participantFrames(Map<String, MatchV4MatchParticipantFrameDto> participantFrames) {
    this.participantFrames = participantFrames;
    return this;
  }

  public MatchV4MatchFrameDto putParticipantFramesItem(String key, MatchV4MatchParticipantFrameDto participantFramesItem) {
    if (this.participantFrames == null) {
      this.participantFrames = new HashMap<String, MatchV4MatchParticipantFrameDto>();
    }
    this.participantFrames.put(key, participantFramesItem);
    return this;
  }

   /**
   * Get participantFrames
   * @return participantFrames
  **/
  @ApiModelProperty(value = "")
  public Map<String, MatchV4MatchParticipantFrameDto> getParticipantFrames() {
    return participantFrames;
  }

  public void setParticipantFrames(Map<String, MatchV4MatchParticipantFrameDto> participantFrames) {
    this.participantFrames = participantFrames;
  }

  public MatchV4MatchFrameDto events(List<MatchV4MatchEventDto> events) {
    this.events = events;
    return this;
  }

  public MatchV4MatchFrameDto addEventsItem(MatchV4MatchEventDto eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<MatchV4MatchEventDto>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(value = "")
  public List<MatchV4MatchEventDto> getEvents() {
    return events;
  }

  public void setEvents(List<MatchV4MatchEventDto> events) {
    this.events = events;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchV4MatchFrameDto matchV4MatchFrameDto = (MatchV4MatchFrameDto) o;
    return Objects.equals(this.timestamp, matchV4MatchFrameDto.timestamp) &&
        Objects.equals(this.participantFrames, matchV4MatchFrameDto.participantFrames) &&
        Objects.equals(this.events, matchV4MatchFrameDto.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, participantFrames, events);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchV4MatchFrameDto {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    participantFrames: ").append(toIndentedString(participantFrames)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
