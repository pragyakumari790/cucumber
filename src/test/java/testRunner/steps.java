package testRunner;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

public class steps {
	public WebDriver driver;
	public LoginPage lp;
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		driver = new ChromeDriver();
	    lp = new LoginPage(driver);
	}

	@When("user opens url= {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
	}

	@When("User enters Email as {string} and Password  as {string}")
	public void user_enters_Email_as_and_Password_as(String Email, String pwd) {
	    lp.setUserName(Email);
	    lp.setPassword(pwd);
	}


	@When("Click on Login")
	public void click_on_Login() {
	   lp.clickLogin();
	}

	@Then("Page Title should be{string}")
	public void page_Title_should_be(String title) {
	    if(driver.getPageSource().contains("Login was unsuccessful.")){
	    	driver.close();
	    	Assert.assertTrue(false);
	    }else {
	    	Assert.assertEquals(title, driver.getTitle());
	    }
	}

	@When("User click on Logout link")
	public void user_click_on_Logout_link() throws InterruptedException {
		lp.clickLogout();
		Thread.sleep(5000);
		
	    
	}
	@Then("Page Title Should be {string}")
	public void page_Title_Should_be(String title) {
		if(driver.getPageSource().contains("Your store. Login")){
	    	driver.close();
	    	Assert.assertTrue(false);
	    }else {
	    	Assert.assertEquals(title, driver.getTitle());
	    }
	}
	
	@And("close browser")
	public void close_browser() {
	    driver.quit();
	}

	
}
