package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.cert.X509Certificate;

public class UpdateProfilePage {


    public UpdateProfilePage(){
        PageFactory.initElements(Driver.driver,this);
    }



    @FindBy(xpath = "(//*[@class=\"menu-icon-text\"])[1]")
    public WebElement accountLink;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement loginEmailBox;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement loginPasswordBox;

    @FindBy(xpath = "//*[@id=\"submitlogin\"]")
    public WebElement sgiInButton;

    @FindBy(xpath = "//*[@name=\"firstName\"]")
    public WebElement updateNameBox;

    @FindBy(xpath = "//*[@name=\"lastName\"]")
    public WebElement updateSurnameBox;

    @FindBy(xpath = "//*[@placeholder=\"Your email address......\"]")
    public WebElement updateEmailBox;

    @FindBy(xpath = "//*[@placeholder=\"Your Mobile Number...\"]")
    public WebElement updatePhoneNumberBox;

    @FindBy(xpath = "//*[@name=\"profile\"]")
    public WebElement profilePhotoFile;

    @FindBy(xpath = "//*[@class=\"submitbtn \"]")
    public WebElement updateButton;





























}
