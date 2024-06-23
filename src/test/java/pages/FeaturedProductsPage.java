package pages;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FeaturedProductsPage {


    public FeaturedProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[41]")
    public WebElement  DwaneRunningShoesProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement DwaneRunningShoesProductActualName;


    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[42]")
    public WebElement  blueSunhatProduct;

    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement blueSunhatProductActualName;

    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[43]")
    public WebElement  appleHeadphoneProduct;

    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement appleHeadPhoneProductActualName;


    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[44]")
    public WebElement  comboPackBabyGirlsProduct;

    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement comboPackBabyGirlsProductActualName;


    @FindBy(xpath = "(//a[@class=\"prod-title mb-3 \"])[45]")
    public WebElement   blackHeadphoneProduct;

    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement  blackHeadphoneProductActualName;





































}
