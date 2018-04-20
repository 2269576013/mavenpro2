package tedu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import utils.Utils;

public class TestSelect {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("file:///E:/example/select.html");
	  WebElement nl = driver.findElement(By.id("menus_navlist"));
	  //断言列表框可以多选
	  Utils.assertMultiple(nl);
	  
	  WebElement b = driver.findElement(By.id("brand"));
	  //断言品牌下拉框不可以多选
	  Utils.assertNotMultiple(b);
	  //断言当前默认选项等于“所有品牌”
	  Utils.assertSelectedOption(b, "所有品牌");
	  //断言所有选项中包含“联想”和“三星”
	  Utils.assertOptionsContains(b, "联想","三星");
  }
  
  @Test
  public void f1() {
	  driver.get("file:///E:/example/select.html");
	  WebElement nl = driver.findElement(By.id("menus_navlist"));
	  Utils.selectDropDown(nl, "byindex", "1");
	  Utils.selectDropDown(nl, "byindex", "3");
	  Utils.selectDropDown(nl, "byindex", "4");
	  Utils.sleep(1000);
	  //断言当前被选中的下拉框选项中包含“会员列表”和“订单”
	  Utils.assertSelectedContains(nl, "会员列表","订单");
	  //断言列表框所有选项的个数是5
	  Utils.assertOptionsCount(nl, 5);
	  //断言列表框被选中的选项个数是3
	  Utils.assertSelectedOptionsCount(nl, 3);
  }

  @BeforeMethod
  public void beforeMethod() {
	  driver =Utils.openBrowser("firefox");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
