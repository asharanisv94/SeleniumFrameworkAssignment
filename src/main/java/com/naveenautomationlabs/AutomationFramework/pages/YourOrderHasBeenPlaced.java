package com.naveenautomationlabs.AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class YourOrderHasBeenPlaced extends TestBase {

	public YourOrderHasBeenPlaced() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#content > h1")
	private WebElement yourOrderHasBeenPlaced;

	public String getYourOrderHasBeenPlaced() {
		return yourOrderHasBeenPlaced.getText();
	}

}