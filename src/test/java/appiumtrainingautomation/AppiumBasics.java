package appiumtrainingautomation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics extends BaseTest {

	@Test
	public void wifiSettingName() throws MalformedURLException, URISyntaxException, InterruptedException {

		driver.findElement(AppiumBy.accessibilityId("Preference")).click();

		// xpath ; //tagname[@attribute='value']
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		String alerttitle=driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		
		Assert.assertEquals(alerttitle, "WiFi settings");
		
		driver.findElement(By.id("android:id/edit")).sendKeys("chandan wifi");
		
		driver.findElements(By.className("android.widget.Button")).get(1).click();

	}

}
