package appiumtrainingautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class LongPressGesture extends BaseTest {

	@Test
	public void longPressureGesture() throws MalformedURLException, URISyntaxException, InterruptedException {

		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
		
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		
		WebElement element=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='People Names']"));
		
		
		longPressAction(element);
		
		String menuText=driver.findElement(AppiumBy.id("android:id/title")).getText();
		Assert.assertEquals(menuText, "Sample menu");
		
		Assert.assertTrue(driver.findElement(AppiumBy.id("android:id/title")).isDisplayed());
		
		Thread.sleep(3000);
		
		
	}
}
