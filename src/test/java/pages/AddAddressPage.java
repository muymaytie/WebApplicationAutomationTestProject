package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.cert.X509Certificate;

public class AddAddressPage {

    public AddAddressPage(){
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

    @FindBy(xpath = "(//span[@class=\"item\"])[4]")
    public WebElement manageAddressLink;

    @FindBy(xpath = "(//div[@class=\"fakebtn\"])[1]")
    public WebElement addAddressLink;

    @FindBy(xpath = "(//input[@class=\"form-control\"])[2]")
    public WebElement addressNameBox;


    @FindBy(xpath = "(//textarea[@class=\"form-control mt-3 mb-3\"])[1]")
    public WebElement enterYourAddressBox;

    @FindBy(xpath = "(//textarea[@class=\"form-control mt-3 mb-3\"])[2]")
    public WebElement enterYourAddressOptionalBox;

    @FindBy(xpath = "//select[@id=\"country_id\"]")
    public WebElement selectCountryDropdown;

    @FindBy(xpath = "//select[@id=\"add_address_state\"]")
    public WebElement selectStateDropdown;


    @FindBy(xpath = "//input[@placeholder=\"Enter city\"]")
    public WebElement enterCityBox;

    @FindBy(xpath = "//input[@placeholder=\"Enter postcode\"]")
    public WebElement enterPostcodeBox;

    @FindBy(xpath = "//button[@class=\"swal2-confirm swal2-styled\"]")
    public WebElement addAddressButton;









































}
