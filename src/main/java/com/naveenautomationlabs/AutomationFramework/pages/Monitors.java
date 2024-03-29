package com.naveenautomationlabs.AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class Monitors extends TestBase {

	public Monitors() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#content > h2")
	private WebElement monitorsText;

	@FindBy(css = "#content > div:nth-child(5) > div:nth-child(1) > div > div:nth-child(2) > div.button-group > button:nth-child(1) > span")
	private WebElement addToCartBtn;

	public String getMonitorText() {
		return monitorsText.getText();
	}

	public AppleCinema30 clickAddToCartBtn() {
		addToCartBtn.click();
		return new AppleCinema30();
	}

}