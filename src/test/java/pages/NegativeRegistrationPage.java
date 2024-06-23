package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NegativeRegistrationPage {

    public NegativeRegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "(//*[@class=\"menu-icon-text\"])[1]")
    public WebElement accountLink;

    @FindBy(xpath = "//*[@class=\"sign-up \"]")
    public WebElement signUpLink;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@id=\"lastName\"]")
    public WebElement surnameBox;

    @FindBy(xpath = "//input[@id=\"signupemail\"]")
    public WebElement registrationEmailBox;

    @FindBy(xpath = "//input[@id=\"signuppassword\"]")
    public WebElement registrationPasswordBox;

    @FindBy(xpath = "//*[@id=\"comfirmPassword\"]")
    public WebElement confirmPasswordBox;

    @FindBy(xpath = "//button[@id=\"btn-submit-form\"]")
    public WebElement signUpButton;







































}
