package com.bbc;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestData {

	@Test(enabled = false, groups = {"driver", "regression", "all"}, priority = 0)
	public void testDriver() {
		Assert.assertEquals(driver, driver);	
	}
 
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateHomePage() {
		String expected = "https://www.bbc.com/";
		String actual = "";
		actual = common.navigateToHomePage();
		Assert.assertEquals(actual, expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToUseCasesPage() {
		String expected = "https://www.bbc.com/pages/product_cases";
		String actual = "";
		actual = common.navigateToUseCasesPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to Use Case page");
	}
	
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToCustomerTestimonialsPage() {
		String expected = "https://www.bbc.com/pages/testimonials";
		String actual = "";
		actual = common.navigateToCustomerTestimonialsPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to Testmonials page");
	}

	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToOurServicesPage() {
		String expected = "https://www.bbc.com/pages/services";
		String actual = "";
		actual = common.navigateToOurServicesPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to OUR SERVICES page");
	}
	
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToProductDesignPage() {
		String expected = "https://www.bbc.com/pages/services/product-design";
		String actual = "";
		actual = common.navigateToProductDesignPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to PRODUCT DESIGN page");
	}
	
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToTestingAndCertificationPage() {
		String expected = "https://www.bbc.com/pages/services/product-testing";
		String actual = "";
		actual = common.navigateToTestingAndSertificationPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to TESTING AND CERTIFICATION page");
	}

	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToLogisticsConsultingPage() {
		String expected = "https://www.bbc.com/pages/services/logistics-consulting";
		String actual = "";
		actual = common.navigateToLogisticsConsultingTabPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to LOGISTICS CONSULTING page");
	}
// SUPPORT pages
	
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToFaqPage() {
		String expected = "https://www.bbc.com/pages/faq";
		String actual = "";
		actual = common.navigateToFaqTabPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to FAQ page");
	}

	@Test(enabled = false, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToDevicePortal2Page() {
		String expected = "http://cloudc.bbc.com/index.html?id=Tjh5dTNwUE9kMHkvcTlMUDZoS0t3ZmJKYzV3TXN5WHBEdm5QdEc3R25MUT06MTUwMTgzNzM5NgCIOG8#/devices";
		String actual = "";
		actual = homePage.navigateToDevicePortalV2Tab();
		Assert.assertEquals(actual, expected, "URI doesn't match to DEVICE PORTAL 2.0 page");
	}
	
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToSoftwarePage() {
		String expected = "https://www.bbc.com/pages/software";
		String actual = "";
		actual = common.navigateToSoftwareTab();
		Assert.assertEquals(actual, expected, "URI doesn't match to SOFTWARE page");
	}

	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToAboutUsPage() {
		String expected = "https://www.bbc.com/pages/aboutus";
		String actual = "";
		actual = common.navigateToAboutUsTab();
		Assert.assertEquals(actual, expected, "URI doesn't match to ABOUT US page");
	}

	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToManagementTeamPage() {
		String expected = "https://www.bbc.com/ourteam";
		String actual = "";
		actual = common.navigateToManagementTeamTab();
		Assert.assertEquals(actual, expected, "URI doesn't match to MANAGEMENT TEAM page");
	}

	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToWebsiteDisclamerPage() {
		String expected = "https://www.bbc.com/pages/websitedisclaimer";
		String actual = "";
		actual = common.navigateToWebsiteDisclaimerTab();
		Assert.assertEquals(actual, expected, "URI doesn't match to WEBSITE DISCLAMER page");
	}

	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToPartnersPage() {
		String expected = "https://www.bbc.com/partners";
		String actual = "";
		actual = common.navigateToPartnersTab();
		Assert.assertEquals(actual, expected, "URI doesn't match to PARTNERS page");
	}



	

	
	

	
	
	
}
