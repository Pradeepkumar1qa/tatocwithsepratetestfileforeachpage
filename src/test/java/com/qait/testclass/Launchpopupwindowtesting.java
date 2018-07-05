package com.qait.testclass;
import static com.qait.utility.MessageFormatter.*;

import org.openqa.selenium.WebDriver;

import com.qait.tatoc.Popupwindows;

public class Launchpopupwindowtesting {
	
	public static void executeTestcasesonlaunchpopupwindowpage(WebDriver driver) {
		print("doing negative testing by not providing the word in input area");
		Popupwindows window=new Popupwindows(driver);
		window.donegativetestingwhenclickedonproceedirectly();
		print("done negative testing successfully ");
		print("going to do positive testing by providing input word in input");
		window.fillinputwithwordandclicktoproceed();
		print("done positive testing on lunch popup window");
		
		
		
	}

}
