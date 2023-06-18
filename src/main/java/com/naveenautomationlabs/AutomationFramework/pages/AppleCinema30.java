package com.naveenautomationlabs.AutomationFramework.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class AppleCinema30 extends TestBase {

	public AppleCinema30() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#input-option218 > div:nth-child(2) > label")
	private WebElement mediumRadioBtn;

	@FindBy(css = "#input-option223 > div:nth-child(1) > label")
	private WebElement checkBox2Btn;

	@FindBy(id = "input-option208")
	private WebElement textField;

	@FindBy(id = "input-option217")
	private WebElement selectColorField;

	@FindBy(id = "input-option209")
	private WebElement textAreaField;

	@FindBy(id = "input-option222")
	private WebElement uploadFileBtn;

	@FindBy(id = "input-option221")
	private WebElement timeField;

	@FindBy(id = "input-option220")
	private WebElement dateAndTimeField;

	@FindBy(css = "#input-quantity")
	private WebElement qtyField;

	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCart;

	@FindBy(xpath = "//div[text()='Success: You have added ']")
	private WebElement successMsg;

	@FindBy(xpath = "//a[text()='shopping cart']")
	private WebElement shoppingCartLink;

	public AppleCinema30 clickMediumRadioBtn() {
		mediumRadioBtn.click();
		return new AppleCinema30();
	}

	public AppleCinema30 clickcheckBox2Btn() {
		checkBox2Btn.click();
		return new AppleCinema30();
	}

	public void enterTextField() {
		textField.sendKeys("TEST new");
	}

	public void SelectColorField() {
		Select sc = new Select(selectColorField);
		sc.selectByValue("4");

	}

	public void enterTextAreaField() {
		textAreaField.sendKeys("TEST Area sample data");
	}

	public void uploadFile() throws AWTException {

		uploadFileBtn.click();
//		uploadFileBtn.sendKeys("C:\\Users\\asha\\Desktop\\automaion.txt");

	}

	public void validateSimpleAlert() throws InterruptedException {

		wd.switchTo().alert().accept();

	}

	public AppleCinema30 clickAddToCart() {
		addToCart.click();
		return new AppleCinema30();
	}

	public void getSuccessBannerText() {
		successMsg.getText();
	}

	public ShoppingCart clickShoppingCartLink() {
		shoppingCartLink.click();
		return new ShoppingCart();
	}

}
