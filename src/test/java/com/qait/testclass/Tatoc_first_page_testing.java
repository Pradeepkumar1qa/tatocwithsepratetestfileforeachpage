package com.qait.testclass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qait.tatoc.Tatoc_First_Page;

public class Tatoc_first_page_testing {

	
public static void click_on_basic_course_leads_to_gridbox_page(WebDriver driver) {
		Tatoc_First_Page TestAutomation=new Tatoc_First_Page(driver);
		TestAutomation.click_on_basiccourse();
		System.out.println("successfully click on basic course link");
		Assert.assertTrue(TestAutomation.is_sucess(),"there are some problem on welcome page");
		
	}
	
}
