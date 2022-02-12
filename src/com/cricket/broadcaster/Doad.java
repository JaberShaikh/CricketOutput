package com.cricket.broadcaster;

import java.io.PrintWriter;

import com.cricket.containers.Bug;
import com.cricket.containers.Scorecard;
import com.cricket.model.Scene;

public class Doad extends Scene {

	public Doad() {
		super();
	}

	public Doad(String scene_path) {
		super(scene_path);
	}

	public String populateScorecard(PrintWriter print_writer, Scorecard scorecard)
	{
//	    "RENDERER PREVIEW SCENE*<scene path>" + " " & "C:/Temp/scorecard.png" & " " & "anim_Infobar$Change$Right 1.100"
// 		*FUNCTION*Omo*vis_con SET
// 		*ACTIVE SET
		String status = "";
		if (scorecard == null) {
			status = "ERROR: Scorcard is null";
		} else if (scorecard.getInning() == null) {
			status = "ERROR: Scorcard's inning is null";
		} else {
			status = "SUCCESS";
		}
		
		return status;
	}
	
	public void populateBugs(PrintWriter print_writer, Bug bug)
	{
		print_writer.println("-1 RENDERER*TREE*$Main$LINES$SubHeaderGrp$SubHeaderText$LanguageGrp$Language1*GEOM*TEXT SET " 
				+ bug.getHeader_text() + "\0");
		if(bug.getStats_text() != null && bug.getStats_text().size() >= 1) 
			print_writer.println("-1 RENDERER*TREE*$Main$LINES$Dehighlight$StatHeadHrp$StatHead1$StatHead1*GEOM*TEXT SET " 
					+ bug.getStats_text().get(0) + " " + bug.getStats_text().get(1) +  "\0");
		print_writer.println("-1 RENDERER*STAGE*DIRECTOR*In START\0");
	}
	
}
