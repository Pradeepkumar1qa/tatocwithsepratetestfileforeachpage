package com.qait.testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qait.tatoc.Popupwindows;

import static  com.qait.utility.MessageFormatter.*;

public class TestClassForWelcomePage {
	WebDriver driver;

	@Test
	public void launchbrowser() {
		String url = "http://10.0.1.86/tatoc";
		String value = "c://users/pradeepkumar1/downloads/chromedriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", value);
		driver = new ChromeDriver();
		driver.get(url);
		seprate("launching browser");
		System.out.println("lunched the browser");
		seprate("testing welcome page ");

	}

	@Test(dependsOnMethods = { "launchbrowser" })
	public void executingTestcases_through_oneby_one_pages() {

		System.out.println("executing test cases on welocme page of tatoc project");
		Tatoc_first_page_testing.click_on_basic_course_leads_to_gridbox_page(driver);
		seprate("performing test on grid gate");
		GridGatePageTesting.executeTestcasesforGridGatepage(driver);
        seprate("performing test on frame dungeon");
        FrameDungeonpageTesting.executingTestcaseonFramedungeon(driver);
        seprate("proceeding to test drag and drop functionality");
        DragAroundTesting.executeTestcasesondragAroundpage(driver);
        seprate("proceeding to the launch popup window testing");
        Launchpopupwindowtesting.executeTestcasesonlaunchpopupwindowpage(driver);
        seprate("proceeding to test the cookies page functionality");
        CookiesPageTesting.executTestcasefor_cookies_page(driver);
        seprate("==");
        seprate("==");
        print("final result");
        print("performed all the test cased in correct manner ");
        
        
        
        
	}

	
	//utility method
	

}
