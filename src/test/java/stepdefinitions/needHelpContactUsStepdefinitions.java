package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.math3.stat.interval.ConfidenceInterval;
import org.junit.Assert;
import pages.NeedHelpContactUsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class needHelpContactUsStepdefinitions {


    Faker faker = new Faker();
    NeedHelpContactUsPage needHelpContactUsPage = new NeedHelpContactUsPage();


    @Given("user goes to web App homepage")
    public void user_goes_to_web_app_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));

    }

    @When("clicks account link")
    public void clicks_account_link() {
        needHelpContactUsPage.accountLink.click();
    }

    @When("fills login email box")
    public void fills_login_email_box() {

        needHelpContactUsPage.loginEmailBox.sendKeys(ConfigReader.getProperty("webValidEmail"));
    }

    @When("fills login password box")
    public void fills_login_password_box() {

        needHelpContactUsPage.loginPasswordBox.sendKeys(ConfigReader.getProperty("webNewValidPassword"));
    }

    @Then("clicks sginIn button")
    public void clicks_sgin_in_button() {

        needHelpContactUsPage.sgiInButton.click();
    }

    @When("clicks need help contact us now link")
    public void clicks_need_help_contact_us_now_link() {

        needHelpContactUsPage.contactUsNowLink.click();
    }

    @When("tests whether the address is visible")
    public void tests_whether_the_address_is_visible() {

        Assert.assertTrue(needHelpContactUsPage.addressText.isDisplayed());
    }

    @When("tests whether the phone number is visible")
    public void tests_whether_the_phone_number_is_visible() {

        Assert.assertTrue(needHelpContactUsPage.phoneNumberText.isDisplayed());
    }

    @When("tests whether the email address is visible")
    public void tests_whether_the_email_address_is_visible() {

        Assert.assertTrue(needHelpContactUsPage.emailAddressText.isDisplayed());
    }

    @Then("tests the presence of our registration name in the full name box")
    public void tests_the_presence_of_our_registration_name_in_the_full_name_box() {

        Assert.assertTrue(needHelpContactUsPage.fullNameBox.isDisplayed());
    }

    @Then("tests the presence of our registration email in the email address box")
    public void tests_the_presence_of_our_registration_email_in_the_email_address_box() {

       Assert.assertTrue(needHelpContactUsPage.emailAddressBox.isDisplayed());
    }

    @Then("fills subject box")
    public void fills_subject_box() {

        needHelpContactUsPage.subjectBox.sendKeys(faker.business().creditCardType());
    }

    @Then("fills message box")
    public void fills_message_box() {

        needHelpContactUsPage.messageBox.sendKeys(faker.backToTheFuture().character());
    }

    @Then("clicks send message button")
    public void clicks_send_message_button() {

        needHelpContactUsPage.sendMessageButton.click();
    }


    @Then("close page")
    public void close_page() {

        Driver.quitDriver();
    }













































}
