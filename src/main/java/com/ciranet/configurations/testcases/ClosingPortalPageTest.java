package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.configurations.pages.ClosingPortalPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class ClosingPortalPageTest extends TestBase {
	
	// Create the ClosingPortalPage object
	ClosingPortalPage closingPortalPage = createPage(ClosingPortalPage.class);

	@Test(priority = 0, description = "Verify Closing Portal navigation", groups = { Constants.SMOKE_TESTING })
	public void verifyClosingPortalNavigation() {
		LoggerManager.info("Verifying Closing Portal");
		TestBase.setExtentReportSettings("Closing Portal", Constants.SMOKE_TESTING, "Verify Closing Portal",
				"Verifying Closing Portal");
		closingPortalPage = new ClosingPortalPage(driver);
		assertTrue(closingPortalPage.navigate(), "Error navigate to Closing Portal Configurations");
	}

	@Test(priority = 1, description = "Verify Account Inquiry Fulfillment", groups = {
			Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyAccountInquiryFulfillment() {
		LoggerManager.info("Verifying Account Inquiry Fulfillment");
		TestBase.setExtentReportSettings("Account Inquiry Fulfillment", Constants.FUNCTIONAL_TESTING,
				"Verify Account Inquiry Fulfillment", "Verifying Account Inquiry Fulfillment");
		closingPortalPage = new ClosingPortalPage(driver);
		assertEquals(closingPortalPage.selectConfigurationDropdown("Account Inquiry Fulfillment"),
				"Account Inquiry Fulfillment");
	}

	@Test(priority = 2, description = "Verify CiraConnect Fee", groups = {
			Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyCiraConnectFee() {
		LoggerManager.info("Verifying CiraConnect Fee");
		TestBase.setExtentReportSettings("CiraConnect Fee", Constants.FUNCTIONAL_TESTING, "Verify CiraConnect Fee",
				"Verifying CiraConnect Fee");
		closingPortalPage = new ClosingPortalPage(driver);
		assertEquals(closingPortalPage.selectConfigurationDropdown("CiraConnect Fee"), "CiraConnect Fee");
	}

	@Test(priority = 3, description = "Verify Closing Portal Delivery Tiers", groups = {
			Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyClosingPortalDeliveryTiers() {
		LoggerManager.info("Verifying Closing Portal Delivery Tiers");
		TestBase.setExtentReportSettings("Closing Portal Delivery Tiers", Constants.FUNCTIONAL_TESTING,
				"Verify Closing Portal Delivery Tiers", "Verifying Closing Portal Delivery Tiers");
		closingPortalPage = new ClosingPortalPage(driver);
		assertEquals(closingPortalPage.selectConfigurationDropdown("Closing Portal Delivery Tiers"),
				"Closing Portal Delivery Tiers");
	}

	@Test(priority = 4, description = "Verify Portal Configuration Fees & Charges", groups = {
			Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyPortalConfigurationFeesCharges() {
		LoggerManager.info("Verifying Portal Configuration Fees & Charges");
		TestBase.setExtentReportSettings("Portal Configuration Fees & Charges", Constants.FUNCTIONAL_TESTING,
				"Verify Portal Configuration Fees & Charges", "Verifying Portal Configuration Fees & Charges");
		assertEquals(closingPortalPage.selectConfigurationDropdown("Portal Configuration Fees & Charges"),
				"Portal Configuration Fees & Charges");
	}
}
