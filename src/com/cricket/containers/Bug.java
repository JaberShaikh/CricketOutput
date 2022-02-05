package com.cricket.containers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.cricket.model.BattingCard;
import com.cricket.model.Inning;
import com.cricket.model.Match;
import com.cricket.util.CricketUtil;

public class Bug {
	
	private MultipartHttpServletRequest request;
	private Match match;
	private List<String> stats_text;
	private String header_text;
	private String subheader_text;
	
	public Bug() {
		super();
	}
	public Bug(MultipartHttpServletRequest request, Match match) {
		super();
		this.request = request;
		this.match = match;
	}
	public MultipartHttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(MultipartHttpServletRequest request) {
		this.request = request;
	}
	public Match getMatch() {
		return match;
	}
	public void setMatch(Match match) {
		this.match = match;
	}
	public String getHeader_text() {
		return header_text;
	}
	public void setHeader_text(String header_text) {
		this.header_text = header_text;
	}
	public String getSubheader_text() {
		return subheader_text;
	}
	public void setSubheader_text(String subheader_text) {
		this.subheader_text = subheader_text;
	}
	public List<String> getStats_text() {
		return stats_text;
	}
	public void setStats_text(List<String> stats_text) {
		this.stats_text = stats_text;
	}
	public Bug processStatsForBugCaption(Bug bug) 
	{
		int inning_number = 0, player_id = 0;
		List<String> stats = new ArrayList<String>();
		
		for (Entry<String, String[]> entry : bug.getRequest().getParameterMap().entrySet()) {
			if(entry.getKey().equalsIgnoreCase(CricketUtil.SELECT + CricketUtil.INNING)) {
				inning_number = Integer.parseInt(entry.getValue()[0]);
			} else if(entry.getKey().equalsIgnoreCase(CricketUtil.SELECT + CricketUtil.BATSMAN)) {
				player_id = Integer.parseInt(entry.getValue()[0]);
			}
		}
		for (Entry<String, String[]> entry : bug.getRequest().getParameterMap().entrySet()) {
			if(entry.getKey().equalsIgnoreCase(CricketUtil.SELECT + CricketUtil.STATS)) {
				switch (entry.getValue()[0].toUpperCase()) {
				case CricketUtil.BATSMAN + CricketUtil.STATS:
					for(Inning inn : bug.getMatch().getInning()) {
						if(inn.getInningNumber() == inning_number) {
							for(BattingCard bc : inn.getBattingCard()) {
								if (bc.getPlayerId() == player_id) {
									bug.setHeader_text(bc.getPlayer().getFull_name());
									bug.setSubheader_text("FOURS: " + bc.getFours() + ", SIXES: " + bc.getSixes());
									stats.add(String.valueOf(bc.getRuns()) + " (" + String.valueOf(bc.getBalls() + ")"));
									bug.setStats_text(stats);
								}
							}
						}
					}
					break;
				}
			}
			
		}
		return bug;
	}
	@Override
	public String toString() {
		return "Bug [request=" + request + ", match=" + match + ", stats_text=" + stats_text + ", header_text="
				+ header_text + ", subheader_text=" + subheader_text + "]";
	}
	
}
