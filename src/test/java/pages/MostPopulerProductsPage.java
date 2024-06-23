package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.cert.X509Certificate;
import java.util.List;

public class MostPopulerProductsPage {


    public MostPopulerProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(xpath = "(//*[@class=' product prod-grid-col5 ']) [3] // *[@class='product-box my-2  py-1']")
    public List<WebElement> actualNumberOfProductsFound;

    @FindBy(xpath = "(//img[@class=\"img-fluid lazy\"])[4]")
    public WebElement dgiDronesAdvert;

    @FindBy(xpath = "(//a[@class=\"prod-title\"])[1]")
    public WebElement dellCoreProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement dellCoreActualProductName;

    @FindBy(xpath = "(//a[@class=\"prod-title\"])[2]")
    public WebElement kppoRenoProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement kppoRenoActualProductName;

    @FindBy(xpath = "(//a[@class=\"prod-title\"])[3]")
    public WebElement ınfiniteSmartProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement  ınfiniteSmartActualProductName;


    @FindBy(xpath = "(//a[@class=\"prod-title\"])[4]")
    public WebElement auroraGreenProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement  auroraGreenActualProductName;


    @FindBy(xpath = "(//a[@class=\"prod-title\"])[5]")
    public WebElement applelİphoneProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement  applelİphoneActualProductName;


    @FindBy(xpath = "(//a[@class=\"prod-title\"])[6]")
    public WebElement realPhoneProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement realPhoneActualProductName;


    @FindBy(xpath = "(//a[@class=\"prod-title\"])[7]")
    public WebElement dslrCameraProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement dslrCameraActualProductName;


    @FindBy(xpath = "(//a[@class=\"prod-title\"])[8]")
    public WebElement samsungWatchProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement samsungWatchActualProductName;


    @FindBy(xpath = "(//a[@class=\"prod-title\"])[9]")
    public WebElement appleWatchProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement appleWatchActualProductName;


    @FindBy(xpath = "(//a[@class=\"prod-title\"])[10]")
    public WebElement asusVivobookProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement asusVivobookActualProductName;


    @FindBy(xpath = "(//a[@class=\"prod-title\"])[11]")
    public WebElement lenoveCrabonProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement lenoveCarbonActualProductName;


    @FindBy(xpath = "(//a[@class=\"prod-title\"])[12]")
    public WebElement bAtRockerzProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement bAtRockerzActualProductName;


    @FindBy(xpath = "(//a[@class=\"prod-title\"])[13]")
    public WebElement mksrstoreDjiMiniProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement mksrstoreDjiMiniActualProductName;


    @FindBy(xpath = "(//a[@class=\"prod-title\"])[14]")
    public WebElement nikhlixRvrInterpriceProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement nikhlixRvrInterpriceActualProductName;

    @FindBy(xpath = "(//a[@class=\"prod-title\"])[15]")
    public WebElement tradworldHxDroneProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement tradworldHxDroneActualProductName;

}
