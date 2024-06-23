package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.poifs.crypt.binaryrc4.BinaryRC4EncryptionHeader;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.TopSellingCategoryProductsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class topsellingCategoryProductsStepdefinitions {


    TopSellingCategoryProductsPage topSellingCategoryProductsPage = new TopSellingCategoryProductsPage();

    @Given("user goes to home page")
    public void user_goes_to_home_page() {

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("user scroll down")
    public void user_scroll_down() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();
    }

    @When("Tests that the product in the category is {int}")
    public void tests_that_the_product_in_the_category_is(int expectedProductNumber) {

        Assert.assertEquals(topSellingCategoryProductsPage.topsellingProducsList.size(),expectedProductNumber);
    }

    @Then("Tests whether the products one' expected name and actual name are the same")
    public void tests_whether_the_products_one_expected_name_and_actual_name_are_the_same() {

        topSellingCategoryProductsPage.blueChairProduct.click();
        String expectedName = "Product Tax";
        Assert.assertEquals(topSellingCategoryProductsPage.blueChairProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();

    }

    @Then("Tests whether the products second expected name and actual name are the same")
    public void tests_whether_the_products_second_expected_name_and_actual_name_are_the_same() {

        topSellingCategoryProductsPage.roundedPillowProduct.click();
        String expectedName = "Rounded Table With 3 Pillows";
        Assert.assertEquals(topSellingCategoryProductsPage.roundedPillowProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();

    }

    @Then("Tests whether the products third expected name and actual name are the same")
    public void tests_whether_the_products_third_expected_name_and_actual_name_are_the_same() {

        topSellingCategoryProductsPage.grayComfortChairProduct.click();
        String expectedName = "Gray Comfort Chair";
        Assert.assertEquals(topSellingCategoryProductsPage.grayComfortChairProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();

    }

    @Then("Tests whether the products fourth expected name and actual name are the same")
    public void tests_whether_the_products_fourth_expected_name_and_actual_name_are_the_same() {

        topSellingCategoryProductsPage.yellowChairPillowProduct.click();
        String expectedName = "Yellow Chair With Pillow";
        Assert.assertEquals(topSellingCategoryProductsPage.yellowChairPillowProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();

    }

    @Then("Tests whether the products fifth expected name and actual name are the same")
    public void tests_whether_the_products_fifth_expected_name_and_actual_name_are_the_same() {

        topSellingCategoryProductsPage.blueSunHatProduct.click();
        String expectedName = "Blue Sun Hat";
        Assert.assertEquals(topSellingCategoryProductsPage.blueSunHatProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();

    }

    @Then("Tests whether the products sixth expected name and actual name are the same")
    public void tests_whether_the_products_sixth_expected_name_and_actual_name_are_the_same() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        topSellingCategoryProductsPage.axeLongBodysprayProduct.click();
        String expectedName = "Axe Long Lasting Bodyspray";
        Assert.assertEquals(topSellingCategoryProductsPage.axeLongBodysprayProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();

    }

    @Then("Tests whether the products seventh expected name and actual name are the same")
    public void tests_whether_the_products_seventh_expected_name_and_actual_name_are_the_same() {

        topSellingCategoryProductsPage.pinkSportShoesProduct.click();
        String expectedName = "Pink Sport Shoes For Women";
        Assert.assertEquals(topSellingCategoryProductsPage.pinkSportShoesProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();

    }

    @Then("Tests whether the products eighth expected name and actual name are the same")
    public void tests_whether_the_products_eighth_expected_name_and_actual_name_are_the_same() {

        topSellingCategoryProductsPage.bluePartyDressProduct.click();
        String expectedName = "Blue Party Wear Dress";
        Assert.assertEquals(topSellingCategoryProductsPage.bluePartyDressProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();

    }

    @Then("Tests whether the products ninth expected name and actual name are the same")
    public void tests_whether_the_products_ninth_expected_name_and_actual_name_are_the_same() {

        topSellingCategoryProductsPage.appleHeadphoneWhiteProduct.click();
        String expectedName = "Apple Headphone White";
        Assert.assertEquals(topSellingCategoryProductsPage.appleHeadphoneWhiteProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();

    }

    @Then("Tests whether the products tenth expected name and actual name are the same")
    public void tests_whether_the_products_tenth_expected_name_and_actual_name_are_the_same() {

        topSellingCategoryProductsPage.nikeSneakerOrangeGrayProduct.click();
        String expectedName = "Nike Sneaker Orange & Gray";
        Assert.assertEquals(topSellingCategoryProductsPage.nikeSneakerOrangeGrayProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();

    }

    @Then("Tests whether the products eleventh expected name and actual name are the same")
    public void tests_whether_the_products_eleventh_expected_name_and_actual_name_are_the_same() {
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(topSellingCategoryProductsPage.whitePartywearDressProduct).perform();

        topSellingCategoryProductsPage.whitePartywearDressProduct.click();
        String expectedName = "White Partywear Dress";
        Assert.assertEquals(topSellingCategoryProductsPage.whitePartywearDressProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();

    }

    @Then("Tests whether the products twelfth expected name and actual name are the same")
    public void tests_whether_the_products_twelfth_expected_name_and_actual_name_are_the_same() {

        topSellingCategoryProductsPage.menRegularFitShirtProduct.click();
        String expectedName = "Men Regular Fit Solid Formal Shirt";
        Assert.assertEquals(topSellingCategoryProductsPage.menRegularFitShirtProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();

    }

    @Then("Tests whether the products thirteenth expected name and actual name are the same")
    public void tests_whether_the_products_thirteenth_expected_name_and_actual_name_are_the_same() {

        topSellingCategoryProductsPage.comboPackBabyGirlsProduct.click();
        String expectedName = "Combo Pack For Baby Girls";
        Assert.assertEquals(topSellingCategoryProductsPage.comboPackBabyGirlsProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();

    }

    @Then("Tests whether the products fourteenth expected name and actual name are the same")
    public void tests_whether_the_products_fourteenth_expected_name_and_actual_name_are_the_same() {

        topSellingCategoryProductsPage.tShirtMenProduct.click();
        String expectedName = "T-Shirt For Men";
        Assert.assertEquals(topSellingCategoryProductsPage.tShirtMenProductActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();

    }

    @Then("Tests whether the products fifteenth expected name and actual name are the same")
    public void tests_whether_the_products_fifteenth_expected_name_and_actual_name_are_the_same() {

        topSellingCategoryProductsPage.blackHeadphoneProduct.click();
        String expectedName = "Black Headphone";
        Assert.assertEquals(topSellingCategoryProductsPage.blackHeadphoneActualName.getText(),expectedName);
        Driver.getDriver().navigate().back();

    }

    @Then("close page")
    public void close_page() {

        Driver.quitDriver();
    }





}
