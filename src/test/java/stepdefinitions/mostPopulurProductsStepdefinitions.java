package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MostPopulerProductsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class mostPopulurProductsStepdefinitions {


    MostPopulerProductsPage mostPopulerProductsPage = new MostPopulerProductsPage();

    @Given("user goes to web homepage")
    public void user_goes_to_web_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("scrolls down to the most popular product category")
    public void scrolls_down_to_the_most_popular_product_category() {

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(mostPopulerProductsPage.dgiDronesAdvert).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.bekle(2);
    }

    @When("tests that there are {int} products")
    public void tests_that_there_are_products(int expctedProductsOfNumbers) {

        Assert.assertEquals(mostPopulerProductsPage.actualNumberOfProductsFound.size(),expctedProductsOfNumbers);
    }

    @Then("tests whether the dell core product")
    public void tests_whether_the_dell_core_product() {

        mostPopulerProductsPage.dellCoreProduct.click();
        String expectedName = "DELL Core I3 11th Gen - (8 GB/256 GB SSD/32 GB EMMC Storage/Ubuntu)";
        Assert.assertEquals(mostPopulerProductsPage.dellCoreActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the kppo reno product")
    public void tests_whether_the_kppo_reno_product() {

        mostPopulerProductsPage.kppoRenoProduct.click();
        String expectedName = "KPPO Reno8T 5G (Sunrise Gold, 128 GB) (8 GB RAM)";
        Assert.assertEquals(mostPopulerProductsPage.kppoRenoActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the infinite smart product")
    public void tests_whether_the_infinite_smart_product() {

        mostPopulerProductsPage.ınfiniteSmartProduct.click();
        String expectedName = "Infinite Smart 7 HD (Green Apple, 64 GB) (2 GB RAM)";
        Assert.assertEquals(mostPopulerProductsPage.ınfiniteSmartActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the aurora green product")
    public void tests_whether_the_aurora_green_product() {

        mostPopulerProductsPage.auroraGreenProduct.click();
        String expectedName = "MOTOR E13 (Aurora Green, 64 GB) (4 GB RAM)";
        Assert.assertEquals(mostPopulerProductsPage.auroraGreenActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the applel iphone product")
    public void tests_whether_the_applel_iphone_product() {

        mostPopulerProductsPage.applelİphoneProduct.click();
        String expectedName = "APPLEL IPhone 13 (Starlight, 128 GB)";
        Assert.assertEquals(mostPopulerProductsPage.applelİphoneActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the real phone product")
    public void tests_whether_the_real_phone_product() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.bekle(2);

        mostPopulerProductsPage.realPhoneProduct.click();
        String expectedName = "Real Phone 2 (White, 128 GB) (8 GB RAM)";
        Assert.assertEquals(mostPopulerProductsPage.realPhoneActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the dslr camera product")
    public void tests_whether_the_dslr_camera_product() {

        mostPopulerProductsPage.dslrCameraProduct.click();
        String expectedName = "DSLR Camera";
        Assert.assertEquals(mostPopulerProductsPage.dslrCameraActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the samsung phone product")
    public void tests_whether_the_samsung_phone_product() {

        mostPopulerProductsPage.samsungWatchProduct.click();
        String expectedName = "Samsung White Smart Watch";
        Assert.assertEquals(mostPopulerProductsPage.samsungWatchActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the apple watch product")
    public void tests_whether_the_apple_watch_product() {

        mostPopulerProductsPage.appleWatchProduct.click();
        String expectedName = "Appple Smart Watch";
        Assert.assertEquals(mostPopulerProductsPage.appleWatchActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the asus vivobook product")
    public void tests_whether_the_asus_vivobook_product() {

        mostPopulerProductsPage.asusVivobookProduct.click();
        String expectedName = "ASUS Vivobook 15 Core I3 11th Gen - (8 GB/512 GB SSD/Windows 11 Home)";
        Assert.assertEquals(mostPopulerProductsPage.asusVivobookActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the lenove carbon product")
    public void tests_whether_the_lenove_carbon_product() {

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(mostPopulerProductsPage.lenoveCrabonProduct).perform();

        ReusableMethods.bekle(2);

        mostPopulerProductsPage.lenoveCrabonProduct.click();
        String expectedName = "Lenovo Yoga Slim 7 Carbon Intel Core I7 12th Gen - (16 GB/1 TB SSD/Windows 11 Home)";
        Assert.assertEquals(mostPopulerProductsPage.lenoveCarbonActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the bAt Rockerz product")
    public void tests_whether_the_b_at_rockerz_product() {

        mostPopulerProductsPage.bAtRockerzProduct.click();
        String expectedName = "BAt Rockerz 510 Super Extra Bass Bluetooth Headset (Raging Red, On The Ear)";
        Assert.assertEquals(mostPopulerProductsPage.bAtRockerzActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the Mksrstore DJI Mini product")
    public void tests_whether_the_mksrstore_dji_mini_product() {

        mostPopulerProductsPage.mksrstoreDjiMiniProduct.click();
        String expectedName = "Mksrstore DJI Mini 3 Pro With DJI RC Remote (Smart Controller With Display) Drone";
        Assert.assertEquals(mostPopulerProductsPage.mksrstoreDjiMiniActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether NIKHLIX RVR INTERPRICE product")
    public void tests_whether_nikhlix_rvr_interprice_product() {

        mostPopulerProductsPage.nikhlixRvrInterpriceProduct.click();
        String expectedName = "NIKHLIX RVR INTERPRICE MODELl E88 Drone";
        Assert.assertEquals(mostPopulerProductsPage.nikhlixRvrInterpriceActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the Tradworld HX Drone product")
    public void tests_whether_the_tradworld_hx_drone_product() {

        mostPopulerProductsPage.tradworldHxDroneProduct.click();
        String expectedName = "Tradworld HX750 Drone 2.6 Ghz 6 C Without Camera For Kids Drone";
        Assert.assertEquals(mostPopulerProductsPage.tradworldHxDroneActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("close page")
    public void close_page() {

        Driver.quitDriver();
    }









































}
