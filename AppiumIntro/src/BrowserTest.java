
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class BrowserTest {
AndroidDriver driver;

@Test
public void TC1() throws MalformedURLException{
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	// Create object of  DesiredCapabilities class and specify android platform
	DesiredCapabilities capabilities=DesiredCapabilities.android();
	 
	 
	// set the capability to execute test in chrome browser
	 capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
	 
	// set the capability to execute our test in Android Platform
	   capabilities.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID);
	 
	// we need to define platform name
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	 
	// Set the device name as well (you can give any name)
	 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Google Nexus 9");
	  //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emulator");
	  
	 
	 // set the android version as well 
	   capabilities.setCapability(MobileCapabilityType.VERSION,"7.0");
	 
	 // Create object of URL class and specify the appium server address
	 URL url= new URL("http://127.0.0.1:4723/wd/hub");
	 
	// Create object of  AndroidDriver class and pass the url and capability that we created
	 AndroidDriver  driver = new AndroidDriver(url, capabilities);
	// IOSDriver
	// Open url
	
   driver.get("http://www.newtours.demoaut.com");
   driver.findElement(By.name("userName")).sendKeys("mercury");
	driver.findElement(By.name("password")).sendKeys("mercury");
	
	//Click on button
	driver.findElement(By.name("login")).click();
	
	new Select(driver.findElement(By.name("passCount"))).selectByVisibleText("2");
	new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("London");
	
	//Radio Button
	driver.findElement(By.xpath("//input[@value='Business']")).click();
	
	//Explicit Wait
	WebDriverWait wait=new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.elementToBeClickable(By.name("findFlights")));
	driver.findElement(By.name("findFlights")).click();
  
   //driver.findElementByAccessibilityId(using)

}

}

