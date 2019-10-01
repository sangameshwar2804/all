package com.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSmoke {
	WebDriver driver;
	LoginPage lp;
	String actual;

	@Given("^when user enters into login page$")
	public void when_user_enters_into_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/resources/drivers1/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		lp = new LoginPage(driver);
	}

	@When("^user enters valid password and username$")
	public void user_enters_valid_password_and_username() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		actual = lp.dologin("admin@yourstore.com", "admin");
	}

	@When("^clicks on login submit button$")
	public void clicks_on_login_submit_button() throws Throwable {
		System.out.println(actual);
	}

	@Then("^user reddirects to dashboard page$")
	public void user_reddirects_to_dashboard_page() throws Throwable {
		driver.close();
	}

}
