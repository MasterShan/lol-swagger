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
import java.util.ArrayList;
import java.util.List;

/**
 * TournamentV4TournamentCodeDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T15:57:39.031+02:00")
public class TournamentV4TournamentCodeDTO {
  @SerializedName("map")
  private String map = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("spectators")
  private String spectators = null;

  /**
   * The tournament code&#39;s region.              (Legal values:  BR,  EUNE,  EUW,  JP,  LAN,  LAS,  NA,  OCE,  PBE,  RU,  TR)
   */
  @JsonAdapter(RegionEnum.Adapter.class)
  public enum RegionEnum {
    BR("BR"),
    
    EUNE("EUNE"),
    
    EUW("EUW"),
    
    JP("JP"),
    
    LAN("LAN"),
    
    LAS("LAS"),
    
    NA("NA"),
    
    OCE("OCE"),
    
    PBE("PBE"),
    
    RU("RU"),
    
    TR("TR");

    private String value;

    RegionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RegionEnum fromValue(String text) {
      for (RegionEnum b : RegionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RegionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RegionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RegionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RegionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("region")
  private RegionEnum region = null;

  @SerializedName("providerId")
  private Integer providerId = null;

  @SerializedName("teamSize")
  private Integer teamSize = null;

  @SerializedName("participants")
  private List<String> participants = null;

  @SerializedName("pickType")
  private String pickType = null;

  @SerializedName("tournamentId")
  private Integer tournamentId = null;

  @SerializedName("lobbyName")
  private String lobbyName = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("metaData")
  private String metaData = null;

  public TournamentV4TournamentCodeDTO map(String map) {
    this.map = map;
    return this;
  }

   /**
   * The game map for the tournament code game
   * @return map
  **/
  @ApiModelProperty(value = "The game map for the tournament code game")
  public String getMap() {
    return map;
  }

  public void setMap(String map) {
    this.map = map;
  }

  public TournamentV4TournamentCodeDTO code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The tournament code.
   * @return code
  **/
  @ApiModelProperty(value = "The tournament code.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TournamentV4TournamentCodeDTO spectators(String spectators) {
    this.spectators = spectators;
    return this;
  }

   /**
   * The spectator mode for the tournament code game.
   * @return spectators
  **/
  @ApiModelProperty(value = "The spectator mode for the tournament code game.")
  public String getSpectators() {
    return spectators;
  }

  public void setSpectators(String spectators) {
    this.spectators = spectators;
  }

  public TournamentV4TournamentCodeDTO region(RegionEnum region) {
    this.region = region;
    return this;
  }

   /**
   * The tournament code&#39;s region.              (Legal values:  BR,  EUNE,  EUW,  JP,  LAN,  LAS,  NA,  OCE,  PBE,  RU,  TR)
   * @return region
  **/
  @ApiModelProperty(value = "The tournament code's region.              (Legal values:  BR,  EUNE,  EUW,  JP,  LAN,  LAS,  NA,  OCE,  PBE,  RU,  TR)")
  public RegionEnum getRegion() {
    return region;
  }

  public void setRegion(RegionEnum region) {
    this.region = region;
  }

  public TournamentV4TournamentCodeDTO providerId(Integer providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * The provider&#39;s ID.
   * @return providerId
  **/
  @ApiModelProperty(value = "The provider's ID.")
  public Integer getProviderId() {
    return providerId;
  }

  public void setProviderId(Integer providerId) {
    this.providerId = providerId;
  }

  public TournamentV4TournamentCodeDTO teamSize(Integer teamSize) {
    this.teamSize = teamSize;
    return this;
  }

   /**
   * The team size for the tournament code game.
   * @return teamSize
  **/
  @ApiModelProperty(value = "The team size for the tournament code game.")
  public Integer getTeamSize() {
    return teamSize;
  }

  public void setTeamSize(Integer teamSize) {
    this.teamSize = teamSize;
  }

  public TournamentV4TournamentCodeDTO participants(List<String> participants) {
    this.participants = participants;
    return this;
  }

  public TournamentV4TournamentCodeDTO addParticipantsItem(String participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<String>();
    }
    this.participants.add(participantsItem);
    return this;
  }

   /**
   * The summonerIds of the participants (Encrypted)
   * @return participants
  **/
  @ApiModelProperty(value = "The summonerIds of the participants (Encrypted)")
  public List<String> getParticipants() {
    return participants;
  }

  public void setParticipants(List<String> participants) {
    this.participants = participants;
  }

  public TournamentV4TournamentCodeDTO pickType(String pickType) {
    this.pickType = pickType;
    return this;
  }

   /**
   * The pick mode for tournament code game.
   * @return pickType
  **/
  @ApiModelProperty(value = "The pick mode for tournament code game.")
  public String getPickType() {
    return pickType;
  }

  public void setPickType(String pickType) {
    this.pickType = pickType;
  }

  public TournamentV4TournamentCodeDTO tournamentId(Integer tournamentId) {
    this.tournamentId = tournamentId;
    return this;
  }

   /**
   * The tournament&#39;s ID.
   * @return tournamentId
  **/
  @ApiModelProperty(value = "The tournament's ID.")
  public Integer getTournamentId() {
    return tournamentId;
  }

  public void setTournamentId(Integer tournamentId) {
    this.tournamentId = tournamentId;
  }

  public TournamentV4TournamentCodeDTO lobbyName(String lobbyName) {
    this.lobbyName = lobbyName;
    return this;
  }

   /**
   * The lobby name for the tournament code game.
   * @return lobbyName
  **/
  @ApiModelProperty(value = "The lobby name for the tournament code game.")
  public String getLobbyName() {
    return lobbyName;
  }

  public void setLobbyName(String lobbyName) {
    this.lobbyName = lobbyName;
  }

  public TournamentV4TournamentCodeDTO password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password for the tournament code game.
   * @return password
  **/
  @ApiModelProperty(value = "The password for the tournament code game.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public TournamentV4TournamentCodeDTO id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The tournament code&#39;s ID.
   * @return id
  **/
  @ApiModelProperty(value = "The tournament code's ID.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TournamentV4TournamentCodeDTO metaData(String metaData) {
    this.metaData = metaData;
    return this;
  }

   /**
   * The metadata for tournament code.
   * @return metaData
  **/
  @ApiModelProperty(value = "The metadata for tournament code.")
  public String getMetaData() {
    return metaData;
  }

  public void setMetaData(String metaData) {
    this.metaData = metaData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TournamentV4TournamentCodeDTO tournamentV4TournamentCodeDTO = (TournamentV4TournamentCodeDTO) o;
    return Objects.equals(this.map, tournamentV4TournamentCodeDTO.map) &&
        Objects.equals(this.code, tournamentV4TournamentCodeDTO.code) &&
        Objects.equals(this.spectators, tournamentV4TournamentCodeDTO.spectators) &&
        Objects.equals(this.region, tournamentV4TournamentCodeDTO.region) &&
        Objects.equals(this.providerId, tournamentV4TournamentCodeDTO.providerId) &&
        Objects.equals(this.teamSize, tournamentV4TournamentCodeDTO.teamSize) &&
        Objects.equals(this.participants, tournamentV4TournamentCodeDTO.participants) &&
        Objects.equals(this.pickType, tournamentV4TournamentCodeDTO.pickType) &&
        Objects.equals(this.tournamentId, tournamentV4TournamentCodeDTO.tournamentId) &&
        Objects.equals(this.lobbyName, tournamentV4TournamentCodeDTO.lobbyName) &&
        Objects.equals(this.password, tournamentV4TournamentCodeDTO.password) &&
        Objects.equals(this.id, tournamentV4TournamentCodeDTO.id) &&
        Objects.equals(this.metaData, tournamentV4TournamentCodeDTO.metaData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(map, code, spectators, region, providerId, teamSize, participants, pickType, tournamentId, lobbyName, password, id, metaData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TournamentV4TournamentCodeDTO {\n");
    
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    spectators: ").append(toIndentedString(spectators)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    teamSize: ").append(toIndentedString(teamSize)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    pickType: ").append(toIndentedString(pickType)).append("\n");
    sb.append("    tournamentId: ").append(toIndentedString(tournamentId)).append("\n");
    sb.append("    lobbyName: ").append(toIndentedString(lobbyName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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
