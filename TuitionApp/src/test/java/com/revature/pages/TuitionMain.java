package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TuitionMain {
	
	public WebDriver driver;
	
	@FindBy(id = "firstName")
	public WebElement firstName;
	
	@FindBy(id = "lastName")
	public WebElement lastName;
	
	@FindBy(id = "date")
	public WebElement date;
	
	@FindBy(id = "time")
	public WebElement time;
	
	@FindBy(id = "location")
	public WebElement location;
	
	@FindBy(id = "description")
	public WebElement description;
	
	@FindBy(id = "cost")
	public WebElement cost;
	
	@FindBy(id = "gradingFormat")
	public WebElement gradingFormat;
	
	@FindBy(id = "eventType")
	public WebElement eventType;
	
	@FindBy(id = "Add_Reimbursement")
	public WebElement Add_Reimbursement;
	
	
	public TuitionMain(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
