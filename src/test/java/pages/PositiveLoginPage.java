package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.cert.X509Certificate;

public class PositiveLoginPage {


    public PositiveLoginPage(){
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

    @FindBy(xpath = "(//*[@class=\"item\"])[6]")
    public WebElement logoutButton;





































}
