package com.automation.training.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    private WebDriver driver;

    public Browser(String browser) {
		switch (browser) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver","C:\\driver_firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\driver_chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		default:
			break;
		}
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
    

}
