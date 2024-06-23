package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductSearchPage {

    public ProductSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(xpath = "//input[@id=\"global-search\"]")
    public WebElement searchBox;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement prodcutTaxProductName;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement grauComfortProductName;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement yellowChairProductName;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement blueSunHotProductName;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement axeLongLastingProductName;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement bluePartyDressProductName;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement appleHeadPhoneProductName;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement nikeSneakerProductName;


    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement menRegularFitProductName;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement comoPacProductName;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement tshirtFormen;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement blackHeadPhone;
    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement infiniteSmartPhone;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement pumaTrainingGymShoes;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement menSlimFit;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement fancyBlueShirt;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement menPurplePlanShirt;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement dellCoreGenComputer;

   @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement kppoReno8TPhone;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement motorPhone;

    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public WebElement pinkSportShoes;






















}
