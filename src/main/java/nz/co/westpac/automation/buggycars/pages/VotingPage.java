package nz.co.westpac.automation.buggycars.pages;

import nz.co.westpac.automation.buggycars.helpers.DateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VotingPage {
	private WebDriver driver;
	RegistrationPage registrationPage;
	LoginPage loginPage;

	private DateHelper dateHelper= new DateHelper();
	private By buggyRatingLink = By.partialLinkText("Buggy Rating");
	private By popularModelLink = By.xpath("//img[contains(@title, 'Guilia Quadrifoglio')]");
	private By votingSuccess = By.cssSelector("p.card-text");

	public VotingPage(WebDriver driver) {
		this.driver = driver;
		registrationPage = new RegistrationPage(driver);
		loginPage = new LoginPage(driver);
	}
	public void signupAndLogin(){
		registrationPage.clickRegister();
		registrationPage.enterRegistrationdetails();
		loginPage.login(registrationPage.getUserId(),registrationPage.getPassword());
	}
	public void submitVote(){
		driver.findElement(buggyRatingLink).click();
		driver.findElement(popularModelLink).click();
		driver.findElement(By.id("comment")).sendKeys("Awesome Model");
		driver.findElement(By.xpath("//button[contains(text(),'Vote!')]")).click();
	}
	public String getVotingResult(){
		return driver.findElement(votingSuccess).getText();
	}

}
