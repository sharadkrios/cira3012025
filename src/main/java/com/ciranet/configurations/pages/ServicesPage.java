package com.ciranet.configurations.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;
import com.ciranet.navigation.Navigation;
import com.ciranet.utilities.LoggerManager;

public class ServicesPage extends BasePage 
{
	public ServicesPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "//span[text()=' Services ']")
	WebElement servicesSideNav;
	
	@FindBy(xpath="//h2[@class='page-header']")
	WebElement pageTitle;

	@FindBy(xpath = "(//div[@class='dx-texteditor-buttons-container'])[2]")
	WebElement configurationDropdown;

	@FindBy(xpath = "//span[contains(text(),'Board Portal')]")
	WebElement boardPortal;

	@FindBy(xpath = "(//div[@class='dx-texteditor-buttons-container'])[4]")
	WebElement contextDropdown;

	@FindBy(xpath = "//div[contains(text(),'Global')]")
	WebElement contextDropdownValue;
	
	@FindBy(xpath = "//div[@class='dx-switch-on']")
	WebElement onToggle;
	
	@FindBy(xpath = "//span[normalize-space()='Branding Configuration']")
	WebElement brandingConfiguration;

	@FindBy(xpath = "//span[normalize-space()='Business Hours']")
	WebElement businessHours;

	@FindBy(xpath = "//span[normalize-space()='Calendar Configuration']")
	WebElement calendarConfiguration;

	@FindBy(xpath = "//span[contains(text(),'Mass Communication System Template')]")
	WebElement massCommunicationSystemTemplate;

	@FindBy(xpath = "//span[normalize-space()='Resident Portal']")
	WebElement residentPortal;

	@FindBy(xpath = "//span[normalize-space()='Service Groups']")
	WebElement serviceGroups;

	@FindBy(xpath = "//span[normalize-space()='Service Roles']")
	WebElement serviceRoles;

	@FindBy(xpath = "//div[@class='config-tree-menu-item']//span[contains(text(),'Services')]")
	WebElement services;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Board Portal - Global')]")
	WebElement boardPortalLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Branding Configuration - Global')]")
	WebElement brandingConfigurationLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Business Hours - Global')]")
	WebElement bussinessHourLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Calendar Configuration - Global')]")
	WebElement calendarConfigurationLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Mass Communication System Template - Global')]")
	WebElement massCommunicationSystemConfigurationLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Resident Portal - Global')]")
	WebElement residentPortalLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Service Groups - Global')]")
	WebElement serviceGroupsLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Service Roles - Global')]")
	WebElement serviceRolesLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Services - Global')]")
	WebElement servicesLabel;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;
	
	Navigation navigationSearch = new Navigation(driver);
	
	public boolean navigate() {
		try {
			navigationSearch.navigateBySideNavigation(
					By.xpath("//span[text()=' Services ']"),
					"Services");
			LoggerManager.info("Scrolling to Services navigation");
			scrollToElement(servicesSideNav);
			waitForInvisibility(loaderIcon);
			if (isElementDisplayed(servicesSideNav)) {
				LoggerManager.info("Services is visible, clicking on it");
				clickElementJS(servicesSideNav);

				waitForInvisibility(loaderIcon);

				LoggerManager.info("Successfully searched for the navigation and accessed Services");

				boolean isPageTitle = pageTitle.getText().equals("Services Configurations");
				LoggerManager.info("Page Title validation: " + (isPageTitle ? "Passed" : "Failed"));
				return isPageTitle;

			} else {
				LoggerManager.warn("Services is not visible, search failed");
				return false;
			}

		} catch (Exception e) {
			LoggerManager.error("An error occurred during the navigation search process");
			return false;
		}
	}
	
	public void terminatedToggle() {
		try {
			if (isElementDisplayed(onToggle)) {
				clickElementJS(onToggle);
			}
		}catch (Exception e) {
        	LoggerManager.error("Error in toggle: " + e.getMessage());
            throw e;
        }
	}
	
	public void context() {
		try {
			clickElementJS(contextDropdown);
			clickElementJS(contextDropdownValue);
		}catch (Exception e) {
        	LoggerManager.error("Error in context: " + e.getMessage());
            throw e;
        }
	}
	
	public String boardPortal() {
        try {
            clickElement(configurationDropdown);
            clickElementJS(boardPortal);
            terminatedToggle();
            context();
            return boardPortalLabel.getText();
        } catch (Exception e) {
        	LoggerManager.error("Error in boardPortal: " + e.getMessage());
            throw e;
        }
    }

    public String brandingConfiguration() {
        try {
            clickElementJS(configurationDropdown);
            clickElementJS(brandingConfiguration);
            terminatedToggle();
            context();
            return brandingConfigurationLabel.getText();
        } catch (Exception e) {
        	LoggerManager.error("Error in brandingConfiguration: " + e.getMessage());
        	throw e;
        }
    }

    public String bussinessHour() {
        try {
            clickElement(configurationDropdown);
            clickElementJS(businessHours);
            context();
            return bussinessHourLabel.getText();
        } catch (Exception e) {
        	LoggerManager.error("Error in bussinessHour: " + e.getMessage());
        	throw e;
        }
    }

    public String calendarConfiguration() {
        try {
            clickElement(configurationDropdown);
            clickElementJS(calendarConfiguration);
            waitForInvisibility(loaderIcon);
            context();
            return calendarConfigurationLabel.getText();
        } catch (Exception e) {
        	LoggerManager.error("Error in calendarConfiguration: " + e.getMessage());
        	throw e;
        }
    }

    public String massCommunicationSystemTemplate() {
        try {
            clickElement(configurationDropdown);
            clickElementJS(massCommunicationSystemTemplate);
            context();
            return massCommunicationSystemConfigurationLabel.getText();
        } catch (Exception e) {
        	LoggerManager.error("Error in massCommunicationSystemTemplate: " + e.getMessage());
        	throw e;
        }
    }

    public String residentPortal() {
        try {
            clickElementJS(configurationDropdown);
            clickElementJS(residentPortal);
            terminatedToggle();
            context();
            return residentPortalLabel.getText();
        } catch (Exception e) {
        	LoggerManager.error("Error in residentPortal: " + e.getMessage());
        	throw e;
        }
    }

    public String serviceGroups() {
        try {
            clickElementJS(configurationDropdown);
            clickElementJS(serviceGroups);
            terminatedToggle();
            context();
            return serviceGroupsLabel.getText();
        } catch (Exception e) {
        	LoggerManager.error("Error in serviceGroup: " + e.getMessage());
        	throw e;
        }
    }

    public String serviceRoles() {
        try {
            clickElementJS(configurationDropdown);
            clickElementJS(serviceRoles);
            terminatedToggle();
            context();
            return serviceRolesLabel.getText();
        } catch (Exception e) {
        	LoggerManager.error("Error in serviceRole: " + e.getMessage());
        	throw e;
        }
    }

    public String services() {
        try {
            clickElementJS(configurationDropdown);
            clickElementJS(services);
            terminatedToggle();
            context();
            return servicesLabel.getText();
        } catch (Exception e) {
        	LoggerManager.error("Error in services: " + e.getMessage());
        	throw e;
        }
    }
}