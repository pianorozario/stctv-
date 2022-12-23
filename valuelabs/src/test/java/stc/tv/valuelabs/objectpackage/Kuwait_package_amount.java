package stc.tv.valuelabs.objectpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert; 
import stc.tv.valuelabs.basepackage.Browserlaunch;

public class Kuwait_package_amount extends Browserlaunch {
	
	public void kuwait_basicvalidation() {
		
		WebElement country_btn = driver.findElement(By.id("country-btn"));
		country_btn.click();
		
		WebElement choose_kuwait = driver.findElement(By.id("kw"));
		choose_kuwait.click();
		
		// Package Lite :
			
		WebElement plan1=driver.findElement(By.xpath("//strong[contains(text(),'Lite')]"));
		String text1=plan1.getText();
		System.out.println("kuwait Package1 details:"+text1);
		
		WebElement price1 = driver.findElement(By.xpath("//div[@class='price']"));
		String text2 = price1.getText();
		System.out.println("kuwait Package1 Price details:"+text2);
		
        Assert.assertEquals("LITE", text1);
        Assert.assertEquals("1.2 KWD/month", text2);
        
        
        //Package Classic :
        
        WebElement plan2=driver.findElement(By.xpath("//strong[contains(text(),'Classic')]"));
		String text3=plan2.getText();
		System.out.println("kuwait Package2 details:"+text3);
		
		WebElement price2 = driver.findElement(By.xpath("//div[@id='currency-classic']"));
		String text4 = price2.getText();
		System.out.println("kuwait Package2 Price details:"+text4);
		
		 Assert.assertEquals("CLASSIC", text3);
	     Assert.assertEquals("2.5 KWD/month", text4);
	     
	     
	     //Package Premium:
	     
	     WebElement plan3=driver.findElement(By.xpath("//strong[contains(text(),'Premium')]"));
			String text5=plan3.getText();
			System.out.println("kuwait Package3 details:"+text5);
			
			WebElement price3 = driver.findElement(By.xpath("//div[@id='currency-premium']"));
			String text6 = price3.getText();
			System.out.println("kuwait Package3 Price details:"+text6);
			
			 Assert.assertEquals("PREMIUM", text5);
		     Assert.assertEquals("4.8 KWD/month", text6);
		     
	     
		
	}
	

}
