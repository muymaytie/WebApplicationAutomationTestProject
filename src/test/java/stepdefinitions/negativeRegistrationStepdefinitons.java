package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.NegativeRegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class negativeRegistrationStepdefinitons {

    Faker faker = new Faker();
    NegativeRegistrationPage negativeRegistrationPage = new NegativeRegistrationPage();


    @Given("user goes to web App homepage")
    public void user_goes_to_web_app_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("clicks account link")
    public void account_clicks_link() {

        negativeRegistrationPage.accountLink.click();
    }

    @When("clicks signUp link")
    public void sign_up_clicks_link() {

        negativeRegistrationPage.signUpLink.click();
    }

    @Then("fills name box")
    public void fills_name_box() {

        negativeRegistrationPage.firstNameBox.sendKeys(faker.name().firstName());
    }

    @Then("fills surname box")
    public void fills_surname_box() {

        negativeRegistrationPage.surnameBox.sendKeys(faker.name().lastName());
    }

    @Then("fills email box")
    public void fills_email_box() {

        negativeRegistrationPage.registrationEmailBox.sendKeys(faker.internet().emailAddress());
    }

    @Then("fills password box")
    public void fills_password_box() {


        negativeRegistrationPage.registrationPasswordBox.sendKeys(faker.internet().password());
    }



    @Then("fills confirm password box")
    public void fills_confirm_password_box() {

        Actions actions = new Actions(Driver.getDriver());
        actions.click(negativeRegistrationPage.confirmPasswordBox)
                .sendKeys(faker.internet().password())
                .perform();

    }

    @Then("clicks sigUp button")
    public void sig_up_clicks_button() {

        negativeRegistrationPage.signUpButton.click();
    }

    @Then("tests if there is a negative registration")
    public void tests_if_there_is_a_negative_registration() {

        Assert.assertTrue(negativeRegistrationPage.confirmPasswordBox.isDisplayed());
    }

    @Then("close page")
    public void close_page() {

        Driver.quitDriver();
    }




}
