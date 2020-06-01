package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import common.Hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javascript.JavascriptHelper;
import pom.FlipkartHomePage;

public class SmokeSuite {
	private WebDriver driver;
	public JavascriptHelper jshelper;
	public FlipkartHomePage homepage;
	
	public SmokeSuite() 
	 {
		 	driver=  Hooks.driver ;
		 	jshelper = new JavascriptHelper(driver);
		 	homepage = new FlipkartHomePage(driver);
	 }
	
	@Given("^User navigate to Flipkart$")
	public void user_navigate_to_Flipkart() throws Throwable 
	{
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		homepage.ClosePopup.Click();
	}

	@When("^User enter username$")
	public void user_enter_username() throws Throwable {
		homepage.LoginBtn.Click();
		homepage.UsernameTextFiled.EnterText("Dattatray");
		
	}

	@When("^User enter password$")
	public void user_enter_password() throws Throwable {
	homepage.PasswordTextFiled.EnterText("123");
	}

	@When("^Click on sign in button$")
	public void click_on_sign_in_button() throws Throwable {
		System.out.println("User navigate to Flipkart");
		homepage.LoginSubmitBtn.Click();
	}

	@Then("^User should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
		Assert.assertEquals(1, 1);
}

}
