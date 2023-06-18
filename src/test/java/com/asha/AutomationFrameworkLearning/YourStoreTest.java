package com.asha.AutomationFrameworkLearning;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;
import com.naveenautomationlabs.AutomationFramework.pages.AppleCinema30;
import com.naveenautomationlabs.AutomationFramework.pages.Checkout;
import com.naveenautomationlabs.AutomationFramework.pages.Monitors;
import com.naveenautomationlabs.AutomationFramework.pages.ShoppingCart;
import com.naveenautomationlabs.AutomationFramework.pages.YourOrderHasBeenPlaced;
import com.naveenautomationlabs.AutomationFramework.pages.YourStore;

public class YourStoreTest extends TestBase {

	YourStore yourStore;
	Monitors monitors;
	AppleCinema30 appleCinema30;
	ShoppingCart shoppingCart;
	Checkout checkout;
	YourOrderHasBeenPlaced yourOrderHasBeenPlaced;

	@BeforeMethod
	public void setUp() {
		initialisation();
		yourStore = new YourStore();
		monitors = new Monitors();
		appleCinema30 = new AppleCinema30();
		shoppingCart = new ShoppingCart();
		checkout = new Checkout();
		yourOrderHasBeenPlaced = new YourOrderHasBeenPlaced();
	}

	@Test
	public void validateSuccessShopping() throws InterruptedException, AWTException {
		yourStore.clickComponentBtn();

		monitors = yourStore.clickMonitorsBtn();

		Assert.assertEquals(monitors.getMonitorText(), "Monitors");

		appleCinema30 = monitors.clickAddToCartBtn();
		appleCinema30.clickMediumRadioBtn();
		appleCinema30.clickcheckBox2Btn();
		appleCinema30.enterTextField();
		appleCinema30.enterTextAreaField();
		appleCinema30.SelectColorField();
		Thread.sleep(10000);
	//  appleCinema30.uploadFile();
		appleCinema30.validateSimpleAlert();

		appleCinema30.clickAddToCart();
		appleCinema30.getSuccessBannerText();
		Thread.sleep(2000); // wait required
		shoppingCart = appleCinema30.clickShoppingCartLink();
		checkout = shoppingCart.clickCheckOutBtn();
		checkout.enterEmail();
		checkout.enterPassword();
		checkout.clickLoginBtn();

		checkout.enterFirstname();
		checkout.enterLastname();
		checkout.enterAddress1Input();
		checkout.enterAddress2Input();
		checkout.enterCompanyInput();
		checkout.enterCity();
		checkout.enterPostcode();
		checkout.SelectCountryField();
		checkout.SelectRegionField();
		checkout.clickContinueBtn();

		checkout.clickBillingContinueBtn();
		checkout.clickbillingAddressExistingAddressRadioBtn();
		Thread.sleep(2000);
		checkout.clickDeliveryContinueBtn();
		checkout.sendDeliveryMethodTextField();
		checkout.clickDeliveryMethodContinueBtn();
		checkout.sendPaymentTextField();
		checkout.clickPolicyCheckBoxBtn();
		checkout.clickPaymentMethodContinueBtn();

		yourOrderHasBeenPlaced = checkout.clickConfirmOrderContinueBtn();
		Thread.sleep(2000); //wait required
		Assert.assertEquals(yourOrderHasBeenPlaced.getYourOrderHasBeenPlaced(), "Your order has been placed!",
				"Invalid page");

	}

	@AfterMethod
	public void quit() {
		tearDown();
	}

}