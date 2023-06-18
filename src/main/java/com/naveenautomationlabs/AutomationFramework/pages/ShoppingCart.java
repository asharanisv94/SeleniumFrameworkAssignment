package com.naveenautomationlabs.AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class ShoppingCart extends TestBase {

	public ShoppingCart() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath = "//a[text()='Checkout']")
	private WebElement checkOutBtn;

	public Checkout clickCheckOutBtn() {
		checkOutBtn.click();
		return new Checkout();
	}
}
