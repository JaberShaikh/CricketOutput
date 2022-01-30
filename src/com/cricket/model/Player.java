package com.cricket.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.builder.DiffBuilder;
import org.apache.commons.lang3.builder.DiffResult;
import org.apache.commons.lang3.builder.Diffable;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.Column;

@Entity
@Table(name = "Players")
public class Player implements Comparable<Player>, Diffable<Player>
{

  @Id
  @Column(name = "PLAYERID")
  private int playerId;
	
  @Column(name = "FULLNAME")
  private String full_name;

  @Column(name = "SURNAME")
  private String surname;

  @Column(name = "ABBREVIATEDNAME")
  private String abbreviated_name;
  
  @Column(name = "BowlingStyle")
  private String bowlingStyle;

  @Column(name = "TEAMID")
  private int teamId;
  
  @Transient
  private int playerPosition;

  @Transient
  private String captainWicketKeeper;

  @Transient
  private String player_type;
  
public Player() {
	super();
}

public Player(int playerId, int playerPosition, String player_type) {
	super();
	this.playerId = playerId;
	this.playerPosition = playerPosition;
	this.player_type = player_type;
}

public String getPlayer_type() {
	return player_type;
}

public void setPlayer_type(String player_type) {
	this.player_type = player_type;
}

public String getCaptainWicketKeeper() {
	return captainWicketKeeper;
}

public void setCaptainWicketKeeper(String captainWicketKeeper) {
	this.captainWicketKeeper = captainWicketKeeper;
}

public int getTeamId() {
	return teamId;
}

public int getPlayerPosition() {
	return playerPosition;
}

public void setPlayerPosition(int playerPosition) {
	this.playerPosition = playerPosition;
}

public void setTeamId(int teamId) {
	this.teamId = teamId;
}

public int getPlayerId() {
	return playerId;
}

public void setPlayerId(int playerId) {
	this.playerId = playerId;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public String getFull_name() {
	return full_name;
}

public void setFull_name(String full_name) {
	this.full_name = full_name;
}

public String getAbbreviated_name() {
	return abbreviated_name;
}

public void setAbbreviated_name(String abbreviated_name) {
	this.abbreviated_name = abbreviated_name;
}

@Override
public int compareTo(Player plyr) {
	return (int) (this.getPlayerPosition()-plyr.getPlayerPosition());
}

@Override
public DiffResult diff(Player plyr) {
	DiffBuilder db = new DiffBuilder(this, plyr, ToStringStyle.SHORT_PREFIX_STYLE);
    if ((this.captainWicketKeeper != null && !this.captainWicketKeeper.isEmpty()) || (plyr.captainWicketKeeper != null && !plyr.captainWicketKeeper.isEmpty()))
    	db.append("captainWicketKeeper", this.captainWicketKeeper, plyr.captainWicketKeeper);
    if ((this.player_type != null && !this.player_type.isEmpty()) || (plyr.player_type != null && !plyr.player_type.isEmpty()))
    	db.append("player_type", this.player_type, plyr.player_type);
    db.append("playerPosition", this.playerPosition, plyr.playerPosition);
	return db.build();
}

public String getBowlingStyle() {
	return bowlingStyle;
}

public void setBowlingStyle(String bowlingStyle) {
	this.bowlingStyle = bowlingStyle;
}

@Override
public String toString() {
	return "Player [playerId=" + playerId + ", full_name=" + full_name + ", surname=" + surname + ", abbreviated_name="
			+ abbreviated_name + ", bowlingStyle=" + bowlingStyle + ", teamId=" + teamId + ", playerPosition="
			+ playerPosition + ", captainWicketKeeper=" + captainWicketKeeper + ", player_type=" + player_type + "]";
}

}