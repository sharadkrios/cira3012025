package com.ciranet.internaluser.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ciranet.basepage.BasePage;
import com.ciranet.navigation.Navigation;
import com.ciranet.quicksearch.QuickSearch;
import com.ciranet.utilities.LoggerManager;

public class InternalUserNavigation extends BasePage
{
	public InternalUserNavigation(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "//dx-button[@title='Hide Menu']//i[@class='dx-icon dx-icon-menu']")
	public WebElement hamburgerIcon;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-menu']")
	public WebElement hamburgerShowIcon;

	@FindBy(xpath = "//dx-text-box[@placeholder='Search Navigation']")
	public WebElement searchNavigation;

	@FindBy(xpath = "//span[normalize-space()='My Portfolio']")
	WebElement myPortfolioSideNav;

	@FindBy(xpath = "//span[normalize-space()='Account Management']")
	WebElement accountManagementSideNav;

	@FindBy(xpath = "//h2[contains(.,'Account Management')]")
	public WebElement accountManagementPageTitle;

	@FindBy(xpath = "//span[normalize-space()='Achievements']")
	WebElement achievementsSideNav;

	@FindBy(xpath = "//h2[contains(.,'Achievements')]")
	WebElement achievementsPageTitle;

	@FindBy(xpath = "//span[contains(.,'Cloud Drive')]")
	WebElement cloudDriveSideNav;

	@FindBy(xpath = "//span[normalize-space()='Map of My Communities']")
	WebElement mapofMyCommunitiesSideNav;

	@FindBy(xpath = "//h2[contains(.,'Map of My Communities')]")
	WebElement mapofMyCommunitiesPageTitle;

	@FindBy(xpath = "//span[normalize-space()='My Communities']")
	WebElement myCommunitiesSideNav;

	@FindBy(xpath = "//h2[contains(.,'My Communities')]")
	WebElement myCommunitiesPageTitle;

	@FindBy(xpath = "//span[contains(.,'My Tests')]")
	WebElement myTestsSideNav;

	@FindBy(xpath = "//span[normalize-space()='My Text']")
	WebElement myTextSideNav;

	@FindBy(xpath = "//span[normalize-space()='Refresh']")
	WebElement refreshButton;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Revenue Management')]")
	WebElement revenueManagementSideNav;

	@FindBy(xpath = "//span[normalize-space()='Billing Item Management']")
	WebElement billingItemManagementSideNav;

	@FindBy(xpath = "//span[normalize-space()='Billing Queue Management']")
	WebElement billingQueueManagementSideNav;

	@FindBy(xpath = "//span[normalize-space()='My Customer Charges']")
	WebElement myCustomerChargesSideNav;

	@FindBy(xpath = "//span[normalize-space()='Test Plan Configuration']")
	WebElement testPlanConfigurationSideNav;

	@FindBy(xpath = "//span[normalize-space()='Testing Configuration']")
	WebElement testingConfigurationSideNav;

	@FindBy(xpath = "//span[normalize-space()='Time & Expense']")
	WebElement timeExpenseSideNav;

	@FindBy(xpath = "(//span[contains(.,'Time & Expense Management')])[1]")
	WebElement timeExpenseManagementSideNav;

	@FindBy(xpath = "//span[contains(.,'Time & Expense Submission')]")
	WebElement timeExpenseSubmissionSideNav;

	@FindBy(xpath = "(//span[contains(.,'Vendor Management')])[1]")
	WebElement vendorManagementSideNav;

	@FindBy(xpath = "//span[normalize-space()='CiraBooks']")
	WebElement ciraBooksSideNav;

	@FindBy(xpath = "//div[@title='CiraBooks Workspace']")
	WebElement ciraBooksWorkspaceSideNav;

	@FindBy(xpath = "//span[normalize-space()='Accounts Payable']")
	WebElement accountsPayableSideNav;

	@FindBy(xpath = "//span[normalize-space()='Accounts Receivable']")
	WebElement accountsReceivableSideNav;

	@FindBy(xpath = "(//span[contains(.,'AP Batches')])[1]")
	WebElement apBatchesSideNav;

	@FindBy(xpath = "//h2[contains(.,'AP Batches')]")
	WebElement apBatchesPageTitle;

	@FindBy(xpath = "(//span[contains(.,'AP Bill Analysis')])[1]")
	WebElement apBillAnalysisSideNav;

	@FindBy(xpath = "(//span[contains(.,'AP Ledger')])[1]")
	WebElement apLedgerSideNav;

	@FindBy(xpath = "(//span[contains(.,'AP Unapplied Payments')])[1]")
	WebElement apUnappliedPaymentsSideNav;

	@FindBy(xpath = "(//span[contains(.,'Check Printing Management')])[1]")
	WebElement checkPrintingManagementSideNav;

	@FindBy(xpath = "(//span[contains(.,'EFT Payment Management')])[1]")
	WebElement eftPaymentManagementSideNav;

	@FindBy(xpath = "//span[contains(.,'Local Office Only Check Printing')]")
	WebElement localOfficeOnlyCheckPrintingSideNav;

	@FindBy(xpath = "//span[contains(.,'Manage AAP Workflow Vendor Edit')]")
	WebElement manageAAPWorkflowVendorEditSideNav;

	@FindBy(xpath = "//span[contains(.,'My Submitted Invoices')]")
	WebElement mySubmittedInvoicesSideNav;

	@FindBy(xpath = "//span[contains(.,'Reimbursement Request')]")
	WebElement reimbursementRequestSideNav;

	@FindBy(xpath = "//span[contains(.,'Search Invoices')]")
	WebElement searchInvoicesSideNav;

	@FindBy(xpath = "//span[contains(.,'Submit Invoice')]")
	WebElement submitInvoiceSideNav;

	@FindBy(xpath = "(//span[contains(.,'Vendor 1099')])[1]")
	WebElement vendor1099SideNav;

	@FindBy(xpath = "//span[normalize-space()='Vendor Aging']")
	WebElement vendorAgingSideNav;

	@FindBy(xpath = "//span[normalize-space()='Vendor Missing Bills']")
	WebElement vendorMissingBillsSideNav;

	@FindBy(xpath = "(//span[contains(.,'AR Batches')])[1]")
	WebElement arBatchesSideNav;

	@FindBy(xpath = "//span[contains(.,'AR Collections')]")
	WebElement arCollectionSideNav;

	@FindBy(xpath = "(//span[contains(.,'AR Invoice Analysis')])[1]")
	WebElement arInvoiceAnalysisSideNav;

	@FindBy(xpath = "(//span[contains(.,'AR Ledger')])[1]")
	WebElement arLedgerSideNav;

	@FindBy(xpath = "//span[contains(.,'Add Payments')]")
	WebElement addPaymentsSideNav;

	@FindBy(xpath = "//span[normalize-space()='Customer Aging']")
	WebElement customerAgingSideNav;

	@FindBy(xpath = "//span[contains(.,'Generate Builder Statements')]")
	WebElement generateBuilderStatementsSideNav;

	@FindBy(xpath = "//span[contains(.,'Lot Payment Allocation')]")
	WebElement lotPaymentAllocationSideNav;

	@FindBy(xpath = "//span[normalize-space()='Cash Management']")
	WebElement cashManagementSideNav;

	@FindBy(xpath = "(//span[contains(.,'Bank Accounts')])[1]")
	WebElement bankAccountsSideNav;

	@FindBy(xpath = "//span[contains(.,'Bank Reconciliation')]")
	WebElement bankReconciliationSideNav;

	@FindBy(xpath = "(//span[contains(.,'CM Batches')])[1]")
	WebElement cmBatchesSideNav;

	@FindBy(xpath = "(//span[contains(.,'Cash Receipts')])[1]")
	WebElement cashReceiptsSideNav;

	@FindBy(xpath = "(//span[contains(.,'Deposits')])[1]")
	WebElement depositsSideNav;

	@FindBy(xpath = "(//span[contains(.,'Funds Transfer')])[1]")
	WebElement fundsTransferSideNav;

	@FindBy(xpath = "//span[contains(.,'Lockbox Payment File')]")
	WebElement lockboxPaymentFileSideNav;

	@FindBy(xpath = "//span[contains(.,'Manage Bank Statements')]")
	WebElement manageBankStatementsSideNav;

	@FindBy(xpath = "//span[contains(.,'Unmatched Transactions')]")
	WebElement unmatchedTransactionsSideNav;

	@FindBy(xpath = "//span[normalize-space()='CiraBooks Entity']")
	WebElement ciraBooksEntitySideNav;

	@FindBy(xpath = "(//span[contains(.,'Audit Log')])[1]")
	WebElement auditLogSideNav;

	@FindBy(xpath = "(//span[contains(.,'Configuration')])[3]")
	WebElement configurationSideNav;

	@FindBy(xpath = "//span[normalize-space()='Financial Reports']")
	WebElement financialReportsSideNav;

	@FindBy(xpath = "//span[normalize-space()='Actual vs Budget']")
	WebElement actualBudgetSideNav;

	@FindBy(xpath = "//span[normalize-space()='Benchmark Report']")
	WebElement benchmarkReportSideNav;

	@FindBy(xpath = "//span[normalize-space()='Financial Summary']")
	WebElement financialSummarySideNav;

	@FindBy(xpath = "//span[normalize-space()='General Ledger']")
	WebElement generalLedgerSideNav;

	@FindBy(xpath = "(//span[contains(.,'Budget')])[3]")
	WebElement budgetSideNav;

	@FindBy(xpath = "(//span[contains(.,'General Ledger Report')])[1]")
	WebElement generalLedgerReportSideNav;

	@FindBy(xpath = "(//span[contains(.,'Journal Entries')])[1]")
	WebElement journalEntriesSideNav;

	@FindBy(xpath = "//span[contains(.,'Journal Entry Templates')]")
	WebElement journalEntryTemplatesSideNav;

	@FindBy(xpath = "//span[contains(.,'Open / Close Books')]")
	WebElement openCloseBooksSideNav;

	@FindBy(xpath = "(//span[contains(.,'Trial Balance')])[1]")
	WebElement trialBalanceSideNav;

	@FindBy(xpath = "(//span[contains(.,'Upload Budgets')])[1]")
	WebElement uploadBudgetsSideNav;

	@FindBy(xpath = "//span[contains(.,'Upload JEs')]")
	WebElement uploadJEsSideNav;

	@FindBy(xpath = "(//span[contains(.,'CiraBooks Corporate Workspace')])[1]")
	WebElement ciraBooksCorporateWorkspaceSideNav;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-mail-bulk']")
	WebElement ciraMailSideNav;

	@FindBy(xpath = "//i[@class='fas fa-bars fa-stack-1x fa-inverse']")
	WebElement logCallCreateCaseSideNav;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-hand-holding-usd']")
	WebElement timeAndExpensesSideNav;

	@FindBy(xpath = "//h2[contains(.,'Time & Expense Management')]")
	WebElement timeAndExpensesPageTitle;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-question']")
	WebElement helpSideNav;

