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

public class DragDropTest extends BaseTest {

	@Test
	public void dragDropGesture() throws MalformedURLException, URISyntaxException, InterruptedException {

		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		
		
		WebElement source=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
		
				
				((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
					    "elementId", ((RemoteWebElement) source).getId(),
					    "endX", 631,
					    "endY", 562
					));
				
				String result=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
		
				Assert.assertEquals(result, "Dropped!");
				
		Thread.sleep(4000);
	}
}
