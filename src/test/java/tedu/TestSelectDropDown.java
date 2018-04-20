package tedu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.Utils;

public class TestSelectDropDown {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("file:///E:/example/select.html");
	  WebElement we1 = driver.findElement(By.id("menus_navlist"));
	  Utils.selectDropDown(we1, "byvisibletext", "用户评论");
	  Utils.selectDropDown(we1, "byindex", "1");
	  Utils.selectDropDown(we1, "byvalue", "shop_config");
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
