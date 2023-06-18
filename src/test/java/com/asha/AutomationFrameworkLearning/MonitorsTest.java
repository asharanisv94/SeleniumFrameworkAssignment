package com.asha.AutomationFrameworkLearning;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;
import com.naveenautomationlabs.AutomationFramework.pages.Monitors;
import com.naveenautomationlabs.AutomationFramework.pages.YourStore;

public class MonitorsTest extends TestBase {

	YourStore yourStore;
	Monitors monitors;
	

	@BeforeMethod
	public void setUp() {
		initialisation();
		yourStore = new YourStore();
		monitors= new Monitors();
	}

	@Test
	public void navigateToMonitorsPage() {
		yourStore.clickComponentBtn();
		monitors=yourStore.clickMonitorsBtn();
	
		Assert.assertEquals(monitors.getMonitorText(), "Monitors");
	}

	@AfterMethod
	public void quit() {
		tearDown();
	}

}