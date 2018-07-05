package com.qait.testclass;
import static com.qait.utility.MessageFormatter.*;

import org.openqa.selenium.WebDriver;

import com.qait.tatoc.DragAround;
public class DragAroundTesting {

	public static void executeTestcasesondragAroundpage(WebDriver driver) {
		print("performing negative testing by not dragging into drop box");
		 DragAround drag=new DragAround(driver);
		 drag.donot_drag_element_and_click();
		 print("done negative testing on drag and drop successfully");
		 print("doing positive testing by dragging it into drop box");
		 drag.drag_element_to_box();
		 print("done successfully testing on drag and drop page");
		 
		
	}
	
	
}
