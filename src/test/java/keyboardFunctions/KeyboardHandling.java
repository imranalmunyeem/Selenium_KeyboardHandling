package keyboardFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class KeyboardHandling extends DriverSetup {
	@Test
	public void KeyboardHandlingBySelenium() throws InterruptedException {
		
		//Navigate to the website
		driver.get("https://celtabroad.com");
		driver.manage().window().maximize();
		
		
		
		//Keyboard Handling
		Actions a = new Actions (driver);		
		WebElement move = driver.findElement(By.cssSelector("#navSearch"));
		
		
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\\\"navSearch\\\"]"))).click().keyDown(Keys.SHIFT).sendKeys("university");
		a.moveToElement(move).build().perform();
		Thread.sleep(2000);
		
		driver.close();
	}
}
