package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FrameHandle {
	public static  WebDriver driver;
  @Test
  public void test() throws InterruptedException {
	  driver=new FirefoxDriver();
	  driver.get("http://the-internet.herokuapp.com/nested_frames");
	  Thread.sleep(5000);
	  driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_top']")));
	  driver.switchTo().frame("frame-middle");
	  String sval=driver.findElement(By.xpath("//div[@id='content']")).getText();
	  System.out.println("value is  "+ sval);
	  driver.switchTo().defaultContent();
	  driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_bottom']")));
	 
  }
}
