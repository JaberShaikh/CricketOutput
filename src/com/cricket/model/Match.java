package com.cricket.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="Match")
@XmlAccessorType(XmlAccessType.FIELD)
public class Match {

  @XmlElement(name = "substitutes")
  private int substitutes;
	
  @XmlElement(name = "matchType")
  private String matchType;

  @XmlElement(name = "matchFileName")
  private String matchFileName;
  
  @XmlElement(name = "tossResult")
  private String tossResult;

  @XmlElement(name = "tossWinningDecision")
  private String tossWinningDecision;
  
  @XmlElement(name = "tossWinningTeam")
  private int tossWinningTeam;

//  @XmlElement(name = "matchTime")
//  private long matchTime;

  @XmlElement(name = "maxOvers")
  private int maxOvers;

  @XmlElement(name = "reducedOvers")
  private int reducedOvers;
  
  @XmlElement(name = "homeTeamId")
  private int homeTeamId;

  @XmlElement(name = "awayTeamId")
  private int awayTeamId;

  @XmlElement(name = "groundId")
  private int groundId;

  @XmlElement(name = "target")
  private int target;
  
  @XmlTransient
  private Ground ground;

  @XmlTransient
  private Team homeTeam;

  @XmlTransient
  private Team awayTeam;
  
  @XmlElementWrapper(name = "innings")
  @XmlElement(name = "inning")
  private List<Inning> inning;

  @XmlElementWrapper(name = "homeSquad")
  @XmlElement(name = "homeSquad")
  private List<Player> homeSquad;

  @XmlElementWrapper(name = "awaySquad")
  @XmlElement(name = "awaySquad")
  private List<Player> awaySquad;

  @XmlTransient
  private String match_file_timestamp;
  
public String getMatch_file_timestamp() {
	return match_file_timestamp;
}
public void setMatch_file_timestamp(String match_file_timestamp) {
	this.match_file_timestamp = match_file_timestamp;
}
public int getTarget() {
	return target;
}
public void setTarget(int target) {
	this.target = target;
}
public List<Player> getHomeSquad() {
	return homeSquad;
}
public void setHomeSquad(List<Player> homeSquad) {
	this.homeSquad = homeSquad;
}
public List<Player> getAwaySquad() {
	return awaySquad;
}
public void setAwaySquad(List<Player> awaySquad) {
	this.awaySquad = awaySquad;
}
//public long getMatchTime() {
//	return matchTime;
//}
//public void setMatchTime(long matchTime) {
//	this.matchTime = matchTime;
//}
public int getSubstitutes() {
	return substitutes;
}
public void setSubstitutes(int substitutes) {
	this.substitutes = substitutes;
}
public Ground getGround() {
	return ground;
}
public void setGround(Ground ground) {
	this.ground = ground;
}
public int getGroundId() {
	return groundId;
}
public void setGroundId(int groundId) {
	this.groundId = groundId;
}
public String getTossResult() {
	return tossResult;
}
public void setTossResult(String tossResult) {
	this.tossResult = tossResult;
}
public String getTossWinningDecision() {
	return tossWinningDecision;
}
public void setTossWinningDecision(String tossWinningDecision) {
	this.tossWinningDecision = tossWinningDecision;
}
public int getTossWinningTeam() {
	return tossWinningTeam;
}
public void setTossWinningTeam(int tossWinningTeam) {
	this.tossWinningTeam = tossWinningTeam;
}
public int getMaxOvers() {
	return maxOvers;
}
public void setMaxOvers(int maxOvers) {
	this.maxOvers = maxOvers;
}
public int getReducedOvers() {
	return reducedOvers;
}
public void setReducedOvers(int reducedOvers) {
	this.reducedOvers = reducedOvers;
}
public String getMatchType() {
	return matchType;
}
public void setMatchType(String matchType) {
	this.matchType = matchType;
}
public Team getHomeTeam() {
	return homeTeam;
}
public void setHomeTeam(Team homeTeam) {
	this.homeTeam = homeTeam;
}
public Team getAwayTeam() {
	return awayTeam;
}
public void setAwayTeam(Team awayTeam) {
	this.awayTeam = awayTeam;
}
public int getHomeTeamId() {
	return homeTeamId;
}
public void setHomeTeamId(int homeTeamId) {
	this.homeTeamId = homeTeamId;
}
public int getAwayTeamId() {
	return awayTeamId;
}
public void setAwayTeamId(int awayTeamId) {
	this.awayTeamId = awayTeamId;
}
public String getMatchFileName() {
	return matchFileName;
}
public void setMatchFileName(String matchFileName) {
	this.matchFileName = matchFileName;
}
public List<Inning> getInning() {
	return inning;
}
public void setInning(List<Inning> inning) {
	this.inning = inning;
}
@Override
public String toString() {
	return "Match [substitutes=" + substitutes + ", matchType=" + matchType + ", matchFileName=" + matchFileName
			+ ", tossResult=" + tossResult + ", tossWinningDecision=" + tossWinningDecision + ", tossWinningTeam="
			+ tossWinningTeam + ", maxOvers=" + maxOvers + ", reducedOvers=" + reducedOvers + ", homeTeamId="
			+ homeTeamId + ", awayTeamId=" + awayTeamId + ", groundId=" + groundId + ", target=" + target + ", ground="
			+ ground + ", homeTeam=" + homeTeam + ", awayTeam=" + awayTeam + ", inning=" + inning + ", homeSquad="
			+ homeSquad + ", awaySquad=" + awaySquad + "]";
}

}