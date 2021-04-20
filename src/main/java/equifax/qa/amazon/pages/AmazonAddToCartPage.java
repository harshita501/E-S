package equifax.qa.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import equifax.qa.amazon.utils.ElementUtil;

public class AmazonAddToCartPage {
	
	private ElementUtil elementUtil;
	private WebDriver driver;
	
//	Page Objects - By locators - OR
	private By addToCart = By.xpath("/input[@id='add-to-cart-button']");
	
//	constructor:
	public AmazonAddToCartPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);	
	}
//	page actions:
	public AmazonProceedToCheckOut doClickOnAddToCart() {
		elementUtil.doClick(addToCart);
		return new AmazonProceedToCheckOut(driver);
		
	}

}
