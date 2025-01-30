package com.ciranet.configurations.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;
import com.ciranet.navigation.Navigation;
import com.ciranet.utilities.LoggerManager;

public class ClosingPortalPage extends BasePage {
	public ClosingPortalPage(WebDriver driver) {
		super(driver);
	}

	// Page elements
	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Configurations')]")
	WebElement configurationsSideNav;

	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement pageTitle;

	@FindBy(xpath = "//div//span[normalize-space()='Closing Portal']")
	WebElement closingPortalSideNav;

	@FindBy(xpath = "//div[@class='dx-dropdowneditor-icon']")
	WebElement configurationDropdown;

	@FindBy(xpath = "//span[normalize-space()='Account Inquiry Fulfillment']")
	WebElement accountInquiryFulfillment;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[2]")
	WebElement contextDropdown;

	@FindBy(xpath = "(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	WebElement contextDropdownValue;

	@FindBy(xpath = "//span[normalize-space()='Refresh']")
	WebElement refreshButton;

	@FindBy(xpath = "//span[normalize-space()='CiraConnect Fee']")
	WebElement ciraConnectFee;

	@FindBy(xpath = "//span[normalize-space()='Closing Portal Delivery Tiers']")
	WebElement closingPortalDeliveryTiers;

	@FindBy(xpath = "//span[normalize-space()='Portal Configuration Fees & Charges']")
	WebElement portalConfigurationFeesCharges;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	Navigation navigationSearch = new Navigation(driver);

	private void closingPortalActions() {
		refreshButton.click();
		LoggerManager.debug("Performed closing Portal actions");
	}

	public boolean navigate() {
		try {
			navigationSearch.navigateBySideNavigation(By.xpath("//div//span[normalize-space()='Configurations']"),
					"Configurations");
			waitForInvisibility(loaderIcon);
			clickElementJS(configurationsSideNav);
			waitForInvisibility(loaderIcon);
			scrollToElement(closingPortalSideNav);
			clickElementJS(closingPortalSideNav);
			waitForInvisibility(loaderIcon);

			LoggerManager.info("Successfully searched for the navigation and accessed  Community Configurations");

			boolean isPageTitle = pageTitle.getText().equals("Closing Portal Configurations");
			LoggerManager.info("Page Title validation: " + (isPageTitle ? "Passed" : "Failed"));
			waitForInvisibility(loaderIcon);
			return isPageTitle;
		} catch (Exception e) {
			LoggerManager.error("An error occurred during the navigation search process");
			return false;

		}
	}

	public String selectConfigurationDropdown(String strDropdownValue) {
		try {
			clickElement(configurationDropdown);

			switch (strDropdownValue) {
			case "Account Inquiry Fulfillment":
				clickElement(accountInquiryFulfillment);
				break;
			case "CiraConnect Fee":
				clickElementJS(ciraConnectFee);
				break;
			case "Closing Portal Delivery Tiers":
				clickElement(closingPortalDeliveryTiers);
				break;
			case "Portal Configuration Fees & Charges":
				clickElement(portalConfigurationFeesCharges);
				break;
			default:
				LoggerManager.warn("Dropdown value '" + strDropdownValue + "' does not match any case.");
				break;
			}

			LoggerManager.debug("Dropdown selection on Closing Portal page");
			clickElementJS(contextDropdown);
			clickElementJS(contextDropdownValue);
			closingPortalActions();

			return strDropdownValue;
		} catch (Exception e) {
			LoggerManager.error("Error occurred while selecting Closing Portal Config dropdowns" + e.getMessage());
			throw e;
		}
	}
}
