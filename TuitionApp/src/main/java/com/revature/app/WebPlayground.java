package com.revature.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPlayground {
	
	public static void main(String[] args) throws InterruptedException {
		
		String driverPath = "C:/Sts_Workspace/ChromeDriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
			
		employeeFormAutomation(driver);
		
		deptSupervisorFormAutomation(driver);
		
		deptHeadFormAutomation(driver);
		
		benCoFormAutomation(driver);
		
	}

	private static void employeeFormAutomation(WebDriver driver) throws InterruptedException {
		driver.get("http://127.0.0.1:5500/NiceAdmin/login-page.html");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("user");
		
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("web");
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		// Employee Form Page
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("First_Name1");
		
		Thread.sleep(1000);
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Last_Name1");
		
		Thread.sleep(1000);
		
		WebElement date = driver.findElement(By.id("date"));
		date.sendKeys("10302021");
		
		Thread.sleep(1000);
		
		WebElement time = driver.findElement(By.id("time"));
		time.sendKeys("0130PM");
		
		Thread.sleep(1000);
		
		WebElement location = driver.findElement(By.id("location"));
		location.sendKeys("Location1");
		
		Thread.sleep(1000);
		
		WebElement description = driver.findElement(By.id("description"));
		description.sendKeys("Description1");
		
		Thread.sleep(1000);
		
		WebElement cost = driver.findElement(By.id("cost"));
		cost.sendKeys("100");
		
		Thread.sleep(1000);

		Select gradingFormat = new Select(driver.findElement(By.id("gradingFormat")));
		gradingFormat.selectByVisibleText("Pass/Fail");
		
		Thread.sleep(1000);
		
		Select eventType = new Select(driver.findElement(By.id("eventType")));
		eventType.selectByVisibleText("Certification");
		
		Thread.sleep(3000);
		
		
		WebElement Add_Reimbursement = driver.findElement(By.id("Add_Reimbursement"));
		Add_Reimbursement.click();
		
		Thread.sleep(3000);
		
		WebElement Get_Reimbursement = driver.findElement(By.id("Get_Reimbursement"));
		Get_Reimbursement.click();
	}

	private static void deptSupervisorFormAutomation(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(3000);
		
		//driver.get("http://127.0.0.1:5500/NiceAdmin/DSform_component.html");
		
		driver.get("http://127.0.0.1:5500/NiceAdmin/login-page.html");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("departmentSupervisor");
		
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("web");
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		Thread.sleep(3000);
		
		WebElement View_Reimbursements = driver.findElement(By.id("View_Reimbursements"));
		View_Reimbursements.click();
		
		Thread.sleep(5000);
		
		WebElement decision_entry = driver.findElement(By.id("decision_entry"));
		decision_entry.sendKeys("1");
		
		Thread.sleep(3000);
		
		WebElement Approve_Reimbursement = driver.findElement(By.id("Approve_Reimbursement"));
		Approve_Reimbursement.click();
		
		Thread.sleep(3000);
		
		WebElement ViewReimbursements = driver.findElement(By.id("View_Reimbursements"));
		ViewReimbursements.click();
	}

	private static void deptHeadFormAutomation(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(3000);
		
		//driver.get("http://127.0.0.1:5500/NiceAdmin/DHform_component.html");
		
		driver.get("http://127.0.0.1:5500/NiceAdmin/login-page.html");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("departmentHead");
		
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("web");
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		Thread.sleep(3000);
		
		WebElement View_Reimbursements = driver.findElement(By.id("View_Reimbursements"));
		View_Reimbursements.click();
		
		Thread.sleep(5000);
		
		WebElement decision_entry = driver.findElement(By.id("decision_entry"));
		decision_entry.sendKeys("1");
		
		Thread.sleep(3000);
		
		WebElement Approve_Reimbursement = driver.findElement(By.id("Approve_Reimbursement"));
		Approve_Reimbursement.click();
		
		Thread.sleep(3000);
		
		WebElement ViewReimbursements = driver.findElement(By.id("View_Reimbursements"));
		ViewReimbursements.click();
	}
	
	private static void benCoFormAutomation(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(3000);
		
		//driver.get("http://127.0.0.1:5500/NiceAdmin/BCform_component.html");
		
		driver.get("http://127.0.0.1:5500/NiceAdmin/login-page.html");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("benefitsCoordinator");
		
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("web");
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		Thread.sleep(5000);
		
		WebElement View_Reimbursements = driver.findElement(By.id("View_Reimbursements"));
		View_Reimbursements.click();
		
		Thread.sleep(5000);
		
		WebElement decision_entry = driver.findElement(By.id("decision_entry"));
		decision_entry.sendKeys("1");
		
		Thread.sleep(3000);
		
		WebElement Approve_Reimbursement = driver.findElement(By.id("Approve_Reimbursement"));
		Approve_Reimbursement.click();
		
		Thread.sleep(5000);
		
		WebElement ViewReimbursements = driver.findElement(By.id("View_Reimbursements"));
		ViewReimbursements.click();
	}

}
