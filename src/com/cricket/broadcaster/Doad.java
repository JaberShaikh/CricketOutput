package com.cricket.broadcaster;

import java.io.PrintWriter;

import com.cricket.containers.Bug;
import com.cricket.model.Scene;

public class Doad extends Scene {

	public Doad() {
		super();
	}

	public Doad(String scene_path) {
		super(scene_path);
	}
	
	public void populateBugs(PrintWriter print_writer, Bug bug)
	{
		print_writer.println("-1 RENDERER*TREE*$Main$LINES$SubHeaderGrp$SubHeaderText$LanguageGrp$Language1*GEOM*TEXT SET " + bug.getHeader_text() + "\0");
		System.out.println("bug.getStats_text().size() = " + bug.getStats_text().size());
		if(bug.getStats_text() != null && bug.getStats_text().size() >= 1) 
			print_writer.println("-1 RENDERER*TREE*$Main$LINES$Dehighlight$StatHeadHrp$StatHead1$StatHead1*GEOM*TEXT SET " 
					+ bug.getStats_text().get(0) + " " + bug.getStats_text().get(1) +  "\0");
		print_writer.println("-1 RENDERER*STAGE*DIRECTOR*In START\0");
	}
	
}
