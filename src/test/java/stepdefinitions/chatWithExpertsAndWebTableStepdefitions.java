package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.hssf.record.PageBreakRecord;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ChatWithExpertsAndWebTablePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class chatWithExpertsAndWebTableStepdefitions {

    String firstPageWHD;
    ChatWithExpertsAndWebTablePage chatWithExpertsAndWebTablePage = new ChatWithExpertsAndWebTablePage();


    @Given("user goes to web home page")
    public void user_goes_to_web_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
    }
    @When("scrolls the page down")
    public void scrolls_the_page_down() {

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(chatWithExpertsAndWebTablePage.webTable).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

         firstPageWHD = Driver.getDriver().getWindowHandle();


    }

    @When("presses the chat button with experts")
    public void presses_the_chat_button_with_experts() {

        chatWithExpertsAndWebTablePage.chatWithExpertsButton.click();
    }

    @Then("tests whether you go to the chat page with experts")
    public void tests_whether_you_go_to_the_chat_page_with_experts() {

        Set<String> allWHDSet = Driver.driver.getWindowHandles();
        String windowIWantToPassUrl = "https://api.whatsapp.com/send?phone=+9198256&text=Hello";

        for (String eachWHD : allWHDSet
        ){
            Driver.getDriver().switchTo().window(eachWHD);
            String passedWindowUrl = Driver.getDriver().getCurrentUrl();

            if (passedWindowUrl.contains(windowIWantToPassUrl)){
                break;
            }
        }

        String expectedUrl = "https://api.whatsapp.com/send?phone=+9198256&text=Hello";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedUrl));

    }

    @Then("it tests that there are {int} pieces of information in the web table.")
    public void it_tests_that_there_are_pieces_of_information_in_the_web_table(int expectedNumberOfGivenWebTables) {

        Driver.getDriver().switchTo().window(firstPageWHD);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();


       Assert.assertEquals(chatWithExpertsAndWebTablePage.numberOfWebTables.size(),expectedNumberOfGivenWebTables);
    }

    @Then("tests whether you have successfully subscribed by typing an e-mail in the subscribe box")
    public void tests_whether_you_have_successfully_subscribed_by_typing_an_e_mail_in_the_subscribe_box() {

        chatWithExpertsAndWebTablePage.subscribeEmailBox.sendKeys("joeblack@gmail.com");
        chatWithExpertsAndWebTablePage.subscribeButton.click();

        Assert.assertTrue(chatWithExpertsAndWebTablePage.successfullySubscribe.isDisplayed());

    }

    @Then("it tests whether there are {int} social media channels in the social media section")
    public void it_tests_whether_there_are_social_media_channels_in_the_social_media_section(int expectedNumberOfSocialMedia) {

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(chatWithExpertsAndWebTablePage.webTable).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.bekle(10);
        Assert.assertEquals(chatWithExpertsAndWebTablePage.numberOfSocialMedia.size(),expectedNumberOfSocialMedia);
    }

    @Then("closes the page")
    public void closes_the_page() {

        Driver.quitDriver();
    }
















































}
