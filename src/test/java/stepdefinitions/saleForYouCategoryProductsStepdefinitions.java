package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.SaleForYouProductsCategoryPage;
import utilities.ConfigReader;
import utilities.Driver;

public class saleForYouCategoryProductsStepdefinitions {

    SaleForYouProductsCategoryPage saleForYouProductsCategoryPage = new SaleForYouProductsCategoryPage();

    @Given("user goes to home page")
    public void user_goes_to_home_page() {

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("user scroll down")
    public void user_scroll_down() {

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(saleForYouProductsCategoryPage.nikeSneakerGrayProduct)
                .perform();
    }

    @When("Tests that the product in the category is {int}")
    public void tests_that_the_product_in_the_category_is(int givenExpectedProductNumber) {

        Assert.assertEquals(saleForYouProductsCategoryPage.saleForYouCategoryProductsList.size(),givenExpectedProductNumber);
    }

    @Then("Tests whether the products one expected name and actual name are the same")
    public void tests_whether_the_products_one_expected_name_and_actual_name_are_the_same() {

        saleForYouProductsCategoryPage.nikeSneakerGrayProduct.click();
        String expectedName = "Nike Sneaker Orange & Gray";
        Assert.assertEquals(saleForYouProductsCategoryPage.nikeSneakerGrayProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();

    }

    @Then("Tests whether the products second expected name and actual name are the same")
    public void tests_whether_the_products_second_expected_name_and_actual_name_are_the_same() {

        saleForYouProductsCategoryPage.appleHeadphoneWhiteProduct.click();
        String expectedName = "Apple Headphone White";
        Assert.assertEquals(saleForYouProductsCategoryPage.appleHeadphoneWhiteProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("Tests whether the products third expected name and actual name are the same")
    public void tests_whether_the_products_third_expected_name_and_actual_name_are_the_same() {

        saleForYouProductsCategoryPage.infiniteSmartPhoneProduct.click();
        String expectedName = "Infinite Smart 7 HD (Green Apple, 64 GB) (2 GB RAM)";
        Assert.assertEquals(saleForYouProductsCategoryPage.infiniteSmartPhoneProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("Tests whether the products fourth expected name and actual name are the same")
    public void tests_whether_the_products_fourth_expected_name_and_actual_name_are_the_same() {

        saleForYouProductsCategoryPage.blueSunHatsProduct.click();
        String expectedName = "Blue Sun Hat";
        Assert.assertEquals(saleForYouProductsCategoryPage.blueSunHatsProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("Tests whether the products fifth expected name and actual name are the same")
    public void tests_whether_the_products_fifth_expected_name_and_actual_name_are_the_same() {

        saleForYouProductsCategoryPage.bluePartyWearProduct.click();
        String expectedName = "Blue Party Wear Dress";
        Assert.assertEquals(saleForYouProductsCategoryPage.bluePartyWearProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @And("close page")
    public void close_page() {

        Driver.quitDriver();
    }

















































}
