/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more.  To get started, create a user account and make sure to include the entirety of the returned login token as the X-Auth-Token header. You can reuse this token, or login for a new one.  ClientToServerMessage and ServerToClientMessage are used for the realtime game state and actions two-way websocket interface for actually playing a game. Envelope is used for the realtime API services. 
 *
 * OpenAPI spec version: 2.1.0
 * Contact: ben@hiddenswitch.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hiddenswitch.spellsource.client.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hiddenswitch.spellsource.client.models.ClientToServerMessage;
import com.hiddenswitch.spellsource.client.models.ServerToClientMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Stores a ClientToServerMessage or a ServerToClientMessage. Allows envelopes to carry game messages. 
 */
@ApiModel(description = "Stores a ClientToServerMessage or a ServerToClientMessage. Allows envelopes to carry game messages. ")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class EnvelopeGame implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("serverToClient")
  private ServerToClientMessage serverToClient = null;

  @JsonProperty("clientToServer")
  private ClientToServerMessage clientToServer = null;

  public EnvelopeGame serverToClient(ServerToClientMessage serverToClient) {
    this.serverToClient = serverToClient;
    return this;
  }

   /**
   * Get serverToClient
   * @return serverToClient
  **/
  @ApiModelProperty(value = "")
  public ServerToClientMessage getServerToClient() {
    return serverToClient;
  }

  public void setServerToClient(ServerToClientMessage serverToClient) {
    this.serverToClient = serverToClient;
  }

  public EnvelopeGame clientToServer(ClientToServerMessage clientToServer) {
    this.clientToServer = clientToServer;
    return this;
  }

   /**
   * Get clientToServer
   * @return clientToServer
  **/
  @ApiModelProperty(value = "")
  public ClientToServerMessage getClientToServer() {
    return clientToServer;
  }

  public void setClientToServer(ClientToServerMessage clientToServer) {
    this.clientToServer = clientToServer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeGame envelopeGame = (EnvelopeGame) o;
    return Objects.equals(this.serverToClient, envelopeGame.serverToClient) &&
        Objects.equals(this.clientToServer, envelopeGame.clientToServer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverToClient, clientToServer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeGame {\n");
    
    sb.append("    serverToClient: ").append(toIndentedString(serverToClient)).append("\n");
    sb.append("    clientToServer: ").append(toIndentedString(clientToServer)).append("\n");
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

