package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.FeaturedProductsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class featuredProductsStepdefinitions {


    FeaturedProductsPage featuredProductsPage = new FeaturedProductsPage();

    @Given("user goes to web home page")
    public void user_goes_to_web_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("scrolls down page")
    public void scrolls_down_page() {

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(featuredProductsPage.DwaneRunningShoesProduct).perform();
    }

    @When("tests whether the blue dwane running shoes product")
    public void tests_whether_the_blue_dwane_running_shoes_product() {

        featuredProductsPage.DwaneRunningShoesProduct.click();
        String expectedName = "Dwane Running Shoes For Men";
        Assert.assertEquals(featuredProductsPage.DwaneRunningShoesProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether blue sun hot product")
    public void tests_whether_blue_sun_hot_product() {

        featuredProductsPage.blueSunhatProduct.click();
        String expectedName = "Blue Sun Hat";
        Assert.assertEquals(featuredProductsPage.blueSunhatProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the apple headphone white product")
    public void tests_whether_the_apple_headphone_white_product() {

        featuredProductsPage.appleHeadphoneProduct.click();
        String expectedName = "Apple Headphone White";
        Assert.assertEquals(featuredProductsPage.appleHeadPhoneProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the combo pack for baby product")
    public void tests_whether_the_combo_pack_for_baby_product() {

        featuredProductsPage.comboPackBabyGirlsProduct.click();
        String expectedName = "Combo Pack For Baby Girls";
        Assert.assertEquals(featuredProductsPage.comboPackBabyGirlsProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the black headphone product")
    public void tests_whether_the_black_headphone_product() {

        featuredProductsPage.blackHeadphoneProduct.click();
        String expectedName = "Black Headphone";
        Assert.assertEquals(featuredProductsPage.blackHeadphoneProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("close page")
    public void close_page() {

        Driver.quitDriver();
    }





















}
