package nz.co.westpac.automation.buggycars.endtoendtest.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nz.co.westpac.automation.buggycars.pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class RegistrationSteps extends AbstractPageSteps {
    private WebDriver driver = null;
    RegistrationPage registrationPage;

    public RegistrationSteps() {
        driver = getDriver();
        registrationPage = new RegistrationPage(driver);
    }

    @And("click on Register button")
    public void user_clicks_on_register_button()
    {
        registrationPage.clickRegister();
    }
    @When("enters registration details and clicks register")
    public void enters_registration_details_and_clicks_register() {
        registrationPage.enterRegistrationdetails();
    }

    @Then("user should be registered successfully")
    public void user_should_be_registered_successfully() {
        String regSuccess = registrationPage.validatePage();
        Assert.assertEquals(regSuccess,"Registration is successful");
    }
}
