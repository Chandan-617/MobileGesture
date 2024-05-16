package appiumtrainingautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.event.KeyEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class MisceilinousAppiumAction extends BaseTest {

	@Test
	public void wifiSettingName() throws MalformedURLException, URISyntaxException, InterruptedException {

		Activity activity=new Activity(" io.appium.android.apis","io.appium.android.apis.preference.PreferenceDependencies");
		
		driver.startActivity(activity);
		
		Thread.sleep(3000);
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		
		DeviceRotation lanscape=new DeviceRotation(0,0,90);
		
		driver.rotate(lanscape);
		
		driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		String alerttitle=driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		
		Assert.assertEquals(alerttitle, "WiFi settings");
		
		// copy paste
		driver.setClipboardText("Chandan Wifi");
		
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		
		driver.findElements(By.className("android.widget.Button")).get(1).click();
		
		
			
		
		

	}

}
