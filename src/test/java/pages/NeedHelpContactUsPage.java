package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.PublicKey;

public class NeedHelpContactUsPage {

    public NeedHelpContactUsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//*[@class=\"menu-icon-text\"])[1]")
    public WebElement accountLink;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement loginEmailBox;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement loginPasswordBox;

    @FindBy(xpath = "//*[@id=\"submitlogin\"]")
    public WebElement sgiInButton;

    @FindBy(xpath = "//b[text()=' Now']")
    public WebElement contactUsNowLink;

    @FindBy(xpath = "(//div[@class=\"text pl-3\"])[1]")
    public WebElement addressText;

    @FindBy(xpath = "(//div[@class=\"text pl-3\"])[2]")
    public WebElement phoneNumberText;

    @FindBy(xpath = "(//div[@class=\"text pl-3\"])[3]")
    public WebElement emailAddressText;

    @FindBy(xpath = "//input[@value=\"unityverse\"]")
    public WebElement fullNameBox;

    @FindBy(xpath = "//input[@value=\"unityverse@gmailcom\"]")
    public WebElement emailAddressBox;

    @FindBy(xpath = "(//input[@class=\"form-control\"])[3]")
    public WebElement subjectBox;

    @FindBy(xpath = "//textarea[@name=\"message\"]")
    public WebElement messageBox;

    @FindBy(xpath = "//button[@class=\"button-block btn-lg\"]")
    public WebElement sendMessageButton;

    @FindBy(xpath = "//*[@class=\"retro-notify-content\"]")
    public WebElement successfullyMessage;












































}
