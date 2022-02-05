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
		print_writer.println("-1 MAIN_SCENE*STAGE START \0");
	}
	
}
