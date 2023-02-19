package nz.co.westpac.automation.buggycars.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SortingPage {
	private WebDriver driver;
	private By sortingMsg= By.xpath("//*[text()='Login']");
	private By overallRatingLink= By.xpath("//a[contains(@href, 'overall')]");
	private By makeLink= By.partialLinkText("Make");
	private By makeSorted= By.xpath("//tbody/tr[1]/child::td[2]");
	private By votesLink= By.partialLinkText("Votes");
	private By voteSorted1= By.xpath("//tbody/tr[1]/child::td[5]");
	private By voteSorted2= By.xpath("//tbody/tr[2]/child::td[5]");

	public SortingPage(WebDriver driver) {
		this.driver = driver;
	}

	public String validatePageTitle() {
		return driver.getTitle();
	}

	public void clickOverallRatings() {
		driver.findElement(overallRatingLink).click();

	}
	public void clickSortMake() {
		driver.findElement(makeLink).click();
	}
	public String getSortedMakeName(){
		return driver.findElement(makeSorted).getText();
	}

	public void clickSortVoting() {
		driver.findElement(votesLink).click();
	}
	public String getSortedVotes(){
		String firstTwoVotes;
		firstTwoVotes =  driver.findElement(voteSorted1).getText() + " " + driver.findElement(voteSorted2).getText();
		return firstTwoVotes;
	}

}
