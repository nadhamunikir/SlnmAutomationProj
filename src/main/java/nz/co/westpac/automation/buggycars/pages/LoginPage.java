package nz.co.westpac.automation.buggycars.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	private WebDriver driver;
	private By loginBtn= By.xpath("//*[text()='Login']");
	private By username= By.name("login");
	private By password= By.name("password");
	private By buggyRatingLink = By.partialLinkText("Buggy Rating");
	private By logoutBtn = By.partialLinkText("Logout");


	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public String validatePageTitle() {
		return driver.getTitle();
	}

	public void openTheUrl(){
		String url = System.getProperty("url");
		driver.get(url);
	}
	public void login(String user, String pwd) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
	}
	public void logout(){
		driver.findElement(buggyRatingLink).click(); // There is a bug: Logout does not work if the user is on other pages such as overall ratings page etc , hence need to return back to this page for the logout to work everytime.
		driver.findElement(logoutBtn).click();
	}
}
