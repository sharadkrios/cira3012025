package com.ciranet.configurations.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;
import com.ciranet.navigation.Navigation;
import com.ciranet.utilities.LoggerManager;

public class CommunityAccountingPage extends BasePage {
	public CommunityAccountingPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Community Accounting')]")
	WebElement communityAccountingSideNav;

	@FindBy(xpath = "(//div[@class='dx-texteditor-buttons-container'])[2]")
	WebElement configurationDropDown;

	@FindBy(xpath = "//div//span[contains(text(),'AAP Cross Entity Bill')]")
	WebElement aapCrossEntityBill;

	@FindBy(xpath = "//div//span[contains(text(),'AAP Work Flow Auto Action')]")
	WebElement aapWorkFlowAutoAction;

	@FindBy(xpath = "//div//span[contains(text(),'AAP Work Flow CheckList')]")
	WebElement aapWorkFlowCheckList;

	@FindBy(xpath = "//div//span[contains(text(),'AAR Billing Types')]")
	WebElement aarBillingTypes;

	@FindBy(xpath = "//div//span[contains(text(),'AAR Builder Statements')]")
	WebElement aarBuilderStatements;

	@FindBy(xpath = "//div//span[contains(text(),'AAR Misc Invoice Types')]")
	WebElement aarMiscInvoiceTypes;

	@FindBy(xpath = "//div//span[contains(text(),'AAR Payment Application Order')]")
	WebElement aarPaymentApplicationOrder;

	@FindBy(xpath = "//div//span[contains(text(),'AAR Statements')]")
	WebElement aarStatements;

	@FindBy(xpath = "//div//span[contains(text(),'Collections Configuration')]")
	WebElement collectionsConfiguration;

	@FindBy(xpath = "(//div[@class='dx-texteditor-buttons-container'])[4]")
	WebElement contextDropDown;

