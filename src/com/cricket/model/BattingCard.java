package com.cricket.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="battingCard")
@XmlAccessorType(XmlAccessType.FIELD)
public class BattingCard implements Comparable<BattingCard>{

  @XmlElement(name = "playerId")
  private int playerId;
  
  @XmlElement(name = "batterPosition")
  private int batterPosition;
  
  @XmlElement(name = "runs")
  private int runs;
  
  @XmlElement(name = "fours")
  private int fours;
  
  @XmlElement(name = "sixes")
  private int sixes;
  
  @XmlElement(name = "balls")
  private int balls;
  
  @XmlElement(name = "howOutFielderId")
  private int howOutFielderId;
  
  @XmlElement(name = "howOutBowlerId")
  private int howOutBowlerId;

  @XmlElement(name = "batsmanInningStarted")
  private String batsmanInningStarted;
  
  @XmlElement(name = "status")
  private String status;
  
  @XmlElement(name = "onStrike")
  private String onStrike;
  
  @XmlElement(name = "howOutText")
  private String howOutText;
  
  @XmlElement(name = "howOut")
  private String howOut;
  
  @XmlElement(name = "wasHowOutFielderSubstitute")
  private String wasHowOutFielderSubstitute;
  
  @XmlTransient
  private Player howOutFielder;
  
  @XmlTransient
  private Player howOutBowler;

  @XmlTransient
  private Player player;
  
public BattingCard(int playerId, int batterPosition, String status) {
	super();
	this.playerId = playerId;
	this.batterPosition = batterPosition;
	this.status = status;
}
public BattingCard() {
	super();
}
public String getBatsmanInningStarted() {
	return batsmanInningStarted;
}
public void setBatsmanInningStarted(String batsmanInningStarted) {
	this.batsmanInningStarted = batsmanInningStarted;
}
public int getFours() {
	return fours;
}
public String getWasHowOutFielderSubstitute() {
	return wasHowOutFielderSubstitute;
}
public void setWasHowOutFielderSubstitute(String wasHowOutFielderSubstitute) {
	this.wasHowOutFielderSubstitute = wasHowOutFielderSubstitute;
}
public void setFours(int fours) {
	this.fours = fours;
}
public int getSixes() {
	return sixes;
}
public void setSixes(int sixes) {
	this.sixes = sixes;
}
public String getHowOutText() {
	return howOutText;
}
public void setHowOutText(String howOutText) {
	this.howOutText = howOutText;
}
public Player getHowOutFielder() {
	return howOutFielder;
}
public void setHowOutFielder(Player howOutFielder) {
	this.howOutFielder = howOutFielder;
}
public Player getHowOutBowler() {
	return howOutBowler;
}
public void setHowOutBowler(Player howOutBowler) {
	this.howOutBowler = howOutBowler;
}
public String getHowOut() {
	return howOut;
}
public void setHowOut(String howOut) {
	this.howOut = howOut;
}
public String getOnStrike() {
	return onStrike;
}
public void setOnStrike(String onStrike) {
	this.onStrike = onStrike;
}
public int getHowOutFielderId() {
	return howOutFielderId;
}
public void setHowOutFielderId(int howOutFielderId) {
	this.howOutFielderId = howOutFielderId;
}
public int getHowOutBowlerId() {
	return howOutBowlerId;
}
public void setHowOutBowlerId(int howOutBowlerId) {
	this.howOutBowlerId = howOutBowlerId;
}
public int getPlayerId() {
	return playerId;
}
public void setPlayerId(int playerId) {
	this.playerId = playerId;
}
public int getBatterPosition() {
	return batterPosition;
}
public void setBatterPosition(int batterPosition) {
	this.batterPosition = batterPosition;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
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
public Player getPlayer() {
	return player;
}
public void setPlayer(Player player) {
	this.player = player;
}

@Override
public String toString() {
	return "BattingCard [playerId=" + playerId + ", batterPosition=" + batterPosition + ", runs=" + runs + ", fours="
			+ fours + ", sixes=" + sixes + ", balls=" + balls + ", howOutFielderId=" + howOutFielderId
			+ ", howOutBowlerId=" + howOutBowlerId + ", batsmanInningStarted=" + batsmanInningStarted + ", status="
			+ status + ", onStrike=" + onStrike + ", howOutText=" + howOutText + ", howOut=" + howOut
			+ ", wasHowOutFielderSubstitute=" + wasHowOutFielderSubstitute + ", howOutFielder=" + howOutFielder
			+ ", howOutBowler=" + howOutBowler + ", player=" + player + "]";
}
@Override
public int compareTo(BattingCard bc) {
	return (int) (bc.getBatterPosition()-this.getBatterPosition());
}

}