	@FindBy(xpath = "dx-loadindicator-icon")
	private WebElement loaderIcon;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'My Work Queue ')]")
	WebElement myWorkQueueSideNav;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Community Management ')]")
	WebElement communityManagementLabel;

	@FindBy(xpath = "//span[contains(.,'Architectural Application')]")
	WebElement architecturalAplicationSideNav;

	@FindBy(xpath = "//span[contains(.,'Automated Document Print')]")
	WebElement automatedDocumentPrintSideNav;

	@FindBy(xpath = "(//span[contains(.,'Board Approvals')])[1]")
	WebElement boardApprovalsSideNav;

	@FindBy(xpath = "//span[contains(.,'Common Lots Appraisal')]")
	WebElement commonLotsApprisalSideNav;

	@FindBy(xpath = "//div[@class='tree-item-template'][contains(.,'Fulfillment Queue')]")
	WebElement fulfillmentQueueSideNav;

	@FindBy(xpath = "//span[contains(.,'Maintenance Work Orders')]")
	WebElement maintenanceWorkOrderSideNav;

	@FindBy(xpath = "//span[contains(.,'Violation Review')]")
	WebElement violationReviewSideNav;

	@FindBy(xpath = "//span[contains(text(),' Community On-Boarding ')]")
	WebElement communityOnBoardingSideNav;

	@FindBy(xpath = "//span[contains(.,'Add Community')]")
	WebElement addCommunitySideNav;

	@FindBy(xpath = "//h3[contains(.,'Organization Details')]")
	WebElement addCommunityPageTitle;

	@FindBy(xpath = "//span[contains(.,'On-Boarding Checklist')]")
	WebElement onBoardingChecklistSideNav;

	@FindBy(xpath = "(//span[contains(.,'On-Boarding Flags')])[1]")
	WebElement onBoardingFlagsSideNav;

	@FindBy(xpath = "//span[normalize-space()='Schedule First Assessment']")
	WebElement scheduleFirstAssessmentSideNav;

	@FindBy(xpath = "//span[normalize-space()='Schedule Initial Statement']")
	WebElement scheduleInitialAssessmentSideNav;

	@FindBy(xpath = "//span[normalize-space()='Closing Portal Location Manager']")
	WebElement closingPortalLocationManagerSideNav;

	@FindBy(xpath = "//span[normalize-space()='Closing Requests']")
	WebElement closingRequestSideNav;

	@FindBy(xpath = "//span[normalize-space()='Community Blocks']")
	WebElement communityBlockSideNav;

	@FindBy(xpath = "//span[normalize-space()='Property Conveyances']")
	WebElement propertyConveyancesSideNav;

	@FindBy(xpath = "//div[@title='Internal Tasks']")
	WebElement internalTaskSideNav;

	@FindBy(xpath = "//span[normalize-space()='My Work Inbox']")
	WebElement myWorkInboxSideNav;

	@FindBy(xpath = "//span[normalize-space()='Invoice Approval']")
	WebElement invoiceApprovalSideNav;

	@FindBy(xpath = "//span[normalize-space()='Metrics']")
	WebElement metricsSideNav;

	@FindBy(xpath = "//span[normalize-space()='Process Invoices']")
	WebElement processInvoiceSideNav;

	@FindBy(xpath = "//div[@title='Process Tracker']//div[@class='header-text']")
	WebElement processTrackerSideNav;

	@FindBy(xpath = "//span[normalize-space()='Annual Budget Preparation']")
	WebElement annualBudgetPreparationSideNav;

	@FindBy(xpath = "//span[normalize-space()='Annual Coupon Order']")
	WebElement annualCouponOrderSideNav;

	@FindBy(xpath = "//span[normalize-space()='Annual Federal Tax Return Filing']")
	WebElement annualFederalTaxReturnFilingSideNav;

	@FindBy(xpath = "//span[normalize-space()='Annual State Tax Return Filing']")
	WebElement annualStateTaxReturnFilingSideNav;

	@FindBy(xpath = "//span[normalize-space()='Annual Statement Generation Process']")
	WebElement annualStatementGenarationProcessSideNav;

	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement PageTitle;

	@FindBy(xpath = "//span[normalize-space()='Financial Report Publishing']")
	WebElement financialReportPublishingSideNav;

	@FindBy(xpath = "//span[normalize-space()='Management Report Generation']")
	WebElement managementReportPublishingSideNav;

	@FindBy(xpath = "//span[normalize-space()='Projects / Tasks']")
	WebElement projectTaskSideNav;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Receivables Lockbox ')]")
	WebElement receivableLockboxSideNav;

	@FindBy(xpath = "//span[normalize-space()='Bank Returns']")
	WebElement bankReturnsSideNav;

	@FindBy(xpath = "//span[normalize-space()='NOC Queue']")
	WebElement nOCQueueSideNav;

	@FindBy(xpath = "//span[normalize-space()='Order Annual Coupons']")
	WebElement orderAnnualCouponSideNav;

	@FindBy(xpath = "//span[normalize-space()='Payment Post Errors']")
	WebElement paymentPostErrorSideNav;

	@FindBy(xpath = "//span[normalize-space()='Statement Approvals']")
	WebElement statementApprovelSideNav;

	@FindBy(xpath="//div[@class='dx-template-wrapper dx-popup-title dx-has-close-button']")
	WebElement errorPopupPageTitle;

	@FindBy(xpath="//div[@class='dx-button-content']//span[contains(text(),'Close')]")
	WebElement closeErrorPopupPageTitle;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' CiraBooks Corporate ')]")
	WebElement corporateCiraBookSideNav;

	@FindBy(xpath = "(//span[contains(.,'AP Batches')])[2]")
	WebElement ccbAPBatchesSideNav;

	@FindBy(xpath = "(//span[contains(.,'AP Bill Analysis')])[2]")
	WebElement ccbAPBillAnalysisSideNav;

	@FindBy(xpath = "//h2[contains(.,'AP Bill Analysis')]")
	WebElement ccbAPBillAnalysisPageTitle;

	@FindBy(xpath = "(//span[contains(.,'AP Ledger')])[2]")
	WebElement ccbAPLedgerSideNav;

	@FindBy(xpath = "//h2[contains(.,'AP Ledger')]")
	WebElement ccbAPLedgerPageTitle;

	@FindBy(xpath = "(//span[contains(.,'Check Printing Management')])[2]")
	WebElement ccbCheckPrintingManagementSideNav;

	@FindBy(xpath = "//h2[contains(.,'Check Printing Management For Management Companies')]")
	WebElement ccbCheckPrintingManagementPageTitle;

	@FindBy(xpath = "(//span[contains(.,'EFT Payment Management')])[2]")
	WebElement ccbEFTPaymentManagementSideNav;

	@FindBy(xpath = "//h2[contains(.,'EFT Payment Management')]")
	WebElement ccbEFTPaymentManagementPageTitle;

	@FindBy(xpath = "//span[contains(.,'New AP Bill')]")
	WebElement ccbNewAPBillSideNav;

	@FindBy(xpath = "//h2[contains(.,'New AP Bill')]")
	WebElement ccbNewAPBillPageTitle;

	@FindBy(xpath = "//span[contains(.,'Select Bills to Pay')]")
	WebElement ccbSelectBillstiPaySideNav;

	@FindBy(xpath = "//h2[contains(.,'Select Bills to Pay')]")
	WebElement ccbSelectBillstiPayPageTitle;

	@FindBy(xpath = "(//span[contains(.,'Vendor 1099')])[2]")
	WebElement ccbVendor1099SideNav;

	@FindBy(xpath = "//h2[contains(.,'Vendor 1099')]")
	WebElement ccbVendor1099PageTitle;

	@FindBy(xpath = "(//span[contains(.,'Vendor Aging')])[2]")
	WebElement ccbVendorAgingSideNav;

	@FindBy(xpath = "//h2[contains(.,'Vendor Aging')]")
	WebElement ccbVendorAgingPageTitle;

	@FindBy(xpath = "(//span[contains(.,'Vendor Management')])[2]")
	WebElement ccbVendorManagementSideNav;

	@FindBy(xpath = "//h2[contains(.,'Vendor Management')]")
	WebElement ccbVendorManagementPageTitle;

	@FindBy(xpath = "//span[contains(.,'Work Queue Management')]")
	WebElement ccbWorkQueueManagementSideNav;

	@FindBy(xpath = "//h2[contains(.,'Work Queue Management')]")
	WebElement ccbWorkQueueManagementPageTitle;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Accounts Receivable ')]")
	WebElement accountReceivableSideNav;

	@FindBy(xpath = "(//span[contains(.,'AR Batches')])[2]")
	WebElement ccbARBatchesSideNav;

	@FindBy(xpath = "//h2[contains(.,'AR Batches')]")
	WebElement ccbARBatchesPageTitle;

	@FindBy(xpath = "(//span[contains(.,'AR Invoice Analysis')])[2]")
	WebElement ccbARInvoiceAnalysisSideNav;

	@FindBy(xpath = "//h2[contains(.,'AR Invoice Analysis')]")
	WebElement ccbARInvoiceAnalysisPageTitle;

	@FindBy(xpath = "(//span[contains(.,'AR Ledger')])[2]")
	WebElement ccbARLedgerSideNav;

	@FindBy(xpath = "//h2[contains(.,'AR Ledger')]")
	WebElement ccbARLedgerPageTitle; 

	@FindBy(xpath = "//span[contains(.,'Customer Aging')]")
	WebElement ccbCustomerAgingSideNav;

	@FindBy(xpath = "//h2[contains(.,'Customer Aging')]")
	WebElement ccbCustomerAgingPageTitle;

	@FindBy(xpath = "//span[contains(.,'Customer Management')]")
	WebElement ccbCustomerManagementSideNav;

	@FindBy(xpath = "//h2[contains(.,'Customer Management')]")
	WebElement ccbCustomerManagementPageTitle;

	@FindBy(xpath = "//div[@title='New AR Adjustment']")
	WebElement ccbNewARAdjustmentSideNav;

	@FindBy(xpath = "//h2[contains(.,'New AR Adjustment')]")
	WebElement ccbNewARAdjustmentPageTitle;

	@FindBy(xpath = "//span[contains(.,'New AR Invoice')]")
	WebElement ccbNewARInvoiceSideNav;

	@FindBy(xpath = "//h2[contains(.,'New AR Invoice')]")
	WebElement ccbNewARInvoicePageTitle;

	@FindBy(xpath = "//span[contains(.,'New AR Payment')]")
	WebElement ccbNewARPaymentSideNav;

	@FindBy(xpath = "//h2[contains(.,'New AR Payment')]")
	WebElement ccbNewARPaymentPageTitle;

	@FindBy(xpath = "(//span[contains(.,'Bank Accounts')])[2]")
	WebElement ccbBankAccountSideNav;

	@FindBy(xpath = "//h2[contains(.,'Bank Accounts')]")
	WebElement ccbBankAccountPageTitle;

	@FindBy(xpath = "(//span[contains(.,'CM Batches')])[2]")
	WebElement ccbCMBatchesSideNav;

	@FindBy(xpath = "//h2[contains(.,'CM Batches')]")
	WebElement ccbCMBatchesPageTitle;	

	@FindBy(xpath = "(//span[contains(.,'Cash Receipts')])[3]")
	WebElement ccbCashReceiptsSideNav;

	@FindBy(xpath = "//h2[contains(.,'Cash Receipts')]")
	WebElement ccbCashReceiptsPageTitle;

	@FindBy(xpath = "(//span[contains(.,'Deposits')])[2]")
	WebElement ccbDepositsSideNav;

	@FindBy(xpath = "//h2[contains(.,'Deposits')]")
	WebElement ccbDepositsPageTitle;

	@FindBy(xpath = "//h2[contains(.,'Bank Reconciliation')]")
	WebElement ccbReconcileBankAccountPageTitle;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Entity ')]")
	WebElement entity;

	@FindBy(xpath = "(//span[contains(.,'Audit Log')])[2]")
	WebElement ccbAuditLogSideNav;

	@FindBy(xpath = "//h2[contains(.,'Audit Log')]")
	WebElement ccbAuditLogPageTitle;

	@FindBy(xpath = "(//span[contains(.,'Configuration')])[4]")
	WebElement ccbConfigurationSideNav;

	@FindBy(xpath = "//h2[contains(.,'Configuration for Management Companies')]")
	WebElement ccbConfigurationPageTitle;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'General Ledger')]")
	WebElement genaralLedgerSideNav;

	@FindBy(xpath = "(//span[contains(.,'Budget')])[5]")
	WebElement ccbBudgetSideNav;

	@FindBy(xpath = "//h2[contains(.,'Budgets')]")
	WebElement ccbBudgetPageTitle;

	@FindBy(xpath = "(//span[contains(.,'General Ledger Report')])[2]")
	WebElement ccbGeneralLedgerReportSideNav;

	@FindBy(xpath = "//h2[contains(.,'General Ledger Report')]")
	WebElement ccbGeneralLedgerReportPageTitle;

	@FindBy(xpath = "(//span[contains(.,'Journal Entries')])[2]")
	WebElement ccbJournalEntriesSideNav;

	@FindBy(xpath = "//h2[contains(.,'Journal Entries')]")
	WebElement ccbJournalEntriesPageTitle;

	@FindBy(xpath = "(//span[contains(.,'Journal Entry Template')])[2]")
	WebElement ccbJournalEntryTemplateSideNav;

	@FindBy(xpath = "//h2[contains(.,'Journal Entry Template')]")
	WebElement ccbJournalEntryTemplatePageTitle;

	@FindBy(xpath = "//span[contains(.,'Open/Close Books')][1]")
	WebElement ccbOpenCloseBookSideNav;

	@FindBy(xpath = "//h2[contains(.,'Open - Close Books')]")
	WebElement ccbOpenCloseBookPageTitle;

	@FindBy(xpath = "(//span[contains(.,'Trial Balance')])[2]")
	WebElement ccbTrialBalanceSideNav;

	@FindBy(xpath = "//h2[contains(.,'Trial Balance')]")
	WebElement ccbTrialBalancePageTitle;

	@FindBy(xpath = "(//span[contains(.,'Upload Budgets')])[2]")
	WebElement ccbUploadBudgetsSideNav;

	@FindBy(xpath = "//h2[contains(.,'Upload Budgets')]")
	WebElement ccbUploadBudgetsPageTitle;

	@FindBy(xpath = "(//span[contains(.,'Upload JEs')])[2]")
	WebElement ccbUploadJESideNav;

	@FindBy(xpath = "//h2[contains(.,'Upload JE')]")
	WebElement ccbUploadJEPageTitle;

	@FindBy(xpath = "(//span[contains(.,'Reports')])[2]")
	WebElement ccbReportsSideNav;

	@FindBy(xpath = "//h2[contains(.,'Reports')]")
	WebElement ccbReportsPageTitle;

	@FindBy(xpath = "(//div[@class='tree-item-template'][contains(.,'Billing Item Management')])[2]")
	WebElement ccbBillingItemManagementSideNav;

	@FindBy(xpath = "//h2[contains(.,'Billing Item Management')]")
	WebElement ccbBillingItemManagementPageTitle;

	@FindBy(xpath = "(//span[contains(.,'Billing Queue Management')])[2]")
	WebElement ccbBillingQueueManagementSideNav;

	@FindBy(xpath = "//h2[contains(.,'Billing Queue Management')]")
	WebElement ccbBillingQueueManagementPageTitle;

	@FindBy(xpath = "//span[contains(.,'Customer Contracts')]")
	WebElement ccbCustomerContractsSideNav;

	@FindBy(xpath = "//h2[contains(.,'Customer Contracts')]")
	WebElement ccbCustomerContractsPageTitle;

	@FindBy(xpath = "//span[contains(.,'Billing Item Categories')]")
	WebElement ccbSetupBillingItemCategorySideNav;

	@FindBy(xpath = "//h2[contains(.,'Billing Item Category Setup')]")
	WebElement ccbSetupBillingItemCategoryPageTitle;

	@FindBy(xpath = "//span[contains(.,'Billing Rules')]")
	WebElement ccbBillingRulesSetupSideNav;

	@FindBy(xpath = "//h2[contains(.,'Billing Rules Setup')]")
	WebElement ccbBillingRulesSetupPageTitle;

	@FindBy(xpath = "//span[contains(.,'Contract Forms')]")
	WebElement ccbContractFormSetupSideNav;

	@FindBy(xpath = "//h2[contains(.,'Contract Form Setup')]")
	WebElement ccbContractFormSetupPageTitle;

	@FindBy(xpath = "//h2[contains(.,'Customer Category Setup')]")
	WebElement ccbCustomerCategorySetupSideNav;

	@FindBy(xpath = "//span[contains(.,'Product Categories')]")
	WebElement ccbRevenueProductCategoriesSideNav;

	@FindBy(xpath = "//h2[contains(.,'Product Category Setup')]")
	WebElement ccbRevenueProductCategoriesPageTitle;

	@FindBy(xpath = "//span[contains(.,'CiraBooks Corporate')]")
	WebElement ccbCiraBooksCorporateSideNav;

	@FindBy(xpath = "//span[contains(.,'Revenue Management')]")
	WebElement ccbRevenueManagementSideNav;

	@FindBy(xpath = "//span[contains(.,'Setup')]")
	WebElement ccbSetupSideNav;

	@FindBy(xpath = "//span[contains(.,'Products')]")
	WebElement ccbRevenueProductsSideNav;

	@FindBy(xpath = "//h2[contains(.,'Products Setup')]")
	WebElement ccbRevenueProductsPageTitle;

	@FindBy(xpath = "//span[contains(.,'Subscriptions')]")
	WebElement ccbRevenueSubscriptionsSideNav;

	@FindBy(xpath = "//h2[contains(.,'Subscriptions Setup')]")
	WebElement ccbRevenueSubscriptionsPageTitle;

	@FindBy(xpath = "//span[contains(.,'Time & Expense Management')]")
	WebElement ccbTimeExpenseManagementSideNav;

	@FindBy(xpath = "//div[@class='header-text'][contains(.,'Setup')]")
	WebElement ccbTimeExpenseManagementSetUpSideNav;

	@FindBy(xpath = "(//span[contains(.,'Payroll Reimbursement')])[1]")
	WebElement ccbPayrollReimbeursementSideNav;

	@FindBy(xpath = "//h2[contains(.,'Payroll Reimbursements')]")
	WebElement ccbPayrollReimbeursementPageTitle;

	@FindBy(xpath = "//span[contains(.,'Charge Code Categories')]")
	WebElement ccbChargeCodeCategorySideNav;

	@FindBy(xpath = "//h2[contains(.,'Charge Code Category Setup')]")
	WebElement ccbChargeCodeCategoryPageTitle;

	@FindBy(xpath = "//span[contains(.,'Charge Codes')]")
	WebElement ccbChargeCodesSideNav;

	@FindBy(xpath = "//h2[contains(.,'Charge Code Setup')]")
	WebElement ccbChargeCodesPageTitle;

	@FindBy(xpath = "//span[contains(.,'Charge Rate Categories')]")
	WebElement ccbChargeRateCategorySideNav;

	@FindBy(xpath = "//h2[contains(.,'Charge Rate Category Setup')]")
	WebElement ccbChargeRateCategoryPageTitle;

	@FindBy(xpath = "//span[contains(.,'Charge Rates')]")
	WebElement ccbChargeRatesSideNav;

	@FindBy(xpath = "//h2[contains(.,'Charge Rate Setup')]")
	WebElement ccbChargeRatesPageTitle;

	@FindBy(xpath = "//i[@ng-reflect-ng-class='fas fa-search']")
	WebElement advancedSearchSideNav;

	@FindBy(xpath = "(//div[@class='button-container']//div[@class='dx-template-wrapper dx-button-content'])[2]")
	WebElement userDirectorySideNav;

	@FindBy(xpath = "//h2[contains(.,'Directory')]")
	WebElement userDirectoryPageTitle;

	@FindBy(xpath = "//i[@ng-reflect-ng-class='far fa-life-ring']")
	WebElement contactUsSideNav;

	@FindBy(xpath = "//h2[contains(.,'Contact Us')]")
	WebElement contactUsPageTitle;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-calendar-alt']")
	WebElement calendarSideNav;

	@FindBy(xpath = "//a[@class='fas fa-question-circle']")
	WebElement helpicon;

	@FindBy(xpath = "//h2[contains(.,'My Calendar')]")
	WebElement calendarPageTitle;

	@FindBy(xpath = "//span[@class='dx-button-text'][contains(.,'Close')]")
	WebElement closeButton;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-popup-title dx-has-close-button']")
	WebElement errorPopup;
	
	@FindBy(xpath = "//i[@class='dx-icon dx-icon-menu']")
	WebElement hamburger;

	QuickSearch quickSearch = new QuickSearch(driver);
	Navigation navigationSearch = new Navigation(driver);

	Robot robot;

	public void pressEscapeKey()
	{
		try 
		{
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void waitForPageToLoad(int timeoutInSeconds) 
	{
		new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
		.until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void switchingTab(WebDriver driver, int keepTabIndex)
	{
		try 
		{
			 // Get all browser tabs
	        ArrayList<String> browserTabs = new ArrayList<>(driver.getWindowHandles());

	        // Validate the index of the tab to keep
	        if (keepTabIndex < 0 || keepTabIndex >= browserTabs.size()) 
	        {
	            throw new IllegalArgumentException("Invalid keepTabIndex: " + keepTabIndex);
	        }

	        // Iterate through all tabs
	        for (int i = 0; i < browserTabs.size(); i++) 
	        {
	            if (i != keepTabIndex) {
	                // Switch to the tab and close it
	                driver.switchTo().window(browserTabs.get(i));
	                driver.close();
	            }
	        }

	        // Switch back to the tab to keep
	        driver.switchTo().window(browserTabs.get(keepTabIndex));
	    }
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


	public void ciraBooksCorporate() 
	{
		try 
		{
			LoggerManager.info("Navigating to CCB Revenue Product Categories via CIRA Books Corporate navigation.");
			clickElementJS(ccbCiraBooksCorporateSideNav);

			LoggerManager.info("Scrolling to and clicking Revenue Management navigation.");
			scrollToElement(ccbRevenueManagementSideNav);
			clickElementJS(ccbRevenueManagementSideNav);

			LoggerManager.info("Scrolling to and clicking Setup navigation.");
			scrollToElement(ccbSetupSideNav);
			clickElementJS(ccbSetupSideNav);

		}
		catch (Exception e) 
		{
			LoggerManager.error("An unexpected error occurred during the CIRA Books Corporate navigation process: " + e.getMessage());
		}
	}

	public void ciraBooksCorporateTimeExpenseManagement() 
	{
		try 
		{
			LoggerManager.info("Navigating to CCB CIRA Books Corporate Time and Expense Management navigation.");
			clickElementJS(ccbCiraBooksCorporateSideNav);

			scrollToElement(ccbTimeExpenseManagementSideNav);
			clickElementJS(ccbTimeExpenseManagementSideNav);

			scrollToElement(ccbTimeExpenseManagementSetUpSideNav);
			clickElementJS(ccbTimeExpenseManagementSetUpSideNav);

		}
		catch (Exception e) 
		{
			LoggerManager.error("An unexpected error occurred during the CIRA Books Corporate navigation process: " + e.getMessage());
		}
	}

	public void closePopup() 
	{
		try 
		{
			LoggerManager.info("Waiting for the popup close button to become visible.");
			waitForElementToBeVisible(closeButton);

			if (isElementDisplayed(closeButton)) 
			{
				LoggerManager.info("Close button is displayed. Attempting to close the popup.");
				pressEscapeKey();
				LoggerManager.info("Popup closed successfully using the Escape key.");
			}
			else 
			{
				LoggerManager.warn("Close button is not visible. Unable to close the popup.");
			}
		}
		catch (Exception e) 
		{
			LoggerManager.error("An error occurred while attempting to close the popup: " + e.getMessage());
		}
	}

	private boolean verifyPageURL(String urlText) 
	{
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList browserTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) browserTabs.get(1));

		String strPageURL= getCurrentPageURL();
		return strPageURL.contains(urlText);
	}

	private boolean navigateToPageAndVerifyPageTitle(WebElement navigatedPageTitle, WebElement sideNavigationMenuName, String pageTitle) {
		try {
			LoggerManager.info("Scrolling to " + sideNavigationMenuName.getAttribute("value") + " navigation.");

			scrollToElement(sideNavigationMenuName);
			clickElement(sideNavigationMenuName);

			waitForPageToLoad(60);

			LoggerManager.info("Validating the page title...");
			boolean isPageTitleDisplayed = navigatedPageTitle.getText().equals(pageTitle);

			if (isPageTitleDisplayed) {
				LoggerManager.info("Page Title validation passed. Title matches " + pageTitle + ".");
			} else {
				LoggerManager.warn("Page Title validation failed. Title does not match " + pageTitle + ".");
			}

			return isPageTitleDisplayed;
		} catch (Exception e) {
			LoggerManager.error("An error occurred during navigation or page title validation: " + e.getMessage());
			return false;
		}
	}
	
	public void clickHamburgerIcon() 
	{
		try 
		{
			waitForElementToBeClickable(hamburger);
			Actions actions = new Actions(driver);
			// Performs mouse move action onto the element
			actions.moveToElement(hamburger).click().build().perform();
		}
		catch (Exception e) 
		{
			LoggerManager.error("An error occurred while navigating to Legal Summary: " + e.getMessage());
		}
	}

	public boolean accountManagementNavigate() 
	{
		try 
		{
			LoggerManager.info("Navigating to Account Management");	        
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Account Management']"), "Account Management");
			return navigateToPageAndVerifyPageTitle(accountManagementPageTitle, accountManagementSideNav, "Account Management");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Account Management navigate' method: " + e.getMessage() + e);
			return false;
		}
	}

	public boolean achievementsNavigate() 
	{
		try 
		{
			LoggerManager.info("Navigating to Achievements");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Achievements']"), "Achievements");
			return navigateToPageAndVerifyPageTitle(achievementsPageTitle, achievementsSideNav, "Achievements");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Achievements navigate' method: " + e.getMessage() + e);
			return false;
		}
	}

	public boolean cloudDriveNavigate() 
	{
		try 
		{
			LoggerManager.info("Navigating to CloudDrive");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Cloud Drive')]"), "Cloud Drive");

			clickElementJS(cloudDriveSideNav);
			waitForInvisibility(loaderIcon);

			// Close all tabs except the first one (index 0)
			switchingTab(driver, 0);
			
			return (verifyPageURL("username"));
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'CloudDrive'" + e.getMessage() + e);
			return false;
		}
	}

	public boolean mapofMyCommunitiesNavigate() 
	{
		try 
		{
			LoggerManager.info("Navigating to Map of My Communities");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Map of My Communities')]"), "Map of My Communities");
			return navigateToPageAndVerifyPageTitle(mapofMyCommunitiesPageTitle, mapofMyCommunitiesSideNav, "Map of My Communities");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Map of My Communities navigate' method: " + e.getMessage() + e);
			return false;
		}
	}

	public boolean myCommunitiesNavigate() 
	{
		try 
		{
			LoggerManager.info("Navigating to My Communities");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'My Communities')])[2]"), "My Communities");
			return navigateToPageAndVerifyPageTitle(myCommunitiesPageTitle, myCommunitiesSideNav, "My Communities");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'My Communities navigate' method: " + e.getMessage() + e);
			return false;
		}
	}

	public boolean myTestsNavigate() 
	{
		try 
		{
			LoggerManager.info("Navigating to My Tests");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,' My Tests ')]"), "My Tests");

			clickElementJS(myTestsSideNav);

			switchingTab(driver, 0);

			return (verifyPageURL("my-tests"));

		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'My Tests navigate' method: " + e.getMessage() + e);
			return false;
		}
	}

	public boolean myTextNavigate() 
	{
		try 
		{
			LoggerManager.info("Navigating to My Text");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='My Text']"), "My Text");
			LoggerManager.info("Scrolling to My Text navigation.");

			scrollToElement(myTextSideNav);
			clickElement(myTextSideNav);
			
			switchingTab(driver, 0);

			return (verifyPageURL("my-text"));

		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'My Text navigate' method: " + e.getMessage() + e);
			return false;
		}
	}

	public boolean billingItemManagementNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Billing Item Management");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Billing Item Management')])[1]"), "Billing Item Management");
			return navigateToPageAndVerifyPageTitle(PageTitle, billingItemManagementSideNav, "Billing Item Management");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Billing Item Management'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean billingQueueManagementNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Billing Queue Management");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Billing Queue Management')]"), "Billing Queue Management");
			return navigateToPageAndVerifyPageTitle(PageTitle, billingQueueManagementSideNav, "Billing Queue Management");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Billing Queue Management'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean myCustomerChargesNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to My Customer Charges");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'My Customer Charges')]"), "My Customer Charges");
			return navigateToPageAndVerifyPageTitle(PageTitle, myCustomerChargesSideNav, "My Customer Charges");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'My Customer Charges'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean testPlanConfigurationNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Test Plan Configuration");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Test Plan Configuration']"), "Test Plan Configuration");
			return navigateToPageAndVerifyPageTitle(PageTitle, testPlanConfigurationSideNav, "Test Plan Configuration");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Test Plan Configuration'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean testingConfigurationNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Testing Configuration");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Testing Configuration']"), "Testing Configuration");
			clickHamburgerIcon();
			
			return navigateToPageAndVerifyPageTitle(PageTitle, testingConfigurationSideNav, "Testing Configuration");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Testing Configuration'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean timeExpenseManagementNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Time & Expense Management");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Time & Expense Management')])[1]"), "Time & Expense Management");
			return navigateToPageAndVerifyPageTitle(PageTitle, timeExpenseManagementSideNav, "Time & Expense Management");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in ''" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean timeExpenseSubmissionNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Time & Expense Submissions");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Time & Expense Submission']"), "Time & Expense Submission");
			return navigateToPageAndVerifyPageTitle(PageTitle, timeExpenseSubmissionSideNav, "Time & Expense Submissions");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Time & Expense Submissions'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean vendorManagementNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Vendor Management");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Vendor Management')])[1]"), "Vendor Management");
			return navigateToPageAndVerifyPageTitle(PageTitle, vendorManagementSideNav, "Vendor Management");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Vendor Management'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean architecturalAplicationNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Architectural Application");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Architectural Application')]"), "Architectural Application");
			return navigateToPageAndVerifyPageTitle(PageTitle, architecturalAplicationSideNav, "Architectural Application");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Architectural Application'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean automatedDocumentPrintNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Automated Document Print");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Automated Document Print')]"), "Automated Document Print");
			return navigateToPageAndVerifyPageTitle(PageTitle, automatedDocumentPrintSideNav, "Automated Document Print");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Automated Document Print'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean boardApprovalsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Board Approvals");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Board Approvals')])[1]"), "Board Approvals");
			return navigateToPageAndVerifyPageTitle(PageTitle, boardApprovalsSideNav, "Board Approvals");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Board Approvals'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean commonLotsApprisalNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Common Lots Appraisal");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Common Lots Appraisal')]"), "Common Lots Appraisal");
			return navigateToPageAndVerifyPageTitle(PageTitle, commonLotsApprisalSideNav, "Common Lots Appraisal");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Common Lots Appraisal'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean fulfillmentQueueNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Fulfillment Queue");
			navigationSearch.navigateBySideNavigation(By.xpath("//div[@class='tree-item-template'][contains(.,'Fulfillment Queue')]"), "Fulfillment Queue");
			return navigateToPageAndVerifyPageTitle(PageTitle, fulfillmentQueueSideNav, "Fulfillment Queue");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Fulfillment Queue'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean maintenanceWorkOrderNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Maintenance Work Orders");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Maintenance Work Orders')]"), "Maintenance Work Orders");
			return navigateToPageAndVerifyPageTitle(PageTitle, maintenanceWorkOrderSideNav, "Maintenance Work Orders");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Maintenance Work Orders'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean violationReviewNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Open Violations Requiring Review");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Violation Review')]"), " Violation Review");
			return navigateToPageAndVerifyPageTitle(PageTitle, violationReviewSideNav, "Open Violations Requiring Review");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Open Violations Requiring Review'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean addCommunityNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Add Community");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Add Community')]"), "Add Community");
			return navigateToPageAndVerifyPageTitle(addCommunityPageTitle, addCommunitySideNav, "Organization Details");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Add Community'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean onBoardingChecklistNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to On-Boarding Checklist");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'On-Boarding Checklist')]"), "On-Boarding Checklist");
			return navigateToPageAndVerifyPageTitle(PageTitle, onBoardingChecklistSideNav, "On-Boarding Checklist");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'On-Boarding Checklist'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean onBoardingFlagsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Modify an On-Boarding Community");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'On-Boarding Flags')])[1]"), "On-Boarding flag");
			return navigateToPageAndVerifyPageTitle(PageTitle, onBoardingFlagsSideNav, "Modify an On-Boarding Community");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'On-Boarding Community'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean scheduleFirstAssessmentNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Schedule First Assessment");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Schedule First Assessment']"), "Schedule First Assessment");
			return navigateToPageAndVerifyPageTitle(PageTitle, scheduleFirstAssessmentSideNav, "Schedule First Assessment");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Schedule First Assessment'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean scheduleInitialAssessmentNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Schedule Initial Statement");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Schedule Initial Statement']"), "Schedule Initial Statement");
			return navigateToPageAndVerifyPageTitle(PageTitle, scheduleInitialAssessmentSideNav, "Schedule Initial Statement");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Schedule Initial Statement'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean closingPortalLocationManagerNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Closing Portal Location Manager");
			navigationSearch.navigateBySideNavigation(By.xpath("//div[@title='Closing Portal Location Manager']"), "Closing Portal Location Manager");
			return navigateToPageAndVerifyPageTitle(PageTitle, closingPortalLocationManagerSideNav, "Closing Portal Location Manager");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Closing Portal Location Manager'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean closingRequestNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Closing Requests");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Closing Requests']"), "Closing Requests");
			return navigateToPageAndVerifyPageTitle(PageTitle, closingRequestSideNav, "Closing Requests");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Closing Requests'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean communityBlockNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to communityBlockSideNav");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Community Blocks']"), "Community Blocks");
			return navigateToPageAndVerifyPageTitle(PageTitle, communityBlockSideNav, "SOA Community Blocks Config");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Community Blocks Config'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean propertyConveyancesNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Property Conveyances");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Property Conveyances']"), "Property Conveyances");
			return navigateToPageAndVerifyPageTitle(PageTitle, propertyConveyancesSideNav, "Property Ownership Conveyance");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Property Conveyances'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean internalTaskNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Internal Tasks");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Internal Tasks']"), "Internal Tasks");
			return navigateToPageAndVerifyPageTitle(PageTitle, internalTaskSideNav, "Internal Tasks");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Internal Tasks'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean myWorkInboxNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to My Work Inbox");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='My Work Inbox']"), "My Work Inbox");
			return navigateToPageAndVerifyPageTitle(PageTitle, myWorkInboxSideNav, "My Work Inbox");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'My Work Inbox'" + e.getMessage() + e);
			return false;
		}
	}

	public boolean invoiceApprovalNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to invoice approval");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Invoice Approval']"), "invoice approval");
			return navigateToPageAndVerifyPageTitle(PageTitle, invoiceApprovalSideNav, "AAP Workflow Queue");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'invoice approval'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean metricsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Metrics");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Metrics']"), "metrics");
			return navigateToPageAndVerifyPageTitle(PageTitle, metricsSideNav, "AAP Workflow Metrics");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'AAP Workflow Metrics'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean processInvoiceNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Process Invoice");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Process Invoices']"), "Process Invoices");

			scrollToElement(processInvoiceSideNav);
			clickElementJS(processInvoiceSideNav);
			waitForInvisibility(loaderIcon);
			String strPageURL= getCurrentPageURL();
			
			clickHamburgerIcon();

			return strPageURL.contains("editor");

		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Process Invoices navigate' method: " + e.getMessage() + e);
			return false;
		}
	}

	public boolean annualBudgetPreparationNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Annual Budget Preparation");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Annual Budget Preparation']"), "Annual Budget Preparation");
			clickHamburgerIcon();
			return navigateToPageAndVerifyPageTitle(PageTitle, annualBudgetPreparationSideNav, "Annual Budget Preparation");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Annual Budget Preparation'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean annualCouponOrderNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Annual Coupon Process");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Annual Coupon Order']"), "Annual Coupon");
			return navigateToPageAndVerifyPageTitle(PageTitle, annualCouponOrderSideNav, "Annual Coupon Process");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Annual Coupon Process'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean annualFederalTaxReturnFilingNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Annual Federal Tax Return Filing");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Annual Federal Tax Return Filing']"), "Annual Federal Tax Return Filing");
			return navigateToPageAndVerifyPageTitle(PageTitle, annualFederalTaxReturnFilingSideNav, "Annual Federal Tax Return Filing");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Annual Federal Tax Return Filing'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean annualStateTaxReturnFilingNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Annual State Tax Return Filing");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Annual State Tax Return Filing']"), "Annual State Tax Return Filing");
			return navigateToPageAndVerifyPageTitle(PageTitle, annualStateTaxReturnFilingSideNav, "Annual State Tax Return Filing");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Annual State Tax Return Filing'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean annualStatementGenarationProcessNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Annual Statement Generation Process");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Annual Statement Generation Process']"), "Annual Statement Generation Process");
			return navigateToPageAndVerifyPageTitle(PageTitle, annualStatementGenarationProcessSideNav, "Annual Statement Generation Process");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Annual Statement Generation Process'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean financialReportPublishingNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to ");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Financial Report Publishing']"), "Financial Report Publishing");
			return navigateToPageAndVerifyPageTitle(PageTitle, financialReportPublishingSideNav, "Financial Report Publishing");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Financial Report Publishing'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean managementReportPublishingNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Monthly Management Report Generation");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Management Report Generation']"), "Management Report Generation");
			return navigateToPageAndVerifyPageTitle(PageTitle, managementReportPublishingSideNav, "Monthly Management Report Generation");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in ''" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean projectTaskNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Projects / Tasks");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Projects / Tasks')]"), "Projects / Tasks");
			return navigateToPageAndVerifyPageTitle(PageTitle, projectTaskSideNav, "Projects / Tasks");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Projects / Tasks'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean bankReturnsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Bank Returns");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Bank Returns']"), "Bank Returns");
			return navigateToPageAndVerifyPageTitle(PageTitle, bankReturnsSideNav, "Bank Returns");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Bank Returns'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean nOCQueueNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to NOC Queue");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='NOC Queue']"), "NOC Queue");
			closePopup();
			return navigateToPageAndVerifyPageTitle(PageTitle, nOCQueueSideNav, "NOC Queue");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'NOC Queue'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean orderAnnualCouponNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Order Annual Coupons");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Order Annual Coupons']"), "Order Annual Coupons");
			return navigateToPageAndVerifyPageTitle(PageTitle, orderAnnualCouponSideNav, "Order Annual Coupons");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Order Annual Coupons'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean paymentPostErrorNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Payment Post Errors");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Payment Post Errors']"), "Payment Post Errors");
			return navigateToPageAndVerifyPageTitle(PageTitle, paymentPostErrorSideNav, "Payment Post Errors");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Payment Post Errors'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean statementApprovelNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Statement Approvals");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Statement Approvals']"), "Statement Approvals");
			return navigateToPageAndVerifyPageTitle(PageTitle, statementApprovelSideNav, "Statement Approvals");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Statement Approvals'" + e.getMessage() + e);
			return false;
		}	
	}

	//Cirabooks code starts here
	public boolean ciraBooksWorkspaceNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Workspace");
			navigationSearch.navigateBySideNavigation(By.xpath("//div[@title='CiraBooks Workspace']"), "CiraBooks Workspace");
			return navigateToPageAndVerifyPageTitle(PageTitle, ciraBooksWorkspaceSideNav, "CiraBooks Workspace");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'CiraBooks Workspace'" + e.getMessage() + e);
			return false;
		}	
	}

	//Accounts Payable code starts here
	public boolean apBatchesNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to AP Batches");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'AP Batches')])[1]"), "AP Batches");
			return navigateToPageAndVerifyPageTitle(apBatchesPageTitle, apBatchesSideNav, "AP Batches");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'AP Batches'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean apBillAnalysisNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to AP Bill Analysis");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'AP Bill Analysis')])[1]"), "AP Bill Analysis");
			return navigateToPageAndVerifyPageTitle(PageTitle, apBillAnalysisSideNav, "AP Bill Analysis");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'AP Bill Analysis'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean apLedgerNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to ");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'AP Ledger')])[1]"), "AP Ledger");
			return navigateToPageAndVerifyPageTitle(PageTitle, apLedgerSideNav, "AP Ledger");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'AP Ledger'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean apUnappliedPaymentsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to AP Unapplied Payments");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'AP Unapplied Payments')])[1]"), "AP Unapplied Payments");
			return navigateToPageAndVerifyPageTitle(PageTitle, apUnappliedPaymentsSideNav, "AP Unapplied Payments");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'AP Unapplied Payments'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean checkPrintingManagementNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Check Printing Management");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Check Printing Management')])[1]"), "Check Printing Management");
			return navigateToPageAndVerifyPageTitle(PageTitle, checkPrintingManagementSideNav, "Check Printing Management");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Check Printing Management'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean eftPaymentManagementNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to EFT Payment Management");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'EFT Payment Management')])[1]"), "EFT Payment Management");
			return navigateToPageAndVerifyPageTitle(PageTitle, eftPaymentManagementSideNav, "EFT Payment Management");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'EFT Payment Management'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean localOfficeOnlyCheckPrintingNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Local Office Only Check Printing");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Local Office Only Check Printing')]"), "Local Office Only Check Printing");
			scrollToElement(localOfficeOnlyCheckPrintingSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, localOfficeOnlyCheckPrintingSideNav, "Local Office Only Check Printing");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Local Office Only Check Printing'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean manageAAPWorkflowVendorEditNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Manage AAP Workflow Vendor Edit");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Manage AAP Workflow Vendor Edit')]"), "Manage AAP Workflow Vendor Edit");
			return navigateToPageAndVerifyPageTitle(PageTitle, manageAAPWorkflowVendorEditSideNav, "Manage AAP Workflow Vendor Edit");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Manage AAP Workflow Vendor Edit'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean mySubmittedInvoicesNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to My submitted Invoices");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'My Submitted Invoices')]"), "My submitted Invoices");
			return navigateToPageAndVerifyPageTitle(PageTitle, mySubmittedInvoicesSideNav, "Review My Invoices");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'My submitted Invoices'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean reimbursementRequestNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Reimbursement Request");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Reimbursement Request')]"), "Reimbursement Request");
			return navigateToPageAndVerifyPageTitle(PageTitle, reimbursementRequestSideNav, "Reimbursement Request");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Reimbursement Request'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean searchInvoicesNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Search Invoices");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Search Invoices')]"), "Search Invoices");
			return navigateToPageAndVerifyPageTitle(PageTitle, searchInvoicesSideNav, "Search Invoices");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Search Invoices'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean submitInvoiceNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Submit Invoice");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Submit Invoice')]"), "Submit Invoice");
			return navigateToPageAndVerifyPageTitle(PageTitle, submitInvoiceSideNav, "Submit Invoice/Payment Request");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Submit Invoice'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean vendor1099Navigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Vendor 1099");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Vendor 1099')])[1]"), "Vendor 1099");
			return navigateToPageAndVerifyPageTitle(PageTitle, vendor1099SideNav, "Vendor 1099");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Vendor 1099'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean vendorAgingNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Vendor Aging");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Vendor Aging')])[1]"), "Vendor Aging");
			return navigateToPageAndVerifyPageTitle(PageTitle, vendorAgingSideNav, "Vendor Aging");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Vendor Aging'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean vendorMissingBillsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Vendor Missing Bills");
			navigationSearch.navigateBySideNavigation(By.xpath("//div[@title='Vendor Missing Bills']"), "Vendor Missing Bills");
			return navigateToPageAndVerifyPageTitle(PageTitle, vendorMissingBillsSideNav, "Vendor Missing Bills");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Vendor Missing Bills'" + e.getMessage() + e);
			return false;
		}	
	}

	//Accounts Receivable code starts 
	public boolean aRBatchesNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to AR Batches");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'AR Batches')])[1]"), "AR Batches");
			return navigateToPageAndVerifyPageTitle(PageTitle, arBatchesSideNav, "AR Batches");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'AR Batches'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean arCollectionNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Collections");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'AR Collections')]"), "Collections");
			return navigateToPageAndVerifyPageTitle(PageTitle, arCollectionSideNav, "Collections");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Collections'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean arInvoiceAnalysisNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to AR Invoice Analysis");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'AR Invoice Analysis')])[1]"), "AR Invoice Analysis");
			return navigateToPageAndVerifyPageTitle(PageTitle, arInvoiceAnalysisSideNav, "AR Invoice Analysis");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'AR Invoice Analysis'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean arLedgerNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to AR Ledger");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'AR Ledger')])[1]"), "AR Ledger");
			return navigateToPageAndVerifyPageTitle(PageTitle, arLedgerSideNav, "AR Ledger");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'AR Ledger'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean addPaymentsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Add Payments");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Add Payments')]"), "Payments");
			return navigateToPageAndVerifyPageTitle(PageTitle, addPaymentsSideNav, "Create AR Payments");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Add Payments'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean customerAgingNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Customer Aging");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Customer Aging')])[1]"), "Customer Aging");
			return navigateToPageAndVerifyPageTitle(PageTitle, customerAgingSideNav, "Customer Aging");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Customer Aging'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean generateBuilderStatementsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Generate Builder Statements");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Generate Builder Statements')]"), "Generate Builder Statements");
			return navigateToPageAndVerifyPageTitle(PageTitle, generateBuilderStatementsSideNav, "Generate Builder Statements");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Generate Builder Statements'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean lotPaymentAllocationNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Lot Payment Allocations");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Lot Payment Allocation')]"), "Lot Payment");
			return navigateToPageAndVerifyPageTitle(PageTitle, lotPaymentAllocationSideNav, "Lot Payment Allocations");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Lot Payment Allocations'" + e.getMessage() + e);
			return false;
		}	
	}

	// Cash Management code starts here
	public boolean bankAccountsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Bank Accounts");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Bank Accounts')])[1]"), "Bank Accounts");
			return navigateToPageAndVerifyPageTitle(PageTitle, bankAccountsSideNav, "Bank Accounts");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Bank Accounts'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean bankReconciliationNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Bank Reconciliation");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Bank Reconciliation')]"), "Bank Reconciliation");
			return navigateToPageAndVerifyPageTitle(PageTitle, bankReconciliationSideNav, "Bank Reconciliation");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Bank Reconciliation'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean cmBatchesNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CM Batches");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'CM Batches')])[1]"), "CM Batches");
			return navigateToPageAndVerifyPageTitle(PageTitle, cmBatchesSideNav, "CM Batches");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'CM Batches'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean cashReceiptsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Cash Receipts");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Cash Receipts')])[1]"), "Cash Receipts");
			return navigateToPageAndVerifyPageTitle(PageTitle, cashReceiptsSideNav, "Cash Receipts");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Cash Receipts'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean depositsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Deposits");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Deposits')])[1]"), "Deposits");
			scrollToElement(depositsSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, depositsSideNav, "Deposits");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Deposits'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean fundsTransferNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Funds Transfer");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Funds Transfer')])[1]"), "Funds Transfer");
			scrollToElement(fundsTransferSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, fundsTransferSideNav, "Funds Transfer");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Funds Transfer'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean lockboxPaymentFileNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Lockbox Payment File");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Lockbox Payment File')]"), "Lockbox Payment File");
			scrollToElement(lockboxPaymentFileSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, lockboxPaymentFileSideNav, "Lockbox Payment File");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Lockbox Payment File'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean manageBankStatementsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Manage Bank Statement");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Manage Bank Statements')]"), "Manage Bank Statement");
			scrollToElement(manageBankStatementsSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, manageBankStatementsSideNav, "Manage Bank Statement");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Manage Bank Statement'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean unmatchedTransactionsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Unmatched Transactions");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Unmatched Transactions')]"), "Unmatched Transactions");
			scrollToElement(unmatchedTransactionsSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, unmatchedTransactionsSideNav, "Unmatched Transactions");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Unmatched Transactions'" + e.getMessage() + e);
			return false;
		}	
	}

	//=============================== CiraBooks Entity Code starts here ===========================

	public boolean auditLogNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to  Audit Log");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Audit Log')])[1]"), "Audit Log");
			scrollToElement(auditLogSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, auditLogSideNav, "Audit Log");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Audit Log'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean configurationNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Configuration");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Configuration')])[3]"), "Configuration");
			scrollToElement(configurationSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, configurationSideNav, "Configuration");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Configuration'" + e.getMessage() + e);
			return false;
		}	
	}

	//Financial Reports code starts here
	public boolean actualBudgetNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Actual vs Budget");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Actual vs Budget')]"), "Actual vs Budget");
			scrollToElement(actualBudgetSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, actualBudgetSideNav, "Actual vs Budget");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Actual vs Budget'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean benchmarkReportNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Benchmark Report");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Benchmark Report')]"), "Benchmark Report");
			scrollToElement(benchmarkReportSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, benchmarkReportSideNav, "Benchmark Report");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Benchmark Report'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean financialSummaryNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to //span[contains(.,'Financial Summary')]");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Financial Summary')]"), "Financial Summary");
			scrollToElement(financialSummarySideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, financialSummarySideNav, "Financial Summary");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in ''" + e.getMessage() + e);
			return false;
		}	
	}

	// General Ledger code starts here
	public boolean budgetNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Budget");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Budget')])[3]"), "Budget");
			scrollToElement(budgetSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, budgetSideNav, "Budget");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Budget'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean generalLedgerReportNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to General Ledger Report");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'General Ledger Report')])[1]"), "General Ledger Report");
			scrollToElement(generalLedgerReportSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, generalLedgerReportSideNav, "General Ledger Report");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'General Ledger Report'" + e.getMessage() + e);
			return false;
		}	
	}


	public boolean journalEntriesNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Journal Entries");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Journal Entries')])[1]"), "Journal Entries");
			scrollToElement(journalEntriesSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, journalEntriesSideNav, "Journal Entries");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Journal Entries'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean journalEntryTemplatesNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Journal Entry Template");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Journal Entry Templates')]"), "Journal Entry Template");
			scrollToElement(journalEntryTemplatesSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, journalEntryTemplatesSideNav, "Journal Entry Template");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Journal Entry Template'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean openCloseBooksNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Open / Close Books");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Open / Close Books')]"), "Open / Close Books");
			scrollToElement(openCloseBooksSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, openCloseBooksSideNav, "Open / Close Books");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Open / Close Books'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean trialBalanceNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Trial Balance");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Trial Balance')])[1]"), "Trial Balance");
			scrollToElement(trialBalanceSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, trialBalanceSideNav, "Trial Balance");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Trial Balance'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean uploadBudgetsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Upload Budgets");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Upload Budgets')])[1]"), "Upload Budgets");
			scrollToElement(uploadBudgetsSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, uploadBudgetsSideNav, "Upload Budgets");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Upload Budgets'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean uploadJEsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to Upload JEs");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Upload JEs')]"), "Upload JEs");
			scrollToElement(uploadJEsSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, uploadJEsSideNav, "Upload JEs");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Upload JEs'" + e.getMessage() + e);
			return false;
		}	
	}

	// CiraBooks Corporate code starts here
	public boolean ciraBooksCorporateWorkspaceNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Workspace");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'CiraBooks Corporate Workspace')])[1]"), "CiraBooks Corporate Workspace");
			scrollToElement(ciraBooksCorporateWorkspaceSideNav);
			return navigateToPageAndVerifyPageTitle(PageTitle, ciraBooksCorporateWorkspaceSideNav, "CiraBooks Corporate Workspace");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'CiraBooks Corporate Workspace'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbAPBatchesNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate AP Batches");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'AP Batches')])[2]"), "AP Batches");
			scrollToElement(accountsPayableSideNav);
			return navigateToPageAndVerifyPageTitle(apBatchesPageTitle, ccbAPBatchesSideNav, "AP Batches");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'AP Batches'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbAPBillAnalysisNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate AP Bill Analysis");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'AP Bill Analysis')])[2]"), "AP Bill Analysis");
			scrollToElement(ccbAPBillAnalysisSideNav);
			return navigateToPageAndVerifyPageTitle(ccbAPBillAnalysisPageTitle, ccbAPBillAnalysisSideNav, "AP Bill Analysis");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'AP Bill Analysis'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbAPLedgerNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate AP Ledger");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'AP Ledger')])[2]"), "AP Ledger");
			scrollToElement(ccbAPLedgerSideNav);
			return navigateToPageAndVerifyPageTitle(ccbAPLedgerPageTitle, ccbAPLedgerSideNav, "AP Ledger");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'AP Ledger'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbCheckPrintingManagementNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Check Printing Management For Management Companies");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Check Printing Management')])[2]"), "Check Printing Management");
			scrollToElement(ccbCheckPrintingManagementSideNav);
			return navigateToPageAndVerifyPageTitle(ccbCheckPrintingManagementPageTitle, ccbCheckPrintingManagementSideNav, "Check Printing Management For Management Companies");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Check Printing Management For Management Companies'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbEFTPaymentManagementNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate EFT Payment Management");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'EFT Payment Management')])[2]"), "EFT Payment Management");
			scrollToElement(ccbEFTPaymentManagementSideNav);
			return navigateToPageAndVerifyPageTitle(ccbEFTPaymentManagementPageTitle, ccbEFTPaymentManagementSideNav, "EFT Payment Management");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'EFT Payment Management'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbNewAPBillNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate New AP Bill");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'New AP Bill')]"), "New AP Bill");
			scrollToElement(ccbNewAPBillSideNav);
			return navigateToPageAndVerifyPageTitle(ccbNewAPBillPageTitle, ccbNewAPBillSideNav, "New AP Bill");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate ''" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbSelectBillstiPayNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Select Bills to Pay");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Select Bills to Pay')]"), "Select Bills to Pay");
			scrollToElement(ccbSelectBillstiPaySideNav);
			return navigateToPageAndVerifyPageTitle(ccbSelectBillstiPayPageTitle, ccbSelectBillstiPaySideNav, "Select Bills to Pay");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Select Bills to Pay'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbVendor1099Navigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Vendor 1099");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Vendor 1099')])[2]"), "Vendor 1099");
			scrollToElement(ccbVendor1099SideNav);
			return navigateToPageAndVerifyPageTitle(ccbVendor1099PageTitle, ccbVendor1099SideNav, "Vendor 1099");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Vendor 1099'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbVendorAgingNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Vendor Aging");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Vendor Aging')])[2]"), "Vendor Aging");
			scrollToElement(ccbVendorAgingSideNav);
			return navigateToPageAndVerifyPageTitle(ccbVendorAgingPageTitle, ccbVendorAgingSideNav, "Vendor Aging");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Vendor Aging'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbVendorManagementNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Vendor Management");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Vendor Management')])[2]"), "Vendor Management");
			scrollToElement(ccbVendorManagementSideNav);
			return navigateToPageAndVerifyPageTitle(ccbVendorManagementPageTitle, ccbVendorManagementSideNav, "Vendor Management");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Vendor Management'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbWorkQueueManagementNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Work Queue Management");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Work Queue Management')]"), "Work Queue Management");
			scrollToElement(ccbWorkQueueManagementSideNav);
			return navigateToPageAndVerifyPageTitle(ccbWorkQueueManagementPageTitle, ccbWorkQueueManagementSideNav, "Work Queue Management");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Work Queue Management'" + e.getMessage() + e);
			return false;
		}	
	}

	//Accounts Receivable code starts here
	public boolean ccbARBatchesNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate AR Batches");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'AR Batches')])[2]"), "AR Batches");
			scrollToElement(ccbARBatchesSideNav);
			return navigateToPageAndVerifyPageTitle(ccbARBatchesPageTitle, ccbARBatchesSideNav, "AR Batches");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'AR Batches'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbARInvoiceAnalysisNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate AR Invoice Analysis");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'AR Invoice Analysis')])[2]"), "AR Invoice Analysis");
			scrollToElement(ccbARInvoiceAnalysisSideNav);
			return navigateToPageAndVerifyPageTitle(ccbARInvoiceAnalysisPageTitle, ccbARInvoiceAnalysisSideNav, "AR Invoice Analysis");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'AR Invoice Analysis'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbARLedgerNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate AR Ledger");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'AR Ledger')])[2]"), "AR Ledger");
			scrollToElement(ccbARLedgerSideNav);
			return navigateToPageAndVerifyPageTitle(ccbARLedgerPageTitle, ccbARLedgerSideNav, "AR Ledger");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'AR Ledger'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbCustomerAgingNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Customer Aging");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Customer Aging')]"), "Customer Aging");
			scrollToElement(ccbCustomerAgingSideNav);
			return navigateToPageAndVerifyPageTitle(ccbCustomerAgingPageTitle, ccbCustomerAgingSideNav, "Customer Aging");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Customer Aging'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbCustomerManagementNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Customer Management");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Customer Management')]"), "Customer Management");
			scrollToElement(ccbCustomerManagementSideNav);
			return navigateToPageAndVerifyPageTitle(ccbCustomerManagementPageTitle, ccbCustomerManagementSideNav, "Customer Management");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Customer Management'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbNewARAdjustmentNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate New AR Adjustment");
			navigationSearch.navigateBySideNavigation(By.xpath("//div[@title='New AR Adjustment']"), "New AR Adjustment");
			scrollToElement(ccbNewARAdjustmentSideNav);
			return navigateToPageAndVerifyPageTitle(ccbNewARAdjustmentPageTitle, ccbNewARAdjustmentSideNav, "New AR Adjustment");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'New AR Adjustment'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbNewARInvoiceNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate New AR Invoice");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'New AR Invoice')]"), "New AR Invoice");
			scrollToElement(ccbNewARInvoiceSideNav);
			return navigateToPageAndVerifyPageTitle(ccbNewARInvoicePageTitle, ccbNewARInvoiceSideNav, "New AR Invoice");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'New AR Invoice'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbNewARPaymentNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate New AR Payment");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'New AR Payment')]"), "New AR Payment");
			scrollToElement(ccbNewARPaymentSideNav);
			return navigateToPageAndVerifyPageTitle(ccbNewARPaymentPageTitle, ccbNewARPaymentSideNav, "New AR Payment");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'New AR Payment'" + e.getMessage() + e);
			return false;
		}	
	}

	//Cash management code starts here
	public boolean ccbBankAccountNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Bank Accounts");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Bank Accounts')])[2]"), "Bank Accounts");
			scrollToElement(ccbBankAccountSideNav);
			return navigateToPageAndVerifyPageTitle(ccbBankAccountPageTitle, ccbBankAccountSideNav, "Bank Accounts");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Bank Accounts'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbCMBatchesNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate CM Batches");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'CM Batches')])[2]"), "CM Batches");
			scrollToElement(ccbCMBatchesSideNav);
			return navigateToPageAndVerifyPageTitle(ccbCMBatchesPageTitle, ccbCMBatchesSideNav, "CM Batches");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'CM Batches'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbCashReceiptsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Cash Receipts");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Cash Receipts')])[3]"), "Cash Receipts");
			scrollToElement(ccbCashReceiptsSideNav);
			return navigateToPageAndVerifyPageTitle(ccbCashReceiptsPageTitle, ccbCashReceiptsSideNav, "Cash Receipts");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Cash Receipts'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbDepositsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Deposits");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Deposits')])[2]"), "Deposits");
			scrollToElement(ccbDepositsSideNav);
			return navigateToPageAndVerifyPageTitle(ccbDepositsPageTitle, ccbDepositsSideNav, "Deposits");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Deposits'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbReconcileBankAccountNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Bank Reconciliation");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Bank Reconciliation')]"), "Bank Reconciliation");
			scrollToElement(bankReconciliationSideNav);
			return navigateToPageAndVerifyPageTitle(ccbReconcileBankAccountPageTitle, bankReconciliationSideNav, "Bank Reconciliation");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Bank Reconciliation'" + e.getMessage() + e);
			return false;
		}	
	}

	// Entity code starts here
	public boolean ccbAuditLogNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Audit Log");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Audit Log')])[2]"), "Audit Log");
			scrollToElement(ccbAuditLogSideNav);
			return navigateToPageAndVerifyPageTitle(ccbAuditLogPageTitle, ccbAuditLogSideNav, "Audit Log");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Audit Log'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbConfigurationNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Configuration for Management Companies");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Configuration')])[4]"), "Configuration");
			scrollToElement(ccbConfigurationSideNav);
			return navigateToPageAndVerifyPageTitle(ccbConfigurationPageTitle, ccbConfigurationSideNav, "Configuration for Management Companies");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Configuration for Management Companies'" + e.getMessage() + e);
			return false;
		}	
	}

	//General Ledger code starts here
	public boolean ccbBudgetNavigate()
	{
		try
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Budget");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Budget')])[1]"), "Budget");
			scrollToElement(ccbBudgetSideNav);
			return navigateToPageAndVerifyPageTitle(ccbBudgetPageTitle, ccbBudgetSideNav, "Budgets");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Budgets'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbGeneralLedgerReportNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate General Ledger Report");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'General Ledger Report')])[2]"), "General Ledger Report");
			scrollToElement(ccbGeneralLedgerReportSideNav);
			return navigateToPageAndVerifyPageTitle(ccbGeneralLedgerReportPageTitle, ccbGeneralLedgerReportSideNav, "General Ledger Report");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'General Ledger Report'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbJournalEntriesNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Journal Entries");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Journal Entries')])[2]"), "Journal Entries");
			scrollToElement(ccbJournalEntriesSideNav);
			return navigateToPageAndVerifyPageTitle(ccbJournalEntriesPageTitle, ccbJournalEntriesSideNav, "Journal Entries");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Journal Entries'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbJournalEntryTemplateNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Journal Entry Template");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Journal Entry Template')])[2]"), "Journal Entry Template");
			scrollToElement(ccbJournalEntryTemplateSideNav);
			return navigateToPageAndVerifyPageTitle(ccbJournalEntryTemplatePageTitle, ccbJournalEntryTemplateSideNav, "Journal Entry Template");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Journal Entry Template'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbOpenCloseBookNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Open - Close Books");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Open/Close Books')][1]"), "Open");
			scrollToElement(ccbOpenCloseBookSideNav);
			return navigateToPageAndVerifyPageTitle(ccbOpenCloseBookPageTitle, ccbOpenCloseBookSideNav, "Open - Close Books");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Open - Close Books'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbTrialBalanceNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Trial Balance");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Trial Balance')])[2]"), "Trial Balance");
			scrollToElement(ccbTrialBalanceSideNav);
			return navigateToPageAndVerifyPageTitle(ccbTrialBalancePageTitle, ccbTrialBalanceSideNav, "Trial Balance");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Trial Balance'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbUploadBudgetsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Upload Budgets");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Upload Budgets')])[2]"), "Upload Budgets");
			scrollToElement(ccbUploadBudgetsSideNav);
			return navigateToPageAndVerifyPageTitle(ccbUploadBudgetsPageTitle, ccbUploadBudgetsSideNav, "Upload Budgets");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Upload Budgets'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbUploadJENavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Upload JE");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Upload JEs')])[2]"), "Upload JE");
			scrollToElement(ccbUploadJESideNav);
			return navigateToPageAndVerifyPageTitle(ccbUploadJEPageTitle, ccbUploadJESideNav, "Upload JE");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Upload JE'" + e.getMessage() + e);
			return false;
		}	
	}

	// Reports code starts here
	public boolean ccbReportsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Reports");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Reports')])[2]"), "Reports");
			scrollToElement(ccbReportsSideNav);
			return navigateToPageAndVerifyPageTitle(ccbReportsPageTitle, ccbReportsSideNav, "Reports");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Reports'" + e.getMessage() + e);
			return false;
		}	
	}

	// Revenue Management code starts here		
	public boolean ccbBillingItemManagementNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Billing Item Management");
			navigationSearch.navigateBySideNavigation(By.xpath("(//div[@class='tree-item-template'][contains(.,'Billing Item Management')])[2]"), "Billing Item Management");
			scrollToElement(ccbBillingItemManagementSideNav);
			return navigateToPageAndVerifyPageTitle(ccbBillingItemManagementPageTitle, ccbBillingItemManagementSideNav, "Billing Item Management");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Billing Item Management'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbBillingQueueManagementNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Billing Queue Management");
			navigationSearch.navigateBySideNavigation(By.xpath("(//span[contains(.,'Billing Queue Management')])[2]"), "Billing Queue Management");
			scrollToElement(ccbBillingQueueManagementSideNav);
			return navigateToPageAndVerifyPageTitle(ccbBillingQueueManagementPageTitle, ccbBillingQueueManagementSideNav, "Billing Queue Management");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate ''" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbCustomerContractsNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Customer Contracts");
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Customer Contracts')]"), "Customer Contracts");
			scrollToElement(ccbCustomerContractsSideNav);
			return navigateToPageAndVerifyPageTitle(ccbCustomerContractsPageTitle, ccbCustomerContractsSideNav, "Customer Contracts");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Customer Contracts'" + e.getMessage() + e);
			return false;
		}	
	}

	// setup code starts here
	public boolean ccbSetupBillingItemCategoryNavigate()
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Billing Item Category Setup");
			waitForInvisibility(loaderIcon);
			navigationSearch.navigateBySideNavigation(By.xpath("//span[contains(.,'Billing Item Categories')]"), "Billing Item");
			waitForInvisibility(loaderIcon);
			scrollToElement(ccbSetupBillingItemCategorySideNav);
			return navigateToPageAndVerifyPageTitle(ccbSetupBillingItemCategoryPageTitle, ccbSetupBillingItemCategorySideNav, "Billing Item Category Setup");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in CiraBooks Corporate 'Billing Item Category Setup'" + e.getMessage() + e);
			return false;
		}	
	}

	public boolean ccbBillingRulesSetupNavigate() 
	{
		try 
		{
			LoggerManager.info("Starting navigation to Billing Rules Setup via CIRA Books Corporate.");
			ciraBooksCorporate();

			scrollToElement(ccbBillingRulesSetupSideNav);
			clickElementJS(ccbBillingRulesSetupSideNav);

			waitForElementToBeVisible(ccbBillingRulesSetupPageTitle);
			boolean isTitleValid = navigateToPageAndVerifyPageTitle(
					ccbBillingRulesSetupPageTitle, 
					ccbBillingRulesSetupSideNav, 
					"Billing Rules Setup"
					);

			return isTitleValid;
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred during Billing Rules Setup navigation: " + e.getMessage());
			return false;
		}
	}

	public boolean ccbContractFormSetupNavigate() 
	{
		try 
		{
			LoggerManager.info("Starting navigation to 'Contract Form Setup' via CIRA Books Corporate.");
			ciraBooksCorporate();

			scrollToElement(ccbContractFormSetupSideNav);
			clickElementJS(ccbContractFormSetupSideNav);
			waitForElementToBeVisible(ccbContractFormSetupPageTitle);
			boolean isTitleValid = navigateToPageAndVerifyPageTitle(
					ccbContractFormSetupPageTitle, 
					ccbContractFormSetupSideNav, 
					"Contract Form Setup"
					);

			return isTitleValid;
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred Contract Form Setup navigation: " + e.getMessage());
			return false;
		}
	}

	public boolean ccbCustomerCategorySetupNavigate() 
	{
		try 
		{
			LoggerManager.info("Starting navigation to '' via CIRA Books Corporate.");
			ciraBooksCorporate();
			scrollToElement(ccbCustomerCategorySetupSideNav);
			clickElementJS(ccbCustomerCategorySetupSideNav);
			waitForElementToBeVisible(ccbCustomerCategorySetupSideNav);
			boolean isTitleValid = navigateToPageAndVerifyPageTitle(ccbCustomerCategorySetupSideNav, ccbCustomerCategorySetupSideNav, "Customer Category Setup");
			return isTitleValid;
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred Customer Category Setup while navigation: " + e.getMessage());
			return false;
		}
	}

	public boolean ccbRevenueProductCategoriesNavigate() 
	{
		try 
		{
			LoggerManager.info("Starting navigation to 'Product Category Setup' via CIRA Books Corporate.");
			ciraBooksCorporate();
			scrollToElement(ccbRevenueProductCategoriesSideNav);
			clickElementJS(ccbRevenueProductCategoriesSideNav);
			waitForElementToBeVisible(ccbRevenueProductCategoriesPageTitle);
			boolean isTitleValid = navigateToPageAndVerifyPageTitle(ccbRevenueProductCategoriesPageTitle, ccbRevenueProductCategoriesSideNav, "Product Category Setup");
			return isTitleValid;
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred 'Product Category Setup' while navigation: " + e.getMessage());
			return false;
		}
	}

	public boolean ccbRevenueProductsNavigate() 
	{
		try 
		{
			LoggerManager.info("Starting navigation to 'Products Setup' via CIRA Books Corporate.");
			ciraBooksCorporate();
			scrollToElement(ccbRevenueProductsSideNav);
			clickElementJS(ccbRevenueProductsSideNav);
			waitForElementToBeVisible(ccbRevenueProductsPageTitle);
			boolean isTitleValid = navigateToPageAndVerifyPageTitle(ccbRevenueProductsPageTitle, ccbRevenueProductsSideNav, "Products Setup");
			return isTitleValid;
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred 'Products Setup' while navigation: " + e.getMessage());
			return false;
		}
	}

	public boolean ccbRevenueSubscriptionsNavigate() 
	{
		try 
		{
			LoggerManager.info("Starting navigation to 'Subscriptions Setup' via CIRA Books Corporate.");
			ciraBooksCorporate();
			scrollToElement(ccbRevenueSubscriptionsSideNav);
			clickElementJS(ccbRevenueSubscriptionsSideNav);
			waitForElementToBeVisible(ccbRevenueSubscriptionsPageTitle);
			boolean isTitleValid = navigateToPageAndVerifyPageTitle(ccbRevenueSubscriptionsPageTitle, ccbRevenueSubscriptionsSideNav, "Subscriptions Setup");
			return isTitleValid;
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred 'Subscriptions Setup' while navigation: " + e.getMessage());
			return false;
		}
	}

	// Time & Expense Management code starts here
	public boolean ccbPayrollReimbeursementNavigate() 
	{
		try 
		{
			LoggerManager.info("Starting navigation to 'Payroll Reimbursements' via CIRA Books Corporate");
			clickElementJS(ccbCiraBooksCorporateSideNav);
			scrollToElement(ccbTimeExpenseManagementSideNav);
			clickElementJS(ccbTimeExpenseManagementSideNav);
			scrollToElement(ccbPayrollReimbeursementSideNav);
			clickElementJS(ccbPayrollReimbeursementSideNav);
			waitForElementToBeVisible(ccbPayrollReimbeursementPageTitle);
			boolean isTitleValid = navigateToPageAndVerifyPageTitle(ccbPayrollReimbeursementPageTitle, ccbPayrollReimbeursementSideNav, "Payroll Reimbursements");
			return isTitleValid;
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred 'Payroll Reimbursements' while navigation: " + e.getMessage());
			return false;
		}
	}

	// Time & Expense Management code starts here
	public boolean ccbChargeCodeCategoryNavigate() 
	{
		try 
		{
			LoggerManager.info("Starting navigation to 'Charge Code Category Setup' via CIRA Books Corporate Time & Expense Management.");
			ciraBooksCorporateTimeExpenseManagement();
			LoggerManager.info("Scrolling to and clicking on 'Charge Code Category Setup' navigation.");
			scrollToElement(ccbChargeCodeCategorySideNav);
			clickElementJS(ccbChargeCodeCategorySideNav);
			LoggerManager.info("Waiting for the 'Charge Code Category Setup' page title to be visible.");
			waitForElementToBeVisible(ccbChargeCodeCategoryPageTitle);
			boolean isTitleValid = navigateToPageAndVerifyPageTitle(ccbChargeCodeCategoryPageTitle, ccbChargeCodeCategorySideNav, "Charge Code Category Setup");
			return isTitleValid;
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred during navigation to 'Charge Code Category Setup': " + e.getMessage());
			return false;
		}
	}

	public boolean ccbChargeCodesNavigate() 
	{
		try 
		{
			LoggerManager.info("Starting navigation to 'Charge Code Setup' via CIRA Books Corporate Time & Expense Management.");
			ciraBooksCorporateTimeExpenseManagement();
			scrollToElement(ccbChargeCodesSideNav);
			clickElementJS(ccbChargeCodesSideNav);
			waitForElementToBeVisible(ccbChargeCodesPageTitle);
			boolean isTitleValid = navigateToPageAndVerifyPageTitle(ccbChargeCodesPageTitle, ccbChargeCodesSideNav, "Charge Code Setup");
			return isTitleValid;
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred during navigation to 'Charge Code Setup': " + e.getMessage());
			return false;
		}
	}

	public boolean ccbChargeRateCategoryNavigate()
	{
		try 
		{
			LoggerManager.info("Starting navigation to 'Charge Rate Category Setup' via CIRA Books Corporate Time & Expense Management.");
			ciraBooksCorporateTimeExpenseManagement();
			scrollToElement(ccbChargeRateCategorySideNav);
			clickElementJS(ccbChargeRateCategorySideNav);
			waitForElementToBeVisible(ccbChargeRateCategoryPageTitle);
			boolean isTitleValid = navigateToPageAndVerifyPageTitle(ccbChargeRateCategoryPageTitle, ccbChargeRateCategorySideNav, "Charge Rate Category Setup");
			return isTitleValid;
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred during navigation to 'Charge Rate Category Setup': " + e.getMessage());
			return false;
		}
	}

	public boolean ccbChargeRatesNavigate() 
	{
		try 
		{
			LoggerManager.info("Starting navigation to 'Charge Rate Setup' via CIRA Books Corporate Time & Expense Management.");
			ciraBooksCorporateTimeExpenseManagement();
			scrollToElement(ccbChargeRatesSideNav);
			clickElementJS(ccbChargeRatesSideNav);
			waitForElementToBeVisible(ccbChargeRatesPageTitle);
			boolean isTitleValid = navigateToPageAndVerifyPageTitle(ccbChargeRatesPageTitle, ccbChargeRatesSideNav, "Charge Rate Setup");
			return isTitleValid;
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred during navigation to 'Charge Rate Setup': " + e.getMessage());
			return false;
		}
	}

	//Footer Tool bar code starts here
	public boolean advancedSearchNavigate() 
	{
		try 
		{
			waitForInvisibility(loaderIcon);
			LoggerManager.info("Clicking on Advanced Search navigation.");
			clickElement(advancedSearchSideNav);
			waitForInvisibility(loaderIcon);
			boolean isPageVerified = verifyPageURL("search");
			LoggerManager.info("Page URL verification: " + (isPageVerified ? "Passed" : "Failed"));
			return isPageVerified;
		}
		catch (Exception e) 
		{
			LoggerManager.error("An error occurred during Advanced Search navigation: " + e.getMessage());
			return false;
		}
	}

	public boolean userDirectoryNavigate() 
	{
		try 
		{
			LoggerManager.info("Navigating to CiraBooks Corporate Directory ");
			clickElementJS(userDirectorySideNav);
			waitForInvisibility(loaderIcon);
			return navigateToPageAndVerifyPageTitle(userDirectoryPageTitle, userDirectorySideNav, "Directory");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred 'Directory'" + e.getMessage() + e);
			return false;
		}
	}

	public boolean contactUsNavigate() 
	{
		try 
		{
			LoggerManager.info("Navigating to Contact Us");
			clickElementJS(contactUsSideNav);
			waitForInvisibility(loaderIcon);
			return navigateToPageAndVerifyPageTitle(contactUsPageTitle, contactUsSideNav, "Contact Us");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Contact Us'" + e.getMessage() + e);
			return false;
		}
	}

	public boolean calendarNavigate() 
	{
		try 
		{
			LoggerManager.info("Navigating to Calendar");
			clickElementJS(calendarSideNav);
			waitForInvisibility(loaderIcon);
			waitForElementToBeVisible(helpicon);
			@SuppressWarnings({ "rawtypes", "unchecked" })
			ArrayList<String> browserTabs = new ArrayList<>(driver.getWindowHandles());

			driver.switchTo().window(browserTabs.get(1));
			LoggerManager.info("Successfully navigated to My Calendar");

			boolean isPageTitle = PageTitle.getText().equals("My Calendar");
			LoggerManager.info("Page Title validation: " + (isPageTitle ? "Passed" : "Failed"));
			return isPageTitle;
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Calendar'" + e.getMessage() + e);
			return false;
		}
	}

	public boolean ciraMailNavigate()
	{
		try 
		{
			waitForElementToBeVisible(ciraMailSideNav);
			LoggerManager.info("Navigating to ciraMail");
			clickElementJS(ciraMailSideNav);
			
			switchingTab(driver, 0);
			
			return (verifyPageURL("ciramail"));
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'ciraMail" + e.getMessage() + e);
			return false;
		}
	}

	public boolean logCallCreateCaseNavigate() 
	{
		try 
		{
			waitForElementToBeVisible(logCallCreateCaseSideNav);
			LoggerManager.info("Navigating to logCall Create Case");
			clickElementJS(logCallCreateCaseSideNav);
			switchingTab(driver, 0);
			return (verifyPageURL("logphonecall"));
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'logCall Create Case'" + e.getMessage() + e);
			return false;
		}
	}

	public boolean timeAndExpensesNavigate()
	{
		try 
		{
			waitForElementToBeVisible(timeAndExpensesSideNav);
			LoggerManager.info("Navigating to Time & Expense Management");
			clickElementJS(timeAndExpensesSideNav);
			waitForInvisibility(loaderIcon);

			@SuppressWarnings({ "rawtypes", "unchecked"})
			ArrayList<String> browserTabs = new ArrayList<>(driver.getWindowHandles());

			driver.switchTo().window(browserTabs.get(1));
			return navigateToPageAndVerifyPageTitle(timeAndExpensesPageTitle, timeAndExpensesSideNav, "Time & Expense Management");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Time & Expense Management'" + e.getMessage() + e);
			return false;
		}
	}

	public boolean helpNavigate()
	{
		try 
		{
			waitForElementToBeVisible(helpSideNav);
			LoggerManager.info("Navigating to Help");
			clickElementJS(helpSideNav);
			waitForInvisibility(loaderIcon);

			switchingTab(driver, 0);
			
			return (verifyPageURL("G0"));
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred in 'Help'" + e.getMessage() + e);
			return false;
		}
	}
}
