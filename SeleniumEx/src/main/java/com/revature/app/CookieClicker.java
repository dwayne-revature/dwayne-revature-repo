package com.revature.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieClicker {
	
	public static void main(String[] args) {
		
		String driverPath = "C:/Users/RyanSchlientz/Documents/TrainingBatches/2106-java-msa-reston/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://orteil.dashnet.org/cookieclicker/");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		WebElement cookie = driver.findElement(By.id("bigCookie"));
		WebElement currentUpgrade = driver.findElement(By.xpath("//*[@id=\"product0\"]"));
		WebElement nextUpgrade = driver.findElement(By.xpath("//*[@id=\"product1\"]"));
		WebElement currentPrice = driver.findElement(By.xpath("//*[@id=\"productPrice0\"]"));
		WebElement nextPrice = driver.findElement(By.xpath("//*[@id=\"productPrice1\"]"));

		int next = 1;
		WebElement nextAmount = driver.findElement(By.xpath("//*[@id=\"productOwned" + next + "\"]"));

		for (int j = 0; j < 40; j++) {
			cookie.click();	
		}
		currentUpgrade.click();

		while (true) {

			for (int j = 0; j < 100; j++) {
				cookie.click();
			}

			nextUpgrade.click();
			if (!nextAmount.getText().equals("")) {
				currentUpgrade = driver.findElement(By.xpath("//*[@id=\"product" + next + "\"]"));
				currentPrice = driver.findElement(By.xpath("//*[@id=\"productPrice" + next + "\"]"));
				next++;
				nextUpgrade = driver.findElement(By.xpath("//*[@id=\"product" + next + "\"]"));
				nextAmount = driver.findElement(By.xpath("//*[@id=\"productOwned" + next + "\"]"));
				nextPrice = driver.findElement(By.xpath("//*[@id=\"productPrice" + next + "\"]"));
			}
			if (Integer.parseInt(nextPrice.getText().replaceAll(",", "")) * 0.4 > Integer
					.parseInt(currentPrice.getText().replaceAll(",", "")))
				currentUpgrade.click();


		}
	}

}
