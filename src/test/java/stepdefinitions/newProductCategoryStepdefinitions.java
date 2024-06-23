package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.NewProductCategoryPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class newProductCategoryStepdefinitions {


    NewProductCategoryPage newProductCategoryPage = new NewProductCategoryPage();

    @Given("user goes to web home page")
    public void user_goes_to_web_home_page() {

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("scrolls down page")
    public void scrolls_down_page() {

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(newProductCategoryPage.blueArmchairProduct).perform();
    }

    @When("tests whether the blue armchair product")
    public void tests_whether_the_blue_armchair_product() {

        newProductCategoryPage.blueArmchairProduct.click();
        String expectedName = "Product Tax";
        Assert.assertEquals(newProductCategoryPage.blueArmchairActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the puma training shose product")
    public void tests_whether_the_puma_training_shose_product() {

        newProductCategoryPage.pumaTrainingShoesProduct.click();
        String expectedName = "Puma Training & Gym Shoes For";
        Assert.assertEquals(newProductCategoryPage.pumaTrainingShoesActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the men shirt product")
    public void tests_whether_the_men_shirt_product() {

        newProductCategoryPage.menSlimFitShirtProduct.click();
        String expectedName = "Men Slim Fit Checkered Cut Away Collar Casual Shirt";
        Assert.assertEquals(newProductCategoryPage.menSlimFitShirtActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the fancy blue shirt product")

    public void tests_whether_the_fancy_blue_shirt_product() {

        newProductCategoryPage.fancyBlueShirtProduct.click();
        String expectedName = "Fancy Blue Shirt And Pant";
        Assert.assertEquals(newProductCategoryPage.fancyBlueShirtActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the men purtple product")
    public void tests_whether_the_men_purtple_product() {

        newProductCategoryPage.menPurpleShirtProduct.click();
        String expectedName = "Men Purple Plain Fancy Shirt";
        Assert.assertEquals(newProductCategoryPage.menPurpleShirtActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("scrolls categories to the right")
    public void scrolls_categories_to_the_right() {

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(newProductCategoryPage.mediumLaptopBackpackProduct).perform();
        ReusableMethods.bekle(5);
    }

    @Then("Then tests whether the men formul white shirt product")
    public void then_tests_whether_the_men_formul_white_shirt_product() {

        newProductCategoryPage.menFormalShirtProduct.click();
        String expectedName = "Men Formal White Shirt With Gray Pant";
        Assert.assertEquals(newProductCategoryPage.menFormalShirtActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the men slim fit shirt product")
    public void tests_whether_the_men_slim_fit_shirt_product() {

        newProductCategoryPage.menSlimFitSolidShirtProduct.click();
        String expectedName = "Men Slim Fit Solid Casual Shirt";
        Assert.assertEquals(newProductCategoryPage.menSlimfitSolidShirtActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }


    @Then("tests whether the woman black dress product")
    public void tests_whether_the_woman_black_dress_product() {

        newProductCategoryPage.womenBlackFancyDressProduct.click();
        String expectedName = "Women Black Fancy Dress";
        Assert.assertEquals(newProductCategoryPage.womenBlackFancyDressActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("tests whether the medium laptop backpack product")
    public void tests_whether_the_medium_laptop_backpack_product() {

        newProductCategoryPage.mediumLaptopBackpackProduct.click();
        String expectedName = "Medium 25 L Laptop Backpack For Office/College/Travel (Black, Yellow)";
        Assert.assertEquals(newProductCategoryPage.mediumLaptopBackpackActualProductName.getText(),expectedName);
        Driver.getDriver().navigate().back();
    }

    @Then("close page")
    public void close_page() {

        Driver.quitDriver();
    }













































}
