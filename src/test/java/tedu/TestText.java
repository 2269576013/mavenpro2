package tedu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import utils.Utils;

public class TestText {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://localhost/ws/ecshop/upload/index.php");
	  driver.findElement(By.id("keyword")).sendKeys("a");
	  driver.findElement(By.name("imageField")).click();
	  //断言个数是4
	  WebElement c = driver.findElement(By.tagName("b"));
	  Utils.assertText(c, "4");
  }
  
  @Test
  public void f1() {
	  driver.get("http://localhost/ws/ecshop/upload/index.php");
	  WebElement info = driver.findElement(By.id("ECS_MEMBERZONE"));
	  Utils.assertContainsText(info, "欢迎光临本店","欢迎");
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
