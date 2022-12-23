package stc.tv.valuelabs.basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Browserlaunch {
	
	public static WebDriver driver;

	
	public void initiate() {
		System.setProperty(
	            "webdriver.chrome.driver","./Drivers/chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        driver = new ChromeDriver();
	  
	        // Maximize the browser
	        driver.manage().window().maximize();
	  
	        // Launch Website
	        driver.get("https://subscribe.stctv.com/");
	}
	
	
		
		//Click action 
//		public static boolean ClickElement(org.openqa.selenium.By Locator)
//		{ 
//			driver.findElement(Locator).click(); 
//			return true;
//		 
//		 
//		 }
//		 
//		 //Clear action 
//		 public static boolean ClearElement(org.openqa.selenium.By Locator)
//		 { 
//			 driver.findElement(Locator).clear(); 
//		 return true;
//		 
//		 }
//		 
//		 //Send keys Action 
//		 public static boolean SendElement(org.openqa.selenium.By Locator, String value)
//		 { 
//			 driver.findElement(Locator).sendKeys(value); 
//		 return true;
//		
//	}
  
	}

