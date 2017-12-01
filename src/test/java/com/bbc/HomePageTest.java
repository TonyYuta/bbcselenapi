package com.bbc;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestData {

	@Test(enabled = false, groups = {"driver", "regression", "all"}, priority = 0)
	public void testDriver() {
		AssertJUnit.assertEquals(driver, driver);	
	}
 
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateHomePage() {
		String expected = "https://www.bbc.com/";
		String actual = "";
		actual = common.navigateToHomePage();
		AssertJUnit.assertEquals(actual, expected, "URI doesn't match to Home page");
	}
	
	

	

	
	

	
	
	
}
