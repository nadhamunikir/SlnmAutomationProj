package nz.co.westpac.automation.buggycars.endtoendtest.stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nz.co.westpac.automation.buggycars.pages.VotingPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class VotingSteps extends AbstractPageSteps {
    private WebDriver driver = null;
    VotingPage votingPage;

    public VotingSteps() {
        driver = getDriver();
        votingPage = new VotingPage(driver);
    }

    @When("signup and login wih credentials")
    public void signup_and_login_wih_credentials()
    {
        votingPage.signupAndLogin();
    }
    @When("enters comment and clicks on vote")
    public void enters_comment_and_clicks_on_vote() {
        votingPage.submitVote();
    }
    @Then("the vote should be submitted successfully")
    public void the_vote_should_be_submitted_successfully() {
        String result = votingPage.getVotingResult();
        System.out.println("Voting result : " + result);
        Assert.assertEquals(result,"Thank you for your vote!");
    }
}
