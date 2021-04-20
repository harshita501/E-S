package equifax.qa.amazon.tests;

import org.testng.annotations.Test;

import equifax.qa.amazon.base.BaseTest;
import equifax.qa.amazon.pages.AmazonSearchPage;

public class AmazonPageTest extends BaseTest {
	
	@Test(priority = 1)
	public void amazonPageTest() {
		amazonPage.doSearch();
	}
	
	
	
	
	
	

}
