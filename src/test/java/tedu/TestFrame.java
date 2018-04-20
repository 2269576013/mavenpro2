package tedu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import utils.Utils;

public class TestFrame {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("file:///E:/example/main1.html");
//	  WebElement we1 = driver.findElement(By.name("f1"));
//	  Utils.switchFrame(we1);
	  Utils.switchFrameByPageSource("input1");
	  Utils.inputValue(driver.findElement(By.id("input1")),"123456");
//	  Utils.switchToDefault();
//	  WebElement we2 = driver.findElement(By.name("f2"));
//	  Utils.switchFrame(we2);
	  Utils.switchFrameByPageSource("input2");
	  Utils.inputValue(driver.findElement(By.id("input2")),"654321");
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
