package com.Mobiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserInit {
	public static WebDriver driver=null;
	@BeforeSuite
	public void initBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	@AfterSuite
	public void close_Browser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
