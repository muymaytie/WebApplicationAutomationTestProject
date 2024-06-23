package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.AddAddressPage;
import utilities.ConfigReader;
import utilities.Driver;

public class addAddressStepdefinitions {

    AddAddressPage addAddressPage = new AddAddressPage();
    Faker faker = new Faker();

    @Given("user goes to web App homepage")
    public void user_goes_to_web_app_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("clicks account link")
    public void clicks_account_link() {

       addAddressPage.accountLink.click();
    }

    @When("fills login email box")
    public void fills_login_email_box() {

      addAddressPage.loginEmailBox.sendKeys(ConfigReader.getProperty("webValidEmail"));
    }

    @When("fills login password box")
    public void fills_login_password_box() {

        addAddressPage.loginPasswordBox.sendKeys(ConfigReader.getProperty("webValidPassword"));
    }

    @Then("clicks sginIn button")
    public void clicksSginInButton() {

        addAddressPage.sgiInButton.click();
    }

    @Then("clicks mange address link")
    public void clicks_mange_address_link() {

        addAddressPage.manageAddressLink.click();
    }

    @Then("clicks add address link")
    public void clicks_add_address_link() {

        addAddressPage.addAddressLink.click();
    }

    @Then("fills enter name box")
    public void fills_enter_name_box() {

        addAddressPage.addressNameBox.sendKeys(faker.name().firstName());
    }

    @Then("fills enter your address box")
    public void fills_enter_your_address_box() {

        addAddressPage.enterYourAddressBox.sendKeys(faker.address().fullAddress());
    }

    @Then("fills enter your address optional box")
    public void fills_enter_your_address_optional_box() {

        addAddressPage.enterYourAddressOptionalBox.sendKeys(faker.address().secondaryAddress());
    }

    @Then("fills select country dropdown")
    public void fills_select_country_dropdown() {

        Select selectCountry = new Select(addAddressPage.selectCountryDropdown);
        selectCountry.selectByVisibleText("United States");
    }

    @Then("fills select satate dropdown")
    public void fills_select_satate_dropdown() {

        Select selectState = new Select(addAddressPage.selectStateDropdown);
        selectState.selectByVisibleText("Florida");
    }

    @Then("fills enter city box")
    public void fills_enter_city_box() {

        addAddressPage.enterCityBox.sendKeys(faker.address().city());
    }

    @Then("fills enter postcode box")
    public void fills_enter_postcode_box() {

        addAddressPage.enterPostcodeBox.sendKeys(faker.address().zipCode());
    }

    @Then("clicks add address button")
    public void clicksAddAddressButton() {

        addAddressPage.addAddressButton.click();
    }

    @And("close page")
    public void closePage() {

        Driver.quitDriver();
    }


}
