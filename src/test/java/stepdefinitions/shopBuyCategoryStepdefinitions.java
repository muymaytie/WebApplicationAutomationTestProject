package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ShopBuyCategoryPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;
import java.awt.dnd.DragGestureEvent;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class shopBuyCategoryStepdefinitions {


    ShopBuyCategoryPage shopBuyCategoryPage = new ShopBuyCategoryPage();


    @Given("user goes to web home page")
    public void user_goes_to_web_home_page() {

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("scrolls the page down")
    public void scrolls_the_page_down() {

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(shopBuyCategoryPage.electronicsCategory)
                .perform();
    }

    @Then("Click on the electronics category")
    public void click_on_the_electronics_category() {

        shopBuyCategoryPage.electronicsCategory.click();
    }

    @Then("Tests that there are {int} products in the electronics category")
    public void tests_that_there_are_products_in_the_electronics_category(int expectedNumberOfProducts) {

        Assert.assertEquals(shopBuyCategoryPage.electronicsCategoryActualNumberOfProductList.size(),expectedNumberOfProducts);
        Driver.getDriver().navigate().back();
    }

    @Then("Click on the Men Fashion category")
    public void click_on_the_men_fashion_category() {

        shopBuyCategoryPage.menFashionCategory.click();
    }

    @Then("Tests that there are {int} products in the men fashion category")
    public void tests_that_there_are_products_in_the_men_fashion_category(int expectedNumberOfProducts) {

        Assert.assertEquals(shopBuyCategoryPage.menFashionCategoryActualNumberOfProductList.size(),expectedNumberOfProducts);
        Driver.getDriver().navigate().back();
    }

    @Then("Click on the Women Fashion category")
    public void click_on_the_women_fashion_category() {

        shopBuyCategoryPage.womanFashionCategory.click();
    }

    @Then("Tests that there are {int} products in the women fashion category")
    public void tests_that_there_are_products_in_the_women_fashion_category(int expectedNumberOfProducts) {

        Assert.assertEquals(shopBuyCategoryPage.womanFashionCategoryActualNumberOfProductList.size(),expectedNumberOfProducts);
        Driver.getDriver().navigate().back();
    }

    @Then("Click on the Shoes category")
    public void click_on_the_shoes_category() {

        shopBuyCategoryPage.shoseCategory.click();
    }

    @Then("Tests that there are {int} products in the shose category")
    public void tests_that_there_are_products_in_the_shose_category(int expectedNumberOfProducts) {

        Assert.assertEquals(shopBuyCategoryPage.shoseCategoryActualNumberOfProductList.size(),expectedNumberOfProducts);
        Driver.getDriver().navigate().back();
    }

    @Then("Click on the Furniture category")
    public void click_on_the_furniture_category() {

        shopBuyCategoryPage.furniturCategory.click();
    }

    @Then("Tests that there are {int} products in the furniture category")
    public void tests_that_there_are_products_in_the_furniture_category(int expectedNumberOfProducts) {

        Assert.assertEquals(shopBuyCategoryPage.furniturCategoryActualNumberOfProductList.size(),expectedNumberOfProducts);
        Driver.getDriver().navigate().back();
    }

    @Then("Click on the Travel category")
    public void click_on_the_travel_category() {

        shopBuyCategoryPage.travelCategory.click();
    }

    @Then("Tests that there are {int} products in the travel category")
    public void tests_that_there_are_products_in_the_travel_category(int expectedNumberOfProducts) {

        Assert.assertEquals(shopBuyCategoryPage.travelCategoryActualNumberOfProductList.size(),expectedNumberOfProducts);
        Driver.getDriver().navigate().back();
    }

    @Then("scrolls categories to the right")
    public void scrolls_categories_to_the_right() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        shopBuyCategoryPage.scrollButton.click();
        shopBuyCategoryPage.scrollButton.click();

    }

    @Then("Click on the Kids Wear category")
    public void click_on_the_kids_wear_category() {

        shopBuyCategoryPage.kidsWearCategory.click();
    }

    @Then("Tests that there are {int} products in the kids wear category")
    public void tests_that_there_are_products_in_the_kids_wear_category(int expectedNumberOfProducts) {

        Assert.assertEquals(shopBuyCategoryPage.kidsWearCategoryActualNumberOfProductList.size(),expectedNumberOfProducts);
        Driver.getDriver().navigate().back();
    }

    @Then("Click on the Grocery category")
    public void click_on_the_grocery_category() {

        shopBuyCategoryPage.groceryCategory.click();
    }

    @Then("Tests that there are {int} products in the grocery category")
    public void tests_that_there_are_products_in_the_grocery_category(int expectedNumberOfProducts) {

        Assert.assertEquals(shopBuyCategoryPage.groceryCategoryActualNumberOfProductList.size(),expectedNumberOfProducts);
        Driver.getDriver().navigate().back();
    }

    @Then("close page")
    public void close_page() {

        Driver.quitDriver();
    }































































}
