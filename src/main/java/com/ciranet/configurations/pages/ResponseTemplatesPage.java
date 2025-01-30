package com.ciranet.configurations.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;
import com.ciranet.navigation.Navigation;
import com.ciranet.utilities.LoggerManager;

public class ResponseTemplatesPage extends BasePage 
{
	public ResponseTemplatesPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Response Templates')]")
	WebElement responseTemplatesSideNav;

	@FindBy(xpath = "//div[@class='dx-dropdowneditor-icon']")
	WebElement contextDropdown;

	@FindBy(xpath = "//div[normalize-space()='RealManage']")
	WebElement contextValue;

	@FindBy(xpath = "(//div[@class='dx-texteditor-buttons-container'])[4]")
	WebElement templateDropdown;

	@FindBy(xpath = "(//div[@class='config-tree-menu-item'])[1]")
	WebElement templateDropdownValue;

	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),'Response Templates Configurations')]")
	WebElement pageTitle;
	
	@FindBy(xpath = "//dx-toolbar[@class='dx-toolbar dx-widget dx-theme-border-color-as-background-color dx-visibility-change-handler dx-collection']//div[@class='dx-toolbar-items-container']")
	WebElement templateLabel;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;
	
	Navigation navigationSearch = new Navigation(driver);

	public boolean navigate() {
		try {
			navigationSearch.navigateBySideNavigation(
					By.xpath("//div[@class='header-text']//span[contains(text(),'Response Templates')]"),
					"Response Templates");
			LoggerManager.info("Scrolling to Response Templates navigation");
			scrollToElement(responseTemplatesSideNav);

			if (isElementDisplayed(responseTemplatesSideNav)) {
				LoggerManager.info("Response Templates is visible, clicking on it");
				clickElementJS(responseTemplatesSideNav);

				waitForInvisibility(loaderIcon);

				LoggerManager.info("Successfully searched for the navigation and accessed Response Templates");

				boolean isPageTitle = pageTitle.getText().equals("Response Templates Configurations");
				LoggerManager.info("Page Title validation: " + (isPageTitle ? "Passed" : "Failed"));
				return isPageTitle;
			} else {
				LoggerManager.warn("Response Templates is not visible, search failed");
				return false;
			}
		} catch (Exception e) {
			LoggerManager.error("An error occurred during the navigation search process");
			return false;
		}
	}
	
	 public boolean responseTemplateSelection() {
        try {
            clickElement(contextDropdown);
            clickElement(contextValue);
            clickElement(templateDropdown);
            clickElement(templateDropdownValue);
            return isElementDisplayed(templateLabel);
        } catch (Exception e) {
            LoggerManager.error("An error occurred while verifying the response template selection." + e.getMessage());
            throw e;
        }
    }
}
