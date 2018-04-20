package ecshop.tc;

import static org.testng.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

import ecshop.page.AdvancedSearchPage;
import ecshop.page.SearchResultPage;

import utils.BaseTest;
import utils.Constants;
import utils.ReadFile;
import utils.Utils;

public class TestAdvancedSearch extends BaseTest{
//	WebDriver driver;
	AdvancedSearchPage asp;
	SearchResultPage srp;
	
  @Test(dataProvider = "dp")
  public void f(
			String kw,//关键字
			String cg,//分类
			String bd,//品牌
			String minp,//最小价格
			String maxp,//最大价格
			String ext,//扩展选项
			String dt,//上市日期
			String cl,//颜色
			String expCount//预期结果个数
  		) {
	  asp = new AdvancedSearchPage(driver);
	  asp.get();
	  srp = asp.advancedSearch(kw, cg, bd, minp, maxp, ext, dt, cl);
	  String actCount = srp.getCount();
	  assertEquals(actCount,expCount);
  }

//  @BeforeMethod
//  @Parameters("browser")
//  public void beforeMethod(String b) {
//	  driver = Utils.openBrowser(b);
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//	  driver.quit();
//  }

  @DataProvider
  public Object[][] dp() {
//    return ReadFile.getTestDataFromExcel(Constants.DATA_PATH, "数据_ECShop_高级搜索.xlsx", "高级搜索");
    return ReadFile.getTestDataFromCSVFile(Constants.DATA_PATH, "数据_ECShop_高级搜索.csv");

  }

}
