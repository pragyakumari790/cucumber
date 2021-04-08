package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath = "//input[@id='Email']")

	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id = "Password")
	@CacheLookup
	
	WebElement txtPassword;
	
	@FindBy(tagName = "button")
	@CacheLookup
	WebElement btnLogin;
	@FindBy(linkText ="Logout")
	@CacheLookup
	WebElement lnkLogout;
	
	public void setUserName(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
		
	}
	public void setPassword(String pwd) {
		txtEmail.clear();
		txtEmail.sendKeys(pwd);
	}
	public void clickLogin() {
		btnLogin.click();
	}
	public void clickLogout() {
		lnkLogout.click();
	}
	
}
