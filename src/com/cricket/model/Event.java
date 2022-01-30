package com.cricket.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="event")
@XmlAccessorType(XmlAccessType.FIELD)
public class Event {

  @XmlElement(name = "eventNumber")
  private int eventNumber;

  @XmlElement(name = "eventWasABoundary")
  private String eventWasABoundary;
  
  @XmlElement(name = "eventType")
  private String eventType;

  @XmlElement(name = "eventInningNumber")
  private int eventInningNumber;
  
  @XmlElement(name = "eventBatterNo")
  private int eventBatterNo;

  @XmlElement(name = "eventOnStrike")
  private String eventOnStrike;
  
  @XmlElement(name = "eventBatterPosition")
  private int eventBatterPosition;

  @XmlElement(name = "eventBatterPreviousPosition")
  private int eventBatterPreviousPosition;
  
  @XmlElement(name = "eventOtherBatterNo")
  private int eventOtherBatterNo;
  
  @XmlElement(name = "eventBowlerNo")
  private int eventBowlerNo;

  @XmlElement(name = "eventBowlingEnd")
  private int eventBowlingEnd;
  
  @XmlElement(name = "eventOtherBowlerNo")
  private int eventOtherBowlerNo;

  @XmlElement(name = "eventRuns")
  private int eventRuns;

  @XmlElement(name = "eventOverNo")
  private int eventOverNo;
  
  @XmlElement(name = "eventBallNo")
  private int eventBallNo;

  @XmlElement(name = "eventExtra")
  private String eventExtra;
  
  @XmlElement(name = "eventExtraRuns")
  private int eventExtraRuns;

  @XmlElement(name = "eventSubExtra")
  private String eventSubExtra;
  
  @XmlElement(name = "eventSubExtraRuns")
  private int eventSubExtraRuns;
  
  @XmlElement(name = "eventHowOut")
  private String eventHowOut;

  @XmlElement(name = "eventHowOutBatterNo")
  private int eventHowOutBatterNo;
  
  @XmlElement(name = "eventHowOutFielderId")
  private int eventHowOutFielderId;
  
  public int getEventBowlingEnd() {
	return eventBowlingEnd;
}

public void setEventBowlingEnd(int eventBowlingEnd) {
	this.eventBowlingEnd = eventBowlingEnd;
}

public String getEventSubExtra() {
	return eventSubExtra;
}

public void setEventSubExtra(String eventSubExtra) {
	this.eventSubExtra = eventSubExtra;
}

public int getEventSubExtraRuns() {
	return eventSubExtraRuns;
}

public void setEventSubExtraRuns(int eventSubExtraRuns) {
	this.eventSubExtraRuns = eventSubExtraRuns;
}

public int getEventHowOutBatterNo() {
	return eventHowOutBatterNo;
}

public void setEventHowOutBatterNo(int eventHowOutBatterNo) {
	this.eventHowOutBatterNo = eventHowOutBatterNo;
}

public String getEventOnStrike() {
	return eventOnStrike;
}

public void setEventOnStrike(String eventOnStrike) {
	this.eventOnStrike = eventOnStrike;
}

public int getEventBatterPreviousPosition() {
	return eventBatterPreviousPosition;
}

public void setEventBatterPreviousPosition(int eventBatterPreviousPosition) {
	this.eventBatterPreviousPosition = eventBatterPreviousPosition;
}

public int getEventBatterPosition() {
	return eventBatterPosition;
}

public void setEventBatterPosition(int eventBatterPosition) {
	this.eventBatterPosition = eventBatterPosition;
}

public String getEventWasABoundary() {
	return eventWasABoundary;
}

public void setEventWasABoundary(String eventWasABoundary) {
	this.eventWasABoundary = eventWasABoundary;
}

public int getEventOverNo() {
	return eventOverNo;
}

public void setEventOverNo(int eventOverNo) {
	this.eventOverNo = eventOverNo;
}

public int getEventBallNo() {
	return eventBallNo;
}

public void setEventBallNo(int eventBallNo) {
	this.eventBallNo = eventBallNo;
}

public String getEventExtra() {
	return eventExtra;
}

public void setEventExtra(String eventExtra) {
	this.eventExtra = eventExtra;
}

public int getEventBatterNo() {
	return eventBatterNo;
}

public void setEventBatterNo(int eventBatterNo) {
	this.eventBatterNo = eventBatterNo;
}

public int getEventOtherBatterNo() {
	return eventOtherBatterNo;
}

public void setEventOtherBatterNo(int eventOtherBatterNo) {
	this.eventOtherBatterNo = eventOtherBatterNo;
}

public int getEventBowlerNo() {
	return eventBowlerNo;
}

public void setEventBowlerNo(int eventBowlerNo) {
	this.eventBowlerNo = eventBowlerNo;
}

public int getEventOtherBowlerNo() {
	return eventOtherBowlerNo;
}

public void setEventOtherBowlerNo(int eventOtherBowlerNo) {
	this.eventOtherBowlerNo = eventOtherBowlerNo;
}

public int getEventRuns() {
	return eventRuns;
}

public void setEventRuns(int eventRuns) {
	this.eventRuns = eventRuns;
}

public int getEventExtraRuns() {
	return eventExtraRuns;
}

public void setEventExtraRuns(int eventExtraRuns) {
	this.eventExtraRuns = eventExtraRuns;
}

public String getEventHowOut() {
	return eventHowOut;
}

public void setEventHowOut(String eventHowOut) {
	this.eventHowOut = eventHowOut;
}

public int getEventHowOutFielderId() {
	return eventHowOutFielderId;
}

public void setEventHowOutFielderId(int eventHowOutFielderId) {
	this.eventHowOutFielderId = eventHowOutFielderId;
}

public int getEventInningNumber() {
	return eventInningNumber;
}

public void setEventInningNumber(int eventInningNumber) {
	this.eventInningNumber = eventInningNumber;
}

public int getEventNumber() {
	return eventNumber;
}

public void setEventNumber(int eventNumber) {
	this.eventNumber = eventNumber;
}

public String getEventType() {
	return eventType;
}

public void setEventType(String eventType) {
	this.eventType = eventType;
}

}