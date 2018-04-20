package tedu;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

import utils.ReadFile;

public class NewTest2 {
  @Test(dataProvider = "dp")
  public void f(String name,String age,String height) {
	  System.out.println("姓名是"+name+"，年龄是"+age+"，身高是"+height);
  }

  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @DataProvider
  public Object[][] dp() {
    return ReadFile.getTestDataFromExcel("C:\\", "数据.xlsx", "Sheet1");
  }

}
