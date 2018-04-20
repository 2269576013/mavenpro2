package tedu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.Log;

public class TestLog4j {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://baidu.com");
	  Log.info("Baidu page is loaded");
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		Log.error("Catched InterruptedException");
		e.printStackTrace();
	}
  }

  @BeforeMethod
  public void beforeMethod() {
	  Log.info("Try to open browser");
	  driver = new FirefoxDriver();
	  Log.info("Browser is opened");
  }

  @AfterMethod
  public void afterMethod() {
	  Log.info("Try to close browser");
	  driver.quit();
	  Log.info("Browser is closed");
  }

}
