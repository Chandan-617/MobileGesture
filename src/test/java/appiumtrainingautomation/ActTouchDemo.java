package appiumtrainingautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class ActTouchDemo {
	public AppiumDriverLocalService service;
	
	@Test
	public void touchActTest() throws MalformedURLException, InterruptedException
	{
		
		service = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C:\\Users\\lrz\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
	UiAutomator2Options options=new UiAutomator2Options();
	
	options.setDeviceName("chandanemulator");
	options.setApp("E:\\MobileAutomationTraining\\Appium\\App\\ApiDemos-debug.apk");
	
	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
	
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	
	WebElement source =  driver.findElement(By.xpath("//android.view.View[@resource-id=\"io.appium.android.apis:id/drag_dot_1\"]"));
    
    WebElement destination =  driver.findElement(By.xpath("//android.view.View[@resource-id=\"io.appium.android.apis:id/drag_dot_2\"]"));

    
    
    
    
	/*
	 * Thread.sleep(5000);
	 * 
	 * //By using touch action class TouchAction action = new TouchAction(driver);
	 * 
	 * action.longPress(longPressOptions().withElement(element(source))).moveTo(
	 * element(destination)).release().perform();
	 */
		 Thread.sleep(2000);
		
	}
	
	
	
	
	
	

}
