package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.swing.plaf.PanelUI;
import java.util.List;

public class TopSellingCategoryProductsPage {

    public TopSellingCategoryProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "(//*[@class=' product prod-grid-col5 ']) [1] // *[@class='product-box my-2  py-1']")
    public List<WebElement> topsellingProducsList;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[1]")
    public WebElement blueChairProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement blueChairProductActualName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[2]")
    public WebElement  roundedPillowProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement  roundedPillowProductActualName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[3]")
    public WebElement grayComfortChairProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement grayComfortChairProductActualName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[4]")
    public WebElement  yellowChairPillowProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement yellowChairPillowProductActualName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[5]")
    public WebElement blueSunHatProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement blueSunHatProductActualName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[6]")
    public WebElement  axeLongBodysprayProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement  axeLongBodysprayProductActualName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[7]")
    public WebElement  pinkSportShoesProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement  pinkSportShoesProductActualName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[8]")
    public WebElement bluePartyDressProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement bluePartyDressProductActualName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[9]")
    public WebElement  appleHeadphoneWhiteProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement  appleHeadphoneWhiteProductActualName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[10]")
    public WebElement  nikeSneakerOrangeGrayProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement  nikeSneakerOrangeGrayProductActualName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[11]")
    public WebElement  whitePartywearDressProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement  whitePartywearDressProductActualName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[12]")
    public WebElement  menRegularFitShirtProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement  menRegularFitShirtProductActualName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[13]")
    public WebElement comboPackBabyGirlsProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement comboPackBabyGirlsProductActualName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[14]")
    public WebElement  tShirtMenProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement  tShirtMenProductActualName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[15]")
    public WebElement blackHeadphoneProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement  blackHeadphoneActualName;














}
