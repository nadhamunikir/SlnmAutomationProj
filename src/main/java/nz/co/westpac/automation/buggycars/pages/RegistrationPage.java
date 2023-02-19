package nz.co.westpac.automation.buggycars.pages;

import nz.co.westpac.automation.buggycars.helpers.DateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class RegistrationPage {
	private WebDriver driver;
	private DateHelper dateHelper= new DateHelper();
	private By registerLink     = By.partialLinkText("Register");
	private By loginInput      = By.id("username");
	private By firstName       = By.id("firstName");
	private By lastName        = By.id("lastName");
	private By password        = By.id("password");
	private By confirmPassword = By.id("confirmPassword");
	private By registerBtn     = By.xpath("//button[contains(text(), 'Register')]");
	private By registerSuccess = By.cssSelector("div.result");

	static String userId = null;
	static String pwd = null;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	public String validatePage() {
		System.out.println(driver.findElement(registerSuccess).getText());
		return driver.findElement(registerSuccess).getText();
	}

	public void clickRegister(){
		driver.findElement(registerLink).click();
	}

	public void enterRegistrationdetails(){
		userId= "TestUser_"+dateHelper.getDateTime();
		pwd = "Pa$$word_"+dateHelper.getDateTime();
		driver.findElement(loginInput).sendKeys(userId);
		driver.findElement(firstName).sendKeys("FN"+dateHelper.getDateTime());
		driver.findElement(lastName).sendKeys("LN"+dateHelper.getDateTime());
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(confirmPassword).sendKeys(pwd);
		driver.findElement(registerBtn).click();
	}
	public String getUserId(){
		return userId;
	}
	public String getPassword(){
		return pwd;
	}

}
