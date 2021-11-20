package com.revature.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.pages.WikiMain;

public class PomPlayground {
	
	public static void main(String[] args) {
		
		String driverPath = "C:/Users/RyanSchlientz/Documents/TrainingBatches/2106-java-msa-reston/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		WikiMain wikiMain = new WikiMain(driver);
		
		String url = "http://www.wikipedia.org/";
		driver.get(url);
		
//		wikiMain.english.click();
		wikiMain.clickEnglish();
		
		driver.get(url);
		wikiMain.clickJapanese();
		
		driver.get(url);
		wikiMain.clickSpanish();
		
		driver.get(url);
		wikiMain.clickGerman();
		
		driver.get(url);
		wikiMain.clickRussian();
		
		driver.get(url);
		wikiMain.clickFrench();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
