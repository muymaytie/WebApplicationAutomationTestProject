package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NewProductCategoryPage {

    public NewProductCategoryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[26]")
    public WebElement blueArmchairProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement blueArmchairActualProductName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[27]")
    public WebElement pumaTrainingShoesProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement pumaTrainingShoesActualProductName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[28]")
    public WebElement menSlimFitShirtProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement menSlimFitShirtActualProductName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[29]")
    public WebElement fancyBlueShirtProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement fancyBlueShirtActualProductName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[30]")
    public WebElement menPurpleShirtProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement menPurpleShirtActualProductName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[31]")
    public WebElement menFormalShirtProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement menFormalShirtActualProductName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[32]")
    public WebElement menSlimFitSolidShirtProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement menSlimfitSolidShirtActualProductName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[33]")
    public WebElement dellCoreComputerProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement dellCoreComputerActualProductName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[34]")
    public WebElement womenBlackFancyDressProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement womenBlackFancyDressActualProductName;


    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[35]")
    public WebElement mediumLaptopBackpackProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement mediumLaptopBackpackActualProductName;

    @FindBy(xpath = "(//button[@type=\"button\"])[6]")
    public WebElement  scrollButton;
































}
