package appiumtrainingautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommersetc_2 extends EcommerseBaseTest {

	@Test
	public void fillForm() throws InterruptedException {

		//driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Advik");
		driver.hideKeyboard();
		driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		String toastmessage=driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		
		Assert.assertEquals(toastmessage, "Please enter your name");

	}

}