	@FindBy(xpath = "(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	WebElement contextValue;

	@FindBy(xpath = "//div[@title='Expand All']")
	WebElement expandAllIcon;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	@FindBy(xpath = "//div//strong[contains(text(),'AAP Cross Entity Bill - 1920 E. Maryland Place Townhomes, Inc.')]")
	WebElement aapCrossEntityBillLabel;

	@FindBy(xpath = "//div//strong[contains(text(),'AAP Work Flow Auto Action - Global')]")
	WebElement aapWorkFlowAutoActionLabel;

	@FindBy(xpath = "//div//strong[contains(text(),'AAP Work Flow CheckList - Global')]")
	WebElement aapWorkFlowCheckListLabel;

	@FindBy(xpath = "//div//strong[contains(text(),'AAR Billing Types - Global')]")
	WebElement aarBillingTypesLabel;

	@FindBy(xpath = "//div//strong[contains(text(),'AAR Builder Statements - Global')]")
	WebElement aarBuilderStatementsLabel;

	@FindBy(xpath = "//div//strong[contains(text(),'AAR Misc Invoice Types - RealManage')]")
	WebElement aarMiscInvoiceTypesLabel;

	@FindBy(xpath = "//div//strong[contains(text(),'AAR Payment Application Order - Global')]")
	WebElement aarPaymentApplicationOrderLabel;

	@FindBy(xpath = "//div//strong[contains(text(),'AAR Statements - RealManage')]")
	WebElement aarStatementsLabel;

	@FindBy(xpath = "//div//strong[contains(text(),'Collections Configuration - Global')]")
	WebElement collectionsConfigurationLabel;

	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement pageTitle;

	Navigation navigationSearch = new Navigation(driver);

	public boolean navigate() {
		try {
			navigationSearch.navigateBySideNavigation(
					By.xpath("//div[@class='header-text']//span[contains(text(),'Community Accounting')]"),
					"Community Accounting");
			LoggerManager.info("Scrolling to Community Accounting navigation");
			scrollToElement(communityAccountingSideNav);

			if (isElementDisplayed(communityAccountingSideNav)) {
				LoggerManager.info("Community Accounting is visible, clicking on it");
				clickElementJS(communityAccountingSideNav);

				waitForInvisibility(loaderIcon);

				LoggerManager.info("Successfully searched for the navigation and accessed Community Accounting");

				boolean isPageTitle = pageTitle.getText().equals("Community Accounting Configurations");
				LoggerManager.info("Page Title validation: " + (isPageTitle ? "Passed" : "Failed"));
				return isPageTitle;

			} else {
				LoggerManager.warn("Community Accounting is not visible, search failed");
				return false;
			}

		} catch (Exception e) {
			LoggerManager.error("An error occurred during the navigation search process");
			return false;
		}
	}

	public void context() {
		try {
			waitForElementToBeVisible(contextDropDown);
			clickElementJS(contextDropDown);
			clickElementJS(contextValue);
		} catch (Exception e) {
			LoggerManager.error("Error in context method" + e.getMessage());
			throw e;
		}
	}

	public String aapCrossEntityBill() {
		try {
			clickElementJS(configurationDropDown);
			clickElementJS(aapCrossEntityBill);
			clickElementJS(contextDropDown);
			clickElement(expandAllIcon);
			clickElementJS(contextValue);
			return aapCrossEntityBillLabel.getText();
		} catch (Exception e) {
			LoggerManager.error("Error in aapCrossEntityBill method" + e.getMessage());
			throw e;
		}
	}

	public String aapWorkFlowAutoAction() {
		try {
			clickElementJS(configurationDropDown);
			clickElementJS(aapWorkFlowAutoAction);
			context();
			return aapWorkFlowAutoActionLabel.getText();
		} catch (Exception e) {
			LoggerManager.error("Error in aapWorkFlowAutoAction method" + e.getMessage());
			throw e;
		}
	}

	public String aapWorkFlowCheckList() {
		try {
			clickElementJS(configurationDropDown);
			clickElementJS(aapWorkFlowCheckList);
			context();
			return aapWorkFlowCheckListLabel.getText();
		} catch (Exception e) {
			LoggerManager.error("Error in aapWorkFlowCheckList method" + e.getMessage());
			throw e;
		}
	}

	public String aarBillingTypes() {
		try {
			clickElementJS(configurationDropDown);
			clickElementJS(aarBillingTypes);
			context();
			return aarBillingTypesLabel.getText();
		} catch (Exception e) {
			LoggerManager.error("Error in aarBillingTypes method" + e.getMessage());
			throw e;
		}
	}

	public String aarBuilderStatements() {
		try {
			clickElementJS(configurationDropDown);
			clickElementJS(aarBuilderStatements);
			context();
			return aarBuilderStatementsLabel.getText();
		} catch (Exception e) {
			LoggerManager.error("Error in aarBuilderStatements method" + e.getMessage());
			throw e;
		}
	}

	public String aarMiscInvoiceTypes() {
		try {
			clickElementJS(configurationDropDown);
			clickElementJS(aarMiscInvoiceTypes);
			context();
			return aarMiscInvoiceTypesLabel.getText();
		} catch (Exception e) {
			LoggerManager.error("Error in aarMiscInvoiceTypes method" + e.getMessage());
			throw e;
		}
	}

	public String aarPaymentApplicationOrder() {
		try {
			clickElementJS(configurationDropDown);
			clickElementJS(aarPaymentApplicationOrder);
			context();
			return aarPaymentApplicationOrderLabel.getText();
		} catch (Exception e) {
			LoggerManager.error("Error in aarPaymentApplicationOrder method" + e.getMessage());
			throw e;
		}
	}

	public String aarStatements() {
		try {
			clickElementJS(configurationDropDown);
			clickElementJS(aarStatements);
			context();
			return aarStatementsLabel.getText();
		} catch (Exception e) {
			LoggerManager.error("Error in aarStatements method" + e.getMessage());
			throw e;
		}
	}

	public String collectionsConfiguration() {
		try {
			clickElementJS(configurationDropDown);
			clickElementJS(collectionsConfiguration);
			context();
			return collectionsConfigurationLabel.getText();
		} catch (Exception e) {
			LoggerManager.error("Error in collectionsConfiguration method" + e.getMessage());
			throw e;
		}
	}
}
