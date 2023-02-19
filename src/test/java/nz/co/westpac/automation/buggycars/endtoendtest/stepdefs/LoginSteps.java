package nz.co.westpac.automation.buggycars.endtoendtest.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nz.co.westpac.automation.buggycars.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.util.Map;


public class LoginSteps extends AbstractPageSteps {
    private WebDriver driver = null;
    LoginPage loginPage;

    public LoginSteps() {
        driver = getDriver();
        loginPage = new LoginPage(driver);
    }

    @Given("user is on the buggycars page")
    public void user_is_on_the_login_page() {
        loginPage.openTheUrl();
    }
    @When("enters login credentials as an existing user")
    public void enters_login_credentials_as_an_existing_user(Map<String , String> dataTable) {
        loginPage.login(dataTable.get("userId"),dataTable.get("password"));
    }

    @Then("user should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        String title = loginPage.validatePageTitle();
        Assert.assertEquals(title,"Buggy Cars Rating");
    }

    @Given("user logged into the website")
    public void user_logged_into_the_website(Map<String, String> dataTable) {
        loginPage.openTheUrl();
        loginPage.login(dataTable.get("userId"),dataTable.get("password"));
        String title = loginPage.validatePageTitle();
        Assert.assertEquals(title,"Buggy Cars Rating");
    }
    @Then("click logout")
    public void click_logout() {
        loginPage.logout();
    }

}
