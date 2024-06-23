package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ChangePasswordPage;
import utilities.ConfigReader;
import utilities.Driver;

public class changePasswordStepdefinitions {


    ChangePasswordPage changePasswordPage = new ChangePasswordPage();


    @Given("user goes to web App homepage")
    public void user_goes_to_web_app_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("clicks account link")
    public void clicks_account_link() {

        changePasswordPage.accountLink.click();
    }

    @When("fills login email box")
    public void fills_login_email_box() {

        changePasswordPage.loginEmailBox.sendKeys(ConfigReader.getProperty("webValidEmail"));
    }

    @When("fills login password box")
    public void fills_login_password_box() {

        changePasswordPage.loginPasswordBox.sendKeys(ConfigReader.getProperty("webValidPassword"));
    }

    @Then("clicks sginIn button")
    public void clicks_sgin_in_button() {

        changePasswordPage.sgiInButton.click();
    }

    @Then("clicks change password link")
    public void clicks_change_password_link() {

        changePasswordPage.changePasswordLink.click();
    }

    @Then("fills old password box")
    public void fills_old_password_box() {

        changePasswordPage.oldPasswordBox.sendKeys(ConfigReader.getProperty("webValidPassword"));
    }

    @Then("fills new password box")
    public void fills_new_password_box() {
        changePasswordPage.newPasswordBox.sendKeys(ConfigReader.getProperty("webNewValidPassword"));
    }

    @Then("fills confirm password box")
    public void fills_confirm_password_box() {

        changePasswordPage.confirmPasswordBox.sendKeys(ConfigReader.getProperty("webNewValidPassword"));
    }

    @Then("clicks update button")
    public void clicks_update_button() {

        changePasswordPage.updateButton.click();
    }

    @Then("close page")
    public void close_page() {

        Driver.quitDriver();
    }







































}
