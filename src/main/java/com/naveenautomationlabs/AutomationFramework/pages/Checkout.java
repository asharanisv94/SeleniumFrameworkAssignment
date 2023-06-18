package com.naveenautomationlabs.AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class Checkout extends TestBase {

	public Checkout() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#input-email")
	private WebElement emailInputField;

	@FindBy(css = "#input-password")
	private WebElement passwordInputField;

	@FindBy(css = "input[value = 'Login']")
	private WebElement loginBtn;

	@FindBy(css = "#input-payment-firstname")
	private WebElement firstnameInputField;

	@FindBy(css = "#input-payment-lastname")
	private WebElement lastnameInputField;

	@FindBy(css = "#input-payment-company")
	private WebElement companyInputField;

	@FindBy(css = "#input-payment-address-1")
	private WebElement address1InputField;

	@FindBy(css = "#input-payment-address-2")
	private WebElement address2InputField;

	@FindBy(css = "#input-payment-city")
	private WebElement cityInputField;

	@FindBy(css = "#input-payment-postcode")
	private WebElement postcodeInputField;

	@FindBy(css = "#input-payment-country")
	private WebElement selectCountryField;

	@FindBy(css = "#input-payment-zone")
	private WebElement regionInputField;

	@FindBy(css = "input[value='Continue']")
	private WebElement continueBtn;

	@FindBy(css = "select[name='address_id']")
	private WebElement billingDetailsField;

	@FindBy(css = "input#button-payment-address")
	private WebElement billingContinueBtn;

	@FindBy(css = "input[name='payment_address' ][value='existing']")
	private WebElement billingAddressExistingAddressRadioBtn;

	@FindBy(css = "#payment-existing > select']")
	private WebElement deliveryDetailsField;

	@FindBy(css = "input[name='shipping_address'][value='existing']")
	private WebElement deliveryDetailsExistingAddressRadioBtn;

	@FindBy(css = "input[id='button-shipping-address']")
	private WebElement deliveryContinueBtn;

	@FindBy(css = "textarea[name='comment']")
	private WebElement deliveryMethodTextField;

	@FindBy(css = "input[name='shipping_method']")
	private WebElement deliveryMethodRateRadioBtn;

	@FindBy(css = "input#button-shipping-method")
	private WebElement deliveryMethodContinueBtn;

	@FindBy(css = "#collapse-payment-method > div > p:nth-child(4) > textarea")
	private WebElement cashOnDeliveryTextField;

	@FindBy(css = "input[name='agree']")
	private WebElement policyCheckBoxBtn;

	@FindBy(css = "input[id='button-payment-method']")
	private WebElement paymentMethodContinueBtn;

	@FindBy(css = "input[id='button-confirm']")
	private WebElement confirmOrderContinueBtn;

	public void enterEmail() {
		emailInputField.sendKeys("xyz8@gmail.com");
	}

	public void enterPassword() {
		passwordInputField.sendKeys("password2");
	}

	public Checkout clickLoginBtn() {
		loginBtn.click();
		return new Checkout();
	}

	public void enterFirstname() {
		firstnameInputField.sendKeys("anu");
	}

	public void enterLastname() {
		lastnameInputField.sendKeys("john");
	}

	public void enterCompanyInput() {
		companyInputField.sendKeys("xxx");
	}

	public void enterAddress1Input() {
		address1InputField.sendKeys("abc");
	}

	public void enterAddress2Input() {
		address2InputField.sendKeys("def");
	}

	public void enterCity() {
		cityInputField.sendKeys("brampton");
	}

	public void enterPostcode() {
		postcodeInputField.sendKeys("ON");
	}

	public void SelectCountryField() {
		Select sc = new Select(selectCountryField);
		sc.selectByVisibleText("China");
	}

	public void SelectRegionField() {
		Select sc = new Select(regionInputField);
		sc.selectByVisibleText("Henan");
	}

	public Checkout clickContinueBtn() {
		continueBtn.click();
		return new Checkout();
	}

	public Checkout clickBillingContinueBtn() {
		billingContinueBtn.click();
		return new Checkout();
	}

	public Checkout clickDeliveryContinueBtn() {
		deliveryContinueBtn.click();
		return new Checkout();
	}

	public Checkout clickDeliveryMethodContinueBtn() {
		deliveryMethodContinueBtn.click();
		return new Checkout();
	}

	public Checkout clickPolicyCheckBoxBtn() {
		policyCheckBoxBtn.click();
		return new Checkout();
	}

	public Checkout clickPaymentMethodContinueBtn() {
		paymentMethodContinueBtn.click();
		return new Checkout();
	}

	public Checkout sendDeliveryMethodTextField() {
		deliveryMethodTextField.sendKeys("Delivery comments");
		return new Checkout();
	}

	public void sendPaymentTextField() {
		cashOnDeliveryTextField.sendKeys("Payment comments");
		
	}
	
	
	public Checkout clickbillingAddressExistingAddressRadioBtn() {
		billingAddressExistingAddressRadioBtn.click();
		return new Checkout();
	}


	public YourOrderHasBeenPlaced clickConfirmOrderContinueBtn() {
		confirmOrderContinueBtn.click();
		return new YourOrderHasBeenPlaced();
	}

}
