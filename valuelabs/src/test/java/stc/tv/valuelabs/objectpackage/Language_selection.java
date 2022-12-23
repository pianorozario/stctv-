package stc.tv.valuelabs.objectpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stc.tv.valuelabs.basepackage.Browserlaunch;

public class Language_selection extends Browserlaunch  {
	

	public void selectlanguage() {
		
        
		
		WebElement select_language = driver.findElement(By.id("translation-btn"));
		select_language.click();
	}

}
