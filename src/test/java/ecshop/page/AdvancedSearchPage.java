package ecshop.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.Constants;
import utils.Utils;

/**
 * 高级搜索网页
 * @author tarena
 *
 */
public class AdvancedSearchPage extends BasePage {
//	WebDriver driver;
//	String url = "http://localhost/ws/ecshop/upload/search.php?encode=YToyOntzOjM6ImFjdCI7czoxNToiYWR2YW5jZWRfc2VhcmNoIjtzOjE4OiJzZWFyY2hfZW5jb2RlX3RpbWUiO2k6MTUyMjc0OTc5Nzt9";
	
	@FindBy(how = How.ID,using = "keywords")
	@CacheLookup
	WebElement keywords;
	
	@FindBy(how = How.ID,using = "select")
	@CacheLookup
	WebElement select;
	
	
	@FindBy(how = How.ID,using = "brand")
	@CacheLookup
	WebElement brand;
	
	@FindBy(how = How.ID,using = "min_price")
	@CacheLookup
	WebElement min_price;
	
	
	@FindBy(how = How.ID,using = "max_price")
	@CacheLookup
	WebElement max_price;
	
	@FindBy(how = How.NAME,using = "goods_type")
	@CacheLookup
	WebElement goods_type;
	
	@FindBy(how = How.NAME,using = "attr[172]")
	@CacheLookup
	WebElement attr172;
	
	@FindBy(how = How.NAME,using = "attr[185]")
	@CacheLookup
	WebElement attr185;
	
	
	@FindBy(how = How.NAME,using = "Submit")
	@CacheLookup
	WebElement Submit;
	
	
	@FindBy(how = How.TAG_NAME,using = "b")
	@CacheLookup
	WebElement count;
	
	public AdvancedSearchPage(WebDriver driver){
		super(driver);
		super.url = Constants.ECSHOP_ADVANCED_SEARCH_URL;
	}
	
	public AdvancedSearchPage(WebDriver driver,String title){
		super(driver,title);
		super.url = Constants.ECSHOP_ADVANCED_SEARCH_URL;
	}
	
//	public void get(){
//		driver.get(url);
//	}
	
	/**
	 * 高级搜索
	 */
	public SearchResultPage advancedSearch(
			String kw,//关键字
			String cg,//分类
			String bd,//品牌
			String minp,//最小价格
			String maxp,//最大价格
			String ext,//扩展选项
			String dt,//上市日期
			String cl//颜色
			){
		keywords.clear();
		keywords.sendKeys(kw);
		new Select(select).selectByVisibleText(cg);
		new Select(brand).selectByVisibleText(bd);
		min_price.clear();
		min_price.sendKeys(minp);
		max_price.clear();
		max_price.sendKeys(maxp);
		new Select(goods_type).selectByVisibleText(ext);
		if (ext.equals("精品手机")){
			Utils.sleep(1000);
			new Select(attr172).selectByVisibleText(dt);
			new Select(attr185).selectByVisibleText(cl);
		}
		Submit.click();
		Utils.sleep(2000);
		return new SearchResultPage(driver);
	}
}






