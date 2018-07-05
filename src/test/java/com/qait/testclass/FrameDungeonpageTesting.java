package com.qait.testclass;
import static com.qait.utility.MessageFormatter.*;

import org.openqa.selenium.WebDriver;

import com.qait.tatoc.Frame_dungeon;

public class FrameDungeonpageTesting {
	
	public static void executingTestcaseonFramedungeon(WebDriver driver) {
		print("performing negative test on frame dungeon by  doing unmatched color and proceeding");
		Frame_dungeon framedungeon=new Frame_dungeon(driver);
		framedungeon.unmatched_color_click();
		print("successfully completed negative testing on frame dungeon");
		print("performing positive tegst on frame dungeon by matching the duo box color");
		framedungeon.match_both_box_color_and_click();
		print("successfully completed the frame dungeon functionality testing");
		seprate("=");
		
		
	}

}
