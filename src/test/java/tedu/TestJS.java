package tedu;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import utils.Utils;

public class TestJS {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("file:///E:/example/id.html");
	  String js1 = "return document.title;";
	  String t1 = (String)Utils.executeJS(js1);
	  assertEquals(t1,"id定位");
	  String js2 = "arguments[0].setAttribute(arguments[1],arguments[2]);";
	  WebElement we1 = driver.findElement(By.id("username"));
	  if (Utils.getElementStatus(we1)){
		  Utils.executeJS(js2, we1,"value","123456");
	  }
	  Utils.sleep(3000);
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
