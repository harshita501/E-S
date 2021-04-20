package equifax.qa.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import equifax.qa.amazon.utils.ElementUtil;

public class AmazonSearchPage {
	
	private ElementUtil elementUtil;
	private WebDriver driver;
	
//	Page Objects - By locators - OR
	private By clickFirstImage = By.xpath("//span[@data-component-id=1]");
	
//	constructor:
	public AmazonSearchPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);	
	}
	
//	page actions:
	public AmazonAddToCartPage doSelectFirstImage() {
		elementUtil.doClick(clickFirstImage);
		return new AmazonAddToCartPage(driver);
	}

}
