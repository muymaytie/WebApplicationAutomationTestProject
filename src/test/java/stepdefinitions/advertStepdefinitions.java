package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AdvertPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class advertStepdefinitions {


    AdvertPage advertPage = new AdvertPage();

    @Given("user goes to web App homepage")
    public void user_goes_to_web_app_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("special offer verifies that the ad has been seen and is accessible")
    public void special_offer_verifies_that_the_ad_has_been_seen_and_is_accessible() {

        Assert.assertTrue(advertPage.specialOfferAdvert.isDisplayed());
        Assert.assertTrue(advertPage.specialOfferAdvert.isEnabled());
    }

    @When("men fashion verifies that the ad has been seen and is accessible")
    public void men_fashion_verifies_that_the_ad_has_been_seen_and_is_accessible() {

        Assert.assertTrue(advertPage.menFashionAdvert.isDisplayed());
        Assert.assertTrue(advertPage.menFashionAdvert.isEnabled());
    }

    @Then("casual sport shose verifies that the ad has been seen and is accessible")
    public void casual_sport_shose_verifies_that_the_ad_has_been_seen_and_is_accessible() {

        Assert.assertTrue(advertPage.casualSportShoseAdverts.isDisplayed());
        Assert.assertTrue(advertPage.casualSportShoseAdverts.isEnabled());
        ReusableMethods.bekle(2);

    }

    @Then("sale only today verifies that the ad has been seen and is accessible")
    public void sale_only_today_verifies_that_the_ad_has_been_seen_and_is_accessible() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                        .sendKeys(Keys.PAGE_DOWN)
                                .perform();

        Assert.assertTrue(advertPage.saleOnlyTodayAdvert.isDisplayed());
        Assert.assertTrue(advertPage.saleOnlyTodayAdvert.isEnabled());
        ReusableMethods.bekle(2);

    }

    @Then("spring style verifies that the ad has been seen and is accessible")
    public void spring_style_verifies_that_the_ad_has_been_seen_and_is_accessible() {

        Assert.assertTrue(advertPage.springStyleAdvert.isDisplayed());
        Assert.assertTrue(advertPage.springStyleAdvert.isEnabled());
        ReusableMethods.bekle(2);

    }

    @Then("especial makeup verifies that the ad has been seen and is accessible")
    public void especial_makeup_verifies_that_the_ad_has_been_seen_and_is_accessible() {

        Assert.assertTrue(advertPage.especialMakeupAdvert.isDisplayed());
        Assert.assertTrue(advertPage.especialMakeupAdvert.isEnabled());
        ReusableMethods.bekle(2);

    }

    @Then("dgi drones verifies that the ad has been seen and is accessible")
    public void dgi_drones_verifies_that_the_ad_has_been_seen_and_is_accessible() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();

        Assert.assertTrue(advertPage.dgiDronesAdvert.isDisplayed());
        Assert.assertTrue(advertPage.dgiDronesAdvert.isEnabled());
        ReusableMethods.bekle(2);

    }

    @Then("dslr camera verifies that the ad has been seen and is accessible")
    public void dslr_camera_verifies_that_the_ad_has_been_seen_and_is_accessible() {

        Assert.assertTrue(advertPage.dslrCameraAdvert.isDisplayed());
        Assert.assertTrue(advertPage.dslrCameraAdvert.isEnabled());
        ReusableMethods.bekle(2);


    }

    @Then("close page")
    public void close_page() {

        Driver.quitDriver();
    }










































}
