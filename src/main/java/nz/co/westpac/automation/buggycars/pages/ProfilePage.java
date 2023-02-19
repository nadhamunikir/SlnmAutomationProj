package nz.co.westpac.automation.buggycars.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
	private WebDriver driver;

	private By profileLink = By.partialLinkText("Profile");
	private By addressField = By.id("address");
	private By phoneField = By.id("phone");
	private By saveBtn = By.xpath("//button[contains(text(),'Save')]");


	private By saveProfileMsg = By.cssSelector("div.result.alert");


	public ProfilePage(WebDriver driver) {
		this.driver = driver;
	}
	public String validatePageTitle() {
		return driver.getTitle();
	}

	public void clickEditProfile(){
		driver.findElement(profileLink).click();
	}
	public void eneterNewProfileDetails(){
		driver.findElement(addressField).clear();
		driver.findElement(addressField).sendKeys("New Address, \n" + "Auckland " +((int)(Math.random()*9000)+1000)+ ",\nNZ");
		driver.findElement(phoneField).clear();
		driver.findElement(phoneField).sendKeys("+6420000" +((int)(Math.random()*9000)+1000));
	}
	public void saveEditProfile(){
		driver.findElement(saveBtn).click();
	}

	public String getSaveProfileMessage(){
		return driver.findElement(saveProfileMsg).getText();
	}
}
