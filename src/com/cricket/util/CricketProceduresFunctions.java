package com.cricket.util;

import java.util.ArrayList;
import java.util.List;

import com.cricket.containers.Bug;
import com.cricket.model.BattingCard;
import com.cricket.model.Inning;
import com.cricket.model.Match;

public class CricketProceduresFunctions {

	public Bug bugToProcess(String whichBroadcaster, String valueToProcess, Match match) 
	{
		Bug bug = new Bug();
		int inning_number = 0, player_id = 0;
		String stats_to_proces = "";
		List<String> stats = new ArrayList<String>();
		
		switch (whichBroadcaster) {
		case CricketUtil.DOAD:
			if (valueToProcess.contains("|")) {
				for(String val : valueToProcess.split("|")) {
					if (val.contains(":")) {
						switch (val.split(":")[0].toUpperCase()) {
						case "STATS":
							stats_to_proces = val.split(":")[1];
							break;
						case "PLAYER":
							player_id = Integer.valueOf(val.split(":")[1]);
							break;
						case "INNING":
							inning_number = Integer.valueOf(val.split(":")[1]);
							break;
						}
					}
				}
			}
			break;
		}
		
		switch (stats_to_proces.toUpperCase()) {
		case CricketUtil.BATSMAN + CricketUtil.STATS:
			bug.setStat_option(stats_to_proces);
			for(Inning inn : match.getInning()) {
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
		return bug;
	}
	
}
