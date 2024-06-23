package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChangePasswordPage {

    public ChangePasswordPage(){
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

    @FindBy(xpath = "//span[text()='Change Password']")
    public WebElement changePasswordLink;

    @FindBy(xpath = "//input[@placeholder=\" Old Password\"]")
    public WebElement oldPasswordBox;

    @FindBy(xpath = "//input[@placeholder=\"New Password\"]")
    public WebElement newPasswordBox;

    @FindBy(xpath = "//input[@name=\"confirm_password\"]")
    public WebElement confirmPasswordBox;

    @FindBy(xpath = "//button[@class=\"submitbtn \"]")
    public WebElement updateButton;








































}
