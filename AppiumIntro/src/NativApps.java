import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class NativApps {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver;
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName","Android");
		//capabilities.setCapability("deviceName","Emulator");
		capabilities.setCapability("deviceName","Google Nexus 9");
		//capabilities.setCapability("VERSION", "6.0");
		capabilities.setCapability("VERSION", "7.0");
		//capabilities.setCapability("BROWSER_NAME", "Android");
		
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity","com.android.calculator2.Calculator"); // This is Launcher activity of your app (you can get it from apk info app)
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		   WebElement two=driver.findElement(By.id("com.android.calculator2:id/digit_2"));
		   two.click();
		   WebElement plus=driver.findElement(By.id("com.android.calculator2:id/op_add"));
		   plus.click();
		   WebElement four=driver.findElement(By.id("com.android.calculator2:id/digit_4"));
		   four.click();
		   WebElement equalTo=driver.findElement(By.id("com.android.calculator2:id/eq"));
		   equalTo.click();
		  String sResult= driver.findElement(By.id("com.android.calculator2:id/formula")).getText();
		  System.out.println("Sum is "+ sResult);
		  //Assert.assertEquals(6, sResult);
		
		
	}

}
