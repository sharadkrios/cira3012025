package com.ciranet.configurations.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;
import com.ciranet.navigation.Navigation;
import com.ciranet.utilities.LoggerManager;

public class EnforcementPage extends BasePage {

	public EnforcementPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='tree-item-template']//span[contains(text(),'Enforcement')]")
	WebElement enforcementSideNav;

	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement pageTitle;

	@FindBy(xpath = "//div[@class='dx-dropdowneditor-icon']")
	WebElement configurationDropdown;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-input-wrapper'])[2]")
	WebElement context;

	@FindBy(xpath = "(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	WebElement contextValue; 

	@FindBy(xpath = "//div[@title='Expand All']")
	WebElement expandAllIcon;

	@FindBy(xpath = "//div[@class='dx-item dx-menu-item']//span[contains(text(),'Architectural Categories')]")
	WebElement architecturalCategories;

	@FindBy(xpath = "//div[@class='dx-item dx-menu-item']//span[contains(text(),'Architectural Forms and Guides')]")
	WebElement architecturalFormsandGuides;

	@FindBy(xpath = "//div[@class='dx-item dx-menu-item']//span[contains(text(),' Violation Category / SubCategory Configuration ')]")
	WebElement violationCategorySubCategoryConfiguration;

	@FindBy(xpath = "//div[@class='dx-item dx-menu-item']//span[contains(text(),'Violation Escalation Configuration')]")
	WebElement violationEscalationConfiguration;

	@FindBy(xpath = "//div[@class='dx-item dx-menu-item']//span[contains(text(),' Violation Notification Templates ')]")
	WebElement violationNotificationTemplates;

	@FindBy(xpath = "//div[@class='dx-item dx-menu-item']//span[contains(text(),'Violation Restriction Definition')]")
	WebElement violationRestrictionDefinition;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Architectural Categories - Global')]")
	WebElement labelArchitecturalCategories;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Architectural Forms and Guides - Global')]")
	WebElement labelArchitecturalFormsandGuides;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Violation Category / SubCategory Configuration - Global')]")
	WebElement labelViolationCategorySubCategoryConfiguration;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Violation Escalation Configuration - Global')]")
	WebElement labelViolationEscalationConfiguration;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Violation Notification Templates - Global')]")
	WebElement labelViolationNotificationTemplates;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Violation Restriction Definition - 1920 E. Maryland Place Townhomes, Inc.')]")
	WebElement labelViolationRestrictionDefinition;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	Navigation navigationSearch = new Navigation(driver);

	public boolean navigate() {
		try {
			navigationSearch.navigateBySideNavigation(
					By.xpath("//div[@class='tree-item-template']//span[contains(text(),'Enforcement')]"),
					"Enforcement");
			LoggerManager.info("Scrolling to Enforcement navigation");
			scrollToElement(enforcementSideNav);

			if (isElementDisplayed(enforcementSideNav)) {
				LoggerManager.info("Enforcement is visible, clicking on it");
				clickElementJS(enforcementSideNav);

				waitForInvisibility(loaderIcon);

				LoggerManager.info("Successfully searched for the navigation and accessed Enforcement");

				boolean isPageTitle = pageTitle.getText().equals("Enforcement Configurations");
				LoggerManager.info("Page Title validation: " + (isPageTitle ? "Passed" : "Failed"));
				return isPageTitle;

			} else {
				LoggerManager.warn("Enforcement is not visible, search failed");
				return false;
			}

		} catch (Exception e) {
			LoggerManager.error("An error occurred during the navigation search process");
			return false;
		}
	}

	public void context() {
		try {
			waitForElementToBeClickable(context);
			clickElement(context);
			clickElementJS(contextValue);
		} catch (Exception e) {
			LoggerManager.error("Error in context method: {}" + e.getMessage());
			throw e;
		}
	}

	public String architecturalCategories() {
		try {
			clickElement(configurationDropdown);
			clickElementJS(architecturalCategories);
			context();
			return labelArchitecturalCategories.getText();
		} catch (Exception e) {
			LoggerManager.error("Error in architecturalCategories method: {}" + e.getMessage());
			throw e;
		}
	}

	public String architecturalFormsandGuides() {
		try {
			clickElement(configurationDropdown);
			clickElementJS(architecturalFormsandGuides);
			context();
			return labelArchitecturalFormsandGuides.getText();
		} catch (Exception e) {
			LoggerManager.error("Error in architecturalFormsandGuides method: {}" + e.getMessage());
			throw e;
		}
	}

	public String violationCategorySubCategoryConfiguration() {
		try {
			clickElement(configurationDropdown);
			clickElementJS(violationCategorySubCategoryConfiguration);
			context();
			return labelViolationCategorySubCategoryConfiguration.getText();
		} catch (Exception e) {
			LoggerManager.error("Error in violationCategorySubCategoryConfiguration method: {}" + e.getMessage());
			throw e;
		}
	}

	public String violationEscalationConfiguration() {
		try {
			clickElement(configurationDropdown);
			clickElementJS(violationEscalationConfiguration);
			context();
			return labelViolationEscalationConfiguration.getText();
		} catch (Exception e) {
			LoggerManager.error("Error in violationEscalationConfiguration method: {}" + e.getMessage());
			throw e;
		}
	}

	public String violationNotificationTemplates() {
		try {
			clickElement(configurationDropdown);
			clickElementJS(violationNotificationTemplates);
			context();
			return labelViolationNotificationTemplates.getText();
		} catch (Exception e) {
			LoggerManager.error("Error in violationNotificationTemplates method: {}" + e.getMessage());
			throw e;
		}
	}

	public String violationRestrictionDefinition() {
		try {
			clickElement(configurationDropdown);
			clickElementJS(violationRestrictionDefinition);
			waitForElementToBeClickable(context);
			clickElement(context);
			clickElementJS(expandAllIcon);
			clickElement(contextValue);
			return labelViolationRestrictionDefinition.getText();
		} catch (Exception e) {
			LoggerManager.error("Error in violationRestrictionDefinition method: {}" + e.getMessage());
			throw e;
		}
	}
}