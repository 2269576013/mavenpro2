package tedu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import utils.Log;
import utils.Utils;

public class TestScreenShotID {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("file:///E:/example/id.html");
	  try{
		  driver.findElement(By.id("abcdef")).click();
	  }catch(Exception e){
		  e.printStackTrace();
		  Log.error(e.getMessage());
		  String sTestCaseName=this.getClass().getName();
		  Utils.takeScreenshot(sTestCaseName);
	  }
  }

  @BeforeMethod
  public void beforeMethod() {
	  driver = Utils.openBrowser("firefox");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
