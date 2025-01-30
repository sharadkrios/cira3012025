package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import com.ciranet.configurations.pages.EnforcementPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class EnforcementPageTest extends TestBase {

	// Create the EnforcementPage object
	EnforcementPage enforcementPage = createPage(EnforcementPage.class);

	@Test(priority = 0, description = "Verify Enforcement navigation", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyEnforcementNavigation() {
		LoggerManager.info("Verifying Enforcement navigation");
		TestBase.setExtentReportSettings("Enforcement", Constants.SMOKE_TESTING, "Verify Enforcement",
				"Verifying Enforcement navigation");
		enforcementPage = new EnforcementPage(driver);
		assertTrue(enforcementPage.navigate(), "Error navigate to Enforcement");
	}

	@Test(priority = 1, description = "Verify Architectural Categories", groups = {
			Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyArchitecturalCategories() {
		LoggerManager.info("Verifying Architectural Categories");
		TestBase.setExtentReportSettings("Architectural Categories", Constants.FUNCTIONAL_TESTING,
				"Verify Architectural Categories", "Verifying Architectural Categories");
		enforcementPage = new EnforcementPage(driver);
		assertEquals(enforcementPage.architecturalCategories(), "Architectural Categories - Global");
	}

	@Test(priority = 2, description = "Verify Architectural Forms and Guides", groups = {
			Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyArchitecturalFormsandGuides() {
		LoggerManager.info("Verifying Architectural Forms and Guides");
		TestBase.setExtentReportSettings("Architectural Forms and Guides", Constants.FUNCTIONAL_TESTING,
				"Verify Architectural Forms and Guides", "Verifying Architectural Forms and Guides");
		enforcementPage = new EnforcementPage(driver);
		assertEquals(enforcementPage.architecturalFormsandGuides(), "Architectural Forms and Guides - Global");
	}

	@Test(priority = 3, description = "Verify Violation Category SubCategory Configuration", groups = {
			Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyViolationCategorySubCategoryConfiguration() {
		LoggerManager.info("Verifying Violation Category SubCategory Configuration");
		TestBase.setExtentReportSettings("Violation Category SubCategory Configuration", Constants.FUNCTIONAL_TESTING,
				"Verify Violation Category SubCategory Configuration",
				"Verifying Violation Category SubCategory Configuration");
		enforcementPage = new EnforcementPage(driver);
		assertEquals(enforcementPage.violationCategorySubCategoryConfiguration(),
				"Violation Category / SubCategory Configuration - Global");
	}

	@Test(priority = 4, description = "Verify Violation Escalation Configuration", groups = {
			Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyViolationEscalationConfiguration() {
		LoggerManager.info("Verifying Violation Escalation Configuration");
		TestBase.setExtentReportSettings("Violation Escalation Configuration", Constants.FUNCTIONAL_TESTING,
				"Verify Violation Escalation Configuration", "Verifying Violation Escalation Configuration");
		enforcementPage = new EnforcementPage(driver);
		assertEquals(enforcementPage.violationEscalationConfiguration(), "Violation Escalation Configuration - Global");
	}

	@Test(priority = 5, description = "Verify Violation Notification Templates", groups = {
			Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyViolationNotificationTemplates() {
		LoggerManager.info("Verifying Violation Notification Templates");
		TestBase.setExtentReportSettings("Violation Notification Templates", Constants.FUNCTIONAL_TESTING,
				"Verify Violation Notification Templates", "Verifying Violation Notification Templates");
		enforcementPage = new EnforcementPage(driver);
		assertEquals(enforcementPage.violationNotificationTemplates(), "Violation Notification Templates - Global");
	}

	@Test(priority = 6, description = "Verify Violation Restriction Definition", groups = {
			Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyViolationRestrictionDefinition() {
		LoggerManager.info("Verifying Violation Restriction Definition");
		TestBase.setExtentReportSettings("Violation Restriction Definition", Constants.FUNCTIONAL_TESTING,
				"Verify Violation Restriction Definition", "Verifying Violation Restriction Definition");
		enforcementPage = new EnforcementPage(driver);
		assertEquals(enforcementPage.violationRestrictionDefinition(),
				"Violation Restriction Definition - 1920 E. Maryland Place Townhomes, Inc.");
	}
}