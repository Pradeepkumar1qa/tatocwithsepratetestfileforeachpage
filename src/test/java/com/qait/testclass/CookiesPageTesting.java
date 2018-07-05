package com.qait.testclass;
import static com.qait.utility.MessageFormatter.*;
import org.openqa.selenium.WebDriver;

import com.qait.tatoc.CookieHandling;

public class CookiesPageTesting {
	
	public static void executTestcasefor_cookies_page(WebDriver driver) {
		print("executing negative test case by not setting cookies in this window");
		CookieHandling cookie=new CookieHandling(driver);
		cookie.clickonproceedwithousettingcookie();
		print("successfully completed the negative testing for the cookies page");
		print("preforming positive testing by setting cookies value as given by browser");
		cookie.clickonporceedaftersettingcookie();
		print("tested successfully for the cookie page");
		
	}

}
