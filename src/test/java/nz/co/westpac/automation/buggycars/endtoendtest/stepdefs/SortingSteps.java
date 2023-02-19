package nz.co.westpac.automation.buggycars.endtoendtest.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import nz.co.westpac.automation.buggycars.pages.LoginPage;
import nz.co.westpac.automation.buggycars.pages.SortingPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class SortingSteps extends AbstractPageSteps {
    private WebDriver driver = null;
    LoginPage loginPage;
    SortingPage sortingPage;

    public SortingSteps() {
        driver = getDriver();
        loginPage = new LoginPage(driver);
        sortingPage = new SortingPage(driver);
    }

    @And("clicks on overall rating link")
    public void clicks_on_overall_rating_link() {
        sortingPage.clickOverallRatings();
    }
    @And("clicks on sort make link")
    public void clicks_on_sort_make_link() {
        sortingPage.clickSortMake();
    }

    @Then("make must be sorted successfully")
    public void make_must_be_sorted_successfully() {
        String result = sortingPage.getSortedMakeName();
        Assert.assertEquals(result,"Alfa Romeo");
    }

    @And("clicks on sort voting link")
    public void clicks_on_sort_voting_link() {
        sortingPage.clickSortVoting();
    }

    @Then("votes must be sorted successfully")
    public void votes_must_be_sorted_successfully() {
        String result = sortingPage.getSortedVotes();
        String[] splitResult = result.split(" ");
        System.out.println("Count1: " + splitResult[0] + "\t Count2: " + splitResult[1]);
        Assert.assertTrue(Integer.parseInt(splitResult[0]) >=Integer.parseInt(splitResult[1]) );
    }

    @Then("quit browser")
    public void quit_browser(){
        quitDriver();
    }

}
