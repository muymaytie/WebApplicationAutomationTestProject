package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ProductSearchPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.dnd.DragGestureEvent;

public class productSearchStepdefinitiıns {


    ProductSearchPage productSearchPage = new ProductSearchPage();

    @Given("user goes to web App homepage")
    public void user_goes_to_web_app_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }

    @When("blue armchair in the search box and press enter")
    public void blue_armchair_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.sendKeys("Product Tax" +Keys.ENTER);

    }

    @When("Tests whether the blue armchair product we are looking for is available")
    public void tests_whether_the_blue_armchair_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "Product Tax";
        Assert.assertEquals(productSearchPage.prodcutTaxProductName.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();

    }

    @Then("gray comfort chair in the search box and press enter")
    public void gray_comfort_chair_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys(" Gray Comfort Chair"+Keys.ENTER);

    }

    @Then("tests whether the gray comfort chair product we are looking for is available")

    public void tests_whether_the_gray_comfort_chair_product_we_are_looking_for_is_available() {
        String nameOfTheProductToSearchFor = "Gray Comfort Chair";
        Assert.assertEquals(productSearchPage.grauComfortProductName.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();

    }

    @Then("yellow chair with pillow in the search box and press enter")
    public void yellow_chair_with_pillow_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("Yellow Chair With Pillow"+Keys.ENTER);
    }

    @Then("tests whether the yellow chair with pillow product we are looking for is available")
    public void tests_whether_the_yellow_chair_with_pillow_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "Yellow Chair With Pillow";
        Assert.assertEquals(productSearchPage.yellowChairProductName.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }

    @Then("blue sun hat in the search box and press enter")
    public void blue_sun_hat_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("Blue Sun Hat"+Keys.ENTER);
    }

    @And("tests whether the blue sun hat product we are looking for is available")
    public void testsWhetherTheBlueSunHatProductWeAreLookingForIsAvailable() {

        String nameOfTheProductToSearchFor = "Blue Sun Hat";
        Assert.assertEquals(productSearchPage.blueSunHotProductName.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }

    @Then("axe long lasting bodysprayin the search box and press enter")
    public void axe_long_lasting_bodysprayin_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("Axe Long Lasting Bodyspray"+Keys.ENTER);
    }

    @Then("tests whether the axe long lasting bodysprayin product we are looking for is available")
    public void tests_whether_the_axe_long_lasting_bodysprayin_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "Axe Long Lasting Bodyspray";
        Assert.assertEquals(productSearchPage.axeLongLastingProductName.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }

    @Then("pink sport shoes for women in the search box and press enter")
    public void pink_sport_shoes_for_women_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("Pink Sport Shoes for women"+Keys.ENTER);
    }

    @Then("tests whether the pink sport shoes for women product we are looking for is available")
    public void tests_whether_the_pink_sport_shoes_for_women_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "Pink Sport Shoes For women";
        Assert.assertTrue(nameOfTheProductToSearchFor.contains(productSearchPage.pinkSportShoes.getText()));
        Driver.getDriver().navigate().back();
    }

    @Then("blue party wear dress in the search box and press enter")
    public void blue_party_wear_dress_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("Blue Party Wear Dress"+Keys.ENTER);
    }

    @Then("tests whether the blue party wear dress product we are looking for is available")
    public void tests_whether_the_blue_party_wear_dress_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "Blue Party Wear Dress";
        Assert.assertEquals(productSearchPage.bluePartyDressProductName.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }

    @Then("apple headphone white in the search box and press enter")
    public void apple_headphone_white_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("Apple Headphone White"+Keys.ENTER);
    }

    @Then("tests whether the apple headphone white product we are looking for is available")
    public void tests_whether_the_apple_headphone_white_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "Apple Headphone White";
        Assert.assertEquals(productSearchPage.appleHeadPhoneProductName.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }

    @Then("nike sneaker orange gray in the search box and press enter")
    public void nike_sneaker_orange_gray_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("Nike Sneaker Orange & Gray"+Keys.ENTER);
    }

    @Then("tests whether the nike sneaker orange gray product we are looking for is available")
    public void tests_whether_the_nike_sneaker_orange_gray_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "Nike Sneaker Orange & Gray";
        Assert.assertEquals(productSearchPage.nikeSneakerProductName.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }

    @Then("white partywear dress in the search box and press enter")
    public void white_partywear_dress_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("White Partywear Dress"+Keys.ENTER);
    }

    @Then("tests whether the white partywear dress product we are looking for is available")
    public void tests_whether_the_white_partywear_dress_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "White Partywear Dress";
        Assert.assertEquals(productSearchPage.nikeSneakerProductName.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }

    @When("men regular fit solid formal shirt in the search box and press enter")
    public void men_regular_fit_solid_formal_shirt_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("Men Regular Fit Solid Formal Shirt"+Keys.ENTER);
    }

    @When("tests whether the men regular fit solid formal shirt product we are looking for is available")
    public void tests_whether_the_men_regular_fit_solid_formal_shirt_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "Men Regular Fit Solid Formal Shirt";
        Assert.assertEquals(productSearchPage.menRegularFitProductName.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }

    @When("combo pack for baby girls in the search box and press enter")
    public void combo_pack_for_baby_girls_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("Combo Pack for Baby Girls"+Keys.ENTER);
    }

    @When("tests whether the combo pack for baby girls product we are looking for is available")
    public void tests_whether_the_combo_pack_for_baby_girls_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "Combo Pack for Baby Girls";
        Assert.assertTrue(productSearchPage.comoPacProductName.getText().contains(nameOfTheProductToSearchFor));
        Driver.getDriver().navigate().back();
    }

    @When("tShirt for men in the search box and press enter")
    public void t_shirt_for_men_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("T-Shirt for Men"+Keys.ENTER);
    }

    @When("tests whether the tShirt for men product we are looking for is available")
    public void tests_whether_the_t_shirt_for_men_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "T-Shirt For Men";
        Assert.assertEquals(productSearchPage.tshirtFormen.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }

    @When("black headphone in the search box and press enter")
    public void black_headphone_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("Black Headphone"+Keys.ENTER);
    }

    @When("tests whether the black headphone product we are looking for is available")
    public void tests_whether_the_black_headphone_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "Black Headphone";
        Assert.assertEquals(productSearchPage.blackHeadPhone.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }

    @When("infinite smart in the search box and press enter")
    public void infinite_smart_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("Infinite Smart 7 HD (Green Apple, 64 GB)  (2 GB..."+Keys.ENTER);
    }

    @When("tests whether the infinite smart product we are looking for is available")
    public void tests_whether_the_infinite_smart_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "Infinite Smart 7 HD (Green Apple, 64 GB)  (2 GB...";
        Assert.assertEquals(productSearchPage.infiniteSmartPhone.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }

    @When("puma training gym shoes in the search box and press enter")
    public void puma_training_gym_shoes_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("Puma  Training & Gym Shoes For"+Keys.ENTER);
    }

    @When("tests whether the puma training gym shoes product we are looking for is available")
    public void tests_whether_the_puma_training_gym_shoes_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "Puma  Training & Gym Shoes For";
        Assert.assertTrue(productSearchPage.pumaTrainingGymShoes.getText().contains(nameOfTheProductToSearchFor));
        Driver.getDriver().navigate().back();
    }

    @When("men slim fit checkered cut away collar casual in the search box and press enter")
    public void men_slim_fit_checkered_cut_away_collar_casual_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("Men Slim Fit Checkered Cut Away Collar Casual Sh..."+Keys.ENTER);
    }

    @When("tests whether the men slim fit checkered cut away collar casual product we are looking for is available")
    public void tests_whether_the_men_slim_fit_checkered_cut_away_collar_casual_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "Men Slim Fit Checkered Cut Away Collar Casual Sh...";
        Assert.assertEquals(productSearchPage.menSlimFit.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }

    @When("fancy blue shirt and pant in the search box and press enter")
    public void fancy_blue_shirt_and_pant_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("Fancy blue Shirt and pant"+Keys.ENTER);
    }

    @When("tests whether the fancy blue shirt and pant product we are looking for is available")
    public void tests_whether_the_fancy_blue_shirt_and_pant_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "Fancy blue Shirt and Pant";
        Assert.assertEquals(productSearchPage.fancyBlueShirt.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }

    @When("men purple plain fancy shirt in the search box and press enter")
    public void men_purple_plain_fancy_shirt_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("Men purple plain fancy shirt"+Keys.ENTER);
    }

    @When("tests whether the men purple plain fancy shirt product we are looking for is available")
    public void tests_whether_the_men_purple_plain_fancy_shirt_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "Men Purple Plain Fancy Shirt";
        Assert.assertEquals(productSearchPage.menPurplePlanShirt.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }

    @When("dell core gen in the search box and press enter")
    public void dell_core_gen_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("DELL Core i3 11th Gen - (8 GB/256 GB SSD/32 GB E..."+Keys.ENTER);
    }

    @When("tests whether the dell core gen product we are looking for is available")
    public void tests_whether_the_dell_core_gen_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "DELL Core i3 11th Gen - (8 GB/256 GB SSD/32 GB E...";
        Assert.assertEquals(productSearchPage.dellCoreGenComputer.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }

    @When("kppo reno8t in the search box and press enter")
    public void kppo_reno8t_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("KPPO Reno8T 5G (Sunrise Gold, 128 GB)  (8 GB RAM..."+Keys.ENTER);
    }

    @When("tests whether the kppo reno8t product we are looking for is available")
    public void tests_whether_the_kppo_reno8t_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "KPPO Reno8T 5G (Sunrise Gold, 128 GB)  (8 GB RAM...";
        Assert.assertEquals(productSearchPage.kppoReno8TPhone.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }

    @When("motor phone in the search box and press enter")
    public void motor_phone_in_the_search_box_and_press_enter() {

        productSearchPage.searchBox.clear();
        productSearchPage.searchBox.sendKeys("MOTOR e13 (Aurora Green, 64 GB)  (4 GB RAM)"+Keys.ENTER);
    }

    @When("tests whether the motor phone product we are looking for is available")
    public void tests_whether_the_motor_phone_product_we_are_looking_for_is_available() {

        String nameOfTheProductToSearchFor = "MOTOR e13 (Aurora Green, 64 GB)  (4 GB RAM)";
        Assert.assertEquals(productSearchPage.motorPhone.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }


    @And("tests whether blue sun hat product we are looking for is available")
    public void testsWhetherBlueSunHatProductWeAreLookingForIsAvailable() {

        String nameOfTheProductToSearchFor = "Blue Sun Hat";
        Assert.assertEquals(productSearchPage.blueSunHotProductName.getText(),nameOfTheProductToSearchFor);
        Driver.getDriver().navigate().back();
    }

}
