package equifax.qa.amazon.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import equifax.qa.amazon.base.BaseTest;

public class AmazonProceedToCheckOutPageTest extends BaseTest {
	
	@BeforeClass
	public void AccSetUp() {
		amazonSearchPage = amazonPage.doSearch();
	}
	
	@Test(priority = 1)
	public void amazonProceedToCheckOut() {
		amazonProceedToCheckOut.doClickProceedToCheckOut();
	}

}
