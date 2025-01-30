package com.ciranet.internaluser.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.internaluser.pages.InternalUserNavigation;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class InternalUserNavigationTest extends TestBase 
{
	// Create the InternalUserNavigation object
	InternalUserNavigation internalUserPage = createPage(InternalUserNavigation.class);


	@Test(priority = 0, description = "Verify Account Management navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAccountManagementNavigation() 
	{
		LoggerManager.info("Verify Account Management navigation");
		TestBase.setExtentReportSettings("Account Management", Constants.SMOKE_TESTING, "Verify Account Management", "Verifying Account Management navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.accountManagementNavigate(), "Error navigate to Account Management");
	}
/*
	@Test(priority = 1, description = "Verify Achievements navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAchievementsNavigation() 
	{
		LoggerManager.info("Verify Achievements navigation");
		TestBase.setExtentReportSettings("Achievements", Constants.SMOKE_TESTING, "Verify Achievements", "Verifying Achievements navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.achievementsNavigate(), "Error navigate to Achievements");
	}

	@Test(priority = 2, description = "Verify Cloud Drive navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifycloudDriveNavigation() 
	{
		LoggerManager.info("Verify Cloud Drive navigation");
		TestBase.setExtentReportSettings("Cloud Drive", Constants.SMOKE_TESTING, "Verify Cloud Drive", "Verifying Cloud Drive navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.cloudDriveNavigate(), "Error navigate to Cloud Drive");
	}

	@Test(priority = 3, description = "Verify Map of My Communities navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifymapofMyCommunitiesNavigation() 
	{
		LoggerManager.info("Verify Map of My Communities navigation");
		TestBase.setExtentReportSettings("Map of My Communities", Constants.SMOKE_TESTING, "Verify Map of My Communities", "Verifying Map of My Communities navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.mapofMyCommunitiesNavigate(), "Error navigate to Map of My Communities");
	}

	@Test(priority = 4, description = "Verify My Communities navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyMyCommunitiesNavigation() 
	{
		LoggerManager.info("Verify My Communities navigation");
		TestBase.setExtentReportSettings("My Communities", Constants.SMOKE_TESTING, "Verify My Communities", "Verifying My Communities navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.myCommunitiesNavigate(), "Error navigate to My Communities");
	}

	@Test(priority = 5, description = "Verify My Tests navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyMyTestsNavigation() 
	{
		LoggerManager.info("Verify My Communities navigation");
		TestBase.setExtentReportSettings("My Tests", Constants.SMOKE_TESTING, "Verify My Tests", "Verifying My Tests navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.myTestsNavigate(), "Error navigate to My Tests");
	}

	@Test(priority = 6, description = "Verify My Text navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyMyTextNavigation() 
	{
		LoggerManager.info("Verify My Text navigation");
		TestBase.setExtentReportSettings("My Text", Constants.SMOKE_TESTING, "Verify My Text", "Verifying My Text navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.myTextNavigate(), "Error navigate to My Text");
	}

	@Test(priority = 7, description = "Verify Billing Item Management navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyBillingItemManagementNavigation() 
	{
		LoggerManager.info("Verify Billing Item Management navigation");
		TestBase.setExtentReportSettings("Billing Item Management", Constants.SMOKE_TESTING, "Verify Billing Item Management", "Verifying Billing Item Management navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.billingItemManagementNavigate(), "Error navigate to Billing Item Management");
	}

	@Test(priority = 8, description = "Verify Billing Queue Management navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyBillingQueueManagementNavigation() 
	{
		LoggerManager.info("Verify Billing Queue Management navigation");
		TestBase.setExtentReportSettings("Billing Queue Management", Constants.SMOKE_TESTING, "Verify Billing Queue Management", "Verifying Billing Queue Management navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.billingQueueManagementNavigate(), "Error navigate to Billing Queue Management");
	}

	@Test(priority = 9, description = "Verify My Customer Charges navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifMyCustomerChargesNavigation() 
	{
		LoggerManager.info("Verify My Customer Charges navigation");
		TestBase.setExtentReportSettings("My Customer Charges", Constants.SMOKE_TESTING, "Verify My Customer Charges", "Verifying My Customer Charges navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.myCustomerChargesNavigate(), "Error navigate to My Customer Charges");
	}

	@Test(priority = 10, description = "Verify Test Plan Configuration navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyTestPlanConfigurationNavigation() 
	{
		LoggerManager.info("Verify Test Plan Configuration navigation");
		TestBase.setExtentReportSettings("Test Plan Configuration", Constants.SMOKE_TESTING, "Verify Test Plan Configuration", "Verifying Test Plan Configuration navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.testPlanConfigurationNavigate(), "Error navigate to Test Plan Configuration");
	}

	@Test(priority = 11, description = "Verify Testing Configuration navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyTestingConfigurationNavigation() 
	{
		LoggerManager.info("Verify Testing Configuration navigation");
		TestBase.setExtentReportSettings("Testing Configuration", Constants.SMOKE_TESTING, "Verify Testing Configuration", "Verifying Testing Configuration navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.testingConfigurationNavigate(), "Error navigate to Testing Configuration");
	}

	@Test(priority = 12, description = "Verify Time & Expense Management navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyTimeAndExpenseManagementNavigation() 
	{
		LoggerManager.info("Verify Time & Expense Management navigation");
		TestBase.setExtentReportSettings("Time & Expense Management", Constants.SMOKE_TESTING, "Verify Time & Expense Management", "Verifying Time & Expense Management navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.timeExpenseManagementNavigate(), "Error navigate to Time & Expense Management");
	}

	@Test(priority = 13, description = "Verify  navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyTimeExpenseSubmissionNavigation() 
	{
		LoggerManager.info("Verify Time & Expense Submissions navigation");
		TestBase.setExtentReportSettings("Time & Expense Submissions", Constants.SMOKE_TESTING, "Verify Time & Expense Submissions", "Verifying Time & Expense Submissions navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.timeExpenseSubmissionNavigate(), "Error navigate to Time & Expense Submissions");
	}

	@Test(priority = 14, description = "Verify Vendor Management navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyVendorManagementNavigation() 
	{
		LoggerManager.info("Verify Vendor Management navigation");
		TestBase.setExtentReportSettings("Vendor Management", Constants.SMOKE_TESTING, "Verify Vendor Management", "Verifying Vendor Management navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.vendorManagementNavigate(), "Error while navigating to Vendor Management");
	}

	@Test(priority = 15, description = "Verify Architectural Application navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyArchitecturalAplicationNavigation() 
	{
		LoggerManager.info("Verify Architectural Application navigation");
		TestBase.setExtentReportSettings("Architectural Application", Constants.SMOKE_TESTING, "Verify Architectural Application", "Verifying Architectural Application navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.architecturalAplicationNavigate(), "Error while navigating to Architectural Application");
	}

	@Test(priority = 16, description = "Verify Automated Document Print  navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAutomatedDocumentPrintNavigation() 
	{
		LoggerManager.info("Verify Automated Document Print  navigation");
		TestBase.setExtentReportSettings("Automated Document Print", Constants.SMOKE_TESTING, "Verify Automated Document Print", "Verifying Automated Document Print  navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.automatedDocumentPrintNavigate(), "Error while navigating to Automated Document Print ");
	}

	@Test(priority = 17, description = "Verify Board Approvals navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyBoardApprovalsNavigation() 
	{
		LoggerManager.info("Verify Board Approvals navigation");
		TestBase.setExtentReportSettings("Board Approvals", Constants.SMOKE_TESTING, "Verify Board Approvals", "Verifying Board Approvals navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.boardApprovalsNavigate(), "Error while navigating to Board Approvals");
	}

	@Test(priority = 18, description = "Verify Common Lots Appraisal navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCommonLotsApprisalNavigation() 
	{
		LoggerManager.info("Verify Common Lots Appraisal navigation");
		TestBase.setExtentReportSettings("Common Lots Appraisal", Constants.SMOKE_TESTING, "Verify Common Lots Appraisal", "Verifying Common Lots Appraisal navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.commonLotsApprisalNavigate(), "Error while navigating to Common Lots Appraisal");
	}

	@Test(priority = 19, description = "Verify Fulfillment Queue navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyFulfillmentQueueNavigateNavigation() 
	{
		LoggerManager.info("Verify Fulfillment Queue navigation");
		TestBase.setExtentReportSettings("Fulfillment Queue", Constants.SMOKE_TESTING, "Verify Fulfillment Queue", "Verifying Fulfillment Queue navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.fulfillmentQueueNavigate(), "Error while navigating to Fulfillment Queue");
	}

	@Test(priority = 20, description = "Verify Maintenance Work Orders navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyMaintenanceWorkOrderNavigation() 
	{
		LoggerManager.info("Verify Maintenance Work Orders navigation");
		TestBase.setExtentReportSettings("Maintenance Work Orders", Constants.SMOKE_TESTING, "Verify Maintenance Work Orders", "Verifying Maintenance Work Orders navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.maintenanceWorkOrderNavigate(), "Error while navigating to Maintenance Work Orders");
	}

	@Test(priority = 21, description = "Verify Open Violations Requiring Review navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyViolationReviewNavigation() 
	{
		LoggerManager.info("Verify Open Violations Requiring Review navigation");
		TestBase.setExtentReportSettings("Open Violations Requiring Review", Constants.SMOKE_TESTING, "Verify Open Violations Requiring Review", "Verifying Open Violations Requiring Review navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.violationReviewNavigate(), "Error while navigating to Open Violations Requiring Review");
	}

	@Test(priority = 22, description = "Verify Add Community navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAddCommunityNavigation() 
	{
		LoggerManager.info("Verify Add Community navigation");
		TestBase.setExtentReportSettings("Add Community", Constants.SMOKE_TESTING, "Verify Add Community", "Verifying Add Community navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.addCommunityNavigate(), "Error while navigating to Add Community");
	}

	@Test(priority = 23, description = "Verify On-Boarding Checklist navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyOnBoardingChecklistNavigation() 
	{
		LoggerManager.info("Verify On-Boarding Checklist navigation");
		TestBase.setExtentReportSettings("On-Boarding Checklist", Constants.SMOKE_TESTING, "Verify On-Boarding Checklist", "Verifying On-Boarding Checklist navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.onBoardingChecklistNavigate(), "Error while navigating to On-Boarding Checklist");
	}

	@Test(priority = 24, description = "Verify Modify an On-Boarding Community navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyOnBoardingFlagsNavigation() 
	{
		LoggerManager.info("Verify Modify an On-Boarding Community navigation");
		TestBase.setExtentReportSettings("Modify an On-Boarding Community", Constants.SMOKE_TESTING, "Verify Modify an On-Boarding Community", "Verifying Modify an On-Boarding Community navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.onBoardingFlagsNavigate(), "Error while navigating to Modify an On-Boarding Community");
	}

	@Test(priority = 25, description = "Verify Schedule First Assessment navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyScheduleFirstAssessmentNavigation() 
	{
		LoggerManager.info("Verify Schedule First Assessment navigation");
		TestBase.setExtentReportSettings("Schedule First Assessment", Constants.SMOKE_TESTING, "Verify Schedule First Assessment", "Verifying Schedule First Assessment navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.scheduleFirstAssessmentNavigate(), "Error while navigating to Schedule First Assessment");
	}

	@Test(priority = 26, description = "Verify Schedule Initial Statement navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyScheduleInitialAssessmentNavigation() 
	{
		LoggerManager.info("Verify Schedule Initial Statement navigation");
		TestBase.setExtentReportSettings("Schedule Initial Statement", Constants.SMOKE_TESTING, "Verify Schedule Initial Statement", "Verifying Schedule Initial Statement navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.scheduleInitialAssessmentNavigate(), "Error while navigating to Schedule Initial Statement");
	}

	@Test(priority = 27, description = "Verify Closing Portal Location Manager navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyClosingPortalLocationManagerNavigation() 
	{
		LoggerManager.info("Verify Closing Portal Location Manager navigation");
		TestBase.setExtentReportSettings("Closing Portal Location Manager", Constants.SMOKE_TESTING, "Verify Closing Portal Location Manager", "Verifying Closing Portal Location Manager navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.closingPortalLocationManagerNavigate(), "Error while navigating to Closing Portal Location Manager");
	}

	@Test(priority = 28, description = "Verify Closing Requests navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyClosingRequestNavigation() 
	{
		LoggerManager.info("Verify Closing Requests navigation");
		TestBase.setExtentReportSettings("Closing Requests", Constants.SMOKE_TESTING, "Verify Closing Requests", "Verifying Closing Requests navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.closingRequestNavigate(), "Error while navigating to Closing Requests");
	}

	@Test(priority = 29, description = "Verify Community Blocks navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifycommunityBlockavigation() 
	{
		LoggerManager.info("Verify Community Blocks navigation");
		TestBase.setExtentReportSettings("Community Blocks", Constants.SMOKE_TESTING, "Verify Community Blocks", "Verifying Community Blocks navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.communityBlockNavigate(), "Error while navigating to Community Blocks");
	}

	@Test(priority = 30, description = "Verify Property Conveyances navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyPropertyConveyancesNavigation() 
	{
		LoggerManager.info("Verify Property Conveyances navigation");
		TestBase.setExtentReportSettings("Property Conveyances", Constants.SMOKE_TESTING, "Verify Property Conveyances", "Verifying Property Conveyances navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.propertyConveyancesNavigate(), "Error while navigating to Property Conveyances");
	}

	@Test(priority = 31, description = "Verify Internal Tasks  navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyInternalTaskNavigation() 
	{
		LoggerManager.info("Verify navigation");
		TestBase.setExtentReportSettings("Internal Tasks", Constants.SMOKE_TESTING, "Verify Internal Tasks ", "Verifying Internal Tasks  navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.internalTaskNavigate(), "Error while navigating to Internal Tasks ");
	}

	@Test(priority = 32, description = "Verify My Work Inbox navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyMyWorkInboxNavigateNavigation() 
	{
		LoggerManager.info("Verify My Work Inbox navigation");
		TestBase.setExtentReportSettings("My Work Inbox", Constants.SMOKE_TESTING, "Verify My Work Inbox", "Verifying My Work Inbox navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.myWorkInboxNavigate(), "Error while navigating to My Work Inbox");
	}

	@Test(priority = 33, description = "Verify AAP Workflow Queue navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyInvoiceApprovalNavigateNavigation() 
	{
		LoggerManager.info("Verify AAP Workflow Queue navigation");
		TestBase.setExtentReportSettings("AAP Workflow Queue", Constants.SMOKE_TESTING, "Verify AAP Workflow Queue", "Verifying AAP Workflow Queue navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.invoiceApprovalNavigate(), "Error while navigating to AAP Workflow Queue");
	}

	@Test(priority = 34, description = "Verify Metrics navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyMetricsNavigateNavigation() 
	{
		LoggerManager.info("Verify Metrics navigation");
		TestBase.setExtentReportSettings("Metrics", Constants.SMOKE_TESTING, "Verify Metrics", "Verifying Metrics navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.metricsNavigate(), "Error while navigating to Metrics");
	}

	@Test(priority = 35, description = "Verify Process Invoice navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyProcessInvoiceNavigation() 
	{
		LoggerManager.info("Verify Process Invoice navigation");
		TestBase.setExtentReportSettings("Process Invoice", Constants.SMOKE_TESTING, "Verify Process Invoice", "Verifying Process Invoice navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.processInvoiceNavigate(), "Error while navigating to Process Invoice");
	}

	@Test(priority = 36, description = "Verify Annual Budget Preparation navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAnnualBudgetPreparationNavigation() 
	{
		LoggerManager.info("Verify Annual Budget Preparation navigation");
		TestBase.setExtentReportSettings("Annual Budget Preparation", Constants.SMOKE_TESTING, "Verify Annual Budget Preparation", "Verifying Annual Budget Preparation navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.annualBudgetPreparationNavigate(), "Error while navigating to Annual Budget Preparation");
	}

	@Test(priority = 37, description = "Verify Annual Coupon Process navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAnnualCouponOrderNavigation() 
	{
		LoggerManager.info("Verify Annual Coupon Process navigation");
		TestBase.setExtentReportSettings("Annual Coupon Process", Constants.SMOKE_TESTING, "Verify Annual Coupon Process", "Verifying Annual Coupon Process navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.annualCouponOrderNavigate(), "Error while navigating to Annual Coupon Process");
	}

	@Test(priority = 38, description = "Verify Annual Federal Tax Return Filing navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAnnualFederalTaxReturnFilingNavigation() 
	{
		LoggerManager.info("Verify Annual Federal Tax Return Filing navigation");
		TestBase.setExtentReportSettings("Annual Federal Tax Return Filing", Constants.SMOKE_TESTING, "Verify Annual Federal Tax Return Filing", "Verifying Annual Federal Tax Return Filing navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.annualFederalTaxReturnFilingNavigate(), "Error while navigating to Annual Federal Tax Return Filing");
	}

	@Test(priority = 39, description = "Verify Annual State Tax Return Filing navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAnnualStateTaxReturnFilingNavigation() 
	{
		LoggerManager.info("Verify Annual State Tax Return Filing navigation");
		TestBase.setExtentReportSettings("Annual State Tax Return Filing", Constants.SMOKE_TESTING, "Verify Annual State Tax Return Filing", "Verifying Annual State Tax Return Filing navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.annualStateTaxReturnFilingNavigate(), "Error while navigating to Annual State Tax Return Filing");
	}

	@Test(priority = 40, description = "Verify Annual Statement Generation Process navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAnnualStatementGenarationProcessNavigation() 
	{
		LoggerManager.info("Verify Annual Statement Generation Process navigation");
		TestBase.setExtentReportSettings("Annual Statement Generation Process", Constants.SMOKE_TESTING, "Verify Annual Statement Generation Process", "Verifying Annual Statement Generation Process navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.annualStatementGenarationProcessNavigate(), "Error while navigating to Annual Statement Generation Process");
	}

	@Test(priority = 41, description = "Verify Financial Report Publishing navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyFinancialReportPublishingNavigateNavigation() 
	{
		LoggerManager.info("Verify Financial Report Publishing navigation");
		TestBase.setExtentReportSettings("Financial Report Publishing", Constants.SMOKE_TESTING, "Verify Financial Report Publishing", "Verifying Financial Report Publishing navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.financialReportPublishingNavigate(), "Error while navigating to Financial Report Publishing");
	}

	@Test(priority = 42, description = "Verify Management Report Generation navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyManagementReportPublishingNavigateNavigation() 
	{
		LoggerManager.info("Verify Management Report Generation navigation navigation");
		TestBase.setExtentReportSettings("Management Report Generation", Constants.SMOKE_TESTING, "Verify Management Report Generation navigation", "Verifying Management Report Generation navigation navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.managementReportPublishingNavigate(), "Error while navigating to Management Report Generation navigation");
	}

	@Test(priority = 43, description = "Verify Projects / Tasks navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyProjectTaskNavigateNavigation() 
	{
		LoggerManager.info("Verify Projects / Tasks navigation");
		TestBase.setExtentReportSettings("Projects / Tasks", Constants.SMOKE_TESTING, "Verify Projects / Tasks", "Verifying Projects / Tasks navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.projectTaskNavigate(), "Error while navigating to Projects / Tasks");
	}

	@Test(priority = 44, description = "Verify Bank Returns navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyBankReturnsNavigation() 
	{
		LoggerManager.info("Verify Bank Returns navigation");
		TestBase.setExtentReportSettings("Bank Returns", Constants.SMOKE_TESTING, "Verify Bank Returns", "Verifying Bank Returns navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.bankReturnsNavigate(), "Error while navigating to Bank Returns");
	}

	@Test(priority = 45, description = "Verify NOC Queue navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyNOCQueueNavigation() 
	{
		LoggerManager.info("Verify NOC Queue navigation");
		TestBase.setExtentReportSettings("NOC Queue", Constants.SMOKE_TESTING, "Verify NOC Queue", "Verifying NOC Queue navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.nOCQueueNavigate(), "Error while navigating to NOC Queue");
	}

	@Test(priority = 46, description = "Verify Order Annual Coupons navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyOrderAnnualCouponNavigation() 
	{
		LoggerManager.info("Verify Order Annual Coupons navigation");
		TestBase.setExtentReportSettings("Order Annual Coupons", Constants.SMOKE_TESTING, "Verify Order Annual Coupons", "Verifying Order Annual Coupons navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.orderAnnualCouponNavigate(), "Error while navigating to Order Annual Coupons");
	}

	@Test(priority = 47, description = "Verify Payment Post Errors navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyPaymentPostErrorNavigation() 
	{
		LoggerManager.info("Verify Payment Post Errors navigation");
		TestBase.setExtentReportSettings("Payment Post Errors", Constants.SMOKE_TESTING, "Verify Payment Post Errors", "Verifying Payment Post Errors navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.paymentPostErrorNavigate(), "Error while navigating to Payment Post Errors");
	}

	@Test(priority = 48, description = "Verify Statement Approvals navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyStatementApprovelNavigation() 
	{
		LoggerManager.info("Verify Statement Approvals navigation");
		TestBase.setExtentReportSettings("Statement Approvals", Constants.SMOKE_TESTING, "Verify Statement Approvals", "Verifying Statement Approvals navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.statementApprovelNavigate(), "Error while navigating to Statement Approvals");
	}

	@Test(priority = 49, description = "Verify CiraBooks Workspace navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCiraBooksWorkspaceNavigateNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Workspace navigation");
		TestBase.setExtentReportSettings("CiraBooks Workspace", Constants.SMOKE_TESTING, "Verify CiraBooks Workspace", "Verifying CiraBooks Workspace navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ciraBooksWorkspaceNavigate(), "Error while navigating to CiraBooks Workspace");
	}

	@Test(priority = 50, description = "Verify AP Batches navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyApBatchesNavigation() 
	{
		LoggerManager.info("Verify AP Batches navigation");
		TestBase.setExtentReportSettings("AP Batches", Constants.SMOKE_TESTING, "Verify AP Batches", "Verifying AP Batches navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.apBatchesNavigate(), "Error while navigating to AP Batches");
	}

	@Test(priority = 51, description = "Verify AP Bill Analysis navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyApBillAnalysisNavigation() 
	{
		LoggerManager.info("Verify AP Bill Analysis navigation");
		TestBase.setExtentReportSettings("AP Bill Analysis", Constants.SMOKE_TESTING, "Verify AP Bill Analysis", "Verifying AP Bill Analysis navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.apBillAnalysisNavigate(), "Error while navigating to AP Bill Analysis");
	}

	@Test(priority = 52, description = "Verify AP Ledger navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyApLedgerNavigation() 
	{
		LoggerManager.info("Verify AP Ledger navigation");
		TestBase.setExtentReportSettings("AP Ledger", Constants.SMOKE_TESTING, "Verify AP Ledger", "Verifying AP Ledger navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.apLedgerNavigate(), "Error while navigating to AP Ledger");
	}

	@Test(priority = 53, description = "Verify AP Unapplied Payments navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyApUnappliedPaymentsNavigateNavigation() 
	{
		LoggerManager.info("Verify AP Unapplied Payments navigation");
		TestBase.setExtentReportSettings("AP Unapplied Payments", Constants.SMOKE_TESTING, "Verify AP Unapplied Payments", "Verifying AP Unapplied Payments navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.apUnappliedPaymentsNavigate(), "Error while navigating to AP Unapplied Payments");
	}

	@Test(priority = 54, description = "Verify Check Printing Management navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCheckPrintingManagementNavigation() 
	{
		LoggerManager.info("Verify Check Printing Management navigation");
		TestBase.setExtentReportSettings("Check Printing Management", Constants.SMOKE_TESTING, "Verify Check Printing Management", "Verifying Check Printing Management navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.checkPrintingManagementNavigate(), "Error while navigating to Check Printing Management");
	}

	@Test(priority = 55, description = "Verify EFT Payment Management navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyEftPaymentManagementNavigation() 
	{
		LoggerManager.info("Verify EFT Payment Management navigation");
		TestBase.setExtentReportSettings("EFT Payment Management", Constants.SMOKE_TESTING, "Verify EFT Payment Management", "Verifying EFT Payment Management navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.eftPaymentManagementNavigate(), "Error while navigating to EFT Payment Management");
	}

	@Test(priority = 56, description = "Verify Local Office Only Check Printing navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyLocalOfficeOnlyCheckPrintingNavigation() 
	{
		LoggerManager.info("Verify Local Office Only Check Printing navigation");
		TestBase.setExtentReportSettings("Local Office Only Check Printing", Constants.SMOKE_TESTING, "Verify Local Office Only Check Printing", "Verifying Local Office Only Check Printing navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.localOfficeOnlyCheckPrintingNavigate(), "Error while navigating to ");
	}

	@Test(priority = 57, description = "Verify Manage AAP Workflow Vendor Edit navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyManageAAPWorkflowVendorEditNavigation() 
	{
		LoggerManager.info("Verify Manage AAP Workflow Vendor Edit navigation");
		TestBase.setExtentReportSettings("Manage AAP Workflow Vendor Edit", Constants.SMOKE_TESTING, "Verify Manage AAP Workflow Vendor Edit", "Verifying Manage AAP Workflow Vendor Edit navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.manageAAPWorkflowVendorEditNavigate(), "Error while navigating to Manage AAP Workflow Vendor Edit");
	}

	@Test(priority = 58, description = "Verify My submitted Invoices navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyMySubmittedInvoicesNavigation() 
	{
		LoggerManager.info("Verify My submitted Invoices navigation");
		TestBase.setExtentReportSettings("My submitted Invoices", Constants.SMOKE_TESTING, "Verify My submitted Invoices", "Verifying My submitted Invoices navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.mySubmittedInvoicesNavigate(), "Error while navigating to My submitted Invoices");
	}

	@Test(priority = 59, description = "Verify Reimbursement Request navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyReimbursementRequestNavigation() 
	{
		LoggerManager.info("Verify Reimbursement Request navigation");
		TestBase.setExtentReportSettings("Reimbursement Request", Constants.SMOKE_TESTING, "Verify Reimbursement Request", "Verifying Reimbursement Request navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.reimbursementRequestNavigate(), "Error while navigating to Reimbursement Request");
	}

	@Test(priority = 60, description = "Verify Search Invoices navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifySearchInvoicesNavigation() 
	{
		LoggerManager.info("Verify Search Invoices navigation");
		TestBase.setExtentReportSettings("Search Invoices", Constants.SMOKE_TESTING, "Verify Search Invoices", "Verifying Search Invoices navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.searchInvoicesNavigate(), "Error while navigating to Search Invoices");
	}

	@Test(priority = 61, description = "Verify Submit Invoice navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifySubmitInvoiceNavigation() 
	{
		LoggerManager.info("Verify Submit Invoice navigation");
		TestBase.setExtentReportSettings("Submit Invoice", Constants.SMOKE_TESTING, "Verify Submit Invoice", "Verifying Submit Invoice navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.submitInvoiceNavigate(), "Error while navigating to Submit Invoice");
	}

	@Test(priority = 62, description = "Verify Vendor 1099 navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyVendor1099NavigateNavigation() 
	{
		LoggerManager.info("Verify Vendor 1099 navigation");
		TestBase.setExtentReportSettings("Vendor 1099", Constants.SMOKE_TESTING, "Verify Vendor 1099", "Verifying Vendor 1099 navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.vendor1099Navigate(), "Error while navigating to Vendor 1099");
	}

	@Test(priority = 63, description = "Verify Vendor Aging navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyVendorAgingNavigation() 
	{
		LoggerManager.info("Verify Vendor Aging navigation");
		TestBase.setExtentReportSettings("Vendor Aging", Constants.SMOKE_TESTING, "Verify Vendor Aging", "Verifying Vendor Aging navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.vendorAgingNavigate(), "Error while navigating to Vendor Aging");
	}

	@Test(priority = 64, description = "Verify Vendor Missing Bills navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyVendorMissingBillsNavigation() 
	{
		LoggerManager.info("Verify Vendor Missing Bills navigation");
		TestBase.setExtentReportSettings("Vendor Missing Bills", Constants.SMOKE_TESTING, "Verify Vendor Missing Bills", "Verifying Vendor Missing Bills navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.vendorMissingBillsNavigate(), "Error while navigating to Vendor Missing Bills");
	}

	@Test(priority = 65, description = "Verify AR Batches navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyARBatchesNavigation() 
	{
		LoggerManager.info("Verify AR Batches navigation");
		TestBase.setExtentReportSettings("AR Batches", Constants.SMOKE_TESTING, "Verify AR Batches", "Verifying AR Batches navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.aRBatchesNavigate(), "Error while navigating to AR Batches");
	}

	@Test(priority = 66, description = "Verify Collections navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyARCollectionNavigateNavigation() 
	{
		LoggerManager.info("Verify Collections navigation");
		TestBase.setExtentReportSettings("Collections", Constants.SMOKE_TESTING, "Verify Collections", "Verifying Collections navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.arCollectionNavigate(), "Error while navigating to Collections");
	}

	@Test(priority = 67, description = "Verify AR Invoice Analysis navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyARInvoiceAnalysisNavigation() 
	{
		LoggerManager.info("Verify AR Invoice Analysis navigation");
		TestBase.setExtentReportSettings("AR Invoice Analysis", Constants.SMOKE_TESTING, "Verify AR Invoice Analysis", "Verifying AR Invoice Analysis navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.arInvoiceAnalysisNavigate(), "Error while navigating to AR Invoice Analysis");
	}

	@Test(priority = 68 , description = "Verify AR Ledger navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyARLedgerNavigation() 
	{
		LoggerManager.info("Verify AR Ledger navigation");
		TestBase.setExtentReportSettings("AR Ledger", Constants.SMOKE_TESTING, "Verify AR Ledger", "Verifying AR Ledger navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.arLedgerNavigate(), "Error while navigating to AR Ledger");
	}

	@Test(priority = 69, description = "Verify Add Payments navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAddPaymentsNavigation() 
	{
		LoggerManager.info("Verify Add Payments navigation");
		TestBase.setExtentReportSettings("Add Payments", Constants.SMOKE_TESTING, "Verify Add Payments", "Verifying Add Payments navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.addPaymentsNavigate(), "Error while navigating to Add Payments");
	}

	@Test(priority = 70, description = "Verify Customer Aging navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCustomerAgingNavigation() 
	{
		LoggerManager.info("Verify Customer Aging navigation");
		TestBase.setExtentReportSettings("Customer Aging", Constants.SMOKE_TESTING, "Verify Customer Aging", "Verifying Customer Aging navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.customerAgingNavigate(), "Error while navigating to Customer Aging");
	}

	@Test(priority = 71, description = "Verify Generate Builder Statements navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyGenerateBuilderStatementsNavigation() 
	{
		LoggerManager.info("Verify Generate Builder Statements navigation");
		TestBase.setExtentReportSettings("Generate Builder Statements", Constants.SMOKE_TESTING, "Verify Generate Builder Statements", "Verifying Generate Builder Statements navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.generateBuilderStatementsNavigate(), "Error while navigating to Generate Builder Statements");
	}

	@Test(priority = 72, description = "Verify Lot Payment Allocations navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyLotPaymentAllocationNavigation() 
	{
		LoggerManager.info("Verify Lot Payment Allocations navigation");
		TestBase.setExtentReportSettings("Lot Payment Allocations", Constants.SMOKE_TESTING, "Verify Lot Payment Allocations", "Verifying Lot Payment Allocations navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.lotPaymentAllocationNavigate(), "Error while navigating to Lot Payment Allocations");
	}

	@Test(priority = 73, description = "Verify Bank Accounts navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAankAccountsNavigateNavigation() 
	{
		LoggerManager.info("Verify Bank Accounts navigation");
		TestBase.setExtentReportSettings("Bank Accounts", Constants.SMOKE_TESTING, "Verify Bank Accounts", "Verifying Bank Accounts navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.bankAccountsNavigate(), "Error while navigating to Bank Accounts");
	}

	@Test(priority = 74, description = "Verify Bank Reconciliation navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyBankReconciliationNavigateNavigation() 
	{
		LoggerManager.info("Verify Bank Reconciliation navigation");
		TestBase.setExtentReportSettings("Bank Reconciliation", Constants.SMOKE_TESTING, "Verify Bank Reconciliation", "Verifying Bank Reconciliation navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.bankReconciliationNavigate(), "Error while navigating to Bank Reconciliation");
	}	

	@Test(priority = 75, description = "Verify CM Batches navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCMBatchesNavigation() 
	{
		LoggerManager.info("Verify CM Batches navigation");
		TestBase.setExtentReportSettings("CM Batches", Constants.SMOKE_TESTING, "Verify CM Batches", "Verifying CM Batches navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.cmBatchesNavigate(), "Error while navigating to CM Batches");
	}

	@Test(priority = 76, description = "Verify Cash Receipts navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCashReceiptsNavigation() 
	{
		LoggerManager.info("Verify Cash Receipts navigation");
		TestBase.setExtentReportSettings("Cash Receipts", Constants.SMOKE_TESTING, "Verify Cash Receipts", "Verifying Cash Receipts navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.cashReceiptsNavigate(), "Error while navigating to Cash Receipts");
	}

	@Test(priority = 77, description = "Verify Deposits navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyDepositsNavigation() 
	{
		LoggerManager.info("Verify Deposits navigation");
		TestBase.setExtentReportSettings("Deposits", Constants.SMOKE_TESTING, "Verify Deposits", "Verifying Deposits navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.depositsNavigate(), "Error while navigating to Deposits");
	}

	@Test(priority = 78, description = "Verify Funds Transfer navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyFundsTransferNavigation() 
	{
		LoggerManager.info("Verify Funds Transfer navigation");
		TestBase.setExtentReportSettings("Funds Transfer", Constants.SMOKE_TESTING, "Verify Funds Transfer", "Verifying Funds Transfer navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.fundsTransferNavigate(), "Error while navigating to Funds Transfer");
	}

	@Test(priority = 79, description = "Verify Lockbox Payment File navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifylockboxPaymentFileNavigation() 
	{
		LoggerManager.info("Verify Lockbox Payment File navigation");
		TestBase.setExtentReportSettings("Lockbox Payment File", Constants.SMOKE_TESTING, "Verify Lockbox Payment File", "Verifying Lockbox Payment File navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.lockboxPaymentFileNavigate(), "Error while navigating to Lockbox Payment File");
	}

	@Test(priority = 80, description = "Verify Manage Bank Statement navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyManageBankStatementsNavigation() 
	{
		LoggerManager.info("Verify Manage Bank Statement navigation");
		TestBase.setExtentReportSettings("Manage Bank Statement", Constants.SMOKE_TESTING, "Verify Manage Bank Statement", "Verifying Manage Bank Statement navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.manageBankStatementsNavigate(), "Error while navigating to Manage Bank Statement");
	}

	@Test(priority = 81, description = "Verify Unmatched Transactions navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyUnmatchedTransactionsNavigation() 
	{
		LoggerManager.info("Verify Unmatched Transactions navigation");
		TestBase.setExtentReportSettings("Unmatched Transactions", Constants.SMOKE_TESTING, "Verify Unmatched Transactions", "Verifying Unmatched Transactions navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.unmatchedTransactionsNavigate(), "Error while navigating to Unmatched Transactions");
	}

	@Test(priority = 82, description = "Verify auditLogSideNav navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAuditLogNavigation() 
	{
		LoggerManager.info("Verify auditLogSideNav navigation");
		TestBase.setExtentReportSettings("auditLogSideNav", Constants.SMOKE_TESTING, "Verify auditLogSideNav", "Verifying auditLogSideNav navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.auditLogNavigate(), "Error while navigating to auditLogSideNav");
	}

	@Test(priority = 83, description = "Verify Configuration navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyConfigurationNavigation() 
	{
		LoggerManager.info("Verify Configuration navigation");
		TestBase.setExtentReportSettings("Configuration", Constants.SMOKE_TESTING, "Verify Configuration", "Verifying Configuration navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.configurationNavigate(), "Error while navigating to Configuration");
	}

	@Test(priority = 84, description = "Verify Actual vs Budget navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyActualBudgetNavigation() 
	{
		LoggerManager.info("Verify Actual vs Budget navigation");
		TestBase.setExtentReportSettings("Actual vs Budget", Constants.SMOKE_TESTING, "Verify Actual vs Budget", "Verifying Actual vs Budget navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.actualBudgetNavigate(), "Error while navigating to Actual vs Budget");
	}

	@Test(priority = 85, description = "Verify Benchmark Report navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyNavigation() 
	{
		LoggerManager.info("Verify Benchmark Report navigation");
		TestBase.setExtentReportSettings("Benchmark Report", Constants.SMOKE_TESTING, "Verify Benchmark Report", "Verifying Benchmark Report navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.benchmarkReportNavigate(), "Error while navigating to Benchmark Report");
	}

	@Test(priority = 86, description = "Verify Financial Summary navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyFinancialSummaryNavigation() 
	{
		LoggerManager.info("Verify Financial Summary navigation");
		TestBase.setExtentReportSettings("Financial Summary", Constants.SMOKE_TESTING, "Verify ", "Verifying Financial Summary Financial Summary navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.financialSummaryNavigate(), "Error while navigating to Financial Summary");
	}

	@Test(priority = 87, description = "Verify Budget navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyBudgetNavigation() 
	{
		LoggerManager.info("Verify Budget navigation");
		TestBase.setExtentReportSettings("Budget", Constants.SMOKE_TESTING, "Verify Budget", "Verifying Budget navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.budgetNavigate(), "Error while navigating to Budget");
	}

	@Test(priority = 88, description = "Verify General Ledger Report navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyGeneralLedgerReportNavigation() 
	{
		LoggerManager.info("Verify General Ledger Report navigation");
		TestBase.setExtentReportSettings("General Ledger Report", Constants.SMOKE_TESTING, "Verify General Ledger Report", "Verifying General Ledger Report navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.generalLedgerReportNavigate(), "Error while navigating to General Ledger Report");
	}


	@Test(priority = 89, description = "Verify Journal Entries navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyJournalEntriesNavigation() 
	{
		LoggerManager.info("Verify Journal Entries navigation");
		TestBase.setExtentReportSettings("Journal Entries", Constants.SMOKE_TESTING, "Verify Journal Entries", "Verifying Journal Entries navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.journalEntriesNavigate(), "Error while navigating to Journal Entries");
	}

	@Test(priority = 90, description = "Verify Journal Entry Template navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyJournalEntryTemplatesNavigation() 
	{
		LoggerManager.info("Verify Journal Entry Template navigation");
		TestBase.setExtentReportSettings("Journal Entry Template", Constants.SMOKE_TESTING, "Verify Journal Entry Template", "Verifying Journal Entry Template navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.journalEntryTemplatesNavigate(), "Error while navigating to Journal Entry Template");
	}

	@Test(priority = 91, description = "Verify Open / Close Books navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyOpenCloseBooksNavigation() 
	{
		LoggerManager.info("Verify Open / Close Books navigation");
		TestBase.setExtentReportSettings("Open / Close Books", Constants.SMOKE_TESTING, "Verify Open / Close Books", "Verifying Open / Close Books navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.openCloseBooksNavigate(), "Error while navigating to Open / Close Books");
	}

	@Test(priority = 92, description = "Verify Trial Balance navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyTrialBalanceNavigation() 
	{
		LoggerManager.info("Verify Trial Balance navigation");
		TestBase.setExtentReportSettings("Trial Balance", Constants.SMOKE_TESTING, "Verify Trial Balance", "Verifying Trial Balance navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.trialBalanceNavigate(), "Error while navigating to Trial Balance");
	}

	@Test(priority = 93, description = "Verify Upload Budgets navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyUploadBudgetsNavigation() 
	{
		LoggerManager.info("Verify Upload Budgets navigation");
		TestBase.setExtentReportSettings("Upload Budgets", Constants.SMOKE_TESTING, "Verify Upload Budgets", "Verifying Upload Budgets navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.uploadBudgetsNavigate(), "Error while navigating to Upload Budgets");
	}

	@Test(priority = 94, description = "Verify Upload JEs navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyUploadJEsNavigation() 
	{
		LoggerManager.info("Verify Upload JEs navigation");
		TestBase.setExtentReportSettings("Upload JEs", Constants.SMOKE_TESTING, "Verify Upload JEs", "Verifying Upload JEs navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.uploadJEsNavigate(), "Error while navigating to Upload JEs");
	}

	@Test(priority = 95, description = "Verify CiraBooks Corporate Workspace navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCiraBooksCorporateWorkspaceNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Workspace navigation");
		TestBase.setExtentReportSettings("CiraBooks Corporate Workspace", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Workspace", "Verifying CiraBooks Corporate Workspace navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ciraBooksCorporateWorkspaceNavigate(), "Error while navigating to CiraBooks Corporate Workspace");
	}

	@Test(priority = 96, description = "Verify CiraBooks Corporate AP Batches navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyccbAPBatchesNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate AP Batches navigation");
		TestBase.setExtentReportSettings("AP Batches", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate AP Batches", "Verifying CiraBooks Corporate AP Batches navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbAPBatchesNavigate(), "Error while navigating to CiraBooks Corporate AP Batches");
	}

	@Test(priority = 97, description = "Verify CiraBooks Corporate AP Bill Analysis navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBAPBillAnalysisNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate AP Bill Analysis navigation");
		TestBase.setExtentReportSettings("AP Bill Analysis", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate AP Bill Analysis", "Verifying CiraBooks Corporat AP Bill Analysis navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbAPBillAnalysisNavigate(), "Error while navigating to CiraBooks Corporate AP Bill Analysis");
	}

	@Test(priority = 98, description = "Verify CiraBooks Corporate AP Ledger navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBAPLedgerNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate AP Ledger navigation");
		TestBase.setExtentReportSettings("AP Ledger", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate AP Ledger", "Verifying CiraBooks Corporat AP Ledger navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbAPLedgerNavigate(), "Error while navigating to CiraBooks Corporate AP Ledger");
	}

	@Test(priority = 99, description = "Verify CiraBooks Corporate Check Printing Management For Management Companies navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBCheckPrintingManagementNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Check Printing Management For Management Companies navigation");
		TestBase.setExtentReportSettings("Check Printing Management For Management Companies", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Check Printing Management For Management Companies", "Verifying CiraBooks Corporat Check Printing Management For Management Companies navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbCheckPrintingManagementNavigate(), "Error while navigating to CiraBooks Corporate Check Printing Management For Management Companies");
	}

	@Test(priority = 100, description = "Verify CiraBooks Corporate EFT Payment Management navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBEFTPaymentManagementNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate EFT Payment Management navigation");
		TestBase.setExtentReportSettings("EFT Payment Management", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate EFT Payment Management", "Verifying CiraBooks Corporat EFT Payment Management navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbEFTPaymentManagementNavigate(), "Error while navigating to CiraBooks Corporate EFT Payment Management");
	}

	@Test(priority = 101, description = "Verify CiraBooks CorporateNew New AP Bill navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBNewAPBillNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate New AP Bill navigation");
		TestBase.setExtentReportSettings("New AP Bill", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate New AP Bill", "Verifying CiraBooks Corporat New AP Bill navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbNewAPBillNavigate(), "Error while navigating to CiraBooks Corporate New AP Bill");
	}

	@Test(priority = 102, description = "Verify CiraBooks Corporate Select Bills to Pay navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBSelectBillstiPayNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Select Bills to Pay navigation");
		TestBase.setExtentReportSettings("Select Bills to Pay", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Select Bills to Pay", "Verifying CiraBooks Corporat Select Bills to Pay navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbSelectBillstiPayNavigate(), "Error while navigating to CiraBooks Corporate Select Bills to Pay");
	}

	@Test(priority = 103, description = "Verify CiraBooks Corporate Vendor 1099 navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBVendor1099Navigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Vendor 1099 navigation");
		TestBase.setExtentReportSettings("Vendor 1099", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Vendor 1099", "Verifying CiraBooks Corporat Vendor 1099 navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbVendor1099Navigate(), "Error while navigating to CiraBooks Corporate Vendor 1099");
	}

	@Test(priority = 104, description = "Verify CiraBooks Corporate Vendor Aging navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyccbVendorAgingNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Vendor Aging navigation");
		TestBase.setExtentReportSettings("Vendor Aging", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Vendor Aging", "Verifying CiraBooks Corporat Vendor Aging navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbVendorAgingNavigate(), "Error while navigating to CiraBooks Corporate Vendor Aging");
	}

	@Test(priority = 105, description = "Verify CiraBooks Corporate Vendor Management navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyccbVendorManagementNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Vendor Management navigation");
		TestBase.setExtentReportSettings("Vendor Management", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Vendor Management", "Verifying CiraBooks Corporat Vendor Management navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbVendorManagementNavigate(), "Error while navigating to CiraBooks Corporate Vendor Management");
	}

	@Test(priority = 106, description = "Verify CiraBooks Corporate Work Queue Management navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBWorkQueueManagementNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Work Queue Management navigation");
		TestBase.setExtentReportSettings("Work Queue Management", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Work Queue Management", "Verifying CiraBooks Corporat Work Queue Management navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbWorkQueueManagementNavigate(), "Error while navigating to CiraBooks Corporate Work Queue Management");
	}

	@Test(priority = 107, description = "Verify CiraBooks Corporate AR Batches navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBARBatchesNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate AR Batches navigation");
		TestBase.setExtentReportSettings("AR Batches", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate AR Batches", "Verifying CiraBooks Corporat AR Batches navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbARBatchesNavigate(), "Error while navigating to CiraBooks Corporate AR Batches");
	}

	@Test(priority = 108, description = "Verify CiraBooks Corporate AR Invoice Analysis navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBARInvoiceAnalysisNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate AR Invoice Analysis navigation");
		TestBase.setExtentReportSettings("AR Invoice Analysis", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate AR Invoice Analysis", "Verifying CiraBooks Corporat AR Invoice Analysis navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbARInvoiceAnalysisNavigate(), "Error while navigating to CiraBooks Corporate AR Invoice Analysis");
	}

	@Test(priority = 109, description = "Verify CiraBooks Corporate AR Ledger navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBARLedgerNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate AR Ledger navigation");
		TestBase.setExtentReportSettings("AR Ledger", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate AR Ledger", "Verifying CiraBooks Corporat AR Ledger navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbARLedgerNavigate(), "Error while navigating to CiraBooks Corporate AR Ledger");
	}

	@Test(priority = 110, description = "Verify CiraBooks Corporate Customer Aging navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBCustomerAgingNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Customer Aging navigation");
		TestBase.setExtentReportSettings("Customer Aging", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Customer Aging", "Verifying CiraBooks Corporat Customer Aging navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbCustomerAgingNavigate(), "Error while navigating to CiraBooks Corporate Customer Aging");
	}

	@Test(priority = 111, description = "Verify CiraBooks Corporate Customer Management navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBCustomerManagementNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Customer Management navigation");
		TestBase.setExtentReportSettings("Customer Management", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Customer Management", "Verifying CiraBooks Corporat Customer Management navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbCustomerManagementNavigate(), "Error while navigating to CiraBooks Corporate Customer Management");
	}

	@Test(priority = 112, description = "Verify CiraBooks Corporate New AR Adjustment navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBNewARAdjustmentNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate New AR Adjustment navigation");
		TestBase.setExtentReportSettings("New AR Adjustment", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate New AR Adjustment", "Verifying CiraBooks Corporat New AR Adjustment navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbNewARAdjustmentNavigate(), "Error while navigating to CiraBooks Corporate New AR Adjustment");
	}


	@Test(priority = 113, description = "Verify CiraBooks Corporate New AR Invoice navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBNewARInvoiceNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate New AR Invoice navigation");
		TestBase.setExtentReportSettings("New AR Invoice", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate New AR Invoice", "Verifying CiraBooks Corporat New AR Invoice navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbNewARInvoiceNavigate(), "Error while navigating to CiraBooks Corporate New AR Invoice");
	}

	@Test(priority = 114, description = "Verify CiraBooks Corporate New AR Payment navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBNewARPaymentNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate New AR Payment navigation");
		TestBase.setExtentReportSettings("New AR Payment", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate New AR Payment", "Verifying CiraBooks Corporat New AR Payment navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbNewARPaymentNavigate(), "Error while navigating to CiraBooks Corporate New AR Payment");
	}

	@Test(priority = 115, description = "Verify CiraBooks Corporate Bank Accounts navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBBankAccountNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Bank Accounts navigation");
		TestBase.setExtentReportSettings("Bank Accounts", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Bank Accounts", "Verifying CiraBooks Corporat Bank Accounts navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbBankAccountNavigate(), "Error while navigating to CiraBooks Corporate Bank Accounts");
	}


	@Test(priority = 116, description = "Verify CiraBooks Corporate CM Batches navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBCMBatchesNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate CM Batches navigation");
		TestBase.setExtentReportSettings("CM Batches", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate CM Batches", "Verifying CiraBooks Corporat CM Batches navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbCMBatchesNavigate(), "Error while navigating to CiraBooks Corporate CM Batches");
	}

	@Test(priority = 117, description = "Verify CiraBooks Corporate Cash Receipts navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBCashReceiptsNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Cash Receipts navigation");
		TestBase.setExtentReportSettings("Cash Receipts", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Cash Receipts", "Verifying CiraBooks Corporat Cash Receipts navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbCashReceiptsNavigate(), "Error while navigating to CiraBooks Corporate Cash Receipts");
	}

	@Test(priority = 118, description = "Verify CiraBooks Corporate Deposits navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBDepositsNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Deposits navigation");
		TestBase.setExtentReportSettings("Deposits", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Deposits", "Verifying CiraBooks Corporat Deposits navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbDepositsNavigate(), "Error while navigating to CiraBooks Corporate Deposits");
	}

	@Test(priority = 119, description = "Verify CiraBooks Corporate Bank Reconciliation navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBReconcileBankAccountNavigation()
	{
		LoggerManager.info("Verify CiraBooks Corporate Bank Reconciliation navigation");
		TestBase.setExtentReportSettings("Bank Reconciliation", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Bank Reconciliation", "Verifying CiraBooks Corporat Bank Reconciliation navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbReconcileBankAccountNavigate(), "Error while navigating to CiraBooks Corporate Bank Reconciliation");
	}

	@Test(priority = 120, description = "Verify CiraBooks Corporate Audit Log navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyccbAuditLogNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Audit Log navigation");
		TestBase.setExtentReportSettings("Audit Log", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Audit Log", "Verifying CiraBooks Corporat Audit Log navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbAuditLogNavigate(), "Error while navigating to CiraBooks Corporate Audit Log");
	}

	@Test(priority = 121, description = "Verify CiraBooks Corporate Configuration for Management Companies navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBConfigurationNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Configuration for Management Companies navigation");
		TestBase.setExtentReportSettings("Configuration", Constants.SMOKE_TESTING, "Verify Configuration", "Verifying Configuration");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbConfigurationNavigate(), "Error while navigating to CiraBooks Corporate Configuration for Management Companies");
	}

	@Test(priority = 122, description = "Verify CiraBooks Corporate Budget navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyccbBudgetNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Budgets navigation");
		TestBase.setExtentReportSettings("Budget", Constants.SMOKE_TESTING, "Verify Budget", "Verifying CiraBooks Corporate Budget navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbBudgetNavigate(), "Error while navigating to CiraBooks Corporate Budget");
	}

	@Test(priority = 123, description = "Verify General Ledger Report navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBGeneralLedgerReportNavigation() 
	{
		LoggerManager.info("Verify General Ledger Report");
		TestBase.setExtentReportSettings("General Ledger Report", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate General Ledger Report", "Verifying CiraBooks Corporate General Ledger Report navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbGeneralLedgerReportNavigate(), "Error while navigating to CiraBooks Corporate General Ledger Report");
	}

	@Test(priority = 124, description = "Verify CiraBooks Corporate Journal Entries navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBJournalEntriesNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Journal Entries  navigation");
		TestBase.setExtentReportSettings("Journal Entries", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Journal Entries", "Verifying CiraBooks Corporate Journal Entries navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbJournalEntriesNavigate(), "Error while navigating to CiraBooks Corporate Journal Entries");
	}

	@Test(priority = 125, description = "Verify CiraBooks Corporate Journal Entry Template navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBJournalEntryTemplateNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Journal Entry Template navigation");
		TestBase.setExtentReportSettings("Journal Entry Template", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Journal Entry Template", "Verifying CiraBooks Corporate Journal Entry Template navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbJournalEntryTemplateNavigate(), "Error while navigating to CiraBooks Corporate Journal Entry Template");
	}

	@Test(priority = 126, description = "Verify CiraBooks Corporate Open - Close Books navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBOpenCloseBookNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Open - Close Books navigation");
		TestBase.setExtentReportSettings("Open - Close Books", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Open - Close Books", "Verifying CiraBooks Corporate Open - Close Books navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbOpenCloseBookNavigate(), "Error while navigating to CiraBooks Corporate Open - Close Books");
	}

	@Test(priority = 127, description = "Verify CiraBooks Corporate Trial Balance navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBTrialBalanceNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Trial Balance navigation");
		TestBase.setExtentReportSettings("Trial Balance", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Trial Balance", "Verifying CiraBooks Corporate Trial Balance navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbTrialBalanceNavigate(), "Error while navigating to CiraBooks Corporate Trial Balance");
	}

	@Test(priority = 128, description = "Verify CiraBooks Corporate Upload Budgets navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBUploadBudgetsNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Upload Budgets navigation");
		TestBase.setExtentReportSettings("Upload Budgets", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Upload Budgets", "Verifying CiraBooks Corporate Upload Budgets navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbUploadBudgetsNavigate(), "Error while navigating to CiraBooks Corporate Upload Budgets");
	}

	@Test(priority = 129, description = "Verify CiraBooks Corporate Upload JE navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBUploadJENavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Upload JE navigation");
		TestBase.setExtentReportSettings("Upload JE", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Upload JE", "Verifying CiraBooks Corporate Upload JE navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbUploadJENavigate(), "Error while navigating to CiraBooks Corporate Upload JE");
	}

	@Test(priority = 130, description = "Verify CiraBooks Corporate Reports navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBReportsNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Reports navigation");
		TestBase.setExtentReportSettings("Reports", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Reports", "Verifying CiraBooks Corporate Reports navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbReportsNavigate(), "Error while navigating to CiraBooks Corporate Reports");
	}

	@Test(priority = 131, description = "Verify CiraBooks Corporate Billing Item Management navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBBillingItemManagementNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Billing Item Management navigation");
		TestBase.setExtentReportSettings("Billing Item Management", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Billing Item Management", "Verifying CiraBooks Corporate Billing Item Management navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbBillingItemManagementNavigate(), "Error while navigating to CiraBooks Corporate Billing Item Management");
	}

	@Test(priority = 132, description = "Verify CiraBooks Corporate Billing Queue Management navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBBillingQueueManagementNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Billing Queue Management navigation");
		TestBase.setExtentReportSettings("Billing Queue Management", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Billing Queue Management", "Verifying CiraBooks Corporate Billing Queue Management navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbBillingQueueManagementNavigate(), "Error while navigating to CiraBooks Corporate Billing Queue Management");
	}

	@Test(priority = 133, description = "Verify CiraBooks Corporate Customer Contracts navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBCustomerContractsNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Customer Contracts navigation");
		TestBase.setExtentReportSettings("Customer Contracts", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Customer Contracts", "Verifying CiraBooks Corporate Customer Contracts navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbCustomerContractsNavigate(), "Error while navigating to CiraBooks Corporate Customer Contracts");
	}
		
	@Test(priority = 134, description = "Verify CiraBooks Corporate Billing Item Category Setup navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBSetupBillingItemCategoryNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Billing Item Category Setup navigation");
		TestBase.setExtentReportSettings("Billing Item Category Setup", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Billing Item Category Setup", "Verifying CiraBooks Corporate Billing Item Category Setup navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbSetupBillingItemCategoryNavigate(), "Error while navigating to CiraBooks Corporate Billing Item Category Setup");
	}

	@Test(priority = 135, description = "Verify CiraBooks Corporate Billing Rules Setup navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBBillingRulesSetupNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Billing Rules Setup navigation");
		TestBase.setExtentReportSettings("Billing Rules Setup", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Billing Rules Setup", "Verifying CiraBooks Corporate Billing Rules Setup navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbBillingRulesSetupNavigate(), "Error while navigating to CiraBooks Corporate Billing Rules Setup");
	}

	@Test(priority = 136, description = "Verify CiraBooks Corporate Contract Form Setup navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCCBContractFormSetupNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Contract Form Setup navigation");
		TestBase.setExtentReportSettings("Contract Form Setup", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Contract Form Setup", "Verifying CiraBooks Corporate Contract Form Setup navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbContractFormSetupNavigate(), "Error while navigating to CiraBooks Corporate Contract Form Setup");
	}

	@Test(priority = 137, description = "Verify CiraBooks Corporate Customer Category Setup navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyccbCustomerCategorySetupNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Customer Category Setup navigation");
		TestBase.setExtentReportSettings("Customer Category Setup", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Customer Category Setup", "Verifying CiraBooks Corporate Customer Category Setup navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbCustomerCategorySetupNavigate(), "Error while navigating to CiraBooks Corporate Customer Category Setup");
	}

	@Test(priority = 138, description = "Verify CiraBooks Corporate Product Category Setup navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyccbRevenueProductCategoriesNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Product Category Setup navigation");
		TestBase.setExtentReportSettings("Product Category Setup", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Product Category Setup", "Verifying CiraBooks Corporate Product Category Setup navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbRevenueProductCategoriesNavigate(), "Error while navigating to CiraBooks Corporate Product Category Setup");
	}

	@Test(priority = 139, description = "Verify CiraBooks Corporate Products Setup navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyccbRevenueProductsNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Products Setup navigation");
		TestBase.setExtentReportSettings("Products Setup", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Products Setup", "Verifying CiraBooks Corporate Products Setup navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbRevenueProductsNavigate(), "Error while navigating to CiraBooks Corporate Products Setup");
	}

	@Test(priority = 140, description = "Verify CiraBooks Corporate Subscriptions Setup navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyccbRevenueSubscriptionsNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Subscriptions Setup navigation");
		TestBase.setExtentReportSettings("Subscriptions Setup", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Subscriptions Setup", "Verifying CiraBooks Corporate Subscriptions Setup navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbRevenueSubscriptionsNavigate(), "Error while navigating to CiraBooks Corporate Subscriptions Setup");
	}

	@Test(priority = 141, description = "Verify CiraBooks Corporate Payroll Reimbursements navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyccbPayrollReimbeursementNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Payroll Reimbursements navigation");
		TestBase.setExtentReportSettings("Payroll Reimbursements", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Payroll Reimbursements", "Verifying CiraBooks Corporate Payroll Reimbursements navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbPayrollReimbeursementNavigate(), "Error while navigating to CiraBooks Corporate Payroll Reimbursements");
	}

	@Test(priority = 142, description = "Verify CiraBooks Corporate Charge Code Category Setup navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyccbChargeCodeCategoryNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Charge Code Category Setup navigation");
		TestBase.setExtentReportSettings("Charge Code Category Setup", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Charge Code Category Setup", "Verifying CiraBooks Corporate Charge Code Category Setup navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbChargeCodeCategoryNavigate(), "Error while navigating to CiraBooks Corporate Charge Code Category Setup");
	}

	@Test(priority = 143, description = "Verify CiraBooks Corporate Charge Code Setup navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyccbChargeCodesNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Charge Code Setup navigation");
		TestBase.setExtentReportSettings("Charge Code Setup", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Charge Code Setup", "Verifying CiraBooks Corporate Charge Code Setup navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbChargeCodesNavigate(), "Error while navigating to CiraBooks Corporate Charge Code Setup");
	}

	@Test(priority = 144, description = "Verify CiraBooks Corporate Charge Rate Category Setup navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyccbChargeRateCategoryNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Charge Rate Category Setup navigation");
		TestBase.setExtentReportSettings("Charge Rate Category Setup", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Charge Rate Category Setup", "Verifying CiraBooks Corporate Charge Rate Category Setup navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbChargeRateCategoryNavigate(), "Error while navigating to CiraBooks Corporate ");
	}

	@Test(priority = 145, description = "Verify CiraBooks Corporate Charge Rate Setup navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyccbChargeRatesNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Charge Rate Setup navigation");
		TestBase.setExtentReportSettings("Charge Rate Setup", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Charge Rate Setup", "Verifying CiraBooks Corporate Charge Rate Setup navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ccbChargeRatesNavigate(), "Error while navigating to CiraBooks Corporate ");
	}

	@Test(priority = 146, description = "Verify CiraBooks Corporate Advanced Search navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyadvancedSearchNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate Advanced Search navigation");
		TestBase.setExtentReportSettings("Advanced Search", Constants.SMOKE_TESTING, "Verify CiraBooks Corporate Advanced Search", "Verifying CiraBooks Corporate Advanced Search navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.advancedSearchNavigate(), "Error navigate to Advanced Search");
	}		

	@Test(priority = 147, description = "Verify CiraBooks Corporate User Directory navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyuserDirectoryNavigation() 
	{
		LoggerManager.info("Verify CiraBooks Corporate User Directory navigation");
		TestBase.setExtentReportSettings("User Directory", Constants.SMOKE_TESTING, "Verify User Directory", "Verifying User Directory navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.userDirectoryNavigate(), "Error navigate to User Directory");
	}

	@Test(priority = 148, description = "Verify Contact Us navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifycontactUsNavigation() 
	{
		LoggerManager.info("Verify Contact Us navigation");
		TestBase.setExtentReportSettings("Contact Us", Constants.SMOKE_TESTING, "Verify Contact Us", "Verifying Contact Us navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.contactUsNavigate(), "Error navigate to Contact Us");
	}

	@Test(priority = 149, description = "Verify Calendar navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifycalendarNavigation() 
	{
		LoggerManager.info("Verify Calendar navigation");
		TestBase.setExtentReportSettings("Calendar", Constants.SMOKE_TESTING, "Verify Calendar", "Verifying Calendar navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.calendarNavigate(), "Error navigate to Calendar");
	}

	@Test(priority = 150, description = "Verify ciraMail navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyciraMailNavigation()
	{
		LoggerManager.info("Verify ciraMailIcon navigation");
		TestBase.setExtentReportSettings("ciraMail", Constants.SMOKE_TESTING, "Verify ciraMail", "Verifying ciraMail navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.ciraMailNavigate(), "Error navigate to ciraMail");
	}

	@Test(priority = 151, description = "Verify logCall Create Case navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifylogCallCreateCaseNavigation()
	{
		LoggerManager.info("Verify logCall Create Case navigation");
		TestBase.setExtentReportSettings("logCall Create Case", Constants.SMOKE_TESTING, "Verify logCall Create Case", "Verifying logCall Create Case navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.logCallCreateCaseNavigate(), "Error navigate to logCall Create Case");
	}

	@Test(priority = 152, description = "Verify Time & Expense Management navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifytimeAndExpensesNavigation()
	{
		LoggerManager.info("Verify Time & Expense Management navigation");
		TestBase.setExtentReportSettings("Time & Expense Management", Constants.SMOKE_TESTING, "Verify Time & Expense Management", "Verifying Time & Expense Management navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.timeAndExpensesNavigate(), "Error navigate to Time & Expense Management");
	}

	@Test(priority = 153, description = "Verify helpNavigate navigation", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyHelpNavigation()
	{
		LoggerManager.info("Verify Help navigation");
		TestBase.setExtentReportSettings("Help", Constants.SMOKE_TESTING, "Verify Help", "Verifying Help navigation");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.helpNavigate(), "Error navigate to Help");
	}
*/
}