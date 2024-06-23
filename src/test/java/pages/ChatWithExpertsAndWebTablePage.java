package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ChatWithExpertsAndWebTablePage {

    public ChatWithExpertsAndWebTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//font[@color=\"#767787\"]")
    public List<WebElement> addressİnformationList;


    @FindBy(xpath = "(//span[@class=\"text-capitalize footer-heading\"])[1]")
    public WebElement webTable;

    @FindBy(xpath = "//a[@class=\"button-block\"]")
    public WebElement chatWithExpertsButton;

    @FindBy(xpath = "(//span[@class=\"_advp _aeam\"])[15]")
    public WebElement whatsappConversationPageWithExpert;

    @FindBy(xpath = "//input[@placeholder=\"Email Address\"]")
    public WebElement subscribeEmailBox;

    @FindBy(xpath = "//input[@class=\"btn-subscribe\"]")
    public WebElement subscribeButton;

    @FindBy(xpath = "//div[@class=\"col-lg-3 logo-left\"]")
    public WebElement successfullySubscribe;


    @FindBy(xpath = "//ul[@class=\"ft-navigation-fr-link \"]//li")
    public List<WebElement> numberOfWebTables;


    @FindBy(xpath = "//div[@class=\"social-col\"]//li")
    public List<WebElement> numberOfSocialMedia;





















































}
