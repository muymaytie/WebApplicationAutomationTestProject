package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.NegativeLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class negativeLoginStepdefinitions {


    Faker faker = new Faker();
    NegativeLoginPage negativeLoginPage = new NegativeLoginPage();


    @Given("user goes to web App homepage")
    public void user_goes_to_web_app_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("clicks account link")
    public void account_clicks_link() {

        negativeLoginPage.accountLink.click();
    }

    @When("fills login email box")
    public void fills_login_email_box() {

        negativeLoginPage.loginEmailBox.sendKeys(faker.internet().emailAddress());
    }

    @When("fills login password box")
    public void fills_login_password_box() {

        negativeLoginPage.loginPasswordBox.sendKeys(faker.internet().password());
    }

    @Then("clicks sigIn button")
    public void sig_in_clicks_button() {

        negativeLoginPage.sgiInButton.click();
    }

    @Then("tests if there is a negative login")
    public void tests_if_there_is_a_negative_login() {

        Assert.assertTrue(negativeLoginPage.sgiInButton.isDisplayed());
    }

    @Then("close page")
    public void close_page() {

        Driver.quitDriver();
    }








































}
