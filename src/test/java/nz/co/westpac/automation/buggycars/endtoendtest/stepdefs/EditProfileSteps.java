package nz.co.westpac.automation.buggycars.endtoendtest.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nz.co.westpac.automation.buggycars.pages.LoginPage;
import nz.co.westpac.automation.buggycars.pages.ProfilePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EditProfileSteps extends AbstractPageSteps {
    private WebDriver driver = null;
    LoginPage loginPage;
    ProfilePage profilePage;

    public EditProfileSteps() {
        driver = getDriver();
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
    }

    @And("clicks on edit profile link")
    public void clicks_on_edit_profile_link() {
        profilePage.clickEditProfile();
    }
    @And("enters new profile details")
    public void enters_new_profile_details() {
        profilePage.eneterNewProfileDetails();
    }
    @When("cliks the save profile button")
    public void cliks_the_save_profile_button() {
        profilePage.saveEditProfile();
    }
    @Then("new details must be saved successfully")
    public void new_details_must_be_saved_successfully() {
        String result= profilePage.getSaveProfileMessage();
        Assert.assertEquals(result,"The profile has been saved successful");
    }
}
