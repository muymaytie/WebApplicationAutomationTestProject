package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PositiveLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class positiveLoginStepdefinitons {


    PositiveLoginPage positiveLoginPage = new PositiveLoginPage();

    @Given("user goes to web App homepage")
    public void user_goes_to_web_app_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("clicks account link")
    public void account_clicks_link() {

        positiveLoginPage.accountLink.click();
    }

    @When("fills login email box")
    public void fills_login_email_box() {

        positiveLoginPage.loginEmailBox.sendKeys(ConfigReader.getProperty("webValidEmail"));

    }

    @When("fills login password box")
    public void fills_login_password_box() {

        positiveLoginPage.loginPasswordBox.sendKeys(ConfigReader.getProperty("webValidPassword"));
    }

    @Then("clicks sigIn button")
    public void sig_in_clicks_button() {

        positiveLoginPage.sgiInButton.click();
    }

    @Then("tests if there is a positive login")
    public void tests_if_there_is_a_positive_login() {

        Assert.assertTrue(positiveLoginPage.logoutButton.isDisplayed());
    }

    @Then("close page")
    public void close_page() {

        Driver.quitDriver();
    }










































}
