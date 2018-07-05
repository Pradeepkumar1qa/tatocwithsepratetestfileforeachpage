package com.qait.testclass;
import static com.qait.utility.MessageFormatter.*;

import org.openqa.selenium.WebDriver;

import com.qait.tatoc.Grid_Gate;

public class GridGatePageTesting {
	
	public static void executeTestcasesforGridGatepage(WebDriver driver) {
		
		print("performing negative test on grid gate page by clicking on red");
		Grid_Gate grid=new Grid_Gate(driver);
		grid.click_redbox();
		print("successfully done negative testing");
		print("performing positive testing on gird gate page by clicking on green");
		grid.click_greenbox();
		print("successfully done positive testing on grid box page");
		seprate("=");
		
	}

}
