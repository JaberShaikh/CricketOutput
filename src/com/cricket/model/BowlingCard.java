package com.cricket.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="bowlingCard")
@XmlAccessorType(XmlAccessType.FIELD)
public class BowlingCard {

  @XmlTransient
  private Player player;

  @XmlElement(name = "status")
  private String status;

  @XmlElement(name = "bowling_end")
  private int bowling_end;
  
  @XmlElement(name = "overs")
  private int overs;

  @XmlElement(name = "runs")
  private int runs;
  
  @XmlElement(name = "balls")
  private int balls;

  @XmlElement(name = "wickets")
  private int wickets;

  @XmlElement(name = "playerId")
  private int playerId;
  
  @XmlElement(name = "wides")
  private int wides;
  
  @XmlElement(name = "noBalls")
  private int noBalls;
  
  @XmlElement(name = "runOuts")
  private int runOuts;
  
  @XmlElement(name = "stumpings")
  private int stumpings;
  
  @XmlElement(name = "catchAsFielder")
  private int catchAsFielder;
  
  @XmlElement(name = "catchAsBowler")
  private int catchAsBowler;
  
public BowlingCard() {
	super();
	// TODO Auto-generated constructor stub
}
public BowlingCard(Player player, String status, int bowling_end) {
	super();
	this.player = player;
	this.playerId = player.getPlayerId();
	this.status = status;
	this.bowling_end = bowling_end;
}

public int getBowling_end() {
	return bowling_end;
}
public void setBowling_end(int bowling_end) {
	this.bowling_end = bowling_end;
}
public int getStumpings() {
	return stumpings;
}
public void setStumpings(int stumpings) {
	this.stumpings = stumpings;
}
public int getCatchAsFielder() {
	return catchAsFielder;
}
public void setCatchAsFielder(int catchAsFielder) {
	this.catchAsFielder = catchAsFielder;
}
public int getCatchAsBowler() {
	return catchAsBowler;
}
public void setCatchAsBowler(int catchAsBowler) {
	this.catchAsBowler = catchAsBowler;
}
public int getRunOuts() {
	return runOuts;
}
public void setRunOuts(int runOuts) {
	this.runOuts = runOuts;
}
public int getWides() {
	return wides;
}
public void setWides(int wides) {
	this.wides = wides;
}
public int getNoBalls() {
	return noBalls;
}
public void setNoBalls(int noBalls) {
	this.noBalls = noBalls;
}
public int getPlayerId() {
	return playerId;
}
public void setPlayerId(int playerId) {
	this.playerId = playerId;
}
public Player getPlayer() {
	return player;
}
public void setPlayer(Player player) {
	this.player = player;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getOvers() {
	return overs;
}
public void setOvers(int overs) {
	this.overs = overs;
}
public int getRuns() {
	return runs;
}
public void setRuns(int runs) {
	this.runs = runs;
}
public int getBalls() {
	return balls;
}
public void setBalls(int balls) {
	this.balls = balls;
}
public int getWickets() {
	return wickets;
}
public void setWickets(int wickets) {
	this.wickets = wickets;
}
}