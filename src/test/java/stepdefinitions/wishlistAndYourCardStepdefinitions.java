package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WishlistAndYourCardPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class wishlistAndYourCardStepdefinitions {


    WishlistAndYourCardPage wishlistAndYourCardPage = new WishlistAndYourCardPage();


    @Given("user goes to web home page")
    public void user_goes_to_web_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @And("will log in to the user account")
    public void willLogInToTheUserAccount() {

        wishlistAndYourCardPage.accountLink.click();
        wishlistAndYourCardPage.loginEmailBox.sendKeys(ConfigReader.getProperty("webValidEmail"));
        wishlistAndYourCardPage.loginPasswordBox.sendKeys(ConfigReader.getProperty("webValidPassword"));
        wishlistAndYourCardPage.signButton.click();
        wishlistAndYourCardPage.webAppLogo.click();
    }

    @When("clicks on any product")
    public void clicks_on_any_product() {
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(wishlistAndYourCardPage.appleHeadPhone)
                        .sendKeys(Keys.PAGE_DOWN).perform();


        wishlistAndYourCardPage.appleHeadPhone.click();
    }

    @When("puts the product on the wish list")
    public void puts_the_product_on_the_wish_list() {

        wishlistAndYourCardPage.wishlistButton.click();
    }

    @Then("goes to the wish list and tests if the product has been added")
    public void goes_to_the_wish_list_and_tests_if_the_product_has_been_added() {

        wishlistAndYourCardPage.wishlistMenu.click();
        Assert.assertTrue(wishlistAndYourCardPage.wishlistProductName.isDisplayed());
    }

    @Then("clicks the buy now button and removes the product from the wish list")
    public void clicks_the_buy_now_button_and_removes_the_product_from_the_wish_list() {

        wishlistAndYourCardPage.buyNowButton.click();
        wishlistAndYourCardPage.wishlistButton.click();
        wishlistAndYourCardPage.wishlistMenu.click();
    }

    @Then("tests if the product has been removed from the wishlist")
    public void tests_if_the_product_has_been_removed_from_the_wishlist() {

        String expectedText = "Wishlist empty!";
        Assert.assertEquals(wishlistAndYourCardPage.wishlistEmptyText.getText(),expectedText);

    }

    @Then("user clicks on any product again")
    public void user_clicks_on_any_product_again() {

        wishlistAndYourCardPage.webAppLogo.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(wishlistAndYourCardPage.appleHeadPhone)
                .sendKeys(Keys.PAGE_DOWN).perform();

        wishlistAndYourCardPage.appleHeadPhone.click();


    }

    @Then("clicks the add to cart button")
    public void clicks_the_add_to_cart_button() {

        wishlistAndYourCardPage.addToCardButton.click();
    }

    @Then("clicks your card link and tests whether the added product is there")
    public void clicks_your_card_link_and_tests_whether_the_added_product_is_there() {

        wishlistAndYourCardPage.yourCardMenu.click();
        String expectedProductName = "Apple Headphone White";
        Assert.assertEquals(wishlistAndYourCardPage.ProductNameOnYourCardList.getText(),expectedProductName);
    }

    @Then("removes the product from the card payment section")
    public void removes_the_product_from_the_card_payment_section() {

        wishlistAndYourCardPage.productRemovalLink.click();
        wishlistAndYourCardPage.yesRemoveItButton.click();
    }

    @Then("tests whether the product has been removed")
    public void tests_whether_the_product_has_been_removed() {

        ReusableMethods.bekle(30);
        Assert.assertTrue(wishlistAndYourCardPage.shoppingCardİsEmptyText.isDisplayed());
    }

    @Then("closes the page")
    public void closes_the_page() {

        Driver.quitDriver();
    }



}
