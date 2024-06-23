package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.UpdateProfilePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class updateProfileStepdefinitons {


    Faker faker = new Faker();
    String fakerName = faker.name().firstName();

    UpdateProfilePage updateProfilePage = new UpdateProfilePage();

    @Given("user goes to web App homepage")
    public void user_goes_to_web_app_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("clicks account link")
    public void clicks_account_link() {

        updateProfilePage.accountLink.click();
    }

    @When("fills login email box")
    public void fills_login_email_box() {

        updateProfilePage.loginEmailBox.sendKeys(ConfigReader.getProperty("webValidEmail"));
    }

    @When("fills login password box")
    public void fills_login_password_box() {

        updateProfilePage.loginPasswordBox.sendKeys(ConfigReader.getProperty("webValidPassword"));
    }

    @Then("clicks sgiIn button")
    public void clicks_sgi_in_button() {

        updateProfilePage.sgiInButton.click();
    }

    @Then("updates first name")
    public void updates_first_name() {

        updateProfilePage.updateNameBox.clear();
        updateProfilePage.updateNameBox.sendKeys(fakerName);
    }

    @Then("updates last name")
    public void updates_last_name() {

        updateProfilePage.updateSurnameBox.clear();
        updateProfilePage.updateSurnameBox.sendKeys(faker.name().lastName());
    }

    @Then("updates email")
    public void updates_email() {

        updateProfilePage.updateEmailBox.clear();
        updateProfilePage.updateEmailBox.sendKeys(faker.internet().emailAddress());
    }

    @Then("fills the number box")
    public void fills_the_numbers_box() {

        updateProfilePage.updatePhoneNumberBox.sendKeys(faker.number().digit());
    }

    @Then("selects photo for profile")
    public void selects_photo_for_profile() {

        String dynamicFileWay = System.getProperty("user.home") +"/"+ "\\Downloads\\file-name.png";
        Actions actions = new Actions(Driver.getDriver());
        actions.click(updateProfilePage.profilePhotoFile)
                        .sendKeys(dynamicFileWay)
                                .perform();
    }

    @Then("clicks update button")
    public void clicks_update_button() {

        updateProfilePage.updateButton.click();
    }

    @Then("close page")
    public void closePage() {

        Driver.quitDriver();
    }



}
