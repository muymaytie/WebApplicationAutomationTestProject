package stepdefinitions;

import com.github.javafaker.Faker;
import com.github.javafaker.Relationships;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.PositiveRegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class positiveRegistrationStepdefinitons {


    Faker faker = new Faker();
    String fakerName = faker.name().firstName();
    String fakerPassword = faker.internet().password();

    PositiveRegistrationPage positiveRegistrationPage = new PositiveRegistrationPage();

    @Given("user goes to web App homepage")
    public void user_goes_to_web_app_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("clicks account link")
    public void account_clicks_link() {

        positiveRegistrationPage.accountLink.click();
    }

    @When("clicks sginUp link")
    public void sign_up_clicks_link() {

        positiveRegistrationPage.signUpLink.click();
    }

    @Then("fills name box")
    public void fills_name_box() {

        positiveRegistrationPage.firstNameBox.sendKeys(fakerName);
    }

    @Then("fills surname box")
    public void fills_surname_box() {

        positiveRegistrationPage.surnameBox.sendKeys(faker.name().lastName());
    }

    @Then("fills email box")
    public void fills_email_box() {

        positiveRegistrationPage.registrationEmailBox.sendKeys(faker.internet().emailAddress());
    }

    @Then("fills password box")
    public void fills_password_box() {


        positiveRegistrationPage.registrationPasswordBox.sendKeys(fakerPassword);
    }



    @Then("fills confirm password box")
    public void fills_confirm_password_box() {

        Actions actions = new Actions(Driver.getDriver());
        actions.click(positiveRegistrationPage.confirmPasswordBox)
                .sendKeys(fakerPassword)
                .perform();

    }

    @Then("clicks sginUp button")
    public void sig_up_clicks_button() {

        positiveRegistrationPage.signUpButton.click();
    }

    @Then("tests if there is a positive registration")
    public void tests_if_there_is_a_positive_registration() {

        Assert.assertEquals(positiveRegistrationPage.profileName.getText(),fakerName);
    }

    @Then("close page")
    public void close_page() {

        Driver.quitDriver();
    }



}
