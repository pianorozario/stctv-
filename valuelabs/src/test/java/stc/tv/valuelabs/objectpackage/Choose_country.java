package stc.tv.valuelabs.objectpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import stc.tv.valuelabs.basepackage.Browserlaunch;

public class Choose_country extends Browserlaunch {
	
	public void countrylist() {
		
		WebElement country_btn = driver.findElement(By.id("country-btn"));
		country_btn.click();
		
		WebElement choose_bahrain = driver.findElement(By.id("bh"));
		choose_bahrain.click();
		
		WebElement country_btn1 = driver.findElement(By.id("country-btn"));
		country_btn1.click();
		
		WebElement Choose_kuwait = driver.findElement(By.id("kw"));
		Choose_kuwait.click();
		
		WebElement country_btn2 = driver.findElement(By.id("country-btn"));
		country_btn2.click();
		
		WebElement Choose_KSA = driver.findElement(By.id("sa"));
		Choose_KSA.click();
		
		
	}

}
