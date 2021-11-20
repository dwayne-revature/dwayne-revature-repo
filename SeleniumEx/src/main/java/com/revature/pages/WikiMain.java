package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiMain {
	
	public WebDriver driver;
	
	@FindBy(id = "js-link-box-en")
	public WebElement english;
	
	@FindBy(id = "js-link-box-ja")
	public WebElement japanese;
	
	@FindBy(css = "div[lang='es']")
	public WebElement spanish;
	
	@FindBy(xpath = "//*[@id=\"js-link-box-de\"]")
	public WebElement german;
	
	@FindBy(xpath = "//*[@id=\"www-wikipedia-org\"]/div[2]/div[5]")
	public WebElement russian;
	
	@FindBy(xpath = "/html/body/div[2]/div[6]/a")
	public WebElement french;
	
	public WikiMain(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickEnglish() {
		english.click();
	}
	
	public void clickJapanese() {
		japanese.click();
	}

	public void clickSpanish() {
		spanish.click();
	}
	
	public void clickGerman() {
		german.click();
	}
	
	public void clickRussian() {
		russian.click();
	}
	
	public void clickFrench() {
		french.click();
	}
}
