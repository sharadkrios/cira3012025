package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.configurations.pages.ServicesPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class ServicesPageTest extends TestBase {
	
	// Create the ServicesPage object
	ServicesPage servicesPage = createPage(ServicesPage.class);
		
	@Test(priority = 0, description = "Verify Service Configurations navigation", groups = {Constants.SMOKE_TESTING}, alwaysRun = true)
	public void verifyServicesNavigation() 
	{
		LoggerManager.info("Verifying Service Configurations navigation");
		TestBase.setExtentReportSettings("Service Configurations", Constants.SMOKE_TESTING, "Verify Services Configurations",
				"Verifying Services Configurations navigation");
		servicesPage = new ServicesPage(driver);
		assertTrue(servicesPage.navigate(), "Error navigate to Services Configurations");
	}
	
	@Test(priority = 1, description = "Verify Board Portal", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyBoardPortal() 
	{
		LoggerManager.info("Verifying Board Portal");
		TestBase.setExtentReportSettings("Board Portal", Constants.FUNCTIONAL_TESTING, "Verify Board Portal",
				"Verifying Board Portal");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.boardPortal(), "Board Portal - Global");
	}

	@Test(priority = 2, description = "Verify Branding Configuration", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyBrandingConfiguration() 
	{
		LoggerManager.info("Verifying Branding Configuration");
		TestBase.setExtentReportSettings("Branding Configuration", Constants.FUNCTIONAL_TESTING,
				"Verify Branding Configuration", "Verifying Branding Configuration");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.brandingConfiguration(), "Branding Configuration - Global");
	}

	@Test(priority = 3, description = "Verify Bussiness Hours", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyBussinessHours() 
	{
		LoggerManager.info("Verifying Bussiness Hours");
		TestBase.setExtentReportSettings("Business Hours", Constants.FUNCTIONAL_TESTING,
				"Verify Business Hours ", "Verifying Business Hours");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.bussinessHour(), "Business Hours - Global");
	}

	@Test(priority = 4, description = "Verify Calendar Configuration", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyCalendarConfiguration() 
	{
		LoggerManager.info("Verifying Calendar Configuration");
		TestBase.setExtentReportSettings("Calendar Configuration", Constants.FUNCTIONAL_TESTING,
				"Verify Calendar Configuration", "Verifying Calendar Configuration");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.calendarConfiguration(), "Calendar Configuration - Global");
	}

	@Test(priority = 5, description = "Verify Mass Communication System Template", groups = {
			Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyMassCommunicationSystemTemplate() 
	{
		LoggerManager.info("Verifying Mass Communication System Template");
		TestBase.setExtentReportSettings("Mass Communication System Template",
				Constants.FUNCTIONAL_TESTING, "Verify Mass Communication System Template",
				"Verifying Mass Communication System Template");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.massCommunicationSystemTemplate(),
				"Mass Communication System Template - Global");
	}

	@Test(priority = 6, description = "Verify Resident Portal", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyResidentPortal() 
	{
		LoggerManager.info("Verifying Resident Portal");
		TestBase.setExtentReportSettings("Resident Portal", Constants.FUNCTIONAL_TESTING,
				"Verify Resident Portal", "Verifying Resident Portal");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.residentPortal(), "Resident Portal - Global");
	}

	@Test(priority = 7, description = "Verify Service Groups", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyServiceGroups() 
	{
		LoggerManager.info("Verifying Service Groups");
		TestBase.setExtentReportSettings("Service Groups", Constants.FUNCTIONAL_TESTING, "Verify Service Groups",
				"Verifying Service Groups");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.serviceGroups(), "Service Groups - Global");
	}

	@Test(priority = 8, description = "Verify Service Roles", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyServiceRoles() 
	{
		LoggerManager.info("Verifying Service Roles");
		TestBase.setExtentReportSettings("Service Roles", Constants.FUNCTIONAL_TESTING, "Verify Service Roles",
				"Verifying Service Roles");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.serviceRoles(), "Service Roles - Global");
	}

	@Test(priority = 9, description = "Verify Services", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyServices() 
	{
		LoggerManager.info("Verifying Services");
		TestBase.setExtentReportSettings("Services", Constants.FUNCTIONAL_TESTING, "Verify Services",
				"Verifying Services");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.services(), "Services - Global");
	}
}