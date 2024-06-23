package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.cert.X509Certificate;
import java.util.List;

public class ShoppingTestPage {

    public ShoppingTestPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class=\"menu-icon-text\"])[1]")
    public WebElement accountLink;

    @FindBy(xpath = "//input[@placeholder=\"Your email address...\"]")
    public WebElement loginEmailBox;

    @FindBy(xpath = "//input[@placeholder=\"Your Password...\"]")
    public WebElement loginPasswordBox;

    @FindBy(xpath = "//button[@class=\"submitbtn btn-lg\"]")
    public WebElement signButton;

    @FindBy(xpath = "(//img[@class=\"logo\"])[1]")
    public WebElement webAppLogo;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[5]")
    public WebElement blueSunHat;

    @FindBy(xpath = "//button[@class=\"add-to-cart buy-now\"]")
    public WebElement buyNowButton;

    @FindBy(xpath = "(//span[@class=\"checkmark\"])[1]")
    public WebElement billingAddressMarkingBox;


    @FindBy(xpath = "(//span[@class=\"checkmark\"])[3]")
    public WebElement deliveryAddressMarkingBox;


    @FindBy(xpath = "(//span[@class=\"checkmark\"])[5]")
    public WebElement fastShippingMarkingBox;

    @FindBy(xpath = "//div[@class=\"w-75 text-center\"]")
    public List<WebElement> cardPaymentMethods;

    @FindBy(xpath = "//textarea[@class=\"form-control order-comment\"]")
    public WebElement  orderİnstructionBox;

    @FindBy(xpath = "//input[@name=\"accept_terms\"]")
    public WebElement returnAndRefundPolicyAndTermsAndConditionsAcceptanceBox;

    @FindBy(xpath = "//button[@class=\"button-block button-place mt-3\"]")
    public WebElement orderNowButton;

    @FindBy(xpath = "//h2[@class=\"notfoundtxt mt-3 mb-3 text-black\"]")
    public WebElement yourOrderİsSuccessfullyDoneText;

    @FindBy(xpath = "//a[@class=\"button-block button-place\"]")
    public WebElement checkoutButton;































}
