package com.revature.runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.pages.TuitionMain;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "com.revature.steps")
public class TuitionRunner {
	
	public static WebDriver driver;
	public static TuitionMain tuitionMain;
	
	@BeforeClass
	public static void setUp() {
		String path = "C:/Sts_Workspace/ChromeDriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		driver = new ChromeDriver();
		tuitionMain = new TuitionMain(driver);
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

}
