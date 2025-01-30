package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.configurations.pages.CommunityAccountingPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class CommunityAccountingPageTest extends TestBase
{
	// Create the CommunityAccountingPage object
	CommunityAccountingPage communityAccountingPage = createPage(CommunityAccountingPage.class);

	@Test(priority = 0, description = "Verify Community Accounting navigation", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifyCommunityAccountingNavigation()
	{
		LoggerManager.info("Verifying Community Accounting navigation");
		TestBase.setExtentReportSettings("Community Accounting", Constants.SMOKE_TESTING,"Verify Community Accounting", "Verifying Community Accounting navigation");
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertTrue(communityAccountingPage.navigate(),"Error navigate to Community Accounting");
	}
	
	@Test(priority = 1, description = "Verify AAP Cross Entity Bill", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyAAPCrossEntityBill() 
	{
		LoggerManager.info("Verifying AAP Cross Entity Bill");
		TestBase.setExtentReportSettings("AAP Cross Entity Bill", Constants.FUNCTIONAL_TESTING, "Verify AAP Cross Entity Bill", "Verifying AAP Cross Entity Bill");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.aapCrossEntityBill(),"AAP Cross Entity Bill - 1920 E. Maryland Place Townhomes, Inc.");
	}

	@Test(priority = 2, description = "Verify AAP Work Flow Auto Action", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyAAPWorkFlowAutoAction() 
	{
		LoggerManager.info("Verifying AAP Work Flow Auto Action");
		TestBase.setExtentReportSettings("AAP  Work Flow Auto Action", Constants.FUNCTIONAL_TESTING, "Verify AAP Work Flow Auto Action", "Verifying AAP Work Flow Auto Action");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.aapWorkFlowAutoAction(),"AAP Work Flow Auto Action - Global");
	}
	
	@Test(priority = 3, description = "Verify AAP Work Flow CheckList", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyAAPWorkFlowCheckList() 
	{
		LoggerManager.info("Verifying AAP Work Flow CheckList");
		TestBase.setExtentReportSettings("AAP Work Flow CheckList", Constants.FUNCTIONAL_TESTING, "Verify AAP Work Flow CheckList", "Verifying AAP Work Flow CheckList");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.aapWorkFlowCheckList(),"AAP Work Flow CheckList - Global");
	}
	
	@Test(priority = 4, description = "Verify AAR Billing Types", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyAARBillingTypes() 
	{
		LoggerManager.info("Verifying AAR Billing Types");
		TestBase.setExtentReportSettings("AAR Billing Types", Constants.FUNCTIONAL_TESTING, "Verify AAR Billing Types", "Verifying AAR Billing Types");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.aarBillingTypes(),"AAR Billing Types - Global");
	}
		
	@Test(priority = 5, description = "Verify AAR Builder Statements", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyAARBuilderStatements() 
	{
		LoggerManager.info("Verifying AAR Builder Statements");
		TestBase.setExtentReportSettings("AAR Builder Statements",Constants.FUNCTIONAL_TESTING, "Verify AAR Builder Statements", "Verifying AAR Builder Statements");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.aarBuilderStatements(),"AAR Builder Statements - Global");
	}

	@Test(priority = 6, description = "Verify AAR Misc Invoice Types", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyAARMiscInvoiceTypes() 
	{
		LoggerManager.info("Verifying AAR Misc Invoice Types");
		TestBase.setExtentReportSettings("AAR Misc Invoice Types", Constants.FUNCTIONAL_TESTING, "Verify AAR Misc Invoice Types", "Verifying AAR Misc Invoice Types");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.aarMiscInvoiceTypes(),"AAR Misc Invoice Types - RealManage");
	}

	@Test(priority = 7, description = "Verify AAR Payment Application Order", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyAARPaymentApplicationOrder() 
	{
		LoggerManager.info("Verifying AAR Payment Application Order");
		TestBase.setExtentReportSettings("AAR Payment Application Order", Constants.FUNCTIONAL_TESTING, "Verify AAR Payment Application Order", "Verifying AAR Payment Application Order");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.aarPaymentApplicationOrder(),"AAR Payment Application Order - Global");
	}

	@Test(priority = 8, description = "Verify AAR Statements", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyAARStatements() 
	{
		LoggerManager.info("Verifying AAR Statements");
		TestBase.setExtentReportSettings("AAR Statements", Constants.FUNCTIONAL_TESTING, "Verify AAR Statements", "Verifying AAR Statements");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.aarStatements(),"AAR Statements - RealManage");
	}

	@Test(priority = 9, description = "Verify Collections Configuration", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyCollectionsConfiguration() 
	{
		LoggerManager.info("Verifying Collections Configuration");
		TestBase.setExtentReportSettings("Collections Configuration",Constants.FUNCTIONAL_TESTING, "Verify Collections Configuration", "Verifying Collections Configuration");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.collectionsConfiguration(),"Collections Configuration - Global");
	}
}
