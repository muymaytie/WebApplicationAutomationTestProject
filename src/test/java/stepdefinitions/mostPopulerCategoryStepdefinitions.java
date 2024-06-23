package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MostPopulerCategoryPage;
import pages.MostPopulerProductsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class mostPopulerCategoryStepdefinitions {



    MostPopulerCategoryPage mostPopulerCategoryPage = new MostPopulerCategoryPage();

    @Given("user goes to web homepage")
    public void user_goes_to_web_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("scrolls the page down")
    public void scrolls_the_page_down() {

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(mostPopulerCategoryPage.dellCoreElement).perform();

    }

    @When("tests that there are {int} products in the Electronics category")
    public void tests_that_there_are_products_in_the_electronics_category(int expectedNumberOfProductsİnElectronicsCategory) {

        Assert.assertEquals(mostPopulerCategoryPage.electronicCategoryProductsList.size(),expectedNumberOfProductsİnElectronicsCategory);
    }

    @Then("tests that there are {int} products in the Men Fashion category")
    public void tests_that_there_are_products_in_the_men_fashion_category(int expectedNumberOfProductsİnMenFashionCategory) {

        mostPopulerCategoryPage.menFashionCategory.click();
        Assert.assertEquals(mostPopulerCategoryPage.menFashionCategoryProductsList.size(),expectedNumberOfProductsİnMenFashionCategory);
    }

    @Then("tests that there are {int} products in the Women Fashion category")
    public void tests_that_there_are_products_in_the_women_fashion_category(int expectedNumberOfProductsİnWomenFashionCategory) {

        mostPopulerCategoryPage.womenFashionCategory.click();
        Assert.assertEquals(mostPopulerCategoryPage.womenFashionCategoryProductsList.size(),expectedNumberOfProductsİnWomenFashionCategory);
    }

    @Then("tests that there are {int} products in the Shoes category")
    public void tests_that_there_are_products_in_the_shoes_category(int expectedNumberOfProductsİnShoesCategory) {

        mostPopulerCategoryPage.shoesCategory.click();
        Assert.assertEquals(mostPopulerCategoryPage.shoesCategoryProductsList.size(),expectedNumberOfProductsİnShoesCategory);
    }

    @Then("tests that there are {int} products in the Furniture category")
    public void tests_that_there_are_products_in_the_furniture_category(int expectedNumberOfProductsİnFurnitureCategory) {

        mostPopulerCategoryPage.furnitureCategory.click();
        Assert.assertEquals(mostPopulerCategoryPage.furnitureCategoryProductsList.size(),expectedNumberOfProductsİnFurnitureCategory);
    }

    @Then("tests that there are {int} products in the Travel category")
    public void tests_that_there_are_products_in_the_travel_category(int expectedNumberOfProductsİnTravelCategory) {

        mostPopulerCategoryPage.travelCategory.click();
        Assert.assertEquals(mostPopulerCategoryPage.travelCategoryProductsList.size(),expectedNumberOfProductsİnTravelCategory);
    }

    @Then("tests that there are {int} products in the Kids Wear category")
    public void tests_that_there_are_products_in_the_kids_wear_category(int expectedNumberOfProductsİnKidsWearCategory) {

        mostPopulerCategoryPage.kidsWearCategory.click();
        Assert.assertEquals(mostPopulerCategoryPage.kidsWearCategoryProductsList.size(),expectedNumberOfProductsİnKidsWearCategory);
    }

    @Then("tests that there are {int} products in the Grocery category")
    public void tests_that_there_are_products_in_the_grocery_category(int expectedNumberOfProductsİnGroceryCategory) {

        mostPopulerCategoryPage.groceryCategory.click();
        Assert.assertEquals(mostPopulerCategoryPage.groceryCategoryProductsList.size(),expectedNumberOfProductsİnGroceryCategory);

    }











































}
