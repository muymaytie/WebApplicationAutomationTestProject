package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import net.bytebuddy.implementation.MethodAccessorFactory;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.ShoppingTestPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class shoppingTestStepdefinitions {


    ShoppingTestPage shoppingTestPage = new ShoppingTestPage();


    @Given("user goes to web home page")
    public void user_goes_to_web_home_page() {

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @Then("user account will log in")
    public void userAccountWillLogIn() {
        shoppingTestPage.accountLink.click();
        shoppingTestPage.loginEmailBox.sendKeys(ConfigReader.getProperty("webValidEmail"));
        shoppingTestPage.loginPasswordBox.sendKeys(ConfigReader.getProperty("webValidPassword"));
        shoppingTestPage.signButton.click();
        shoppingTestPage.webAppLogo.click();
    }

    @When("scrolls down the page and clicks on any product")
    public void scrolls_down_the_page_and_clicks_on_any_product() {

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(shoppingTestPage.blueSunHat).perform();
    }

    @When("clicks the buy now button")
    public void clicks_the_buy_now_button() {

        shoppingTestPage.blueSunHat.click();
    }

    @Then("clicks the purchase confirmation button")
    public void clicks_the_purchase_confirmation_button() {

        shoppingTestPage.buyNowButton.click();
        shoppingTestPage.checkoutButton.click();
    }

    @Then("clicks the billing address button and fills out and selects the address formula")
    public void clicks_the_billing_address_button_and_fills_out_and_selects_the_address_formula() {

        shoppingTestPage.billingAddressMarkingBox.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();
    }

    @Then("selects the address we saved before for Delivery Address")
    public void selects_the_address_we_saved_before_for_delivery_address() {

        ReusableMethods.bekle(1);
        shoppingTestPage.deliveryAddressMarkingBox.click();
    }

    @Then("selects fast sending from the shipping features and tests whether extra money is added")
    public void selects_fast_sending_from_the_shipping_features_and_tests_whether_extra_money_is_added() {

        shoppingTestPage.fastShippingMarkingBox.click();
    }

    @Then("it tests whether {int} different card payment methods are available from the payment features")
    public void it_tests_whether_different_card_payment_methods_are_available_from_the_payment_features(int expectedNumberOfCardPaymentMethods) {

        Assert.assertEquals(shoppingTestPage.cardPaymentMethods.size(),expectedNumberOfCardPaymentMethods);
    }

    @Then("write the necessary instructions in the Write order instructions box")
    public void write_the_necessary_instructions_in_the_write_order_instructions_box() {

        Faker faker = new Faker();
        shoppingTestPage.orderİnstructionBox.sendKeys(faker.internet().emailAddress());
    }

    @Then("return and Refund Policy And Clicks the Terms and Conditions I accept button")
    public void return_and_refund_policy_and_clicks_the_terms_and_conditions_ı_accept_button() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP)
                .perform();

        shoppingTestPage.returnAndRefundPolicyAndTermsAndConditionsAcceptanceBox.click();
    }

    @Then("presses the order now button and tests whether she ordered successfully or not")
    public void presses_the_order_now_button_and_tests_whether_she_ordered_successfully_or_not() {

        shoppingTestPage.orderNowButton.click();

        String expectedText = "Your order is successfully done!";
        Assert.assertEquals(shoppingTestPage.yourOrderİsSuccessfullyDoneText.getText(),expectedText);
    }

    @Then("closes the page")
    public void closes_the_page() {

        Driver.quitDriver();
    }



}
