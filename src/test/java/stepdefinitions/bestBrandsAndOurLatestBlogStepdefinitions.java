package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BestBrandsAndOurLatestBlogPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ResourceBundle;

public class bestBrandsAndOurLatestBlogStepdefinitions {


    BestBrandsAndOurLatestBlogPage bestBrandsAndOurLatestBlogPage = new BestBrandsAndOurLatestBlogPage();

    @Given("user goes to web homepage")
    public void user_goes_to_web_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("scrolls the page down")
    public void scrolls_the_page_down() {

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(bestBrandsAndOurLatestBlogPage.topBrandsText).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Then("it tests that there are {int} brands under the top brands category")
    public void it_tests_that_there_are_brands_under_the_top_brands_category(int expectedNumberOfTopBrands) {

        Assert.assertEquals(bestBrandsAndOurLatestBlogPage.numberOfTopBrandsList.size(),expectedNumberOfTopBrands);
    }

    @Then("tests whether plant products are available on our Latest blog")
    public void tests_whether_plant_products_are_available_on_our_latest_blog() {

         Assert.assertTrue(bestBrandsAndOurLatestBlogPage.benefitsOfIndoorPlantsBlogProduct.isDisplayed());
    }

    @Then("tests whether Best Sport Shoes products are available on our Latest blog")
    public void tests_whether_best_sport_shoes_products_are_available_on_our_latest_blog() {

        Assert.assertTrue(bestBrandsAndOurLatestBlogPage.bestSportShoesBlogProduct.isDisplayed());
    }

    @Then("tests whether Best Furniture  products are available on our Latest blog")
    public void tests_whether_best_furniture_products_are_available_on_our_latest_blog() {

        Assert.assertTrue(bestBrandsAndOurLatestBlogPage.bestFurnitureBlogProduct.isDisplayed());
    }

    @Then("tests whether Smart Worlds products are available on our Latest blog")
    public void tests_whether_smart_worlds_products_are_available_on_our_latest_blog() {

        Assert.assertTrue(bestBrandsAndOurLatestBlogPage.smartWorldsBlogProduct.isDisplayed());

    }

    @Then("close page")
    public void close_page() {

        Driver.quitDriver();
    }














































}
