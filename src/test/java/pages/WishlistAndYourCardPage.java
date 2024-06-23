package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.nio.file.Watchable;
import java.security.cert.X509Certificate;

public class WishlistAndYourCardPage {


    public WishlistAndYourCardPage(){
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


    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[9]")
    public WebElement appleHeadPhone;

    @FindBy(xpath = "//button[@class=\"btn-add-to-wishlist d-flex justify-content-center\"]")
    public WebElement wishlistButton;

    @FindBy(xpath = "(//span[@class=\"menu-icon-text\"])[2]")
    public WebElement wishlistMenu;

    @FindBy(xpath = "//span[@class=\"product-name\"]")
    public WebElement wishlistProductName;

    @FindBy(xpath = "//*[@class=\"button-purple btn-sm \"]")
    public WebElement buyNowButton;

    @FindBy(xpath = "//h4[@class=\"p-5 text-center text-black\"]")
    public WebElement wishlistEmptyText;


    @FindBy(xpath = "//button[@class=\"add-to-cart\"]")
    public WebElement addToCardButton;

    @FindBy(xpath = "(//span[@class=\"menu-icon-text\"])[3]")
    public WebElement yourCardMenu;

    @FindBy(xpath = "//a[@class=\"product-title text-center\"]")
    public WebElement ProductNameOnYourCardList;

    @FindBy(xpath = "//button[@aria-label=\"Remove this item\"]")
    public WebElement productRemovalLink;

    @FindBy(xpath = "//button[@class=\"swal2-confirm swal2-styled swal2-default-outline\"]")
    public WebElement yesRemoveItButton;

    @FindBy(xpath = "//h3[@class=\"notfoundtxt mt-5\"]")
    public WebElement shoppingCardİsEmptyText;






































}
