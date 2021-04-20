package equifax.qa.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import equifax.qa.amazon.utils.ElementUtil;

public class AmazonProceedToCheckOut {
	private ElementUtil elementUtil;
	
//	Page Objects - By locators - OR
	private By proceedToCheckOut = By.xpath("/a[@id='hlb-ptc-btn-native’]");
	
//	constructor:
	public AmazonProceedToCheckOut(WebDriver driver) {
		elementUtil = new ElementUtil(driver);
	}
	
//	page actions:
	public void doClickProceedToCheckOut() {
		elementUtil.doClick(proceedToCheckOut);
	}

}
