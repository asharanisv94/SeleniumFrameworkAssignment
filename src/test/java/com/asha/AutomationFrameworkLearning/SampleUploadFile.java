package com.asha.AutomationFrameworkLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SampleUploadFile {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\ChromeDriver\\ChromeDriver.exe");
		 String baseUrl = "https://demo.guru99.com/test/upload/";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));


        uploadElement.sendKeys("C:\\Users\\asha\\Desktop\\automaion.txt");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        }
}