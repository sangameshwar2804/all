package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bdd.page.Loginpage;
import com.wbl.base.PageObject;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login {
	WebDriver driver;
	Loginpage lp;
	String actual;

	@Given("^user launche goes to login page$")
	public void user_launche_goes_to_login_page() {
		driver=Hooks.driver;
		System.out.println("given Method");
		lp=new Loginpage(driver);
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\" , clicks on submit button$")
	public void user_enters_and_clicks_on_submit_button(String usr, String pwd) throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		actual = lp.loginWithValid(usr, pwd);

	}

	@Then("^user redirects to dashboard page$")
	public void user_redirects_to_dashboard_page() {
		Assert.assertEquals(actual, "Dashboard / nopCommerce administration");
		System.out.println(actual);
		driver.close();
	}
	@Given("^user goes to login page$")
	public void user_goes_to_login_page() throws Throwable {
		driver=Hooks.driver;
		System.out.println("given Method");
		lp=new Loginpage(driver);
	}

	@When("^user enters invalid username and invalid username, clicks on submit button$")
	public void user_enters_invalid_username_and_invalid_username_clicks_on_submit_button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		actual=lp.loginWithValid("abc@gmail.com","innovapath");
	}

	@Then("^user gets is unable to go to dashboard page$")
	public void user_gets_is_unable_to_go_to_dashboard_page() throws Throwable {
		Assert.assertEquals(actual, "Your store. Login");
	}

	@When("^user enters valid user name and invalid password$")
	public void user_enters_valid_user_name_and_invalid_password() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		actual=lp.loginWithValid("admin@yourstore.com","innovapath");
	}

	@Then("^user is unable to go dashboard page$")
	public void user_is_unable_to_go_dashboard_page() throws Throwable {
	 Assert.assertEquals(actual, "Your store. Login");
	}


}
