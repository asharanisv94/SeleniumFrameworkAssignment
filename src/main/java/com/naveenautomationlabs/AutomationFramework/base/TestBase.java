package com.naveenautomationlabs.AutomationFramework.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver wd;
	FileInputStream fileInputStream;
	Properties prop;

	public TestBase() {
		prop = new Properties();
		try {
			fileInputStream = new FileInputStream(
					"C:\\Users\\asha\\eclipse-workspace\\AutomationFrameworkLearning\\src\\main\\java\\com\\naveenautomationlabs\\AutomationFramework\\Config\\Config.properties");
			prop.load(fileInputStream);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		catch (IOException e1) {

			e1.printStackTrace();

		}
	}

	public void initialisation() {
		String browserName = prop.getProperty("browser");

		switch (browserName) {
		case "Chrome":
			wd = WebDriverManager.chromedriver().create();
			break;
		case "Edge":
			wd = WebDriverManager.edgedriver().create();
			break;
		case "FireFox":
			wd = WebDriverManager.firefoxdriver().create();
			break;
		default:
			System.out.println("Not a valid browser");
			break;
		}
		wd.get(prop.getProperty("URL"));
		wd.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("IMPLICIT_WAIT")), TimeUnit.SECONDS);
		wd.manage().window().maximize();
	}

	public void tearDown() {
		wd.quit();

	}
}
