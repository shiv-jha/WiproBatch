package p1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	public static  WebDriver driver;
  @Test
  public void dragDrop() throws InterruptedException {
	  
	  driver=new FirefoxDriver();
	  driver.get("http://jqueryui.com/droppable/");
	  Thread.sleep(5000);
	  driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
	  WebElement w1=driver.findElement(By.id("draggable"));
	  WebElement w2=driver.findElement(By.cssSelector(".ui-droppable"));
	  Actions action = new Actions(driver);
	  action.dragAndDrop(w1, w2).build().perform();
	 // action.clickAndHold(w1).
	  /*
	  driver.get("http://jqueryui.com/resizable/");
	  Thread.sleep(5000);
	 WebElement w= driver.findElement(By.xpath("//a[contains(.,'Sortable')]"));
	 Actions action = new Actions(driver);
	 action.contextClick(w).build().perform();
	 Thread.sleep(4000);
	 action.sendKeys(Keys.ARROW_DOWN).build().perform();
	 action.sendKeys(Keys.ARROW_DOWN).build().perform();
	 Thread.sleep(3000);
	 action.sendKeys(Keys.RETURN).build().perform();
	 */
//	  
//	  driver.get("file:///E:/Selenium/docs/sample.html");
//	  Thread.sleep(5000);
//	  System.out.println("Title is :- "+ driver.getTitle());
//	  System.out.println(driver.getWindowHandle());
//	  driver.findElement(By.xpath("//a[@href='http://www.yahoo.com']")).click();
//	  Thread.sleep(5000);
//	  String sHandle="";
//	 Set sHandles=driver.getWindowHandles();
//	 for (Object s : sHandles) {
//		System.out.println(s.toString());
//		 sHandle=s.toString();
//	}
//	 
//	driver.switchTo().window(sHandle);
//	 Thread.sleep(5000);
//	 System.out.println("Title is :- "+ driver.getTitle());
//	
	 //action.keyDown(Keys.ARROW_DOWN);
	 //action.keyDown(Keys.ARROW_DOWN);
  }
}
