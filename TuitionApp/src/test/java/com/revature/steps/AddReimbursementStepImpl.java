package com.revature.steps;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.revature.pages.TuitionMain;
import com.revature.runners.TuitionRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddReimbursementStepImpl {
	
	public static TuitionMain tuitionMain = TuitionRunner.tuitionMain;
	public static WebDriver driver = TuitionRunner.driver;
	
	@Given("^The User is on the Employess Home Page$")
	public void the_User_is_on_the_Employess_Home_Page() throws Throwable {
		driver.get("http://127.0.0.1:5500/NiceAdmin/form_component.html");
	}

	@When("^The User enters First Name$")
	public void the_User_enters_First_Name() throws Throwable {
		tuitionMain.firstName.sendKeys("First_Name1" + "\n"); //Can use \n in place of Keys.ENTER
	}

	@When("^The User enters Last Name$")
	public void the_User_enters_Last_Name() throws Throwable {
		tuitionMain.lastName.sendKeys("Last_Name1" + "\n"); //Can use \n in place of Keys.ENTER
	}

	@When("^The User enters Date$")
	public void the_User_enters_Date() throws Throwable {
		tuitionMain.date.sendKeys("09282018" + "\n"); //Can use \n in place of Keys.ENTER
	}

	@When("^The User enters Time$")
	public void the_User_enters_Time() throws Throwable {
		tuitionMain.time.sendKeys("0124PM" + "\n"); //Can use \n in place of Keys.ENTER
	}

	@When("^The User enters Location$")
	public void the_User_enters_Location() throws Throwable {
		tuitionMain.location.sendKeys("Location1" + "\n"); //Can use \n in place of Keys.ENTER
	}

	@When("^The User enters Description$")
	public void the_User_enters_Description() throws Throwable {
		tuitionMain.description.sendKeys("Description1" + "\n"); //Can use \n in place of Keys.ENTER
	}

	@When("^The User enters Cost$")
	public void the_User_enters_Cost() throws Throwable {
		tuitionMain.cost.sendKeys("Cost1" + "\n"); //Can use \n in place of Keys.ENTER
	}

	@When("^The User enters Grading Format$")
	public void the_User_enters_Grading_Format() throws Throwable {
		tuitionMain.gradingFormat.sendKeys("Pass/Fail" + "\n"); //Can use \n in place of Keys.ENTER
	}

	@When("^The User enters Event Type$")
	public void the_User_enters_Event_Type() throws Throwable {
		tuitionMain.eventType.sendKeys("Certification" + "\n"); //Can use \n in place of Keys.ENTER
	}

	@When("^The User clicks Add Reimbursement$")
	public void the_User_clicks_Add_Reimbursement() throws Throwable {
		tuitionMain.Add_Reimbursement.click();
	}

	@Then("^The Reimburstment request should be added$")
	public void the_Reimburstment_request_should_be_added() throws Throwable {
		assertEquals("Employee", driver.getTitle());
	}

}
