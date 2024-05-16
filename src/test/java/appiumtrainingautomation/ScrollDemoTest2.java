package appiumtrainingautomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class ScrollDemoTest2 {

	public static void main(String[] args) throws MalformedURLException {
		
		
		
		  UiAutomator2Options options=new UiAutomator2Options();
		  options.setDeviceName("chandanemulator");
		  
		  options.setPlatformName("Android");
		  
		  options.setPlatformVersion("14");
		  
		  options.setAutomationName("uiautomator2");
		  
		  options.setAppPackage("io.appium.android.apis");
		  
		  
		  
		  options.setAppActivity("io.appium.android.apis.ApiDemos");
		 
		
		URL url=new URL("http://127.0.0.1:4723/");
		
		AndroidDriver driver=new AndroidDriver(url,options);
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		//GetScreen size
		
		Dimension size = driver.manage().window().getSize();
		
		
		
		//find the positon where we need to touch
		
		int startX=size.getWidth()/2;
		int startY=size.getHeight()/2;
		
		
		//position till you want to move your finger to swipe
		
		int endX=startX;
		
		int endY=(int)(size.getHeight() *.25);
		
		//PointerInput class to create a sequence of actions 
				PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
				
				//Sequence object, which is a list of actions that will be performed on the device
				Sequence sequence = new Sequence(finger1, 1)
						.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
						.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
						.addAction(new Pause(finger1, Duration.ofMillis(200))) //wait for some time
						.addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
						.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

				//perform the Sequence of action
				driver.perform(Collections.singletonList(sequence));
	}

}
