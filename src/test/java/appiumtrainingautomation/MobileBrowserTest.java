package appiumtrainingautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileBrowserTest extends MobileBrowserBaseTest {
	
	
	
	@Test 
	public void browserTest() throws InterruptedException
	{
		
		//driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(7000);
		
		/*
		 * driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		 * 
		 * driver.findElement(By.linkText("products")).click();
		 * 
		 * 
		 * ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)", "");
		 * 
		 * String
		 * text=driver.findElement(By.cssSelector("a[href*='products/3']")).getText();
		 * 
		 * Assert.assertEquals(text, "Devops");
		 */
		
		/*
		 * Thread.sleep(9000); System.out.println(driver.getTitle());
		 * driver.findElement(By.name("q")).sendKeys("Rahu sheety academy");
		 * driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 */
		
	}
	

}
