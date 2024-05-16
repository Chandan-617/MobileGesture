package appiumtrainingautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommersetc_1 extends EcommerseBaseTest {

	@Test
	public void fillForm() throws InterruptedException {

		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Advik");
		driver.hideKeyboard();
		driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		  driver.findElement(AppiumBy
		  .androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"
		  ));
		  
		  int productCount = driver.findElements(AppiumBy.id(
		  "com.androidsample.generalstore:id/productName")).size();
		  System.out.println("productCount ");
		  
		  for (int i = 0; i < productCount; i++) {
		  
		  String productName = driver.findElements(AppiumBy.id(
		  "com.androidsample.generalstore:id/productName")) .get(i).getText();
		  
		  System.out.println("The product name is : " + productName);
		  
		  if (productName.equalsIgnoreCase("Jordan 6 Rings")) {
		  
		  driver.findElements(AppiumBy.id(
		  "com.androidsample.generalstore:id/productAddCart")).get(i).click();
		  System.out.println("product is selected");
		  
		  }
		  
		  }
		  
		  driver.findElement(AppiumBy.id(
		  "com.androidsample.generalstore:id/appbar_btn_cart")).click();
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  
		  wait.until(ExpectedConditions.attributeContains(
		  driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),
		  "text", "Cart"));
		  
		  String lastPageProduct = driver.findElement(AppiumBy.id(
		  "com.androidsample.generalstore:id/productName")) .getText();
		  Assert.assertEquals(lastPageProduct, "Jordan 6 Rings");
		 
	}

}
