package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.CategoryPage;
import utilities.ConfigReader;
import utilities.Driver;

public class categoryStepdefinitions {


    CategoryPage categoryPage = new CategoryPage();

    @Given("user goes to web App homepage")
    public void user_goes_to_web_app_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("clicks on the electronics category and tests that there are {int} products")
    public void clicks_on_the_electronics_category_and_tests_that_there_are_products(int sixteen) {

        categoryPage.electronicCategoryLink.click();
        Assert.assertEquals(categoryPage.electronicCategoryProductFoundList.size(),sixteen);
        Driver.getDriver().navigate().back();
    }

    @When("clicks on the men fashion category and tests that there are {int} products")
    public void clicks_on_the_men_fashion_category_and_tests_that_there_are_products(int eleven) {

        categoryPage.menFashionCategoryLink.click();
        Assert.assertEquals(categoryPage.menFashionCategoryProductFoundList.size(),eleven);
        Driver.getDriver().navigate().back();
    }

    @Then("clicks on the women fashion category and tests that there are {int} products")
    public void clicks_on_the_women_fashion_category_and_tests_that_there_are_products(int nine) {

        categoryPage.womenFashionCategoryLink.click();
        Assert.assertEquals(categoryPage.womenFashionCategoryProductFoundList.size(),nine);
        Driver.getDriver().navigate().back();
    }

    @Then("clicks on the shoes category and tests that there are {int} products")
    public void clicks_on_the_shoes_category_and_tests_that_there_are_products(int five) {

        categoryPage.shoseCategoryLink.click();
        Assert.assertEquals(categoryPage.shoseCategoryProductFoundList.size(),five);
        Driver.getDriver().navigate().back();
    }

    @Then("clicks on the furniture category and tests that there are {int} products")
    public void clicks_on_the_furniture_category_and_tests_that_there_are_products(int six) {

        categoryPage.furnitureCategoryLink.click();
        Assert.assertEquals(categoryPage.furnitureCategoryProductFoundList.size(),six);
        Driver.getDriver().navigate().back();
    }

    @Then("clicks on the travel category and tests that there are {int} products")
    public void clicks_on_the_travel_category_and_tests_that_there_are_products(int four) {

        categoryPage.travelCategoryLink.click();
        Assert.assertEquals(categoryPage.travelCategoryProductFoundList.size(),four);
        Driver.getDriver().navigate().back();
    }

    @Then("clicks on the kids wear category and tests that there are {int} products")
    public void clicks_on_the_kids_wear_category_and_tests_that_there_are_products(int seven) {

        categoryPage.kidsWearCategoryLink.click();
        Assert.assertEquals(categoryPage.kidsWearCategoryProductFoundList.size(),seven);
        Driver.getDriver().navigate().back();
    }

    @Then("clicks on the kids wear boys category and tests that there are {int} products")
    public void clicks_on_the_kids_wear_boys_category_and_tests_that_there_are_products(int one) {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(categoryPage.kidsWearCategoryLink)
                        .click(categoryPage.kidsWearBoysLink)
                                .perform();

        Assert.assertEquals(categoryPage.kidsBoysCategoryProductFoundList.size(),one);
        Driver.getDriver().navigate().back();
    }

    @Then("clicks on the kids wear girls category and tests that there are {int} products")
    public void clicks_on_the_kids_wear_girls_category_and_tests_that_there_are_products(int one) {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(categoryPage.kidsWearCategoryLink)
                .click(categoryPage.kidsWearGirlsLink)
                .perform();

        Assert.assertEquals(categoryPage.kidsGirlsCategoryProductFoundList.size(),one);
        Driver.getDriver().navigate().back();
    }

    @Then("clicks on the grocery category and tests that there are {int} products")
    public void clicks_on_the_grocery_category_and_tests_that_there_are_products(int one) {

        categoryPage.groceryCategoryLink.click();
        Assert.assertEquals(categoryPage.groceryCategoryProductFoundList.size(),one);
        Driver.getDriver().navigate().back();
    }


    @And("close page")
    public void closePage() {

        Driver.quitDriver();
    }



}
