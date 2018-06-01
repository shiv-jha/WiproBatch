import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class HybridApps {
  @Test
  public void f() throws MalformedURLException, InterruptedException {
	  
	  
	  ///////If you have the apk , need to be tested
	//  File appDir=new File("src");
	//  File app=new File(appDir,"filem.apk");
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	//cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	  
	  
	  
	  
//	  cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
//	  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Nexus 9");
//	 //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "eluga_ray_500");
//	  cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
	  //capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
	  //cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	  
	  
	// we need to define platform name
		  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		 
		// Set the device name as well (you can give any name)
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Google Nexus 9");
		  //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emulator");
		  
		 
		 // set the android version as well 
		   capabilities.setCapability(MobileCapabilityType.VERSION,"7.0");
		   capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		   capabilities.setCapability("appActivity","com.amazon.mShop.home.HomeActivity"); // This is Launcher activity of your app (you can get it from apk info app)
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		Thread.sleep(10000);
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/new_user")).click();
//		driver.findElement(By.name("+")).click();
//		driver.findElement(By.name("4")).click();
//		driver.findElement(By.name("=")).click();
			  
	  
  }
}
