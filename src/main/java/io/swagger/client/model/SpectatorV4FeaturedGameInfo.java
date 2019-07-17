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
import io.swagger.client.model.SpectatorV4BannedChampion;
import io.swagger.client.model.SpectatorV4Observer;
import io.swagger.client.model.SpectatorV4Participant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SpectatorV4FeaturedGameInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T15:57:39.031+02:00")
public class SpectatorV4FeaturedGameInfo {
  @SerializedName("gameId")
  private Long gameId = null;

  @SerializedName("gameStartTime")
  private Long gameStartTime = null;

  @SerializedName("platformId")
  private String platformId = null;

  /**
   * The game mode              (Legal values:  CLASSIC,  ODIN,  ARAM,  TUTORIAL,  ONEFORALL,  ASCENSION,  FIRSTBLOOD,  KINGPORO)
   */
  @JsonAdapter(GameModeEnum.Adapter.class)
  public enum GameModeEnum {
    CLASSIC("CLASSIC"),
    
    ODIN("ODIN"),
    
    ARAM("ARAM"),
    
    TUTORIAL("TUTORIAL"),
    
    ONEFORALL("ONEFORALL"),
    
    ASCENSION("ASCENSION"),
    
    FIRSTBLOOD("FIRSTBLOOD"),
    
    KINGPORO("KINGPORO");

    private String value;

    GameModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GameModeEnum fromValue(String text) {
      for (GameModeEnum b : GameModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GameModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GameModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GameModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GameModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("gameMode")
  private GameModeEnum gameMode = null;

  @SerializedName("mapId")
  private Long mapId = null;

  /**
   * The game type              (Legal values:  CUSTOM_GAME,  MATCHED_GAME,  TUTORIAL_GAME)
   */
  @JsonAdapter(GameTypeEnum.Adapter.class)
  public enum GameTypeEnum {
    CUSTOM_GAME("CUSTOM_GAME"),
    
    MATCHED_GAME("MATCHED_GAME"),
    
    TUTORIAL_GAME("TUTORIAL_GAME");

    private String value;

    GameTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GameTypeEnum fromValue(String text) {
      for (GameTypeEnum b : GameTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GameTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GameTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GameTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GameTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("gameType")
  private GameTypeEnum gameType = null;

  @SerializedName("bannedChampions")
  private List<SpectatorV4BannedChampion> bannedChampions = null;

  @SerializedName("observers")
  private SpectatorV4Observer observers = null;

  @SerializedName("participants")
  private List<SpectatorV4Participant> participants = null;

  @SerializedName("gameLength")
  private Long gameLength = null;

  @SerializedName("gameQueueConfigId")
  private Long gameQueueConfigId = null;

  public SpectatorV4FeaturedGameInfo gameId(Long gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * The ID of the game
   * @return gameId
  **/
  @ApiModelProperty(value = "The ID of the game")
  public Long getGameId() {
    return gameId;
  }

  public void setGameId(Long gameId) {
    this.gameId = gameId;
  }

  public SpectatorV4FeaturedGameInfo gameStartTime(Long gameStartTime) {
    this.gameStartTime = gameStartTime;
    return this;
  }

   /**
   * The game start time represented in epoch milliseconds
   * @return gameStartTime
  **/
  @ApiModelProperty(value = "The game start time represented in epoch milliseconds")
  public Long getGameStartTime() {
    return gameStartTime;
  }

  public void setGameStartTime(Long gameStartTime) {
    this.gameStartTime = gameStartTime;
  }

  public SpectatorV4FeaturedGameInfo platformId(String platformId) {
    this.platformId = platformId;
    return this;
  }

   /**
   * The ID of the platform on which the game is being played
   * @return platformId
  **/
  @ApiModelProperty(value = "The ID of the platform on which the game is being played")
  public String getPlatformId() {
    return platformId;
  }

  public void setPlatformId(String platformId) {
    this.platformId = platformId;
  }

  public SpectatorV4FeaturedGameInfo gameMode(GameModeEnum gameMode) {
    this.gameMode = gameMode;
    return this;
  }

   /**
   * The game mode              (Legal values:  CLASSIC,  ODIN,  ARAM,  TUTORIAL,  ONEFORALL,  ASCENSION,  FIRSTBLOOD,  KINGPORO)
   * @return gameMode
  **/
  @ApiModelProperty(value = "The game mode              (Legal values:  CLASSIC,  ODIN,  ARAM,  TUTORIAL,  ONEFORALL,  ASCENSION,  FIRSTBLOOD,  KINGPORO)")
  public GameModeEnum getGameMode() {
    return gameMode;
  }

  public void setGameMode(GameModeEnum gameMode) {
    this.gameMode = gameMode;
  }

  public SpectatorV4FeaturedGameInfo mapId(Long mapId) {
    this.mapId = mapId;
    return this;
  }

   /**
   * The ID of the map
   * @return mapId
  **/
  @ApiModelProperty(value = "The ID of the map")
  public Long getMapId() {
    return mapId;
  }

  public void setMapId(Long mapId) {
    this.mapId = mapId;
  }

  public SpectatorV4FeaturedGameInfo gameType(GameTypeEnum gameType) {
    this.gameType = gameType;
    return this;
  }

   /**
   * The game type              (Legal values:  CUSTOM_GAME,  MATCHED_GAME,  TUTORIAL_GAME)
   * @return gameType
  **/
  @ApiModelProperty(value = "The game type              (Legal values:  CUSTOM_GAME,  MATCHED_GAME,  TUTORIAL_GAME)")
  public GameTypeEnum getGameType() {
    return gameType;
  }

  public void setGameType(GameTypeEnum gameType) {
    this.gameType = gameType;
  }

  public SpectatorV4FeaturedGameInfo bannedChampions(List<SpectatorV4BannedChampion> bannedChampions) {
    this.bannedChampions = bannedChampions;
    return this;
  }

  public SpectatorV4FeaturedGameInfo addBannedChampionsItem(SpectatorV4BannedChampion bannedChampionsItem) {
    if (this.bannedChampions == null) {
      this.bannedChampions = new ArrayList<SpectatorV4BannedChampion>();
    }
    this.bannedChampions.add(bannedChampionsItem);
    return this;
  }

   /**
   * Banned champion information
   * @return bannedChampions
  **/
  @ApiModelProperty(value = "Banned champion information")
  public List<SpectatorV4BannedChampion> getBannedChampions() {
    return bannedChampions;
  }

  public void setBannedChampions(List<SpectatorV4BannedChampion> bannedChampions) {
    this.bannedChampions = bannedChampions;
  }

  public SpectatorV4FeaturedGameInfo observers(SpectatorV4Observer observers) {
    this.observers = observers;
    return this;
  }

   /**
   * The observer information
   * @return observers
  **/
  @ApiModelProperty(value = "The observer information")
  public SpectatorV4Observer getObservers() {
    return observers;
  }

  public void setObservers(SpectatorV4Observer observers) {
    this.observers = observers;
  }

  public SpectatorV4FeaturedGameInfo participants(List<SpectatorV4Participant> participants) {
    this.participants = participants;
    return this;
  }

  public SpectatorV4FeaturedGameInfo addParticipantsItem(SpectatorV4Participant participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<SpectatorV4Participant>();
    }
    this.participants.add(participantsItem);
    return this;
  }

   /**
   * The participant information
   * @return participants
  **/
  @ApiModelProperty(value = "The participant information")
  public List<SpectatorV4Participant> getParticipants() {
    return participants;
  }

  public void setParticipants(List<SpectatorV4Participant> participants) {
    this.participants = participants;
  }

  public SpectatorV4FeaturedGameInfo gameLength(Long gameLength) {
    this.gameLength = gameLength;
    return this;
  }

   /**
   * The amount of time in seconds that has passed since the game started
   * @return gameLength
  **/
  @ApiModelProperty(value = "The amount of time in seconds that has passed since the game started")
  public Long getGameLength() {
    return gameLength;
  }

  public void setGameLength(Long gameLength) {
    this.gameLength = gameLength;
  }

  public SpectatorV4FeaturedGameInfo gameQueueConfigId(Long gameQueueConfigId) {
    this.gameQueueConfigId = gameQueueConfigId;
    return this;
  }

   /**
   * The queue type (queue types are documented on the Game Constants page)
   * @return gameQueueConfigId
  **/
  @ApiModelProperty(value = "The queue type (queue types are documented on the Game Constants page)")
  public Long getGameQueueConfigId() {
    return gameQueueConfigId;
  }

  public void setGameQueueConfigId(Long gameQueueConfigId) {
    this.gameQueueConfigId = gameQueueConfigId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpectatorV4FeaturedGameInfo spectatorV4FeaturedGameInfo = (SpectatorV4FeaturedGameInfo) o;
    return Objects.equals(this.gameId, spectatorV4FeaturedGameInfo.gameId) &&
        Objects.equals(this.gameStartTime, spectatorV4FeaturedGameInfo.gameStartTime) &&
        Objects.equals(this.platformId, spectatorV4FeaturedGameInfo.platformId) &&
        Objects.equals(this.gameMode, spectatorV4FeaturedGameInfo.gameMode) &&
        Objects.equals(this.mapId, spectatorV4FeaturedGameInfo.mapId) &&
        Objects.equals(this.gameType, spectatorV4FeaturedGameInfo.gameType) &&
        Objects.equals(this.bannedChampions, spectatorV4FeaturedGameInfo.bannedChampions) &&
        Objects.equals(this.observers, spectatorV4FeaturedGameInfo.observers) &&
        Objects.equals(this.participants, spectatorV4FeaturedGameInfo.participants) &&
        Objects.equals(this.gameLength, spectatorV4FeaturedGameInfo.gameLength) &&
        Objects.equals(this.gameQueueConfigId, spectatorV4FeaturedGameInfo.gameQueueConfigId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, gameStartTime, platformId, gameMode, mapId, gameType, bannedChampions, observers, participants, gameLength, gameQueueConfigId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpectatorV4FeaturedGameInfo {\n");
    
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    gameStartTime: ").append(toIndentedString(gameStartTime)).append("\n");
    sb.append("    platformId: ").append(toIndentedString(platformId)).append("\n");
    sb.append("    gameMode: ").append(toIndentedString(gameMode)).append("\n");
    sb.append("    mapId: ").append(toIndentedString(mapId)).append("\n");
    sb.append("    gameType: ").append(toIndentedString(gameType)).append("\n");
    sb.append("    bannedChampions: ").append(toIndentedString(bannedChampions)).append("\n");
    sb.append("    observers: ").append(toIndentedString(observers)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    gameLength: ").append(toIndentedString(gameLength)).append("\n");
    sb.append("    gameQueueConfigId: ").append(toIndentedString(gameQueueConfigId)).append("\n");
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

