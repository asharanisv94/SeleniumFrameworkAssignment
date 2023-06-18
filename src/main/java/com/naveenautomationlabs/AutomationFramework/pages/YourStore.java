package com.naveenautomationlabs.AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class YourStore extends TestBase {

	public YourStore() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(3) > a")
	private WebElement componentBtn;

	@FindBy(css = "#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li.dropdown.open > div > div > ul > li:nth-child(2) > a")
	private WebElement monitorsBtn;

	public YourStore clickComponentBtn() {
		componentBtn.click();
		return new YourStore();
	}

	public Monitors clickMonitorsBtn() {
		monitorsBtn.click();
		return new Monitors();
	}
}